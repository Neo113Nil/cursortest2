package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$SnackbarHostKt {
    public static final androidx.compose.material.ComposableSingletons$SnackbarHostKt INSTANCE = new androidx.compose.material.ComposableSingletons$SnackbarHostKt();
    private static kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarData, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1890101041, false, new kotlin.jvm.functions.Function3() { // from class: androidx.compose.material.ComposableSingletons$SnackbarHostKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
            kotlin.Unit Camera2StreamConfigurationMap;
            Camera2StreamConfigurationMap = androidx.compose.material.ComposableSingletons$SnackbarHostKt.Camera2StreamConfigurationMap((androidx.compose.material.SnackbarData) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            return Camera2StreamConfigurationMap;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.material.SnackbarData snackbarData, androidx.compose.runtime.Composer composer, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? composer.changed(snackbarData) : composer.changedInstance(snackbarData) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1890101041, i2, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda$1890101041.<anonymous> (SnackbarHost.kt:154)");
            }
            androidx.compose.material.SnackbarKt.m2748SnackbarsPrSdHI(snackbarData, null, false, null, 0L, 0L, 0L, 0.0f, composer, i2 & 14, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function3<androidx.compose.material.SnackbarData, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1890101041$material() {
        return getHighSpeedVideoSizes;
    }
}
