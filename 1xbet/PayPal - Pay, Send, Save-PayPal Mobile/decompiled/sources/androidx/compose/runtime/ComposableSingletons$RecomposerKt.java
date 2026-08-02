package androidx.compose.runtime;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$RecomposerKt {
    public static final androidx.compose.runtime.ComposableSingletons$RecomposerKt INSTANCE = new androidx.compose.runtime.ComposableSingletons$RecomposerKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1091980426, false, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.runtime.ComposableSingletons$RecomposerKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            kotlin.Unit highSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRangesFor = androidx.compose.runtime.ComposableSingletons$RecomposerKt.getHighSpeedVideoFpsRangesFor((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            return highSpeedVideoFpsRangesFor;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1091980426, i, -1, "androidx.compose.runtime.ComposableSingletons$RecomposerKt.lambda$-1091980426.<anonymous> (Recomposer.kt:434)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1091980426$runtime, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m5234getLambda$1091980426$runtime() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
