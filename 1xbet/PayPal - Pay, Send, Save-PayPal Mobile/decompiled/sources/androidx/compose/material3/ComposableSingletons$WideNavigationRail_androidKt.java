package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$WideNavigationRail_androidKt {
    public static final androidx.compose.material3.ComposableSingletons$WideNavigationRail_androidKt INSTANCE = new androidx.compose.material3.ComposableSingletons$WideNavigationRail_androidKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2011757776, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: androidx.compose.material3.ComposableSingletons$WideNavigationRail_androidKt$lambda$2011757776$1
        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            androidx.compose.runtime.Composer composer2 = composer;
            int intValue = num.intValue();
            if (composer2.shouldExecute((intValue & 3) != 2, intValue & 1)) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(2011757776, intValue, -1, "androidx.compose.material3.ComposableSingletons$WideNavigationRail_androidKt.lambda$2011757776.<anonymous> (WideNavigationRail.android.kt:185)");
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

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$2011757776$material3() {
        return getHighSpeedVideoSizes;
    }
}
