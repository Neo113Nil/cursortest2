package L3;

import L3.K;
import android.os.Handler;
import android.os.SystemClock;
import j3.C7272n;
import j3.Q;
import m3.N;
import t3.C9737c;
import t3.C9738d;

/* loaded from: classes.dex */
public interface K {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f16271a;

        /* renamed from: b, reason: collision with root package name */
        private final K f16272b;

        public a(Handler handler, K k11) {
            if (k11 != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.f16271a = handler;
            this.f16272b = k11;
        }

        public static void a(a aVar, String str, long j11, long j12) {
            aVar.getClass();
            int i11 = N.f74289a;
            aVar.f16272b.p(str, j11, j12);
        }

        public static void b(a aVar, Exception exc) {
            aVar.getClass();
            int i11 = N.f74289a;
            aVar.f16272b.v(exc);
        }

        public static void c(int i11, long j11, a aVar) {
            aVar.getClass();
            int i12 = N.f74289a;
            aVar.f16272b.k(i11, j11);
        }

        public static void d(a aVar, C9737c c9737c) {
            aVar.getClass();
            synchronized (c9737c) {
            }
            K k11 = aVar.f16272b;
            int i11 = N.f74289a;
            k11.a(c9737c);
        }

        public static void e(a aVar, C9737c c9737c) {
            aVar.getClass();
            int i11 = N.f74289a;
            aVar.f16272b.f(c9737c);
        }

        public static void f(a aVar, Q q11) {
            aVar.getClass();
            int i11 = N.f74289a;
            aVar.f16272b.onVideoSizeChanged(q11);
        }

        public static void g(int i11, long j11, a aVar) {
            aVar.getClass();
            int i12 = N.f74289a;
            aVar.f16272b.j(i11, j11);
        }

        public static void h(a aVar, C7272n c7272n, C9738d c9738d) {
            aVar.getClass();
            int i11 = N.f74289a;
            aVar.f16272b.g(c7272n, c9738d);
        }

        public static void i(a aVar, String str) {
            aVar.getClass();
            int i11 = N.f74289a;
            aVar.f16272b.b(str);
        }

        public static void j(a aVar, Object obj, long j11) {
            aVar.getClass();
            int i11 = N.f74289a;
            aVar.f16272b.i(j11, obj);
        }

        public final void k(final String str, final long j11, final long j12) {
            Handler handler = this.f16271a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: L3.A
                    @Override // java.lang.Runnable
                    public final void run() {
                        K.a.a(K.a.this, str, j11, j12);
                    }
                });
            }
        }

        public final void l(String str) {
            Handler handler = this.f16271a;
            if (handler != null) {
                handler.post(new E(this, str, 0));
            }
        }

        public final void m(C9737c c9737c) {
            synchronized (c9737c) {
            }
            Handler handler = this.f16271a;
            if (handler != null) {
                handler.post(new J(0, this, c9737c));
            }
        }

        public final void n(final int i11, final long j11) {
            Handler handler = this.f16271a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: L3.F
                    @Override // java.lang.Runnable
                    public final void run() {
                        K.a.c(i11, j11, this);
                    }
                });
            }
        }

        public final void o(C9737c c9737c) {
            Handler handler = this.f16271a;
            if (handler != null) {
                handler.post(new H(0, this, c9737c));
            }
        }

        public final void p(final C7272n c7272n, final C9738d c9738d) {
            Handler handler = this.f16271a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: L3.I
                    @Override // java.lang.Runnable
                    public final void run() {
                        K.a.h(K.a.this, c7272n, c9738d);
                    }
                });
            }
        }

        public final void q(final Object obj) {
            Handler handler = this.f16271a;
            if (handler != null) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                handler.post(new Runnable() { // from class: L3.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        K.a.j(K.a.this, obj, elapsedRealtime);
                    }
                });
            }
        }

        public final void r(final int i11, final long j11) {
            Handler handler = this.f16271a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: L3.G
                    @Override // java.lang.Runnable
                    public final void run() {
                        K.a.g(i11, j11, this);
                    }
                });
            }
        }

        public final void s(Exception exc) {
            Handler handler = this.f16271a;
            if (handler != null) {
                handler.post(new D(0, this, exc));
            }
        }

        public final void t(Q q11) {
            Handler handler = this.f16271a;
            if (handler != null) {
                handler.post(new B(0, this, q11));
            }
        }
    }

    default void a(C9737c c9737c) {
    }

    default void b(String str) {
    }

    default void f(C9737c c9737c) {
    }

    default void g(C7272n c7272n, C9738d c9738d) {
    }

    default void i(long j11, Object obj) {
    }

    default void j(int i11, long j11) {
    }

    default void k(int i11, long j11) {
    }

    default void onVideoSizeChanged(Q q11) {
    }

    default void p(String str, long j11, long j12) {
    }

    default void v(Exception exc) {
    }
}
