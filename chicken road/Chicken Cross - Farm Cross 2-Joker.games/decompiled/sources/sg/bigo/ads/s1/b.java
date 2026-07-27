package sg.bigo.ads.s1;

import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.share.internal.ShareConstants;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.K0.z;
import sg.bigo.ads.P.r;
import sg.bigo.ads.P.s;
import sg.bigo.ads.P.x;
import sg.bigo.ads.Q.e;
import sg.bigo.ads.Q.f;
import sg.bigo.ads.Q.g;
import sg.bigo.ads.T0.p;
import sg.bigo.ads.T0.q;
import sg.bigo.ads.U0.j;
import sg.bigo.ads.U0.k;
import sg.bigo.ads.U0.t;
import sg.bigo.ads.a0.o;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.IconAdsRequest;
import sg.bigo.ads.b0.AbstractC5025b;
import sg.bigo.ads.c0.C5050a;
import sg.bigo.ads.c0.C5053d;
import sg.bigo.ads.e.AbstractC5081e;
import sg.bigo.ads.e.h;
import sg.bigo.ads.e1.InterfaceC5087a;
import sg.bigo.ads.g.C5122e;
import sg.bigo.ads.p0.AbstractC5429c;
import sg.bigo.ads.s0.y;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String[][] f13304a = {new String[]{"0", "1"}, new String[]{"2", ExifInterface.GPS_MEASUREMENT_3D}};

    public static void a(HashMap hashMap, sg.bigo.ads.P.c cVar) {
        int i;
        if (!(cVar instanceof InterfaceC5087a) || (i = ((k) ((InterfaceC5087a) cVar)).d1) <= 0) {
            return;
        }
        hashMap.put("ad_cur_page_indx", String.valueOf(i));
    }

    public static void b(HashMap hashMap, sg.bigo.ads.P.c cVar) {
        int i;
        if (!(cVar instanceof InterfaceC5087a) || (i = ((k) ((InterfaceC5087a) cVar)).b1.get()) <= 0) {
            return;
        }
        hashMap.put("ad_imp_indx", String.valueOf(i));
    }

    public static void c(HashMap hashMap, sg.bigo.ads.P.c cVar) {
        int i;
        if (!(cVar instanceof InterfaceC5087a) || (i = ((k) ((InterfaceC5087a) cVar)).a1) <= 0) {
            return;
        }
        hashMap.put("ad_resp_indx", String.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(HashMap hashMap, sg.bigo.ads.P.c cVar) {
        ArrayList<sg.bigo.ads.P.c> arrayList = ((sg.bigo.ads.U0.b) cVar).b;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (sg.bigo.ads.P.c cVar2 : arrayList) {
            if (cVar2 != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.putOpt("ad_id", ((sg.bigo.ads.U0.b) cVar2).f);
                    jSONObject.putOpt(CampaignEx.JSON_KEY_CREATIVE_ID, ((sg.bigo.ads.U0.b) cVar2).n);
                    jSONObject.putOpt("is_playable", String.valueOf(((sg.bigo.ads.U0.b) cVar2).E));
                    if (cVar2 instanceof InterfaceC5087a) {
                        InterfaceC5087a interfaceC5087a = (InterfaceC5087a) cVar2;
                        k kVar = (k) interfaceC5087a;
                        jSONObject.putOpt("media_type", kVar.f());
                        jSONObject.putOpt("companion_type", f13304a[kVar.m() ? 1 : 0][kVar.l() ? 1 : 0]);
                        if (((sg.bigo.ads.U0.b) interfaceC5087a).k == 2) {
                            jSONObject.putOpt("fill_strategy", String.valueOf(((k) interfaceC5087a).Q0));
                            jSONObject.putOpt("dl_status", String.valueOf(((k) interfaceC5087a).S0));
                        }
                    }
                    jSONArray.put(jSONObject);
                } catch (Throwable unused) {
                }
            }
        }
        hashMap.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, jSONArray.toString());
    }

    public static void e(HashMap hashMap, sg.bigo.ads.P.c cVar) {
        if (cVar instanceof InterfaceC5087a) {
            sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar;
            int i = bVar.l;
            if ((i == 3 || i == 4) && bVar.k == 2) {
                hashMap.put("ser_multi_vid", String.valueOf(0));
            }
        }
    }

    public static void a(HashMap hashMap, sg.bigo.ads.N.c cVar) {
        if (cVar == null) {
            return;
        }
        hashMap.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, cVar.b);
        hashMap.put("gps_country", cVar.c);
        hashMap.put("sim_country", cVar.d);
        hashMap.put("system_country", cVar.e);
        hashMap.put("req_status", String.valueOf(cVar.g));
        hashMap.put("uuid", String.valueOf(cVar.h));
        hashMap.put("cfg_sta", String.valueOf(cVar.i));
        long j = cVar.j;
        if (j > 0) {
            long j2 = j - cVar.f;
            if (j2 >= 0) {
                hashMap.put("cfg_cost", String.valueOf(j2));
            }
        }
        long j3 = cVar.k;
        if (j3 > 0) {
            long j4 = j3 - cVar.f;
            if (j4 >= 0) {
                hashMap.put("delay_cost", String.valueOf(j4));
            }
        }
        long j5 = cVar.k;
        if (j5 > 0) {
            long j6 = cVar.j;
            if (j6 > 0) {
                long j7 = j5 - j6;
                if (j7 >= 0) {
                    hashMap.put("req_queue_time", String.valueOf(j7));
                }
            }
        }
        long j8 = cVar.l;
        if (j8 > 0) {
            long j9 = j8 - cVar.f;
            if (j9 >= 0) {
                hashMap.put("net_cost", String.valueOf(j9));
            }
        }
        String str = cVar.f12464a;
        if (I.a((CharSequence) str)) {
            return;
        }
        hashMap.put("load_ext", str);
    }

    public static void c(int i, int i2, String str, sg.bigo.ads.P.c cVar) {
        HashMap a2 = a(cVar, (sg.bigo.ads.Q.b) null, false);
        a2.put("video_stat", String.valueOf(i));
        a2.put("video_url", str);
        a2.put("path_t", String.valueOf(i2));
        if (cVar instanceof InterfaceC5087a) {
            k kVar = (k) ((InterfaceC5087a) cVar);
            a2.put("video_duration", String.valueOf(kVar.i()));
            r rVar = kVar.E0;
            if (rVar != null) {
                a2.put("video_actual_duration", String.valueOf(rVar.c));
            }
            c(a2, cVar);
            b(a2, cVar);
            a(a2, cVar);
        }
        a("06002017", a2);
    }

    public static void b(int i, int i2, String str, sg.bigo.ads.P.c cVar) {
        HashMap hashMap = cVar == null ? new HashMap() : a(cVar, (sg.bigo.ads.Q.b) null, false);
        hashMap.put("rslt", str);
        hashMap.put("render_method", String.valueOf(i));
        hashMap.put("reason", String.valueOf(i2));
        a("06002049", hashMap);
    }

    public static void a(HashMap hashMap, sg.bigo.ads.Q.b bVar, boolean z) {
        sg.bigo.ads.Q.b bVar2 = bVar != null ? bVar.g : null;
        if (bVar2 instanceof e) {
            e eVar = (e) bVar2;
            a(hashMap, eVar, false);
            if (z) {
                hashMap.put("scene_page", String.valueOf(eVar.j));
            }
        }
    }

    public static void a(HashMap hashMap, IconAdsRequest iconAdsRequest) {
        sg.bigo.ads.P.c cVar = iconAdsRequest.j;
        if (cVar != null) {
            sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar;
            hashMap.put("host_slot", bVar.c.l);
            hashMap.put("host_placement", bVar.c.n);
            hashMap.put("host_sid", String.valueOf(bVar.m));
            hashMap.put("host_ad_id", bVar.f);
        }
        if (iconAdsRequest instanceof IconAdsRequest) {
            hashMap.put("icon_req_num", String.valueOf(iconAdsRequest.m));
        }
    }

    public static void a(HashMap hashMap, e eVar, boolean z) {
        sg.bigo.ads.N.d dVar = eVar.d;
        if (dVar instanceof IconAdsRequest) {
            a(hashMap, (IconAdsRequest) dVar);
        }
        C5122e c5122e = (C5122e) eVar;
        hashMap.put("icon_fill_num", String.valueOf(c5122e.l.length));
        hashMap.put("icon_fill_scene", String.valueOf(c5122e.u));
        sg.bigo.ads.P.c cVar = (sg.bigo.ads.P.c) A.b(eVar.m());
        if (!z || cVar == null) {
            return;
        }
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar;
        hashMap.put("sid", String.valueOf(bVar.m));
        hashMap.put("dsp", bVar.j);
        hashMap.put("adx_type", String.valueOf(bVar.k));
    }

    public static void a(HashMap hashMap, sg.bigo.ads.P.c cVar, String str, String str2, int i) {
        r rVar;
        hashMap.put("show_proportion", str);
        AbstractC5081e.a(hashMap, "ad_size", str2, i, "render_style");
        if (!(cVar instanceof InterfaceC5087a) || (rVar = ((k) ((InterfaceC5087a) cVar)).E0) == null) {
            return;
        }
        Object[] objArr = {Integer.valueOf(rVar.f12490a), Integer.valueOf(rVar.b)};
        Pattern pattern = I.f12345a;
        hashMap.put("creative_size", String.format(Locale.ENGLISH, "%1$d*%2$d", objArr));
    }

    public static HashMap a(g gVar, f fVar, long j, int i, sg.bigo.ads.P.c cVar, h hVar, String str, String str2) {
        HashMap a2 = a(cVar, gVar);
        if (fVar != null) {
            a2.put("status", String.valueOf(fVar.a()));
            a2.put("cost", String.valueOf(fVar.b()));
        }
        a2.put(IronSourceConstants.EVENTS_DURATION, String.valueOf(j));
        a2.put("num", String.valueOf(i));
        a2.put("out_ad", String.valueOf(hVar == null ? 0 : hVar.f));
        if (!TextUtils.isEmpty(str)) {
            a2.put("task_affinity", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            a2.put("url_trace", str2);
        }
        a(a2, (sg.bigo.ads.Q.b) hVar, false);
        return a2;
    }

    public static HashMap a(sg.bigo.ads.P.c cVar, sg.bigo.ads.Q.b bVar, boolean z) {
        int i;
        sg.bigo.ads.U0.b bVar2 = (sg.bigo.ads.U0.b) cVar;
        p pVar = bVar2.c;
        HashMap a2 = a(pVar);
        a2.put("dsp", bVar2.j);
        a2.put("ad_id", bVar2.f);
        a2.put(CampaignEx.JSON_KEY_CREATIVE_ID, bVar2.n);
        a2.put("sid", String.valueOf(bVar2.m));
        a2.put("series_id", bVar2.o);
        a2.put("adx_type", String.valueOf(bVar2.k));
        a2.put("adx_country", bVar2.S);
        if (bVar2.l == 2) {
            if (cVar instanceof sg.bigo.ads.U0.c) {
                sg.bigo.ads.U0.c cVar2 = (sg.bigo.ads.U0.c) cVar;
                a2.put("banner_type", cVar2.z0 ? "1" : "0");
                sg.bigo.ads.U0.d dVar = cVar2.y0;
                if (dVar != null && dVar.f12569a && cVar2.A0) {
                    i = A.c(new String[0]) ? 1 : 2;
                } else {
                    i = 0;
                }
                a2.put("banner_preload", String.valueOf(i));
            } else if (cVar instanceof InterfaceC5087a) {
                k kVar = (k) ((InterfaceC5087a) cVar);
                a2.put("banner_type", kVar.Y0 ? "1" : "0");
                a2.put("nat_ban_fill_type", String.valueOf(bVar2.l0));
                if (bVar2.k == 2) {
                    t tVar = kVar.C0;
                    a2.put("video_type", String.valueOf((tVar == null || !tVar.c) ? 0 : 1));
                }
            }
        } else if (cVar instanceof InterfaceC5087a) {
            sg.bigo.ads.P.c cVar3 = (InterfaceC5087a) cVar;
            int i2 = ((sg.bigo.ads.U0.b) cVar3).k;
            if (i2 == 1) {
                a2.put("native_filled_type", String.valueOf(pVar.e));
            } else if (i2 == 2) {
                t tVar2 = ((k) cVar3).C0;
                a2.put("video_type", String.valueOf((tVar2 == null || !tVar2.c) ? 0 : 1));
            }
        }
        a2.put("mapping_slot", bVar2.y);
        a2.put("enc_price", bVar2.v);
        String str = bVar2.x;
        if (!TextUtils.isEmpty(str)) {
            a2.put("abflags", I.a((String) a2.get("abflags"), str));
        }
        int i3 = pVar.b;
        SparseArray sparseArray = sg.bigo.ads.P.a.f12475a;
        if (i3 == 3 || i3 == 4 || i3 == 12 || i3 == 20) {
            a2.put("style_id", !I.a((CharSequence) bVar2.K) ? bVar2.K : bVar2.c.q);
        }
        a2.put("is_playable", String.valueOf(bVar2.E));
        int i4 = bVar2.E;
        if (i4 == 1 || i4 == 2) {
            a2.put("companion_type", String.valueOf(bVar2.F));
        }
        a2.put("style_source", String.valueOf(bVar2.P));
        a2.put("auc_mode", String.valueOf(bVar2.c.v));
        a2.put("ad_resp_type", String.valueOf(bVar2.Y));
        String str2 = bVar2.Z;
        if (str2 != null) {
            a2.put("session_id2", str2);
        }
        if (!z) {
            a2.put("cache_ad", bVar2.c0 ? "1" : "0");
            a2.put("cache_ad_source", String.valueOf(bVar2.d0));
            a2.put("cache_req_status", String.valueOf(bVar2.a0));
            a2.put("req_type", String.valueOf(bVar2.f0));
            a2.put("cur_req_status", String.valueOf(bVar2.g0));
        }
        a(a2, bVar, false);
        a(a2, bVar2.C);
        return a2;
    }

    public static HashMap a(p pVar) {
        HashMap hashMap = new HashMap();
        if (pVar == null) {
            return hashMap;
        }
        hashMap.put("slot", pVar.l);
        hashMap.put("config_id", String.valueOf(sg.bigo.ads.O.g.f12472a.k));
        hashMap.put("placement_id", pVar.n);
        hashMap.put("strategy_id", pVar.f12557a);
        hashMap.put("ad_type", String.valueOf(pVar.b));
        hashMap.put("abflags", I.a(sg.bigo.ads.O.g.f12472a.p, pVar.a()));
        hashMap.put("auc_mode", String.valueOf(pVar.v));
        return hashMap;
    }

    public static HashMap a(sg.bigo.ads.P.c cVar, g gVar) {
        HashMap a2 = a(cVar, (sg.bigo.ads.Q.b) null, false);
        j jVar = ((sg.bigo.ads.U0.b) cVar).z;
        a2.put("final_url_type", String.valueOf(gVar.m()));
        a2.put("redirect_num", String.valueOf(gVar.k()));
        a2.put("preload_t", String.valueOf(jVar.f));
        a2.put(NotificationCompat.CATEGORY_PROGRESS, String.valueOf(gVar.n()));
        a2.put("click_index", String.valueOf(gVar.h()));
        a2.put("preload_scene", String.valueOf(jVar.k));
        a2.put("preload_ready", gVar.g() ? "1" : "0");
        a2.put("land_way", String.valueOf(gVar.f()));
        a2.put("webview_layout", String.valueOf(gVar.c()));
        a2.put("url", gVar.a());
        Map l = gVar.l();
        if (l != null) {
            a2.putAll(l);
        }
        return a2;
    }

    public static void a(sg.bigo.ads.u1.j jVar) {
        ConcurrentHashMap concurrentHashMap = jVar.f13342a;
        if (I.a((CharSequence) concurrentHashMap.get(SDKAnalyticsEvents.PARAMETER_SESSION_ID))) {
            concurrentHashMap.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, UUID.randomUUID().toString());
        }
        String str = (String) sg.bigo.ads.F0.b.a("sp_ads", "sp_asn_local", "", 3);
        concurrentHashMap.put("asn_local", TextUtils.isEmpty(str) ? "" : str);
        d.e.a(jVar.b, concurrentHashMap);
    }

    public static int a() {
        int b = sg.bigo.ads.F0.a.b();
        int a2 = sg.bigo.ads.F0.a.a();
        int d = sg.bigo.ads.F0.a.d();
        int c = sg.bigo.ads.F0.a.c();
        int i = b == 2 ? 1 : 0;
        int i2 = a2 == 2 ? 1 : 0;
        int i3 = d == 2 ? 1 : 0;
        return (b << 4) | (a2 << 6) | (d << 8) | (c << 10) | (((Integer) sg.bigo.ads.F0.b.a("sp_ads", "user_consent_gdpr", (Object) 0, 0)).intValue() << 12) | ((c == 2 ? 1 : 0) << 3) | (i3 << 2) | (i2 << 1) | i;
    }

    public static void a(sg.bigo.ads.P.c cVar, long j) {
        HashMap a2 = a(cVar, (sg.bigo.ads.Q.b) null, false);
        a2.put("ad_destroy_duration", String.valueOf(j));
        a("06002065", a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(sg.bigo.ads.Q.b bVar, int i, int i2, String str) {
        HashMap a2;
        sg.bigo.ads.N.c cVar;
        if (bVar instanceof e) {
            sg.bigo.ads.N.d dVar = bVar.d;
            a2 = a(dVar.c());
            a(a2, (e) bVar, true);
            if (dVar instanceof IconAdsRequest) {
                a2.put("scene_page", String.valueOf(((IconAdsRequest) dVar).k));
            }
            cVar = dVar.h;
        } else {
            sg.bigo.ads.P.c e = bVar.e();
            a2 = a(e, (sg.bigo.ads.Q.b) null, false);
            sg.bigo.ads.U0.b bVar2 = (sg.bigo.ads.U0.b) e;
            sg.bigo.ads.N.c cVar2 = bVar2.C;
            if (e instanceof InterfaceC5087a) {
                InterfaceC5087a interfaceC5087a = (InterfaceC5087a) e;
                k kVar = (k) interfaceC5087a;
                a2.put("material_type", kVar.p() ? String.valueOf(2) : String.valueOf(1));
                a2.put("media_type", kVar.f());
                a2.put("companion_type", f13304a[kVar.m() ? 1 : 0][kVar.l() ? 1 : 0]);
                if (((sg.bigo.ads.U0.b) interfaceC5087a).k == 2) {
                    a2.put("fill_strategy", String.valueOf(kVar.Q0));
                    a2.put("dl_status", String.valueOf(kVar.S0));
                    if (kVar.Q0 == 2) {
                        a2.put("backup_source", String.valueOf(!I.a((CharSequence) kVar.e()) ? 1 : 0));
                    }
                    a2.put("media_type", kVar.f());
                }
                ArrayList arrayList = bVar2.b;
                if (arrayList != null) {
                    a2.put("ad_resp_num", String.valueOf(arrayList.size() + 1));
                }
                c(a2, e);
            }
            e(a2, e);
            d(a2, e);
            cVar = cVar2;
        }
        long j = cVar.m;
        long j2 = j - cVar.l;
        long j3 = j - cVar.f;
        a2.put("rslt", "0");
        a2.put("cost", String.valueOf(j2));
        a2.put("cost_total", String.valueOf(j3));
        a2.put("e_code", String.valueOf(i));
        a2.put("s_code", String.valueOf(i2));
        a2.put("error", str);
        a2.put("cur_in_fg", String.valueOf(o.b()));
        a2.remove("cache_ad");
        a2.remove("cache_ad_source");
        a2.remove("cache_req_status");
        a2.remove("session_id2");
        sg.bigo.ads.P.c e2 = bVar.e();
        sg.bigo.ads.P.t tVar = e2 != null ? ((sg.bigo.ads.U0.b) e2).i0 : null;
        if (tVar != null) {
            a2.put("encrypt", tVar.f12492a ? "1" : "0");
            a2.put("req_encrypt_enable", tVar.b ? "1" : "0");
            a2.put("resp_decrypt_enable", String.valueOf(tVar.c));
            String str2 = tVar.d;
            if (!TextUtils.isEmpty(str2)) {
                a2.put("enc_logid", str2);
            }
        }
        a("06002008", a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(sg.bigo.ads.Q.b bVar, boolean z) {
        HashMap a2;
        sg.bigo.ads.N.c cVar;
        if (bVar instanceof e) {
            sg.bigo.ads.N.d dVar = bVar.d;
            a2 = a(dVar.c());
            a(a2, (e) bVar, true);
            if (dVar instanceof IconAdsRequest) {
                a2.put("scene_page", String.valueOf(((IconAdsRequest) dVar).k));
            }
            cVar = dVar.h;
        } else {
            sg.bigo.ads.P.c e = bVar.e();
            a2 = a(e, (sg.bigo.ads.Q.b) null, false);
            sg.bigo.ads.U0.b bVar2 = (sg.bigo.ads.U0.b) e;
            sg.bigo.ads.N.c cVar2 = bVar2.C;
            if (e instanceof InterfaceC5087a) {
                InterfaceC5087a interfaceC5087a = (InterfaceC5087a) e;
                k kVar = (k) interfaceC5087a;
                a2.put("material_type", kVar.p() ? String.valueOf(2) : String.valueOf(1));
                a2.put("media_type", kVar.f());
                a2.put("companion_type", f13304a[kVar.m() ? 1 : 0][kVar.l() ? 1 : 0]);
                if (((sg.bigo.ads.U0.b) interfaceC5087a).k == 2) {
                    a2.put("fill_strategy", String.valueOf(kVar.Q0));
                    a2.put("dl_status", String.valueOf(kVar.S0));
                    if (kVar.Q0 == 2) {
                        a2.put("backup_source", String.valueOf(!I.a((CharSequence) kVar.e()) ? 1 : 0));
                        a2.put("backup_dl_status", String.valueOf(kVar.U0));
                    }
                    a2.put("media_type", kVar.f());
                }
                ArrayList arrayList = bVar2.b;
                if (arrayList != null) {
                    a2.put("ad_resp_num", String.valueOf(arrayList.size() + 1));
                }
                c(a2, e);
            }
            e(a2, e);
            d(a2, e);
            cVar = cVar2;
        }
        long j = cVar.m;
        long j2 = j - cVar.l;
        long j3 = j - cVar.f;
        a2.put("rslt", "1");
        a2.put("cost", String.valueOf(j2));
        a2.put("cost_total", String.valueOf(j3));
        a2.put("is_cache", z ? "1" : "0");
        a2.put("cur_in_fg", String.valueOf(o.b()));
        a2.remove("cache_ad");
        a2.remove("cache_ad_source");
        a2.remove("cache_req_status");
        a2.remove("session_id2");
        sg.bigo.ads.P.c e2 = bVar.e();
        sg.bigo.ads.P.t tVar = e2 != null ? ((sg.bigo.ads.U0.b) e2).i0 : null;
        if (tVar != null) {
            a2.put("encrypt", tVar.f12492a ? "1" : "0");
            a2.put("req_encrypt_enable", tVar.b ? "1" : "0");
            a2.put("resp_decrypt_enable", String.valueOf(tVar.c));
            String str = tVar.d;
            if (!TextUtils.isEmpty(str)) {
                a2.put("enc_logid", str);
            }
        }
        s i = bVar.i();
        x xVar = i != null ? i.f12491a : null;
        if (xVar != null) {
            a2.put("is_vpaid", "1");
            a2.put("vpaid_version", String.valueOf(xVar.f12496a));
            a2.put("vpaid_version_cost", String.valueOf(xVar.b));
            a2.put("vpaid_init_cost", String.valueOf(xVar.c));
        }
        a("06002008", a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Context context, sg.bigo.ads.Q.b bVar, String str, String str2, int i, long j, long j2, long j3, int i2, int i3, int i4, int i5, int i6) {
        HashMap a2;
        int i7;
        if (bVar instanceof e) {
            e eVar = (e) bVar;
            a2 = a(bVar.d.c());
            a(a2, eVar, true);
            a2.put("icon_show_num", String.valueOf(eVar.n()));
            a2.put("scene_page", String.valueOf(eVar.j));
            a2.put("word_icon_style", String.valueOf(eVar.k ? 1 : 0));
            InterfaceC5087a o = ((C5122e) eVar).o();
            if (o != null) {
                sg.bigo.ads.U0.b bVar2 = (sg.bigo.ads.U0.b) o;
                a2.put("ori_ad_bundle", bVar2.U);
                j jVar = bVar2.z;
                if (jVar != null) {
                    if (!TextUtils.isEmpty(jVar.f12574a)) {
                        a2.put("land_u", bVar2.z.f12574a);
                    }
                    if (!TextUtils.isEmpty(bVar2.z.b)) {
                        a2.put("dp_u", bVar2.z.b);
                    }
                }
            }
        } else {
            sg.bigo.ads.P.c e = bVar.e();
            a2 = a(e, (sg.bigo.ads.Q.b) null, false);
            sg.bigo.ads.U0.b bVar3 = (sg.bigo.ads.U0.b) e;
            q qVar = bVar3.I;
            if (qVar != null) {
                Integer a3 = z.a(qVar.a("multi_ads.page_group_type"));
                a2.put("page_group_type", String.valueOf(a3 != null ? a3.intValue() : 1));
            }
            boolean z = e instanceof InterfaceC5087a;
            if (z) {
                InterfaceC5087a interfaceC5087a = (InterfaceC5087a) e;
                k kVar = (k) interfaceC5087a;
                r rVar = kVar.E0;
                if (rVar != null) {
                    Object[] objArr = {Integer.valueOf(rVar.f12490a), Integer.valueOf(rVar.b)};
                    Pattern pattern = I.f12345a;
                    a2.put("creative_size", String.format(Locale.ENGLISH, "%1$d*%2$d", objArr));
                }
                int i8 = kVar.J0;
                if (i8 != 0) {
                    a2.put("show_method", String.valueOf(i8));
                }
                a2.put("companion_type", f13304a[kVar.m() ? 1 : 0][kVar.l() ? 1 : 0]);
                if (((sg.bigo.ads.U0.b) interfaceC5087a).k == 2) {
                    a2.put("fill_strategy", String.valueOf(kVar.Q0));
                    a2.put("dl_status", String.valueOf(kVar.S0));
                    if (kVar.Q0 == 2) {
                        a2.put("backup_source", String.valueOf(!I.a((CharSequence) kVar.e()) ? 1 : 0));
                        a2.put("backup_dl_status", String.valueOf(kVar.U0));
                    }
                    a2.put("backup_creative", String.valueOf(kVar.T0));
                }
                a2.put("media_type", kVar.f());
                c(a2, e);
                b(a2, e);
                a(a2, e);
            }
            if (!TextUtils.isEmpty(bVar3.U)) {
                a2.put("ori_ad_bundle", bVar3.U);
            }
            j jVar2 = bVar3.z;
            if (jVar2 != null) {
                if (!TextUtils.isEmpty(jVar2.f12574a)) {
                    a2.put("land_u", bVar3.z.f12574a);
                }
                if (!TextUtils.isEmpty(bVar3.z.b)) {
                    a2.put("dp_u", bVar3.z.b);
                }
            }
            e(a2, e);
            if (z && bVar3.l == 2 && ((i7 = bVar3.k) == 2 || i7 == 1)) {
                if (i2 != -1) {
                    a2.put("icon_sta", String.valueOf(i2));
                }
                if (i3 != -1) {
                    a2.put("img_sta", String.valueOf(i3));
                }
                if (i4 != -1) {
                    a2.put("vid_sta", String.valueOf(i4));
                }
            }
        }
        a2.put("show_proportion", str);
        a2.put("ad_size", str2);
        a2.put("render_style", String.valueOf(i));
        a2.put("render_cost", String.valueOf(j));
        a2.put("attach_render_cost", String.valueOf(j2));
        a2.put("cost", String.valueOf(j3));
        a2.put("cur_in_fg", String.valueOf(o.b()));
        a2.put("out_ad", String.valueOf(bVar.f));
        int i9 = bVar.f12498a;
        if (i9 != 0) {
            a2.put("show_method_source", String.valueOf(i9));
        }
        int i10 = bVar.b;
        if (i10 != 0) {
            a2.put("show_acty_source", String.valueOf(i10));
        }
        sg.bigo.ads.T0.g gVar = sg.bigo.ads.O.g.f12472a;
        if (gVar != null && gVar.B.a(15)) {
            boolean z2 = sg.bigo.ads.I0.f.j;
            if (!z2 && context != null && !z2) {
                context.registerReceiver(sg.bigo.ads.I0.f.k, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                sg.bigo.ads.I0.f.j = true;
            }
            sg.bigo.ads.U.b bVar4 = sg.bigo.ads.I0.f.i;
            if (bVar4 != null) {
                a2.put("bat_stat", String.valueOf(bVar4.c));
                a2.put("bat_num", String.valueOf(bVar4.f12560a));
                a2.put("bat_scale", String.valueOf(bVar4.b));
            }
        }
        s i11 = bVar.i();
        x xVar = i11 != null ? i11.f12491a : null;
        if (xVar != null) {
            a2.put("is_vpaid", "1");
            a2.put("vpaid_imp_type", String.valueOf(xVar.d));
            a2.put("vpaid_start_cost", String.valueOf(xVar.e));
            a2.put("vpaid_impression_cost", String.valueOf(xVar.f));
        }
        if (i5 >= 0) {
            a2.put("a1", String.valueOf(i5));
        }
        if (i6 >= 0) {
            a2.put("a2", String.valueOf(i6));
        }
        a("06002010", a2);
    }

    public static void a(sg.bigo.ads.P.c cVar, int i, long j, long j2, sg.bigo.ads.Q.b bVar) {
        HashMap a2 = a(cVar, (sg.bigo.ads.Q.b) null, false);
        a2.put("close_source", String.valueOf(i));
        a2.put(IronSourceConstants.EVENTS_DURATION, String.valueOf(j));
        a2.put("ad_front_duration", String.valueOf(j2));
        a2.put("close_type", String.valueOf(0));
        a2.put("out_ad", String.valueOf(bVar.f));
        a(a2, bVar, false);
        a("06002023", a2);
    }

    public static void a(p pVar, sg.bigo.ads.N.d dVar, int i, int i2, String str, int i3, int i4, int i5, boolean z, int i6, String str2) {
        HashMap a2 = a(pVar);
        AbstractC5081e.a(a2, "rslt", "0", i, "e_code");
        a2.put("s_code", String.valueOf(i2));
        a2.put("error", str);
        if (dVar != null) {
            if (!a2.containsKey("slot")) {
                a2.put("slot", dVar.d());
                a2.put("ad_type", String.valueOf(dVar.a()));
            }
            a2.put("banner_type", String.valueOf(dVar.c));
            String str3 = dVar.h.f12464a;
            if (!I.a((CharSequence) str3)) {
                a2.put("load_ext", str3);
            }
            sg.bigo.ads.N.c cVar = dVar.h;
            a(a2, cVar);
            a2.put("cost", String.valueOf(Math.max(0L, cVar.l - cVar.f)));
            if (dVar instanceof IconAdsRequest) {
                a(a2, (IconAdsRequest) dVar);
            }
        }
        a2.put("req_type", String.valueOf(i3));
        a2.put("cur_req_status", String.valueOf(i4));
        AbstractC5081e.a(a2, "cur_in_fg", String.valueOf(o.b()), i5, "encrypt");
        AbstractC5081e.a(a2, "req_encrypt_enable", z ? "1" : "0", i6, "resp_decrypt_enable");
        if (!TextUtils.isEmpty(str2)) {
            a2.put("enc_logid", str2);
        }
        if (i2 == 800 || i2 == -13) {
            a2.put("tcf_applies", String.valueOf(AbstractC5429c.a()));
            if (I.a((CharSequence) AbstractC5429c.f13236a) && AbstractC5429c.d()) {
                AbstractC5429c.f13236a = sg.bigo.ads.F0.a.c(AbstractC5429c.h.getPackageName());
            }
            a2.put("tcf_purpose", AbstractC5429c.f13236a);
            if (I.a((CharSequence) AbstractC5429c.c) && AbstractC5429c.d()) {
                AbstractC5429c.c = sg.bigo.ads.F0.a.d(AbstractC5429c.h.getPackageName());
            }
            a2.put("tcf_interests", AbstractC5429c.c);
            a2.put("tcf_vendors", AbstractC5429c.c());
            a2.put("gdpr_switch", String.valueOf(sg.bigo.ads.O.f.a()));
            a2.put("consent_status", String.valueOf(a()));
        }
        a("06002007", a2);
    }

    public static void a(sg.bigo.ads.P.c[] cVarArr, sg.bigo.ads.N.d dVar, boolean z, int i, int i2, int i3, boolean z2, int i4, String str) {
        HashMap hashMap;
        dVar.getClass();
        boolean z3 = dVar instanceof IconAdsRequest;
        int i5 = 1;
        if (z3) {
            hashMap = a(dVar.c());
            sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) ((sg.bigo.ads.P.c) A.b(cVarArr));
            hashMap.put("dsp", bVar.j);
            hashMap.put("sid", String.valueOf(bVar.m));
            hashMap.put("adx_type", String.valueOf(bVar.k));
            hashMap.put("icon_fill_num", String.valueOf(cVarArr.length));
        } else {
            sg.bigo.ads.P.c cVar = (sg.bigo.ads.P.c) A.b(cVarArr);
            int i6 = 0;
            HashMap a2 = a(cVar, (sg.bigo.ads.Q.b) null, false);
            if ((cVar instanceof InterfaceC5087a) && ((sg.bigo.ads.U0.b) cVar).k == 2) {
                t tVar = ((k) ((InterfaceC5087a) cVar)).C0;
                if (tVar != null && tVar.f12582a) {
                    i6 = 1;
                }
                a2.put("video_type", String.valueOf(i6));
            }
            e(a2, cVar);
            ArrayList<sg.bigo.ads.P.c> arrayList = ((sg.bigo.ads.U0.b) cVar).b;
            if (arrayList != null && arrayList.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (sg.bigo.ads.P.c cVar2 : arrayList) {
                    if (cVar2 != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.putOpt("ad_id", ((sg.bigo.ads.U0.b) cVar2).f);
                            jSONObject.putOpt(CampaignEx.JSON_KEY_CREATIVE_ID, ((sg.bigo.ads.U0.b) cVar2).n);
                            jSONArray.put(jSONObject);
                        } catch (Throwable unused) {
                        }
                    }
                }
                i5 = 1 + arrayList.size();
                a2.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, jSONArray.toString());
            }
            hashMap = a2;
        }
        if (z3) {
            a(hashMap, (IconAdsRequest) dVar);
        }
        hashMap.put("ad_resp_num", String.valueOf(i5));
        hashMap.put("rslt", "1");
        hashMap.put("banner_type", String.valueOf(dVar.c));
        String str2 = dVar.h.f12464a;
        if (!I.a((CharSequence) str2)) {
            hashMap.put("load_ext", str2);
        }
        sg.bigo.ads.N.c cVar3 = dVar.h;
        hashMap.put("cost", String.valueOf(Math.max(0L, cVar3.l - cVar3.f)));
        hashMap.put("is_playable", z ? "1" : "0");
        hashMap.put("req_type", String.valueOf(i));
        hashMap.put("cur_req_status", String.valueOf(i2));
        hashMap.put("cur_in_fg", String.valueOf(o.b()));
        hashMap.remove("cache_ad");
        hashMap.remove("cache_ad_source");
        hashMap.remove("cache_req_status");
        hashMap.remove("session_id2");
        hashMap.put("encrypt", String.valueOf(i3));
        hashMap.put("req_encrypt_enable", z2 ? "1" : "0");
        hashMap.put("resp_decrypt_enable", String.valueOf(i4));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("enc_logid", str);
        }
        a("06002007", hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(sg.bigo.ads.P.c cVar, AdError adError, boolean z, boolean z2) {
        long elapsedRealtime;
        if (cVar != null) {
            HashMap a2 = a(cVar, (sg.bigo.ads.Q.b) null, false);
            a2.put("e_code", "" + adError.getCode());
            a2.put("s_code", String.valueOf(adError.getSubCode()));
            if (adError.getCode() == 2000) {
                StringBuilder sb = new StringBuilder("");
                sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar;
                if (bVar.G) {
                    long j = bVar.H;
                    if (j > 0) {
                        long j2 = j - (bVar.d * 1000);
                        elapsedRealtime = j2 > 0 ? System.currentTimeMillis() - j2 : 0L;
                        a2.put("duration_expired", sb.append(elapsedRealtime > 0 ? elapsedRealtime : 0L).toString());
                    }
                }
                elapsedRealtime = SystemClock.elapsedRealtime() - bVar.e;
                a2.put("duration_expired", sb.append(elapsedRealtime > 0 ? elapsedRealtime : 0L).toString());
            }
            a2.put("error", "" + adError.getMessage());
            a2.put("ad_impl", z ? "1" : "0");
            a2.put("fail_to_show", z2 ? "1" : "0");
            if ((cVar instanceof InterfaceC5087a) && ((sg.bigo.ads.U0.b) cVar).k == 2) {
                a2.put("dl_status", String.valueOf(((k) ((InterfaceC5087a) cVar)).S0));
            }
            a("06002048", a2);
        }
    }

    public static void a(sg.bigo.ads.Q.b bVar, String str, String str2, int i) {
        HashMap a2;
        int i2;
        if (bVar instanceof e) {
            a2 = a(bVar.d.c());
            a(a2, (e) bVar, true);
            a(a2, (sg.bigo.ads.P.c) null, str, str2, i);
        } else {
            sg.bigo.ads.P.c e = bVar.e();
            a2 = a(e, (sg.bigo.ads.Q.b) null, false);
            a(a2, e, str, str2, i);
            if ((e instanceof InterfaceC5087a) && (i2 = ((k) ((InterfaceC5087a) e)).J0) != 0) {
                a2.put("show_method", String.valueOf(i2));
            }
        }
        a("06002029", a2);
    }

    public static void a(long j, boolean z, String str, int i, String str2) {
        sg.bigo.ads.u1.j jVar = new sg.bigo.ads.u1.j("06002051");
        jVar.a("rslt", "0");
        jVar.f13342a.put("cost", String.valueOf(j));
        jVar.a("clear", z ? "1" : "0");
        jVar.a("url", str);
        jVar.f13342a.put("e_code", String.valueOf(i));
        jVar.a("error", str2);
        a(jVar);
    }

    public static void a(long j, boolean z, String str, boolean z2) {
        sg.bigo.ads.u1.j jVar = new sg.bigo.ads.u1.j("06002051");
        jVar.a("rslt", "1");
        jVar.f13342a.put("cost", String.valueOf(j));
        jVar.a("clear", z ? "1" : "0");
        jVar.a("update", z2 ? "1" : "0");
        jVar.a("url", str);
        a(jVar);
    }

    public static void a(sg.bigo.ads.P.c cVar, int i, sg.bigo.ads.P.f fVar, sg.bigo.ads.Q.b bVar) {
        HashMap a2 = a(cVar, (sg.bigo.ads.Q.b) null, false);
        a2.put("open_way_gp", String.valueOf(i));
        a2.put("open_rslt_gp", String.valueOf(fVar.b));
        a2.put("deep_rslt", String.valueOf(fVar.c));
        a2.put("webview_layout", String.valueOf(fVar.j));
        a2.put(CampaignEx.JSON_KEY_DEEP_LINK_URL, fVar.k);
        a2.put("land_success", fVar.b() ? "1" : "0");
        a2.put("url_t", String.valueOf(fVar.f12478a));
        if (!TextUtils.isEmpty(fVar.p)) {
            a2.put("fallback_url", fVar.p);
        }
        a2.put("ori_ad_bundle", ((sg.bigo.ads.U0.b) cVar).U);
        if (fVar.a() > -1) {
            a2.put("open_gp_inline", String.valueOf(fVar.a()));
        }
        if (!I.a((CharSequence) fVar.l)) {
            a2.put("pkg_name", fVar.l);
        }
        int i2 = fVar.i;
        if (i2 >= 0) {
            a2.put("open_pkg_delay_rslt", String.valueOf(i2));
        }
        a2.put("out_ad", String.valueOf(bVar == null ? 0 : bVar.f));
        a(a2, bVar, false);
        a("06002034", a2);
    }

    public static void a(long j, int i, int i2, String str, int i3, boolean z, int i4, String str2) {
        sg.bigo.ads.u1.j jVar = new sg.bigo.ads.u1.j("06002002");
        jVar.a("rslt", "0");
        jVar.f13342a.put("cost", String.valueOf(j));
        jVar.f13342a.put("e_code", String.valueOf(i));
        jVar.f13342a.put("s_code", String.valueOf(i2));
        jVar.a("error", str);
        jVar.f13342a.put("src", String.valueOf(i3));
        jVar.a("in_fg", String.valueOf(z ? 1 : 2));
        jVar.a("times", String.valueOf(i4));
        if (!TextUtils.isEmpty(str2)) {
            jVar.a("uuid", str2);
        }
        a(jVar);
    }

    public static void a(long j, long j2, boolean z, int i, boolean z2, int i2, String str, String str2, String str3) {
        sg.bigo.ads.u1.j jVar = new sg.bigo.ads.u1.j("06002002");
        String str4 = "1";
        jVar.a("rslt", "1");
        jVar.f13342a.put("config_id", String.valueOf(j));
        jVar.f13342a.put("cost", String.valueOf(j2));
        jVar.a("n_rt", z ? "0" : "1");
        jVar.f13342a.put("src", String.valueOf(i));
        jVar.a("in_fg", String.valueOf(z2 ? 1 : 2));
        jVar.a("times", String.valueOf(i2));
        if (str2 == null && str3 == null) {
            str4 = "0";
        }
        jVar.a("reuse", str4);
        if (str2 != null) {
            jVar.a("reuse_global_md5", str2);
        }
        if (str3 != null) {
            jVar.a("reuse_slots_md5", str3);
        }
        if (!TextUtils.isEmpty(str)) {
            jVar.a("uuid", str);
        }
        jVar.f13342a.put("cur_in_fg", String.valueOf(o.b()));
        a(jVar);
    }

    public static void a(InterfaceC5087a interfaceC5087a, int i, int i2, long j, long j2) {
        HashMap hashMap = interfaceC5087a == null ? new HashMap() : a((sg.bigo.ads.P.c) interfaceC5087a, (sg.bigo.ads.Q.b) null, false);
        hashMap.put("page_type", String.valueOf(i));
        hashMap.put("action", String.valueOf(i2));
        hashMap.put("cost1", String.valueOf(j));
        hashMap.put("cost2", String.valueOf(j2));
        a("06002055", hashMap);
    }

    public static void a(String str, HashMap hashMap) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                concurrentHashMap.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (I.a((CharSequence) concurrentHashMap.get(SDKAnalyticsEvents.PARAMETER_SESSION_ID))) {
            concurrentHashMap.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, UUID.randomUUID().toString());
        }
        String str2 = (String) sg.bigo.ads.F0.b.a("sp_ads", "sp_asn_local", "", 3);
        concurrentHashMap.put("asn_local", TextUtils.isEmpty(str2) ? "" : str2);
        d.e.a(str, concurrentHashMap);
    }

    public static void a(int i, int i2, String str, sg.bigo.ads.P.c cVar) {
        HashMap hashMap = cVar == null ? new HashMap() : a(cVar, (sg.bigo.ads.Q.b) null, false);
        hashMap.put("e_code", String.valueOf(i));
        hashMap.put("s_code", String.valueOf(i2));
        hashMap.put("error", str);
        a("06002035", hashMap);
    }

    public static void a(int i, int i2, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", String.valueOf(i));
        hashMap.put("scene", String.valueOf(i2));
        if (!I.a((CharSequence) str)) {
            hashMap.put("error", str);
        }
        a("06002063", hashMap);
    }

    public static void a(sg.bigo.ads.P.c cVar) {
        HashMap a2 = a(cVar, (sg.bigo.ads.Q.b) null, false);
        if (cVar instanceof InterfaceC5087a) {
            k kVar = (k) ((InterfaceC5087a) cVar);
            y yVar = kVar.f1;
            if (!TextUtils.isEmpty(yVar != null ? yVar.f : null)) {
                y yVar2 = kVar.f1;
                a2.put("media_type_url", yVar2 != null ? yVar2.f : null);
            }
            y yVar3 = kVar.f1;
            if (!TextUtils.isEmpty(yVar3 != null ? yVar3.g : null)) {
                y yVar4 = kVar.f1;
                a2.put("media_type_http", yVar4 != null ? yVar4.g : null);
            }
            y yVar5 = kVar.f1;
            if (!TextUtils.isEmpty(yVar5 != null ? yVar5.h : null)) {
                y yVar6 = kVar.f1;
                a2.put("media_type_file", yVar6 != null ? yVar6.h : null);
            }
        }
        a("06002047", a2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(InterfaceC5087a interfaceC5087a, int i) {
        HashMap hashMap = new HashMap();
        if (interfaceC5087a != 0) {
            sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) interfaceC5087a;
            hashMap.put("host_slot", bVar.c.l);
            hashMap.put("host_placement", bVar.c.n);
            hashMap.put("host_sid", String.valueOf(bVar.m));
            hashMap.put("host_ad_id", bVar.f);
        }
        AbstractC5081e.a(hashMap, "show_icon_invoke", "1", i, "scene_page");
        d.e.a("06002069", hashMap);
    }

    public static void a(g gVar, f fVar, sg.bigo.ads.P.c cVar, h hVar, String str) {
        HashMap a2 = a(cVar, gVar);
        a2.put("status", String.valueOf(fVar.a()));
        a2.put("cost", String.valueOf(fVar.b()));
        a2.put("out_ad", String.valueOf(hVar == null ? 0 : hVar.f));
        if (!TextUtils.isEmpty(str)) {
            a2.put("task_affinity", str);
        }
        a(a2, (sg.bigo.ads.Q.b) hVar, false);
        a("06002061", a2);
    }

    public static void a(sg.bigo.ads.P.c cVar, String str, ArrayList arrayList, String str2, int i) {
        HashMap hashMap = cVar == null ? new HashMap() : a(cVar, (sg.bigo.ads.Q.b) null, false);
        hashMap.put("rslt", str);
        if (!A.a(arrayList)) {
            hashMap.put("reason", arrayList.toString());
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("browser", str2);
        }
        hashMap.put("open_way", String.valueOf(i));
        a("06002060", hashMap);
    }

    public static void a(sg.bigo.ads.P.c cVar, String str, String str2, long j, long j2, int i, String str3, boolean z, String str4, String str5, String str6, int i2) {
        HashMap a2 = a(cVar, (sg.bigo.ads.Q.b) null, false);
        a2.put("retry_times", String.valueOf(i2));
        a2.put("rslt", "0");
        a2.put("url", str);
        a2.put("error", str2);
        a2.put("cost", String.valueOf(j));
        a2.put(ContentDisposition.Parameters.Size, String.valueOf(j2));
        a2.put("material_type", String.valueOf(i));
        a2.put("media_type", str3);
        a2.put("from_breakpoint", z ? "1" : "0");
        a2.put("cur_in_fg", String.valueOf(o.b()));
        a2.remove("cache_ad");
        a2.remove("cache_ad_source");
        a2.remove("cache_req_status");
        a2.remove("session_id2");
        if (!TextUtils.isEmpty(str4)) {
            a2.put("media_type_url", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            a2.put("media_type_http", str5);
        }
        if (!TextUtils.isEmpty(str6)) {
            a2.put("media_type_file", str6);
        }
        c(a2, cVar);
        a("06002018", a2);
    }

    public static void a(InterfaceC5087a interfaceC5087a, String str, int i, long j, long j2, int i2, int i3, String str2, boolean z, String str3, String str4, String str5, String str6, int i4) {
        int i5;
        int i6;
        HashMap a2 = a((sg.bigo.ads.P.c) interfaceC5087a, (sg.bigo.ads.Q.b) null, false);
        a2.put("retry_times", String.valueOf(i4));
        a2.put("rslt", "1");
        AbstractC5081e.a(a2, "url", str, i, "source");
        a2.put("cost", String.valueOf(j));
        a2.put(ContentDisposition.Parameters.Size, String.valueOf(j2));
        AbstractC5081e.a(a2, "dl_opt", String.valueOf(i2), i3, "material_type");
        r rVar = ((k) interfaceC5087a).E0;
        if (rVar != null) {
            Object[] objArr = {Integer.valueOf(rVar.f12490a), Integer.valueOf(rVar.b)};
            Pattern pattern = I.f12345a;
            a2.put("creative_size", String.format(Locale.ENGLISH, "%1$d*%2$d", objArr));
        }
        a2.put("media_type", str2);
        a2.put("from_breakpoint", z ? "1" : "0");
        a2.put("cur_in_fg", String.valueOf(o.b()));
        a2.remove("cache_ad");
        a2.remove("cache_ad_source");
        a2.remove("cache_req_status");
        a2.remove("session_id2");
        if (!TextUtils.isEmpty(str3)) {
            a2.put("media_type_url", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            a2.put("media_type_http", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            a2.put("media_type_file", str5);
        }
        c(a2, interfaceC5087a);
        if ("video".equals(str2) && sg.bigo.ads.O.g.f12472a.B.a(29)) {
            if (i == 1) {
                Cursor a3 = AbstractC5025b.a("tb_resource", new String[]{"res_file_name"}[0] + "=? ", new String[]{String.valueOf(str6)}, null, 1);
                if (a3 != null) {
                    r3 = a3.moveToNext() ? new C5050a(a3) : null;
                    a3.close();
                }
                if (r3 != null) {
                    i5 = r3.d != ((Long) sg.bigo.ads.F0.b.a("sp_ads", "last_stat_init_time", (Object) 0, 1)).longValue() ? 2 : 1;
                    i6 = (int) ((System.currentTimeMillis() - r3.c) / 1000);
                } else {
                    i5 = 0;
                    i6 = 0;
                }
                a2.put("remove_type", String.valueOf(i5));
                a2.put("remove_time_gap", String.valueOf(i6));
                ArrayList arrayList = new ArrayList();
                arrayList.add(str6);
                arrayList.size();
                StringBuilder sb = new StringBuilder("res_file_name in (");
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    sb.append(i7 == 0 ? "?" : ",?");
                    i7++;
                }
                sb.append(")");
                AbstractC5025b.a("tb_resource", sb.toString(), (String[]) arrayList.toArray(new String[0]));
            }
        }
        a("06002018", a2);
    }

    public static void a(sg.bigo.ads.P.c cVar, int i, int i2, String str, long j, boolean z, int i3, String str2) {
        HashMap hashMap = cVar == null ? new HashMap() : a(cVar, (sg.bigo.ads.Q.b) null, false);
        hashMap.put("render_method", String.valueOf(i));
        hashMap.put("rslt", String.valueOf(i2));
        hashMap.put("cost", String.valueOf(j));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("material_id", str);
        }
        if (z) {
            hashMap.put("e_code", String.valueOf(i3));
            hashMap.put("error", String.valueOf(str2));
        }
        a("06002050", hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(String str, String str2, boolean z, long j, int i, String str3, boolean z2, int i2, String str4, String str5, String str6, String str7, boolean z3, boolean z4, int i3, String str8, String str9) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("domain_front", str2);
        hashMap.put("rslt", z ? "1" : "0");
        hashMap.put("cost", String.valueOf(j));
        hashMap.put("res_code", String.valueOf(i));
        hashMap.put("res_msg", String.valueOf(str3));
        hashMap.put("in_fg", String.valueOf(z2 ? 1 : 0));
        hashMap.put(ContentDisposition.Parameters.Size, String.valueOf(i2));
        int c = sg.bigo.ads.F0.a.c();
        int a2 = sg.bigo.ads.F0.a.a();
        int d = sg.bigo.ads.F0.a.d();
        int b = sg.bigo.ads.F0.a.b();
        if (c != 0 || a2 != 0 || d != 0 || b != 0) {
            String str10 = c == 1 ? "GDPR" : "";
            if (a2 == 1) {
                str10 = sg.bigo.ads.U.o.a(new StringBuilder().append(str10), str10.length() == 0 ? "" : U3.j.c, "CCPA");
            }
            if (d == 1) {
                str10 = sg.bigo.ads.U.o.a(new StringBuilder().append(str10), str10.length() == 0 ? "" : U3.j.c, "LGPD");
            }
            if (b == 1) {
                str10 = sg.bigo.ads.U.o.a(new StringBuilder().append(str10), str10.length() != 0 ? U3.j.c : "", "COPPA");
            }
            AbstractC5081e.a(hashMap, ShareConstants.WEB_DIALOG_PARAM_PRIVACY, str10, 1, U3.j.b0);
        }
        hashMap.put("gps_country", str4);
        hashMap.put("sim_country", str5);
        hashMap.put("system_country", str6);
        if (!TextUtils.isEmpty(str7)) {
            hashMap.put("uuid", str7);
        }
        hashMap.put("encrypt", z3 ? "1" : "0");
        AbstractC5081e.a(hashMap, "req_encrypt_enable", z4 ? "1" : "0", i3, "resp_decrypt_enable");
        if (!TextUtils.isEmpty(str8)) {
            hashMap.put("enc_logid", String.valueOf(str8));
        }
        if (!TextUtils.isEmpty(str9)) {
            hashMap.put("http_type", str9);
        }
        a("06002015", hashMap);
    }

    public static void a(sg.bigo.ads.P.c cVar, String str, long j, int i, HashMap hashMap) {
        HashMap a2 = a(cVar, (sg.bigo.ads.Q.b) null, false);
        a2.put("action", str);
        a2.put("cost", String.valueOf(j));
        a2.put("rslt", String.valueOf(i));
        if (hashMap != null) {
            a2.putAll(hashMap);
        }
        a("06002025", a2);
    }

    public static void a(sg.bigo.ads.P.c cVar, int i, long j, String str, int i2, String str2, String str3, HashMap hashMap) {
        HashMap a2 = a(cVar, (sg.bigo.ads.Q.b) null, false);
        sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar;
        a2.put("slot", String.valueOf(bVar.c.l));
        a2.put("rslt", String.valueOf(i));
        a2.put("cost", String.valueOf(j));
        if (!TextUtils.isEmpty(str)) {
            a2.put("url", str);
        }
        if (i2 > 0) {
            a2.put("cnt", String.valueOf(i2));
        }
        if (!TextUtils.isEmpty(str2)) {
            a2.put("material_type", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            a2.put("error", str3);
        }
        if (hashMap != null && !hashMap.isEmpty()) {
            for (Map.Entry entry : hashMap.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    a2.put((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        if (cVar instanceof InterfaceC5087a) {
            k kVar = (k) ((InterfaceC5087a) cVar);
            a2.put("companion_type", f13304a[kVar.m() ? 1 : 0][kVar.l() ? 1 : 0]);
            a2.put("playable_load_type", String.valueOf(bVar.p0));
            q qVar = bVar.J;
            if (qVar != null) {
                Integer a3 = z.a(qVar.a("playable_attr.playable_loaded_progress"));
                a2.put("playable_loaded_progress", String.valueOf(a3 != null ? a3.intValue() : 0));
            }
            if (kVar.Q0 == 2) {
                a2.put("backup_source", String.valueOf(!I.a((CharSequence) kVar.e()) ? 1 : 0));
            }
        }
        a("06002042", a2);
    }

    public static void a(sg.bigo.ads.P.c cVar, int i, String str, long j, long j2, String str2, int i2) {
        HashMap hashMap;
        if (cVar != null) {
            hashMap = a(cVar, (sg.bigo.ads.Q.b) null, false);
            sg.bigo.ads.U0.b bVar = (sg.bigo.ads.U0.b) cVar;
            hashMap.put("slot", bVar.c.l);
            hashMap.put("playable_load_type", String.valueOf(bVar.p0));
            q qVar = bVar.J;
            if (qVar != null) {
                Integer a2 = z.a(qVar.a("playable_attr.playable_loaded_progress"));
                hashMap.put("playable_loaded_progress", String.valueOf(a2 != null ? a2.intValue() : 0));
            }
        } else {
            hashMap = new HashMap();
        }
        hashMap.put("rslt", String.valueOf(i));
        hashMap.put("material_type", "playable_zip_pkg");
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("url", str);
        }
        if (i == 0) {
            hashMap.put("cost", "0");
            hashMap.put("zip_pkg_size", "0");
        } else {
            hashMap.put("cost", String.valueOf(j2));
            hashMap.put("zip_pkg_size", String.valueOf(j));
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("error", str2);
            }
            if (i == 1) {
                hashMap.put("zip_pkg_from_net", String.valueOf(i2));
            }
        }
        a("06002042", hashMap);
    }

    public static void a(sg.bigo.ads.P.c cVar, int i, int i2) {
        HashMap a2 = a(cVar, (sg.bigo.ads.Q.b) null, false);
        a2.put("page_style", String.valueOf(i));
        a2.put("page_source", String.valueOf(i2));
        if (cVar instanceof InterfaceC5087a) {
            c(a2, cVar);
            b(a2, cVar);
            a(a2, cVar);
        }
        a("06002041", a2);
    }

    public static void a(HashMap hashMap) {
        sg.bigo.ads.T0.g gVar = sg.bigo.ads.O.g.f12472a;
        sg.bigo.ads.T0.f fVar = gVar != null ? gVar.K : null;
        hashMap.put("checkByServer", (fVar == null || fVar.f12552a != 1) ? "0" : "1");
        sg.bigo.ads.T0.g gVar2 = sg.bigo.ads.O.g.f12472a;
        sg.bigo.ads.T0.f fVar2 = gVar2 != null ? gVar2.K : null;
        hashMap.put("checkOnlyPurpose", (fVar2 == null || fVar2.b != 1) ? "0" : "1");
        sg.bigo.ads.T0.g gVar3 = sg.bigo.ads.O.g.f12472a;
        sg.bigo.ads.T0.f fVar3 = gVar3 != null ? gVar3.K : null;
        hashMap.put("checkVendorConsents", (fVar3 == null || fVar3.c != 1) ? "0" : "1");
        d.e.a("06002066", hashMap);
    }

    public static void a(InterfaceC5087a interfaceC5087a, int i, String str, long j, int i2, String str2) {
        HashMap a2 = a((sg.bigo.ads.P.c) interfaceC5087a, (sg.bigo.ads.Q.b) null, false);
        AbstractC5081e.a(a2, "rslt", "0", i, "wrap");
        a2.put("wrap_url", str);
        a2.put("cost", String.valueOf(j));
        a2.put("e_code", String.valueOf(i2));
        a2.put("error", String.valueOf(str2));
        a2.put("cur_in_fg", String.valueOf(o.b()));
        a2.remove("cache_ad");
        a2.remove("cache_ad_source");
        a2.remove("cache_req_status");
        a2.remove("session_id2");
        c(a2, interfaceC5087a);
        a("06002016", a2);
    }

    public static void a(C5053d c5053d) {
        HashMap hashMap = new HashMap();
        String str = c5053d.b;
        if (str == null) {
            str = "";
        }
        hashMap.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, str);
        String str2 = c5053d.c;
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("sid", str2);
        String str3 = c5053d.d;
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("dsp", str3);
        String str4 = c5053d.e;
        if (str4 == null) {
            str4 = "";
        }
        hashMap.put("ad_id", str4);
        String str5 = c5053d.f;
        if (str5 == null) {
            str5 = "";
        }
        hashMap.put(CampaignEx.JSON_KEY_CREATIVE_ID, str5);
        String str6 = c5053d.g;
        if (str6 == null) {
            str6 = "";
        }
        hashMap.put("url", str6);
        hashMap.put("ad_type", String.valueOf(c5053d.h));
        hashMap.put("adx_type", String.valueOf(c5053d.i));
        hashMap.put("click_index", String.valueOf(c5053d.j));
        String str7 = c5053d.k;
        if (str7 == null) {
            str7 = "";
        }
        hashMap.put("resolution", str7);
        hashMap.put("cost", String.valueOf(c5053d.l));
        hashMap.put("action", String.valueOf(c5053d.m));
        String str8 = c5053d.n;
        if (str8 == null) {
            str8 = "";
        }
        hashMap.put("click_trace", str8);
        String str9 = c5053d.o;
        if (str9 == null) {
            str9 = "";
        }
        hashMap.put("touch_trace", str9);
        String str10 = c5053d.p;
        hashMap.put("scroll_trace", str10 != null ? str10 : "");
        a("06002074", hashMap);
    }
}
