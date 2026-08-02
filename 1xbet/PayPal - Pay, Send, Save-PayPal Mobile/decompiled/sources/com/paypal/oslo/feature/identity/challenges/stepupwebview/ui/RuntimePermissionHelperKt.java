package com.paypal.oslo.feature.identity.challenges.stepupwebview.ui;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/RuntimePermissionHelper;", "rememberRuntimePermissionHelper", "(Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/identity/challenges/stepupwebview/ui/RuntimePermissionHelper;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RuntimePermissionHelperKt {
    public static final com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.RuntimePermissionHelper rememberRuntimePermissionHelper(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-374926231, i, -1, "com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.rememberRuntimePermissionHelper (RuntimePermissionHelper.kt:67)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.RuntimePermissionHelper(null, 1, null);
            composer.updateRememberedValue(rememberedValue);
        }
        final com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.RuntimePermissionHelper runtimePermissionHelper = (com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.RuntimePermissionHelper) rememberedValue;
        androidx.activity.result.contract.ActivityResultContracts.RequestPermission requestPermission = new androidx.activity.result.contract.ActivityResultContracts.RequestPermission();
        boolean changedInstance = composer.changedInstance(runtimePermissionHelper);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.RuntimePermissionHelperKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.RuntimePermissionHelperKt.m15106$r8$lambda$9m8ZrjqRvwktIwa7KtOA87lYeA(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.RuntimePermissionHelper.this, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        runtimePermissionHelper.setPermissionLauncher$identity_prodRelease(androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (kotlin.jvm.functions.Function1) rememberedValue2, composer, 0));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return runtimePermissionHelper;
    }

    /* renamed from: $r8$lambda$9m8Zrjq-RvwktIwa7KtOA87lYeA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15106$r8$lambda$9m8ZrjqRvwktIwa7KtOA87lYeA(com.paypal.oslo.feature.identity.challenges.stepupwebview.ui.RuntimePermissionHelper runtimePermissionHelper, boolean z) {
        runtimePermissionHelper.onPermissionResult$identity_prodRelease(z);
        return kotlin.Unit.INSTANCE;
    }
}
