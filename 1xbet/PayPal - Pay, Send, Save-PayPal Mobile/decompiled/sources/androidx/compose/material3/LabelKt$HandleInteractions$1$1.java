package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1", f = "Label.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class LabelKt$HandleInteractions$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.material3.TooltipState Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.interaction.MutableInteractionSource getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "interaction", "Landroidx/compose/foundation/interaction/Interaction;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1$1", f = "Label.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.LabelKt$HandleInteractions$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.interaction.Interaction, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int getHighResolutionOutputSizeshNQ4ISI;
        /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.material3.TooltipState getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.foundation.interaction.Interaction interaction = (androidx.compose.foundation.interaction.Interaction) this.getHighSpeedVideoFpsRangesFor;
                if ((interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Press) || (interaction instanceof androidx.compose.foundation.interaction.DragInteraction.Start) || (interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Enter)) {
                    this.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (this.getHighSpeedVideoSizes.show(androidx.compose.foundation.MutatePriority.UserInput, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if ((interaction instanceof androidx.compose.foundation.interaction.PressInteraction.Release) || (interaction instanceof androidx.compose.foundation.interaction.DragInteraction.Stop) || (interaction instanceof androidx.compose.foundation.interaction.HoverInteraction.Exit)) {
                    this.getHighSpeedVideoSizes.dismiss();
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
        public final /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.interaction.Interaction interaction, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((androidx.compose.material3.LabelKt$HandleInteractions$1$1.AnonymousClass1) create(interaction, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            androidx.compose.material3.LabelKt$HandleInteractions$1$1.AnonymousClass1 anonymousClass1 = new androidx.compose.material3.LabelKt$HandleInteractions$1$1.AnonymousClass1(this.getHighSpeedVideoSizes, continuation);
            anonymousClass1.getHighSpeedVideoFpsRangesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.material3.TooltipState tooltipState, kotlin.coroutines.Continuation<? super androidx.compose.material3.LabelKt$HandleInteractions$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = tooltipState;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoSizes.getInteractions(), new androidx.compose.material3.LabelKt$HandleInteractions$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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
        return ((androidx.compose.material3.LabelKt$HandleInteractions$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.material3.LabelKt$HandleInteractions$1$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LabelKt$HandleInteractions$1$1(androidx.compose.foundation.interaction.MutableInteractionSource mutableInteractionSource, androidx.compose.material3.TooltipState tooltipState, kotlin.coroutines.Continuation<? super androidx.compose.material3.LabelKt$HandleInteractions$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = mutableInteractionSource;
        this.Camera2StreamConfigurationMap = tooltipState;
    }
}
