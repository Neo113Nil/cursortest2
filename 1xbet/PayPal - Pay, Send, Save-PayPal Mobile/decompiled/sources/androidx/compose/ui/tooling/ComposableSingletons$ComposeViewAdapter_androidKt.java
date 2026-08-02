package androidx.compose.ui.tooling;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ComposableSingletons$ComposeViewAdapter_androidKt {
    public static final androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt INSTANCE = new androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1163195098, false, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt.$r8$lambda$_a3qQeBQhsx1vj5AchpF3b5HcOU((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2086912010, false, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt.$r8$lambda$rxu5TkcdeCzvGy6bhxSB2jxv4Lw((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$_a3qQeBQhsx1vj5AchpF3b5HcOU(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1163195098, i, -1, "androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt.lambda$-1163195098.<anonymous> (ComposeViewAdapter.android.kt:81)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rxu5TkcdeCzvGy6bhxSB2jxv4Lw(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2086912010, i, -1, "androidx.compose.ui.tooling.ComposableSingletons$ComposeViewAdapter_androidKt.lambda$2086912010.<anonymous> (ComposeViewAdapter.android.kt:162)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$2086912010$ui_tooling() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    /* renamed from: getLambda$-1163195098$ui_tooling, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m8505getLambda$1163195098$ui_tooling() {
        return getHighSpeedVideoSizes;
    }
}
