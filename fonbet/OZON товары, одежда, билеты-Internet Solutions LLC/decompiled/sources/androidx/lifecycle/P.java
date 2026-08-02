package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractC5434v;
import java.util.Iterator;
import java.util.Map;
import n.C8358c;
import o.C8620b;

/* loaded from: classes.dex */
public abstract class P<T> {
    static final Object NOT_SET = new Object();
    int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private C8620b<W<? super T>, P<T>.d> mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    final class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (P.this.mDataLock) {
                obj = P.this.mPendingData;
                P.this.mPendingData = P.NOT_SET;
            }
            P.this.setValue(obj);
        }
    }

    private class b extends P<T>.d {
        @Override // androidx.lifecycle.P.d
        final boolean d() {
            return true;
        }
    }

    class c extends P<T>.d implements G {

        /* renamed from: e, reason: collision with root package name */
        @NonNull
        final J f43224e;

        c(@NonNull J j11, W<? super T> w11) {
            super(w11);
            this.f43224e = j11;
        }

        @Override // androidx.lifecycle.P.d
        final void b() {
            this.f43224e.getLifecycle().e(this);
        }

        @Override // androidx.lifecycle.P.d
        final boolean c(J j11) {
            return this.f43224e == j11;
        }

        @Override // androidx.lifecycle.P.d
        final boolean d() {
            return this.f43224e.getLifecycle().b().a(AbstractC5434v.b.STARTED);
        }

        @Override // androidx.lifecycle.G
        public final void onStateChanged(@NonNull J j11, @NonNull AbstractC5434v.a aVar) {
            J j12 = this.f43224e;
            AbstractC5434v.b b11 = j12.getLifecycle().b();
            if (b11 == AbstractC5434v.b.DESTROYED) {
                P.this.removeObserver(this.f43226a);
                return;
            }
            AbstractC5434v.b bVar = null;
            while (bVar != b11) {
                a(d());
                bVar = b11;
                b11 = j12.getLifecycle().b();
            }
        }
    }

    private abstract class d {

        /* renamed from: a, reason: collision with root package name */
        final W<? super T> f43226a;

        /* renamed from: b, reason: collision with root package name */
        boolean f43227b;

        /* renamed from: c, reason: collision with root package name */
        int f43228c = -1;

        d(W<? super T> w11) {
            this.f43226a = w11;
        }

        final void a(boolean z11) {
            if (z11 == this.f43227b) {
                return;
            }
            this.f43227b = z11;
            int i11 = z11 ? 1 : -1;
            P p11 = P.this;
            p11.changeActiveCounter(i11);
            if (this.f43227b) {
                p11.dispatchingValue(this);
            }
        }

        void b() {
        }

        boolean c(J j11) {
            return false;
        }

        abstract boolean d();
    }

    public P(T t2) {
        this.mDataLock = new Object();
        this.mObservers = new C8620b<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new a();
        this.mData = t2;
        this.mVersion = 0;
    }

    static void assertMainThread(String str) {
        if (!C8358c.e().g()) {
            throw new IllegalStateException(B0.A0.b("Cannot invoke ", str, " on a background thread"));
        }
    }

    private void considerNotify(P<T>.d dVar) {
        if (dVar.f43227b) {
            if (!dVar.d()) {
                dVar.a(false);
                return;
            }
            int i11 = dVar.f43228c;
            int i12 = this.mVersion;
            if (i11 >= i12) {
                return;
            }
            dVar.f43228c = i12;
            dVar.f43226a.onChanged((Object) this.mData);
        }
    }

    void changeActiveCounter(int i11) {
        int i12 = this.mActiveCount;
        this.mActiveCount = i11 + i12;
        if (this.mChangingActiveState) {
            return;
        }
        this.mChangingActiveState = true;
        while (true) {
            try {
                int i13 = this.mActiveCount;
                if (i12 == i13) {
                    this.mChangingActiveState = false;
                    return;
                }
                boolean z11 = i12 == 0 && i13 > 0;
                boolean z12 = i12 > 0 && i13 == 0;
                if (z11) {
                    onActive();
                } else if (z12) {
                    onInactive();
                }
                i12 = i13;
            } catch (Throwable th2) {
                this.mChangingActiveState = false;
                throw th2;
            }
        }
    }

    void dispatchingValue(P<T>.d dVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (dVar != null) {
                considerNotify(dVar);
                dVar = null;
            } else {
                C8620b<W<? super T>, P<T>.d>.d c11 = this.mObservers.c();
                while (c11.hasNext()) {
                    considerNotify((d) ((Map.Entry) c11.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t2 = (T) this.mData;
        if (t2 != NOT_SET) {
            return t2;
        }
        return null;
    }

    int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean isInitialized() {
        return this.mData != NOT_SET;
    }

    public void observe(@NonNull J j11, @NonNull W<? super T> w11) {
        assertMainThread("observe");
        if (j11.getLifecycle().b() == AbstractC5434v.b.DESTROYED) {
            return;
        }
        c cVar = new c(j11, w11);
        P<T>.d g10 = this.mObservers.g(w11, cVar);
        if (g10 != null && !g10.c(j11)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (g10 != null) {
            return;
        }
        j11.getLifecycle().a(cVar);
    }

    public void observeForever(@NonNull W<? super T> w11) {
        assertMainThread("observeForever");
        b bVar = new b(w11);
        P<T>.d g10 = this.mObservers.g(w11, bVar);
        if (g10 instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (g10 != null) {
            return;
        }
        bVar.a(true);
    }

    protected void onActive() {
    }

    protected void onInactive() {
    }

    protected void postValue(T t2) {
        boolean z11;
        synchronized (this.mDataLock) {
            z11 = this.mPendingData == NOT_SET;
            this.mPendingData = t2;
        }
        if (z11) {
            C8358c.e().h(this.mPostValueRunnable);
        }
    }

    public void removeObserver(@NonNull W<? super T> w11) {
        assertMainThread("removeObserver");
        P<T>.d h11 = this.mObservers.h(w11);
        if (h11 == null) {
            return;
        }
        h11.b();
        h11.a(false);
    }

    public void removeObservers(@NonNull J j11) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<W<? super T>, P<T>.d>> it = this.mObservers.iterator();
        while (it.hasNext()) {
            Map.Entry<W<? super T>, P<T>.d> next = it.next();
            if (next.getValue().c(j11)) {
                removeObserver(next.getKey());
            }
        }
    }

    protected void setValue(T t2) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t2;
        dispatchingValue(null);
    }

    public P() {
        this.mDataLock = new Object();
        this.mObservers = new C8620b<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new a();
        this.mData = obj;
        this.mVersion = -1;
    }
}
