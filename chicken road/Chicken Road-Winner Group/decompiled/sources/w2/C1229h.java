package w2;

import d2.C0279i;
import g2.InterfaceC0319c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: w2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1229h extends S {

    /* renamed from: e, reason: collision with root package name */
    public final C1227f f10505e;

    public C1229h(C1227f c1227f) {
        this.f10505e = c1227f;
    }

    @Override // o2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return C0279i.f4852a;
    }

    @Override // w2.U
    public final void j(Throwable th) {
        Z i3 = i();
        C1227f c1227f = this.f10505e;
        Throwable r3 = c1227f.r(i3);
        if (c1227f.w()) {
            InterfaceC0319c interfaceC0319c = c1227f.f10502d;
            kotlin.jvm.internal.j.c(interfaceC0319c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            B2.h hVar = (B2.h) interfaceC0319c;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B2.h.f158h;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                B2.v vVar = B2.a.f149d;
                if (!kotlin.jvm.internal.j.a(obj, vVar)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, vVar, r3)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != vVar) {
                        break;
                    }
                }
                return;
            }
        }
        c1227f.o(r3);
        if (c1227f.w()) {
            return;
        }
        c1227f.p();
    }
}
