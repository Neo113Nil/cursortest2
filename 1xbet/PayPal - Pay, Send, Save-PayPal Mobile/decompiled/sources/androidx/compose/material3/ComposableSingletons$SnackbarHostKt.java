package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$SnackbarHostKt {
    public static final androidx.compose.material3.ComposableSingletons$SnackbarHostKt INSTANCE = new androidx.compose.material3.ComposableSingletons$SnackbarHostKt();
    private static kotlin.jvm.functions.Function3<androidx.compose.material3.SnackbarData, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1548712596, false, new kotlin.jvm.functions.Function3<androidx.compose.material3.SnackbarData, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.ComposableSingletons$SnackbarHostKt$lambda$-1548712596$1
        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.material3.SnackbarData snackbarData, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            androidx.compose.material3.SnackbarData snackbarData2 = snackbarData;
            androidx.compose.runtime.Composer composer2 = composer;
            int intValue = num.intValue();
            if ((intValue & 6) == 0) {
                intValue |= composer2.changed(snackbarData2) ? 4 : 2;
            }
            int i = intValue;
            if (composer2.shouldExecute((i & 19) != 18, i & 1)) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1548712596, i, -1, "androidx.compose.material3.ComposableSingletons$SnackbarHostKt.lambda$-1548712596.<anonymous> (SnackbarHost.kt:219)");
                }
                androidx.compose.material3.SnackbarKt.m3817SnackbarsDKtq54(snackbarData2, null, false, null, 0L, 0L, 0L, 0L, 0L, composer2, i & 14, 510);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return kotlin.Unit.INSTANCE;
        }
    });

    /* renamed from: getLambda$-1548712596$material3, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<androidx.compose.material3.SnackbarData, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m3132getLambda$1548712596$material3() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
