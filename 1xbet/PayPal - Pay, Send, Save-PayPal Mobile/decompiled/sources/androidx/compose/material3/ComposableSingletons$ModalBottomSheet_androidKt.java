package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposableSingletons$ModalBottomSheet_androidKt {
    public static final androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt INSTANCE = new androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1294623166, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt$lambda$-1294623166$1
        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            androidx.compose.runtime.Composer composer2 = composer;
            int intValue = num.intValue();
            if (composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1294623166, intValue, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.lambda$-1294623166.<anonymous> (ModalBottomSheet.android.kt:338)");
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
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-91331245, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt$lambda$-91331245$1
        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            androidx.compose.runtime.Composer composer2 = composer;
            int intValue = num.intValue();
            if (composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-91331245, intValue, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.lambda$-91331245.<anonymous> (ModalBottomSheet.android.kt:422)");
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

    /* renamed from: getLambda$-91331245$material3, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m3128getLambda$91331245$material3() {
        return getHighSpeedVideoSizes;
    }

    /* renamed from: getLambda$-1294623166$material3, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m3127getLambda$1294623166$material3() {
        return Camera2StreamConfigurationMap;
    }
}
