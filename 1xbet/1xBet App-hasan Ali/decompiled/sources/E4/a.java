package E4;

import D3.h;
import L4.C;
import P2.o;
import Q2.r;
import T2.I;
import U2.j;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.A7;
import com.google.android.gms.internal.ads.AbstractC0613Id;
import com.google.android.gms.internal.ads.AbstractC1400ot;
import com.google.android.gms.internal.ads.AbstractC1668us;
import com.google.android.gms.internal.ads.AbstractC1803xs;
import com.google.android.gms.internal.ads.AbstractC1830ya;
import com.google.android.gms.internal.ads.Ar;
import com.google.android.gms.internal.ads.B;
import com.google.android.gms.internal.ads.C0552Ad;
import com.google.android.gms.internal.ads.C0606Hd;
import com.google.android.gms.internal.ads.C0634Ld;
import com.google.android.gms.internal.ads.C1091hx;
import com.google.android.gms.internal.ads.C1390oj;
import com.google.android.gms.internal.ads.C1482ql;
import com.google.android.gms.internal.ads.C1537rw;
import com.google.android.gms.internal.ads.C1767x0;
import com.google.android.gms.internal.ads.C1875za;
import com.google.android.gms.internal.ads.E6;
import com.google.android.gms.internal.ads.F6;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.G;
import com.google.android.gms.internal.ads.H;
import com.google.android.gms.internal.ads.HG;
import com.google.android.gms.internal.ads.InterfaceC0737a0;
import com.google.android.gms.internal.ads.Jr;
import com.google.android.gms.internal.ads.Kw;
import com.google.android.gms.internal.ads.Nr;
import com.google.android.gms.internal.ads.Rm;
import com.google.android.gms.internal.ads.RunnableC0657Of;
import com.google.android.gms.internal.ads.U;
import com.google.android.gms.internal.ads.V9;
import java.util.ArrayList;
import kotlin.jvm.internal.l;
import o0.C2202f;
import o4.AbstractC2227e;
import org.json.JSONObject;
import q3.C2308a;
import r3.C2350b;
import y4.m;

/* loaded from: classes.dex */
public final class a implements G, H, Ar {

    /* renamed from: k, reason: collision with root package name */
    public long f1485k;

    /* renamed from: l, reason: collision with root package name */
    public Object f1486l;

    public /* synthetic */ a(long j5, Object obj) {
        this.f1485k = j5;
        this.f1486l = obj;
    }

    public static final void l(C1482ql c1482ql, String str, long j5) {
        if (c1482ql != null) {
            if (((Boolean) r.f5053d.f5056c.a(F7.jc)).booleanValue()) {
                C1390oj a5 = c1482ql.a();
                a5.k("action", "lat_init");
                a5.k(str, Long.toString(j5));
                a5.q();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.G
    public void B(int i) {
        ((B) this.f1486l).g(i, false);
    }

    @Override // com.google.android.gms.internal.ads.G
    public void C(int i) {
        ((B) this.f1486l).k(i);
    }

    @Override // com.google.android.gms.internal.ads.G
    public void D(byte[] bArr, int i, int i5) {
        ((B) this.f1486l).F(bArr, i, i5, false);
    }

    @Override // com.google.android.gms.internal.ads.G
    public void E(byte[] bArr, int i, int i5) {
        ((B) this.f1486l).G(bArr, i, i5, false);
    }

    @Override // com.google.android.gms.internal.ads.G
    public boolean F(byte[] bArr, int i, int i5, boolean z3) {
        return ((B) this.f1486l).F(bArr, 0, i5, z3);
    }

    @Override // com.google.android.gms.internal.ads.G
    public boolean G(byte[] bArr, int i, int i5, boolean z3) {
        return ((B) this.f1486l).G(bArr, 0, i5, z3);
    }

    @Override // com.google.android.gms.internal.ads.G
    public long b() {
        return ((B) this.f1486l).b() - this.f1485k;
    }

    @Override // com.google.android.gms.internal.ads.G
    public long c() {
        return ((B) this.f1486l).f7752n - this.f1485k;
    }

    @Override // com.google.android.gms.internal.ads.DE
    public int e(byte[] bArr, int i, int i5) {
        return ((B) this.f1486l).e(bArr, i, i5);
    }

    public m f() {
        C2202f c2202f = new C2202f(1);
        while (true) {
            String r5 = ((C) this.f1486l).r(this.f1485k);
            this.f1485k -= r5.length();
            if (r5.length() == 0) {
                return c2202f.d();
            }
            int F02 = AbstractC2227e.F0(r5, ':', 1, 4);
            if (F02 != -1) {
                String substring = r5.substring(0, F02);
                l.e("this as java.lang.String…ing(startIndex, endIndex)", substring);
                String substring2 = r5.substring(F02 + 1);
                l.e("this as java.lang.String).substring(startIndex)", substring2);
                c2202f.b(substring, substring2);
            } else if (r5.charAt(0) == ':') {
                String substring3 = r5.substring(1);
                l.e("this as java.lang.String).substring(startIndex)", substring3);
                c2202f.b("", substring3);
            } else {
                c2202f.b("", r5);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void g(Context context, U2.a aVar, boolean z3, C0552Ad c0552Ad, String str, String str2, RunnableC0657Of runnableC0657Of, Nr nr, C1482ql c1482ql, Long l5) {
        Jr jr;
        Exception exc;
        E3.a b3;
        P2.c cVar;
        PackageInfo c5;
        Nr nr2 = nr;
        boolean z5 = false;
        Object[] objArr = 0;
        o oVar = o.f4767B;
        oVar.f4776j.getClass();
        if (SystemClock.elapsedRealtime() - this.f1485k < 5000) {
            j.i("Not retrying to fetch app settings");
            return;
        }
        C2308a c2308a = oVar.f4776j;
        c2308a.getClass();
        this.f1485k = SystemClock.elapsedRealtime();
        if (c0552Ad != null && !TextUtils.isEmpty(c0552Ad.f7598e)) {
            long j5 = c0552Ad.f;
            c2308a.getClass();
            if (System.currentTimeMillis() - j5 <= ((Long) r.f5053d.f5056c.a(F7.f8801a4)).longValue() && c0552Ad.f7600h) {
                return;
            }
        }
        if (context == null) {
            j.i("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            j.i("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.f1486l = applicationContext;
        Jr j6 = AbstractC1668us.j(context, 4);
        j6.e();
        C1875za m5 = oVar.f4783q.m((Context) this.f1486l, aVar, nr2);
        V9 v9 = AbstractC1830ya.f16434b;
        P2.c a5 = m5.a("google.afma.config.fetchAppSettings", v9, v9);
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                if (!TextUtils.isEmpty(str)) {
                    jSONObject.put("app_id", str);
                } else if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("ad_unit_id", str2);
                }
                jSONObject.put("is_init", z3);
                jSONObject.put("pn", context.getPackageName());
                A7 a7 = F7.f8796a;
                jSONObject.put("experiment_ids", TextUtils.join(",", r.f5053d.f5054a.n()));
                jSONObject.put("js", aVar.f5852k);
                try {
                    ApplicationInfo applicationInfo = ((Context) this.f1486l).getApplicationInfo();
                    if (applicationInfo != null && (c5 = C2350b.a(context).c(applicationInfo.packageName, 0)) != null) {
                        jSONObject.put("version", c5.versionCode);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    T2.G.m("Error fetching PackageInfo.");
                }
                b3 = a5.b(jSONObject);
                try {
                    cVar = new P2.c(l5, c1482ql, nr2, j6, 0);
                    jr = j6;
                } catch (Exception e3) {
                    e = e3;
                    nr2 = nr2;
                    jr = j6;
                }
            } catch (Exception e5) {
                exc = e5;
                jr = j6;
                j.g("Error requesting application settings", exc);
                jr.f(exc);
                jr.g(false);
                nr2.b(jr.l());
            }
            try {
                C0606Hd c0606Hd = AbstractC0613Id.f9544g;
                C1537rw j02 = AbstractC1400ot.j0(b3, cVar, c0606Hd);
                if (runnableC0657Of != null) {
                    ((C0634Ld) b3).f10334k.a(runnableC0657Of, c0606Hd);
                }
                if (l5 != null) {
                    ((C0634Ld) b3).f10334k.a(new h(9, c1482ql, l5, z5), c0606Hd);
                }
                if (((Boolean) r.f5053d.f5056c.a(F7.q7)).booleanValue()) {
                    j02.a(new Kw(objArr == true ? 1 : 0, j02, new C1091hx("ConfigLoader.maybeFetchNewAppSettings", 4)), c0606Hd);
                } else {
                    AbstractC1803xs.k(j02, "ConfigLoader.maybeFetchNewAppSettings");
                }
            } catch (Exception e6) {
                e = e6;
                exc = e;
                j.g("Error requesting application settings", exc);
                jr.f(exc);
                jr.g(false);
                nr2.b(jr.l());
            }
        } catch (Exception e7) {
            e = e7;
            jr = j6;
            exc = e;
            j.g("Error requesting application settings", exc);
            jr.f(exc);
            jr.g(false);
            nr2.b(jr.l());
        }
    }

    @Override // com.google.android.gms.internal.ads.G
    public void h() {
        ((B) this.f1486l).f7754p = 0;
    }

    @Override // com.google.android.gms.internal.ads.G
    public long j() {
        return ((B) this.f1486l).f7751m - this.f1485k;
    }

    @Override // com.google.android.gms.internal.ads.Ar
    public Object k(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (((I) ((Rm) this.f1486l).f474a).n()) {
            return null;
        }
        E6 L5 = F6.L();
        L5.e();
        F6 f6 = (F6) L5.f10141l;
        long j5 = this.f1485k;
        F6.H(f6, j5);
        byte[] d5 = ((F6) L5.b()).d();
        sQLiteDatabase.execSQL("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = 'total_requests'");
        AbstractC1668us.N(sQLiteDatabase, j5, d5);
        return null;
    }

    @Override // com.google.android.gms.internal.ads.H
    public void v() {
        ((HG) this.f1486l).v();
    }

    @Override // com.google.android.gms.internal.ads.H
    public InterfaceC0737a0 w(int i, int i5) {
        return ((HG) this.f1486l).w(i, i5);
    }

    @Override // com.google.android.gms.internal.ads.H
    public void x(U u5) {
        ((HG) this.f1486l).x(new C1767x0(this, u5, u5));
    }

    public a(B b3, long j5) {
        this.f1486l = b3;
        AbstractC1668us.S(b3.f7752n >= j5);
        this.f1485k = j5;
    }

    public /* synthetic */ a(Object obj, long j5) {
        this.f1486l = obj;
        this.f1485k = j5;
    }

    public a(int i) {
        switch (i) {
            case 7:
                this.f1486l = null;
                this.f1485k = -1L;
                break;
            default:
                this.f1486l = new ArrayList();
                break;
        }
    }
}
