package P2;

import Q2.r;
import T2.G;
import T2.I;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.google.android.gms.internal.ads.A7;
import com.google.android.gms.internal.ads.AbstractC1400ot;
import com.google.android.gms.internal.ads.AbstractC1668us;
import com.google.android.gms.internal.ads.AbstractC1803xs;
import com.google.android.gms.internal.ads.C0552Ad;
import com.google.android.gms.internal.ads.C0606Hd;
import com.google.android.gms.internal.ads.C0634Ld;
import com.google.android.gms.internal.ads.C0709Wb;
import com.google.android.gms.internal.ads.C0905dr;
import com.google.android.gms.internal.ads.C0947eo;
import com.google.android.gms.internal.ads.C1074hg;
import com.google.android.gms.internal.ads.C1172jq;
import com.google.android.gms.internal.ads.C1214kn;
import com.google.android.gms.internal.ads.C1398or;
import com.google.android.gms.internal.ads.C1428pc;
import com.google.android.gms.internal.ads.C1471qa;
import com.google.android.gms.internal.ads.C1482ql;
import com.google.android.gms.internal.ads.C1529ro;
import com.google.android.gms.internal.ads.C1712vr;
import com.google.android.gms.internal.ads.D7;
import com.google.android.gms.internal.ads.Dp;
import com.google.android.gms.internal.ads.F7;
import com.google.android.gms.internal.ads.Fs;
import com.google.android.gms.internal.ads.Hw;
import com.google.android.gms.internal.ads.InterfaceC0588Eh;
import com.google.android.gms.internal.ads.InterfaceC1259ln;
import com.google.android.gms.internal.ads.InterfaceC1695va;
import com.google.android.gms.internal.ads.InterfaceC1740wa;
import com.google.android.gms.internal.ads.InterfaceC1887zm;
import com.google.android.gms.internal.ads.InterfaceC1897zw;
import com.google.android.gms.internal.ads.Jr;
import com.google.android.gms.internal.ads.Lq;
import com.google.android.gms.internal.ads.Mw;
import com.google.android.gms.internal.ads.N9;
import com.google.android.gms.internal.ads.Nr;
import com.google.android.gms.internal.ads.Sq;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC1897zw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4716a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4717b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4718c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4719d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4720e;

    public c(C4.m mVar, String str, InterfaceC1740wa interfaceC1740wa, InterfaceC1695va interfaceC1695va) {
        this.f4716a = 1;
        this.f4719d = mVar;
        this.f4720e = str;
        this.f4718c = interfaceC1740wa;
        this.f4717b = interfaceC1695va;
    }

    private final E3.a a(Object obj) {
        Long l5 = (Long) this.f4717b;
        C1482ql c1482ql = (C1482ql) this.f4718c;
        Nr nr = (Nr) this.f4719d;
        Jr jr = (Jr) this.f4720e;
        JSONObject jSONObject = (JSONObject) obj;
        int i = 0;
        boolean optBoolean = jSONObject.optBoolean("isSuccessful", false);
        if (optBoolean) {
            String string = jSONObject.getString("appSettingsJson");
            o oVar = o.f4767B;
            I d5 = oVar.f4774g.d();
            d5.o();
            synchronized (d5.f5644a) {
                try {
                    oVar.f4776j.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (string != null && !string.equals(d5.f5655n.f7598e)) {
                        d5.f5655n = new C0552Ad(string, currentTimeMillis);
                        SharedPreferences.Editor editor = d5.f5649g;
                        if (editor != null) {
                            editor.putString("app_settings_json", string);
                            d5.f5649g.putLong("app_settings_last_update_ms", currentTimeMillis);
                            d5.f5649g.apply();
                        }
                        d5.p();
                        ArrayList arrayList = d5.f5646c;
                        int size = arrayList.size();
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            ((Runnable) obj2).run();
                        }
                    }
                    d5.f5655n.f = currentTimeMillis;
                } finally {
                }
            }
            if (l5 != null) {
                o.f4767B.f4776j.getClass();
                E4.a.l(c1482ql, "cld_s", SystemClock.elapsedRealtime() - l5.longValue());
            }
        }
        jr.g(optBoolean);
        nr.b(jr.l());
        return Mw.f10750l;
    }

    public E3.a b(Object obj) {
        C0634Ld c0634Ld = new C0634Ld();
        C1471qa m5 = ((C4.m) this.f4719d).m();
        G.m("callJs > getEngine: Promise created");
        m5.p(new m2.g(this, m5, obj, c0634Ld, 5), new C0709Wb(8, c0634Ld, m5));
        return c0634Ld;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1897zw
    public final E3.a k(Object obj) {
        E3.a Z4;
        Mw c02;
        switch (this.f4716a) {
            case 0:
                return a(obj);
            case 1:
                return b(obj);
            case 2:
                MotionEvent motionEvent = (MotionEvent) this.f4720e;
                C1074hg c1074hg = (C1074hg) this.f4717b;
                c1074hg.getClass();
                int intValue = ((Integer) obj).intValue();
                Uri.Builder builder = (Uri.Builder) this.f4718c;
                if (intValue != 1) {
                    builder.appendQueryParameter((String) r.f5053d.f5056c.a(F7.N9), "10");
                    return AbstractC1400ot.c0(builder.toString());
                }
                Uri.Builder buildUpon = builder.build().buildUpon();
                A7 a7 = F7.O9;
                r rVar = r.f5053d;
                buildUpon.appendQueryParameter((String) rVar.f5056c.a(a7), "1");
                A7 a72 = F7.N9;
                D7 d7 = rVar.f5056c;
                buildUpon.appendQueryParameter((String) d7.a(a72), "12");
                if (((String) this.f4719d).contains((CharSequence) d7.a(F7.P9))) {
                    buildUpon.authority((String) d7.a(F7.Q9));
                }
                Uri build = buildUpon.build();
                C1214kn c1214kn = c1074hg.f13772c;
                c1214kn.getClass();
                try {
                    M1.d dVar = c1214kn.f14284a;
                    Objects.requireNonNull(dVar);
                    Z4 = dVar.d(build, motionEvent);
                } catch (Exception e3) {
                    Z4 = AbstractC1400ot.Z(e3);
                }
                return AbstractC1400ot.j0(Hw.r(Z4), new N9(2, builder), c1074hg.f);
            case 3:
                return AbstractC1400ot.j0(((InterfaceC1887zm) this.f4718c).p((C1428pc) this.f4719d), (InterfaceC1897zw) this.f4720e, (C0606Hd) ((C0905dr) this.f4717b).f13186l);
            case 4:
                C0947eo c0947eo = (C0947eo) this.f4717b;
                Jr j5 = AbstractC1668us.j(c0947eo.f13346j, 12);
                Lq lq = (Lq) this.f4718c;
                j5.H(lq.f10469E);
                j5.e();
                InterfaceC1259ln interfaceC1259ln = (InterfaceC1259ln) this.f4720e;
                Sq sq = (Sq) this.f4719d;
                E3.a l02 = AbstractC1400ot.l0(interfaceC1259ln.b(sq, lq), lq.f10480R, TimeUnit.MILLISECONDS, c0947eo.f);
                c0947eo.f13345h.b(sq, lq, l02, c0947eo.f13341c);
                AbstractC1803xs.c0(l02, c0947eo.f13347k, j5, false);
                return l02;
            default:
                Fs fs = (Fs) this.f4717b;
                Dp dp = (Dp) this.f4718c;
                C0905dr c0905dr = (C0905dr) this.f4719d;
                C1172jq c1172jq = (C1172jq) this.f4720e;
                C1398or c1398or = (C1398or) obj;
                synchronized (fs) {
                    try {
                        fs.f9136b = true;
                        c1398or.f14864a = (InterfaceC0588Eh) ((C1529ro) dp.f8377l).f15382l;
                        if (fs.f9135a) {
                            c02 = AbstractC1400ot.c0(new C1712vr(c1398or, c1172jq));
                        } else {
                            c0905dr.E(c1172jq.f14170g, c1398or);
                            c02 = Mw.f10750l;
                        }
                    } finally {
                    }
                }
                return c02;
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f4716a = i;
        this.f4717b = obj;
        this.f4718c = obj2;
        this.f4719d = obj3;
        this.f4720e = obj4;
    }
}
