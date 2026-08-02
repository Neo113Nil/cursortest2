package androidx.content.core;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2", f = "MultiProcessCoordinator.android.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
public final class MultiProcessCoordinator$withLazyCounter$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.content.core.MultiProcessCoordinator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.content.core.SharedCounter, kotlin.coroutines.Continuation<? super T>, java.lang.Object> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.content.core.SharedCounter value;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        kotlin.jvm.functions.Function2<androidx.content.core.SharedCounter, kotlin.coroutines.Continuation<? super T>, java.lang.Object> function2 = this.getHighSpeedVideoSizes;
        value = this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats.getValue();
        this.Camera2StreamConfigurationMap = 1;
        java.lang.Object invoke = function2.invoke(value, this);
        return invoke == coroutine_suspended ? coroutine_suspended : invoke;
    }

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        androidx.content.core.SharedCounter value;
        kotlin.jvm.functions.Function2<androidx.content.core.SharedCounter, kotlin.coroutines.Continuation<? super T>, java.lang.Object> function2 = this.getHighSpeedVideoSizes;
        value = this.getHighResolutionOutputSizeshNQ4ISI.getOutputFormats.getValue();
        return function2.invoke(value, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super T> continuation) {
        return ((androidx.content.core.MultiProcessCoordinator$withLazyCounter$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.content.core.MultiProcessCoordinator$withLazyCounter$2(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MultiProcessCoordinator$withLazyCounter$2(kotlin.jvm.functions.Function2<? super androidx.content.core.SharedCounter, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, androidx.content.core.MultiProcessCoordinator multiProcessCoordinator, kotlin.coroutines.Continuation<? super androidx.content.core.MultiProcessCoordinator$withLazyCounter$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = multiProcessCoordinator;
    }
}
