package com.zettle.sdk.meta;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00128'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/meta/AppInfo;", "Lcom/zettle/sdk/meta/PlatformInfo;", "", "getAppId", "()Ljava/lang/String;", "appId", "getAppLocale", "appLocale", "getAppVersion", "appVersion", "getDeviceId", "deviceId", "Lcom/zettle/sdk/extensions/Flavor;", "getFlavor", "()Lcom/zettle/sdk/extensions/Flavor;", "flavor", "getSdkVersion", "sdkVersion", "", "getSdkVersionCode", "()I", "sdkVersionCode", "getUserAgent", "userAgent", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface AppInfo extends com.zettle.sdk.meta.PlatformInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.meta.AppInfo.Companion INSTANCE = com.zettle.sdk.meta.AppInfo.Companion.getHighResolutionOutputSizeshNQ4ISI;

    java.lang.String getAppId();

    java.lang.String getAppLocale();

    java.lang.String getAppVersion();

    java.lang.String getDeviceId();

    com.zettle.sdk.extensions.Flavor getFlavor();

    java.lang.String getSdkVersion();

    int getSdkVersionCode();

    java.lang.String getUserAgent();

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/meta/AppInfo$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.meta.AppInfo.Companion getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.meta.AppInfo.Companion();

        private Companion() {
        }
    }
}
