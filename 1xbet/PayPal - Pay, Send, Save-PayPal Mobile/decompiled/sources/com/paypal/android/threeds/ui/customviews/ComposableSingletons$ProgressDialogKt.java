package com.paypal.android.threeds.ui.customviews;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$ProgressDialogKt {
    public static final com.paypal.android.threeds.ui.customviews.ComposableSingletons$ProgressDialogKt INSTANCE = new com.paypal.android.threeds.ui.customviews.ComposableSingletons$ProgressDialogKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1073606837, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ui.customviews.ComposableSingletons$ProgressDialogKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.android.threeds.ui.customviews.ComposableSingletons$ProgressDialogKt.m11002$r8$lambda$xnCmslFSJcXbzJ0iQOkMy_jyQA((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    /* renamed from: $r8$lambda$xnCmslFSJcXb-zJ0iQOkMy_jyQA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11002$r8$lambda$xnCmslFSJcXbzJ0iQOkMy_jyQA(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1073606837, i, -1, "com.paypal.android.threeds.ui.customviews.ComposableSingletons$ProgressDialogKt.lambda$-1073606837.<anonymous> (ProgressDialog.kt:39)");
            }
            com.paypal.android.threeds.ui.ProgressDialogViewKt.ProgressDialogView(null, composer, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1073606837$three_ds_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m11003getLambda$1073606837$three_ds_release() {
        return Camera2StreamConfigurationMap;
    }
}
