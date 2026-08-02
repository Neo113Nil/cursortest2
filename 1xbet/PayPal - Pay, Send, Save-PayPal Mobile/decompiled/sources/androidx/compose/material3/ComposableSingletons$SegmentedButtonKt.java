package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$SegmentedButtonKt {
    public static final androidx.compose.material3.ComposableSingletons$SegmentedButtonKt INSTANCE = new androidx.compose.material3.ComposableSingletons$SegmentedButtonKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1863131183, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.ComposableSingletons$SegmentedButtonKt$lambda$1863131183$1
        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            androidx.compose.runtime.Composer composer2 = composer;
            int intValue = num.intValue();
            if (composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1863131183, intValue, -1, "androidx.compose.material3.ComposableSingletons$SegmentedButtonKt.lambda$1863131183.<anonymous> (SegmentedButton.kt:633)");
                }
                androidx.compose.material3.SegmentedButtonDefaults.INSTANCE.ActiveIcon(composer2, 6);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                composer2.skipToGroupEnd();
            }
            return kotlin.Unit.INSTANCE;
        }
    });

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1863131183$material3() {
        return Camera2StreamConfigurationMap;
    }
}
