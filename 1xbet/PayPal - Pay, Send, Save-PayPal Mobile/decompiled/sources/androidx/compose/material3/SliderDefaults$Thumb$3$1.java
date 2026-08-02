package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.SliderDefaults$Thumb$3$1", f = "Slider.kt", i = {}, l = {1269}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class SliderDefaults$Thumb$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.foundation.interaction.Interaction> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<androidx.compose.foundation.interaction.Interaction> interactions = this.getHighSpeedVideoFpsRangesFor.getInteractions();
            final androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.foundation.interaction.Interaction> snapshotStateList = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizes = 1;
            if (interactions.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.material3.SliderDefaults$Thumb$3$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    androidx.compose.foundation.interaction.Interaction interaction = (androidx.compose.foundation.interaction.Interaction) obj2;
                    if (interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
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
        return ((androidx.compose.material3.SliderDefaults$Thumb$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.SliderDefaults$Thumb$3$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderDefaults$Thumb$3$1(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.foundation.interaction.Interaction> snapshotStateList, kotlin.coroutines.Continuation<? super androidx.compose.material3.SliderDefaults$Thumb$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = mutableInteractionSource;
        this.Camera2StreamConfigurationMap = snapshotStateList;
    }
}
