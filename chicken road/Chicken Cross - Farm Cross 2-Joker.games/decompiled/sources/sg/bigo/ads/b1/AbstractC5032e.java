package sg.bigo.ads.b1;

import android.os.Build;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.ironsource.L6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.K0.C;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.O;
import sg.bigo.ads.P.t;
import sg.bigo.ads.X0.u;
import sg.bigo.ads.p0.AbstractC5429c;
import sg.bigo.ads.q0.AbstractC5446j;
import sg.bigo.ads.q0.C5447k;
import sg.bigo.ads.w0.AbstractC5496a;
import sg.bigo.ads.x0.AbstractC5503c;
import sg.bigo.ads.x0.AbstractC5507g;
import sg.bigo.ads.x0.C5506f;
import sg.bigo.ads.x0.C5508h;
import sg.bigo.ads.x0.InterfaceC5501a;
import sg.bigo.ads.y0.C5515a;
import sg.bigo.ads.y0.C5517c;

/* renamed from: sg.bigo.ads.b1.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5032e {
    public final sg.bigo.ads.U.h b;
    public final sg.bigo.ads.Q0.n c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final t h = new t();
    public String i = null;
    public final C5028a j = new C5028a(this);

    /* renamed from: a, reason: collision with root package name */
    public final int f12697a = sg.bigo.ads.G0.a.f12309a.incrementAndGet();

    public AbstractC5032e(sg.bigo.ads.U.h hVar, sg.bigo.ads.Q0.n nVar, long j) {
        this.b = hVar;
        this.c = nVar;
        this.d = j;
        hVar.getClass();
        this.e = "";
        u uVar = (u) hVar;
        this.f = uVar.f();
        this.g = uVar.g();
    }

    public abstract void a(int i, int i2, String str);

    public void a(String str, int i, int i2, String str2, HashMap hashMap) {
        a(i, i2, str2);
    }

    public abstract void a(Map map, String str);

    public abstract void a(C5030c c5030c);

    public final void b() {
        JSONObject jSONObject;
        String str;
        InterfaceC5501a i = i();
        sg.bigo.ads.B0.b c5031d = i instanceof sg.bigo.ads.Q0.q ? new C5031d(((u) this.b).b, this.f12697a, (sg.bigo.ads.Q0.q) i, h()) : new sg.bigo.ads.B0.b(this.f12697a, i, ((u) this.b).b);
        boolean z = false;
        int i2 = 0;
        z = false;
        if (sg.bigo.ads.F0.a.f() && !(this instanceof r) && !(this instanceof l)) {
            String str2 = "Missing CCPA consent";
            if (sg.bigo.ads.F0.a.c() == 2) {
                str = "Missing GDPR consent";
                i2 = 1;
            } else {
                str = "Missing CCPA consent";
            }
            if (sg.bigo.ads.F0.a.d() == 2) {
                i2++;
                str = "Missing LGPD consent";
            }
            if (sg.bigo.ads.F0.a.a() == 2) {
                i2++;
            } else {
                str2 = str;
            }
            if (sg.bigo.ads.F0.a.b() == 2) {
                i2++;
                str2 = "Missing COPPA consent";
            }
            if (i2 > 1) {
                str2 = "Missing user consent";
            }
            this.j.a(c5031d, new C5508h(800, str2));
            return;
        }
        try {
            jSONObject = e();
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (((Boolean) sg.bigo.ads.F0.b.a("sp_ads", "sp_ads_encryptpost_request", Boolean.TRUE, 4)).booleanValue() && j()) {
            z = true;
        }
        C5506f g = g();
        c5031d.h = jSONObject;
        c5031d.i = null;
        c5031d.k = g;
        c5031d.l = z;
        c5031d.d = this.d;
        c5031d.a("SDK-Version-Code", BigoAdSdk.getSDKVersion());
        c5031d.c = f();
        AbstractC5503c abstractC5503c = this.j;
        if (abstractC5503c == null) {
            abstractC5503c = AbstractC5503c.f13381a;
        }
        if (AbstractC5507g.a()) {
            AbstractC5507g.b.a(c5031d, abstractC5503c);
            return;
        }
        C5517c c5517c = AbstractC5507g.f13384a;
        c5517c.getClass();
        C5515a c5515a = new C5515a(c5517c, c5031d.c, c5031d, abstractC5503c);
        c5515a.f13420a.execute(c5515a);
    }

    public final JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        Object appKey = ((u) this.b).f12615a.getAppKey();
        Pattern pattern = I.f12345a;
        if (appKey == null) {
            appKey = "";
        }
        jSONObject.putOpt(MBridgeConstans.APP_KEY, appKey);
        Object obj = ((u) this.b).d;
        if (obj == null) {
            obj = "";
        }
        jSONObject.putOpt("pkg_name", obj);
        Object obj2 = ((u) this.b).e;
        if (obj2 == null) {
            obj2 = "";
        }
        jSONObject.putOpt("pkg_ver", obj2);
        jSONObject.putOpt("pkg_vc", Integer.valueOf(((u) this.b).f));
        jSONObject.putOpt("pkg_ch", ((u) this.b).f12615a.getChannel());
        this.b.getClass();
        jSONObject.putOpt(L6.F, "android");
        ((u) this.b).getClass();
        Object obj3 = Build.VERSION.RELEASE;
        if (obj3 == null) {
            obj3 = "";
        }
        jSONObject.putOpt("os_ver", obj3);
        jSONObject.putOpt("os_lang", ((u) this.b).g);
        jSONObject.putOpt("vendor", ((u) this.b).h);
        jSONObject.putOpt("model", ((u) this.b).i);
        jSONObject.putOpt("resolution", ((u) this.b).k);
        jSONObject.putOpt("dpi", Integer.valueOf(((u) this.b).l));
        jSONObject.putOpt("dpi_f", ((u) this.b).m);
        jSONObject.putOpt("net", ((u) this.b).i());
        jSONObject.putOpt("timezone", ((u) this.b).j());
        u uVar = (u) this.b;
        String str = uVar.c.q;
        if (TextUtils.isEmpty(str)) {
            str = uVar.e();
        }
        jSONObject.putOpt("country", str);
        this.b.getClass();
        jSONObject.putOpt("sdk_ver", "5.10.1");
        this.b.getClass();
        jSONObject.putOpt("sdk_vc", 51001);
        jSONObject.putOpt("consent_status", Integer.valueOf(sg.bigo.ads.s1.b.a()));
        if (!sg.bigo.ads.F0.a.f()) {
            Object h = ((u) this.b).h();
            if (h == null) {
                h = "";
            }
            jSONObject.putOpt(L6.X0, h);
            sg.bigo.ads.U.a e = ((u) this.b).c.e();
            String str2 = e != null ? e.f12559a : "";
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.putOpt("hw_id", str2);
            sg.bigo.ads.U.a c = ((u) this.b).c.c();
            String str3 = c != null ? c.f12559a : "";
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.putOpt("fire_id", str3);
            Object c2 = ((u) this.b).c();
            if (c2 == null) {
                c2 = "";
            }
            jSONObject.putOpt("af_id", c2);
            Object obj4 = ((u) this.b).c.w;
            if (obj4 == null) {
                obj4 = "";
            }
            jSONObject.putOpt("uid", obj4);
        }
        if (((Integer) sg.bigo.ads.F0.b.a("sp_ads", "gdpr_check_by_server", (Object) 0, 0)).intValue() == 1) {
            jSONObject.putOpt("tc_string", AbstractC5429c.b());
        }
        ((u) this.b).getClass();
        jSONObject.putOpt("gdpr_switch", Integer.valueOf(sg.bigo.ads.O.f.a()));
        ((u) this.b).getClass();
        long a2 = (int) (O.a() / 1000);
        jSONObject.putOpt("timestamp", Long.valueOf(a2));
        jSONObject.putOpt("abflags", ((u) this.b).c.p);
        jSONObject.putOpt("batsa", Integer.valueOf(sg.bigo.ads.I0.f.a(((u) this.b).b) ? 1 : 0));
        jSONObject.putOpt("datasa", Integer.valueOf(sg.bigo.ads.I0.f.b(((u) this.b).b)));
        jSONObject.putOpt("root", Integer.valueOf(((u) this.b).m() ? 1 : 0));
        String uuid = UUID.randomUUID().toString();
        jSONObject.putOpt(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, uuid != null ? uuid : "");
        this.b.getClass();
        jSONObject.putOpt("sdk_channel", "official");
        jSONObject.putOpt("simulator_file", Integer.valueOf(((u) this.b).s));
        jSONObject.putOpt("sim_country", this.f);
        jSONObject.putOpt("system_country", this.g);
        jSONObject.putOpt("inst_src", ((u) this.b).t);
        a(new C5030c(jSONObject));
        String sb = a(uuid, a2).toString();
        Random random = new Random();
        StringBuilder sb2 = new StringBuilder(16);
        sb2.append(random.nextInt(99999999)).append(random.nextInt(99999999));
        while (sb2.length() < 16) {
            sb2.append('0');
        }
        if (sb2.length() > 16) {
            sb2.delete(16, sb2.length());
        }
        String a3 = C.a(sb + ((Object) sb2));
        if (I.a((CharSequence) a3)) {
            AbstractC5496a.a(SameMD5.TAG, "md5WithSalt is empty!");
        } else {
            char[] cArr = new char[48];
            for (int i = 0; i < 48; i++) {
                int i2 = i / 3;
                int i3 = i % 3;
                if (i3 == 0) {
                    cArr[i] = a3.charAt(i2 * 2);
                } else if (i3 != 1) {
                    cArr[i] = a3.charAt((i2 * 2) + 1);
                } else {
                    cArr[i] = sb2.charAt(i2);
                }
            }
            a3 = new String(cArr);
        }
        jSONObject.putOpt("sign", a3);
        return jSONObject;
    }

    public abstract C5447k f();

    public C5506f g() {
        return sg.bigo.ads.B0.b.q;
    }

    public long h() {
        return 0L;
    }

    public abstract InterfaceC5501a i();

    public abstract boolean j();

    public abstract void k();

    public boolean l() {
        return !(this instanceof r);
    }

    public final void m() {
        sg.bigo.ads.Q0.n nVar = this.c;
        if (nVar == null || (this instanceof q) || this.i != null) {
            return;
        }
        AbstractC5446j.a(nVar.l);
        AbstractC5446j.a(1, null, nVar.l, Math.max(100L, 0L));
    }

    public void a(String str, String str2, HashMap hashMap) {
        a(hashMap, str2);
    }

    public final int a() {
        return this.f12697a;
    }

    public StringBuilder a(String str, long j) {
        StringBuilder sb = new StringBuilder();
        String appKey = ((u) this.b).f12615a.getAppKey();
        Pattern pattern = I.f12345a;
        if (appKey == null) {
            appKey = "";
        }
        sb.append(appKey);
        StringBuilder append = sb.append(",");
        String str2 = ((u) this.b).d;
        if (str2 == null) {
            str2 = "";
        }
        append.append(str2);
        StringBuilder append2 = sb.append(",");
        String str3 = ((u) this.b).e;
        if (str3 == null) {
            str3 = "";
        }
        append2.append(str3);
        sb.append(",").append(((u) this.b).f);
        sb.append(",android,");
        this.b.getClass();
        ((u) this.b).getClass();
        String str4 = Build.VERSION.RELEASE;
        if (str4 == null) {
            str4 = "";
        }
        sb.append(str4);
        sb.append(",5.10.1,51001,");
        this.b.getClass();
        this.b.getClass();
        sb.append(j);
        if (sg.bigo.ads.F0.a.f()) {
            sb.append(",,,");
            String str5 = ((u) this.b).c.w;
            if (str5 == null) {
                str5 = "";
            }
            sb.append(str5);
            sb.append(",");
        } else {
            StringBuilder append3 = sb.append(",");
            String h = ((u) this.b).h();
            if (h == null) {
                h = "";
            }
            append3.append(h);
            StringBuilder append4 = sb.append(",");
            String c = ((u) this.b).c();
            if (c == null) {
                c = "";
            }
            append4.append(c);
            StringBuilder append5 = sb.append(",");
            String str6 = ((u) this.b).c.w;
            if (str6 == null) {
                str6 = "";
            }
            append5.append(str6);
            StringBuilder append6 = sb.append(",");
            sg.bigo.ads.U.a e = ((u) this.b).c.e();
            String str7 = e != null ? e.f12559a : "";
            if (str7 == null) {
                str7 = "";
            }
            append6.append(str7);
        }
        StringBuilder append7 = sb.append(",");
        if (str == null) {
            str = "";
        }
        append7.append(str);
        return sb;
    }
}
