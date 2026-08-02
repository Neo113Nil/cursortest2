package com.paypal.oslo.app.config;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/app/config/SecureWebViewAppConfigProvider;", "Lcom/paypal/oslo/core/webview/config/SecureWebViewAppConfig;", "Lcom/paypal/oslo/app/config/SSLConfig;", "sslConfig", "<init>", "(Lcom/paypal/oslo/app/config/SSLConfig;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/app/config/SSLConfig;", "getHighSpeedVideoFpsRanges", "", "getVerifySslCert", "()Z", "verifySslCert"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SecureWebViewAppConfigProvider implements com.paypal.oslo.core.webview.config.SecureWebViewAppConfig {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.app.config.SSLConfig getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public SecureWebViewAppConfigProvider(com.paypal.oslo.app.config.SSLConfig sSLConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sSLConfig, "");
        this.getHighSpeedVideoFpsRanges = sSLConfig;
    }

    @Override // com.paypal.oslo.core.webview.config.SecureWebViewAppConfig
    public final boolean getVerifySslCert() {
        return this.getHighSpeedVideoFpsRanges.getVerifySslCert().getValue().booleanValue();
    }
}
