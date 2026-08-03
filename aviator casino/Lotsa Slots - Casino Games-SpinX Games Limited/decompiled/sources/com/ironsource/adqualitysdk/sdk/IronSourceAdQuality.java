package com.ironsource.adqualitysdk.sdk;

/* loaded from: classes5.dex */
public abstract class IronSourceAdQuality {
    public static final java.lang.String TAG = "ISAdQuality Agent SDK";
    public static final java.lang.String VERSION = "9.4.0";

    public abstract void changeUserId(java.lang.String str);

    public abstract void initialize(android.content.Context context, java.lang.String str);

    public abstract void initialize(android.content.Context context, java.lang.String str, com.ironsource.adqualitysdk.sdk.ISAdQualityConfig iSAdQualityConfig);

    public abstract void sendCustomMediationRevenue(com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue);

    public abstract void setAdListener(com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener iSAdQualityAdListener);

    public abstract void setConfig(com.ironsource.adqualitysdk.sdk.ISAdQualityConfig iSAdQualityConfig);

    public abstract void setSegment(com.ironsource.adqualitysdk.sdk.ISAdQualitySegment iSAdQualitySegment);

    @java.lang.Deprecated
    public abstract void setUserConsent(boolean z);

    @java.lang.Deprecated
    public abstract void shutdown();

    public static com.ironsource.adqualitysdk.sdk.IronSourceAdQuality getInstance() {
        return com.ironsource.adqualitysdk.sdk.i.s.m8589();
    }

    public static java.lang.String getSDKVersion() {
        return "9.4.0";
    }
}
