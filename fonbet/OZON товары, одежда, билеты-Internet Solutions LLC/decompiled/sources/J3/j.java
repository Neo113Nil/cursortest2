package J3;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.Executors;
import m3.L;
import m3.N;
import m3.s;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final b f13798d = new b(0, -9223372036854775807L);

    /* renamed from: e, reason: collision with root package name */
    public static final b f13799e = new b(2, -9223372036854775807L);

    /* renamed from: f, reason: collision with root package name */
    public static final b f13800f = new b(3, -9223372036854775807L);

    /* renamed from: a, reason: collision with root package name */
    private final K3.b f13801a;

    /* renamed from: b, reason: collision with root package name */
    private c<? extends d> f13802b;

    /* renamed from: c, reason: collision with root package name */
    private IOException f13803c;

    public interface a<T extends d> {
        void onLoadCanceled(T t2, long j11, long j12, boolean z11);

        void onLoadCompleted(T t2, long j11, long j12);

        b onLoadError(T t2, long j11, long j12, IOException iOException, int i11);

        default void onLoadStarted(T t2, long j11, long j12, int i11) {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f13804a;

        /* renamed from: b, reason: collision with root package name */
        private final long f13805b;

        b(int i11, long j11) {
            this.f13804a = i11;
            this.f13805b = j11;
        }

        public final boolean c() {
            int i11 = this.f13804a;
            return i11 == 0 || i11 == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    private final class c<T extends d> extends Handler implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final int f13806a;

        /* renamed from: b, reason: collision with root package name */
        private final T f13807b;

        /* renamed from: c, reason: collision with root package name */
        private final long f13808c;

        /* renamed from: d, reason: collision with root package name */
        private a<T> f13809d;

        /* renamed from: e, reason: collision with root package name */
        private IOException f13810e;

        /* renamed from: f, reason: collision with root package name */
        private int f13811f;

        /* renamed from: g, reason: collision with root package name */
        private Thread f13812g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f13813h;

        /* renamed from: i, reason: collision with root package name */
        private volatile boolean f13814i;

        public c(Looper looper, T t2, a<T> aVar, int i11, long j11) {
            super(looper);
            this.f13807b = t2;
            this.f13809d = aVar;
            this.f13806a = i11;
            this.f13808c = j11;
        }

        private void b() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = elapsedRealtime - this.f13808c;
            a<T> aVar = this.f13809d;
            aVar.getClass();
            aVar.onLoadStarted(this.f13807b, elapsedRealtime, j11, this.f13811f);
            this.f13810e = null;
            j jVar = j.this;
            K3.b bVar = jVar.f13801a;
            c cVar = jVar.f13802b;
            cVar.getClass();
            bVar.execute(cVar);
        }

        public final void a(boolean z11) {
            this.f13814i = z11;
            this.f13810e = null;
            if (hasMessages(1)) {
                this.f13813h = true;
                removeMessages(1);
                if (!z11) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    try {
                        this.f13813h = true;
                        this.f13807b.cancelLoad();
                        Thread thread = this.f13812g;
                        if (thread != null) {
                            thread.interrupt();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            if (z11) {
                j.this.f13802b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                a<T> aVar = this.f13809d;
                aVar.getClass();
                aVar.onLoadCanceled(this.f13807b, elapsedRealtime, elapsedRealtime - this.f13808c, true);
                this.f13809d = null;
            }
        }

        public final void c(int i11) throws IOException {
            IOException iOException = this.f13810e;
            if (iOException != null && this.f13811f > i11) {
                throw iOException;
            }
        }

        public final void d(long j11) {
            j jVar = j.this;
            G10.a.h(jVar.f13802b == null);
            jVar.f13802b = this;
            if (j11 > 0) {
                sendEmptyMessageDelayed(1, j11);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (this.f13814i) {
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                b();
                return;
            }
            if (i11 == 4) {
                throw ((Error) message.obj);
            }
            j.this.f13802b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = elapsedRealtime - this.f13808c;
            a<T> aVar = this.f13809d;
            aVar.getClass();
            if (this.f13813h) {
                aVar.onLoadCanceled(this.f13807b, elapsedRealtime, j11, false);
                return;
            }
            int i12 = message.what;
            if (i12 == 2) {
                try {
                    aVar.onLoadCompleted(this.f13807b, elapsedRealtime, j11);
                    return;
                } catch (RuntimeException e11) {
                    s.d("LoadTask", "Unexpected exception handling load completed", e11);
                    j.this.f13803c = new g(e11);
                    return;
                }
            }
            if (i12 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f13810e = iOException;
            int i13 = this.f13811f + 1;
            this.f13811f = i13;
            b onLoadError = aVar.onLoadError(this.f13807b, elapsedRealtime, j11, iOException, i13);
            if (onLoadError.f13804a == 3) {
                j.this.f13803c = this.f13810e;
            } else if (onLoadError.f13804a != 2) {
                if (onLoadError.f13804a == 1) {
                    this.f13811f = 1;
                }
                d(onLoadError.f13805b != -9223372036854775807L ? onLoadError.f13805b : Math.min((this.f13811f - 1) * 1000, 5000));
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z11;
            try {
                synchronized (this) {
                    z11 = this.f13813h;
                    this.f13812g = Thread.currentThread();
                }
                if (!z11) {
                    this.f13807b.getClass();
                    this.f13807b.load();
                }
                synchronized (this) {
                    this.f13812g = null;
                    Thread.interrupted();
                }
                if (this.f13814i) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e11) {
                if (this.f13814i) {
                    return;
                }
                obtainMessage(3, e11).sendToTarget();
            } catch (OutOfMemoryError e12) {
                if (this.f13814i) {
                    return;
                }
                s.d("LoadTask", "OutOfMemory error loading stream", e12);
                obtainMessage(3, new g(e12)).sendToTarget();
            } catch (Error e13) {
                if (!this.f13814i) {
                    s.d("LoadTask", "Unexpected error loading stream", e13);
                    obtainMessage(4, e13).sendToTarget();
                }
                throw e13;
            } catch (Exception e14) {
                if (this.f13814i) {
                    return;
                }
                s.d("LoadTask", "Unexpected exception loading stream", e14);
                obtainMessage(3, new g(e14)).sendToTarget();
            }
        }
    }

    public interface d {
        void cancelLoad();

        void load() throws IOException;
    }

    public interface e {
        void onLoaderReleased();
    }

    private static final class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final Object f13816a;

        public f(e eVar) {
            this.f13816a = eVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [J3.j$e, java.lang.Object] */
        @Override // java.lang.Runnable
        public final void run() {
            this.f13816a.onLoaderReleased();
        }
    }

    /* loaded from: classes8.dex */
    public static final class g extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public g(Throwable th2) {
            super(r0.toString(), th2);
            String str;
            StringBuilder sb2 = new StringBuilder("Unexpected ");
            sb2.append(th2.getClass().getSimpleName());
            if (th2.getMessage() != null) {
                str = ": " + th2.getMessage();
            } else {
                str = "";
            }
            sb2.append(str);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(String str) {
        this(K3.b.u0(Executors.newSingleThreadExecutor(new L(r2)), new Ej.b()));
        String concat = "ExoPlayer:Loader:".concat(str);
        int i11 = N.f74289a;
    }

    public static b g(long j11, boolean z11) {
        return new b(z11 ? 1 : 0, j11);
    }

    public final void e() {
        c<? extends d> cVar = this.f13802b;
        G10.a.i(cVar);
        cVar.a(false);
    }

    public final void f() {
        this.f13803c = null;
    }

    public final boolean h() {
        return this.f13803c != null;
    }

    public final boolean i() {
        return this.f13802b != null;
    }

    public final void j(int i11) throws IOException {
        IOException iOException = this.f13803c;
        if (iOException != null) {
            throw iOException;
        }
        c<? extends d> cVar = this.f13802b;
        if (cVar != null) {
            if (i11 == Integer.MIN_VALUE) {
                i11 = cVar.f13806a;
            }
            cVar.c(i11);
        }
    }

    public final void k(e eVar) {
        c<? extends d> cVar = this.f13802b;
        if (cVar != null) {
            cVar.a(true);
        }
        K3.b bVar = this.f13801a;
        if (eVar != null) {
            bVar.execute(new f(eVar));
        }
        bVar.release();
    }

    public final void l(d dVar, a aVar, int i11) {
        Looper myLooper = Looper.myLooper();
        G10.a.i(myLooper);
        this.f13803c = null;
        new c(myLooper, dVar, aVar, i11, SystemClock.elapsedRealtime()).d(0L);
    }

    public j(K3.b bVar) {
        this.f13801a = bVar;
    }
}
