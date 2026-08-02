package com.paypal.oslo.feature.packagetracking.ui.settings;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class PackageSettingsScreenKt$WebViewOverlay$1$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration> {
    public static final com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenKt$WebViewOverlay$1$1$1 getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsScreenKt$WebViewOverlay$1$1$1();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration invoke(java.lang.String str) {
        java.lang.String str2 = str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsWebViewOverlayKt.createPackageSettingsWebViewConfig(str2);
    }

    PackageSettingsScreenKt$WebViewOverlay$1$1$1() {
        super(1, com.paypal.oslo.feature.packagetracking.ui.settings.PackageSettingsWebViewOverlayKt.class, "createPackageSettingsWebViewConfig", "createPackageSettingsWebViewConfig(Ljava/lang/String;)Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", 1);
    }
}
