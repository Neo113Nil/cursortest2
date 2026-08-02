package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BottomSheetScaffoldKt$BottomSheetScaffold$1$1 implements kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> {
    final /* synthetic */ long Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.material3.BottomSheetScaffoldState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ long getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes;
    final /* synthetic */ float getHighSpeedVideoSizesFor;
    final /* synthetic */ androidx.compose.ui.graphics.Shape getInputFormats;
    final /* synthetic */ float getInputSizeshNQ4ISI;
    final /* synthetic */ float getOutputFormats;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getOutputMinFrameDuration;
    final /* synthetic */ kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ float getOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function3<androidx.compose.material3.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getOutputStallDuration;
    final /* synthetic */ boolean getOutputStallDurationlomOqCM;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
        androidx.compose.runtime.Composer composer2 = composer;
        int intValue = num.intValue();
        if (!composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(999829022, intValue, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous>.<anonymous> (BottomSheetScaffold.kt:140)");
            }
            androidx.compose.material3.SheetState bottomSheetState = this.getHighResolutionOutputSizeshNQ4ISI.getBottomSheetState();
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function2 = this.getOutputMinFrameDurationlomOqCM;
            final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function3 = this.getHighSpeedVideoFpsRangesFor;
            final float f = this.getOutputFormats;
            androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-519581786, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$1$1.1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num2) {
                    androidx.compose.runtime.Composer composer4 = composer3;
                    int intValue2 = num2.intValue();
                    if (composer4.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-519581786, intValue2, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:142)");
                        }
                        function3.invoke(androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, f, 7, null), composer4, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer4.skipToGroupEnd();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, composer2, 54);
            final androidx.compose.material3.BottomSheetScaffoldState bottomSheetScaffoldState = this.getHighResolutionOutputSizeshNQ4ISI;
            final float f2 = this.getOutputFormats;
            final float f3 = this.getHighSpeedVideoSizesFor;
            final boolean z = this.getOutputStallDurationlomOqCM;
            final androidx.compose.ui.graphics.Shape shape = this.getInputFormats;
            final long j = this.Camera2StreamConfigurationMap;
            final long j2 = this.getHighSpeedVideoFpsRanges;
            final float f4 = this.getOutputSizeshNQ4ISI;
            final float f5 = this.getInputSizeshNQ4ISI;
            final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function22 = this.getOutputMinFrameDuration;
            final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function32 = this.getHighSpeedVideoSizes;
            androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-815624571, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$1$1.2
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num2) {
                    androidx.compose.runtime.Composer composer4 = composer3;
                    int intValue2 = num2.intValue();
                    if (composer4.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-815624571, intValue2, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:147)");
                        }
                        androidx.compose.material3.BottomSheetScaffoldKt.getHighSpeedVideoSizes(androidx.compose.material3.BottomSheetScaffoldState.this.getBottomSheetState(), f2, f3, z, shape, j, j2, f4, f5, function22, function32, composer4, 0, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer4.skipToGroupEnd();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, composer2, 54);
            final kotlin.jvm.functions.Function3<androidx.compose.material3.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> function33 = this.getOutputStallDuration;
            final androidx.compose.material3.BottomSheetScaffoldState bottomSheetScaffoldState2 = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.compose.runtime.internal.ComposableLambda rememberComposableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1111667356, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$1$1.3
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num2) {
                    androidx.compose.runtime.Composer composer4 = composer3;
                    int intValue2 = num2.intValue();
                    if (composer4.shouldExecute((intValue2 & 3) != 2, intValue2 & 1)) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1111667356, intValue2, -1, "androidx.compose.material3.BottomSheetScaffold.<anonymous>.<anonymous>.<anonymous> (BottomSheetScaffold.kt:143)");
                        }
                        function33.invoke(bottomSheetScaffoldState2.getSnackbarHostState(), composer4, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    } else {
                        composer4.skipToGroupEnd();
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }, composer2, 54);
            boolean changed = composer2.changed(this.getHighResolutionOutputSizeshNQ4ISI);
            final androidx.compose.material3.BottomSheetScaffoldState bottomSheetScaffoldState3 = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object rememberedValue = composer2.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.BottomSheetScaffoldKt$BottomSheetScaffold$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        float requireOffset;
                        requireOffset = androidx.compose.material3.BottomSheetScaffoldState.this.getBottomSheetState().requireOffset();
                        return java.lang.Float.valueOf(requireOffset);
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            androidx.compose.material3.BottomSheetScaffoldKt.getHighSpeedVideoFpsRangesFor(function2, rememberComposableLambda, rememberComposableLambda2, rememberComposableLambda3, (kotlin.jvm.functions.Function0) rememberedValue, bottomSheetState, composer2, 3504);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    BottomSheetScaffoldKt$BottomSheetScaffold$1$1(androidx.compose.material3.BottomSheetScaffoldState bottomSheetScaffoldState, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3, float f, float f2, boolean z, androidx.compose.ui.graphics.Shape shape, long j, long j2, float f3, float f4, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function32, kotlin.jvm.functions.Function3<? super androidx.compose.material3.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function33) {
        this.getHighResolutionOutputSizeshNQ4ISI = bottomSheetScaffoldState;
        this.getOutputMinFrameDurationlomOqCM = function2;
        this.getHighSpeedVideoFpsRangesFor = function3;
        this.getOutputFormats = f;
        this.getHighSpeedVideoSizesFor = f2;
        this.getOutputStallDurationlomOqCM = z;
        this.getInputFormats = shape;
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoFpsRanges = j2;
        this.getOutputSizeshNQ4ISI = f3;
        this.getInputSizeshNQ4ISI = f4;
        this.getOutputMinFrameDuration = function22;
        this.getHighSpeedVideoSizes = function32;
        this.getOutputStallDuration = function33;
    }
}
