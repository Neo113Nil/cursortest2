package j3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import game.betting133.sports1xbet.R;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import m3.v;
import q3.AbstractC2309b;
import r3.C2350b;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f17513a;

    /* renamed from: b, reason: collision with root package name */
    public static final f f17514b;

    static {
        AtomicBoolean atomicBoolean = h.f17515a;
        f17513a = 12451000;
        f17514b = new f();
    }

    public static int a(Context context) {
        AtomicBoolean atomicBoolean = h.f17515a;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public Intent b(int i, Context context, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && AbstractC2309b.h(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f17513a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(C2350b.a(context).c(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:0|1|(2:2|3)|4|(4:8|2d|15|(2:17|(2:19|20))(2:22|23))|39|(4:41|(3:43|(1:49)(1:47)|48)|50|(12:52|(1:54)(1:118)|55|(2:114|115)(1:57)|58|59|60|(1:62)(2:(2:84|(1:86))|(4:92|(1:94)(1:111)|(1:96)|(1:98)(4:99|(2:105|106)|101|(1:103)(1:104)))(1:91))|63|(2:(6:70|71|72|(3:75|(1:77)(1:78)|73)|79|80)(0)|(1:67)(1:68))(0)|65|(0)(0)))|119|(0)(0)|55|(0)(0)|58|59|60|(0)(0)|63|(0)(0)|65|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01b8, code lost:
    
        android.util.Log.w("GooglePlayServicesUtil", java.lang.String.valueOf(r3).concat(" requires Google Play services, but they are missing."));
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0208 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0209 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int c(Context context, int i) {
        boolean z3;
        int i5;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        Bundle bundle;
        boolean z5 = false;
        AtomicBoolean atomicBoolean = h.f17515a;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !h.f17516b.get()) {
            synchronized (v.f18107a) {
                try {
                    if (!v.f18108b) {
                        v.f18108b = true;
                        try {
                            bundle = C2350b.a(context).b(context.getPackageName(), 128).metaData;
                        } catch (PackageManager.NameNotFoundException e3) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e3);
                        }
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            v.f18109c = bundle.getInt("com.google.android.gms.version");
                        }
                    }
                } finally {
                }
            }
            int i6 = v.f18109c;
            if (i6 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i6 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + f17513a + " but found " + i6 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        if (!AbstractC2309b.h(context)) {
            if (AbstractC2309b.f18891e == null) {
                AbstractC2309b.f18891e = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (!AbstractC2309b.f18891e.booleanValue()) {
                z3 = true;
                v.a(i < 0);
                String packageName = context.getPackageName();
                PackageManager packageManager = context.getPackageManager();
                i5 = 9;
                if (z3) {
                    packageInfo = null;
                } else {
                    try {
                        packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                    }
                }
                packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                i.u(context);
                if (i.z(packageInfo2)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                } else {
                    if (z3) {
                        v.e(packageInfo);
                        if (!i.z(packageInfo)) {
                            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                        }
                    }
                    if (!z3 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        int i7 = packageInfo2.versionCode;
                        if ((i7 == -1 ? -1 : i7 / 1000) < (i != -1 ? i / 1000 : -1)) {
                            Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i + " but found " + i7);
                            i5 = 2;
                        } else {
                            ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                            if (applicationInfo == null) {
                                try {
                                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                } catch (PackageManager.NameNotFoundException e5) {
                                    Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e5);
                                    i5 = 1;
                                    if (i5 != 18) {
                                    }
                                    z5 = true;
                                    if (z5) {
                                    }
                                }
                            }
                            i5 = !applicationInfo.enabled ? 3 : 0;
                        }
                    } else {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                    }
                }
                if (i5 != 18) {
                    if (i5 == 1) {
                        try {
                            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                            while (it.hasNext()) {
                                if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                                }
                            }
                            z5 = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
                        } catch (PackageManager.NameNotFoundException | Exception unused3) {
                        }
                    }
                    if (z5) {
                        return i5;
                    }
                    return 18;
                }
                z5 = true;
                if (z5) {
                }
            }
        }
        z3 = false;
        v.a(i < 0);
        String packageName2 = context.getPackageName();
        PackageManager packageManager2 = context.getPackageManager();
        i5 = 9;
        if (z3) {
        }
        packageInfo2 = packageManager2.getPackageInfo("com.google.android.gms", 64);
        i.u(context);
        if (i.z(packageInfo2)) {
        }
        if (i5 != 18) {
        }
        z5 = true;
        if (z5) {
        }
    }
}
