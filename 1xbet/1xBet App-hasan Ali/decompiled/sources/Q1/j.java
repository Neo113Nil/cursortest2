package Q1;

import G.v;
import G1.q;
import P2.o;
import Q2.InterfaceC0347a;
import Q2.r;
import T2.G;
import T2.L;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import androidx.lifecycle.InterfaceC0482k;
import androidx.lifecycle.U;
import androidx.lifecycle.W;
import androidx.lifecycle.Y;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.A7;
import com.google.android.gms.internal.ads.C1482ql;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.Vi;
import java.util.Arrays;
import java.util.Locale;
import r0.AbstractC2346c;
import s0.InterfaceC2352a;

/* loaded from: classes.dex */
public class j implements R0.c, U2.d, X2.b, X2.c, X2.d, X1.a, InterfaceC2352a, a4.g {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4884k;

    public /* synthetic */ j(int i) {
        this.f4884k = i;
    }

    public static final float c(float f, float[] fArr, float[] fArr2) {
        float f5;
        float f6;
        float f7;
        float f8;
        float abs = Math.abs(f);
        float signum = Math.signum(f);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i = -(binarySearch + 1);
        int i5 = i - 1;
        if (i5 >= fArr.length - 1) {
            float f9 = fArr[fArr.length - 1];
            float f10 = fArr2[fArr.length - 1];
            if (f9 == 0.0f) {
                return 0.0f;
            }
            return (f10 / f9) * f;
        }
        if (i5 == -1) {
            float f11 = fArr[0];
            f7 = fArr2[0];
            f8 = f11;
            f6 = 0.0f;
            f5 = 0.0f;
        } else {
            float f12 = fArr[i5];
            float f13 = fArr[i];
            f5 = fArr2[i5];
            f6 = f12;
            f7 = fArr2[i];
            f8 = f13;
        }
        return (((f7 - f5) * Math.max(0.0f, Math.min(1.0f, f6 == f8 ? 0.0f : (abs - f6) / (f8 - f6)))) + f5) * signum;
    }

    public static W e(Y y5, q qVar, int i) {
        U u5 = qVar;
        if ((i & 2) != 0) {
            u5 = y5 instanceof InterfaceC0482k ? ((InterfaceC0482k) y5).d() : F1.b.f1522a;
        }
        D1.b e3 = y5 instanceof InterfaceC0482k ? ((InterfaceC0482k) y5).e() : D1.a.f923b;
        kotlin.jvm.internal.l.f("factory", u5);
        kotlin.jvm.internal.l.f("extras", e3);
        return new W(y5.f(), u5, e3);
    }

    public static CookieManager f() {
        o oVar = o.f4767B;
        L l5 = oVar.f4771c;
        int myUid = Process.myUid();
        if (myUid == 0 || myUid == 1000) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            U2.j.g("Failed to obtain CookieManager.", th);
            oVar.f4774g.h("ApiLevelUtil.getCookieManager", th);
            return null;
        }
    }

    public static final void g(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z3, C1482ql c1482ql) {
        if (adOverlayInfoParcel.f7456u == 4 && adOverlayInfoParcel.f7448m == null) {
            InterfaceC0347a interfaceC0347a = adOverlayInfoParcel.f7447l;
            if (interfaceC0347a != null) {
                interfaceC0347a.z();
            }
            Vi vi = adOverlayInfoParcel.f7442E;
            if (vi != null) {
                vi.E();
            }
            Activity e3 = adOverlayInfoParcel.f7449n.e();
            S2.e eVar = adOverlayInfoParcel.f7446k;
            Context context2 = (eVar == null || !eVar.f5322t || e3 == null) ? context : e3;
            j jVar = o.f4767B.f4769a;
            i(context2, eVar, adOverlayInfoParcel.f7454s, eVar != null ? eVar.f5321s : null, c1482ql, adOverlayInfoParcel.f7438A);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f7458w.f5855n);
        intent.putExtra("shouldCallOnOverlayOpened", z3);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) r.f5053d.f5056c.a(F7.Fc)).booleanValue()) {
            L l5 = o.f4767B.f4771c;
            L.r(context, intent, c1482ql, adOverlayInfoParcel.f7438A);
        } else {
            L l6 = o.f4767B.f4771c;
            L.p(context, intent);
        }
    }

    public static final boolean h(Context context, Intent intent, S2.c cVar, S2.a aVar, boolean z3, C1482ql c1482ql, String str) {
        int i;
        if (z3) {
            Uri data = intent.getData();
            try {
                o.f4767B.f4771c.getClass();
                i = L.C(context, data);
                if (cVar != null) {
                    cVar.f();
                }
            } catch (ActivityNotFoundException e3) {
                U2.j.i(e3.getMessage());
                i = 6;
            }
            if (aVar != null) {
                aVar.z(i);
            }
            return i == 5;
        }
        try {
            G.m("Launching an intent: " + intent.toURI());
            if (((Boolean) r.f5053d.f5056c.a(F7.Fc)).booleanValue()) {
                L l5 = o.f4767B.f4771c;
                L.r(context, intent, c1482ql, str);
            } else {
                L l6 = o.f4767B.f4771c;
                L.p(context, intent);
            }
            if (cVar != null) {
                cVar.f();
            }
            if (aVar != null) {
                aVar.A(true);
            }
            return true;
        } catch (ActivityNotFoundException e5) {
            U2.j.i(e5.getMessage());
            if (aVar != null) {
                aVar.A(false);
            }
            return false;
        }
    }

    public static final boolean i(Context context, S2.e eVar, S2.c cVar, S2.a aVar, C1482ql c1482ql, String str) {
        int i = 0;
        if (eVar == null) {
            U2.j.i("No intent data for launcher overlay.");
            return false;
        }
        F7.a(context);
        Intent intent = eVar.f5320r;
        if (intent != null) {
            return h(context, intent, cVar, aVar, eVar.f5322t, c1482ql, str);
        }
        Intent intent2 = new Intent();
        String str2 = eVar.f5314l;
        if (TextUtils.isEmpty(str2)) {
            U2.j.i("Open GMSG did not contain a URL.");
            return false;
        }
        String str3 = eVar.f5315m;
        if (TextUtils.isEmpty(str3)) {
            intent2.setData(Uri.parse(str2));
        } else {
            intent2.setDataAndType(Uri.parse(str2), str3);
        }
        intent2.setAction("android.intent.action.VIEW");
        String str4 = eVar.f5316n;
        if (!TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        String str5 = eVar.f5317o;
        if (!TextUtils.isEmpty(str5)) {
            String[] split = str5.split("/", 2);
            if (split.length < 2) {
                U2.j.i("Could not parse component name from open GMSG: ".concat(str5));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str6 = eVar.f5318p;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                U2.j.i("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        A7 a7 = F7.f8893r4;
        r rVar = r.f5053d;
        if (((Boolean) rVar.f5056c.a(a7)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) rVar.f5056c.a(F7.f8888q4)).booleanValue()) {
                L l5 = o.f4767B.f4771c;
                L.E(context, intent2);
            }
        }
        return h(context, intent2, cVar, aVar, eVar.f5322t, c1482ql, str);
    }

    @Override // s0.InterfaceC2352a
    public Object G(long j5, long j6, a4.c cVar) {
        return new W0.q(0L);
    }

    @Override // s0.InterfaceC2352a
    public /* synthetic */ long I(int i, long j5, long j6) {
        return 0L;
    }

    @Override // s0.InterfaceC2352a
    public Object L(long j5, a4.c cVar) {
        return new W0.q(0L);
    }

    @Override // X1.a
    public X1.b a(P.W w5) {
        boolean z3 = w5.f4411k;
        return new Y1.e((Context) w5.f4412l, (String) w5.f4413m, (v) w5.f4414n, z3);
    }

    @Override // R0.c
    public R0.b b() {
        return new R0.b(AbstractC2346c.A(new R0.a(Locale.getDefault())));
    }

    @Override // s0.InterfaceC2352a
    public /* synthetic */ long c0(int i, long j5) {
        return 0L;
    }

    @Override // U2.d
    public U2.l d(String str) {
        new N2.c(1, str).start();
        return U2.l.f5881k;
    }

    public boolean j(Activity activity, Configuration configuration) {
        return false;
    }

    public Intent k(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    @Override // R0.c
    public Locale l(String str) {
        Locale forLanguageTag = Locale.forLanguageTag(str);
        if (kotlin.jvm.internal.l.a(forLanguageTag.toLanguageTag(), "und")) {
            Log.e("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtags delimiter and must be replaced with '-'.");
        }
        return forLanguageTag;
    }

    public int m(Context context, TelephonyManager telephonyManager) {
        return 3;
    }

    public boolean o(Context context) {
        return false;
    }

    public int p(AudioManager audioManager) {
        return 0;
    }

    public int r(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    public String toString() {
        switch (this.f4884k) {
            case 18:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ j(U2.e eVar) {
        this.f4884k = 8;
    }

    public void n(Context context) {
    }

    public void q(Activity activity) {
    }
}
