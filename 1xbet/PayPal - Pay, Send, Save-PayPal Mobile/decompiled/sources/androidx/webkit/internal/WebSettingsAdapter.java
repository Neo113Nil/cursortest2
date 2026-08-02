package androidx.webkit.internal;

/* loaded from: classes7.dex */
public class WebSettingsAdapter {
    private final org.chromium.support_lib_boundary.WebSettingsBoundaryInterface getHighSpeedVideoFpsRangesFor;

    public WebSettingsAdapter(org.chromium.support_lib_boundary.WebSettingsBoundaryInterface webSettingsBoundaryInterface) {
        this.getHighSpeedVideoFpsRangesFor = webSettingsBoundaryInterface;
    }

    public void setOffscreenPreRaster(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setOffscreenPreRaster(z);
    }

    public boolean getOffscreenPreRaster() {
        return this.getHighSpeedVideoFpsRangesFor.getOffscreenPreRaster();
    }

    public void setSafeBrowsingEnabled(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setSafeBrowsingEnabled(z);
    }

    public boolean getSafeBrowsingEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.getSafeBrowsingEnabled();
    }

    public void setDisabledActionModeMenuItems(int i) {
        this.getHighSpeedVideoFpsRangesFor.setDisabledActionModeMenuItems(i);
    }

    public int getDisabledActionModeMenuItems() {
        return this.getHighSpeedVideoFpsRangesFor.getDisabledActionModeMenuItems();
    }

    public void setForceDark(int i) {
        this.getHighSpeedVideoFpsRangesFor.setForceDark(i);
    }

    public int getForceDark() {
        return this.getHighSpeedVideoFpsRangesFor.getForceDark();
    }

    public void setForceDarkStrategy(int i) {
        this.getHighSpeedVideoFpsRangesFor.setForceDarkBehavior(i);
    }

    public int getForceDarkStrategy() {
        return this.getHighSpeedVideoFpsRangesFor.getForceDarkBehavior();
    }

    public void setAlgorithmicDarkeningAllowed(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setAlgorithmicDarkeningAllowed(z);
    }

    public boolean isAlgorithmicDarkeningAllowed() {
        return this.getHighSpeedVideoFpsRangesFor.isAlgorithmicDarkeningAllowed();
    }

    public void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setEnterpriseAuthenticationAppLinkPolicyEnabled(z);
    }

    public boolean getEnterpriseAuthenticationAppLinkPolicyEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.getEnterpriseAuthenticationAppLinkPolicyEnabled();
    }

    public androidx.webkit.UserAgentMetadata getUserAgentMetadata() {
        return androidx.webkit.internal.UserAgentMetadataInternal.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor.getUserAgentMetadataMap());
    }

    public void setUserAgentMetadata(androidx.webkit.UserAgentMetadata userAgentMetadata) {
        this.getHighSpeedVideoFpsRangesFor.setUserAgentMetadataFromMap(androidx.webkit.internal.UserAgentMetadataInternal.getHighResolutionOutputSizeshNQ4ISI(userAgentMetadata));
    }

    public int getAttributionRegistrationBehavior() {
        return this.getHighSpeedVideoFpsRangesFor.getAttributionBehavior();
    }

    public void setAttributionRegistrationBehavior(int i) {
        this.getHighSpeedVideoFpsRangesFor.setAttributionBehavior(i);
    }

    public void setWebViewMediaIntegrityApiStatus(androidx.webkit.WebViewMediaIntegrityApiStatusConfig webViewMediaIntegrityApiStatusConfig) {
        this.getHighSpeedVideoFpsRangesFor.setWebViewMediaIntegrityApiStatus(webViewMediaIntegrityApiStatusConfig.getDefaultStatus(), webViewMediaIntegrityApiStatusConfig.getOverrideRules());
    }

    public androidx.webkit.WebViewMediaIntegrityApiStatusConfig getWebViewMediaIntegrityApiStatus() {
        return new androidx.webkit.WebViewMediaIntegrityApiStatusConfig.Builder(this.getHighSpeedVideoFpsRangesFor.getWebViewMediaIntegrityApiDefaultStatus()).setOverrideRules(this.getHighSpeedVideoFpsRangesFor.getWebViewMediaIntegrityApiOverrideRules()).build();
    }

    public void setWebAuthenticationSupport(int i) {
        this.getHighSpeedVideoFpsRangesFor.setWebauthnSupport(i);
    }

    public int getWebAuthenticationSupport() {
        return this.getHighSpeedVideoFpsRangesFor.getWebauthnSupport();
    }

    public void setSpeculativeLoadingStatus(int i) {
        this.getHighSpeedVideoFpsRangesFor.setSpeculativeLoadingStatus(i);
    }

    public int getSpeculativeLoadingStatus() {
        return this.getHighSpeedVideoFpsRangesFor.getSpeculativeLoadingStatus();
    }

    public void setBackForwardCacheEnabled(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setBackForwardCacheEnabled(z);
    }

    public boolean getBackForwardCacheEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.getBackForwardCacheEnabled();
    }

    public void setPaymentRequestEnabled(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setPaymentRequestEnabled(z);
    }

    public boolean getPaymentRequestEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.getPaymentRequestEnabled();
    }

    public void setHasEnrolledInstrumentEnabled(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setHasEnrolledInstrumentEnabled(z);
    }

    public boolean getHasEnrolledInstrumentEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.getHasEnrolledInstrumentEnabled();
    }

    public void setCookieAccessForShouldInterceptRequestEnabled(boolean z) {
        this.getHighSpeedVideoFpsRangesFor.setIncludeCookiesOnIntercept(z);
    }

    public boolean getCookieAccessForShouldInterceptRequestEnabled() {
        return this.getHighSpeedVideoFpsRangesFor.getIncludeCookiesOnIntercept();
    }

    public void setHyperlinkContextMenuItems(int i) {
        this.getHighSpeedVideoFpsRangesFor.setHyperlinkContextMenuItems(i);
    }

    public androidx.webkit.BackForwardCacheSettings getBackForwardCacheSettings() {
        final org.chromium.support_lib_boundary.WebViewBackForwardCacheSettingsBoundaryInterface webViewBackForwardCacheSettingsBoundaryInterface = (org.chromium.support_lib_boundary.WebViewBackForwardCacheSettingsBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.WebViewBackForwardCacheSettingsBoundaryInterface.class, this.getHighSpeedVideoFpsRangesFor.getBackForwardCacheSettings());
        androidx.webkit.BackForwardCacheSettings backForwardCacheSettings = (androidx.webkit.BackForwardCacheSettings) webViewBackForwardCacheSettingsBoundaryInterface.getOrCreatePeer(new java.util.concurrent.Callable() { // from class: androidx.webkit.internal.WebSettingsAdapter$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                java.lang.Object build;
                org.chromium.support_lib_boundary.WebViewBackForwardCacheSettingsBoundaryInterface webViewBackForwardCacheSettingsBoundaryInterface2 = org.chromium.support_lib_boundary.WebViewBackForwardCacheSettingsBoundaryInterface.this;
                build = new androidx.webkit.BackForwardCacheSettings.Builder().setMaxPagesInCache(webViewBackForwardCacheSettingsBoundaryInterface2.getMaxPagesInCache()).setTimeoutSeconds(webViewBackForwardCacheSettingsBoundaryInterface2.getTimeoutInSeconds()).build();
                return build;
            }
        });
        return backForwardCacheSettings != null ? backForwardCacheSettings : new androidx.webkit.BackForwardCacheSettings.Builder().build();
    }

    public void setBackForwardCacheSettings(androidx.webkit.BackForwardCacheSettings backForwardCacheSettings) {
        this.getHighSpeedVideoFpsRangesFor.setBackForwardCacheSettings(org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new androidx.webkit.internal.BackForwardCacheSettingsImpl(backForwardCacheSettings)));
    }
}
