package androidx.compose.material.ripple;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.ripple.RippleNode$onAttach$1", f = "Ripple.kt", i = {}, l = {364}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class RippleNode$onAttach$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.material.ripple.RippleNode getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.interaction.InteractionSource interactionSource;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRangesFor;
            interactionSource = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            kotlinx.coroutines.flow.Flow<androidx.compose.foundation.interaction.Interaction> interactions = interactionSource.getInteractions();
            final androidx.compose.material.ripple.RippleNode rippleNode = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 1;
            if (interactions.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.material.ripple.RippleNode$onAttach$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    boolean z;
                    androidx.collection.MutableObjectList mutableObjectList;
                    androidx.compose.foundation.interaction.Interaction interaction = (androidx.compose.foundation.interaction.Interaction) obj2;
                    if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction) {
                        z = androidx.compose.material.ripple.RippleNode.this.getHighResolutionOutputSizeshNQ4ISI;
                        if (z) {
                            androidx.compose.material.ripple.RippleNode.this.Camera2StreamConfigurationMap((androidx.compose.foundation.interaction.PressInteraction) interaction);
                        } else {
                            mutableObjectList = androidx.compose.material.ripple.RippleNode.this.getOutputFormats;
                            mutableObjectList.add(interaction);
                        }
                    } else {
                        androidx.compose.material.ripple.RippleNode.access$updateStateLayer(androidx.compose.material.ripple.RippleNode.this, interaction, coroutineScope);
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
        return ((androidx.compose.material.ripple.RippleNode$onAttach$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.material.ripple.RippleNode$onAttach$1 rippleNode$onAttach$1 = new androidx.compose.material.ripple.RippleNode$onAttach$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        rippleNode$onAttach$1.getHighSpeedVideoFpsRangesFor = obj;
        return rippleNode$onAttach$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RippleNode$onAttach$1(androidx.compose.material.ripple.RippleNode rippleNode, kotlin.coroutines.Continuation<? super androidx.compose.material.ripple.RippleNode$onAttach$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = rippleNode;
    }
}
