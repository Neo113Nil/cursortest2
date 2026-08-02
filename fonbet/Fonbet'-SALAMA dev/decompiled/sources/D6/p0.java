package D6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final /* synthetic */ class p0 extends t6.g implements s6.o {

    /* renamed from: z, reason: collision with root package name */
    public static final p0 f1870z = new p0(3, s0.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // s6.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object x4;
        s0 s0Var = (s0) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s0.f1874a;
        do {
            x4 = s0Var.x();
            if (!(x4 instanceof InterfaceC0112b0)) {
                if (x4 instanceof C0138v) {
                    throw null;
                }
                E.v(x4);
                throw null;
            }
        } while (s0Var.K(x4) < 0);
        s0Var.invokeOnCompletion(false, true, new P(s0Var));
        throw null;
    }
}
