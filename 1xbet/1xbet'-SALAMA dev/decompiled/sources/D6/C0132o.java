package D6;

import F2.W0;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: D6.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0132o extends AbstractC0122g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0130m f1864e;

    public C0132o(C0130m c0130m) {
        this.f1864e = c0130m;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        j((Throwable) obj);
        return p044f6.i.f13014a;
    }

    @Override // D6.AbstractC0126i0
    public final void j(Throwable th) throws IllegalAccessException, InvocationTargetException {
        s0 s0VarI = i();
        C0130m c0130m = this.f1864e;
        Throwable thQ = c0130m.q(s0VarI);
        if (c0130m.w()) {
            p065i6.d dVar = c0130m.f1857d;
            t6.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            I6.h hVar = (I6.h) dVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I6.h.f3729y;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                W0 w7 = I6.a.f3719d;
                if (t6.h.a(obj, w7)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, w7, thQ)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != w7) {
                        }
                    }
                    return;
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(hVar) == obj);
                }
            }
        }
        c0130m.n(thQ);
        if (c0130m.w()) {
            return;
        }
        c0130m.o();
    }
}
