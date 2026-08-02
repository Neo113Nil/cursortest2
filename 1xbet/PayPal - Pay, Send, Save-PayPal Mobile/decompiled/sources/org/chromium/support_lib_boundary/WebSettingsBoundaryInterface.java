package org.chromium.support_lib_boundary;

@org.jspecify.annotations.NullMarked
/* loaded from: classes18.dex */
public interface WebSettingsBoundaryInterface {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface AttributionBehavior {
        public static final int APP_SOURCE_AND_APP_TRIGGER = 3;
        public static final int APP_SOURCE_AND_WEB_TRIGGER = 1;
        public static final int DISABLED = 0;
        public static final int WEB_SOURCE_AND_WEB_TRIGGER = 2;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ForceDarkBehavior {
        public static final int FORCE_DARK_ONLY = 0;
        public static final int MEDIA_QUERY_ONLY = 1;
        public static final int PREFER_MEDIA_QUERY_OVER_FORCE_DARK = 2;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface HyperlinkContextMenuItems {
        public static final int COPY_LINK_ADDRESS = 1;
        public static final int COPY_LINK_TEXT = 2;
        public static final int DISABLED = 0;
        public static final int OPEN_LINK = 4;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface SpeculativeLoadingStatus {
        public static final int DISABLED = 0;
        public static final int PRERENDER_ENABLED = 1;
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface WebViewMediaIntegrityApiStatus {
        public static final int DISABLED = 0;
        public static final int ENABLED = 2;
        public static final int ENABLED_WITHOUT_APP_IDENTITY = 1;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface WebauthnSupport {
        public static final int APP = 1;
        public static final int BROWSER = 2;
        public static final int NONE = 0;
    }

    int getAttributionBehavior();

    boolean getBackForwardCacheEnabled();

    java.lang.reflect.InvocationHandler getBackForwardCacheSettings();

    int getDisabledActionModeMenuItems();

    boolean getEnterpriseAuthenticationAppLinkPolicyEnabled();

    int getForceDark();

    int getForceDarkBehavior();

    boolean getHasEnrolledInstrumentEnabled();

    boolean getIncludeCookiesOnIntercept();

    boolean getOffscreenPreRaster();

    boolean getPaymentRequestEnabled();

    boolean getSafeBrowsingEnabled();

    int getSpeculativeLoadingStatus();

    java.util.Map<java.lang.String, java.lang.Object> getUserAgentMetadataMap();

    int getWebViewMediaIntegrityApiDefaultStatus();

    java.util.Map<java.lang.String, java.lang.Integer> getWebViewMediaIntegrityApiOverrideRules();

    int getWebauthnSupport();

    boolean getWillSuppressErrorPage();

    boolean isAlgorithmicDarkeningAllowed();

    void setAlgorithmicDarkeningAllowed(boolean z);

    void setAttributionBehavior(int i);

    void setBackForwardCacheEnabled(boolean z);

    void setBackForwardCacheSettings(java.lang.reflect.InvocationHandler invocationHandler);

    void setDisabledActionModeMenuItems(int i);

    void setEnterpriseAuthenticationAppLinkPolicyEnabled(boolean z);

    void setForceDark(int i);

    void setForceDarkBehavior(int i);

    void setHasEnrolledInstrumentEnabled(boolean z);

    void setHyperlinkContextMenuItems(int i);

    void setIncludeCookiesOnIntercept(boolean z);

    void setOffscreenPreRaster(boolean z);

    void setPaymentRequestEnabled(boolean z);

    void setSafeBrowsingEnabled(boolean z);

    void setSpeculativeLoadingStatus(int i);

    void setUserAgentMetadataFromMap(java.util.Map<java.lang.String, java.lang.Object> map);

    void setWebViewMediaIntegrityApiStatus(int i, java.util.Map<java.lang.String, java.lang.Integer> map);

    void setWebauthnSupport(int i);

    void setWillSuppressErrorPage(boolean z);
}
