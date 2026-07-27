package com.ironsource.adqualitysdk.sdk;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.i.C0932;

@Deprecated
/* loaded from: classes6.dex */
public abstract class IronSourceAdQuality {

    @Deprecated
    public static final String TAG = "ISAdQuality Agent SDK";

    @Deprecated
    public static final String VERSION = "9.8.0";

    @Deprecated
    public static IronSourceAdQuality getInstance() {
        return C0932.m5751();
    }

    @Deprecated
    public static String getSDKVersion() {
        return "9.8.0";
    }

    @Deprecated
    public abstract void changeUserId(String str);

    @Deprecated
    public abstract void initialize(Context context, String str);

    @Deprecated
    public abstract void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig);

    public abstract void initializeWithGameId(Context context, String str);

    public abstract void initializeWithGameId(Context context, String str, ISAdQualityConfig iSAdQualityConfig);

    @Deprecated
    public abstract void sendCustomMediationRevenue(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue);

    @Deprecated
    public abstract void setAdListener(ISAdQualityAdListener iSAdQualityAdListener);

    @Deprecated
    public abstract void setConfig(ISAdQualityConfig iSAdQualityConfig);

    @Deprecated
    public abstract void setMetaData(String str, String str2);

    @Deprecated
    public abstract void setSegment(ISAdQualitySegment iSAdQualitySegment);

    @Deprecated
    public abstract void setUserConsent(boolean z);

    @Deprecated
    public abstract void shutdown();
}
