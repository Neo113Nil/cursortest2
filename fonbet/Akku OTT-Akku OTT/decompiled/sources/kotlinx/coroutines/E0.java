package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
public final /* synthetic */ class E0 extends FunctionReferenceImpl implements Function3<C0, Object, Object, Object> {
    public static final E0 a = new E0(3, C0.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(C0 c0, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0.a;
        c0.getClass();
        if (obj2 instanceof A) {
            throw ((A) obj2).a;
        }
        return obj2;
    }
}
