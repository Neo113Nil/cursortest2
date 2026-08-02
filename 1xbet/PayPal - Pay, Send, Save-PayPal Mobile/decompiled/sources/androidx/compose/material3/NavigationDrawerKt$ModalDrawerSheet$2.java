package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class NavigationDrawerKt$ModalDrawerSheet$2 implements kotlin.jvm.functions.Function3<androidx.compose.material3.DrawerPredictiveBackState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ long Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.DrawerState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.graphics.Shape getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ long getHighSpeedVideoSizes;
    final /* synthetic */ float getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.ui.Modifier getInputFormats;
    final /* synthetic */ androidx.compose.foundation.layout.WindowInsets getInputSizeshNQ4ISI;

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.material3.DrawerPredictiveBackState drawerPredictiveBackState, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.material3.DrawerPredictiveBackState drawerPredictiveBackState2 = drawerPredictiveBackState;
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            intValue |= composer2.changed(drawerPredictiveBackState2) ? 4 : 2;
        }
        if (!composer2.shouldExecute((intValue & 19) != 18, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(797187326, intValue, -1, "androidx.compose.material3.ModalDrawerSheet.<anonymous> (NavigationDrawer.kt:643)");
            }
            androidx.compose.foundation.layout.WindowInsets windowInsets = this.getInputSizeshNQ4ISI;
            androidx.compose.ui.Modifier modifier = this.getInputFormats;
            androidx.compose.ui.graphics.Shape shape = this.getHighSpeedVideoFpsRanges;
            long j = this.getHighSpeedVideoSizes;
            long j2 = this.Camera2StreamConfigurationMap;
            float f = this.getHighSpeedVideoSizesFor;
            boolean changed = composer2.changed(this.getHighResolutionOutputSizeshNQ4ISI);
            final androidx.compose.material3.DrawerState drawerState = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.material3.internal.FloatProducer() { // from class: androidx.compose.material3.NavigationDrawerKt$ModalDrawerSheet$2$$ExternalSyntheticLambda0
                    @Override // androidx.compose.material3.internal.FloatProducer
                    public final float invoke() {
                        float offset;
                        offset = androidx.compose.material3.DrawerState.this.getAnchoredDraggableState$material3().getOffset();
                        return offset;
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.material3.NavigationDrawerKt.m3519DrawerSheetcm3T3N0(drawerPredictiveBackState2, windowInsets, modifier, shape, j, j2, f, (androidx.compose.material3.internal.FloatProducer) rememberedValue, this.getHighSpeedVideoFpsRangesFor, composer2, intValue & 14, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    NavigationDrawerKt$ModalDrawerSheet$2(androidx.compose.foundation.layout.WindowInsets windowInsets, androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.Shape shape, long j, long j2, float f, androidx.compose.material3.DrawerState drawerState, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3) {
        this.getInputSizeshNQ4ISI = windowInsets;
        this.getInputFormats = modifier;
        this.getHighSpeedVideoFpsRanges = shape;
        this.getHighSpeedVideoSizes = j;
        this.Camera2StreamConfigurationMap = j2;
        this.getHighSpeedVideoSizesFor = f;
        this.getHighResolutionOutputSizeshNQ4ISI = drawerState;
        this.getHighSpeedVideoFpsRangesFor = function3;
    }
}
