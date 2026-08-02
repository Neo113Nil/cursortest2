package androidx.constraintlayout.compose;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes.dex */
public final class ConstraintLayoutKt$ConstraintLayout$2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> $Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function3<androidx.constraintlayout.compose.ConstraintLayoutScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> $getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.constraintlayout.compose.ConstraintLayoutScope $getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<kotlin.Unit> $getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        invoke(composer, num.intValue());
        return kotlin.Unit.INSTANCE;
    }

    public final void invoke(androidx.compose.runtime.Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1200550679, i, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
            }
            this.$getHighSpeedVideoFpsRangesFor.setValue(kotlin.Unit.INSTANCE);
            int helpersHashCode = this.$getHighSpeedVideoFpsRanges.getHelpersHashCode();
            this.$getHighSpeedVideoFpsRanges.reset();
            this.$getHighResolutionOutputSizeshNQ4ISI.invoke(this.$getHighSpeedVideoFpsRanges, composer, 0);
            if (this.$getHighSpeedVideoFpsRanges.getHelpersHashCode() != helpersHashCode) {
                androidx.compose.runtime.EffectsKt.SideEffect(this.$Camera2StreamConfigurationMap, composer, 6);
            }
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
    public ConstraintLayoutKt$ConstraintLayout$2(androidx.compose.runtime.MutableState<kotlin.Unit> mutableState, androidx.constraintlayout.compose.ConstraintLayoutScope constraintLayoutScope, kotlin.jvm.functions.Function3<? super androidx.constraintlayout.compose.ConstraintLayoutScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        super(2);
        this.$getHighSpeedVideoFpsRangesFor = mutableState;
        this.$getHighSpeedVideoFpsRanges = constraintLayoutScope;
        this.$getHighResolutionOutputSizeshNQ4ISI = function3;
        this.$Camera2StreamConfigurationMap = function0;
    }
}
