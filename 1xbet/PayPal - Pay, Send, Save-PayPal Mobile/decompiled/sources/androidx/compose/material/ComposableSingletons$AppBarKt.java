package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$AppBarKt {
    public static final androidx.compose.material.ComposableSingletons$AppBarKt INSTANCE = new androidx.compose.material.ComposableSingletons$AppBarKt();
    private static kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(269254275, false, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material.ComposableSingletons$AppBarKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            kotlin.Unit highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.material.ComposableSingletons$AppBarKt.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            return highResolutionOutputSizeshNQ4ISI;
        }
    });
    private static kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1260131259, false, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material.ComposableSingletons$AppBarKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            kotlin.Unit highSpeedVideoSizes;
            highSpeedVideoSizes = androidx.compose.material.ComposableSingletons$AppBarKt.getHighSpeedVideoSizes((androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            return highSpeedVideoSizes;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(269254275, i, -1, "androidx.compose.material.ComposableSingletons$AppBarKt.lambda$269254275.<anonymous> (AppBar.kt:88)");
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
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1260131259, i, -1, "androidx.compose.material.ComposableSingletons$AppBarKt.lambda$1260131259.<anonymous> (AppBar.kt:164)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$269254275$material() {
        return getHighSpeedVideoSizes;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1260131259$material() {
        return Camera2StreamConfigurationMap;
    }
}
