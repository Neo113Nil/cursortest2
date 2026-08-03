package com.unity3d.services.core.properties;

/* loaded from: classes6.dex */
public class ClientProperties {
    private static final javax.security.auth.x500.X500Principal DEBUG_CERT = new javax.security.auth.x500.X500Principal("CN=Android Debug,O=Android,C=US");
    private static java.lang.ref.WeakReference<android.app.Activity> _activity;
    private static android.app.Application _application;
    private static android.content.Context _applicationContext;
    private static java.lang.String _gameId;
    private static java.lang.String _previousGameId;

    public static android.app.Activity getActivity() {
        return _activity.get();
    }

    public static void setActivity(android.app.Activity activity) {
        _activity = new java.lang.ref.WeakReference<>(activity);
    }

    public static android.content.Context getApplicationContext() {
        return _applicationContext;
    }

    public static void setApplicationContext(android.content.Context context) {
        _applicationContext = context;
    }

    public static android.app.Application getApplication() {
        return _application;
    }

    public static void setApplication(android.app.Application application) {
        _application = application;
    }

    public static java.lang.String getGameId() {
        return _gameId;
    }

    public static void setGameId(java.lang.String str) {
        _previousGameId = _gameId;
        _gameId = str;
    }

    public static java.lang.String getPreviousGameId() {
        return _previousGameId;
    }

    public static java.lang.String getAppName() {
        android.content.Context context = _applicationContext;
        return context == null ? "" : context.getPackageName();
    }

    public static java.lang.String getAppVersion() {
        java.lang.String packageName = getApplicationContext().getPackageName();
        android.content.pm.PackageManager packageManager = getApplicationContext().getPackageManager();
        try {
            if (packageManager.getPackageInfo(packageName, 0).versionName == null) {
                return com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.APP_VERSION_FAKE;
            }
            return packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            com.unity3d.services.core.log.DeviceLog.exception("Error getting package info", e);
            return null;
        }
    }

    public static boolean isAppDebuggable() {
        boolean z;
        if (getApplicationContext() == null) {
            return false;
        }
        android.content.pm.PackageManager packageManager = getApplicationContext().getPackageManager();
        java.lang.String packageName = getApplicationContext().getPackageName();
        try {
            android.content.pm.ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            int i = applicationInfo.flags & 2;
            applicationInfo.flags = i;
            z = i != 0;
            r4 = false;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            com.unity3d.services.core.log.DeviceLog.exception("Could not find name", e);
            z = false;
        }
        if (r4) {
            try {
                for (android.content.pm.Signature signature : packageManager.getPackageInfo(packageName, 64).signatures) {
                    z = ((java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new java.io.ByteArrayInputStream(signature.toByteArray()))).getSubjectX500Principal().equals(DEBUG_CERT);
                    if (z) {
                        break;
                    }
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                com.unity3d.services.core.log.DeviceLog.exception("Could not find name", e2);
            } catch (java.security.cert.CertificateException e3) {
                com.unity3d.services.core.log.DeviceLog.exception("Certificate exception", e3);
            }
        }
        return z;
    }
}
