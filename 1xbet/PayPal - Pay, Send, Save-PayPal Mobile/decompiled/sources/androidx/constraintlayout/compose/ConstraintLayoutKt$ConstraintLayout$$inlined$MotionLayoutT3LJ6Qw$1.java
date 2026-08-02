package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/compose/MotionLayoutScope;", "", "invoke", "(Landroidx/constraintlayout/compose/MotionLayoutScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* renamed from: androidx.constraintlayout.compose.ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayout-T3LJ6Qw$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayoutT3LJ6Qw$1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function3<androidx.constraintlayout.compose.MotionLayoutScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ kotlin.jvm.functions.Function2 $Camera2StreamConfigurationMap;
    final /* synthetic */ int $getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.constraintlayout.compose.InvalidationStrategy $getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState $getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.ui.node.Ref $getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ kotlin.Unit invoke(androidx.constraintlayout.compose.MotionLayoutScope motionLayoutScope, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        invoke(motionLayoutScope, composer, num.intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.constraintlayout.compose.MotionLayoutScope motionLayoutScope, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(284503157, i, -1, "androidx.constraintlayout.compose.MotionLayout.<anonymous> (MotionLayout.kt:154)");
        }
        this.$getHighSpeedVideoFpsRangesFor.setValue(kotlin.Unit.INSTANCE);
        if (this.$getHighSpeedVideoFpsRanges.getOnObservedStateChange() == null && this.$getHighSpeedVideoSizes.getValue() == androidx.constraintlayout.compose.CompositionSource.Unknown) {
            this.$getHighSpeedVideoSizes.setValue(androidx.constraintlayout.compose.CompositionSource.Content);
        }
        composer.startReplaceGroup(-2075780874);
        this.$Camera2StreamConfigurationMap.invoke(composer, java.lang.Integer.valueOf((this.$getHighResolutionOutputSizeshNQ4ISI >> 15) & 14));
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayoutT3LJ6Qw$1(androidx.compose.runtime.MutableState mutableState, androidx.constraintlayout.compose.InvalidationStrategy invalidationStrategy, androidx.compose.ui.node.Ref ref, kotlin.jvm.functions.Function2 function2, int i) {
        super(3);
        this.$getHighSpeedVideoFpsRangesFor = mutableState;
        this.$getHighSpeedVideoFpsRanges = invalidationStrategy;
        this.$getHighSpeedVideoSizes = ref;
        this.$Camera2StreamConfigurationMap = function2;
        this.$getHighResolutionOutputSizeshNQ4ISI = i;
    }
}
