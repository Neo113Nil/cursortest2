package com.google.android.gms.common;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.internal.ads.zzbbd;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import io.sentry.SentryBaseEvent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import w1.L;

/* loaded from: classes.dex */
public abstract class g {
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";

    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static boolean zza = false;
    private static boolean zzb = false;

    @Deprecated
    static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    private static final AtomicBoolean zzc = new AtomicBoolean();

    @Deprecated
    public static void cancelAvailabilityErrorNotifications(Context context) {
        if (sCanceledAvailabilityNotification.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(GMS_AVAILABILITY_NOTIFICATION_ID);
            }
        } catch (SecurityException e7) {
            Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e7);
        }
    }

    public static void enableUsingApkIndependentContext() {
        zzc.set(true);
    }

    @Deprecated
    public static void ensurePlayServicesAvailable(Context context, int i7) {
        d dVar = d.f11217b;
        int d7 = dVar.d(context, i7);
        if (d7 != 0) {
            Intent a2 = dVar.a(context, d7, "e");
            L.k(d7, "GooglePlayServices not available due to error ", "GooglePlayServicesUtil");
            if (a2 != null) {
                throw new f("Google Play Services not available");
            }
            throw new e();
        }
    }

    @Deprecated
    public static int getApkVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static int getClientVersion(Context context) {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            packageInfo = n3.c.a(context).t(128, context.getPackageName());
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        if (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i7) {
        return d.f11217b.a(null, i7, null);
    }

    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean honorsDebugCertificates(Context context) {
        try {
            if (!zza) {
                try {
                    PackageInfo t7 = n3.c.a(context).t(64, "com.google.android.gms");
                    h.a(context);
                    if (t7 == null || h.c(t7, false) || !h.c(t7, true)) {
                        zzb = false;
                    } else {
                        zzb = true;
                    }
                    zza = true;
                } catch (PackageManager.NameNotFoundException e7) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e7);
                    zza = true;
                }
            }
            return zzb || !SentryBaseEvent.JsonKeys.USER.equals(Build.TYPE);
        } catch (Throwable th) {
            zza = true;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int isGooglePlayServicesAvailable(Context context, int i7) {
        boolean z4;
        String packageName;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        Bundle bundle;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !zzc.get()) {
            synchronized (D.f11236a) {
                try {
                    if (!D.f11237b) {
                        D.f11237b = true;
                        try {
                            bundle = n3.c.a(context).q(128, context.getPackageName()).metaData;
                        } catch (PackageManager.NameNotFoundException e7) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e7);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            D.f11238c = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i8 = D.f11238c;
            if (i8 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i8 != GOOGLE_PLAY_SERVICES_VERSION_CODE) {
                throw new GooglePlayServicesIncorrectManifestValueException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + d.f11216a + " but found " + i8 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        try {
            if (!m3.c.m(context)) {
                if (m3.c.f15254f == null) {
                    m3.c.f15254f = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
                }
                if (!m3.c.f15254f.booleanValue()) {
                    z4 = true;
                    D.b(i7 < 0);
                    packageName = context.getPackageName();
                    PackageManager packageManager = context.getPackageManager();
                    if (z4) {
                        packageInfo = null;
                    } else {
                        try {
                            packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                        } catch (PackageManager.NameNotFoundException unused2) {
                            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                        }
                    }
                    packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                    h.a(context);
                    if (h.c(packageInfo2, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                    } else {
                        if (z4) {
                            D.i(packageInfo);
                            if (!h.c(packageInfo, true)) {
                                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                            }
                        }
                        if (!z4 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            int i9 = packageInfo2.versionCode;
                            if ((i9 == -1 ? -1 : i9 / zzbbd.zzq.zzf) >= (i7 != -1 ? i7 / zzbbd.zzq.zzf : -1)) {
                                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                                if (applicationInfo == null) {
                                    try {
                                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                    } catch (PackageManager.NameNotFoundException e8) {
                                        Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e8);
                                        return 1;
                                    }
                                }
                                return !applicationInfo.enabled ? 3 : 0;
                            }
                            Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i7 + " but found " + i9);
                            return 2;
                        }
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                    }
                    return 9;
                }
            }
            packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            h.a(context);
            if (h.c(packageInfo2, true)) {
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
        z4 = false;
        D.b(i7 < 0);
        packageName = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        if (z4) {
        }
    }

    @Deprecated
    public static boolean isGooglePlayServicesUid(Context context, int i7) {
        return m3.c.j(context, i7);
    }

    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(Context context, int i7) {
        if (i7 == 18) {
            return true;
        }
        if (i7 == 1) {
            return zza(context, "com.google.android.gms");
        }
        return false;
    }

    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(Context context, int i7) {
        if (i7 == 9) {
            return zza(context, "com.android.vending");
        }
        return false;
    }

    public static boolean isRestrictedUserProfile(Context context) {
        Object systemService = context.getSystemService(SentryBaseEvent.JsonKeys.USER);
        D.i(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean isSidewinderDevice(Context context) {
        return m3.c.q(context);
    }

    @Deprecated
    public static boolean uidHasPackageName(Context context, int i7, String str) {
        return m3.c.o(context, i7, str);
    }

    public static boolean zza(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        return equals ? applicationInfo.enabled : applicationInfo.enabled && !isRestrictedUserProfile(context);
    }
}
