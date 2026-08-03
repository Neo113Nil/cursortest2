package androidx.compose.material;

/* compiled from: Switch.kt */
@kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SwitchKt$SwitchImpl$1$1", f = "Switch.kt", i = {}, l = {185}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class SwitchKt$SwitchImpl$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.interaction.InteractionSource $interactionSource;
    final /* synthetic */ androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.foundation.interaction.Interaction> $interactions;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwitchKt$SwitchImpl$1$1(androidx.compose.foundation.interaction.InteractionSource interactionSource, androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.foundation.interaction.Interaction> snapshotStateList, kotlin.coroutines.Continuation<? super androidx.compose.material.SwitchKt$SwitchImpl$1$1> continuation) {
        super(2, continuation);
        this.$interactionSource = interactionSource;
        this.$interactions = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material.SwitchKt$SwitchImpl$1$1(this.$interactionSource, this.$interactions, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material.SwitchKt$SwitchImpl$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.Flow<androidx.compose.foundation.interaction.Interaction> interactions = this.$interactionSource.getInteractions();
            final androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.foundation.interaction.Interaction> snapshotStateList = this.$interactions;
            this.label = 1;
            if (interactions.collect(new kotlinx.coroutines.flow.FlowCollector<androidx.compose.foundation.interaction.Interaction>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ java.lang.Object emit(androidx.compose.foundation.interaction.Interaction interaction, kotlin.coroutines.Continuation continuation) {
                    return emit2(interaction, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                }

                /* renamed from: emit, reason: avoid collision after fix types in other method */
                public final java.lang.Object emit2(androidx.compose.foundation.interaction.Interaction interaction, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
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
}
