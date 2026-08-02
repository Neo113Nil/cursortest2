package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;", "androidx/datastore/core/MultiProcessCoordinator$withLazyCounter$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1", f = "MultiProcessCoordinator.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
public final class MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Integer>, java.lang.Object> {
    final /* synthetic */ androidx.content.core.MultiProcessCoordinator Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.content.core.SharedCounter value;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        value = this.Camera2StreamConfigurationMap.getOutputFormats.getValue();
        return kotlin.coroutines.jvm.internal.Boxing.boxInt(value.getValue());
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return ((androidx.content.core.MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.content.core.MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(androidx.content.core.MultiProcessCoordinator multiProcessCoordinator, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = multiProcessCoordinator;
    }
}
