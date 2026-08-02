package D6;

import F2.W0;
import f6.C1116i;
import i6.InterfaceC1287d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: D6.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0132o extends AbstractC0122g0 {

    /* renamed from: e, reason: collision with root package name */
    public final C0130m f1864e;

    public C0132o(C0130m c0130m) {
        this.f1864e = c0130m;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        j((Throwable) obj);
        return C1116i.f13008a;
    }

    @Override // D6.AbstractC0126i0
    public final void j(Throwable th) {
        s0 i7 = i();
        C0130m c0130m = this.f1864e;
        Throwable q7 = c0130m.q(i7);
        if (c0130m.w()) {
            InterfaceC1287d interfaceC1287d = c0130m.f1857d;
            t6.h.c(interfaceC1287d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            I6.h hVar = (I6.h) interfaceC1287d;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I6.h.f3729y;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                W0 w02 = I6.a.f3719d;
                if (!t6.h.a(obj, w02)) {
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
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, w02, q7)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != w02) {
                        break;
                    }
                }
                return;
            }
        }
        c0130m.n(q7);
        if (c0130m.w()) {
            return;
        }
        c0130m.o();
    }
}
