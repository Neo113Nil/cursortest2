package sg.bigo.ads.a;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import io.ktor.sse.ServerSentEventKt;
import java.lang.reflect.Method;
import org.json.JSONObject;
import sg.bigo.ads.b.C5021a;
import sg.bigo.ads.b.C5022b;
import sg.bigo.ads.b.C5023c;
import sg.bigo.ads.b.d;
import sg.bigo.ads.b.e;
import sg.bigo.ads.b.f;
import sg.bigo.ads.b.g;
import sg.bigo.ads.b.h;
import sg.bigo.ads.b.i;
import sg.bigo.ads.b.j;
import sg.bigo.ads.b.k;
import sg.bigo.ads.c.AbstractC5045k;
import sg.bigo.ads.c.AbstractC5047m;
import sg.bigo.ads.c.AbstractC5048n;
import sg.bigo.ads.c.AbstractC5049o;

/* renamed from: sg.bigo.ads.a.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5016b {
    public static JSONObject a(Context context) {
        int i;
        String str = "";
        JSONObject jSONObject = new JSONObject();
        AbstractC5049o.a(jSONObject, AbstractC5015a.f12665a, 1);
        AbstractC5049o.a(jSONObject, AbstractC5015a.e, Build.BRAND);
        AbstractC5049o.a(jSONObject, AbstractC5015a.f, Build.MODEL);
        AbstractC5049o.a(jSONObject, AbstractC5015a.g, Build.FINGERPRINT);
        String str2 = AbstractC5015a.c;
        int i2 = Build.VERSION.SDK_INT;
        AbstractC5049o.a(jSONObject, str2, Integer.valueOf(Settings.Global.getInt(context.getContentResolver(), "boot_count", 0)));
        AbstractC5049o.a(jSONObject, AbstractC5015a.d, Long.valueOf(SystemClock.elapsedRealtime() / 1000));
        Pair a2 = AbstractC5048n.a(AbstractC5015a.L, context);
        if (a2 != null) {
            AbstractC5049o.a(jSONObject, AbstractC5015a.h, a2.first);
            AbstractC5049o.a(jSONObject, AbstractC5015a.i, a2.second);
        }
        AbstractC5049o.a(jSONObject, AbstractC5015a.b, Integer.valueOf(i2));
        String str3 = AbstractC5015a.j;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        AbstractC5049o.a(jSONObject, str3, Boolean.valueOf(keyguardManager != null && keyguardManager.isKeyguardSecure()));
        int i3 = -1;
        AbstractC5049o.a(jSONObject, AbstractC5015a.k, Integer.valueOf(Settings.System.getInt(context.getContentResolver(), "screen_off_timeout", -1)));
        try {
            String packageName = context.getPackageName();
            String installerPackageName = context.getPackageManager().getInstallerPackageName(packageName);
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            AbstractC5049o.a(jSONObject, AbstractC5015a.z, packageName);
            AbstractC5049o.a(jSONObject, AbstractC5015a.F, Integer.valueOf(packageInfo.versionCode));
            String str4 = AbstractC5015a.G;
            if (TextUtils.isEmpty(installerPackageName)) {
                installerPackageName = "";
            }
            AbstractC5049o.a(jSONObject, str4, installerPackageName);
            AbstractC5049o.a(jSONObject, AbstractC5015a.H, Long.valueOf(packageInfo.firstInstallTime));
            AbstractC5049o.a(jSONObject, AbstractC5015a.I, Long.valueOf(packageInfo.lastUpdateTime));
        } catch (Exception unused) {
        }
        AbstractC5049o.a(jSONObject, AbstractC5015a.l, AbstractC5045k.a());
        AbstractC5049o.a(jSONObject, AbstractC5015a.m, AbstractC5047m.a(AbstractC5015a.W));
        String str5 = AbstractC5015a.n;
        try {
            Method method = AbstractC5047m.b;
            if (method != null) {
                str = (String) method.invoke(null, AbstractC5015a.X, "");
            }
        } catch (Throwable unused2) {
        }
        try {
            i = Settings.Global.getInt(context.getContentResolver(), "auto_time_zone", -1);
            try {
                i3 = Settings.Global.getInt(context.getContentResolver(), "auto_time", -1);
            } catch (Exception unused3) {
            }
        } catch (Exception unused4) {
            i = -1;
        }
        AbstractC5049o.a(jSONObject, str5, str + ServerSentEventKt.COLON + i + ServerSentEventKt.COLON + i3);
        AbstractC5049o.a(jSONObject, AbstractC5015a.Z, AbstractC5045k.a(context));
        AbstractC5049o.a(jSONObject, AbstractC5015a.a0, AbstractC5047m.a(AbstractC5015a.Y));
        g[] gVarArr = {new C5021a(), new C5022b(), new C5023c(), new d(), new e(), new f(), new h(), new i(), new j(), new k()};
        JSONObject jSONObject2 = new JSONObject();
        for (int i4 = 0; i4 < 10; i4++) {
            g gVar = gVarArr[i4];
            try {
                Object a3 = gVar.a(context);
                if (a3 != null) {
                    jSONObject2.put(gVar.a(), a3);
                }
            } catch (Throwable unused5) {
            }
        }
        AbstractC5049o.a(jSONObject, AbstractC5015a.E, jSONObject2);
        return jSONObject;
    }
}
