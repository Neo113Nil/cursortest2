package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.camera.core.f;
import androidx.camera.core.impl.InterfaceC5104l0;
import androidx.camera.core.m;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
final class m extends k {

    /* renamed from: t, reason: collision with root package name */
    final Executor f38430t;

    /* renamed from: u, reason: collision with root package name */
    private final Object f38431u = new Object();

    /* renamed from: v, reason: collision with root package name */
    p f38432v;

    /* renamed from: w, reason: collision with root package name */
    private b f38433w;

    final class a implements I.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f38434a;

        a(b bVar) {
            this.f38434a = bVar;
        }

        @Override // I.c
        public final void onFailure(@NonNull Throwable th2) {
            this.f38434a.close();
        }

        @Override // I.c
        public final /* bridge */ /* synthetic */ void onSuccess(Void r12) {
        }
    }

    static class b extends f {

        /* renamed from: d, reason: collision with root package name */
        final WeakReference<m> f38435d;

        b(@NonNull p pVar, @NonNull m mVar) {
            super(pVar);
            this.f38435d = new WeakReference<>(mVar);
            c(new f.a() { // from class: androidx.camera.core.n
                @Override // androidx.camera.core.f.a
                public final void h(f fVar) {
                    final m mVar2 = m.b.this.f38435d.get();
                    if (mVar2 != null) {
                        mVar2.f38430t.execute(new Runnable() { // from class: androidx.camera.core.o
                            @Override // java.lang.Runnable
                            public final void run() {
                                m.this.r();
                            }
                        });
                    }
                }
            });
        }
    }

    m(Executor executor) {
        this.f38430t = executor;
    }

    @Override // androidx.camera.core.k
    final p c(@NonNull InterfaceC5104l0 interfaceC5104l0) {
        return interfaceC5104l0.e();
    }

    @Override // androidx.camera.core.k
    final void e() {
        synchronized (this.f38431u) {
            try {
                p pVar = this.f38432v;
                if (pVar != null) {
                    pVar.close();
                    this.f38432v = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.camera.core.k
    final void g(@NonNull p pVar) {
        synchronized (this.f38431u) {
            try {
                if (!this.f38428s) {
                    pVar.close();
                    return;
                }
                if (this.f38433w == null) {
                    b bVar = new b(pVar, this);
                    this.f38433w = bVar;
                    I.k.b(d(bVar), new a(bVar), H.c.b());
                } else {
                    if (pVar.x0().getTimestamp() <= this.f38433w.f38083b.x0().getTimestamp()) {
                        pVar.close();
                    } else {
                        p pVar2 = this.f38432v;
                        if (pVar2 != null) {
                            pVar2.close();
                        }
                        this.f38432v = pVar;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void r() {
        synchronized (this.f38431u) {
            try {
                this.f38433w = null;
                p pVar = this.f38432v;
                if (pVar != null) {
                    this.f38432v = null;
                    g(pVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
