package sg.bigo.ads.X0;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.network.ErrorCodes;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.O;
import sg.bigo.ads.d.C5055a;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class z extends sg.bigo.ads.P0.b {

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.U.h f12619a;
    public final sg.bigo.ads.T0.g b;
    public final sg.bigo.ads.T0.n c;
    public final sg.bigo.ads.Q0.n d;
    public int j;
    public int k;
    public final Context l;
    public long g = -1;
    public boolean h = false;
    public final ArrayList e = new ArrayList();
    public final AtomicReference f = new AtomicReference();
    public final AtomicInteger i = new AtomicInteger(0);

    public z(Context context, sg.bigo.ads.T0.g gVar, sg.bigo.ads.T0.n nVar, u uVar, sg.bigo.ads.Q0.n nVar2) {
        this.l = context;
        this.f12619a = uVar;
        this.b = gVar;
        this.c = nVar;
        this.d = nVar2;
    }

    public static Pair a(z zVar, JSONObject jSONObject, JSONArray jSONArray, String str, String str2) {
        zVar.getClass();
        if (!I.a((CharSequence) str) || !I.a((CharSequence) str2)) {
            boolean equals = TextUtils.equals(str, zVar.b.W);
            boolean equals2 = TextUtils.equals(str2, zVar.c.f);
            if (equals || equals2) {
                if (jSONObject != null) {
                    if (equals) {
                        sg.bigo.ads.T0.g gVar = zVar.b;
                        gVar.getClass();
                        gVar.k = jSONObject.optLong("config_id", 0L);
                        gVar.m = jSONObject.optString("token", "");
                    } else {
                        zVar.a(str, jSONObject);
                        str = "";
                    }
                    zVar.b.c(zVar.l);
                } else {
                    str = "";
                }
                if (!equals2) {
                    if (jSONArray != null) {
                        zVar.c.a(jSONArray, str2);
                        zVar.c.c(zVar.l);
                    }
                    str2 = "";
                }
                C5055a a2 = BigoAdSdk.a(zVar.l);
                a2.e = ((u) zVar.f12619a).f12615a.getAppKey();
                a2.c(zVar.l);
                if (!I.a((CharSequence) str) || !I.a((CharSequence) str2)) {
                    return new Pair(str, str2);
                }
            }
        }
        return null;
    }

    public final void b(int i, String str) {
        this.f.set(null);
        if (this.e.isEmpty()) {
            return;
        }
        ((y) this.e.remove(0)).a(this.k, i, str);
        if (this.e.isEmpty()) {
            return;
        }
        a(this.j, this.k);
    }

    public final void a(x xVar, int i) {
        y yVar = new y(((u) this.f12619a).f12615a.getAppKey(), xVar, this.b, this.c, this.f12619a, this.d, this);
        sg.bigo.ads.T0.g gVar = this.b;
        gVar.getClass();
        boolean z = Math.abs((O.a() / 1000) - gVar.i) > ((long) gVar.l);
        int i2 = gVar.o == 0 ? z ? 4 : 5 : z ? 3 : 2;
        if (i2 != 2) {
            if (i2 == 3) {
                this.e.add(yVar);
            } else if (i2 == 4) {
                yVar.a(i2);
            } else if (i2 != 5) {
                return;
            }
            a(i, i2);
            return;
        }
        yVar.a(i2);
    }

    public final void a(int i, int i2) {
        if (this.f.get() != null) {
            return;
        }
        AtomicReference atomicReference = this.f;
        sg.bigo.ads.U.h hVar = this.f12619a;
        sg.bigo.ads.Q0.n nVar = this.d;
        sg.bigo.ads.T0.n nVar2 = this.c;
        this.b.getClass();
        atomicReference.set(new sg.bigo.ads.b1.l(hVar, nVar, nVar2, 30 * 1000, this));
        this.j = i;
        this.g = SystemClock.elapsedRealtime();
        this.h = sg.bigo.ads.a0.o.e > 0;
        this.i.incrementAndGet();
        this.k = i2;
        String appKey = ((u) this.f12619a).f12615a.getAppKey();
        if (I.a((CharSequence) appKey)) {
            b(ErrorCodes.THROWABLE, "App id cannot be empty, please pass the id when initializing bigo sdk");
        } else if (t.a(t.c.f12614a, appKey)) {
            ((sg.bigo.ads.b1.l) this.f.get()).b();
        } else {
            b(1101, "The slot id is invalid, please make sure the id is aligned with app id.");
        }
    }

    @Override // sg.bigo.ads.P0.d
    public final void a(int i, int i2, int i3, String str, Object obj) {
        AbstractC5446j.a(3, new w(this, i, i2, str, i3));
    }

    @Override // sg.bigo.ads.P0.b
    public final void a(int i, String str) {
        AbstractC5446j.a(3, new v(this, i, str, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x027a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x028f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(String str, JSONObject jSONObject) {
        JSONArray jSONArray;
        int i;
        sg.bigo.ads.Q0.b bVar;
        sg.bigo.ads.R0.i iVar;
        sg.bigo.ads.R0.h hVar;
        sg.bigo.ads.R0.h hVar2;
        JSONObject optJSONObject;
        if (jSONObject == null) {
            return;
        }
        sg.bigo.ads.T0.g gVar = this.b;
        gVar.getClass();
        gVar.j = jSONObject.optInt("state", 1) == 1;
        gVar.k = jSONObject.optLong("config_id", 0L);
        gVar.l = jSONObject.optInt("conf_interval", 3600);
        gVar.m = jSONObject.optString("token", "");
        gVar.n = jSONObject.optString("anti_ban", "");
        gVar.o = jSONObject.optInt("config_strategy", 1);
        gVar.p = jSONObject.optString("abflags", "");
        gVar.q = jSONObject.optString("country", "");
        gVar.I = jSONObject.optString("req_country", "");
        int optInt = jSONObject.optInt("app_flag", 0);
        int i2 = optInt != gVar.M ? (int) (0 | 1) : 0;
        gVar.M = optInt;
        gVar.N = jSONObject.optInt("ad_net", 0);
        gVar.O = jSONObject.optInt(U3.i.n, 0);
        gVar.U = jSONObject.optInt("token_v", 0);
        gVar.V = jSONObject.optInt("token_exp", 0);
        String optString = jSONObject.optString("host_retry_cfg", "");
        gVar.P = optString;
        gVar.a(optString);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("creatives");
        if (optJSONObject2 != null) {
            gVar.r = optJSONObject2.toString();
        } else {
            gVar.r = "";
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("track");
        if (optJSONObject3 != null) {
            gVar.s = optJSONObject3.toString();
        } else {
            gVar.s = "";
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("cb");
        if (optJSONObject4 != null) {
            gVar.t = optJSONObject4.toString();
        } else {
            gVar.t = "";
        }
        JSONObject optJSONObject5 = jSONObject.optJSONObject("report");
        if (optJSONObject5 != null) {
            gVar.u = optJSONObject5.toString();
        } else {
            gVar.u = "";
        }
        gVar.v = "";
        gVar.H = "";
        String optString2 = jSONObject.optString("uid", "");
        if (!TextUtils.isEmpty(optString2)) {
            gVar.w = optString2;
        }
        int optInt2 = jSONObject.optInt("concurrent_req_num", 3);
        gVar.x = optInt2;
        if (optInt2 <= 0) {
            gVar.x = Integer.MAX_VALUE;
        }
        gVar.y = jSONObject.optInt("neg_feedback", 1) == 1;
        gVar.z = jSONObject.optString("om_js_url", "");
        gVar.A = jSONObject.optString("banner_js_url", "");
        JSONObject optJSONObject6 = jSONObject.optJSONObject("free_material");
        sg.bigo.ads.P.p pVar = gVar.C;
        pVar.getClass();
        if (optJSONObject6 != null) {
            pVar.f12488a = optJSONObject6.optInt("id_show_loading", 2);
            pVar.b = optJSONObject6.optInt("loading_timeout", 3);
            pVar.c = optJSONObject6.optInt("material_show_close_button", 5);
        }
        JSONObject optJSONObject7 = jSONObject.optJSONObject("u_running_conf");
        sg.bigo.ads.P.v vVar = gVar.D;
        vVar.getClass();
        if (optJSONObject7 != null) {
            vVar.f12494a = optJSONObject7.optInt("duration_on", 0);
            vVar.b = optJSONObject7.optLong("duration_valid_interval", 5000L);
            vVar.c = optJSONObject7.optLong("suspend_limit", 21600000L);
        }
        JSONObject optJSONObject8 = jSONObject.optJSONObject("u_running_inf");
        sg.bigo.ads.P.w wVar = gVar.E;
        wVar.getClass();
        if (optJSONObject8 != null) {
            wVar.f12495a = optJSONObject8.optInt("ll_on", 0);
        }
        gVar.B.f12489a = jSONObject.optLong("global_switch", 0L);
        gVar.F = "";
        sg.bigo.ads.T0.e eVar = gVar.J;
        String optString3 = jSONObject.optString("ad_fill_strategy");
        eVar.getClass();
        if (!TextUtils.isEmpty(optString3)) {
            try {
                JSONObject jSONObject2 = new JSONObject(optString3);
                eVar.f12551a = jSONObject2.optInt(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, 0);
                eVar.b = jSONObject2.optString("white_dsp", "");
                eVar.c = jSONObject2.optString("black_dsp", "");
                eVar.d = jSONObject2.optInt("int_time", 0);
                eVar.e = jSONObject2.optInt("rew_time", 0);
                eVar.f = jSONObject2.optInt("spl_time", 0);
                eVar.g = jSONObject2.optInt("nat_time", 0);
                eVar.h = jSONObject2.optInt("pop_time", 0);
                eVar.i.a(jSONObject2);
                eVar.j.a(jSONObject2);
                eVar.k.a(jSONObject2);
                eVar.l.a(jSONObject2);
                eVar.m.a(jSONObject2);
            } catch (JSONException unused) {
            }
        }
        gVar.L.c(jSONObject.optString("ad_fill_cost_optimize_strategy"));
        sg.bigo.ads.T0.f fVar = gVar.K;
        JSONObject optJSONObject9 = jSONObject.optJSONObject("gdpr");
        fVar.getClass();
        if (optJSONObject9 != null) {
            fVar.f12552a = optJSONObject9.optInt("check_by_server", 0);
            fVar.b = optJSONObject9.optInt("check_only_purpose", 0);
            fVar.c = optJSONObject9.optInt("check_vendor", 0);
        }
        String optString4 = jSONObject.optString("global_conf");
        if (!I.a((CharSequence) optString4)) {
            jSONArray = new JSONArray(optString4);
            HashMap hashMap = new HashMap();
            for (i = 0; jSONArray != null && i < jSONArray.length(); i++) {
                optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    String optString5 = optJSONObject.optString("key");
                    if (!I.a((CharSequence) optString5)) {
                        hashMap.put(optString5, new sg.bigo.ads.O.b(optJSONObject.optString("value", "")));
                    }
                }
            }
            gVar.G = hashMap;
            sg.bigo.ads.P.u uVar = gVar.X;
            if (optJSONObject3 != null) {
                uVar.f12493a = false;
                uVar.b = "";
                uVar.c = 3;
                uVar.d = 20000;
            } else {
                uVar.f12493a = true;
                uVar.b = optJSONObject3.optString("http_succ_code");
                uVar.c = optJSONObject3.optInt("retry_cnt", 3);
                int optInt3 = optJSONObject3.optInt("retry_interval") * 1000;
                uVar.d = optInt3;
                if (optInt3 < 20000) {
                    uVar.d = 20000;
                }
            }
            gVar.b(optJSONObject2);
            gVar.c(optJSONObject5);
            gVar.a(optJSONObject4);
            gVar.W = str;
            gVar.i = O.a() / 1000;
            if ((i2 & 1) != 0 && (bVar = this.d.f12510a) != null) {
                iVar = bVar.j;
                if (iVar != null) {
                    iVar.b();
                }
                hVar = bVar.k;
                if (hVar != null) {
                    hVar.b();
                }
                hVar2 = bVar.l;
                if (hVar2 != null) {
                    hVar2.b();
                }
                bVar.a(0L);
            }
            E e = E.j;
            sg.bigo.ads.P.v vVar2 = this.b.D;
            e.getClass();
            e.f12599a = vVar2.f12494a == 1;
            e.b = vVar2.b;
            e.c = vVar2.c;
        }
        jSONArray = null;
        HashMap hashMap2 = new HashMap();
        while (jSONArray != null) {
            optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
            }
        }
        gVar.G = hashMap2;
        sg.bigo.ads.P.u uVar2 = gVar.X;
        if (optJSONObject3 != null) {
        }
        gVar.b(optJSONObject2);
        gVar.c(optJSONObject5);
        gVar.a(optJSONObject4);
        gVar.W = str;
        gVar.i = O.a() / 1000;
        if ((i2 & 1) != 0) {
            iVar = bVar.j;
            if (iVar != null) {
            }
            hVar = bVar.k;
            if (hVar != null) {
            }
            hVar2 = bVar.l;
            if (hVar2 != null) {
            }
            bVar.a(0L);
        }
        E e2 = E.j;
        sg.bigo.ads.P.v vVar22 = this.b.D;
        e2.getClass();
        e2.f12599a = vVar22.f12494a == 1;
        e2.b = vVar22.b;
        e2.c = vVar22.c;
    }
}
