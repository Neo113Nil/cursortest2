package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.FocusableNode$emitWithFallback$1", f = "Focusable.kt", i = {}, l = {322}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class FocusableNode$emitWithFallback$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.DisposableHandle Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.interaction.Interaction getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (this.getHighSpeedVideoFpsRanges.emit(this.getHighSpeedVideoFpsRangesFor, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.DisposableHandle disposableHandle = this.Camera2StreamConfigurationMap;
        if (disposableHandle != null) {
            disposableHandle.dispose();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.FocusableNode$emitWithFallback$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.FocusableNode$emitWithFallback$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FocusableNode$emitWithFallback$1(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.interaction.Interaction interaction, kotlinx.coroutines.DisposableHandle disposableHandle, kotlin.coroutines.Continuation<? super androidx.compose.foundation.FocusableNode$emitWithFallback$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = mutableInteractionSource;
        this.getHighSpeedVideoFpsRangesFor = interaction;
        this.Camera2StreamConfigurationMap = disposableHandle;
    }
}
