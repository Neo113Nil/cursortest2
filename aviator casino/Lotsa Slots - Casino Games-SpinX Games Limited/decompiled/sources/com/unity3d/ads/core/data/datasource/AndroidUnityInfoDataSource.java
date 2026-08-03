package com.unity3d.ads.core.data.datasource;

/* compiled from: AndroidUnityInfoDataSource.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\b\u0010\n\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidUnityInfoDataSource;", "", "applicationContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "prefName", "", "getPlayerPrefId", com.ironsource.X3.i.W, "getUnityInstallationId", "getUnityMegaSessionId", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidUnityInfoDataSource {
    private final java.lang.String prefName;

    public AndroidUnityInfoDataSource(android.content.Context applicationContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.prefName = applicationContext.getPackageName() + ".v2.playerprefs";
    }

    public final java.lang.String getUnityInstallationId() {
        return getPlayerPrefId(com.unity3d.services.UnityAdsConstants.Preferences.PREF_KEY_UNITY_INSTALLATION_ID);
    }

    public final java.lang.String getUnityMegaSessionId() {
        return getPlayerPrefId(com.unity3d.services.UnityAdsConstants.Preferences.PREF_KEY_UNITY_MEGA_SESSION_ID);
    }

    private final java.lang.String getPlayerPrefId(java.lang.String key) {
        java.lang.String string = com.unity3d.services.core.preferences.AndroidPreferences.getString(this.prefName, key);
        if (string == null) {
            return null;
        }
        java.lang.String str = string;
        return kotlin.text.StringsKt.isBlank(str) ? null : str;
    }
}
