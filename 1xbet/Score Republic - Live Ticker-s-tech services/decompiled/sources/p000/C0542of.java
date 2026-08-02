package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: of */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0542of implements me1 {

    /* JADX INFO: renamed from: a */
    public final jg0 f5709a;

    /* JADX INFO: renamed from: b */
    public final ConnectivityManager f5710b;

    /* JADX INFO: renamed from: c */
    public final Context f5711c;

    /* JADX INFO: renamed from: d */
    public final URL f5712d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0766uh f5713e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0766uh f5714f;

    /* JADX INFO: renamed from: g */
    public final int f5715g;

    public C0542of(Context context, InterfaceC0766uh interfaceC0766uh, InterfaceC0766uh interfaceC0766uh2) {
        ng0 ng0Var = new ng0();
        C0905y8 c0905y8 = C0905y8.f9210a;
        ng0Var.m3537a(AbstractC0908yb.class, c0905y8);
        ng0Var.m3537a(C0721t9.class, c0905y8);
        C0054b9 c0054b9 = C0054b9.f777a;
        ng0Var.m3537a(fk0.class, c0054b9);
        ng0Var.m3537a(C0204fa.class, c0054b9);
        C0942z8 c0942z8 = C0942z8.f9672a;
        ng0Var.m3537a(AbstractC0322ih.class, c0942z8);
        ng0Var.m3537a(C0758u9.class, c0942z8);
        C0868x8 c0868x8 = C0868x8.f8842a;
        ng0Var.m3537a(AbstractC0125d4.class, c0868x8);
        ng0Var.m3537a(C0647r9.class, c0868x8);
        C0010a9 c0010a9 = C0010a9.f70a;
        ng0Var.m3537a(bk0.class, c0010a9);
        ng0Var.m3537a(C0167ea.class, c0010a9);
        C0090c9 c0090c9 = C0090c9.f1165a;
        ng0Var.m3537a(yr0.class, c0090c9);
        ng0Var.m3537a(C0279ha.class, c0090c9);
        ng0Var.f5429d = true;
        this.f5709a = new jg0(1, ng0Var);
        this.f5711c = context;
        this.f5710b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f5712d = m3685b(C0873xd.f8888c);
        this.f5713e = interfaceC0766uh2;
        this.f5714f = interfaceC0766uh;
        this.f5715g = 130000;
    }

    /* JADX INFO: renamed from: b */
    public static URL m3685b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(AbstractC0024an.m283f("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:30:0x010b  */
    /* JADX INFO: renamed from: a */
    public final C0869x9 m3686a(C0869x9 c0869x9) {
        int type;
        int subtype;
        HashMap map;
        NetworkInfo activeNetworkInfo = this.f5710b.getActiveNetworkInfo();
        C0902y5 c0902y5M5612c = c0869x9.m5612c();
        int i = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) c0902y5M5612c.f9159f;
        if (map2 == null) {
            C0270h1.m2191g("Property \"autoMetadata\" has not been set");
            return null;
        }
        map2.put("sdk-version", String.valueOf(i));
        c0902y5M5612c.m5730i("model", Build.MODEL);
        c0902y5M5612c.m5730i("hardware", Build.HARDWARE);
        c0902y5M5612c.m5730i("device", Build.DEVICE);
        c0902y5M5612c.m5730i("product", Build.PRODUCT);
        c0902y5M5612c.m5730i("os-uild", Build.ID);
        c0902y5M5612c.m5730i("manufacturer", Build.MANUFACTURER);
        c0902y5M5612c.m5730i("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) c0902y5M5612c.f9159f;
        if (map3 == null) {
            C0270h1.m2191g("Property \"autoMetadata\" has not been set");
            return null;
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = xr0.f9043j;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) c0902y5M5612c.f9159f;
        if (map4 == null) {
            C0270h1.m2191g("Property \"autoMetadata\" has not been set");
            return null;
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = wr0.f8648j;
                subtype = 100;
            } else if (((wr0) wr0.f8648j.get(subtype)) == null) {
            }
            map = (HashMap) c0902y5M5612c.f9159f;
            if (map != null) {
                C0270h1.m2191g("Property \"autoMetadata\" has not been set");
                return null;
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            c0902y5M5612c.m5730i("country", Locale.getDefault().getCountry());
            c0902y5M5612c.m5730i("locale", Locale.getDefault().getLanguage());
            Context context = this.f5711c;
            c0902y5M5612c.m5730i("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                o80.m3649k("CctTransportBackend", "Unable to find version code for package", e);
            }
            c0902y5M5612c.m5730i("application_build", Integer.toString(i2));
            return c0902y5M5612c.m5731k();
        }
        SparseArray sparseArray3 = wr0.f8648j;
        subtype = 0;
        map = (HashMap) c0902y5M5612c.f9159f;
        if (map != null) {
            C0270h1.m2191g("Property \"autoMetadata\" has not been set");
            return null;
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        c0902y5M5612c.m5730i("country", Locale.getDefault().getCountry());
        c0902y5M5612c.m5730i("locale", Locale.getDefault().getLanguage());
        Context context2 = this.f5711c;
        c0902y5M5612c.m5730i("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        c0902y5M5612c.m5730i("application_build", Integer.toString(i2));
        return c0902y5M5612c.m5731k();
    }
}
