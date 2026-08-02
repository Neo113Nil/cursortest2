package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposableSingletons$NumericKeyboardKt {
    public static final com.paypal.oslo.core.commonui.components.ComposableSingletons$NumericKeyboardKt INSTANCE = new com.paypal.oslo.core.commonui.components.ComposableSingletons$NumericKeyboardKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2133612184, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.core.commonui.components.ComposableSingletons$NumericKeyboardKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.core.commonui.components.ComposableSingletons$NumericKeyboardKt.$r8$lambda$oJZBUQ5Fc3lbYkNLBO6XGecO0Dc((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$oJZBUQ5Fc3lbYkNLBO6XGecO0Dc(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2133612184, i, -1, "com.paypal.oslo.core.commonui.components.ComposableSingletons$NumericKeyboardKt.lambda$-2133612184.<anonymous> (NumericKeyboard.kt:274)");
            }
            com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.BackspaceFill.INSTANCE, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, composer, 27702, 4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-2133612184$common_ui_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m11112getLambda$2133612184$common_ui_release() {
        return Camera2StreamConfigurationMap;
    }
}
