package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableSingletons$SearchBarKt {
    public static final androidx.compose.material3.ComposableSingletons$SearchBarKt INSTANCE = new androidx.compose.material3.ComposableSingletons$SearchBarKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1165377840, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.ComposableSingletons$SearchBarKt$lambda$1165377840$1
        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            androidx.compose.runtime.Composer composer2 = composer;
            int intValue = num.intValue();
            if (composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1165377840, intValue, -1, "androidx.compose.material3.ComposableSingletons$SearchBarKt.lambda$1165377840.<anonymous> (SearchBar.kt:2125)");
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
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1146652811, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.ComposableSingletons$SearchBarKt$lambda$-1146652811$1
        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            androidx.compose.runtime.Composer composer2 = composer;
            int intValue = num.intValue();
            if (composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1146652811, intValue, -1, "androidx.compose.material3.ComposableSingletons$SearchBarKt.lambda$-1146652811.<anonymous> (SearchBar.kt:2474)");
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

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1165377840$material3() {
        return getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getLambda$-1146652811$material3, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m3131getLambda$1146652811$material3() {
        return Camera2StreamConfigurationMap;
    }
}
