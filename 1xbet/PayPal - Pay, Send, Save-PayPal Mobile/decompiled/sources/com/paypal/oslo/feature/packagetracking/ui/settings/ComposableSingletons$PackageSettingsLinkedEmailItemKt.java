package com.paypal.oslo.feature.packagetracking.ui.settings;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComposableSingletons$PackageSettingsLinkedEmailItemKt {
    public static final com.paypal.oslo.feature.packagetracking.ui.settings.ComposableSingletons$PackageSettingsLinkedEmailItemKt INSTANCE = new com.paypal.oslo.feature.packagetracking.ui.settings.ComposableSingletons$PackageSettingsLinkedEmailItemKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1357110082, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.ComposableSingletons$PackageSettingsLinkedEmailItemKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.packagetracking.ui.settings.ComposableSingletons$PackageSettingsLinkedEmailItemKt.$r8$lambda$ZR8ep0FAJLzU0tTHZWY3ArEHe5U((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$ZR8ep0FAJLzU0tTHZWY3ArEHe5U(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1357110082, i, -1, "com.paypal.oslo.feature.packagetracking.ui.settings.ComposableSingletons$PackageSettingsLinkedEmailItemKt.lambda$-1357110082.<anonymous> (PackageSettingsLinkedEmailItem.kt:107)");
            }
            int i2 = com.paypal.oslo.feature.packagetracking.R.drawable.feature_package_tracking_ic_gmail;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.ComposableSingletons$PackageSettingsLinkedEmailItemKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsLinkedEmailItemKt.PackageSettingsLinkedEmailItem(com.paypal.oslo.feature.packagetracking.ui.PTUiConstants.MOCK_EMAIL_PLACEHOLDER, "Gmail", i2, (kotlin.jvm.functions.Function0) rememberedValue, composer, 3126);
            com.paypal.pds.components.DividerKt.Divider(null, composer, 0, 1);
            int i3 = com.paypal.oslo.feature.packagetracking.R.drawable.feature_package_tracking_ic_outlook;
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.packagetracking.ui.settings.ComposableSingletons$PackageSettingsLinkedEmailItemKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsLinkedEmailItemKt.PackageSettingsLinkedEmailItem(com.paypal.oslo.feature.packagetracking.ui.PTUiConstants.MOCK_EMAIL_PLACEHOLDER, "Outlook", i3, (kotlin.jvm.functions.Function0) rememberedValue2, composer, 3126);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: getLambda$-1357110082$package_tracking_prodRelease, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m17564getLambda$1357110082$package_tracking_prodRelease() {
        return getHighSpeedVideoSizes;
    }
}
