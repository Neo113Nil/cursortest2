package F3;

import F3.InterfaceC3018x;
import android.os.Handler;
import j3.C7272n;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import m3.InterfaceC8068j;

/* loaded from: classes.dex */
public interface F {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8405a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC3018x.b f8406b;

        /* renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0185a> f8407c;

        /* renamed from: F3.F$a$a, reason: collision with other inner class name */
        private static final class C0185a {

            /* renamed from: a, reason: collision with root package name */
            public Handler f8408a;

            /* renamed from: b, reason: collision with root package name */
            public F f8409b;
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        public final void a(Handler handler, F f7) {
            handler.getClass();
            f7.getClass();
            C0185a c0185a = new C0185a();
            c0185a.f8408a = handler;
            c0185a.f8409b = f7;
            this.f8407c.add(c0185a);
        }

        public final void b(final InterfaceC8068j<F> interfaceC8068j) {
            Iterator<C0185a> it = this.f8407c.iterator();
            while (it.hasNext()) {
                C0185a next = it.next();
                final F f7 = next.f8409b;
                m3.N.V(next.f8408a, new Runnable() { // from class: F3.E
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC8068j.this.accept(f7);
                    }
                });
            }
        }

        public final void c(int i11, C7272n c7272n, int i12, Object obj, long j11) {
            b(new C3019y(this, new C3016v(1, i11, c7272n, i12, obj, m3.N.g0(j11), -9223372036854775807L)));
        }

        public final void d(C3013s c3013s, int i11, int i12, C7272n c7272n, int i13, Object obj, long j11, long j12) {
            b(new C(this, c3013s, new C3016v(i11, i12, c7272n, i13, obj, m3.N.g0(j11), m3.N.g0(j12))));
        }

        public final void e(C3013s c3013s, int i11, int i12, C7272n c7272n, int i13, Object obj, long j11, long j12) {
            b(new A(this, c3013s, new C3016v(i11, i12, c7272n, i13, obj, m3.N.g0(j11), m3.N.g0(j12))));
        }

        public final void f(C3013s c3013s, int i11, int i12, C7272n c7272n, int i13, Object obj, long j11, long j12, IOException iOException, boolean z11) {
            b(new B(this, c3013s, new C3016v(i11, i12, c7272n, i13, obj, m3.N.g0(j11), m3.N.g0(j12)), iOException, z11));
        }

        public final void g(C3013s c3013s, int i11, int i12, C7272n c7272n, int i13, Object obj, long j11, long j12, int i14) {
            b(new C3020z(this, c3013s, new C3016v(i11, i12, c7272n, i13, obj, m3.N.g0(j11), m3.N.g0(j12)), i14));
        }

        public final void h(F f7) {
            CopyOnWriteArrayList<C0185a> copyOnWriteArrayList = this.f8407c;
            Iterator<C0185a> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C0185a next = it.next();
                if (next.f8409b == f7) {
                    copyOnWriteArrayList.remove(next);
                }
            }
        }

        public final a i(int i11, InterfaceC3018x.b bVar) {
            return new a(this.f8407c, i11, bVar);
        }

        private a(CopyOnWriteArrayList<C0185a> copyOnWriteArrayList, int i11, InterfaceC3018x.b bVar) {
            this.f8407c = copyOnWriteArrayList;
            this.f8405a = i11;
            this.f8406b = bVar;
        }
    }

    default void H(int i11, InterfaceC3018x.b bVar, C3016v c3016v) {
    }

    default void I(int i11, InterfaceC3018x.b bVar, C3013s c3013s, C3016v c3016v) {
    }

    default void M(int i11, InterfaceC3018x.b bVar, C3016v c3016v) {
    }

    default void U(int i11, InterfaceC3018x.b bVar, C3013s c3013s, C3016v c3016v, IOException iOException, boolean z11) {
    }

    default void X(int i11, InterfaceC3018x.b bVar, C3013s c3013s, C3016v c3016v) {
    }

    default void c0(int i11, InterfaceC3018x.b bVar, C3013s c3013s, C3016v c3016v, int i12) {
    }
}
