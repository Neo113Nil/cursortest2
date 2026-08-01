package sg.bigo.ads.b1;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.ironsource.U3;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.z;
import sg.bigo.ads.X0.C;
import sg.bigo.ads.X0.D;
import sg.bigo.ads.X0.E;
import sg.bigo.ads.X0.u;
import sg.bigo.ads.a.AbstractC5015a;
import sg.bigo.ads.d.C5055a;
import sg.bigo.ads.p0.AbstractC5429c;
import sg.bigo.ads.q0.C5447k;
import sg.bigo.ads.y0.AbstractRunnableC5522h;

/* renamed from: sg.bigo.ads.b1.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5033f extends AbstractC5032e implements m {
    public final sg.bigo.ads.T0.g k;
    public final sg.bigo.ads.N.d l;
    public final sg.bigo.ads.T0.p m;
    public final sg.bigo.ads.P0.d n;

    public C5033f(sg.bigo.ads.T0.g gVar, u uVar, sg.bigo.ads.Q0.n nVar, sg.bigo.ads.N.d dVar, sg.bigo.ads.T0.p pVar, sg.bigo.ads.P0.d dVar2) {
        super(uVar, nVar, pVar.d * 1000);
        this.k = gVar;
        this.l = dVar;
        this.m = pVar;
        this.n = dVar2;
        String str = this.e;
        String str2 = this.f;
        String str3 = this.g;
        sg.bigo.ads.N.c cVar = dVar.h;
        cVar.c = str;
        cVar.d = str2;
        cVar.e = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0160 A[Catch: JSONException -> 0x01f9, TryCatch #0 {JSONException -> 0x01f9, blocks: (B:38:0x0126, B:40:0x013b, B:42:0x0144, B:45:0x014c, B:47:0x0160, B:49:0x0169, B:52:0x0172, B:54:0x0178, B:55:0x017d, B:57:0x0192, B:58:0x019f, B:60:0x01b3, B:61:0x01c0, B:63:0x01d4, B:64:0x01e1, B:67:0x01f1, B:71:0x01db, B:72:0x01ba, B:73:0x0199, B:74:0x017b), top: B:37:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0178 A[Catch: JSONException -> 0x01f9, TryCatch #0 {JSONException -> 0x01f9, blocks: (B:38:0x0126, B:40:0x013b, B:42:0x0144, B:45:0x014c, B:47:0x0160, B:49:0x0169, B:52:0x0172, B:54:0x0178, B:55:0x017d, B:57:0x0192, B:58:0x019f, B:60:0x01b3, B:61:0x01c0, B:63:0x01d4, B:64:0x01e1, B:67:0x01f1, B:71:0x01db, B:72:0x01ba, B:73:0x0199, B:74:0x017b), top: B:37:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0192 A[Catch: JSONException -> 0x01f9, TryCatch #0 {JSONException -> 0x01f9, blocks: (B:38:0x0126, B:40:0x013b, B:42:0x0144, B:45:0x014c, B:47:0x0160, B:49:0x0169, B:52:0x0172, B:54:0x0178, B:55:0x017d, B:57:0x0192, B:58:0x019f, B:60:0x01b3, B:61:0x01c0, B:63:0x01d4, B:64:0x01e1, B:67:0x01f1, B:71:0x01db, B:72:0x01ba, B:73:0x0199, B:74:0x017b), top: B:37:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b3 A[Catch: JSONException -> 0x01f9, TryCatch #0 {JSONException -> 0x01f9, blocks: (B:38:0x0126, B:40:0x013b, B:42:0x0144, B:45:0x014c, B:47:0x0160, B:49:0x0169, B:52:0x0172, B:54:0x0178, B:55:0x017d, B:57:0x0192, B:58:0x019f, B:60:0x01b3, B:61:0x01c0, B:63:0x01d4, B:64:0x01e1, B:67:0x01f1, B:71:0x01db, B:72:0x01ba, B:73:0x0199, B:74:0x017b), top: B:37:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d4 A[Catch: JSONException -> 0x01f9, TryCatch #0 {JSONException -> 0x01f9, blocks: (B:38:0x0126, B:40:0x013b, B:42:0x0144, B:45:0x014c, B:47:0x0160, B:49:0x0169, B:52:0x0172, B:54:0x0178, B:55:0x017d, B:57:0x0192, B:58:0x019f, B:60:0x01b3, B:61:0x01c0, B:63:0x01d4, B:64:0x01e1, B:67:0x01f1, B:71:0x01db, B:72:0x01ba, B:73:0x0199, B:74:0x017b), top: B:37:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01db A[Catch: JSONException -> 0x01f9, TryCatch #0 {JSONException -> 0x01f9, blocks: (B:38:0x0126, B:40:0x013b, B:42:0x0144, B:45:0x014c, B:47:0x0160, B:49:0x0169, B:52:0x0172, B:54:0x0178, B:55:0x017d, B:57:0x0192, B:58:0x019f, B:60:0x01b3, B:61:0x01c0, B:63:0x01d4, B:64:0x01e1, B:67:0x01f1, B:71:0x01db, B:72:0x01ba, B:73:0x0199, B:74:0x017b), top: B:37:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ba A[Catch: JSONException -> 0x01f9, TryCatch #0 {JSONException -> 0x01f9, blocks: (B:38:0x0126, B:40:0x013b, B:42:0x0144, B:45:0x014c, B:47:0x0160, B:49:0x0169, B:52:0x0172, B:54:0x0178, B:55:0x017d, B:57:0x0192, B:58:0x019f, B:60:0x01b3, B:61:0x01c0, B:63:0x01d4, B:64:0x01e1, B:67:0x01f1, B:71:0x01db, B:72:0x01ba, B:73:0x0199, B:74:0x017b), top: B:37:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0199 A[Catch: JSONException -> 0x01f9, TryCatch #0 {JSONException -> 0x01f9, blocks: (B:38:0x0126, B:40:0x013b, B:42:0x0144, B:45:0x014c, B:47:0x0160, B:49:0x0169, B:52:0x0172, B:54:0x0178, B:55:0x017d, B:57:0x0192, B:58:0x019f, B:60:0x01b3, B:61:0x01c0, B:63:0x01d4, B:64:0x01e1, B:67:0x01f1, B:71:0x01db, B:72:0x01ba, B:73:0x0199, B:74:0x017b), top: B:37:0x0126 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017b A[Catch: JSONException -> 0x01f9, TryCatch #0 {JSONException -> 0x01f9, blocks: (B:38:0x0126, B:40:0x013b, B:42:0x0144, B:45:0x014c, B:47:0x0160, B:49:0x0169, B:52:0x0172, B:54:0x0178, B:55:0x017d, B:57:0x0192, B:58:0x019f, B:60:0x01b3, B:61:0x01c0, B:63:0x01d4, B:64:0x01e1, B:67:0x01f1, B:71:0x01db, B:72:0x01ba, B:73:0x0199, B:74:0x017b), top: B:37:0x0126 }] */
    @Override // sg.bigo.ads.b1.AbstractC5032e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(C5030c c5030c) {
        E e;
        long j;
        long j2;
        E e2;
        long j3;
        long j4;
        Object obj = this.m.l;
        Pattern pattern = I.f12345a;
        if (obj == null) {
            obj = "";
        }
        c5030c.a(obj, "slot");
        Object obj2 = this.m.n;
        if (obj2 == null) {
            obj2 = "";
        }
        c5030c.a(obj2, "placement_id");
        c5030c.a(this.m.f12557a, "strategy_id");
        int a2 = this.l.a();
        SparseArray sparseArray = sg.bigo.ads.P.a.f12475a;
        StringBuilder sb = new StringBuilder();
        List<Integer> list = (List) sg.bigo.ads.P.a.f12475a.get(a2);
        if (list != null) {
            for (Integer num : list) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(num);
            }
        }
        c5030c.a(sb.toString(), "support_adx_types");
        sg.bigo.ads.U.a d = ((u) this.b).c.d();
        int i = 1;
        c5030c.a(Integer.valueOf(d != null ? d.b : 1), "lat_enable");
        sg.bigo.ads.U.a e3 = ((u) this.b).c.e();
        c5030c.a(Integer.valueOf(e3 != null ? e3.b : 1), "hw_lat_enable");
        sg.bigo.ads.U.a c = ((u) this.b).c.c();
        c5030c.a(Integer.valueOf(c != null ? c.b : 1), "fire_lat_enable");
        c5030c.a(this.k.m, "token");
        c5030c.a(this.m.a(), "slot_abflags");
        c5030c.a(this.k.p, "global_abflags");
        c5030c.a(Integer.valueOf(this.m.s), "support_playable_ad");
        c5030c.a(this.l.h.b, SDKAnalyticsEvents.PARAMETER_SESSION_ID);
        int b = sg.bigo.ads.a0.o.b();
        c5030c.a(Integer.valueOf(b), "req_status");
        sg.bigo.ads.N.d dVar = this.l;
        dVar.h.g = b;
        ((u) this.b).getClass();
        String e4 = sg.bigo.ads.F0.a.e();
        sg.bigo.ads.N.c cVar = dVar.h;
        if (cVar != null) {
            cVar.h = e4;
        }
        E e5 = E.j;
        if (e5.f12599a) {
            String str = this.m.l;
            if (str == null) {
                str = "";
            }
            D d2 = e5.i;
            d2.getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("start_ts", Long.valueOf(d2.c));
                e = d2.d;
                j = e.g;
            } catch (JSONException unused) {
            }
            if (j > 0) {
                j2 = SystemClock.elapsedRealtime() - j;
                if (j2 > 0 && j2 > e.b) {
                    jSONObject.putOpt("total_duration", Long.valueOf(e.e + j2));
                    e2 = d2.d;
                    j3 = e2.g;
                    if (j3 > 0) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
                        if (elapsedRealtime > 0 && elapsedRealtime > e2.b) {
                            j4 = elapsedRealtime;
                            if (j4 > e2.b) {
                                e2.f = j4;
                            } else {
                                j4 = e2.f;
                            }
                            jSONObject.putOpt("close_duration", Long.valueOf(j4));
                            C c2 = C.c;
                            jSONObject.putOpt("front_total_req_times", Long.valueOf(c2.a(str).d.b ? r9.f12596a.getAndAdd(1) : r9.f12596a.get()));
                            jSONObject.putOpt("back_total_req_times", Long.valueOf(!c2.a(str).d.b ? r9.b.getAndAdd(1) : r9.b.get()));
                            jSONObject.putOpt("close_front_req_times", Long.valueOf(c2.a(str).d.b ? r5.c.getAndAdd(1) : r5.c.get()));
                            if (!d2.d.d) {
                                i = 2;
                            }
                            jSONObject.putOpt("req_status", Long.valueOf(i));
                            c5030c.a(jSONObject.toString(), "algo_info");
                        }
                    }
                    j4 = 0;
                    if (j4 > e2.b) {
                    }
                    jSONObject.putOpt("close_duration", Long.valueOf(j4));
                    C c22 = C.c;
                    jSONObject.putOpt("front_total_req_times", Long.valueOf(c22.a(str).d.b ? r9.f12596a.getAndAdd(1) : r9.f12596a.get()));
                    jSONObject.putOpt("back_total_req_times", Long.valueOf(!c22.a(str).d.b ? r9.b.getAndAdd(1) : r9.b.get()));
                    jSONObject.putOpt("close_front_req_times", Long.valueOf(c22.a(str).d.b ? r5.c.getAndAdd(1) : r5.c.get()));
                    if (!d2.d.d) {
                    }
                    jSONObject.putOpt("req_status", Long.valueOf(i));
                    c5030c.a(jSONObject.toString(), "algo_info");
                }
            }
            j2 = 0;
            jSONObject.putOpt("total_duration", Long.valueOf(e.e + j2));
            e2 = d2.d;
            j3 = e2.g;
            if (j3 > 0) {
            }
            j4 = 0;
            if (j4 > e2.b) {
            }
            jSONObject.putOpt("close_duration", Long.valueOf(j4));
            C c222 = C.c;
            jSONObject.putOpt("front_total_req_times", Long.valueOf(c222.a(str).d.b ? r9.f12596a.getAndAdd(1) : r9.f12596a.get()));
            jSONObject.putOpt("back_total_req_times", Long.valueOf(!c222.a(str).d.b ? r9.b.getAndAdd(1) : r9.b.get()));
            jSONObject.putOpt("close_front_req_times", Long.valueOf(c222.a(str).d.b ? r5.c.getAndAdd(1) : r5.c.get()));
            if (!d2.d.d) {
            }
            jSONObject.putOpt("req_status", Long.valueOf(i));
            c5030c.a(jSONObject.toString(), "algo_info");
        }
        c5030c.a(Integer.valueOf(this.m.v), "auc_mode");
        if (sg.bigo.ads.P.a.b(this.m.b)) {
            sg.bigo.ads.T0.p pVar = this.m;
            if (pVar.r == null) {
                pVar.r = new sg.bigo.ads.T0.q(new JSONObject());
            }
            Integer a3 = z.a(pVar.r.a("splash_orientation"));
            c5030c.a(Integer.valueOf(a3 != null ? a3.intValue() : 0), U3.i.n);
        } else {
            sg.bigo.ads.T0.g gVar = sg.bigo.ads.O.g.f12472a;
            c5030c.a(Integer.valueOf(gVar == null ? 0 : gVar.O), U3.i.n);
        }
        Map b2 = this.l.b();
        if (b2 != null) {
            for (Map.Entry entry : b2.entrySet()) {
                c5030c.a(entry.getValue(), (String) entry.getKey());
            }
        }
        String str2 = this.l.h.f12464a;
        if (!I.a((CharSequence) str2)) {
            c5030c.a(str2, "load_ext");
        }
        String a4 = h.a(this.l, this.b);
        if (!TextUtils.isEmpty(a4)) {
            c5030c.a(a4, "ad_info");
        }
        sg.bigo.ads.U.b d3 = ((u) this.b).d();
        c5030c.a(d3 != null ? String.valueOf(d3.c) : "", "bat_stat");
        c5030c.a(d3 != null ? String.valueOf(d3.f12560a) : "", "bat_num");
        c5030c.a(d3 != null ? String.valueOf(d3.b) : "", "bat_scale");
        c5030c.a(AbstractC5429c.b(), "tc_string");
        if (!(this instanceof n)) {
            c5030c.a(Integer.valueOf(((u) this.b).c.B.a(25) ? 2 : 0), "imp_pattern");
        }
        c5030c.a(Integer.valueOf(((u) this.b).w), "gp_vc");
        c5030c.a(Integer.valueOf(((u) this.b).c.B.a(28) ? 1 : 0), "webp_gif");
        C5055a a5 = BigoAdSdk.a(((u) this.b).b);
        JSONObject jSONObject2 = a5 != null ? a5.f : null;
        c5030c.a(Integer.valueOf(jSONObject2 != null ? jSONObject2.optInt(AbstractC5015a.c, 0) : 0), "anti_boot_count");
        C5055a a6 = BigoAdSdk.a(((u) this.b).b);
        JSONObject jSONObject3 = a6 != null ? a6.f : null;
        c5030c.a(jSONObject3 != null ? jSONObject3.optString(AbstractC5015a.h, "") : "", "anti_sig");
        c5030c.a(Integer.valueOf(((u) this.b).a()), "anti_detect_key");
        C5055a a7 = BigoAdSdk.a(((u) this.b).b);
        JSONObject jSONObject4 = a7 != null ? a7.f : null;
        c5030c.a(jSONObject4 != null ? String.valueOf(jSONObject4.optLong("anti_info_update_millis", 0L)) : "", "anti_update_time");
        this.b.getClass();
        c5030c.a("1.3.0", "om_ver");
    }

    @Override // sg.bigo.ads.b1.m
    public final sg.bigo.ads.N.d c() {
        return this.l;
    }

    @Override // sg.bigo.ads.b1.m
    public final sg.bigo.ads.T0.p d() {
        return this.m;
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final C5447k f() {
        return AbstractRunnableC5522h.a();
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final long h() {
        sg.bigo.ads.Q0.n nVar = this.c;
        if (nVar != null) {
            return nVar.f12510a.o.b;
        }
        return 0L;
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public boolean j() {
        return sg.bigo.ads.O.g.f12472a.B.a(7) && ((Boolean) sg.bigo.ads.F0.b.a("sp_ads", "sp_ads_encryptaddata_request", Boolean.TRUE, 4)).booleanValue();
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public void k() {
        sg.bigo.ads.F0.b.b("sp_ads", "sp_ads_encryptaddata_request", Boolean.FALSE, 4);
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public sg.bigo.ads.Q0.q i() {
        return this.c.a("/Ad/GetUniAd", (String) null);
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final void a(int i, int i2, String str) {
        sg.bigo.ads.P0.d dVar = this.n;
        if (dVar != null) {
            dVar.a(this.f12697a, i, i2, str, this.m);
        }
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public void a(Map map, String str) {
        if (this.n != null) {
            Object obj = ((HashMap) map).get("logid");
            sg.bigo.ads.U0.b a2 = sg.bigo.ads.U0.b.a(obj instanceof Long ? ((Long) obj).longValue() : 0L, this.l.h, this.m, str);
            if (a2 != null) {
                this.n.a(this.f12697a, this.l, a2);
            } else {
                a(1005, 0, "Invalid ad data.");
            }
        }
    }

    @Override // sg.bigo.ads.b1.AbstractC5032e
    public final StringBuilder a(String str, long j) {
        StringBuilder a2 = super.a(str, j);
        StringBuilder append = a2.append(",");
        String str2 = this.m.l;
        Pattern pattern = I.f12345a;
        if (str2 == null) {
            str2 = "";
        }
        append.append(str2);
        StringBuilder append2 = a2.append(",");
        String str3 = this.m.n;
        append2.append(str3 != null ? str3 : "");
        return a2;
    }
}
