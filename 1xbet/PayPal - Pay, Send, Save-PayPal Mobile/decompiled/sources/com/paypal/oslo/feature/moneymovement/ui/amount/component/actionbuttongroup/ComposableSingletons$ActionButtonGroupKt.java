package com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$ActionButtonGroupKt {
    public static final com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ComposableSingletons$ActionButtonGroupKt INSTANCE = new com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ComposableSingletons$ActionButtonGroupKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(633631470, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ComposableSingletons$ActionButtonGroupKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ComposableSingletons$ActionButtonGroupKt.$r8$lambda$G1sVkfyogwEVFYT4d9WEoKzf90E((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$G1sVkfyogwEVFYT4d9WEoKzf90E(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(633631470, i, -1, "com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ComposableSingletons$ActionButtonGroupKt.lambda$633631470.<anonymous> (ActionButtonGroup.kt:71)");
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$633631470$money_movement_prodRelease() {
        return Camera2StreamConfigurationMap;
    }
}
