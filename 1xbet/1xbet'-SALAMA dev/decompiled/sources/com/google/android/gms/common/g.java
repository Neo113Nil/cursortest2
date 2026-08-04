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
import com.salamadev.nabilalawadi.kisaskoran.R;
import io.sentry.SentryBaseEvent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
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
    public static void ensurePlayServicesAvailable(Context context, int i7) throws e, f {
        d dVar = d.f11217b;
        int iD = dVar.d(context, i7);
        if (iD != 0) {
            Intent intentA = dVar.a(context, iD, "e");
            L.k(iD, "GooglePlayServices not available due to error ", "GooglePlayServicesUtil");
            if (intentA != null) {
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
        PackageInfo packageInfoT;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            packageInfoT = p097n3.c.a(context).t(128, context.getPackageName());
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfoT = null;
        }
        if (packageInfoT == null || (applicationInfo = packageInfoT.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
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
                PackageInfo packageInfoT = p097n3.c.a(context).t(64, "com.google.android.gms");
                h.a(context);
                if (packageInfoT == null || h.c(packageInfoT, false) || !h.c(packageInfoT, true)) {
                    zzb = false;
                } else {
                    zzb = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e7) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e7);
        } finally {
            zza = true;
        }
        return zzb || !SentryBaseEvent.JsonKeys.USER.equals(Build.TYPE);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x0137  */
    /* JADX WARN: Code duplicated, block: B:80:0x015e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0160  */
    /* JADX WARN: Code duplicated, block: B:84:0x0165  */
    /* JADX WARN: Code duplicated, block: B:86:0x0169  */
    /* JADX WARN: Code duplicated, block: B:87:0x018e  */
    /* JADX WARN: Code duplicated, block: B:95:0x01ae A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x01b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:99:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:86:0x0169, please report this as an issue */
    public static int isGooglePlayServicesAvailable(Context context, int i7) {
        boolean z4;
        PackageInfo packageInfo;
        int i8;
        int i9;
        ApplicationInfo applicationInfo;
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
                            Bundle bundle = p097n3.c.a(context).q(128, context.getPackageName()).metaData;
                            if (bundle != null) {
                                bundle.getString("com.google.app.id");
                                D.f11238c = bundle.getInt("com.google.android.gms.version");
                            }
                        } catch (PackageManager.NameNotFoundException e7) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e7);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i10 = D.f11238c;
            if (i10 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i10 != GOOGLE_PLAY_SERVICES_VERSION_CODE) {
                throw new GooglePlayServicesIncorrectManifestValueException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + d.f11216a + " but found " + i10 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        if (p090m3.c.m(context)) {
            z4 = false;
        } else {
            if (p090m3.c.f15260f == null) {
                p090m3.c.f15260f = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (p090m3.c.f15260f.booleanValue()) {
                z4 = false;
            } else {
                z4 = true;
            }
        }
        D.b(i7 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z4) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            h.a(context);
            if (!h.c(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (!z4) {
                    if (z4) {
                    }
                    i8 = packageInfo2.versionCode;
                    if (i8 == -1) {
                        i9 = -1;
                    } else {
                        i9 = i8 / zzbbd.zzq.zzf;
                    }
                    if (i9 >= (i7 != -1 ? i7 / zzbbd.zzq.zzf : -1)) {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        }
                        if (applicationInfo.enabled) {
                            return 0;
                        }
                        return 3;
                    }
                    Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i7 + " but found " + i8);
                    return 2;
                }
                D.i(packageInfo);
                if (!h.c(packageInfo, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else {
                    if (z4 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        i8 = packageInfo2.versionCode;
                        if (i8 == -1) {
                            i9 = -1;
                        } else {
                            i9 = i8 / zzbbd.zzq.zzf;
                        }
                        if (i9 >= (i7 != -1 ? i7 / zzbbd.zzq.zzf : -1)) {
                            Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i7 + " but found " + i8);
                            return 2;
                        }
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e8) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e8);
                                return 1;
                            }
                        }
                        if (applicationInfo.enabled) {
                            return 3;
                        }
                        return 0;
                    }
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    @Deprecated
    public static boolean isGooglePlayServicesUid(Context context, int i7) {
        return p090m3.c.j(context, i7);
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
        return p090m3.c.q(context);
    }

    @Deprecated
    public static boolean uidHasPackageName(Context context, int i7, String str) {
        return p090m3.c.o(context, i7, str);
    }

    public static boolean zza(Context context, String str) throws PackageManager.NameNotFoundException {
        boolean zEquals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (zEquals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !isRestrictedUserProfile(context);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
    }
}
