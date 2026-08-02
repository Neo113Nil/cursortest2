package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.CardElevation$animateElevation$1$1", f = "Card.kt", i = {}, l = {670}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class CardElevation$animateElevation$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.interaction.InteractionSource Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.foundation.interaction.Interaction> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<androidx.compose.foundation.interaction.Interaction> interactions = this.Camera2StreamConfigurationMap.getInteractions();
            final androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.foundation.interaction.Interaction> snapshotStateList = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRanges = 1;
            if (interactions.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.material3.CardElevation$animateElevation$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    androidx.compose.foundation.interaction.Interaction interaction = (androidx.compose.foundation.interaction.Interaction) obj2;
                    if (interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter) {
                        snapshotStateList.add(interaction);
                    } else if (interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit) {
                        snapshotStateList.remove(((androidx.compose.foundation.interaction.HoverInteraction.Exit) interaction).getEnter());
                    } else if (interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Focus) {
                        snapshotStateList.add(interaction);
                    } else if (interaction instanceof androidx.compose.foundation.interaction.FocusInteraction.Unfocus) {
                        snapshotStateList.remove(((androidx.compose.foundation.interaction.FocusInteraction.Unfocus) interaction).getFocus());
                    } else if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
                        snapshotStateList.add(interaction);
                    } else if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Release) {
                        snapshotStateList.remove(((androidx.compose.foundation.interaction.PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel) {
                        snapshotStateList.remove(((androidx.compose.foundation.interaction.PressInteraction.Cancel) interaction).getPress());
                    } else if (interaction instanceof androidx.compose.foundation.interaction.DragInteraction.Start) {
                        snapshotStateList.add(interaction);
                    } else if (interaction instanceof androidx.compose.foundation.interaction.DragInteraction.Stop) {
                        snapshotStateList.remove(((androidx.compose.foundation.interaction.DragInteraction.Stop) interaction).getStart());
                    } else if (interaction instanceof androidx.compose.foundation.interaction.DragInteraction.Cancel) {
                        snapshotStateList.remove(((androidx.compose.foundation.interaction.DragInteraction.Cancel) interaction).getStart());
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
        return ((androidx.compose.material3.CardElevation$animateElevation$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.CardElevation$animateElevation$1$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardElevation$animateElevation$1$1(androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.foundation.interaction.Interaction> snapshotStateList, kotlin.coroutines.Continuation<? super androidx.compose.material3.CardElevation$animateElevation$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = interactionSource;
        this.getHighResolutionOutputSizeshNQ4ISI = snapshotStateList;
    }
}
