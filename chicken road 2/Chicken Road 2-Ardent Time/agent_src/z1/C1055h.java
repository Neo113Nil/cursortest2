package z1;

/* renamed from: z1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1055h extends z1.S {

    /* renamed from: e, reason: collision with root package name */
    public final z1.C1053f f8569e;

    public C1055h(z1.C1053f c1053f) {
        this.f8569e = c1053f;
    }

    @Override // s1.l
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        k((java.lang.Throwable) obj);
        return h1.C0177i.f3302a;
    }

    @Override // z1.U
    public final void k(java.lang.Throwable th) {
        z1.Z j2 = j();
        z1.C1053f c1053f = this.f8569e;
        java.lang.Throwable s2 = c1053f.s(j2);
        if (c1053f.x()) {
            k1.d dVar = c1053f.f8566d;
            kotlin.jvm.internal.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            E1.h hVar = (E1.h) dVar;
            loop0: while (true) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E1.h.f274h;
                java.lang.Object obj = atomicReferenceFieldUpdater.get(hVar);
                C.j jVar = E1.AbstractC0000a.f264d;
                if (!kotlin.jvm.internal.i.a(obj, jVar)) {
                    if (!(obj instanceof java.lang.Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, jVar, s2)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != jVar) {
                        break;
                    }
                }
                return;
            }
        }
        c1053f.p(s2);
        if (c1053f.x()) {
            return;
        }
        c1053f.q();
    }
}
