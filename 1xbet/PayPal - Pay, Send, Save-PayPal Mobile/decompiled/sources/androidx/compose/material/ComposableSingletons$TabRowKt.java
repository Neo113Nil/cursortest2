package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$TabRowKt {
    public static final androidx.compose.material.ComposableSingletons$TabRowKt INSTANCE = new androidx.compose.material.ComposableSingletons$TabRowKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1216856915, false, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ComposableSingletons$TabRowKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            kotlin.Unit Camera2StreamConfigurationMap;
            Camera2StreamConfigurationMap = androidx.compose.material.ComposableSingletons$TabRowKt.Camera2StreamConfigurationMap((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            return Camera2StreamConfigurationMap;
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-222041980, false, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material.ComposableSingletons$TabRowKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            kotlin.Unit highSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRangesFor = androidx.compose.material.ComposableSingletons$TabRowKt.getHighSpeedVideoFpsRangesFor((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
            return highSpeedVideoFpsRangesFor;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1216856915, i, -1, "androidx.compose.material.ComposableSingletons$TabRowKt.lambda$-1216856915.<anonymous> (TabRow.kt:143)");
            }
            androidx.compose.material.TabRowDefaults.INSTANCE.m2791Divider9IZ8Weo(null, 0.0f, 0L, composer, 3072, 7);
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-222041980, i, -1, "androidx.compose.material.ComposableSingletons$TabRowKt.lambda$-222041980.<anonymous> (TabRow.kt:234)");
            }
            androidx.compose.material.TabRowDefaults.INSTANCE.m2791Divider9IZ8Weo(null, 0.0f, 0L, composer, 3072, 7);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-222041980$material, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m2596getLambda$222041980$material() {
        return getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: getLambda$-1216856915$material, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m2595getLambda$1216856915$material() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
