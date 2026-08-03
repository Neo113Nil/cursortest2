package androidx.compose.foundation;

/* compiled from: Clickable.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", i = {1}, l = {com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_ERROR_VALUE, 304}, m = "invokeSuspend", n = {"press"}, s = {"L$0"})
/* loaded from: classes.dex */
final class ClickableKt$handlePressInteraction$2$delayJob$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<java.lang.Boolean> $delayPressInteraction;
    final /* synthetic */ androidx.compose.foundation.AbstractClickableNode.InteractionData $interactionData;
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource $interactionSource;
    final /* synthetic */ long $pressPoint;
    java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClickableKt$handlePressInteraction$2$delayJob$1(kotlin.jvm.functions.Function0<java.lang.Boolean> function0, long j, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.foundation.AbstractClickableNode.InteractionData interactionData, kotlin.coroutines.Continuation<? super androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1> continuation) {
        super(2, continuation);
        this.$delayPressInteraction = function0;
        this.$pressPoint = j;
        this.$interactionSource = mutableInteractionSource;
        this.$interactionData = interactionData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1(this.$delayPressInteraction, this.$pressPoint, this.$interactionSource, this.$interactionData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.interaction.PressInteraction.Press press;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (this.$delayPressInteraction.invoke().booleanValue()) {
                this.label = 1;
                if (kotlinx.coroutines.DelayKt.delay(androidx.compose.foundation.Clickable_androidKt.getTapIndicationDelay(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                press = (androidx.compose.foundation.interaction.PressInteraction.Press) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                this.$interactionData.setPressInteraction(press);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.compose.foundation.interaction.PressInteraction.Press press2 = new androidx.compose.foundation.interaction.PressInteraction.Press(this.$pressPoint, null);
        this.L$0 = press2;
        this.label = 2;
        if (this.$interactionSource.emit(press2, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        press = press2;
        this.$interactionData.setPressInteraction(press);
        return kotlin.Unit.INSTANCE;
    }
}
