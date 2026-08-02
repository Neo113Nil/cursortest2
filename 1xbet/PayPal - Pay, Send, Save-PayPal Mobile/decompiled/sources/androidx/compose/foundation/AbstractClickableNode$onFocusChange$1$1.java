package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1", f = "Clickable.kt", i = {}, l = {1458}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class AbstractClickableNode$onFocusChange$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.interaction.PressInteraction.Press getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.AbstractClickableNode getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableInteractionSource = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            if (mutableInteractionSource != null) {
                this.getHighSpeedVideoSizes = 1;
                if (mutableInteractionSource.emit(new androidx.compose.foundation.interaction.PressInteraction.Cancel(this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractClickableNode$onFocusChange$1$1(androidx.compose.foundation.AbstractClickableNode abstractClickableNode, androidx.compose.foundation.interaction.PressInteraction.Press press, kotlin.coroutines.Continuation<? super androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = abstractClickableNode;
        this.getHighResolutionOutputSizeshNQ4ISI = press;
    }
}
