package sg.bigo.ads.u1;

import android.os.Build;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.ironsource.L6;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.O;
import sg.bigo.ads.X0.E;
import sg.bigo.ads.X0.u;
import sg.bigo.ads.c0.C5052c;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f13333a;
    public final long b = System.currentTimeMillis();
    public final Map c;

    public a(Map map, String str) {
        this.f13333a = str;
        this.c = map;
    }

    public final C5052c a(sg.bigo.ads.U.h hVar, long j) {
        JSONObject jSONObject = new JSONObject();
        if (hVar != null) {
            try {
                jSONObject.putOpt(MBridgeConstans.APP_KEY, ((u) hVar).f12615a.getAppKey());
                jSONObject.putOpt("pkg_name", ((u) hVar).d);
                jSONObject.putOpt("pkg_ver", ((u) hVar).e);
                jSONObject.putOpt("pkg_vc", Integer.valueOf(((u) hVar).f));
                jSONObject.putOpt("pkg_ch", ((u) hVar).f12615a.getChannel());
                jSONObject.putOpt(L6.F, "android");
                jSONObject.putOpt("os_ver", Build.VERSION.RELEASE);
                jSONObject.putOpt("os_lang", ((u) hVar).g);
                jSONObject.putOpt("vendor", ((u) hVar).h);
                jSONObject.putOpt("model", ((u) hVar).i);
                jSONObject.putOpt("isp", ((u) hVar).j);
                jSONObject.putOpt("resolution", ((u) hVar).k);
                jSONObject.putOpt("dpi", Integer.valueOf(((u) hVar).l));
                jSONObject.putOpt("dpi_f", ((u) hVar).m);
                u uVar = (u) hVar;
                jSONObject.putOpt("net", uVar.i());
                jSONObject.putOpt("tz", uVar.j());
                jSONObject.putOpt("country", ((u) hVar).c.q);
                jSONObject.putOpt("state", "");
                jSONObject.putOpt("city", "");
                jSONObject.putOpt("sdk_ver", "5.10.1");
                jSONObject.putOpt("sdk_vc", 51001);
                if (sg.bigo.ads.F0.a.f()) {
                    jSONObject.putOpt("consent_status", Integer.valueOf(sg.bigo.ads.s1.b.a()));
                } else {
                    jSONObject.putOpt(L6.X0, uVar.h());
                    sg.bigo.ads.U.a e = uVar.c.e();
                    jSONObject.putOpt("hw_id", e != null ? e.f12559a : "");
                    sg.bigo.ads.U.a c = uVar.c.c();
                    jSONObject.putOpt("fire_id", c != null ? c.f12559a : "");
                    jSONObject.putOpt("af_id", uVar.c());
                }
                jSONObject.putOpt("uid", ((u) hVar).c.w);
                jSONObject.putOpt("ts", Integer.valueOf((int) (O.a() / 1000)));
                jSONObject.putOpt("abflags", ((u) hVar).c.p);
                jSONObject.putOpt("gg_service_ver", ((u) hVar).n);
                jSONObject.putOpt("webkit_ver", ((u) hVar).o);
                jSONObject.putOpt("time", Long.valueOf(this.b));
                jSONObject.putOpt("event_id", this.f13333a);
                jSONObject.putOpt("sdk_channel", "official");
                jSONObject.putOpt("gp_vc", String.valueOf(((u) hVar).w));
                Map map = this.c;
                boolean z = false;
                if (map != null) {
                    if (I.a((CharSequence) map.get(SDKAnalyticsEvents.PARAMETER_SESSION_ID))) {
                        this.c.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, UUID.randomUUID().toString());
                    } else {
                        z = true;
                    }
                    for (Map.Entry entry : this.c.entrySet()) {
                        jSONObject.putOpt((String) entry.getKey(), entry.getValue());
                    }
                }
                if (!z) {
                    jSONObject.putOpt("gps_country", "");
                    jSONObject.putOpt("sim_country", uVar.f());
                    jSONObject.putOpt("system_country", uVar.g());
                }
                E e2 = E.j;
                jSONObject.putOpt("ts_cold", Long.valueOf(e2.i.f12598a));
                jSONObject.putOpt("ts_hot", Long.valueOf(e2.i.b));
            } catch (JSONException unused) {
            }
        }
        return new C5052c(this.f13333a, jSONObject.toString(), j);
    }
}
