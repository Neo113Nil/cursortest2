package androidx.webkit;

/* loaded from: classes2.dex */
public interface Profile {
    public static final java.lang.String DEFAULT_PROFILE_NAME = "Default";

    android.webkit.CookieManager getCookieManager();

    android.webkit.GeolocationPermissions getGeolocationPermissions();

    java.lang.String getName();

    android.webkit.ServiceWorkerController getServiceWorkerController();

    android.webkit.WebStorage getWebStorage();
}
