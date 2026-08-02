package androidx.compose.ui.tooling;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$PreviewActivity_androidKt {
    public static final androidx.compose.ui.tooling.ComposableSingletons$PreviewActivity_androidKt INSTANCE = new androidx.compose.ui.tooling.ComposableSingletons$PreviewActivity_androidKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-426398407, false, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.ui.tooling.ComposableSingletons$PreviewActivity_androidKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return androidx.compose.ui.tooling.ComposableSingletons$PreviewActivity_androidKt.$r8$lambda$cVextEfQLbJ5bTCEO688v6X1Pmg((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$cVextEfQLbJ5bTCEO688v6X1Pmg(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-426398407, i, -1, "androidx.compose.ui.tooling.ComposableSingletons$PreviewActivity_androidKt.lambda$-426398407.<anonymous> (PreviewActivity.android.kt:118)");
            }
            androidx.compose.material.TextKt.m2832TextfLXpl1I("Next", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 6, 0, org.apache.commons.imaging.formats.jpeg.JpegConstants.COM_MARKER);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-426398407$ui_tooling, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m8506getLambda$426398407$ui_tooling() {
        return getHighSpeedVideoFpsRanges;
    }
}
