package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$BottomSheetScaffoldKt {
    public static final androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt INSTANCE = new androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1392012807, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt$lambda$1392012807$1
        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            androidx.compose.runtime.Composer composer2 = composer;
            int intValue = num.intValue();
            if (composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1392012807, intValue, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.lambda$1392012807.<anonymous> (BottomSheetScaffold.kt:128)");
                }
                androidx.compose.material3.BottomSheetDefaults.INSTANCE.m2931DragHandlelgZ2HuY(null, 0.0f, 0.0f, null, 0L, composer2, androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 31);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return kotlin.Unit.INSTANCE;
        }
    });
    private static kotlin.jvm.functions.Function3<androidx.compose.material3.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1768941633, false, new kotlin.jvm.functions.Function3<androidx.compose.material3.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt$lambda$1768941633$1
        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.material3.SnackbarHostState snackbarHostState, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            androidx.compose.material3.SnackbarHostState snackbarHostState2 = snackbarHostState;
            androidx.compose.runtime.Composer composer2 = composer;
            int intValue = num.intValue();
            if ((intValue & 6) == 0) {
                intValue |= composer2.changed(snackbarHostState2) ? 4 : 2;
            }
            if (composer2.shouldExecute((intValue & 19) != 18, intValue & 1)) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1768941633, intValue, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.lambda$1768941633.<anonymous> (BottomSheetScaffold.kt:131)");
                }
                androidx.compose.material3.SnackbarHostKt.SnackbarHost(snackbarHostState2, null, null, composer2, intValue & 14, 6);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return kotlin.Unit.INSTANCE;
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-788244078, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt$lambda$-788244078$1
        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            androidx.compose.runtime.Composer composer2 = composer;
            int intValue = num.intValue();
            if (composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-788244078, intValue, -1, "androidx.compose.material3.ComposableSingletons$BottomSheetScaffoldKt.lambda$-788244078.<anonymous> (BottomSheetScaffold.kt:415)");
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return kotlin.Unit.INSTANCE;
        }
    });

    public final kotlin.jvm.functions.Function3<androidx.compose.material3.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1768941633$material3() {
        return getHighSpeedVideoSizes;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1392012807$material3() {
        return getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getLambda$-788244078$material3, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m3123getLambda$788244078$material3() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
