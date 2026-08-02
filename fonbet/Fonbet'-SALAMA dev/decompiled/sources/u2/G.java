package u2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzbbd;
import io.sentry.logger.LoggerBatchProcessor;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class G extends Handler implements Runnable {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ K f16712A;

    /* renamed from: a, reason: collision with root package name */
    public final int f16713a;

    /* renamed from: b, reason: collision with root package name */
    public final H f16714b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16715c;

    /* renamed from: d, reason: collision with root package name */
    public F f16716d;

    /* renamed from: e, reason: collision with root package name */
    public IOException f16717e;

    /* renamed from: f, reason: collision with root package name */
    public int f16718f;

    /* renamed from: x, reason: collision with root package name */
    public Thread f16719x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f16720y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f16721z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(K k7, Looper looper, H h6, F f7, int i7, long j) {
        super(looper);
        this.f16712A = k7;
        this.f16714b = h6;
        this.f16716d = f7;
        this.f16713a = i7;
        this.f16715c = j;
    }

    public final void a(boolean z4) {
        this.f16721z = z4;
        this.f16717e = null;
        if (hasMessages(0)) {
            this.f16720y = true;
            removeMessages(0);
            if (!z4) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.f16720y = true;
                    this.f16714b.l();
                    Thread thread = this.f16719x;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z4) {
            this.f16712A.f16726b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            F f7 = this.f16716d;
            f7.getClass();
            f7.l(this.f16714b, elapsedRealtime, elapsedRealtime - this.f16715c, true);
            this.f16716d = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f16721z) {
            return;
        }
        int i7 = message.what;
        if (i7 == 0) {
            this.f16717e = null;
            K k7 = this.f16712A;
            ExecutorService executorService = k7.f16725a;
            G g3 = k7.f16726b;
            g3.getClass();
            executorService.execute(g3);
            return;
        }
        if (i7 == 3) {
            throw ((Error) message.obj);
        }
        this.f16712A.f16726b = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.f16715c;
        F f7 = this.f16716d;
        f7.getClass();
        if (this.f16720y) {
            f7.l(this.f16714b, elapsedRealtime, j, false);
            return;
        }
        int i8 = message.what;
        if (i8 == 1) {
            try {
                f7.g(this.f16714b, elapsedRealtime, j);
                return;
            } catch (RuntimeException e7) {
                AbstractC1664a.l("LoadTask", "Unexpected exception handling load completed", e7);
                this.f16712A.f16727c = new J(e7);
                return;
            }
        }
        if (i8 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f16717e = iOException;
        int i9 = this.f16718f + 1;
        this.f16718f = i9;
        Q1.e i10 = f7.i(this.f16714b, iOException, i9);
        int i11 = i10.f5785a;
        if (i11 == 3) {
            this.f16712A.f16727c = this.f16717e;
            return;
        }
        if (i11 != 2) {
            if (i11 == 1) {
                this.f16718f = 1;
            }
            long j3 = i10.f5786b;
            if (j3 == -9223372036854775807L) {
                j3 = Math.min((this.f16718f - 1) * zzbbd.zzq.zzf, LoggerBatchProcessor.FLUSH_AFTER_MS);
            }
            K k8 = this.f16712A;
            AbstractC1664a.h(k8.f16726b == null);
            k8.f16726b = this;
            if (j3 > 0) {
                sendEmptyMessageDelayed(0, j3);
            } else {
                this.f16717e = null;
                k8.f16725a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        try {
            synchronized (this) {
                z4 = this.f16720y;
                this.f16719x = Thread.currentThread();
            }
            if (!z4) {
                AbstractC1664a.c("load:".concat(this.f16714b.getClass().getSimpleName()));
                try {
                    this.f16714b.load();
                    AbstractC1664a.m();
                } catch (Throwable th) {
                    AbstractC1664a.m();
                    throw th;
                }
            }
            synchronized (this) {
                this.f16719x = null;
                Thread.interrupted();
            }
            if (this.f16721z) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e7) {
            if (this.f16721z) {
                return;
            }
            obtainMessage(2, e7).sendToTarget();
        } catch (Exception e8) {
            if (this.f16721z) {
                return;
            }
            AbstractC1664a.l("LoadTask", "Unexpected exception loading stream", e8);
            obtainMessage(2, new J(e8)).sendToTarget();
        } catch (OutOfMemoryError e9) {
            if (this.f16721z) {
                return;
            }
            AbstractC1664a.l("LoadTask", "OutOfMemory error loading stream", e9);
            obtainMessage(2, new J(e9)).sendToTarget();
        } catch (Error e10) {
            if (!this.f16721z) {
                AbstractC1664a.l("LoadTask", "Unexpected error loading stream", e10);
                obtainMessage(3, e10).sendToTarget();
            }
            throw e10;
        }
    }
}
