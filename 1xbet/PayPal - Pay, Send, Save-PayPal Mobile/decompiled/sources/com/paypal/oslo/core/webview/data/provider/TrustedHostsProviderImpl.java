package com.paypal.oslo.core.webview.data.provider;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/webview/data/provider/TrustedHostsProviderImpl;", "Lcom/paypal/oslo/core/webview/domain/provider/TrustedHostsProvider;", "<init>", "()V", "Lcom/paypal/oslo/core/webview/domain/models/TrustedHosts;", "getTrustedHosts", "()Lcom/paypal/oslo/core/webview/domain/models/TrustedHosts;", "", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "", "getHighSpeedVideoSizes", "Ljava/util/Set;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TrustedHostsProviderImpl implements com.paypal.oslo.core.webview.domain.provider.TrustedHostsProvider {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.List<java.lang.String> getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"paypal.com", "paypal.biz", "paypal.me", "paypalobjects.com", "paypalbalance.com", "venmo.com", "xoom.com"});
    private final java.util.Set<java.lang.String> getHighSpeedVideoSizes = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"paypal.syf.com", "paypalcredit.syf.com", "auth.syf.com", "www.synchronybankterms.com", "www.synchronycredit.com", "ppc.synchronycredit.com", "www.synchrony.com", "www.onlinecreditcenter6.com", "www.mastercard.us", "www.fdic.gov", "www.irs.gov", "uat.synchronycredit.com", "uat4.synchronycredit.com", "uat-ppc.synchronycredit.com", "uat.onlinecreditcenter6.com", "auth-uat.syf.com", "my.loanbuilder.com", "tink.com", "tink.se"});

    @javax.inject.Inject
    public TrustedHostsProviderImpl() {
    }

    @Override // com.paypal.oslo.core.webview.domain.provider.TrustedHostsProvider
    public final com.paypal.oslo.core.webview.domain.models.TrustedHosts getTrustedHosts() {
        return new com.paypal.oslo.core.webview.domain.models.TrustedHosts(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
    }
}
