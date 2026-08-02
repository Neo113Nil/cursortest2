package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$BottomSheetScaffoldKt {
    public static final androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt INSTANCE = new androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt();
    private static kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(937349512, false, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            kotlin.Unit highSpeedVideoSizes;
            highSpeedVideoSizes = androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.getHighSpeedVideoSizes((androidx.compose.material.SnackbarHostState) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            return highSpeedVideoSizes;
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-505419337, false, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            kotlin.Unit highSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRangesFor = androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.getHighSpeedVideoFpsRangesFor((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            return highSpeedVideoFpsRangesFor;
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(687232378, false, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            kotlin.Unit highSpeedVideoFpsRanges;
            highSpeedVideoFpsRanges = androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.getHighSpeedVideoFpsRanges((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            return highSpeedVideoFpsRanges;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.material.SnackbarHostState snackbarHostState, androidx.compose.runtime.Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changed(snackbarHostState) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(937349512, i, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda$937349512.<anonymous> (BottomSheetScaffold.kt:324)");
            }
            androidx.compose.material.SnackbarHostKt.SnackbarHost(snackbarHostState, null, null, composer, i & 14, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-505419337, i, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda$-505419337.<anonymous> (BottomSheetScaffold.kt:473)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(687232378, i, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda$687232378.<anonymous> (BottomSheetScaffold.kt:476)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$937349512$material() {
        return getHighSpeedVideoSizes;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$687232378$material() {
        return getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: getLambda$-505419337$material, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m2585getLambda$505419337$material() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
