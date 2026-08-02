package androidx.media3.session;

import android.os.Handler;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class SequencedFutureManager {
    private static final String TAG = "SequencedFutureManager";

    @GuardedBy("lock")
    private boolean isReleased;

    @GuardedBy("lock")
    private int nextSequenceNumber;

    @Nullable
    @GuardedBy("lock")
    private Runnable pendingLazyReleaseCallback;

    @Nullable
    @GuardedBy("lock")
    private Handler releaseCallbackHandler;
    private final Object lock = new Object();

    @GuardedBy("lock")
    private final ArrayMap<Integer, SequencedFuture<?>> seqToFutureMap = new ArrayMap<>();

    public static final class SequencedFuture<T> extends com.google.common.util.concurrent.a<T> {
        private final T resultWhenClosed;
        private final int sequenceNumber;

        private SequencedFuture(int i, T t) {
            this.sequenceNumber = i;
            this.resultWhenClosed = t;
        }

        public static <T> SequencedFuture<T> create(int i, T t) {
            return new SequencedFuture<>(i, t);
        }

        public T getResultWhenClosed() {
            return this.resultWhenClosed;
        }

        public int getSequenceNumber() {
            return this.sequenceNumber;
        }

        @Override // com.google.common.util.concurrent.a
        public boolean set(T t) {
            return super.set(t);
        }

        public void setWithTheValueOfResultWhenClosed() {
            set(this.resultWhenClosed);
        }
    }

    public <T> SequencedFuture<T> createSequencedFuture(T t) {
        SequencedFuture<T> create;
        synchronized (this.lock) {
            try {
                int obtainNextSequenceNumber = obtainNextSequenceNumber();
                create = SequencedFuture.create(obtainNextSequenceNumber, t);
                if (this.isReleased) {
                    create.setWithTheValueOfResultWhenClosed();
                } else {
                    this.seqToFutureMap.put(Integer.valueOf(obtainNextSequenceNumber), create);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return create;
    }

    public void lazyRelease(long j, Runnable runnable) {
        synchronized (this.lock) {
            try {
                Handler createHandlerForCurrentLooper = Util.createHandlerForCurrentLooper();
                this.releaseCallbackHandler = createHandlerForCurrentLooper;
                this.pendingLazyReleaseCallback = runnable;
                if (this.seqToFutureMap.isEmpty()) {
                    release();
                } else {
                    createHandlerForCurrentLooper.postDelayed(new E5(this, 0), j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int obtainNextSequenceNumber() {
        int i;
        synchronized (this.lock) {
            i = this.nextSequenceNumber;
            this.nextSequenceNumber = i + 1;
        }
        return i;
    }

    public void release() {
        ArrayList arrayList;
        synchronized (this.lock) {
            try {
                this.isReleased = true;
                arrayList = new ArrayList(this.seqToFutureMap.values());
                this.seqToFutureMap.clear();
                if (this.pendingLazyReleaseCallback != null) {
                    ((Handler) Assertions.checkNotNull(this.releaseCallbackHandler)).post(this.pendingLazyReleaseCallback);
                    this.pendingLazyReleaseCallback = null;
                    this.releaseCallbackHandler = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((SequencedFuture) it.next()).setWithTheValueOfResultWhenClosed();
        }
    }

    public <T> void setFutureResult(int i, T t) {
        synchronized (this.lock) {
            try {
                SequencedFuture<?> remove = this.seqToFutureMap.remove(Integer.valueOf(i));
                if (remove != null) {
                    if (remove.getResultWhenClosed().getClass() == t.getClass()) {
                        remove.set(t);
                    } else {
                        Log.w(TAG, "Type mismatch, expected " + remove.getResultWhenClosed().getClass() + ", but was " + t.getClass());
                    }
                }
                if (this.pendingLazyReleaseCallback != null && this.seqToFutureMap.isEmpty()) {
                    release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
