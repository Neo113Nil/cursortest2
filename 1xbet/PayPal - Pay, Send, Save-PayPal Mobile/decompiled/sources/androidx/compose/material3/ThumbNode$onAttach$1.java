package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.ThumbNode$onAttach$1", f = "Switch.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class ThumbNode$onAttach$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.ThumbNode getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
            kotlinx.coroutines.flow.Flow<androidx.compose.foundation.interaction.Interaction> interactions = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI.getInteractions();
            final androidx.compose.material3.ThumbNode thumbNode = this.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            if (interactions.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.material3.ThumbNode$onAttach$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    boolean z;
                    androidx.compose.foundation.interaction.Interaction interaction = (androidx.compose.foundation.interaction.Interaction) obj2;
                    if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
                        kotlin.jvm.internal.Ref.IntRef.this.element++;
                    } else if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Release) {
                        kotlin.jvm.internal.Ref.IntRef.this.element--;
                    } else if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel) {
                        kotlin.jvm.internal.Ref.IntRef.this.element--;
                    }
                    boolean z2 = kotlin.jvm.internal.Ref.IntRef.this.element > 0;
                    z = thumbNode.Camera2StreamConfigurationMap;
                    if (z != z2) {
                        thumbNode.Camera2StreamConfigurationMap = z2;
                        androidx.compose.ui.node.LayoutModifierNodeKt.invalidateMeasurement(thumbNode);
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
        return ((androidx.compose.material3.ThumbNode$onAttach$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.ThumbNode$onAttach$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThumbNode$onAttach$1(androidx.compose.material3.ThumbNode thumbNode, kotlin.coroutines.Continuation<? super androidx.compose.material3.ThumbNode$onAttach$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = thumbNode;
    }
}
