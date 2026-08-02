package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1", f = "Clickable.kt", i = {1}, l = {1744, 1747}, m = "invokeSuspend", n = {"press"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class AbstractClickableNode$handlePressInteraction$2$1$delayJob$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.AbstractClickableNode Camera2StreamConfigurationMap;
    final /* synthetic */ long getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(androidx.compose.foundation.Clickable_androidKt.getTapIndicationDelay(), r6) != r0) goto L14;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean highSpeedVideoFpsRangesFor;
        androidx.compose.foundation.interaction.PressInteraction.Press press;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            highSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor();
            if (highSpeedVideoFpsRangesFor) {
                this.getHighSpeedVideoSizes = 1;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                press = (androidx.compose.foundation.interaction.PressInteraction.Press) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                this.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor = press;
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.compose.foundation.interaction.PressInteraction.Press press2 = new androidx.compose.foundation.interaction.PressInteraction.Press(this.getHighResolutionOutputSizeshNQ4ISI, null);
        this.getHighSpeedVideoFpsRangesFor = press2;
        this.getHighSpeedVideoSizes = 2;
        if (this.getHighSpeedVideoFpsRanges.emit(press2, this) != coroutine_suspended) {
            press = press2;
            this.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor = press;
            return kotlin.Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbstractClickableNode$handlePressInteraction$2$1$delayJob$1(androidx.compose.foundation.AbstractClickableNode abstractClickableNode, long j, androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, kotlin.coroutines.Continuation<? super androidx.compose.foundation.AbstractClickableNode$handlePressInteraction$2$1$delayJob$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = abstractClickableNode;
        this.getHighResolutionOutputSizeshNQ4ISI = j;
        this.getHighSpeedVideoFpsRanges = mutableInteractionSource;
    }
}
