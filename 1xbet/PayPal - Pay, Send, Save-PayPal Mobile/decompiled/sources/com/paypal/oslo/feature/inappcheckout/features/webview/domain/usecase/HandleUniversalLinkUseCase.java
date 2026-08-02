package com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/usecase/HandleUniversalLinkUseCase;", "", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "appSwitchSession", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "analyticsTracer", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;)V", "Landroid/content/Intent;", "intent", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;", "invoke", "(Landroid/content/Intent;)Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData;", "", "reset$inappcheckout_prodRelease", "()V", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/features/analytics/AnalyticsTracer;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/concurrent/atomic/AtomicReference;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HandleUniversalLinkUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicReference<com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData> getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public HandleUniversalLinkUseCase(com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession, com.paypal.oslo.feature.inappcheckout.features.analytics.AnalyticsTracer analyticsTracer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsTracer, "");
        this.getHighResolutionOutputSizeshNQ4ISI = appSwitchSession;
        this.getHighSpeedVideoFpsRangesFor = analyticsTracer;
        this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicReference<>(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData invoke(android.content.Intent intent) {
        android.net.Uri data;
        java.lang.String str;
        java.lang.String str2;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ECToken eCToken;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken;
        java.lang.String str3;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Unknown unknown;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData universalLinkData;
        if (intent == null || (data = intent.getData()) == null) {
            return new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Unknown(null, null, null, null, 15, null);
        }
        java.lang.String stringExtra = intent.getStringExtra("com.android.browser.application_id");
        this.getHighSpeedVideoFpsRangesFor.trackDeeplinkReceived(data);
        java.lang.String queryParameter = data.getQueryParameter(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.Source.getValue());
        java.lang.String queryParameter2 = data.getQueryParameter(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.SwitchInitiatedTime.getValue());
        java.lang.String queryParameter3 = data.getQueryParameter(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.IntegrationType.getValue());
        java.lang.String queryParameter4 = data.getQueryParameter(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.ButtonSessionId.getValue());
        java.lang.String queryParameter5 = data.getQueryParameter(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.Merchant.getValue());
        java.lang.String queryParameter6 = data.getQueryParameter(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.FlowType.getValue());
        java.lang.String queryParameter7 = data.getQueryParameter(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.FundingSourceCamelCase.getValue());
        if (queryParameter7 == null && (queryParameter7 = data.getQueryParameter(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.FundingSourceSnakeCase.getValue())) == null) {
            queryParameter7 = "paypal";
        }
        java.lang.String str4 = queryParameter7;
        java.lang.String queryParameter8 = data.getQueryParameter(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.TokenType.getValue());
        java.lang.String queryParameter9 = data.getQueryParameter(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.ReferrerURL.getValue());
        boolean booleanQueryParameter = data.getBooleanQueryParameter(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.AppSwitchEligible.getValue(), false);
        java.lang.String queryParameter10 = data.getQueryParameter(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.Environment.getValue());
        java.lang.String queryParameter11 = data.getQueryParameter(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.Experiment.getValue());
        java.lang.String queryParameter12 = data.getQueryParameter(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.MerchantPath.getValue());
        android.net.Uri data2 = intent.getData();
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.VaultSetupToken vaultSetupToken = null;
        if (data2 != null) {
            str = queryParameter11;
            java.lang.String queryParameter13 = data2.getQueryParameter(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.BAToken.getValue());
            str2 = stringExtra;
            java.lang.String queryParameter14 = data2.getQueryParameter(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.Token.getValue());
            java.lang.String queryParameter15 = data2.getQueryParameter(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.ApprovalSessionId.getValue());
            java.lang.String str5 = queryParameter13;
            if (str5 == null || kotlin.text.StringsKt.isBlank(str5)) {
                java.lang.String str6 = queryParameter14;
                if (str6 == null || kotlin.text.StringsKt.isBlank(str6)) {
                    java.lang.String str7 = queryParameter15;
                    if (str7 != null && !kotlin.text.StringsKt.isBlank(str7)) {
                        vaultSetupToken = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.VaultSetupToken(queryParameter15);
                    }
                } else {
                    eCToken = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.ECToken(queryParameter14);
                }
            } else {
                eCToken = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.BAToken(queryParameter13);
            }
            checkoutToken = eCToken;
            if (checkoutToken == null) {
                str3 = str2;
                unknown = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid(data, checkoutToken, queryParameter, queryParameter2, queryParameter4, queryParameter3, queryParameter5, queryParameter6, str4, queryParameter8, queryParameter9, booleanQueryParameter, queryParameter10, str, queryParameter12);
            } else {
                str3 = str2;
                unknown = new com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Unknown(data, queryParameter, queryParameter2, str);
            }
            universalLinkData = this.getHighSpeedVideoSizes.get();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(unknown, universalLinkData) || !com.paypal.oslo.feature.inappcheckout.features.webview.domain.usecase.HandleUniversalLinkUseCase$$ExternalSyntheticBackportWithForwarding0.m(this.getHighSpeedVideoSizes, universalLinkData, unknown)) {
                unknown = com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.AlreadyHandled.INSTANCE;
            } else if (unknown instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid) {
                this.getHighResolutionOutputSizeshNQ4ISI.setup((com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid) unknown);
                this.getHighResolutionOutputSizeshNQ4ISI.setTriggerApp(str3);
            }
            if (!(unknown instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.AlreadyHandled)) {
                this.getHighSpeedVideoFpsRangesFor.trackInboundLinkResolved();
            }
            return unknown;
        }
        str = queryParameter11;
        str2 = stringExtra;
        checkoutToken = vaultSetupToken;
        if (checkoutToken == null) {
        }
        universalLinkData = this.getHighSpeedVideoSizes.get();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(unknown, universalLinkData)) {
        }
        unknown = com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.AlreadyHandled.INSTANCE;
        if (!(unknown instanceof com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.AlreadyHandled)) {
        }
        return unknown;
    }

    public final void reset$inappcheckout_prodRelease() {
        this.getHighSpeedVideoSizes.set(null);
    }
}
