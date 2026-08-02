package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class ConstraintLayoutKt$ConstraintLayout$contentDelegate$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ androidx.compose.runtime.MutableState<kotlin.Unit> $Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> $getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.ConstraintSet> $getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function3<androidx.constraintlayout.compose.ConstraintLayoutScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> $getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.ui.node.Ref<androidx.constraintlayout.compose.CompositionSource> $getHighSpeedVideoSizes;
    final /* synthetic */ androidx.constraintlayout.compose.ConstraintLayoutScope $getInputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> $getOutputMinFrameDuration;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        invoke(composer, num.intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.runtime.Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-74958949, i, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:371)");
            }
            this.$Camera2StreamConfigurationMap.setValue(kotlin.Unit.INSTANCE);
            if (this.$getHighSpeedVideoSizes.getValue() == androidx.constraintlayout.compose.CompositionSource.Unknown) {
                this.$getHighSpeedVideoSizes.setValue(androidx.constraintlayout.compose.CompositionSource.Content);
            }
            this.$getInputSizeshNQ4ISI.reset();
            this.$getHighSpeedVideoFpsRangesFor.invoke(this.$getInputSizeshNQ4ISI, composer, 0);
            boolean changedInstance = composer.changedInstance(this.$getInputSizeshNQ4ISI);
            boolean changedInstance2 = composer.changedInstance(this.$getHighSpeedVideoFpsRanges);
            final androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope = this.$getInputSizeshNQ4ISI;
            final androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> mutableState = this.$getOutputMinFrameDuration;
            final androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> mutableState2 = this.$getHighResolutionOutputSizeshNQ4ISI;
            final kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.ConstraintSet> channel = this.$getHighSpeedVideoFpsRanges;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if ((changedInstance | changedInstance2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$contentDelegate$1$1$1
                    @Override // kotlin.jvm.functions.Function0
                    public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                        invoke2();
                        return kotlin.Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        androidx.constraintlayout.compose.RawConstraintSet rawConstraintSet = new androidx.constraintlayout.compose.RawConstraintSet(androidx.constraintlayout.compose.ConstraintLayoutScope.this.getContainerObject().mo9053clone());
                        if (mutableState.getValue() == null || mutableState2.getValue() == null) {
                            mutableState.setValue(rawConstraintSet);
                            mutableState2.setValue(mutableState.getValue());
                        } else {
                            channel.mo9266trySendJP2dKIU(rawConstraintSet);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.SideEffect((kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConstraintLayoutKt$ConstraintLayout$contentDelegate$1(androidx.compose.runtime.MutableState<kotlin.Unit> mutableState, androidx.compose.ui.node.Ref<androidx.constraintlayout.compose.CompositionSource> ref, androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope, kotlin.jvm.functions.Function3<? super androidx.constraintlayout.compose.ConstraintLayoutScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, kotlinx.coroutines.channels.Channel<androidx.constraintlayout.compose.ConstraintSet> channel, androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> mutableState2, androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> mutableState3) {
        super(2);
        this.$Camera2StreamConfigurationMap = mutableState;
        this.$getHighSpeedVideoSizes = ref;
        this.$getInputSizeshNQ4ISI = constraintLayoutScope;
        this.$getHighSpeedVideoFpsRangesFor = function3;
        this.$getHighSpeedVideoFpsRanges = channel;
        this.$getOutputMinFrameDuration = mutableState2;
        this.$getHighResolutionOutputSizeshNQ4ISI = mutableState3;
    }
}
