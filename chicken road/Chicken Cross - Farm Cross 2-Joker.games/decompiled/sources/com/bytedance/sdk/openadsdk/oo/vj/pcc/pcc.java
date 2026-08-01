package com.bytedance.sdk.openadsdk.oo.vj.pcc;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm;
import com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.ye;
import com.bytedance.sdk.openadsdk.dax.oo;
import com.bytedance.sdk.openadsdk.oo.qf;
import com.bytedance.sdk.openadsdk.oo.vj.sf.gbb;
import com.bytedance.sdk.openadsdk.oo.vj.sf.hc;
import com.bytedance.sdk.openadsdk.oo.vj.sf.jr;
import com.bytedance.sdk.openadsdk.oo.vj.sf.kj;
import com.bytedance.sdk.openadsdk.oo.vj.sf.vj;
import com.bytedance.sdk.openadsdk.oo.vj.sf.wh;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.tsz;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.firebase.messaging.Constants;
import com.ironsource.mediationsdk.metadata.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc {
    private static final Map<com.bykv.vk.openvk.pcc.pcc.pcc.sf.pcc, jr> pcc = Collections.synchronizedMap(new WeakHashMap());

    public static com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc(of ofVar, String str, int i, gm gmVar) {
        return pcc(ofVar, str, i, gmVar, null);
    }

    public static com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc(of ofVar, String str, int i, gm gmVar, jr.pcc pccVar) {
        JSONObject jSONObject = new JSONObject();
        if (i > 0) {
            try {
                jSONObject.put("play_type", String.valueOf(i));
            } catch (JSONException e) {
                lo.pcc("TTAD.VideoEventManager", "", e);
            }
        }
        if (ofVar != null) {
            sf kez = ofVar.kez();
            if (kez != null) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, kez.vy());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(kez.vj()));
                jSONObject.put("video_url", kez.vh());
                jSONObject.put("player_type", gmVar.lu());
                jSONObject.put("video_encode_type", gmVar.gbb() ? 1 : 0);
            }
            jSONObject.put("play_time", gmVar.vj);
            r0 = gmVar.pcc() ? new JSONObject(gmVar.gm().toString()) : null;
            if (r0 == null) {
                r0 = new JSONObject();
            }
            if (!TextUtils.isEmpty(str)) {
                r0.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, str);
            }
            jSONObject.put("dp_creative_type", ofVar.fg());
        }
        return new com.bytedance.sdk.openadsdk.oo.vj.sf.pcc(ofVar, kun.pcc(ofVar), jSONObject, r0);
    }

    public static void pcc(com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pccVar) {
        oo.pcc("load_video_error", pccVar);
    }

    public static void sf(com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pccVar) {
        oo.pcc("load_video_cancel", pccVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:4|(1:6)(2:20|(8:22|8|9|10|11|(1:13)|14|15)(1:23))|7|8|9|10|11|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        com.bytedance.sdk.component.utils.lo.pcc("TTAD.VideoEventManager", "", r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void pcc(of ofVar, com.bykv.vk.openvk.pcc.pcc.pcc.sf.pcc pccVar, gm gmVar) {
        int i;
        int i2;
        if (ofVar == null || pccVar == null || gmVar == null) {
            return;
        }
        String pcc2 = tsz.pcc();
        if (gmVar.qy()) {
            i = 3;
        } else {
            if (CacheDirFactory.getICacheDir(ofVar.we()).pcc(gmVar)) {
                i2 = 1;
                pcc.put(pccVar, new jr(SystemClock.elapsedRealtime(), pcc2, i2, gmVar, ofVar));
                com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc3 = pcc(ofVar, pcc2, i2, gmVar, null);
                pcc3.gm().put("is_mute", gmVar.vh() ? 1 : 0);
                pcc3.pcc(gmVar.lu() == -1);
                pcc(pcc3, "play_start");
            }
            i = 2;
        }
        i2 = i;
        pcc.put(pccVar, new jr(SystemClock.elapsedRealtime(), pcc2, i2, gmVar, ofVar));
        com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc32 = pcc(ofVar, pcc2, i2, gmVar, null);
        pcc32.gm().put("is_mute", gmVar.vh() ? 1 : 0);
        pcc32.pcc(gmVar.lu() == -1);
        pcc(pcc32, "play_start");
    }

    public static void pcc(Context context, com.bykv.vk.openvk.pcc.pcc.pcc.sf.pcc pccVar, jr.pcc pccVar2, qf qfVar) {
        jr jrVar;
        if (context == null || pccVar == null || pccVar2 == null || (jrVar = pcc.get(pccVar)) == null) {
            return;
        }
        gm oo = jrVar.oo();
        of vj = jrVar.vj();
        if (oo == null || vj == null) {
            return;
        }
        if (!pccVar2.vh()) {
            pcc(vj, oo, pccVar2);
        }
        kj kjVar = new kj(oo);
        kjVar.pcc(pccVar2.tmg() ? 1 : 0);
        kjVar.sf(CacheDirFactory.getICacheDir(vj.we()).sf(oo));
        kjVar.pcc(SystemClock.elapsedRealtime() - jrVar.pcc());
        com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = pcc(vj, jrVar.sf(), jrVar.gm(), oo, pccVar2);
        pcc2.pcc(kjVar);
        JSONObject oo2 = pcc2.oo();
        try {
            oo2.put("is_received_video_not_playing_info", pccVar2.gbb() ? 1 : 0);
            oo2.put("new_media_source", com.bykv.vk.openvk.pcc.pcc.sf.pcc.wh());
        } catch (JSONException e) {
            lo.pcc("TTAD.VideoEventManager", "", e);
        }
        pcc2.pcc(pccVar2.vh());
        pcc(pcc2, "feed_play", qfVar);
    }

    public static void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.sf.pcc pccVar, jr.pcc pccVar2) {
        jr jrVar;
        if (pccVar == null || pccVar2 == null || (jrVar = pcc.get(pccVar)) == null) {
            return;
        }
        gm oo = jrVar.oo();
        of vj = jrVar.vj();
        if (oo == null || vj == null) {
            return;
        }
        long sf = pccVar2.sf();
        long oo2 = pccVar2.oo();
        if (oo2 <= 0 || sf <= 0) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.vj.sf.qf qfVar = new com.bytedance.sdk.openadsdk.oo.vj.sf.qf();
        qfVar.pcc(pccVar2.gm());
        qfVar.sf(oo2);
        com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = pcc(vj, jrVar.sf(), jrVar.gm(), oo, pccVar2);
        pcc2.pcc(qfVar);
        pcc(pccVar2, vj, pcc2.oo());
        pcc2.pcc(pccVar2.vh());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, sf);
            jSONObject.put("percent", pccVar2.qf());
            pcc(pcc2, "feed_pause", jSONObject);
        } catch (JSONException e) {
            lo.pcc("TTAD.VideoEventManager", "", e);
        }
    }

    private static void pcc(jr.pcc pccVar, of ofVar, JSONObject jSONObject) {
        if (ofVar != null) {
            try {
                ye uk = ofVar.uk();
                if (uk != null) {
                    jSONObject.put("speed_type", uk.sf());
                    jSONObject.put("speed", uk.pcc());
                    jSONObject.put("speed_duration", pccVar.pcc());
                }
            } catch (Throwable th) {
                lo.pcc("TTAD.VideoEventManager", "", th);
            }
        }
    }

    public static void sf(com.bykv.vk.openvk.pcc.pcc.pcc.sf.pcc pccVar, jr.pcc pccVar2) {
        jr jrVar;
        if (pccVar == null || pccVar2 == null || (jrVar = pcc.get(pccVar)) == null) {
            return;
        }
        gm oo = jrVar.oo();
        of vj = jrVar.vj();
        if (oo == null || vj == null) {
            return;
        }
        long sf = pccVar2.sf();
        long oo2 = pccVar2.oo();
        if (oo2 <= 0 || sf <= 0) {
            return;
        }
        vj vjVar = new vj();
        vjVar.pcc(pccVar2.gm());
        vjVar.sf(oo2);
        com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = pcc(vj, jrVar.sf(), jrVar.gm(), oo, pccVar2);
        pcc2.pcc(vjVar);
        pcc2.pcc(pccVar2.vh());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, sf);
            jSONObject.put("percent", pccVar2.qf());
            pcc(pcc2, "feed_continue", jSONObject);
        } catch (JSONException e) {
            lo.pcc("TTAD.VideoEventManager", "", e);
        }
    }

    public static void gm(com.bykv.vk.openvk.pcc.pcc.pcc.sf.pcc pccVar, jr.pcc pccVar2) {
        jr jrVar;
        if (pccVar == null || pccVar2 == null || (jrVar = pcc.get(pccVar)) == null) {
            return;
        }
        gm oo = jrVar.oo();
        of vj = jrVar.vj();
        if (oo == null || vj == null) {
            return;
        }
        long sf = pccVar2.sf();
        long oo2 = pccVar2.oo();
        gbb gbbVar = new gbb(pccVar2.hc());
        gbbVar.pcc(pccVar2.gm());
        gbbVar.sf(oo2);
        com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = pcc(vj, jrVar.sf(), jrVar.gm(), oo, pccVar2);
        pcc2.pcc(gbbVar);
        pcc2.pcc(pccVar2.vh());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, sf);
            jSONObject.put("percent", pccVar2.qf());
            pcc(pcc2, "play_error", jSONObject);
        } catch (JSONException e) {
            lo.pcc("TTAD.VideoEventManager", "", e);
        }
    }

    public static void oo(com.bykv.vk.openvk.pcc.pcc.pcc.sf.pcc pccVar, jr.pcc pccVar2) {
        jr jrVar;
        if (pccVar == null || pccVar2 == null || (jrVar = pcc.get(pccVar)) == null) {
            return;
        }
        gm oo = jrVar.oo();
        of vj = jrVar.vj();
        if (oo == null || vj == null) {
            return;
        }
        long sf = pccVar2.sf();
        long oo2 = pccVar2.oo();
        com.bytedance.sdk.openadsdk.oo.vj.sf.sf sfVar = new com.bytedance.sdk.openadsdk.oo.vj.sf.sf();
        sfVar.pcc(pccVar2.gm());
        sfVar.sf(oo2);
        sfVar.pcc(pccVar2.vj());
        sfVar.sf(pccVar2.wh());
        com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = pcc(vj, jrVar.sf(), jrVar.gm(), oo, pccVar2);
        pcc2.pcc(sfVar);
        pcc2.pcc(pccVar2.vh());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, sf);
            jSONObject.put("percent", pccVar2.qf());
            pcc(pcc2, "endcard_skip", jSONObject);
        } catch (JSONException e) {
            lo.pcc("TTAD.VideoEventManager", "", e);
        }
        pcc.remove(pccVar);
    }

    public static void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.sf.pcc pccVar, jr.pcc pccVar2, qf qfVar) {
        if (pccVar == null || pccVar2 == null) {
            return;
        }
        vj(pccVar, pccVar2);
        jr jrVar = pcc.get(pccVar);
        if (jrVar == null) {
            return;
        }
        gm oo = jrVar.oo();
        of vj = jrVar.vj();
        if (oo == null || vj == null) {
            return;
        }
        long sf = pccVar2.sf();
        long oo2 = pccVar2.oo();
        com.bytedance.sdk.openadsdk.oo.vj.sf.oo ooVar = new com.bytedance.sdk.openadsdk.oo.vj.sf.oo();
        ooVar.sf(pccVar2.gm());
        ooVar.pcc(oo2);
        ooVar.pcc(pccVar2.kj());
        ooVar.sf(pccVar2.vy());
        com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = pcc(vj, jrVar.sf(), jrVar.gm(), oo, pccVar2);
        pcc2.pcc(ooVar);
        pcc(pccVar2, vj, pcc2.oo());
        pcc2.pcc(pccVar2.vh());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, sf);
            jSONObject.put("percent", pccVar2.qf());
            pcc(pcc2, "feed_break", jSONObject, qfVar);
        } catch (JSONException e) {
            lo.pcc("TTAD.VideoEventManager", "", e);
        }
    }

    public static void sf(com.bykv.vk.openvk.pcc.pcc.pcc.sf.pcc pccVar, jr.pcc pccVar2, qf qfVar) {
        if (pccVar == null || pccVar2 == null) {
            return;
        }
        vj(pccVar, pccVar2);
        jr jrVar = pcc.get(pccVar);
        if (jrVar == null) {
            return;
        }
        gm oo = jrVar.oo();
        of vj = jrVar.vj();
        if (oo == null || vj == null) {
            return;
        }
        long sf = pccVar2.sf();
        long oo2 = pccVar2.oo();
        wh whVar = new wh(oo);
        whVar.sf(pccVar2.gm());
        whVar.pcc(oo2);
        whVar.pcc(pccVar2.vy());
        com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = pcc(vj, jrVar.sf(), jrVar.gm(), oo, pccVar2);
        pcc2.pcc(whVar);
        JSONObject oo3 = pcc2.oo();
        pcc(pccVar2, vj, oo3);
        pcc2.pcc(pccVar2.vh());
        try {
            oo3.put("surface_texture_updated", pccVar2.jr() ? 1 : 0);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, sf);
            jSONObject.put("percent", pccVar2.qf());
            pcc(pcc2, "feed_over", jSONObject, qfVar);
        } catch (JSONException e) {
            lo.pcc("TTAD.VideoEventManager", "", e);
        }
        pcc.remove(pccVar);
    }

    public static void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.sf.pcc pccVar, boolean z, String str) {
        jr jrVar;
        if (pccVar == null || (jrVar = pcc.get(pccVar)) == null) {
            return;
        }
        gm oo = jrVar.oo();
        of vj = jrVar.vj();
        if (oo == null || vj == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = pcc(vj, jrVar.sf(), jrVar.gm(), oo, null);
        try {
            pcc2.gm().put("is_mute", z ? 1 : 0);
            pcc2.oo().put(Constants.MessagePayloadKeys.FROM, str);
        } catch (JSONException e) {
            lo.pcc("TTAD.VideoEventManager", "", e);
        }
        pcc(pcc2, "mute_state_change");
    }

    public static void vj(com.bykv.vk.openvk.pcc.pcc.pcc.sf.pcc pccVar, jr.pcc pccVar2) {
        jr jrVar;
        if (pccVar == null || pccVar2 == null || pccVar2.ork() <= 0 || (jrVar = pcc.get(pccVar)) == null) {
            return;
        }
        gm oo = jrVar.oo();
        of vj = jrVar.vj();
        if (oo == null || vj == null) {
            return;
        }
        long oo2 = pccVar2.oo();
        hc hcVar = new hc();
        hcVar.pcc(pccVar2.gm());
        hcVar.sf(oo2);
        hcVar.pcc(pccVar2.ork());
        com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pcc2 = pcc(vj, jrVar.sf(), jrVar.gm(), oo, pccVar2);
        pcc2.pcc(hcVar);
        pcc2.pcc(pccVar2.vh());
        pcc(pcc2, "play_buffer");
    }

    private static void pcc(com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pccVar, String str) {
        pcc(pccVar, str, (JSONObject) null, (qf) null);
    }

    private static void pcc(com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pccVar, String str, JSONObject jSONObject) {
        pcc(pccVar, str, jSONObject, (qf) null);
    }

    private static void pcc(com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pccVar, String str, qf qfVar) {
        pcc(pccVar, str, (JSONObject) null, qfVar);
    }

    private static void pcc(final com.bytedance.sdk.openadsdk.oo.vj.sf.pcc pccVar, String str, final JSONObject jSONObject, final qf qfVar) {
        if (pccVar == null) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (pccVar.wh() && !TextUtils.isEmpty(pccVar.sf())) {
            String sf = pccVar.sf();
            sf.hashCode();
            if (sf.equals("stream") || sf.equals("embeded_ad")) {
                str = "customer_".concat(String.valueOf(str));
            }
        }
        final String str2 = str;
        com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), pccVar.pcc(), pccVar.sf(), str2, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.1
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                qf qfVar2;
                try {
                    JSONObject gm = com.bytedance.sdk.openadsdk.oo.vj.sf.pcc.this.gm();
                    if (com.bytedance.sdk.openadsdk.oo.vj.sf.pcc.this.vj() != null) {
                        com.bytedance.sdk.openadsdk.oo.vj.sf.pcc.this.vj().pcc(gm);
                    }
                    if (("feed_play".equals(str2) || "feed_over".equals(str2) || "feed_break".equals(str2)) && (qfVar2 = qfVar) != null) {
                        qfVar2.pcc(gm);
                    }
                    return gm;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject pcc() {
                com.bytedance.sdk.openadsdk.oo.vj.sf.pcc.this.qf();
                return com.bytedance.sdk.openadsdk.oo.vj.sf.pcc.this.oo();
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                return jSONObject;
            }
        });
    }

    private static void pcc(final of ofVar, final gm gmVar, final jr.pcc pccVar) {
        oo.pcc();
        oo.pcc("pangle_video_play_state", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.2
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("service_duration", pcc.gm(gm.this));
                jSONObject.put("player_duration", pccVar.oo());
                jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                jSONObject.put("url", gm.this.dax());
                jSONObject.put("path", pcc.oo(gm.this));
                jSONObject.put("player_type", gm.this.lu());
                com.bytedance.sdk.openadsdk.dax.pcc.oo pcc2 = com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("pangle_video_play_state");
                of ofVar2 = ofVar;
                return pcc2.pcc(ofVar2 != null ? ofVar2.hh() : 0).sf(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long gm(gm gmVar) {
        if (gmVar == null) {
            return 0L;
        }
        sf yt = gmVar.gbb() ? gmVar.yt() : gmVar.of();
        if (yt != null) {
            return Double.valueOf(yt.wh() * 1000.0d).longValue();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String oo(gm gmVar) {
        return new File(gmVar.vj(), gmVar.nac()).getAbsolutePath();
    }

    public static boolean pcc(of ofVar) {
        try {
            JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.yt.vj.pcc("video_black_fallback", (Object) null, com.bytedance.sdk.openadsdk.yt.sf.pcc);
            if (ofVar != null && jSONObject != null && jSONObject.optInt(a.k) == 1 && ofVar.pjm() != 0) {
                if (System.currentTimeMillis() - com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_video_black_file", "video_black_time", 0L) < jSONObject.optLong("work_time", 604800000L)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            lo.pcc("TTAD.VideoEventManager", "isVideoBlack e = ", e);
            return false;
        }
    }

    public static void pcc(of ofVar, final int i, long j) {
        try {
            JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.yt.vj.pcc("video_black_fallback", (Object) null, com.bytedance.sdk.openadsdk.yt.sf.pcc);
            if (ofVar != null && jSONObject != null) {
                final boolean z = true;
                if (jSONObject.optInt(a.k) == 1 && ofVar.pjm() != 0) {
                    int optInt = jSONObject.optInt("texture_update_count", 5);
                    int optInt2 = jSONObject.optInt("play_duration", 3000);
                    final long currentTimeMillis = System.currentTimeMillis() - j;
                    if (currentTimeMillis <= optInt2 || i >= optInt) {
                        z = false;
                    }
                    if (z) {
                        com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("sp_video_black_file", "video_black_time", Long.valueOf(System.currentTimeMillis()));
                    }
                    com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), ofVar, ofVar.vj(), "video_black", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.3
                        @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                        public JSONObject pcc() {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.putOpt("is_black", Integer.valueOf(z ? 1 : 0));
                                jSONObject2.putOpt("play_duration", Long.valueOf(currentTimeMillis));
                                jSONObject2.putOpt("texture_update_count", Integer.valueOf(i));
                            } catch (JSONException e) {
                                lo.pcc("TTAD.VideoEventManager", "reportVideoBlackEvent e = ", e);
                            }
                            return jSONObject2;
                        }
                    });
                }
            }
        } catch (Exception e) {
            lo.pcc("TTAD.VideoEventManager", "reportVideoBlackEvent e = ", e);
        }
    }
}
