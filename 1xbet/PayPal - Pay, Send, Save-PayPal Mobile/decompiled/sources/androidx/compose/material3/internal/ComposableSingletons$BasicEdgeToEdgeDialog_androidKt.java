package androidx.compose.material3.internal;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$BasicEdgeToEdgeDialog_androidKt {
    public static final androidx.compose.material3.internal.ComposableSingletons$BasicEdgeToEdgeDialog_androidKt INSTANCE = new androidx.compose.material3.internal.ComposableSingletons$BasicEdgeToEdgeDialog_androidKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(453789431, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.internal.ComposableSingletons$BasicEdgeToEdgeDialog_androidKt$lambda$453789431$1
        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            androidx.compose.runtime.Composer composer2 = composer;
            int intValue = num.intValue();
            if (composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(453789431, intValue, -1, "androidx.compose.material3.internal.ComposableSingletons$BasicEdgeToEdgeDialog_androidKt.lambda$453789431.<anonymous> (BasicEdgeToEdgeDialog.android.kt:316)");
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

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$453789431$material3() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
