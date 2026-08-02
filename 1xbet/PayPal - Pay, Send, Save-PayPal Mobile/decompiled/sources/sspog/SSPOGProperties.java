package sspog;

/* loaded from: classes18.dex */
public interface SSPOGProperties extends my.com.softspace.common.CommonProperties {
    java.lang.String foregroundServiceContent();

    java.lang.String foregroundServiceTitle();

    java.lang.String getAccesskey();

    android.graphics.drawable.Drawable getAppIcon();

    @Override // my.com.softspace.common.CommonProperties
    java.lang.String getClientID();

    @java.lang.Deprecated
    java.lang.String getGoogleApiKey();

    default long getMinimumRefreshInterval() {
        return 180000L;
    }

    java.lang.String getPlayProjectNumber();

    long getRefreshInterval();

    java.lang.String getSecretkey();

    java.lang.Boolean isEnableAttestation();

    java.lang.Boolean isEnableSSPOGAppLifecycleService();

    default boolean isLogEnable() {
        return false;
    }
}
