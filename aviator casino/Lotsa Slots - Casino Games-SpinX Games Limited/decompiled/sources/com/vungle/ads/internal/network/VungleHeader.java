package com.vungle.ads.internal.network;

/* compiled from: VungleHeader.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\u0006\u0010\u0010\u001a\u00020\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/vungle/ads/internal/network/VungleHeader;", "", "()V", com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, "", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "appVersion", "getAppVersion", "setAppVersion", "headerUa", "getHeaderUa", "setHeaderUa", "defaultHeader", "reset", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class VungleHeader {
    public static final com.vungle.ads.internal.network.VungleHeader INSTANCE;
    private static java.lang.String appId;
    private static java.lang.String appVersion;
    private static java.lang.String headerUa;

    private VungleHeader() {
    }

    static {
        com.vungle.ads.internal.network.VungleHeader vungleHeader = new com.vungle.ads.internal.network.VungleHeader();
        INSTANCE = vungleHeader;
        headerUa = vungleHeader.defaultHeader();
    }

    public final java.lang.String getHeaderUa() {
        return headerUa;
    }

    public final void setHeaderUa(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        headerUa = str;
    }

    public final java.lang.String getAppId() {
        return appId;
    }

    public final void setAppId(java.lang.String str) {
        appId = str;
    }

    public final java.lang.String getAppVersion() {
        return appVersion;
    }

    public final void setAppVersion(java.lang.String str) {
        appVersion = str;
    }

    private final java.lang.String defaultHeader() {
        return (kotlin.jvm.internal.Intrinsics.areEqual("Amazon", android.os.Build.MANUFACTURER) ? "VungleAmazon/" : "VungleDroid/").concat(com.vungle.ads.BuildConfig.VERSION_NAME);
    }

    public final void reset() {
        headerUa = defaultHeader();
    }
}
