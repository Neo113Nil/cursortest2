package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class SafeCollectorKt$emitFun$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object>, java.lang.Object, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object>, kotlin.coroutines.jvm.internal.SuspendFunction {
    public static final kotlinx.coroutines.flow.internal.SafeCollectorKt$emitFun$1 getHighResolutionOutputSizeshNQ4ISI = new kotlinx.coroutines.flow.internal.SafeCollectorKt$emitFun$1();

    @Override // kotlin.jvm.functions.Function3
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<java.lang.Object> flowCollector, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return flowCollector.emit(obj, continuation);
    }

    SafeCollectorKt$emitFun$1() {
        super(3, kotlinx.coroutines.flow.FlowCollector.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }
}
