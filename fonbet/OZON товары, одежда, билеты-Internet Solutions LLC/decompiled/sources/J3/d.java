package J3;

import J3.d;
import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p3.z;

/* loaded from: classes.dex */
public interface d {

    public interface a {

        /* renamed from: J3.d$a$a, reason: collision with other inner class name */
        public static final class C0260a {

            /* renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList<C0261a> f13754a = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: J3.d$a$a$a, reason: collision with other inner class name */
            static final class C0261a {

                /* renamed from: a, reason: collision with root package name */
                private final Handler f13755a;

                /* renamed from: b, reason: collision with root package name */
                private final a f13756b;

                /* renamed from: c, reason: collision with root package name */
                private boolean f13757c;

                public C0261a(Handler handler, a aVar) {
                    this.f13755a = handler;
                    this.f13756b = aVar;
                }

                public final void d() {
                    this.f13757c = true;
                }
            }

            public final void a(Handler handler, a aVar) {
                aVar.getClass();
                c(aVar);
                this.f13754a.add(new C0261a(handler, aVar));
            }

            public final void b(int i11, long j11, long j12) {
                final int i12;
                final long j13;
                final long j14;
                Iterator<C0261a> it = this.f13754a.iterator();
                while (it.hasNext()) {
                    final C0261a next = it.next();
                    if (next.f13757c) {
                        i12 = i11;
                        j13 = j11;
                        j14 = j12;
                    } else {
                        i12 = i11;
                        j13 = j11;
                        j14 = j12;
                        next.f13755a.post(new Runnable() { // from class: J3.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                d.a.C0260a.C0261a.this.f13756b.C(i12, j13, j14);
                            }
                        });
                    }
                    i11 = i12;
                    j11 = j13;
                    j12 = j14;
                }
            }

            public final void c(a aVar) {
                CopyOnWriteArrayList<C0261a> copyOnWriteArrayList = this.f13754a;
                Iterator<C0261a> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    C0261a next = it.next();
                    if (next.f13756b == aVar) {
                        next.d();
                        copyOnWriteArrayList.remove(next);
                    }
                }
            }
        }

        void C(int i11, long j11, long j12);
    }

    long a();

    void b(Handler handler, a aVar);

    z c();

    void d(a aVar);
}
