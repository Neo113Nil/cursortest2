package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.core.IndicationNode$onAttach$1", f = "PDSIndication.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class IndicationNode$onAttach$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.pds.core.IndicationNode getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<androidx.compose.foundation.interaction.Interaction> interactions = this.getHighSpeedVideoSizes.getInteractionSource().getInteractions();
            final com.paypal.pds.core.IndicationNode indicationNode = this.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (interactions.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.pds.core.IndicationNode$onAttach$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    androidx.compose.foundation.interaction.Interaction interaction = (androidx.compose.foundation.interaction.Interaction) obj2;
                    if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
                        com.paypal.pds.core.IndicationNode.this.setPressed$pds_release(true);
                    } else if ((interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Release) || (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel)) {
                        com.paypal.pds.core.IndicationNode.this.setPressed$pds_release(false);
                    } else if (interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
                        com.paypal.pds.core.IndicationNode.this.setHovered$pds_release(true);
                    } else if (interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) {
                        com.paypal.pds.core.IndicationNode.this.setHovered$pds_release(false);
                    } else if (interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) {
                        com.paypal.pds.core.IndicationNode.this.setFocused$pds_release(true);
                    } else if (interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) {
                        com.paypal.pds.core.IndicationNode.this.setFocused$pds_release(false);
                    }
                    androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(com.paypal.pds.core.IndicationNode.this);
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
        return ((com.paypal.pds.core.IndicationNode$onAttach$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.pds.core.IndicationNode$onAttach$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IndicationNode$onAttach$1(com.paypal.pds.core.IndicationNode indicationNode, kotlin.coroutines.Continuation<? super com.paypal.pds.core.IndicationNode$onAttach$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = indicationNode;
    }
}
