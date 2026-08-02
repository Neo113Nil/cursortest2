package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.BasicTooltipKt$keyboardBehavior$1$1", f = "BasicTooltip.kt", i = {}, l = {301}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class BasicTooltipKt$keyboardBehavior$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.ui.focus.FocusState Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material3.TooltipState getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.Camera2StreamConfigurationMap.isFocused()) {
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (this.getHighSpeedVideoSizes.show(androidx.compose.foundation.MutatePriority.PreventUserInput, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (this.getHighSpeedVideoSizes.getGetHighResolutionOutputSizeshNQ4ISI() && !this.Camera2StreamConfigurationMap.isFocused()) {
            this.getHighSpeedVideoSizes.dismiss();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.internal.BasicTooltipKt$keyboardBehavior$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.internal.BasicTooltipKt$keyboardBehavior$1$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasicTooltipKt$keyboardBehavior$1$1(androidx.compose.ui.focus.FocusState focusState, androidx.compose.material3.TooltipState tooltipState, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.BasicTooltipKt$keyboardBehavior$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = focusState;
        this.getHighSpeedVideoSizes = tooltipState;
    }
}
