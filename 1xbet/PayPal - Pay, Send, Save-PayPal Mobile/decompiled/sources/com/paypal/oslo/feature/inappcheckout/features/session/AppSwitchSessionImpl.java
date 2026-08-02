package com.paypal.oslo.feature.inappcheckout.features.session;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u0000 J2\u00020\u0001:\u0001JB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0014\u0010!\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010(\u001a\u0004\u0018\u00010%8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010 R\u0016\u0010,\u001a\u0004\u0018\u00010\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010 R\u0016\u0010/\u001a\u0004\u0018\u00010\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u00101\u001a\u0004\u0018\u00010\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u0010 R\u0016\u00103\u001a\u0004\u0018\u00010\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010 R\u0016\u00106\u001a\u0004\u0018\u00010\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u00108\u001a\u0004\u0018\u00010\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010 R\u0016\u0010:\u001a\u0004\u0018\u00010\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u0010 R\u0016\u0010>\u001a\u0004\u0018\u00010;8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010 R\u0016\u0010A\u001a\u0004\u0018\u00010\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010 R\u0016\u0010C\u001a\u0004\u0018\u00010\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010 R\u0014\u0010E\u001a\u00020D8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020D8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010FR\u0014\u0010H\u001a\u00020D8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0014\u0010I\u001a\u00020D8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010F"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSessionImpl;", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Valid;", "universalLinkData", "", "setup", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Valid;)V", "", "triggerApp", "setTriggerApp", "(Ljava/lang/String;)V", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutPreferences;", "checkoutPreferences", "setCheckoutPreferences", "(Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutPreferences;)V", "clear", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/UniversalLinkData$Valid;", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;", "getSessionId", "()Ljava/lang/String;", "sessionId", "getMerchantIntegrationChannel", "()Lcom/paypal/oslo/feature/inappcheckout/features/merchantUpgrade/MerchantIntegration$ApiIntegration;", "merchantIntegrationChannel", "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;", "getCheckoutToken", "()Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutToken;", "checkoutToken", "getCheckoutTokenValueOrEmpty", "checkoutTokenValueOrEmpty", "getSource", "source", "getCheckoutURLs", "()Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.CHECKOUT_URLS_KEY, "getInitiatedTime", "initiatedTime", "getButtonSessionId", "buttonSessionId", "getMerchantDetails", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/MerchantDetails;", "merchantDetails", "getFlowType", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "getMerchantPath", "merchantPath", "Landroid/net/Uri;", "getUniversalLinkUri", "()Landroid/net/Uri;", "universalLinkUri", "getTriggerApp", "getSdkIntegrationMethodOrNull", "sdkIntegrationMethodOrNull", "getExperiment", "experiment", "", "isMerchantUpgradePath", "()Z", "isNoMerchantUpgradePath", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.IS_TOKEN_SET_KEY, "isWebAppSdkIntegrationMethod", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AppSwitchSessionImpl implements com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession {

    @java.lang.Deprecated
    public static final java.lang.String WEB_SDK_INTEGRATION_TYPE = "web_sdk";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.lang.String Camera2StreamConfigurationMap;
    private com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration getHighResolutionOutputSizeshNQ4ISI;
    private static final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSessionImpl.Companion Companion = new com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSessionImpl.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public AppSwitchSessionImpl() {
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    public final void setup(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid universalLinkData) {
        this.getHighSpeedVideoFpsRangesFor = universalLinkData;
        java.lang.String merchant = universalLinkData != null ? universalLinkData.getMerchant() : null;
        if (this.getHighSpeedVideoSizes != null || merchant == null) {
            return;
        }
        this.getHighSpeedVideoSizes = new com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails(merchant, null, null, 6, null);
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    public final void setTriggerApp(java.lang.String triggerApp) {
        this.Camera2StreamConfigurationMap = triggerApp;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    public final void setCheckoutPreferences(com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutPreferences checkoutPreferences) {
        java.lang.String id;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutPreferences, "");
        this.getHighSpeedVideoFpsRanges = checkoutPreferences.getCheckoutURLs();
        this.getHighResolutionOutputSizeshNQ4ISI = checkoutPreferences.getApiMerchantIntegrationChannel();
        com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails = checkoutPreferences.getMerchantDetails();
        if (merchantDetails != null) {
            com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails merchantDetails2 = this.getHighSpeedVideoSizes;
            if (merchantDetails2 == null || (id = merchantDetails2.getId()) == null) {
                id = merchantDetails.getId();
            }
            this.getHighSpeedVideoSizes = new com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails(merchantDetails.getName(), id, merchantDetails.getLogo());
        }
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    public final java.lang.String getSessionId() {
        java.lang.String token;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid = this.getHighSpeedVideoFpsRangesFor;
        return (valid == null || (token = valid.getToken()) == null) ? "unknown" : token;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    public final com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration getMerchantIntegrationChannel() {
        com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration apiIntegration = this.getHighResolutionOutputSizeshNQ4ISI;
        return apiIntegration == null ? com.paypal.oslo.feature.inappcheckout.features.merchantUpgrade.MerchantIntegration.ApiIntegration.NativeApp.INSTANCE : apiIntegration;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken getCheckoutToken() {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid = this.getHighSpeedVideoFpsRangesFor;
        if (valid != null) {
            return valid.getCheckoutToken();
        }
        return null;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    public final java.lang.String getCheckoutTokenValueOrEmpty() {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutToken checkoutToken;
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String value = (valid == null || (checkoutToken = valid.getCheckoutToken()) == null) ? null : checkoutToken.getValue();
        return value == null ? "" : value;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    public final java.lang.String getSource() {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid = this.getHighSpeedVideoFpsRangesFor;
        if (valid != null) {
            return valid.getSource();
        }
        return null;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    /* renamed from: getCheckoutURLs, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    public final java.lang.String getInitiatedTime() {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid = this.getHighSpeedVideoFpsRangesFor;
        if (valid != null) {
            return valid.getSwitchInitiatedTime();
        }
        return null;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    public final java.lang.String getButtonSessionId() {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid = this.getHighSpeedVideoFpsRangesFor;
        if (valid != null) {
            return valid.getButtonSessionId();
        }
        return null;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    /* renamed from: getMerchantDetails, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.model.MerchantDetails getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    public final java.lang.String getFlowType() {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid = this.getHighSpeedVideoFpsRangesFor;
        if (valid != null) {
            return valid.getFlowType();
        }
        return null;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    public final java.lang.String getMerchantPath() {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid = this.getHighSpeedVideoFpsRangesFor;
        if (valid != null) {
            return valid.getMerchantPath();
        }
        return null;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    public final android.net.Uri getUniversalLinkUri() {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid = this.getHighSpeedVideoFpsRangesFor;
        if (valid != null) {
            return valid.getUniversalLink();
        }
        return null;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    /* renamed from: getTriggerApp, reason: from getter */
    public final java.lang.String getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    public final java.lang.String getSdkIntegrationMethodOrNull() {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid = this.getHighSpeedVideoFpsRangesFor;
        if (valid != null) {
            return valid.getIntegrationType();
        }
        return null;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    public final java.lang.String getExperiment() {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid = this.getHighSpeedVideoFpsRangesFor;
        if (valid != null) {
            return valid.getExperiment();
        }
        return null;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    public final boolean isMerchantUpgradePath() {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid = this.getHighSpeedVideoFpsRangesFor;
        return valid != null && valid.isMerchantUpgradePath();
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    public final boolean isNoMerchantUpgradePath() {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid = this.getHighSpeedVideoFpsRangesFor;
        return valid != null && valid.isNoMerchantUpgradePath();
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    public final boolean isTokenSet() {
        com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.UniversalLinkData.Valid valid = this.getHighSpeedVideoFpsRangesFor;
        return (valid != null ? valid.getCheckoutToken() : null) != null;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    public final boolean isWebAppSdkIntegrationMethod() {
        java.lang.String sdkIntegrationMethodOrNull = getSdkIntegrationMethodOrNull();
        if (sdkIntegrationMethodOrNull != null) {
            return sdkIntegrationMethodOrNull.equals(WEB_SDK_INTEGRATION_TYPE);
        }
        return false;
    }

    @Override // com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession
    public final void clear() {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.getHighSpeedVideoSizes = null;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSessionImpl$Companion;", "", "<init>", "()V", "", "WEB_SDK_INTEGRATION_TYPE", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
