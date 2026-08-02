package com.paypal.oslo.feature.packagetracking.ui.detail;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ComposableSingletons$PackageDetailScreenKt$lambda$1176675304$1$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration> {
    public static final com.paypal.oslo.feature.packagetracking.ui.detail.ComposableSingletons$PackageDetailScreenKt$lambda$1176675304$1$1$1 getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.packagetracking.ui.detail.ComposableSingletons$PackageDetailScreenKt$lambda$1176675304$1$1$1();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ com.paypal.oslo.core.webview.ui.config.SecureWebViewConfiguration invoke(java.lang.String str) {
        java.lang.String str2 = str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailWebViewOverlayKt.createPackageDetailWebViewConfig(str2);
    }

    ComposableSingletons$PackageDetailScreenKt$lambda$1176675304$1$1$1() {
        super(1, com.paypal.oslo.feature.packagetracking.ui.detail.PackageDetailWebViewOverlayKt.class, "createPackageDetailWebViewConfig", "createPackageDetailWebViewConfig(Ljava/lang/String;)Lcom/paypal/oslo/core/webview/ui/config/SecureWebViewConfiguration;", 1);
    }
}
