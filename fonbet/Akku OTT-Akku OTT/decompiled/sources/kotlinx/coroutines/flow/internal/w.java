package kotlinx.coroutines.flow.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.flow.InterfaceC1061f;

/* loaded from: classes5.dex */
public final class w {
    public static final Function3<InterfaceC1061f<Object>, Object, Continuation<? super Unit>, Object> a;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function3<InterfaceC1061f<? super Object>, Object, Continuation<? super Unit>, Object>, SuspendFunction {
        public static final a a = new a(3, InterfaceC1061f.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(InterfaceC1061f<? super Object> interfaceC1061f, Object obj, Continuation<? super Unit> continuation) {
            return interfaceC1061f.emit(obj, continuation);
        }
    }

    static {
        a aVar = a.a;
        Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        a = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(aVar, 3);
    }
}
