package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$BackdropScaffoldKt {
    public static final androidx.compose.material.ComposableSingletons$BackdropScaffoldKt INSTANCE = new androidx.compose.material.ComposableSingletons$BackdropScaffoldKt();
    private static kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2057676608, false, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material.ComposableSingletons$BackdropScaffoldKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            kotlin.Unit highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.material.ComposableSingletons$BackdropScaffoldKt.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.material.SnackbarHostState) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            return highResolutionOutputSizeshNQ4ISI;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material.SnackbarHostState snackbarHostState, androidx.compose.runtime.Composer composer, int i) {
        if ((i & 6) == 0) {
            i |= composer.changed(snackbarHostState) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2057676608, i, -1, "androidx.compose.material.ComposableSingletons$BackdropScaffoldKt.lambda$2057676608.<anonymous> (BackdropScaffold.kt:350)");
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

    public final kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarHostState, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$2057676608$material() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
