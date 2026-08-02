package androidx.compose.material.ripple;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1", f = "Ripple.kt", i = {}, l = {207}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class Ripple$rememberUpdatedInstance$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.material.ripple.RippleIndicationInstance Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.foundation.interaction.InteractionSource getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.flow.Flow<androidx.compose.foundation.interaction.Interaction> interactions = this.getHighSpeedVideoFpsRanges.getInteractions();
            final androidx.compose.material.ripple.RippleIndicationInstance rippleIndicationInstance = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            if (interactions.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    androidx.compose.foundation.interaction.Interaction interaction = (androidx.compose.foundation.interaction.Interaction) obj2;
                    if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
                        androidx.compose.material.ripple.RippleIndicationInstance.this.addRipple((androidx.compose.foundation.interaction.PressInteraction.Press) interaction, coroutineScope);
                    } else if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Release) {
                        androidx.compose.material.ripple.RippleIndicationInstance.this.removeRipple(((androidx.compose.foundation.interaction.PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel) {
                        androidx.compose.material.ripple.RippleIndicationInstance.this.removeRipple(((androidx.compose.foundation.interaction.PressInteraction.Cancel) interaction).getPress());
                    } else {
                        androidx.compose.material.ripple.RippleIndicationInstance.this.updateStateLayer$material_ripple(interaction, coroutineScope);
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1 ripple$rememberUpdatedInstance$1$1 = new androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
        ripple$rememberUpdatedInstance$1$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return ripple$rememberUpdatedInstance$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Ripple$rememberUpdatedInstance$1$1(androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.material.ripple.RippleIndicationInstance rippleIndicationInstance, kotlin.coroutines.Continuation<? super androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = interactionSource;
        this.Camera2StreamConfigurationMap = rippleIndicationInstance;
    }
}
