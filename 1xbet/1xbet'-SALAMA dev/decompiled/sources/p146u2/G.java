package p146u2;

import Q1.e;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzbbd;
import io.sentry.logger.LoggerBatchProcessor;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import p151v2.a;

/* JADX INFO: loaded from: classes.dex */
public final class G extends Handler implements Runnable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final /* synthetic */ K f16718A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H f16720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f16721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public F f16722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IOException f16723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16724f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Thread f16725x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f16726y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile boolean f16727z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(K k7, Looper looper, H h6, F f7, int i7, long j) {
        super(looper);
        this.f16718A = k7;
        this.f16720b = h6;
        this.f16722d = f7;
        this.f16719a = i7;
        this.f16721c = j;
    }

    public final void a(boolean z4) {
        this.f16727z = z4;
        this.f16723e = null;
        if (hasMessages(0)) {
            this.f16726y = true;
            removeMessages(0);
            if (!z4) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                try {
                    this.f16726y = true;
                    this.f16720b.l();
                    Thread thread = this.f16725x;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z4) {
            this.f16718A.f16732b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            F f7 = this.f16722d;
            f7.getClass();
            f7.l(this.f16720b, jElapsedRealtime, jElapsedRealtime - this.f16721c, true);
            this.f16722d = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f16727z) {
            return;
        }
        int i7 = message.what;
        if (i7 == 0) {
            this.f16723e = null;
            K k7 = this.f16718A;
            ExecutorService executorService = k7.f16731a;
            G g3 = k7.f16732b;
            g3.getClass();
            executorService.execute(g3);
            return;
        }
        if (i7 == 3) {
            throw ((Error) message.obj);
        }
        this.f16718A.f16732b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.f16721c;
        F f7 = this.f16722d;
        f7.getClass();
        if (this.f16726y) {
            f7.l(this.f16720b, jElapsedRealtime, j, false);
            return;
        }
        int i8 = message.what;
        if (i8 == 1) {
            try {
                f7.g(this.f16720b, jElapsedRealtime, j);
                return;
            } catch (RuntimeException e7) {
                a.l("LoadTask", "Unexpected exception handling load completed", e7);
                this.f16718A.f16733c = new J(e7);
                return;
            }
        }
        if (i8 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f16723e = iOException;
        int i9 = this.f16724f + 1;
        this.f16724f = i9;
        e eVarI = f7.i(this.f16720b, iOException, i9);
        int i10 = eVarI.f5785a;
        if (i10 == 3) {
            this.f16718A.f16733c = this.f16723e;
            return;
        }
        if (i10 != 2) {
            if (i10 == 1) {
                this.f16724f = 1;
            }
            long jMin = eVarI.f5786b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f16724f - 1) * zzbbd.zzq.zzf, LoggerBatchProcessor.FLUSH_AFTER_MS);
            }
            K k8 = this.f16718A;
            a.h(k8.f16732b == null);
            k8.f16732b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(0, jMin);
            } else {
                this.f16723e = null;
                k8.f16731a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        try {
            synchronized (this) {
                z4 = this.f16726y;
                this.f16725x = Thread.currentThread();
            }
            if (!z4) {
                a.c("load:".concat(this.f16720b.getClass().getSimpleName()));
                try {
                    this.f16720b.load();
                    a.m();
                } catch (Throwable th) {
                    a.m();
                    throw th;
                }
            }
            synchronized (this) {
                this.f16725x = null;
                Thread.interrupted();
            }
            if (this.f16727z) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e7) {
            if (this.f16727z) {
                return;
            }
            obtainMessage(2, e7).sendToTarget();
        } catch (Exception e8) {
            if (this.f16727z) {
                return;
            }
            a.l("LoadTask", "Unexpected exception loading stream", e8);
            obtainMessage(2, new J(e8)).sendToTarget();
        } catch (OutOfMemoryError e9) {
            if (this.f16727z) {
                return;
            }
            a.l("LoadTask", "OutOfMemory error loading stream", e9);
            obtainMessage(2, new J(e9)).sendToTarget();
        } catch (Error e10) {
            if (!this.f16727z) {
                a.l("LoadTask", "Unexpected error loading stream", e10);
                obtainMessage(3, e10).sendToTarget();
            }
            throw e10;
        }
    }
}
