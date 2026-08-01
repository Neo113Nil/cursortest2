package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.WindowManager;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.of;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.common.net.HttpHeaders;
import com.ironsource.C4658ta;
import com.ironsource.C4665u;
import com.ironsource.C4761z5;
import com.ironsource.L6;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class yt implements of<com.bytedance.sdk.openadsdk.oo.pcc> {
    private final Context pcc;

    yt(Context context) {
        this.pcc = context;
    }

    @DungeonFlag
    private JSONObject sf(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.tsz tszVar, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = pcc(PangleEncryptConstant.CryptDataScene.GET_ADS, pcc(adSlot, tszVar, i));
            if (jSONObject != null) {
                jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
                jSONObject.put("oversea_version_type", 1);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("body data exception", th);
        }
        return jSONObject;
    }

    @Override // com.bytedance.sdk.openadsdk.core.of
    public JSONObject pcc(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.tsz tszVar, int i) throws JSONException {
        String str;
        JSONObject jSONObject = new JSONObject();
        String vj = (tszVar == null || TextUtils.isEmpty(tszVar.pcc)) ? com.bytedance.sdk.openadsdk.utils.kun.vj() : tszVar.pcc;
        if (i == 7) {
            if (tszVar != null && tszVar.sf > 0) {
                jSONObject.put("req_type", tszVar.sf);
            }
        } else if (i == 8) {
            if (tszVar != null && tszVar.gm > 0) {
                jSONObject.put("req_type", tszVar.gm);
            }
        } else if (i == 3 && tszVar != null && tszVar.oo > 0) {
            jSONObject.put("req_type", tszVar.oo);
        }
        try {
            String vy = lu.oo().vy();
            String mk = lu.oo().mk();
            if (vy != null && mk != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("version", vy);
                jSONObject2.put("param", mk);
                jSONObject.put("abtest", jSONObject2);
            }
        } catch (Throwable unused) {
        }
        jSONObject.put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, vj);
        com.bytedance.sdk.openadsdk.utils.kun.pcc(jSONObject);
        jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
        jSONObject.put("js_render_ver", com.bytedance.sdk.openadsdk.core.ork.hc.gm());
        jSONObject.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.ork.hc.oo());
        jSONObject.put("source_type", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        String pcc2 = hc.pcc(this.pcc);
        if (!TextUtils.isEmpty(pcc2)) {
            try {
                jSONObject.put("did", Long.parseLong(pcc2));
            } catch (Throwable unused2) {
            }
        }
        jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, sf());
        Object pcc3 = DeviceUtils.pcc(this.pcc, true);
        new Object[]{"device info:", pcc3};
        jSONObject.put("device", pcc3);
        jSONObject.put("user", pcc(adSlot));
        jSONObject.put(L6.d0, com.bytedance.sdk.openadsdk.utils.kun.oo());
        jSONObject.put("channel", U3.i.Z);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(pcc(adSlot, i, tszVar));
        jSONObject.put("adslots", jSONArray);
        pcc(jSONObject, tszVar);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        jSONObject.put("ts", currentTimeMillis);
        if (adSlot != null && adSlot.getCodeId() != null && vj != null) {
            str = String.valueOf(currentTimeMillis).concat(adSlot.getCodeId()).concat(vj);
        } else {
            str = "";
        }
        jSONObject.put("req_sign", com.bytedance.sdk.component.utils.vj.pcc(str));
        if (com.bytedance.sdk.openadsdk.core.tmg.gm.vj() != 0) {
            jSONObject.put("pglx", String.valueOf(com.bytedance.sdk.openadsdk.core.tmg.gm.vj()));
        }
        jSONObject.put("adx_id", ork.sf().tz());
        com.bytedance.sdk.openadsdk.wh.sf.pcc().pcc(jSONObject);
        return jSONObject;
    }

    private void pcc(JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.tsz tszVar) {
        if (tszVar == null || tszVar.vj == null) {
            return;
        }
        try {
            jSONObject.put("source_temai_product_ids", tszVar.vj);
        } catch (Exception unused) {
        }
    }

    private boolean oo(String str) {
        if (com.bytedance.sdk.openadsdk.core.vy.sf.pcc()) {
            return true;
        }
        if (!com.bytedance.sdk.openadsdk.core.vy.sf.pcc(str)) {
            return false;
        }
        String sf2 = com.bytedance.sdk.openadsdk.core.vy.sf.sf();
        if (!TextUtils.isEmpty(sf2)) {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(sf2, System.currentTimeMillis());
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.core.of
    public void pcc(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.tsz tszVar, int i, fum fumVar) {
        if (tszVar.wh || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            pcc(adSlot, tszVar, i, (of.pcc) fumVar);
            return;
        }
        if (!pcc(tszVar) && fumVar != null) {
            String pcc2 = fumVar.pcc();
            if (!TextUtils.isEmpty(pcc2)) {
                tszVar.tmg = pcc2;
                tszVar.hc = fumVar;
            }
        }
        pcc(adSlot, tszVar, i, (of.pcc) fumVar);
    }

    private boolean pcc(com.bytedance.sdk.openadsdk.core.model.tsz tszVar) {
        if (tszVar != null) {
            return tszVar.sf == 2 || tszVar.gm == 2 || tszVar.oo == 2;
        }
        return false;
    }

    public void pcc(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.tsz tszVar, final int i, of.pcc pccVar) {
        if (tszVar != null && (tszVar.sf == 2 || tszVar.gm == 2 || tszVar.oo == 2)) {
            adSlot.setPreload(true);
        }
        final com.bytedance.sdk.openadsdk.core.sf.pcc pccVar2 = new com.bytedance.sdk.openadsdk.core.sf.pcc(pccVar, adSlot, (adSlot.isPreload() || tszVar == null || tszVar.wh) ? false : true);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            jr.sf().post(new com.bytedance.sdk.component.kj.sf.gm("getAd") { // from class: com.bytedance.sdk.openadsdk.core.yt.1
                @Override // java.lang.Runnable
                public void run() {
                    yt.this.sf(adSlot, tszVar, i, pccVar2);
                }
            });
        } else {
            sf(adSlot, tszVar, i, pccVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(21:94|(1:98)|99|(2:100|101)|(2:103|(18:105|106|107|108|109|(2:113|(6:116|117|118|120|121|114))|125|126|127|(1:164)(1:130)|(1:132)|133|(1:135)(1:163)|136|(1:138)|(1:140)(8:143|144|145|(1:147)|148|149|(2:151|152)(2:155|(1:157))|153)|141|142))|170|109|(3:111|113|(1:114))|125|126|127|(0)|164|(0)|133|(0)(0)|136|(0)|(0)(0)|141|142) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02d0  */
    /* JADX WARN: Type inference failed for: r0v35, types: [com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc] */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.bytedance.sdk.openadsdk.core.yt] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v5 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7, types: [com.bytedance.sdk.component.qf.sf] */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r20v9 */
    /* JADX WARN: Type inference failed for: r30v0, types: [com.bytedance.sdk.openadsdk.core.yt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void sf(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.tsz tszVar, final int i, final of.pcc pccVar) {
        com.bytedance.sdk.openadsdk.core.model.gm gmVar;
        Map<String, String> pcc2;
        boolean z;
        Map map;
        com.bytedance.sdk.openadsdk.core.model.pcc pccVar2;
        ?? r13 = this;
        if (!com.bytedance.sdk.openadsdk.core.vh.sf.pcc().wh()) {
            pccVar.pcc(40060, vy.pcc(40060));
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().oo()) {
            pccVar.pcc(10007, vy.pcc(10007));
            return;
        }
        if (!com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vy()) {
            pccVar.pcc(10008, vy.pcc(10008));
            return;
        }
        boolean oo = com.bytedance.sdk.openadsdk.yt.vj.oo();
        com.bytedance.sdk.openadsdk.core.model.gm gmVar2 = new com.bytedance.sdk.openadsdk.core.model.gm();
        gmVar2.pcc(adSlot);
        if (!com.bytedance.sdk.openadsdk.core.settings.qf.pcc()) {
            if (pccVar != null) {
                pccVar.pcc(1000, "Ad request is temporarily paused, Please contact your AM");
                gmVar2.pcc(1000);
                com.bytedance.sdk.openadsdk.core.model.gm.pcc(gmVar2);
                return;
            }
            return;
        }
        if (!lu.oo().zsj()) {
            if (pccVar != null) {
                pccVar.pcc(-16, vy.pcc(-16));
                gmVar2.pcc(1001);
                com.bytedance.sdk.openadsdk.core.model.gm.pcc(gmVar2);
                return;
            }
            return;
        }
        if (pccVar == null) {
            return;
        }
        if (r13.oo(adSlot.getCodeId())) {
            pccVar.pcc(-8, vy.pcc(-8));
            return;
        }
        if (!TextUtils.isEmpty(adSlot.getBidAdm()) && !tszVar.wh) {
            gmVar2.sf(2);
            gmVar2.pcc(adSlot.getBidAdm());
            if (com.bytedance.sdk.component.utils.jr.gm()) {
                com.bykv.vk.openvk.pcc.pcc.pcc.qf.sf.pcc(adSlot.getBidAdm());
            }
            if (lu.oo().ptr() && zti.pcc().oo() == 1) {
                com.bytedance.sdk.openadsdk.utils.kun.pcc("Pangle_Debug_Mode", adSlot.getBidAdm(), r13.pcc);
            }
            try {
                JSONObject pcc3 = r13.pcc(new JSONObject(adSlot.getBidAdm()));
                if (pcc3 == null) {
                    gmVar2.gm(12);
                    r13.pcc(pccVar, gmVar2);
                    return;
                }
                pcc pcc4 = pcc.pcc(pcc3, adSlot, tszVar);
                gmVar2.pcc(pcc4.ork);
                hc.pcc(pcc4.vy);
                if (pcc4.oo != 20000) {
                    pccVar.pcc(pcc4.oo, pcc4.vj);
                    gmVar2.pcc(pcc4.oo);
                    gmVar2.gm(9);
                    com.bytedance.sdk.openadsdk.core.model.gm.pcc(gmVar2);
                    return;
                }
                if (pcc4.kj == null) {
                    gmVar2.gm(13);
                    r13.pcc(pccVar, gmVar2);
                    return;
                }
                if (pcc4.kj.vj() != null && !pcc4.kj.vj().isEmpty()) {
                    com.bytedance.sdk.openadsdk.dax.oo.pcc(pcc4.kj.vj().get(0));
                }
                r13.pcc(pcc4.kj);
                if (r13.pcc(pcc4.kj, pccVar)) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.gbb.gm.oo.pcc(pcc4.kj);
                pccVar.pcc(pcc4.kj, gmVar2);
                Map<String, com.bytedance.sdk.openadsdk.core.model.of> pcc5 = com.bytedance.sdk.openadsdk.core.model.pcc.pcc(pcc4.kj);
                if (pcc5 != null) {
                    com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(pcc5);
                }
                r13.pcc(pcc4.kj, i);
                com.bytedance.sdk.openadsdk.core.vj.pcc.pcc().pcc(pcc4.kj);
                return;
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.pcc("NetApiImpl", "get ad error: ", th);
                gmVar2.gm(14);
                gmVar2.sf(th.getMessage());
                r13.pcc(pccVar, gmVar2);
                return;
            }
        }
        if (tszVar != null && !TextUtils.isEmpty(tszVar.tmg)) {
            try {
                JSONObject pcc6 = r13.pcc(new JSONObject(tszVar.tmg));
                if (pcc6 != null) {
                    pcc pcc7 = pcc.pcc(pcc6, adSlot, tszVar);
                    if (tszVar.hc != null && (pccVar2 = pcc7.kj) != null && tszVar.hc.pcc(pccVar2)) {
                        com.bytedance.sdk.openadsdk.core.gbb.gm.oo.pcc(pccVar2);
                        pccVar.pcc(pccVar2, gmVar2);
                        return;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        JSONObject sf2 = sf(adSlot, tszVar, i);
        if (sf2 == null) {
            pccVar.pcc(-9, vy.pcc(-9));
            gmVar2.pcc(-9);
            com.bytedance.sdk.openadsdk.core.model.gm.pcc(gmVar2);
            return;
        }
        if (lu.oo().ptr() && zti.pcc().oo() == 1) {
            com.bytedance.sdk.openadsdk.utils.kun.pcc("Pangle_Debug_Mode", sf2.toString(), r13.pcc);
        }
        String pcc8 = com.bytedance.sdk.openadsdk.utils.kun.pcc("/api/ad/union/sdk/get_ads/", true, false);
        final com.bytedance.sdk.component.qf.sf.oo sf3 = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().sf();
        List<String> list = null;
        try {
            sf3.gm(com.bytedance.sdk.openadsdk.vy.oo.pcc(sf3, pcc8));
        } catch (Exception unused2) {
        }
        if (com.bytedance.sdk.openadsdk.utils.sf.gm()) {
            list = com.bytedance.sdk.openadsdk.utils.kun.pcc("/api/ad/union/sdk/get_ads/", true);
            if (!list.isEmpty()) {
                sf3.pcc(list);
                gmVar = gmVar2;
                try {
                    sf3.pcc(60L, TimeUnit.SECONDS);
                } catch (Exception unused3) {
                }
                final List<String> list2 = list;
                sf3.pcc(sf2.toString(), lu.oo().dax());
                pcc2 = com.bytedance.sdk.openadsdk.core.tmg.gm.pcc(pcc8, sf2.toString());
                if (pcc2 != null && pcc2.size() > 0) {
                    for (String str : pcc2.keySet()) {
                        try {
                            sf3.sf(str, pcc2.get(str));
                        } catch (Exception e) {
                            com.bytedance.sdk.component.utils.lo.gm("NetApiImpl", e.getMessage());
                        }
                    }
                }
                sf3.sf("User-Agent", com.bytedance.sdk.openadsdk.utils.kun.oo());
                r13.pcc(sf3, sf2);
                final com.bytedance.sdk.openadsdk.utils.tsx sf4 = com.bytedance.sdk.openadsdk.utils.tsx.sf();
                final Map<String, Object> requestExtraMap = adSlot.getRequestExtraMap();
                z = (ork.sf().jr() || requestExtraMap == null) ? false : true;
                if (z) {
                    requestExtraMap.put("pgad_start", sf4);
                }
                sf3.pcc(10);
                sf3.sf("get_ad");
                if (com.bytedance.sdk.openadsdk.utils.sf.sf()) {
                    com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.yt.11
                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                            com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar3 = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                            pccVar3.sf("get_ad");
                            pccVar3.gm(adSlot.getCodeId());
                            pccVar3.oo(com.bytedance.sdk.openadsdk.utils.kun.gm(adSlot.getDurationSlotType()));
                            return pccVar3;
                        }
                    });
                } else {
                    sf3.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.yt.12
                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                            com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar3 = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                            pccVar3.sf("get_ad");
                            pccVar3.gm(adSlot.getCodeId());
                            pccVar3.oo(com.bytedance.sdk.openadsdk.utils.kun.gm(adSlot.getDurationSlotType()));
                            return pccVar3;
                        }
                    });
                }
                if (com.bytedance.sdk.component.utils.jr.gm()) {
                    Thread.currentThread().getName();
                }
                if (oo) {
                    final boolean z2 = z;
                    final com.bytedance.sdk.openadsdk.core.model.gm gmVar3 = gmVar;
                    sf3.sf(new com.bytedance.sdk.component.qf.pcc.sf() { // from class: com.bytedance.sdk.openadsdk.core.yt.13
                        @Override // com.bytedance.sdk.component.qf.pcc.pcc
                        public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar4, com.bytedance.sdk.component.qf.sf sfVar) {
                            yt.this.pcc(gmVar4, sfVar, z2, requestExtraMap, sf4, adSlot, gmVar3, pccVar, tszVar, i, list2);
                        }

                        @Override // com.bytedance.sdk.component.qf.pcc.sf
                        public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar4, IOException iOException, com.bytedance.sdk.component.qf.sf sfVar) {
                            yt.this.pcc(sf3, iOException, sfVar, adSlot, z2, requestExtraMap, pccVar, gmVar3, list2);
                            if (gmVar4 != null) {
                                com.bytedance.sdk.openadsdk.utils.of.pcc(gmVar4.wh());
                            }
                        }
                    });
                    r13 = 0;
                } else {
                    try {
                        com.bytedance.sdk.component.qf.sf vj = sf3.vj();
                        if (vj == null) {
                            map = new com.bytedance.sdk.component.qf.sf(false, 5001, "response is null, content type is not support!!", null, "REQUEST_BODY_NULL", 1L, 1L);
                        }
                        com.bytedance.sdk.component.qf.sf sfVar = vj;
                        try {
                            if (sfVar.wh()) {
                                r13 = 0;
                                map = requestExtraMap;
                                pcc(sf3, sfVar, z, requestExtraMap, sf4, adSlot, gmVar, pccVar, tszVar, i, list2);
                            } else {
                                boolean z3 = false;
                                Map<String, Object> map2 = requestExtraMap;
                                pcc(sf3, new IOException(sfVar.sf()), sfVar, adSlot, z, map2, pccVar, gmVar, list2);
                                r13 = z3;
                                map = map2;
                                if (sf3 != null) {
                                    com.bytedance.sdk.openadsdk.utils.of.pcc(sf3.wh());
                                    r13 = z3;
                                    map = map2;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            pcc(sf3, new IOException(th.getMessage()), new com.bytedance.sdk.component.qf.sf(false, 5002, "execute method throw exception", null, "REQUEST_BODY_EXCEPTION", 1L, 1L), adSlot, z, map, pccVar, gmVar, list2);
                            com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().pcc(r13);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r13 = 0;
                        map = requestExtraMap;
                    }
                }
                com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().pcc(r13);
            }
        }
        gmVar = gmVar2;
        final List list22 = list;
        sf3.pcc(sf2.toString(), lu.oo().dax());
        pcc2 = com.bytedance.sdk.openadsdk.core.tmg.gm.pcc(pcc8, sf2.toString());
        if (pcc2 != null) {
            while (r6.hasNext()) {
            }
        }
        sf3.sf("User-Agent", com.bytedance.sdk.openadsdk.utils.kun.oo());
        r13.pcc(sf3, sf2);
        final com.bytedance.sdk.openadsdk.utils.tsx sf42 = com.bytedance.sdk.openadsdk.utils.tsx.sf();
        final Map requestExtraMap2 = adSlot.getRequestExtraMap();
        if (ork.sf().jr()) {
        }
        if (z) {
        }
        sf3.pcc(10);
        sf3.sf("get_ad");
        if (com.bytedance.sdk.openadsdk.utils.sf.sf()) {
        }
        if (com.bytedance.sdk.component.utils.jr.gm()) {
        }
        if (oo) {
        }
        com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().pcc(r13);
    }

    private void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        com.bytedance.sdk.openadsdk.core.model.of qf;
        if (pccVar == null || (qf = pccVar.qf()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.settings.vh.ye(qf.gye());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bytedance.sdk.component.qf.sf.oo ooVar, IOException iOException, com.bytedance.sdk.component.qf.sf sfVar, final AdSlot adSlot, boolean z, Map<String, Object> map, of.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar, List<String> list) {
        String str;
        int i;
        if (!com.bytedance.sdk.openadsdk.utils.sf.sf()) {
            com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.yt.14
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar2 = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar2.sf("get_ad");
                    pccVar2.gm(adSlot.getCodeId());
                    pccVar2.oo(com.bytedance.sdk.openadsdk.utils.kun.gm(adSlot.getDurationSlotType()));
                    return pccVar2;
                }
            });
        }
        if (sfVar != null) {
            str = sfVar.sf();
        } else if (iOException == null) {
            str = "";
        } else {
            str = iOException.getMessage();
        }
        String str2 = str;
        com.bytedance.sdk.openadsdk.utils.tsx sf2 = com.bytedance.sdk.openadsdk.utils.tsx.sf();
        if (z) {
            map.put("pgad_end", Long.valueOf(sf2.pcc));
        }
        if (lu.oo().ptr() && zti.pcc().oo() == 1) {
            com.bytedance.sdk.openadsdk.utils.kun.pcc("Pangle_Debug_Mode", iOException != null ? iOException.getMessage() : null, this.pcc);
        }
        if (sfVar != null) {
            i = sfVar.pcc();
        } else {
            i = (iOException == null || !(iOException instanceof SocketTimeoutException)) ? 601 : IronSourceError.ERROR_BN_INIT_FAILED_AFTER_LOAD;
        }
        int i2 = i;
        if (pccVar != null) {
            pccVar.pcc(i2, str2);
        }
        new Object[]{"onFailure: ", Integer.valueOf(i2)};
        gmVar.pcc(i2);
        gmVar.gm(10);
        gmVar.sf(str2);
        com.bytedance.sdk.openadsdk.core.model.gm.pcc(gmVar);
        com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc("get_ad", ooVar.wh(), i2, str2, ooVar.gm(), list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c1 A[Catch: all -> 0x0206, TryCatch #2 {all -> 0x0206, blocks: (B:11:0x002d, B:13:0x0048, B:15:0x0052, B:16:0x005d, B:18:0x0063, B:21:0x006c, B:23:0x0080, B:25:0x008f, B:27:0x0096, B:28:0x00a7, B:30:0x00a0, B:31:0x00b0, B:33:0x00b4, B:35:0x00bd, B:38:0x00c6, B:40:0x00d1, B:42:0x00d5, B:43:0x00dc, B:48:0x00ea, B:50:0x00f2, B:52:0x00fe, B:92:0x011e, B:94:0x012a, B:58:0x0138, B:60:0x0145, B:61:0x0156, B:62:0x014e, B:63:0x0159, B:66:0x017a, B:67:0x01a1, B:69:0x01c1, B:70:0x01c8, B:72:0x01d0, B:75:0x01de), top: B:10:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, com.bytedance.sdk.component.qf.sf sfVar, boolean z, Map<String, Object> map, com.bytedance.sdk.openadsdk.utils.tsx tsxVar, final AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.gm gmVar2, of.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.tsz tszVar, int i, List<String> list) {
        of.pcc pccVar2;
        com.bytedance.sdk.openadsdk.core.model.gm gmVar3;
        Object[] objArr;
        Map<String, com.bytedance.sdk.openadsdk.core.model.of> pcc2;
        JSONObject jSONObject;
        String str;
        if (z) {
            map.put("pgad_end", tsxVar);
        }
        if (sfVar == null) {
            return;
        }
        if (sfVar.wh()) {
            if (!com.bytedance.sdk.openadsdk.utils.sf.sf()) {
                com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.yt.15
                    @Override // com.bytedance.sdk.openadsdk.lu.oo
                    public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                        com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar3 = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                        pccVar3.sf("get_ad");
                        pccVar3.gm(adSlot.getCodeId());
                        pccVar3.oo(com.bytedance.sdk.openadsdk.utils.kun.gm(adSlot.getDurationSlotType()));
                        return pccVar3;
                    }
                });
            }
            try {
                com.bytedance.sdk.openadsdk.utils.tsx sf2 = com.bytedance.sdk.openadsdk.utils.tsx.sf();
                String oo = sfVar.oo();
                gmVar2.pcc(oo);
                JSONObject jSONObject2 = new JSONObject(oo);
                if (lu.oo().ptr() && zti.pcc().oo() == 1) {
                    com.bytedance.sdk.openadsdk.utils.kun.pcc("Pangle_Debug_Mode", jSONObject2.toString(), this.pcc);
                }
                JSONObject pcc3 = pcc(jSONObject2);
                if (pcc3 == null) {
                    gmVar2.gm(12);
                    pcc(pccVar, gmVar2);
                    return;
                }
                pcc pcc4 = pcc.pcc(pcc3, adSlot, tszVar);
                gmVar2.pcc(pcc4.ork);
                hc.pcc(pcc4.vy);
                if (pcc4.oo != 20000) {
                    gmVar2.pcc(pcc4.oo);
                    if (!lu.oo().rnn() && pcc4.oo == 40029) {
                        pccVar.pcc(-100, vy.pcc(-100));
                    } else {
                        pccVar.pcc(pcc4.oo, pcc4.vj);
                    }
                    gmVar2.gm(9);
                    com.bytedance.sdk.openadsdk.core.model.gm.pcc(gmVar2);
                    return;
                }
                if (pcc4.kj == null) {
                    gmVar2.gm(13);
                    pcc(pccVar, gmVar2);
                    return;
                }
                if (pcc(pcc4.kj, pccVar)) {
                    return;
                }
                pcc4.kj.gm(oo);
                com.bytedance.sdk.openadsdk.utils.tsx sf3 = com.bytedance.sdk.openadsdk.utils.tsx.sf();
                if (tszVar != null && tszVar.vh != null) {
                    tszVar.vh.pcc(tsxVar, sf2, pcc4.pcc, sf3);
                }
                Object[] objArr2 = com.bytedance.sdk.openadsdk.yt.vj.vj() && i == 1;
                if (objArr2 != false && pcc4.kj.vj() != null && !pcc4.kj.vj().isEmpty()) {
                    com.bytedance.sdk.openadsdk.core.model.of ofVar = pcc4.kj.vj().get(0);
                    String gm = com.bytedance.sdk.openadsdk.utils.kun.gm(i);
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    long j = 0;
                    if (tszVar != null) {
                        try {
                            jSONObject = jSONObject3;
                            str = gm;
                            if (tszVar.ork.pcc > 0) {
                                j = sf3.pcc(tszVar.ork);
                            }
                        } catch (Exception unused) {
                        }
                    } else {
                        jSONObject = jSONObject3;
                        str = gm;
                    }
                    long j2 = j;
                    if (ofVar != null) {
                        boolean jy = ofVar.jy();
                        jSONObject4.put("is_new_engine", jy ? 1 : 0);
                        jSONObject4.put("webview_cache_size", jy ? com.bytedance.sdk.component.adexpress.vj.vj.pcc().oo() : com.bytedance.sdk.component.adexpress.vj.vj.pcc().gm());
                    }
                    JSONObject jSONObject5 = jSONObject;
                    objArr = objArr2;
                    String str2 = str;
                    try {
                        pcc(sfVar.qf(), tszVar, tsxVar, sf2, pcc4.pcc, sf3, ofVar, str2, jSONObject4, true);
                        jSONObject5.put(IronSourceConstants.EVENTS_DURATION, j2);
                        jSONObject5.put("extra_data", jSONObject4);
                        jSONObject5.put("tag", str2);
                        jSONObject5.put("callback_start", sf3.pcc());
                        pcc4.kj.pcc(jSONObject5);
                    } catch (Exception unused2) {
                    }
                    com.bytedance.sdk.openadsdk.core.gbb.gm.oo.pcc(pcc4.kj);
                    pccVar.pcc(pcc4.kj, gmVar2);
                    pcc(pcc4.kj, i);
                    com.bytedance.sdk.openadsdk.core.vj.pcc.pcc().pcc(pcc4.kj);
                    pcc2 = com.bytedance.sdk.openadsdk.core.model.pcc.pcc(pcc4.kj);
                    if (pcc2 != null) {
                        com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(pcc2);
                    }
                    if (pcc4.kj.vj() != null || pcc4.kj.vj().isEmpty() || objArr == true) {
                        return;
                    }
                    pccVar2 = pccVar;
                    gmVar3 = gmVar2;
                    try {
                        pcc(sfVar.qf(), tszVar, tsxVar, sf2, pcc4.pcc, sf3, pcc4.kj.vj().get(0), com.bytedance.sdk.openadsdk.utils.kun.gm(i));
                        return;
                    } catch (Throwable th) {
                        th = th;
                        com.bytedance.sdk.component.utils.lo.pcc("NetApiImpl", "get ad error: ", th);
                        gmVar3.sf(th.getMessage());
                        gmVar3.gm(14);
                        pcc(pccVar2, gmVar3);
                        com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc("get_ad", gmVar.wh(), -9, th.getMessage(), gmVar.gm(), list);
                        ApmHelper.reportCustomError("", "parse_error", th);
                        return;
                    }
                }
                objArr = objArr2;
                com.bytedance.sdk.openadsdk.core.gbb.gm.oo.pcc(pcc4.kj);
                pccVar.pcc(pcc4.kj, gmVar2);
                pcc(pcc4.kj, i);
                com.bytedance.sdk.openadsdk.core.vj.pcc.pcc().pcc(pcc4.kj);
                pcc2 = com.bytedance.sdk.openadsdk.core.model.pcc.pcc(pcc4.kj);
                if (pcc2 != null) {
                }
                if (pcc4.kj.vj() != null) {
                }
            } catch (Throwable th2) {
                th = th2;
                pccVar2 = pccVar;
                gmVar3 = gmVar2;
            }
        } else {
            if (!com.bytedance.sdk.openadsdk.utils.sf.sf()) {
                com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.yt.16
                    @Override // com.bytedance.sdk.openadsdk.lu.oo
                    public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                        com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar3 = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                        pccVar3.sf("get_ad");
                        pccVar3.gm(adSlot.getCodeId());
                        pccVar3.oo(com.bytedance.sdk.openadsdk.utils.kun.gm(adSlot.getDurationSlotType()));
                        return pccVar3;
                    }
                });
            }
            int pcc5 = sfVar.pcc();
            String sf4 = sfVar.sf();
            pccVar.pcc(pcc5, sf4);
            gmVar2.pcc(pcc5);
            gmVar2.gm(11);
            gmVar2.sf(sf4);
            com.bytedance.sdk.openadsdk.core.model.gm.pcc(gmVar2);
            com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc("get_ad", gmVar.wh(), pcc5, sf4, gmVar.gm(), list);
        }
    }

    private boolean pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, of.pcc pccVar2) {
        if (pccVar == null) {
            pccVar2.pcc(40053, vy.pcc(40053));
            return true;
        }
        List<com.bytedance.sdk.openadsdk.core.model.of> vj = pccVar.vj();
        if (vj.isEmpty()) {
            return false;
        }
        for (final com.bytedance.sdk.openadsdk.core.model.of ofVar : vj) {
            if (TextUtils.isEmpty(ofVar.bo().sf()) || TextUtils.isEmpty(ofVar.bo().gm())) {
                pccVar2.pcc(40053, vy.pcc(40053));
                com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), ofVar, com.bytedance.sdk.openadsdk.utils.kun.pcc(ofVar), "material_error", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.yt.17
                    @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                    public JSONObject pcc() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("ad_label", ofVar.bo().qf());
                            return jSONObject;
                        } catch (Throwable unused) {
                            return null;
                        }
                    }
                });
                return true;
            }
        }
        return false;
    }

    private void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, int i) {
        List<com.bytedance.sdk.openadsdk.core.model.lu> by;
        List<com.bytedance.sdk.openadsdk.core.model.of> vj = pccVar.vj();
        if (vj == null || vj.size() == 0) {
            return;
        }
        for (int i2 = 0; i2 < vj.size(); i2++) {
            com.bytedance.sdk.openadsdk.core.model.of ofVar = vj.get(i2);
            if (ofVar != null && ofVar.se() == null) {
                pcc("", 0, 0, ofVar.zk(), ofVar);
                if (i == 3) {
                    pcc("", 0, 0, ofVar.rv(), ofVar);
                }
                if (ofVar.kez() != null) {
                    pcc(ofVar.kez().ork(), ofVar.kez().gm(), ofVar.kez().sf(), (com.bytedance.sdk.openadsdk.core.model.lu) null, ofVar);
                }
                if ((i != 1 || ofVar.kez() == null) && (by = ofVar.by()) != null && by.size() > 0) {
                    for (int i3 = 0; i3 < by.size(); i3++) {
                        pcc(ofVar, by.get(i3));
                    }
                }
            }
        }
    }

    private void pcc(String str, int i, int i2, com.bytedance.sdk.openadsdk.core.model.lu luVar, com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        if (!TextUtils.isEmpty(str)) {
            com.bytedance.sdk.openadsdk.ork.oo.pcc(str).pcc(i).sf(i2).vj(rj.vj(lu.pcc())).oo(rj.gm(lu.pcc())).gm(1).pcc(new com.bytedance.sdk.openadsdk.ork.sf(ofVar, str, null), 4);
        } else {
            if (luVar == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.ork.oo.pcc(luVar).gm(1).pcc(new com.bytedance.sdk.openadsdk.ork.sf(ofVar, luVar.pcc(), null), 4);
        }
    }

    private void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, com.bytedance.sdk.openadsdk.core.model.lu luVar) {
        if (luVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ork.oo.pcc(luVar).gm(1).pcc(new com.bytedance.sdk.openadsdk.ork.sf(ofVar, luVar.pcc(), new com.bytedance.sdk.component.vj.dax() { // from class: com.bytedance.sdk.openadsdk.core.yt.18
            @Override // com.bytedance.sdk.component.vj.dax
            public void pcc(int i, String str, Throwable th) {
            }

            @Override // com.bytedance.sdk.component.vj.dax
            public void pcc(com.bytedance.sdk.component.vj.vh vhVar) {
            }
        }), 4);
    }

    private void pcc(com.bytedance.sdk.component.sf.pcc.ork orkVar, com.bytedance.sdk.openadsdk.core.model.tsz tszVar, com.bytedance.sdk.openadsdk.utils.tsx tsxVar, com.bytedance.sdk.openadsdk.utils.tsx tsxVar2, int i, com.bytedance.sdk.openadsdk.utils.tsx tsxVar3, com.bytedance.sdk.openadsdk.core.model.of ofVar, String str) {
        if (lu.oo().vr()) {
            JSONObject jSONObject = new JSONObject();
            long j = 0;
            if (tszVar != null) {
                try {
                    if (tszVar.ork.pcc > 0) {
                        j = tsxVar3.pcc(tszVar.ork);
                        pcc(orkVar, tszVar, tsxVar, tsxVar2, i, tsxVar3, ofVar, str, jSONObject, false);
                        com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, str, "load_ad_time", j, jSONObject);
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            pcc(orkVar, tszVar, tsxVar, tsxVar2, i, tsxVar3, ofVar, str, jSONObject, false);
            com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, str, "load_ad_time", j, jSONObject);
        }
    }

    private static void pcc(com.bytedance.sdk.component.sf.pcc.ork orkVar, com.bytedance.sdk.openadsdk.core.model.tsz tszVar, com.bytedance.sdk.openadsdk.utils.tsx tsxVar, com.bytedance.sdk.openadsdk.utils.tsx tsxVar2, int i, com.bytedance.sdk.openadsdk.utils.tsx tsxVar3, com.bytedance.sdk.openadsdk.core.model.of ofVar, String str, JSONObject jSONObject, boolean z) throws JSONException {
        if (tszVar != null && tszVar.ork.pcc > 0) {
            jSONObject.put("client_start_time", tsxVar.pcc(tszVar.ork));
        }
        jSONObject.put("network_time", tsxVar2.pcc(tsxVar));
        jSONObject.put("sever_time", i);
        jSONObject.put("client_end_time", tsxVar3.pcc(tsxVar2));
        if (str.equals("open_ad")) {
            jSONObject.put("is_icon_only", ofVar.ye() ? 1 : 0);
        }
        if (ofVar != null) {
            jSONObject.put("render_control_type", ofVar.ei());
        }
        jSONObject.put("webview_cache_size", com.bytedance.sdk.component.adexpress.vj.vj.pcc().gm());
        jSONObject.put("sync_barrier_open", z ? 1 : 0);
        if (orkVar.sf > 0) {
            jSONObject.put("enqueue_2_run_ts", orkVar.gm - orkVar.sf);
            jSONObject.put("run_2_connect_end_ts", orkVar.vj - orkVar.sf);
            jSONObject.put("connect_end_2_response_end_ts", orkVar.wh - orkVar.vj);
            jSONObject.put("response_end_2_callback_end_ts", SystemClock.elapsedRealtime() - orkVar.wh);
        }
    }

    private boolean gm(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    @Override // com.bytedance.sdk.openadsdk.core.of
    @DungeonFlag
    public com.bytedance.sdk.openadsdk.oo.vj pcc(JSONObject jSONObject, String str, List<String> list) {
        String str2;
        boolean z;
        try {
            byte[] bArr = null;
            if (com.bytedance.sdk.openadsdk.core.settings.qf.pcc() && !com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj()) {
                com.bytedance.sdk.component.qf.sf.oo sf2 = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().sf();
                sf2.gm(str);
                if (com.bytedance.sdk.openadsdk.utils.sf.gm() && list != null && !list.isEmpty()) {
                    sf2.pcc(list);
                    sf2.pcc(60L, TimeUnit.SECONDS);
                }
                if (com.bytedance.sdk.openadsdk.core.settings.vh.sf().bbd()) {
                    sf2.sf("_disable_retry", "1");
                }
                Pair<Integer, byte[]> encryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(vj(jSONObject.toString()));
                if (encryptType4WithoutBase64 != null && encryptType4WithoutBase64.second != null && ((byte[]) encryptType4WithoutBase64.second).length > 0) {
                    bArr = (byte[]) encryptType4WithoutBase64.second;
                    jsj.sf(true);
                } else {
                    int intValue = encryptType4WithoutBase64 != null ? ((Integer) encryptType4WithoutBase64.first).intValue() : 0;
                    jsj.sf(false);
                    jsj.pcc(1, PangleEncryptConstant.CryptDataScene.APP_LOG, intValue);
                }
                if (bArr != null) {
                    sf2.sf(HttpHeaders.CONTENT_ENCODING, "union_sdk_encode");
                    sf2.sf("x-pgli18n", "4");
                    sf2.pcc("application/octet-stream;tt-data=a", bArr);
                }
                if (bArr == null) {
                    try {
                        JSONObject pcc2 = com.bytedance.sdk.component.utils.pcc.pcc(jSONObject);
                        if (!gm(pcc2)) {
                            pcc2 = jSONObject;
                        }
                        pcc(vj(pcc2), sf2);
                        sf2.pcc(pcc2.toString(), lu.oo().dax());
                    } catch (OutOfMemoryError e) {
                        com.bytedance.sdk.component.utils.lo.gm("NetApiImpl", e.toString());
                        return new com.bytedance.sdk.openadsdk.oo.vj(false, -2, "encrypt_error", false);
                    }
                }
                com.bytedance.sdk.component.qf.sf vj = sf2.vj();
                boolean wh = (vj == null || !vj.wh() || TextUtils.isEmpty(vj.oo())) ? false : wh(new JSONObject(vj.oo()));
                String str3 = "error unknown";
                int pcc3 = vj != null ? vj.pcc() : 0;
                if (!wh && pcc3 == 200) {
                    str2 = "server say not success";
                    z = true;
                } else {
                    if (vj != null && vj.sf() != null) {
                        str3 = vj.sf();
                    }
                    str2 = str3;
                    z = false;
                }
                if (vj == null) {
                    com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc("applog", str, -1, "response is null", sf2.gm(), list);
                } else if (!vj.wh()) {
                    com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc("applog", str, pcc3, vj.sf(), sf2.gm(), list);
                }
                oo(jSONObject);
                return new com.bytedance.sdk.openadsdk.oo.vj(wh, pcc3, str2, z);
            }
            return null;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.pcc("NetApiImpl", "uploadEvent error", th);
            return new com.bytedance.sdk.openadsdk.oo.vj(false, IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW, "service_busy", false);
        }
    }

    private void pcc(Map<String, String> map, com.bytedance.sdk.component.qf.sf.oo ooVar) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                try {
                    ooVar.sf(entry.getKey(), entry.getValue());
                } catch (Exception e) {
                    com.bytedance.sdk.component.utils.lo.gm("NetApiImpl", "ADD header exceptopn", e.getMessage());
                }
            }
        }
        try {
            ooVar.sf("User-Agent", com.bytedance.sdk.openadsdk.utils.kun.oo());
        } catch (Exception e2) {
            com.bytedance.sdk.component.utils.lo.gm("NetApiImpl", "ADD header exceptopn", e2.getMessage());
        }
    }

    private void oo(JSONObject jSONObject) {
        byte[] bArr;
        if (ork.sf().dax()) {
            try {
                jSONObject.getJSONObject("header").put(C4658ta.b, "4562");
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.lo.gm("NetApiImpl", "reportETEvent error", e.getMessage());
            }
            com.bytedance.sdk.component.qf.sf.oo sf2 = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().sf();
            sf2.gm(com.bytedance.sdk.openadsdk.utils.kun.tz());
            Pair<Integer, byte[]> encryptType4WithoutBase64 = PangleEncryptManager.encryptType4WithoutBase64(vj(jSONObject.toString()));
            if (encryptType4WithoutBase64 != null && encryptType4WithoutBase64.second != null && ((byte[]) encryptType4WithoutBase64.second).length > 0) {
                bArr = (byte[]) encryptType4WithoutBase64.second;
                jsj.sf(true);
            } else {
                int intValue = encryptType4WithoutBase64 != null ? ((Integer) encryptType4WithoutBase64.first).intValue() : 0;
                jsj.sf(false);
                jsj.pcc(1, PangleEncryptConstant.CryptDataScene.APP_LOG, intValue);
                bArr = null;
            }
            if (bArr != null) {
                sf2.sf(HttpHeaders.CONTENT_ENCODING, "union_sdk_encode");
                sf2.sf("x-pgli18n", "4");
                sf2.pcc("application/octet-stream;tt-data=a", bArr);
            }
            if (bArr == null) {
                JSONObject pcc2 = com.bytedance.sdk.component.utils.pcc.pcc(jSONObject);
                if (gm(pcc2)) {
                    jSONObject = pcc2;
                }
                pcc(vj(jSONObject), sf2);
                sf2.pcc(jSONObject.toString(), lu.oo().dax());
            }
            sf2.pcc(7);
            sf2.sf("et_applog");
            sf2.sf(new com.bytedance.sdk.component.qf.pcc.pcc() { // from class: com.bytedance.sdk.openadsdk.core.yt.2
                @Override // com.bytedance.sdk.component.qf.pcc.pcc
                public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, com.bytedance.sdk.component.qf.sf sfVar) {
                    if (sfVar == null || !sfVar.wh()) {
                        return;
                    }
                    new Object[]{"onResponse: ", sfVar.oo()};
                }

                @Override // com.bytedance.sdk.component.qf.pcc.pcc
                public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, IOException iOException) {
                    new Object[]{"onFailure: ", iOException.getMessage()};
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.of
    public void pcc(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        JSONObject sf2;
        final List<String> list2;
        if (!com.bytedance.sdk.openadsdk.core.settings.qf.pcc() || com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj() || (sf2 = sf(str, list, jSONObject, str2, str3)) == null) {
            return;
        }
        com.bytedance.sdk.component.qf.sf.oo sf3 = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().sf();
        final String oo = com.bytedance.sdk.openadsdk.utils.kun.oo("/api/ad/union/dislike_event/");
        JSONObject pcc2 = pcc(PangleEncryptConstant.CryptDataScene.DISLIKE, sf2);
        String jSONObject2 = pcc2 != null ? pcc2.toString() : null;
        pcc(sf3, pcc2);
        sf3.gm(oo);
        if (com.bytedance.sdk.openadsdk.utils.sf.gm()) {
            list2 = com.bytedance.sdk.openadsdk.utils.kun.pcc("/api/ad/union/dislike_event/", false);
            if (!list2.isEmpty()) {
                sf3.pcc(list2);
                sf3.pcc(60L, TimeUnit.SECONDS);
            }
        } else {
            list2 = null;
        }
        sf3.vj(jSONObject2);
        sf3.pcc(7);
        sf3.sf("dislike");
        if (com.bytedance.sdk.openadsdk.utils.sf.sf()) {
            sf3.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.yt.3
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf("dislike");
                    return pccVar;
                }
            });
        } else {
            com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.yt.4
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf("dislike");
                    return pccVar;
                }
            });
        }
        sf3.sf(new com.bytedance.sdk.component.qf.pcc.pcc() { // from class: com.bytedance.sdk.openadsdk.core.yt.5
            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, com.bytedance.sdk.component.qf.sf sfVar) {
                boolean sf4 = com.bytedance.sdk.openadsdk.utils.sf.sf();
                if (sfVar != null) {
                    if (sfVar.wh()) {
                        if (sf4) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.yt.5.1
                            @Override // com.bytedance.sdk.openadsdk.lu.oo
                            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                pccVar.sf("dislike");
                                return pccVar;
                            }
                        });
                        return;
                    } else {
                        if (!sf4) {
                            com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.yt.5.2
                                @Override // com.bytedance.sdk.openadsdk.lu.oo
                                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                    pccVar.sf("dislike");
                                    return pccVar;
                                }
                            });
                        }
                        com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc("dislike", oo, sfVar.pcc(), sfVar.sf(), gmVar.gm(), list2);
                        return;
                    }
                }
                com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc("dislike", oo, -1, "response is null", gmVar.gm(), list2);
                if (sf4) {
                    return;
                }
                com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.yt.5.3
                    @Override // com.bytedance.sdk.openadsdk.lu.oo
                    public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                        com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                        pccVar.sf("dislike");
                        return pccVar;
                    }
                });
            }

            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, IOException iOException) {
                com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc("dislike", oo, -1, iOException != null ? iOException.getMessage() : "null", gmVar.gm(), list2);
                if (gmVar != null) {
                    com.bytedance.sdk.openadsdk.utils.of.pcc(gmVar.wh());
                }
                if (com.bytedance.sdk.openadsdk.utils.sf.sf()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.yt.5.4
                    @Override // com.bytedance.sdk.openadsdk.lu.oo
                    public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                        com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                        pccVar.sf("dislike");
                        return pccVar;
                    }
                });
            }
        });
        try {
            String optString = new JSONObject(str).optString("cid", "");
            if (TextUtils.isEmpty(optString)) {
                return;
            }
            com.bytedance.sdk.openadsdk.wh.sf.pcc().pcc("dislike", optString, (String) null, (String) null);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.lo.gm(e.getMessage(), new Object[0]);
        }
    }

    public static JSONObject pcc(PangleEncryptConstant.CryptDataScene cryptDataScene, JSONObject jSONObject) {
        JSONObject encryptType4 = PangleEncryptManager.encryptType4(jSONObject, new qy(cryptDataScene));
        jsj.pcc(encryptType4);
        return encryptType4;
    }

    @DungeonFlag
    private JSONObject sf(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("timestamp", System.currentTimeMillis());
            jSONObject3.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            JSONObject jSONObject4 = new JSONObject(str);
            jSONObject4.put(L6.X0, com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().sf());
            jSONObject3.put("extra", jSONObject4.toString());
            jSONObject3.put("filter_words", pcc(list));
            jSONObject3.put("dislike_source", str3);
            if (jSONObject != null && !TextUtils.isEmpty(str2)) {
                jSONObject3.put("creative_info", com.bytedance.sdk.component.utils.pcc.pcc(jSONObject).toString());
                jSONObject3.put("feedback_type", 1);
                jSONObject3.put("user_description", str2);
            }
            new Object[]{"dislike_source is：", str3};
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            jSONObject2.put("actions", jSONArray);
        } catch (Exception unused) {
        }
        return jSONObject2;
    }

    private JSONArray pcc(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().getId());
        }
        return jSONArray;
    }

    private Map<String, String> vj(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/json; charset=utf-8");
        if (gm(jSONObject)) {
            hashMap.put(HttpHeaders.CONTENT_ENCODING, "union_sdk_encode");
        }
        return hashMap;
    }

    private boolean wh(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        try {
            return jSONObject.optString("message").equalsIgnoreCase("success");
        } catch (Throwable unused) {
            return false;
        }
    }

    private void pcc(of.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar) {
        pccVar.pcc(-1, vy.pcc(-1));
        gmVar.pcc(-1);
        com.bytedance.sdk.openadsdk.core.model.gm.pcc(gmVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(of.sf sfVar) {
        sfVar.pcc(-1, vy.pcc(-1));
    }

    @DungeonFlag
    private JSONObject sf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appid", ork.sf().oo());
            jSONObject.put("name", ork.sf().kj());
            qf(jSONObject);
            Context pcc2 = lu.pcc();
            String str = "";
            if (pcc2 != null) {
                try {
                    str = pcc2.getPackageResourcePath();
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lo.gm("NetApiImpl", "failed to get the application installation package path. error: " + th.getMessage());
                }
            }
            jSONObject.put("package_install_path", str);
            int i = 0;
            jSONObject.put("is_paid_app", false);
            jSONObject.put("apk_sign", com.bytedance.sdk.openadsdk.common.gm.vy());
            jSONObject.put("app_running_time", (System.currentTimeMillis() - jr.pcc()) / 1000);
            jSONObject.put("fmwname", DeviceUtils.ork());
            jSONObject.put("is_init", jr.vj() ? 1 : 0);
            if (pcc2 != null) {
                int rotation = ((WindowManager) pcc2.getSystemService("window")).getDefaultDisplay().getRotation();
                if (rotation == 0) {
                    i = 1;
                } else if (rotation == 1) {
                    i = 3;
                } else if (rotation == 2) {
                    i = 2;
                } else if (rotation == 3) {
                    i = 4;
                }
                jSONObject.put("orientation_support", new JSONArray().put(i));
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONObject pcc(AdSlot adSlot) {
        mk mkVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("personalized_ad", lu.oo().gd());
            jSONObject.put("lmt", DeviceUtils.gm());
            if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vh()) {
                jSONObject.put("pa_consent", ork.sf().ork());
            }
            jSONObject.put("user_compliance_status", com.bytedance.sdk.openadsdk.core.vh.sf.pcc().kj());
            jSONObject.put("tcstring", com.bytedance.sdk.openadsdk.core.settings.vh.sf(lu.pcc()));
            jSONObject.put("tcf_gdpr", com.bytedance.sdk.openadsdk.core.settings.vh.pcc(lu.pcc()));
            if (adSlot != null && mk.pcc.containsKey(Integer.valueOf(adSlot.getCodeId())) && (mkVar = mk.pcc.get(Integer.valueOf(adSlot.getCodeId()))) != null) {
                jSONObject.put("lastadomain", mkVar.sf());
                jSONObject.put("lastbundle", mkVar.gm());
                jSONObject.put("lastclick", mkVar.oo());
                jSONObject.put("lastskip", mkVar.vj());
            }
            pcc(jSONObject, "data", sf(adSlot));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String sf(AdSlot adSlot) {
        String tmg = ork.sf().tmg();
        if (adSlot == null) {
            return TextUtils.isEmpty(tmg) ? "" : tmg;
        }
        String userData = adSlot.getUserData();
        if (TextUtils.isEmpty(tmg)) {
            return userData;
        }
        if (TextUtils.isEmpty(userData)) {
            return tmg;
        }
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = new JSONArray(userData);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (jSONObject != null) {
                    hashSet.add(jSONObject.optString("name", null));
                }
            }
            try {
                JSONArray jSONArray2 = new JSONArray(tmg);
                int length2 = jSONArray2.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i2);
                    if (jSONObject2 != null && !hashSet.contains(jSONObject2.optString("name", null))) {
                        jSONArray.put(jSONObject2);
                    }
                }
                return jSONArray.toString();
            } catch (Throwable unused) {
                return userData;
            }
        } catch (Throwable unused2) {
            return tmg;
        }
    }

    private static void pcc(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        jSONObject.put(str, str2);
    }

    @DungeonFlag
    private void qf(JSONObject jSONObject) {
        try {
            jSONObject.put("package_name", com.bytedance.sdk.openadsdk.utils.kun.wh());
            jSONObject.put("version_code", com.bytedance.sdk.openadsdk.utils.kun.qf());
            jSONObject.put("version", com.bytedance.sdk.openadsdk.utils.kun.kj());
        } catch (Exception unused) {
        }
    }

    private JSONObject pcc(AdSlot adSlot, int i, com.bytedance.sdk.openadsdk.core.model.tsz tszVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", adSlot.getCodeId());
            jSONObject.put("adtype", i);
            if (!TextUtils.isEmpty(adSlot.getAdId()) || !TextUtils.isEmpty(adSlot.getCreativeId()) || !TextUtils.isEmpty(adSlot.getExt())) {
                JSONObject jSONObject2 = new JSONObject();
                if (!TextUtils.isEmpty(adSlot.getAdId())) {
                    jSONObject2.put("ad_id", adSlot.getAdId());
                }
                if (!TextUtils.isEmpty(adSlot.getCreativeId())) {
                    jSONObject2.put(CampaignEx.JSON_KEY_CREATIVE_ID, adSlot.getCreativeId());
                }
                if (adSlot.getExt() != null) {
                    jSONObject2.put("ext", adSlot.getExt());
                }
                jSONObject.put("preview_ads", jSONObject2);
            }
            if (tszVar != null) {
                jSONObject.put("render_method", tszVar.vy);
                if (tszVar.vy == 1) {
                    pcc(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
                } else if (tszVar.vy == 2) {
                    pcc(jSONObject, "accepted_size", adSlot.getExpressViewAcceptedWidth(), adSlot.getExpressViewAcceptedHeight());
                }
            } else {
                jSONObject.put("render_method", 1);
                pcc(jSONObject, "accepted_size", adSlot.getImgAcceptedWidth(), adSlot.getImgAcceptedHeight());
            }
            jSONObject.put("ptpl_ids", sf(adSlot.getCodeId()));
            jSONObject.put("ugen_ptpl_ids", gm(adSlot.getCodeId()));
            jSONObject.put("ptpl_ids_v3", gm(adSlot.getCodeId() + "_v3"));
            jSONObject.put("pos", AdSlot.getPosition(i));
            jSONObject.put("is_support_dpl", adSlot.isSupportDeepLink());
            if (i == 1 || i == 5) {
                jSONObject.put("is_origin_ad", true);
            }
            if (tszVar != null && tszVar.qf != null) {
                jSONObject.put("session_params", tszVar.qf);
            }
            if (tszVar != null && tszVar.kj != null) {
                jSONObject.put("common_params", tszVar.kj);
            }
            int adCount = adSlot.getAdCount();
            if (adCount <= 0) {
                adCount = 1;
            }
            if (adCount > 3) {
                adCount = 3;
            }
            if (i == 7 || i == 8) {
                adCount = 1;
            }
            if (tszVar != null && tszVar.vj != null) {
                adCount = adSlot.getAdCount();
            }
            jSONObject.put("ad_count", adCount);
            if (i == 1) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("is_rotate_banner", adSlot.getIsRotateBanner());
                jSONObject3.put("rotate_time", adSlot.getRotateTime());
                jSONObject3.put("rotate_order", adSlot.getRotateOrder());
                jSONObject3.put("type", adSlot.getBannerType());
                jSONObject.put("banner", jSONObject3);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private void pcc(JSONObject jSONObject, String str, int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", i);
            jSONObject2.put("height", i2);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    private void pcc(JSONObject jSONObject, String str, float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            jSONObject2.put("width", (int) f);
            jSONObject2.put("height", (int) f2);
            jSONArray.put(jSONObject2);
            jSONObject.put(str, jSONArray);
        } catch (Exception unused) {
        }
    }

    public static class pcc {
        final long gm;
        public final com.bytedance.sdk.openadsdk.core.model.pcc kj;
        final int oo;
        final ArrayList<Integer> ork;
        final int pcc;
        final String qf;
        final long sf;
        final String vj;
        final String vy;
        final int wh;

        private pcc(String str, int i, int i2, String str2, int i3, String str3, com.bytedance.sdk.openadsdk.core.model.pcc pccVar, long j, long j2, ArrayList<Integer> arrayList) {
            this.pcc = i;
            this.oo = i2;
            this.vj = str2;
            this.qf = str3;
            this.kj = pccVar;
            this.vy = str;
            this.wh = i3;
            this.sf = j;
            this.gm = j2;
            this.ork = arrayList;
        }

        public static pcc pcc(JSONObject jSONObject, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.tsz tszVar) {
            String optString = jSONObject.optString("did");
            int optInt = jSONObject.optInt("processing_time_ms");
            long optLong = jSONObject.optLong("s_receive_ts");
            long optLong2 = jSONObject.optLong("s_send_ts");
            int optInt2 = jSONObject.optInt("status_code");
            String optString2 = jSONObject.optString(CampaignEx.JSON_KEY_DESC);
            String optString3 = jSONObject.optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID);
            int optInt3 = jSONObject.optInt("reason");
            Pair<com.bytedance.sdk.openadsdk.core.model.pcc, ArrayList<Integer>> pcc = com.bytedance.sdk.openadsdk.core.sf.pcc(jSONObject, adSlot, tszVar);
            if (pcc == null) {
                return new pcc(optString, optInt, optInt2, optString2, optInt3, optString3, null, optLong, optLong2, null);
            }
            return new pcc(optString, optInt, optInt2, optString2, optInt3, optString3, (com.bytedance.sdk.openadsdk.core.model.pcc) pcc.first, optLong, optLong2, (ArrayList) pcc.second);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.of
    public void pcc(JSONObject jSONObject, final of.sf sfVar) {
        if (!com.bytedance.sdk.openadsdk.core.settings.qf.pcc() || com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj()) {
            if (sfVar != null) {
                sfVar.pcc(1000, "Ad request is temporarily paused, Please contact your AM");
                return;
            }
            return;
        }
        if (jSONObject == null || sfVar == null) {
            return;
        }
        JSONObject pcc2 = pcc(PangleEncryptConstant.CryptDataScene.REWARD_VERIFY, jSONObject);
        com.bytedance.sdk.component.qf.sf.oo sf2 = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().sf();
        final List<String> list = null;
        try {
            sf2.gm(com.bytedance.sdk.openadsdk.vy.oo.pcc(sf2, com.bytedance.sdk.openadsdk.utils.kun.oo("/api/ad/union/sdk/reward_video/reward/")));
            if (com.bytedance.sdk.openadsdk.utils.sf.gm()) {
                list = com.bytedance.sdk.openadsdk.utils.kun.pcc("/api/ad/union/sdk/reward_video/reward/", false);
                if (!list.isEmpty()) {
                    sf2.pcc(list);
                    sf2.pcc(60L, TimeUnit.SECONDS);
                }
            }
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.lo.gm("NetApiImpl", e.getMessage());
        }
        pcc(sf2, pcc2);
        sf2.vj(pcc2 != null ? pcc2.toString() : "");
        sf2.pcc(10);
        sf2.sf(C4665u.j);
        if (com.bytedance.sdk.openadsdk.utils.sf.sf()) {
            sf2.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.yt.6
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf(C4665u.j);
                    return pccVar;
                }
            });
        } else {
            com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.yt.7
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf(C4665u.j);
                    return pccVar;
                }
            });
        }
        sf2.sf(new com.bytedance.sdk.component.qf.pcc.pcc() { // from class: com.bytedance.sdk.openadsdk.core.yt.8
            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, com.bytedance.sdk.component.qf.sf sfVar2) {
                sf pcc3;
                if (sfVar2 != null) {
                    if (sfVar2.wh() && !TextUtils.isEmpty(sfVar2.oo())) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(sfVar2.oo());
                            String pcc4 = yt.pcc(jSONObject2.optInt("cypher", -1), jSONObject2.optString("message"));
                            if (!TextUtils.isEmpty(pcc4)) {
                                try {
                                    jSONObject2 = new JSONObject(pcc4);
                                } catch (Throwable unused) {
                                }
                            }
                            pcc3 = sf.pcc(jSONObject2);
                        } catch (JSONException e2) {
                            com.bytedance.sdk.component.utils.lo.gm("NetApiImpl", e2.getMessage());
                            yt.this.pcc(sfVar);
                        }
                        if (pcc3.pcc != 20000) {
                            sfVar.pcc(pcc3.pcc, vy.pcc(pcc3.pcc));
                            return;
                        }
                        if (pcc3.gm == null) {
                            yt.this.pcc(sfVar);
                            return;
                        }
                        sfVar.pcc(pcc3);
                        if (com.bytedance.sdk.openadsdk.utils.sf.sf()) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.yt.8.1
                            @Override // com.bytedance.sdk.openadsdk.lu.oo
                            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                pccVar.sf(C4665u.j);
                                return pccVar;
                            }
                        });
                        return;
                    }
                    String pcc5 = vy.pcc(-2);
                    int pcc6 = sfVar2.pcc();
                    if (!sfVar2.wh() && !TextUtils.isEmpty(sfVar2.sf())) {
                        pcc5 = sfVar2.sf();
                    }
                    String str = pcc5;
                    sfVar.pcc(pcc6, str);
                    if (!com.bytedance.sdk.openadsdk.utils.sf.sf()) {
                        com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.yt.8.2
                            @Override // com.bytedance.sdk.openadsdk.lu.oo
                            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                pccVar.sf(C4665u.j);
                                return pccVar;
                            }
                        });
                    }
                    if (sfVar2.wh()) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc(C4665u.j, gmVar.wh(), pcc6, str, gmVar.gm(), list);
                    return;
                }
                if (!com.bytedance.sdk.openadsdk.utils.sf.sf()) {
                    com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.yt.8.3
                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                            com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                            pccVar.sf(C4665u.j);
                            return pccVar;
                        }
                    });
                }
                com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc(C4665u.j, gmVar.wh(), -1, "response is null", gmVar.gm(), list);
                yt.this.pcc(sfVar);
            }

            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, IOException iOException) {
                String str;
                if (iOException == null) {
                    str = "";
                } else {
                    str = iOException.getMessage();
                }
                String str2 = str;
                sfVar.pcc(-2, str2);
                if (gmVar != null) {
                    String wh = gmVar.wh();
                    com.bytedance.sdk.openadsdk.utils.of.pcc(wh);
                    com.bytedance.sdk.openadsdk.dax.pcc.vj.pcc(C4665u.j, wh, -1, str2, gmVar.gm(), list);
                }
                if (com.bytedance.sdk.openadsdk.utils.sf.sf()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.yt.8.4
                    @Override // com.bytedance.sdk.openadsdk.lu.oo
                    public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                        com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                        pccVar.sf(C4665u.j);
                        return pccVar;
                    }
                });
            }
        });
    }

    public static class sf {
        public final com.bytedance.sdk.openadsdk.core.model.pq gm;
        public final int pcc;
        public final boolean sf;

        private sf(int i, boolean z, com.bytedance.sdk.openadsdk.core.model.pq pqVar) {
            this.pcc = i;
            this.sf = z;
            this.gm = pqVar;
        }

        public static sf pcc(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int optInt = jSONObject.optInt(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE);
            boolean optBoolean = jSONObject.optBoolean("verify");
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            com.bytedance.sdk.openadsdk.core.model.pq pqVar = new com.bytedance.sdk.openadsdk.core.model.pq();
            if (optJSONObject != null) {
                try {
                    pqVar.pcc(optJSONObject.optInt("reason"));
                    pqVar.sf(optJSONObject.optInt("corp_type"));
                    pqVar.gm(optJSONObject.optInt(CampaignEx.JSON_KEY_REWARD_AMOUNT));
                    pqVar.pcc(optJSONObject.optString(CampaignEx.JSON_KEY_REWARD_NAME));
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lo.gm("NetApiImpl", th.getMessage());
                }
            }
            return new sf(optInt, optBoolean, pqVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.of
    public JSONObject pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return jSONObject;
        }
        try {
            int optInt = jSONObject.optInt("cypher", -1);
            String optString = jSONObject.optString("message");
            String optString2 = jSONObject.optString("auction_price", "");
            String pcc2 = pcc(optInt, optString);
            if (TextUtils.isEmpty(pcc2)) {
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(pcc2);
            try {
                jSONObject2.put("auction_price", optString2);
            } catch (Throwable unused) {
            }
            return jSONObject2;
        } catch (Throwable unused2) {
            return jSONObject;
        }
    }

    public static String pcc(int i, String str) {
        if (i == 3) {
            return com.bytedance.sdk.component.utils.pcc.gm(str);
        }
        if (i == 4) {
            Pair<Integer, String> decryptType4 = PangleEncryptManager.decryptType4(str);
            if (decryptType4 != null && decryptType4.second != null) {
                String str2 = (String) decryptType4.second;
                jsj.pcc(true);
                return str2;
            }
            jsj.pcc(false);
            jsj.pcc(2, PangleEncryptConstant.CryptDataScene.GET_ADS, decryptType4 != null ? ((Integer) decryptType4.first).intValue() : 0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.sdk.openadsdk.core.of
    public com.bytedance.sdk.openadsdk.oo.vj sf(JSONObject jSONObject) {
        int i;
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        List<String> pcc2;
        String str2 = "error unknown";
        if (!com.bytedance.sdk.openadsdk.core.settings.qf.pcc() || com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj() || jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        com.bytedance.sdk.component.qf.sf.oo sf2 = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().sf();
        int i2 = 0;
        try {
            JSONObject pcc3 = pcc(PangleEncryptConstant.CryptDataScene.STATS_LOG, jSONObject);
            sf2.pcc(pcc3.toString(), lu.oo().dax());
            sf2.gm(com.bytedance.sdk.openadsdk.utils.kun.oo("/api/ad/union/sdk/stats/batch/"));
            if (com.bytedance.sdk.openadsdk.utils.sf.gm() && (pcc2 = com.bytedance.sdk.openadsdk.utils.kun.pcc("/api/ad/union/sdk/stats/batch/", false)) != null && !pcc2.isEmpty()) {
                sf2.pcc(pcc2);
                sf2.pcc(60L, TimeUnit.SECONDS);
            }
            pcc(sf2, pcc3);
            sf2.sf("User-Agent", com.bytedance.sdk.openadsdk.utils.kun.oo());
            if (com.bytedance.sdk.openadsdk.core.settings.vh.sf().pv()) {
                sf2.sf("_disable_retry", "1");
            }
            com.bytedance.sdk.component.qf.sf vj = sf2.vj();
            try {
            } catch (Throwable unused) {
                i = 0;
                z = false;
            }
            if (vj == null) {
                return new com.bytedance.sdk.openadsdk.oo.vj(false, 0, "error unknown", false);
            }
            if (!vj.wh() || TextUtils.isEmpty(vj.oo())) {
                str = "error unknown";
                z3 = false;
                z = false;
            } else {
                JSONObject jSONObject2 = new JSONObject(vj.oo());
                int optInt = jSONObject2.optInt(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                str = jSONObject2.optString("data", "");
                z = true;
                boolean z4 = optInt == 20000;
                z3 = z4;
                if (optInt != 60005) {
                    z = false;
                    z3 = z4;
                }
            }
            try {
                i2 = vj.pcc();
                z2 = z3;
                if (!vj.wh()) {
                    String sf3 = vj.sf();
                    try {
                        com.bytedance.sdk.openadsdk.utils.of.pcc(sf2.wh());
                        str = sf3;
                        z2 = z3;
                    } catch (Throwable unused2) {
                        int i3 = z3 ? 1 : 0;
                        str2 = sf3;
                        i = i2;
                        i2 = i3;
                        str = str2;
                        z2 = i2;
                        i2 = i;
                        return new com.bytedance.sdk.openadsdk.oo.vj(z2, i2, str, z);
                    }
                }
            } catch (Throwable unused3) {
                i = i2;
                i2 = z3 ? 1 : 0;
                str2 = str;
            }
            return new com.bytedance.sdk.openadsdk.oo.vj(z2, i2, str, z);
        } catch (Throwable unused4) {
            return new com.bytedance.sdk.openadsdk.oo.vj(false, 0, "error unknown", false);
        }
    }

    private void pcc(com.bytedance.sdk.component.qf.sf.oo ooVar, JSONObject jSONObject) {
        try {
            if (gm(jSONObject) && jSONObject.optInt("cypher") == 4) {
                ooVar.sf("x-pgli18n", "4");
                ooVar.sf("Content-Type", "application/json; charset=utf-8");
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.of
    public com.bytedance.sdk.component.adexpress.pcc.gm.pcc pcc() {
        com.bytedance.sdk.component.adexpress.pcc.gm.pcc pccVar = null;
        if (!com.bytedance.sdk.openadsdk.core.settings.qf.pcc() || com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj()) {
            return null;
        }
        long currentTimeMillis = (System.currentTimeMillis() / 1000) - com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tpl_fetch_model", "date", 0L);
        String xb = lu.oo().xb();
        String sf2 = com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("tpl_fetch_model", "last_url", "");
        if (currentTimeMillis <= lu.oo().mu() && currentTimeMillis >= 0 && TextUtils.equals(xb, sf2)) {
            String sf3 = com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("tpl_fetch_model", "model", "");
            try {
                if (!TextUtils.isEmpty(sf3)) {
                    return com.bytedance.sdk.component.adexpress.pcc.gm.pcc.vj(sf3);
                }
            } catch (Exception unused) {
            }
        }
        try {
            com.bytedance.sdk.component.qf.sf.sf gm = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().gm();
            String pcc2 = com.bytedance.sdk.openadsdk.vy.oo.pcc(gm, xb);
            gm.gm(pcc2);
            com.bytedance.sdk.component.qf.sf vj = gm.vj();
            if (vj == null || !vj.wh()) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(vj.oo());
            jSONObject.put("template_fetch_url", pcc2);
            pccVar = com.bytedance.sdk.component.adexpress.pcc.gm.pcc.pcc(jSONObject);
            com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tpl_fetch_model", "date", Long.valueOf(System.currentTimeMillis() / 1000));
            com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tpl_fetch_model", "model", jSONObject.toString());
            com.bytedance.sdk.openadsdk.gpj.oo.pcc.pcc("tpl_fetch_model", "last_url", xb);
            return pccVar;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("NetApiImpl", th.getMessage());
            return pccVar;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.of
    public void pcc(String str) {
        if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj()) {
            return;
        }
        com.bytedance.sdk.component.qf.sf.sf gm = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().gm();
        gm.gm(str);
        gm.sf("upload_bidding");
        gm.pcc(7);
        gm.sf(new com.bytedance.sdk.component.qf.pcc.pcc() { // from class: com.bytedance.sdk.openadsdk.core.yt.9
            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, com.bytedance.sdk.component.qf.sf sfVar) {
                sfVar.oo();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.of
    public void pcc(JSONObject jSONObject, String str) {
        if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj()) {
            return;
        }
        com.bytedance.sdk.component.qf.sf.oo sf2 = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().sf();
        sf2.gm(str);
        Pair<String, String> generateRequestHeader = ApmHelper.generateRequestHeader();
        sf2.sf("cypher", (String) generateRequestHeader.first);
        sf2.sf("transfer-param", (String) generateRequestHeader.second);
        sf2.sf("x-pangle-target-idc", lu.oo().rc());
        sf2.pcc(jSONObject);
        sf2.pcc(5);
        sf2.sf("apm_pv");
        sf2.sf(new com.bytedance.sdk.component.qf.pcc.pcc() { // from class: com.bytedance.sdk.openadsdk.core.yt.10
            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, IOException iOException) {
            }

            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, com.bytedance.sdk.component.qf.sf sfVar) {
                sfVar.oo();
            }
        });
    }

    public static JSONArray sf(String str) {
        try {
            Set<String> sf2 = com.bytedance.sdk.component.adexpress.pcc.sf.sf.sf(str);
            if (sf2 != null && sf2.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = sf2.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.pcc.gm.sf pcc2 = com.bytedance.sdk.component.adexpress.pcc.sf.sf.pcc(it.next());
                    if (pcc2 != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("id", pcc2.sf());
                        jSONObject.put("md5", pcc2.gm());
                        jSONArray.put(jSONObject);
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.lo.pcc("NetApiImpl", "getParentTplIds: ", e);
            return null;
        }
    }

    public static JSONArray gm(String str) {
        try {
            Set<com.bytedance.sdk.openadsdk.core.hc.pcc.pcc> pcc2 = com.bytedance.sdk.openadsdk.core.hc.pcc.sf.pcc().pcc(str);
            if (pcc2 != null && pcc2.size() != 0) {
                JSONArray jSONArray = new JSONArray();
                for (com.bytedance.sdk.openadsdk.core.hc.pcc.pcc pccVar : pcc2) {
                    if (pccVar != null && !TextUtils.isEmpty(pccVar.vj())) {
                        JSONObject jSONObject = new JSONObject();
                        String[] split = pccVar.pcc().split("_");
                        if (split.length == 2) {
                            jSONObject.put("id", split[1]);
                            jSONObject.put("md5", pccVar.sf());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
                return jSONArray;
            }
            return null;
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.lo.pcc("NetApiImpl", "getUgenParentTplIds: ", e);
            return null;
        }
    }

    private byte[] vj(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (str == null || str.length() == 0) {
            return null;
        }
        byte[] bArr = new byte[0];
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    } catch (IOException e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            } catch (IOException e2) {
                com.bytedance.sdk.component.utils.lo.gm("NetApiImpl", e2.toString());
            }
            try {
                gZIPOutputStream.write(str.getBytes(C4761z5.O));
                try {
                    gZIPOutputStream.close();
                } catch (IOException e3) {
                    com.bytedance.sdk.component.utils.lo.gm("NetApiImpl", e3.toString());
                }
                bArr = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
            } catch (IOException e4) {
                e = e4;
                gZIPOutputStream2 = gZIPOutputStream;
                com.bytedance.sdk.component.utils.lo.gm("NetApiImpl", e.toString());
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException e5) {
                        com.bytedance.sdk.component.utils.lo.gm("NetApiImpl", e5.toString());
                    }
                }
                if (byteArrayOutputStream != null) {
                    bArr = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                }
                return bArr;
            } catch (Throwable th2) {
                th = th2;
                gZIPOutputStream2 = gZIPOutputStream;
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException e6) {
                        com.bytedance.sdk.component.utils.lo.gm("NetApiImpl", e6.toString());
                    }
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.toByteArray();
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e7) {
                        com.bytedance.sdk.component.utils.lo.gm("NetApiImpl", e7.toString());
                        throw th;
                    }
                }
                throw th;
            }
        } catch (IOException e8) {
            e = e8;
            byteArrayOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream = null;
        }
        return bArr;
    }
}
