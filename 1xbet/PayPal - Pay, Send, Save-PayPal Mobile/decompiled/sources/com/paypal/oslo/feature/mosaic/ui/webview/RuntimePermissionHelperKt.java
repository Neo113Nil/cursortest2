package com.paypal.oslo.feature.mosaic.ui.webview;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/webview/RuntimePermissionHelper;", "rememberRuntimePermissionHelper", "(Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/mosaic/ui/webview/RuntimePermissionHelper;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RuntimePermissionHelperKt {
    public static final com.paypal.oslo.feature.mosaic.ui.webview.RuntimePermissionHelper rememberRuntimePermissionHelper(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1230237088, i, -1, "com.paypal.oslo.feature.mosaic.ui.webview.rememberRuntimePermissionHelper (RuntimePermissionHelper.kt:127)");
        }
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new com.paypal.oslo.feature.mosaic.ui.webview.RuntimePermissionHelper(null, null, 3, null);
            composer.updateRememberedValue(rememberedValue);
        }
        final com.paypal.oslo.feature.mosaic.ui.webview.RuntimePermissionHelper runtimePermissionHelper = (com.paypal.oslo.feature.mosaic.ui.webview.RuntimePermissionHelper) rememberedValue;
        androidx.activity.result.contract.ActivityResultContracts.RequestPermission requestPermission = new androidx.activity.result.contract.ActivityResultContracts.RequestPermission();
        boolean changedInstance = composer.changedInstance(runtimePermissionHelper);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.RuntimePermissionHelperKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.mosaic.ui.webview.RuntimePermissionHelperKt.$r8$lambda$G1pKC1UJxjhriwySNKBLXjYDSzY(com.paypal.oslo.feature.mosaic.ui.webview.RuntimePermissionHelper.this, ((java.lang.Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        runtimePermissionHelper.setSinglePermissionLauncher$mosaic_prodRelease(androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (kotlin.jvm.functions.Function1) rememberedValue2, composer, 0));
        androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions requestMultiplePermissions = new androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions();
        boolean changedInstance2 = composer.changedInstance(runtimePermissionHelper);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.mosaic.ui.webview.RuntimePermissionHelperKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.mosaic.ui.webview.RuntimePermissionHelperKt.$r8$lambda$rzXMM0xyxvkVqugJoTF6pESsidQ(com.paypal.oslo.feature.mosaic.ui.webview.RuntimePermissionHelper.this, (java.util.Map) obj);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        runtimePermissionHelper.setMultiplePermissionsLauncher$mosaic_prodRelease(androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(requestMultiplePermissions, (kotlin.jvm.functions.Function1) rememberedValue3, composer, 0));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return runtimePermissionHelper;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$G1pKC1UJxjhriwySNKBLXjYDSzY(com.paypal.oslo.feature.mosaic.ui.webview.RuntimePermissionHelper runtimePermissionHelper, boolean z) {
        runtimePermissionHelper.onSinglePermissionResult$mosaic_prodRelease(z);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rzXMM0xyxvkVqugJoTF6pESsidQ(com.paypal.oslo.feature.mosaic.ui.webview.RuntimePermissionHelper runtimePermissionHelper, java.util.Map map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        runtimePermissionHelper.onMultiplePermissionsResult$mosaic_prodRelease(map);
        return kotlin.Unit.INSTANCE;
    }
}
