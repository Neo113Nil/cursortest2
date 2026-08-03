package androidx.compose.material.ripple;

/* compiled from: Ripple.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", f = "Ripple.kt", i = {}, l = {356}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class Ripple$rememberUpdatedInstance$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.material.ripple.RippleIndicationInstance $instance;
    final /* synthetic */ androidx.compose.foundation.interaction.InteractionSource $interactionSource;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Ripple$rememberUpdatedInstance$1(androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.material.ripple.RippleIndicationInstance rippleIndicationInstance, kotlin.coroutines.Continuation<? super androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1> continuation) {
        super(2, continuation);
        this.$interactionSource = interactionSource;
        this.$instance = rippleIndicationInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1 ripple$rememberUpdatedInstance$1 = new androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1(this.$interactionSource, this.$instance, continuation);
        ripple$rememberUpdatedInstance$1.L$0 = obj;
        return ripple$rememberUpdatedInstance$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            kotlinx.coroutines.flow.Flow<androidx.compose.foundation.interaction.Interaction> interactions = this.$interactionSource.getInteractions();
            final androidx.compose.material.ripple.RippleIndicationInstance rippleIndicationInstance = this.$instance;
            this.label = 1;
            if (interactions.collect(new kotlinx.coroutines.flow.FlowCollector<androidx.compose.foundation.interaction.Interaction>() { // from class: androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public java.lang.Object emit(androidx.compose.foundation.interaction.Interaction interaction, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    androidx.compose.foundation.interaction.Interaction interaction2 = interaction;
                    if (interaction2 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
                        androidx.compose.material.ripple.RippleIndicationInstance.this.addRipple((androidx.compose.foundation.interaction.PressInteraction.Press) interaction2, coroutineScope);
                    } else if (interaction2 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) {
                        androidx.compose.material.ripple.RippleIndicationInstance.this.removeRipple(((androidx.compose.foundation.interaction.PressInteraction.Release) interaction2).getPress());
                    } else if (interaction2 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel) {
                        androidx.compose.material.ripple.RippleIndicationInstance.this.removeRipple(((androidx.compose.foundation.interaction.PressInteraction.Cancel) interaction2).getPress());
                    } else {
                        androidx.compose.material.ripple.RippleIndicationInstance.this.updateStateLayer$material_ripple_release(interaction2, coroutineScope);
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
}
