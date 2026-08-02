package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.C0.d;

/* loaded from: classes5.dex */
public final /* synthetic */ class D0 extends FunctionReferenceImpl implements Function3<C0, kotlinx.coroutines.selects.f<?>, Object, Unit> {
    public static final D0 a = new D0(3, C0.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(C0 c0, kotlinx.coroutines.selects.f<?> fVar, Object obj) {
        C0 c02 = c0;
        kotlinx.coroutines.selects.f<?> fVar2 = fVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0.a;
        c02.getClass();
        while (true) {
            Object obj2 = C0.a.get(c02);
            if (!(obj2 instanceof InterfaceC1110s0)) {
                if (!(obj2 instanceof A)) {
                    obj2 = F0.a(obj2);
                }
                fVar2.c(obj2);
            } else if (c02.V(obj2) >= 0) {
                fVar2.d(com.google.common.base.r.f(c02, true, c02.new d(fVar2)));
                break;
            }
        }
        return Unit.INSTANCE;
    }
}
