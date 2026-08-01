package sg.bigo.ads.f1;

import android.text.TextUtils;
import android.util.SparseArray;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.z;
import sg.bigo.ads.N.d;
import sg.bigo.ads.O.g;
import sg.bigo.ads.P.c;
import sg.bigo.ads.P.s;
import sg.bigo.ads.Q.e;
import sg.bigo.ads.T0.p;
import sg.bigo.ads.U0.k;
import sg.bigo.ads.api.IconAdsRequest;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.g.C5122e;

/* loaded from: classes3.dex */
public abstract class a {
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01b1, code lost:
    
        if (r0.b1.get() > 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01c5, code lost:
    
        r0 = r0.b1.get();
        r6 = "ad_imp_indx";
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01c3, code lost:
    
        if (r0.b1.get() > 0) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap a(String str, p pVar, d dVar, c cVar, Integer num, String str2, String str3, sg.bigo.ads.Q.b bVar) {
        JSONObject jSONObject;
        k kVar;
        s i;
        e eVar;
        HashMap a2 = a(str, pVar, dVar, cVar, num);
        Object obj = a2.get("extra_json");
        if (obj != null && (obj instanceof String)) {
            try {
                jSONObject = new JSONObject((String) obj);
            } catch (JSONException unused) {
            } finally {
                new JSONObject();
            }
        }
        String str4 = "icon_fill_num";
        if (bVar instanceof e) {
            eVar = (e) bVar;
            c cVar2 = (c) A.b(eVar.m());
            if (cVar2 != null) {
                sg.bigo.ads.U0.b bVar2 = (sg.bigo.ads.U0.b) cVar2;
                a2.put("adx_type", Integer.valueOf(bVar2.k));
                a2.put("sid", Long.valueOf(bVar2.m));
                a2.put("dsp", bVar2.j);
                a2.put("logid", Long.valueOf(bVar2.B));
            }
            str.hashCode();
            switch (str) {
                case "filled":
                    int i2 = ((C5122e) eVar).l.length;
                    z.a(jSONObject, str4, Integer.valueOf(i2));
                    break;
                case "impression":
                case "clicked":
                    z.a(jSONObject, "icon_fill_num", Integer.valueOf(((C5122e) eVar).l.length));
                    z.a(jSONObject, "icon_show_num", Integer.valueOf(eVar.n()));
                    break;
            }
            z.a(jSONObject, SDKAnalyticsEvents.PARAMETER_SESSION_ID, dVar.h.b);
            if (str2 != null) {
                z.a(jSONObject, "sec_price", str2);
            }
            if (str3 != null) {
                z.a(jSONObject, "sec_bidder", str3);
            }
            i = bVar == null ? bVar.i() : null;
            if (i != null && i.f12491a != null) {
                z.a(jSONObject, "is_vpaid", 1);
            }
            a2.put("extra_json", jSONObject.toString());
            return a2;
        }
        if (cVar != null) {
            sg.bigo.ads.Q.b bVar3 = bVar != null ? bVar.g : null;
            if (bVar3 instanceof e) {
                e eVar2 = (e) bVar3;
                z.a(jSONObject, "icon_fill_num", Integer.valueOf(((C5122e) eVar2).l.length));
                z.a(jSONObject, "icon_show_num", Integer.valueOf(eVar2.n()));
            }
            sg.bigo.ads.U0.b bVar4 = (sg.bigo.ads.U0.b) cVar;
            a2.put("ad_id", bVar4.f);
            a2.put(CampaignEx.JSON_KEY_CREATIVE_ID, bVar4.n);
            a2.put("sid", Long.valueOf(bVar4.m));
            a2.put("series_id", bVar4.o);
            a2.put("adx_type", Integer.valueOf(bVar4.k));
            a2.put("mapping_slot", bVar4.y);
            a2.put("enc_price", bVar4.v);
            String str5 = bVar4.x;
            if (!TextUtils.isEmpty(str5)) {
                a2.put("abflags", I.a((String) a2.get("abflags"), str5));
            }
            z.a(jSONObject, "dsp", bVar4.j);
            z.a(jSONObject, "logid", Long.valueOf(bVar4.B));
            int i3 = pVar.b;
            SparseArray sparseArray = sg.bigo.ads.P.a.f12475a;
            if (i3 == 3 || i3 == 4 || i3 == 12 || i3 == 20) {
                z.a(jSONObject, "style_id", !I.a((CharSequence) bVar4.K) ? bVar4.K : bVar4.c.q);
            }
            if (str.equals("impression")) {
                if (cVar instanceof InterfaceC5087a) {
                    kVar = (k) ((InterfaceC5087a) cVar);
                }
            } else if (str.equals("clicked")) {
                boolean z = cVar instanceof InterfaceC5087a;
                if (z) {
                    k kVar2 = (k) ((InterfaceC5087a) cVar);
                    if (kVar2.c1.get() > 0) {
                        z.a(jSONObject, "ad_click_indx", Integer.valueOf(kVar2.c1.get()));
                    }
                }
                if (z) {
                    kVar = (k) ((InterfaceC5087a) cVar);
                }
            }
            z.a(jSONObject, str4, Integer.valueOf(i2));
        }
        z.a(jSONObject, SDKAnalyticsEvents.PARAMETER_SESSION_ID, dVar.h.b);
        if (str2 != null) {
        }
        if (str3 != null) {
        }
        if (bVar == null) {
        }
        if (i != null) {
            z.a(jSONObject, "is_vpaid", 1);
        }
        a2.put("extra_json", jSONObject.toString());
        return a2;
    }

    public static HashMap a(String str, p pVar, d dVar, c cVar, Integer num) {
        c cVar2;
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        hashMap.put("slot", pVar.l);
        hashMap.put("config_id", Long.valueOf(g.f12472a.k));
        hashMap.put("placement_id", pVar.n);
        hashMap.put("strategy_id", pVar.f12557a);
        hashMap.put("ad_type", Integer.valueOf(pVar.b));
        hashMap.put("abflags", I.a(g.f12472a.p, pVar.a()));
        hashMap.put("ts", Long.valueOf(System.currentTimeMillis()));
        hashMap.put("begin_ts", Long.valueOf(dVar.h.f));
        hashMap.put("banner_type", Integer.valueOf(dVar.c));
        hashMap.put("adn_name", "bigoad");
        JSONObject jSONObject = new JSONObject();
        sg.bigo.ads.N.c cVar3 = dVar.h;
        z.a(jSONObject, SDKAnalyticsEvents.PARAMETER_SESSION_ID, cVar3.b);
        z.a(jSONObject, "gps_country", cVar3.c);
        z.a(jSONObject, "sim_country", cVar3.d);
        z.a(jSONObject, "system_country", cVar3.e);
        z.a(jSONObject, "req_status", Integer.valueOf(cVar3.g));
        String str2 = (String) sg.bigo.ads.F0.b.a("sp_ads", "sp_asn_local", "", 3);
        z.a(jSONObject, "asn_local", TextUtils.isEmpty(str2) ? "" : str2);
        if (cVar != null) {
            z.a(jSONObject, "adx_country", ((sg.bigo.ads.U0.b) cVar).S);
        }
        if (pVar.v == 3) {
            z.a(jSONObject, "config_country", g.f12472a.q);
        }
        String str3 = cVar3.f12464a;
        if (!I.a((CharSequence) str3)) {
            z.a(jSONObject, "load_ext", str3);
        }
        if (num != null) {
            z.a(jSONObject, "auc_mode", num);
        }
        boolean z = dVar instanceof IconAdsRequest;
        if (z && (cVar2 = ((IconAdsRequest) dVar).j) != null) {
            sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar2;
            z.a(jSONObject, "host_slot", bVar.c.l);
            z.a(jSONObject, "host_placement", bVar.c.n);
            z.a(jSONObject, "host_sid", Long.valueOf(bVar.m));
            z.a(jSONObject, "host_ad_id", bVar.f);
        }
        if (z) {
            z.a(jSONObject, "icon_req_num", Integer.valueOf(((IconAdsRequest) dVar).m));
        }
        hashMap.put("extra_json", jSONObject.toString());
        return hashMap;
    }
}
