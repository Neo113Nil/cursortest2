package D6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final /* synthetic */ class r0 extends t6.g implements s6.o {

    /* renamed from: z, reason: collision with root package name */
    public static final r0 f1873z = new r0(3, s0.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // s6.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z4;
        s0 s0Var = (s0) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s0.f1874a;
        while (true) {
            Object x4 = s0Var.x();
            if (!(x4 instanceof InterfaceC0112b0)) {
                z4 = false;
                break;
            }
            if (s0Var.K(x4) >= 0) {
                z4 = true;
                break;
            }
        }
        if (!z4) {
            throw null;
        }
        s0Var.invokeOnCompletion(false, true, new m0());
        throw null;
    }
}
