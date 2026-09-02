package m0;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f8054a;

    /* renamed from: b, reason: collision with root package name */
    public static final m0.g f8055b;

    static {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = m0.i.f8056a;
        f8054a = 12451000;
        f8055b = new m0.g();
    }

    public android.content.Intent a(android.content.Context context, java.lang.String str, int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return null;
            }
            android.net.Uri fromParts = android.net.Uri.fromParts("package", "com.google.android.gms", null);
            android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && Q1.l.p(context)) {
            android.content.Intent intent2 = new android.content.Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("gcore_");
        sb.append(f8054a);
        sb.append("-");
        if (!android.text.TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                G0.b a2 = u0.C0996b.a(context);
                sb.append(a2.f556a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        java.lang.String sb2 = sb.toString();
        android.content.Intent intent3 = new android.content.Intent("android.intent.action.VIEW");
        android.net.Uri.Builder appendQueryParameter = android.net.Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!android.text.TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int b(android.content.Context context, int i2) {
        java.lang.Object[] objArr;
        android.content.pm.PackageInfo packageInfo;
        android.os.Bundle bundle;
        boolean z2 = true;
        int i3 = 0;
        java.lang.Object[] objArr2 = 0;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = m0.i.f8056a;
        try {
            context.getResources().getString(com.watchfacestudio.huasi_urx110.R.string.common_google_play_services_unknown_issue);
        } catch (java.lang.Throwable unused) {
            android.util.Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !m0.i.f8057b.get()) {
            synchronized (p0.AbstractC0966r.f8285a) {
                try {
                    if (!p0.AbstractC0966r.f8286b) {
                        p0.AbstractC0966r.f8286b = true;
                        try {
                            bundle = u0.C0996b.a(context).f556a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        } catch (android.content.pm.PackageManager.NameNotFoundException e2) {
                            android.util.Log.wtf("MetadataValueReader", "This should never happen.", e2);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            p0.AbstractC0966r.f8287c = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i4 = p0.AbstractC0966r.f8287c;
            if (i4 == 0) {
                throw new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException();
            }
            if (i4 != 12451000) {
                throw new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + f8054a + " but found " + i4 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        if (!Q1.l.p(context)) {
            if (Q1.l.f1640g == null) {
                Q1.l.f1640g = java.lang.Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (!Q1.l.f1640g.booleanValue()) {
                objArr = true;
                if (i2 >= 0) {
                    throw new java.lang.IllegalArgumentException();
                }
                java.lang.String packageName = context.getPackageName();
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                int i5 = 9;
                if (objArr == true) {
                    try {
                        packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                    } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
                        android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                    }
                } else {
                    packageInfo = null;
                }
                try {
                    android.content.pm.PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                    synchronized (m0.j.class) {
                        if (m0.j.f8059b == null) {
                            m0.m mVar = m0.q.f8071a;
                            synchronized (m0.q.class) {
                                if (m0.q.f8073c == null) {
                                    m0.q.f8073c = context.getApplicationContext();
                                } else {
                                    android.util.Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                                }
                            }
                            m0.j jVar = new m0.j(i3, (boolean) (objArr2 == true ? 1 : 0));
                            context.getApplicationContext();
                            m0.j.f8059b = jVar;
                        }
                    }
                    if (m0.j.p(packageInfo2)) {
                        if (objArr != false) {
                            p0.AbstractC0966r.c(packageInfo);
                            if (!m0.j.p(packageInfo)) {
                                android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                            }
                        }
                        if (!objArr == true || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                            int i6 = packageInfo2.versionCode;
                            if ((i6 == -1 ? -1 : i6 / io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT) < (i2 != -1 ? i2 / io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT : -1)) {
                                android.util.Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i2 + " but found " + i6);
                                i5 = 2;
                            } else {
                                android.content.pm.ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                                if (applicationInfo == null) {
                                    try {
                                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                    } catch (android.content.pm.PackageManager.NameNotFoundException e3) {
                                        android.util.Log.wtf("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e3);
                                        i5 = 1;
                                        if (i5 != 18) {
                                        }
                                        if (z2) {
                                        }
                                    }
                                }
                                i5 = !applicationInfo.enabled ? 3 : 0;
                            }
                        } else {
                            android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                        }
                    } else {
                        android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                    }
                } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
                    android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
                }
                if (i5 != 18) {
                    if (i5 == 1) {
                        try {
                            java.util.Iterator<android.content.pm.PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z2 = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
                                    break;
                                }
                                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                                    break;
                                }
                            }
                        } catch (android.content.pm.PackageManager.NameNotFoundException | java.lang.Exception unused4) {
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    return i5;
                }
                return 18;
            }
        }
        objArr = false;
        if (i2 >= 0) {
        }
    }
}
