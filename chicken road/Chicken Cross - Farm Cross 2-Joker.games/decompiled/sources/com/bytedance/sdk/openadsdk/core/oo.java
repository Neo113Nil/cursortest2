package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class oo extends pq {
    private static volatile ArrayList<String> pcc;
    private int sf = 12288;

    private static void pcc(JSONObject jSONObject, PAGBiddingRequest pAGBiddingRequest, String str) throws Throwable {
        jSONObject.put("is_init", jr.vj() ? 1 : 0);
        String vy = lu.oo().vy();
        String mk = lu.oo().mk();
        if (vy != null && mk != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("version", vy);
            jSONObject2.put("param", mk);
            jSONObject.put("abtest", jSONObject2);
        }
        jSONObject.put("language", hc.sf());
        jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
        jSONObject.put("package_name", com.bytedance.sdk.openadsdk.utils.kun.wh());
        if (pAGBiddingRequest != null) {
            jSONObject.put("user_data", yt.pcc(TextUtils.isEmpty(pAGBiddingRequest.getSlotId()) ? null : new AdSlot.Builder().setCodeId(pAGBiddingRequest.getSlotId()).build()));
        }
        jSONObject.put("ts", System.currentTimeMillis() / 1000);
        String sf = com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
        if (!sf.isEmpty()) {
            jSONObject.put("ipv6", sf);
        } else {
            String sf2 = com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("ttopenadsdk", "key_ipv4", "");
            if (!sf2.isEmpty()) {
                jSONObject.put("ipv4", sf2);
            }
        }
        jSONObject.put("adx_id", str);
        jSONObject.put("target_region", lu.oo().rc());
        com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().pcc(jSONObject);
        String pcc2 = hc.pcc(lu.pcc());
        if (!TextUtils.isEmpty(pcc2)) {
            try {
                jSONObject.put("did", Long.parseLong(pcc2));
            } catch (Throwable unused) {
            }
        }
        if (pAGBiddingRequest != null) {
            jSONObject.put("banner", pcc(pAGBiddingRequest));
        }
        com.bytedance.sdk.openadsdk.core.settings.vh oo = lu.oo();
        jSONObject.put("app_reg", com.bytedance.sdk.openadsdk.core.vh.sf.pcc().wh() ? 1 : 0);
        Context pcc3 = lu.pcc();
        jSONObject.put("apk-sign", com.bytedance.sdk.openadsdk.common.gm.vy());
        jSONObject.put("screen_scale", rj.wh(pcc3));
        jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.oo.sf());
        jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.oo.gm());
        jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.oo.oo());
        jSONObject.put("app_running_time", (System.currentTimeMillis() - jr.pcc()) / 1000);
        jSONObject.put("js_render_ver", com.bytedance.sdk.openadsdk.core.ork.hc.gm());
        jSONObject.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.ork.hc.oo());
        jSONObject.put("gp_v_name", DeviceUtils.vj(pcc3));
        jSONObject.put("gp_v_code", DeviceUtils.wh(pcc3));
        jSONObject.put("vendor", Build.MANUFACTURER);
        jSONObject.put("model", Build.MODEL);
        jSONObject.put("user_agent_device", com.bytedance.sdk.openadsdk.utils.kun.sf());
        jSONObject.put("user_agent_webview", com.bytedance.sdk.openadsdk.utils.kun.oo());
        jSONObject.put("sys_compiling_time", hc.sf(pcc3));
        jSONObject.put("screen_height", rj.vj(pcc3));
        jSONObject.put("screen_width", rj.gm(pcc3));
        jSONObject.put("rom_version", com.bytedance.sdk.openadsdk.utils.mk.pcc());
        jSONObject.put("carrier_name", com.bytedance.sdk.openadsdk.utils.ye.pcc());
        jSONObject.put("os_version", Build.VERSION.RELEASE);
        jSONObject.put("conn_type", com.bytedance.sdk.openadsdk.utils.kun.kj(pcc3));
        if (oo.mk("boot")) {
            jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
        }
        com.bytedance.sdk.openadsdk.utils.kun.pcc(jSONObject);
        jSONObject.put("board", Build.BOARD);
        jSONObject.put("timezone", com.bytedance.sdk.openadsdk.utils.kun.tsz());
        jSONObject.put("device_city", com.bytedance.sdk.openadsdk.utils.kun.yt());
        jSONObject.put("cpu_num", com.bytedance.sdk.openadsdk.utils.ork.sf());
        jSONObject.put("density", rj.kj(pcc3));
        DeviceUtils.pcc(jSONObject);
        com.bytedance.sdk.openadsdk.core.tmg.gm.pcc(jSONObject);
        com.bytedance.sdk.openadsdk.utils.kj.pcc(jSONObject, pcc3);
        jSONObject.put("is_multi", !com.bytedance.sdk.component.utils.fum.pcc(pcc3));
        com.bytedance.sdk.openadsdk.utils.kj.sf(jSONObject, pcc3);
        com.bytedance.sdk.openadsdk.wh.sf.pcc().pcc(jSONObject);
    }

    private void kj(final String str) {
        try {
            com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.oo.1
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf("bidding_token");
                    pccVar.vj("new");
                    pccVar.qf(oo.this.vh(str).toString());
                    return pccVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("BiddingTokenGenerator", th.getMessage());
        }
    }

    private void vy(final String str) {
        try {
            com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.oo.2
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf("bidding_token");
                    pccVar.vj("new");
                    pccVar.qf(oo.this.vh(str).toString());
                    return pccVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("BiddingTokenGenerator", th.getMessage());
        }
    }

    private void ork(final String str) {
        try {
            com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.oo.3
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf("bidding_token");
                    pccVar.vj("new");
                    pccVar.qf(oo.this.vh(str).toString());
                    return pccVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("BiddingTokenGenerator", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject vh(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adx_id", str);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private void pcc(final int i, final int i2, final String str, final String str2) {
        com.bytedance.sdk.openadsdk.dax.oo.pcc("bid_tok_len_over_lim", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.core.oo.4
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("len_bef_rm", i);
                jSONObject.put("len_af_rm", i2);
                jSONObject.put("len_lm", oo.this.sf);
                jSONObject.put("re_f_key", str2);
                jSONObject.put("adx_id", str);
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("bid_tok_len_over_lim").sf(jSONObject.toString());
            }
        });
    }

    public boolean pcc() {
        JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.yt.vj.pcc("bid_tok_con", (Object) null, com.bytedance.sdk.openadsdk.yt.sf.pcc);
        if (jSONObject == null) {
            return false;
        }
        this.sf = jSONObject.optInt("en_m_l", this.sf);
        return jSONObject.optInt(a.k, 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.pq, com.bytedance.sdk.openadsdk.core.lq
    public void pcc(PAGBiddingRequest pAGBiddingRequest, PAGBidCallback pAGBidCallback) {
        PAGBidError pAGBidError;
        int length;
        String str = "";
        if (pAGBidCallback == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.utils.kun.tmg("getBiddingToken");
            if (pAGBiddingRequest != null && pAGBiddingRequest.getAdxId() != null) {
                str = pAGBiddingRequest.getAdxId();
            }
            vy(str);
            String hpk = lu.oo().hpk();
            String str2 = null;
            if (!com.bytedance.sdk.openadsdk.core.vh.sf.pcc().wh()) {
                pAGBidError = new PAGBidError(40060, vy.pcc(40060));
            } else if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().oo()) {
                pAGBidError = new PAGBidError(10007, vy.pcc(10007));
            } else if (!com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vy()) {
                pAGBidError = new PAGBidError(10008, vy.pcc(10008));
            } else if (TextUtils.isEmpty(hpk)) {
                pAGBidError = new PAGBidError(10011, vy.pcc(10011));
                pcc(5, pAGBiddingRequest);
            } else if (!wh(hpk) || lu.oo().atb(str)) {
                pAGBidError = null;
            } else {
                pAGBidError = new PAGBidError(GamesActivityResultCodes.RESULT_NETWORK_FAILURE, vy.pcc(GamesActivityResultCodes.RESULT_NETWORK_FAILURE));
                pcc(2, pAGBiddingRequest);
            }
            if (pAGBidError != null) {
                pAGBidCallback.onBiddingTokenFailed(pAGBidError);
                kj(str);
                return;
            }
            if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vh() && ork.sf().vh()) {
                pAGBidCallback.onBiddingTokenFailed(new PAGBidError(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED, vy.pcc(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED)));
                kj(str);
                pcc(3, pAGBiddingRequest);
                return;
            }
            com.bytedance.sdk.openadsdk.core.tmg.gm.pcc();
            pcc pccVar = new pcc(pcc == null);
            pcc(pccVar, pAGBiddingRequest, str);
            ArrayList<String> pcc2 = pccVar.pcc();
            if (pcc2 != null) {
                pcc = pcc2;
            }
            JSONObject pcc3 = pcc(pccVar);
            int i = -1;
            int size = pcc != null ? pcc.size() - 1 : -1;
            while (true) {
                length = pcc3.toString().getBytes().length;
                if (length > this.sf) {
                    if (i < 0) {
                        i = length;
                    }
                    if (size < 0) {
                        break;
                    }
                    str2 = pcc.get(size);
                    pccVar.remove(str2);
                    size--;
                    pcc3 = pcc(pccVar);
                } else {
                    break;
                }
            }
            if (pcc3.length() > 0) {
                pcc3.put("target_region", lu.oo().rc());
            }
            pAGBidCallback.onBiddingTokenCollected(pcc3.toString());
            ork(str);
            if (i >= 0) {
                pcc(i, length, str, str2);
            }
        } catch (Throwable unused) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, PlayerErrorConstant.UNKNOW_ERROR));
            pcc(4, pAGBiddingRequest);
            kj("");
        }
    }

    private static class pcc extends JSONObject {
        private ArrayList<String> pcc;

        public pcc(boolean z) {
            if (z) {
                this.pcc = new ArrayList<>();
            }
        }

        public ArrayList<String> pcc() {
            return this.pcc;
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, boolean z) throws JSONException {
            ArrayList<String> arrayList = this.pcc;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, z);
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, double d) throws JSONException {
            ArrayList<String> arrayList = this.pcc;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, d);
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, int i) throws JSONException {
            ArrayList<String> arrayList = this.pcc;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, i);
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, long j) throws JSONException {
            ArrayList<String> arrayList = this.pcc;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, j);
        }

        @Override // org.json.JSONObject
        public JSONObject put(String str, Object obj) throws JSONException {
            ArrayList<String> arrayList = this.pcc;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.put(str, obj);
        }

        @Override // org.json.JSONObject
        public JSONObject putOpt(String str, Object obj) throws JSONException {
            ArrayList<String> arrayList = this.pcc;
            if (arrayList != null) {
                arrayList.add(str);
            }
            return super.putOpt(str, obj);
        }
    }
}
