package sg.bigo.ads.X0;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Point;
import android.media.AudioManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.ironsource.Q3;
import com.ironsource.Y1;
import com.unity3d.services.core.fid.Constants;
import io.ktor.sse.ServerSentEventKt;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.K0.AbstractC4956m;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.K0.H;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.a.AbstractC5015a;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.d.C5055a;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class u implements sg.bigo.ads.U.h {

    /* renamed from: a, reason: collision with root package name */
    public AdConfig f12615a;
    public final Context b;
    public final sg.bigo.ads.T0.g c;
    public String d;
    public String e;
    public int f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public int l;
    public String m;
    public String n;
    public String o;
    public int p;
    public long q;
    public long r;
    public int s;
    public String t;
    public long u = 0;
    public long v = 0;
    public int w = 0;

    public u(Context context, AdConfig adConfig, sg.bigo.ads.T0.g gVar) {
        this.b = context;
        this.f12615a = adConfig;
        this.c = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        C5055a a2 = BigoAdSdk.a(this.b);
        JSONObject jSONObject = a2 != null ? a2.f : null;
        if (jSONObject != null) {
            z2 = jSONObject.optLong("anti_info_update_millis", 0L) == C5055a.g;
            String str = AbstractC5015a.j;
            z4 = jSONObject.optBoolean(str);
            z3 = jSONObject.has(str);
            JSONObject optJSONObject = jSONObject.optJSONObject(AbstractC5015a.E);
            if (optJSONObject != null) {
                z5 = optJSONObject.has(AbstractC5015a.p);
                z6 = optJSONObject.has(AbstractC5015a.D);
                z7 = optJSONObject.has(AbstractC5015a.s);
                z8 = optJSONObject.has(AbstractC5015a.q);
                z9 = optJSONObject.has(AbstractC5015a.B);
                z10 = optJSONObject.has(AbstractC5015a.t);
                z11 = optJSONObject.has(AbstractC5015a.r);
                z = optJSONObject.has(AbstractC5015a.A);
                boolean[] zArr = {z2, z4, z5, z6, z7, z8, z9, z10, z11, z, false, z3};
                int i = 0;
                for (int i2 = 0; i2 < 12; i2++) {
                    if (zArr[i2]) {
                        i |= 1 << i2;
                    }
                }
                return i;
            }
            z = false;
            z5 = false;
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
            z5 = false;
        }
        z6 = z5;
        z7 = z6;
        z8 = z7;
        z9 = z8;
        z10 = z9;
        z11 = z10;
        boolean[] zArr2 = {z2, z4, z5, z6, z7, z8, z9, z10, z11, z, false, z3};
        int i3 = 0;
        while (i2 < 12) {
        }
        return i3;
    }

    public final long b() {
        Context context = this.b;
        int i = sg.bigo.ads.I0.f.f12337a;
        if (context == null) {
            return 0L;
        }
        try {
            return new File(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.sourceDir).length();
        } catch (Throwable th) {
            AbstractC5496a.a("DeviceUtil", "getApkSize exception: " + th.getMessage());
            return 0L;
        }
    }

    public final String c() {
        Context context = this.b;
        if (TextUtils.isEmpty(sg.bigo.ads.W.a.f12592a) && sg.bigo.ads.W.a.b) {
            try {
                Class<?> cls = Class.forName("com.appsflyer.AppsFlyerLib");
                Object invoke = cls.getMethod("getAppsFlyerUID", Context.class).invoke(cls.getMethod(Constants.GET_INSTANCE, null).invoke(null, null), context);
                if (invoke instanceof String) {
                    sg.bigo.ads.W.a.f12592a = (String) invoke;
                }
            } catch (Exception unused) {
                sg.bigo.ads.W.a.b = false;
            }
        }
        return sg.bigo.ads.W.a.f12592a;
    }

    public final sg.bigo.ads.U.b d() {
        if (this.c.B.a(15)) {
            Context context = this.b;
            boolean z = sg.bigo.ads.I0.f.j;
            if (!z && context != null && !z) {
                context.registerReceiver(sg.bigo.ads.I0.f.k, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                sg.bigo.ads.I0.f.j = true;
            }
            return sg.bigo.ads.I0.f.i;
        }
        Context context2 = this.b;
        if (context2 != null) {
            sg.bigo.ads.I0.e eVar = sg.bigo.ads.I0.f.k;
            if (eVar != null && sg.bigo.ads.I0.f.j) {
                try {
                    context2.unregisterReceiver(eVar);
                } catch (Throwable unused) {
                }
                sg.bigo.ads.I0.f.k = null;
                sg.bigo.ads.I0.f.j = false;
            }
        } else {
            int i = sg.bigo.ads.I0.f.f12337a;
        }
        return null;
    }

    public final String e() {
        if (!TextUtils.isEmpty("")) {
            return "";
        }
        String f = f();
        return !TextUtils.isEmpty(f) ? f : g();
    }

    public final String f() {
        Context context = this.b;
        String str = "";
        if (context == null) {
            int i = sg.bigo.ads.I0.f.f12337a;
        } else {
            if (Y1.f.equals(sg.bigo.ads.I0.f.e)) {
                sg.bigo.ads.I0.f.e = "";
                if (AbstractC4956m.b(context)) {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
                        String networkCountryIso = telephonyManager.getNetworkCountryIso();
                        sg.bigo.ads.I0.f.e = networkCountryIso;
                        if (TextUtils.isEmpty(networkCountryIso)) {
                            sg.bigo.ads.I0.f.e = telephonyManager.getSimCountryIso();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            str = sg.bigo.ads.I0.f.e;
        }
        return I.a((CharSequence) str) ? str : str.toLowerCase();
    }

    public final String g() {
        Resources resources;
        Locale locale;
        Context context = this.b;
        int i = sg.bigo.ads.I0.f.f12337a;
        String country = (context == null || (resources = context.getResources()) == null || (locale = resources.getConfiguration().locale) == null) ? "zz" : locale.getCountry();
        return I.a((CharSequence) country) ? country : country.toLowerCase();
    }

    public final String h() {
        sg.bigo.ads.U.a d = this.c.d();
        return d != null ? d.f12559a : "";
    }

    public final String i() {
        int a2 = sg.bigo.ads.I0.g.a(this.b);
        return a2 != 1 ? a2 != 2 ? a2 != 3 ? a2 != 4 ? a2 != 5 ? "unknown" : "5g" : "4g" : Q3.b : Q3.f7855a : "2g";
    }

    public final String j() {
        String str;
        try {
            str = TimeZone.getDefault().getDisplayName(false, 0, Locale.ENGLISH);
        } catch (AssertionError unused) {
            str = "";
        }
        return I.a((CharSequence) str) ? str : str.toLowerCase();
    }

    public final float k() {
        Context context = this.b;
        int i = sg.bigo.ads.I0.f.f12337a;
        if (context != null) {
            try {
                if (((AudioManager) context.getSystemService("audio")) != null) {
                    return r0.getStreamVolume(3) / r0.getStreamMaxVolume(3);
                }
            } catch (Exception e) {
                AbstractC5496a.a("DeviceUtil", "getVolume exception: " + e.getMessage());
            }
        }
        return 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x014f, code lost:
    
        if (r7 != 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x029b, code lost:
    
        if (sg.bigo.ads.H0.a.a() != false) goto L131;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        int i;
        int i2;
        String language;
        String str;
        PackageInfo packageInfo;
        long longValue;
        String[] strArr;
        int i3;
        String[] strArr2;
        int i4;
        String[] strArr3;
        int i5;
        Resources resources;
        Locale locale;
        this.d = this.b.getPackageName();
        this.e = AbstractC4956m.a(this.b);
        Context context = this.b;
        synchronized (AbstractC4956m.class) {
            i = 0;
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (Exception unused) {
                i2 = 0;
            }
        }
        this.f = i2;
        Context context2 = this.b;
        int i6 = sg.bigo.ads.I0.f.f12337a;
        if (context2 == null || (resources = context2.getResources()) == null || (locale = resources.getConfiguration().locale) == null) {
            language = Locale.US.getLanguage();
        } else {
            language = locale.getLanguage();
            if (language.equals("iw")) {
                language = "he";
            } else if (language.equals("in")) {
                language = "id";
            } else if (language.equals("ji")) {
                language = "yi";
            }
        }
        this.g = language;
        String str2 = Build.MANUFACTURER;
        if (!I.a((CharSequence) str2)) {
            str2 = str2.toLowerCase();
        }
        this.h = str2;
        String str3 = Build.MODEL;
        if (!I.a((CharSequence) str3)) {
            str3 = str3.toLowerCase();
        }
        this.i = str3;
        Context context3 = this.b;
        if (context3 == null) {
            str = "";
        } else {
            if (Y1.f.equals(sg.bigo.ads.I0.f.d)) {
                sg.bigo.ads.I0.f.d = "";
                if (AbstractC4956m.b(context3)) {
                    try {
                        sg.bigo.ads.I0.f.d = ((TelephonyManager) context3.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getSimOperatorName();
                    } catch (Exception unused2) {
                    }
                }
            }
            str = sg.bigo.ads.I0.f.d;
        }
        this.j = str;
        Point a2 = AbstractC4963u.a(this.b);
        this.k = a2.x + "x" + a2.y;
        float f = this.b.getResources().getDisplayMetrics().density;
        this.l = (int) (10.0f * f);
        if (f > 0.0f) {
            this.m = Math.round(a2.x / f) + "x" + Math.round(a2.y / f);
        }
        try {
            packageInfo = this.b.getPackageManager().getPackageInfo("com.google.android.gms", 128);
        } catch (Exception unused3) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.n = packageInfo.versionName;
        }
        this.o = sg.bigo.ads.I0.f.h(this.b);
        this.p = sg.bigo.ads.I0.b.a();
        int i7 = 1;
        if (sg.bigo.ads.I0.b.b) {
            longValue = sg.bigo.ads.I0.b.d;
        }
        longValue = ((Long) sg.bigo.ads.F0.b.a("sp_ads", "sp_cpu_max_freq", (Object) 0L, 1)).longValue();
        sg.bigo.ads.I0.b.d = longValue;
        if (longValue != 0) {
            sg.bigo.ads.I0.b.b = true;
        } else {
            int i8 = -1;
            int i9 = -1;
            for (int i10 = 0; i10 < sg.bigo.ads.I0.b.a(); i10++) {
                try {
                    File file = new File("/sys/devices/system/cpu/cpu" + i10 + "/cpufreq/cpuinfo_max_freq");
                    if (file.exists() && file.canRead()) {
                        byte[] bArr = new byte[128];
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            fileInputStream.read(bArr);
                            int i11 = 0;
                            while (Character.isDigit(bArr[i11]) && i11 < 128) {
                                i11++;
                            }
                            int parseInt = Integer.parseInt(new String(bArr, 0, i11));
                            if (parseInt > i9) {
                                i9 = parseInt;
                            }
                        } catch (NumberFormatException unused4) {
                        } catch (Throwable th) {
                            fileInputStream.close();
                            throw th;
                        }
                        fileInputStream.close();
                    }
                } catch (Exception unused5) {
                }
            }
            if (i9 == -1) {
                FileReader fileReader = new FileReader("/proc/cpuinfo");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String[] split = readLine.split(ServerSentEventKt.COLON, 2);
                        if ("cpu MHz".equals(split[0].replaceAll("[\\t\\n\\r]", ""))) {
                            int parseDouble = (split[1].contains(".") ? (int) Double.parseDouble(split[1]) : Integer.parseInt(split[1])) * 1000;
                            if (parseDouble > i9) {
                                i9 = parseDouble;
                            }
                        }
                    } catch (Exception unused6) {
                    } catch (Throwable th2) {
                        fileReader.close();
                        bufferedReader.close();
                        throw th2;
                    }
                }
                fileReader.close();
                bufferedReader.close();
            }
            i8 = i9;
            sg.bigo.ads.I0.b.b = true;
            long j = i8 / 1000;
            sg.bigo.ads.I0.b.d = j;
            sg.bigo.ads.F0.b.b("sp_ads", "sp_cpu_max_freq", Long.valueOf(j), 1);
            longValue = sg.bigo.ads.I0.b.d;
        }
        this.q = longValue;
        this.r = H.a(this.b);
        this.t = AbstractC4956m.d(this.d, this.b);
        try {
            strArr3 = sg.bigo.ads.H0.a.f12320a;
            i5 = 0;
        } catch (Throwable unused7) {
        }
        while (true) {
            if (i5 < 2) {
                if (new File(strArr3[i5]).exists()) {
                    break;
                } else {
                    i5++;
                }
            }
            try {
                strArr2 = sg.bigo.ads.H0.a.b;
                i4 = 0;
            } catch (Throwable unused8) {
            }
            while (true) {
                if (i4 < 3) {
                    if (new File(strArr2[i4]).exists()) {
                        break;
                    } else {
                        i4++;
                    }
                }
                try {
                    strArr = sg.bigo.ads.H0.a.c;
                    i3 = 0;
                } catch (Throwable unused9) {
                }
                while (true) {
                    if (i3 < 2) {
                        if (new File(strArr[i3]).exists()) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        this.s = i7;
        try {
            i = this.b.getPackageManager().getPackageInfo("com.android.vending", 0).versionCode;
        } catch (Exception unused10) {
        }
        this.w = i;
        i7 = 0;
        this.s = i7;
        i = this.b.getPackageManager().getPackageInfo("com.android.vending", 0).versionCode;
        this.w = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0073, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        r1 = android.os.Build.TAGS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r1.contains("test-keys") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        r1 = java.lang.System.getenv(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.ENVIRONMENT_VARIABLE_PATH).split(io.ktor.sse.ServerSentEventKt.COLON);
        r2 = r1.length;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r3 >= r2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r6 = new java.io.File(r1[r3]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r6.isDirectory() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (new java.io.File(r6, "su").exists() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m() {
        int i = sg.bigo.ads.I0.f.f12337a;
        try {
            String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su"};
            int i2 = 0;
            while (true) {
                if (i2 >= 6) {
                    break;
                }
                if (new File(strArr[i2]).exists()) {
                    break;
                }
                i2++;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
