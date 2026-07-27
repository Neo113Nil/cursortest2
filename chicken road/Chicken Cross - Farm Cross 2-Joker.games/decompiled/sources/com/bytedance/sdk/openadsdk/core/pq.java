package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.component.embedapplog.PangleEncryptManager;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.PAGBidCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGBidError;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.ironsource.L6;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.pgl.ssdk.ces.out.PglSSConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pq implements lq {
    private static final Map<Integer, String> sf = new HashMap<Integer, String>(59) { // from class: com.bytedance.sdk.openadsdk.core.pq.1
        {
            put(1, "is_init");
            put(2, "abtest");
            put(3, "language");
            put(4, "ad_sdk_version");
            put(5, "package_name");
            put(6, "user_data");
            put(7, "ts");
            put(8, "ipv4");
            put(9, "ipv6");
            put(10, "adx_id");
            put(11, "target_region");
            put(12, L6.X0);
            put(13, "did");
            put(14, "banner");
            put(15, "app_reg");
            put(16, "apk-sign");
            put(17, "screen_scale");
            put(18, "app_set_id_scope");
            put(19, "app_set_id");
            put(20, "installed_source");
            put(21, "app_running_time");
            put(22, "js_render_ver");
            put(23, "js_render_v3_ver");
            put(24, "gp_v_name");
            put(25, "gp_v_code");
            put(26, "vendor");
            put(27, "model");
            put(28, "user_agent_device");
            put(29, "user_agent_webview");
            put(30, "sys_compiling_time");
            put(31, "screen_height");
            put(32, "screen_width");
            put(33, "rom_version");
            put(34, "carrier_name");
            put(35, "os_version");
            put(36, "conn_type");
            put(37, "boot");
            put(38, "oem_store");
            put(39, "board");
            put(40, "timezone");
            put(41, "device_city");
            put(42, "cpu_num");
            put(43, "density");
            put(44, "bt_time");
            put(45, "bt_id");
            put(46, "sec_did");
            put(47, "X-Armors");
            put(48, "url");
            put(49, "pangle_m");
            put(50, "ec");
            put(51, "pglx");
            put(52, L6.u);
            put(53, "bp");
            put(54, "t_ver");
            put(55, "is_fold");
            put(56, CampaignEx.JSON_KEY_AAB);
            put(57, "abi");
            put(58, "is_multi");
            put(59, "w_ver");
            put(60, "feature_data");
        }
    };
    private final AtomicReference<JSONObject> pcc = new AtomicReference<>();
    private int gm = 0;

    @Override // com.bytedance.sdk.openadsdk.core.lq
    /* renamed from: oo, reason: merged with bridge method [inline-methods] */
    public pq pcc(String str) {
        ork.sf().pcc(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    /* renamed from: vj, reason: merged with bridge method [inline-methods] */
    public pq sf(String str) {
        ork.sf().gm(str);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    public lq pcc(int i) {
        ork.sf().vj(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    public lq sf() {
        com.bytedance.sdk.component.utils.jr.pcc("PangleSDK-8105");
        com.bykv.vk.openvk.pcc.pcc.pcc.qf.gm.pcc("PangleSDK-8105");
        com.bytedance.sdk.component.utils.lo.pcc("PangleSDK-8105");
        com.bytedance.sdk.component.utils.jr.pcc();
        com.bytedance.sdk.component.qf.pcc.pcc();
        com.bykv.vk.openvk.pcc.pcc.pcc.qf.gm.pcc();
        com.bytedance.sdk.component.utils.lo.pcc();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    public lq oo(int i) {
        ork.sf().oo(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    public int vj() {
        return ork.sf().ork();
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    public String gm() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    public void pcc(PAGBiddingRequest pAGBiddingRequest, PAGBidCallback pAGBidCallback) {
        PAGBidError pAGBidError;
        String str = "";
        if (pAGBidCallback == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.utils.kun.tmg("getBiddingToken");
            String adxId = (pAGBiddingRequest == null || pAGBiddingRequest.getAdxId() == null) ? "" : pAGBiddingRequest.getAdxId();
            try {
                kj(adxId);
                String hpk = lu.oo().hpk();
                int i = 2;
                AdSlot adSlot = null;
                if (!com.bytedance.sdk.openadsdk.core.vh.sf.pcc().wh()) {
                    pAGBidError = new PAGBidError(40060, vy.pcc(40060));
                } else if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().oo()) {
                    pAGBidError = new PAGBidError(10007, vy.pcc(10007));
                } else if (!com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vy()) {
                    pAGBidError = new PAGBidError(10008, vy.pcc(10008));
                } else if (TextUtils.isEmpty(hpk)) {
                    pAGBidError = new PAGBidError(10011, vy.pcc(10011));
                    pcc(5, pAGBiddingRequest);
                } else if (!wh(hpk) || lu.oo().atb(adxId)) {
                    pAGBidError = null;
                } else {
                    pAGBidError = new PAGBidError(GamesActivityResultCodes.RESULT_NETWORK_FAILURE, vy.pcc(GamesActivityResultCodes.RESULT_NETWORK_FAILURE));
                    pcc(2, pAGBiddingRequest);
                }
                if (pAGBidError != null) {
                    pAGBidCallback.onBiddingTokenFailed(pAGBidError);
                    ork(adxId);
                    return;
                }
                if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vh() && ork.sf().vh()) {
                    pAGBidCallback.onBiddingTokenFailed(new PAGBidError(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED, vy.pcc(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED)));
                    ork(adxId);
                    pcc(3, pAGBiddingRequest);
                    return;
                }
                com.bytedance.sdk.openadsdk.core.tmg.gm.pcc();
                JSONObject jSONObject = new JSONObject();
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
                    if (!TextUtils.isEmpty(pAGBiddingRequest.getSlotId())) {
                        adSlot = new AdSlot.Builder().setCodeId(pAGBiddingRequest.getSlotId()).build();
                    }
                    jSONObject.put("user_data", yt.pcc(adSlot));
                }
                jSONObject.put("ts", System.currentTimeMillis() / 1000);
                String sf2 = com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
                if (!sf2.isEmpty()) {
                    jSONObject.put("ipv6", sf2);
                } else {
                    String sf3 = com.bytedance.sdk.openadsdk.gpj.oo.pcc.sf("ttopenadsdk", "key_ipv4", "");
                    if (!sf3.isEmpty()) {
                        jSONObject.put("ipv4", sf3);
                    }
                }
                jSONObject.put("adx_id", adxId);
                Object rc = lu.oo().rc();
                jSONObject.put("target_region", rc);
                if (jSONObject.toString().getBytes().length <= 2680) {
                    com.bytedance.sdk.openadsdk.core.settings.vh oo = lu.oo();
                    com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().pcc(jSONObject);
                    String pcc = hc.pcc(lu.pcc());
                    if (!TextUtils.isEmpty(pcc)) {
                        try {
                            jSONObject.put("did", Long.parseLong(pcc));
                        } catch (Throwable unused) {
                        }
                    }
                    if (pAGBiddingRequest != null) {
                        jSONObject.put("banner", pcc(pAGBiddingRequest));
                    }
                    jSONObject.put("app_reg", com.bytedance.sdk.openadsdk.core.vh.sf.pcc().wh() ? 1 : 0);
                    Context pcc2 = lu.pcc();
                    jSONObject.put("apk-sign", com.bytedance.sdk.openadsdk.common.gm.vy());
                    jSONObject.put("screen_scale", rj.wh(pcc2));
                    jSONObject.put("app_set_id_scope", com.bytedance.sdk.openadsdk.core.settings.oo.sf());
                    jSONObject.put("app_set_id", com.bytedance.sdk.openadsdk.core.settings.oo.gm());
                    jSONObject.put("installed_source", com.bytedance.sdk.openadsdk.core.settings.oo.oo());
                    jSONObject.put("app_running_time", (System.currentTimeMillis() - jr.pcc()) / 1000);
                    jSONObject.put("js_render_ver", com.bytedance.sdk.openadsdk.core.ork.hc.gm());
                    jSONObject.put("js_render_v3_ver", com.bytedance.sdk.openadsdk.core.ork.hc.oo());
                    jSONObject.put("gp_v_name", DeviceUtils.vj(pcc2));
                    jSONObject.put("gp_v_code", DeviceUtils.wh(pcc2));
                    jSONObject.put("vendor", Build.MANUFACTURER);
                    jSONObject.put("model", Build.MODEL);
                    jSONObject.put("user_agent_device", com.bytedance.sdk.openadsdk.utils.kun.sf());
                    jSONObject.put("user_agent_webview", com.bytedance.sdk.openadsdk.utils.kun.oo());
                    jSONObject.put("sys_compiling_time", hc.sf(pcc2));
                    jSONObject.put("screen_height", rj.vj(pcc2));
                    jSONObject.put("screen_width", rj.gm(pcc2));
                    jSONObject.put("rom_version", com.bytedance.sdk.openadsdk.utils.mk.pcc());
                    jSONObject.put("carrier_name", com.bytedance.sdk.openadsdk.utils.ye.pcc());
                    jSONObject.put("os_version", Build.VERSION.RELEASE);
                    jSONObject.put("conn_type", com.bytedance.sdk.openadsdk.utils.kun.kj(pcc2));
                    if (oo.mk("boot")) {
                        jSONObject.put("boot", String.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                    }
                    com.bytedance.sdk.openadsdk.utils.kun.pcc(jSONObject);
                    jSONObject.put("board", Build.BOARD);
                    jSONObject.put("timezone", com.bytedance.sdk.openadsdk.utils.kun.tsz());
                    jSONObject.put("device_city", com.bytedance.sdk.openadsdk.utils.kun.yt());
                    jSONObject.put("cpu_num", com.bytedance.sdk.openadsdk.utils.ork.sf());
                    jSONObject.put("density", rj.kj(pcc2));
                    DeviceUtils.pcc(jSONObject);
                    com.bytedance.sdk.openadsdk.core.tmg.gm.pcc(jSONObject);
                    com.bytedance.sdk.openadsdk.utils.kj.pcc(jSONObject, pcc2);
                    jSONObject.put("is_multi", !com.bytedance.sdk.component.utils.fum.pcc(pcc2));
                    com.bytedance.sdk.openadsdk.utils.kj.sf(jSONObject, pcc2);
                    i = sf.size();
                }
                while (i > 0 && jSONObject.toString().getBytes().length > 2680) {
                    jSONObject.remove(sf.get(Integer.valueOf(i)));
                    i--;
                }
                com.bytedance.sdk.openadsdk.wh.sf.pcc().pcc(jSONObject);
                JSONObject pcc3 = pcc(jSONObject);
                while (i > 0 && pcc3.toString().getBytes().length > 12288) {
                    jSONObject.remove(sf.get(Integer.valueOf(i)));
                    pcc3 = pcc(jSONObject);
                    i--;
                }
                if (pcc3.length() > 0) {
                    pcc3.put("target_region", rc);
                }
                if (com.bytedance.sdk.component.utils.jr.gm()) {
                    new StringBuilder("bidding token: ").append(pcc3).append("\nbidding token length: ");
                    int length = pcc3.toString().getBytes().length;
                }
                new StringBuilder("bidding token: ").append(pcc3);
                pAGBidCallback.onBiddingTokenCollected(pcc3.toString());
                vy(adxId);
            } catch (Throwable unused2) {
                str = adxId;
                pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10010, PlayerErrorConstant.UNKNOW_ERROR));
                pcc(4, pAGBiddingRequest);
                ork(str);
            }
        } catch (Throwable unused3) {
        }
    }

    public static boolean wh(String str) {
        return "TX".equals(str);
    }

    protected void pcc(int i, PAGBiddingRequest pAGBiddingRequest) {
        try {
            String tz = ork.sf().tz();
            String str = "";
            String adxId = pAGBiddingRequest != null ? pAGBiddingRequest.getAdxId() : "";
            boolean xf = lu.oo().xf();
            Set<String> uae = lu.oo().uae();
            JSONArray jSONArray = new JSONArray();
            if (uae != null) {
                Iterator<String> it = uae.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
            }
            String hpk = com.bytedance.sdk.openadsdk.core.settings.vh.sf().hpk();
            int vj = vj();
            int oo = jr.oo();
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put("init_adx_id", tz);
            jSONObject.put("bidding_adx_id", adxId);
            jSONObject.put("token_enable", xf ? 1 : 0);
            if (!TextUtils.isEmpty(hpk)) {
                str = hpk;
            }
            jSONObject.put("setting_dc", str);
            jSONObject.put("setting_token_adx_ids", jSONArray);
            jSONObject.put("init_pa_consent", vj);
            jSONObject.put("init_state", oo);
            jSONObject.put("reason", i);
            if (jr.vj()) {
                com.bytedance.sdk.openadsdk.dax.oo.pcc("biddingtoken_error", false, 1, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.core.pq.2
                    @Override // com.bytedance.sdk.openadsdk.dax.sf
                    public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                        return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("biddingtoken_error").sf(jSONObject.toString());
                    }
                });
                final JSONObject andSet = this.pcc.getAndSet(null);
                if (andSet != null) {
                    com.bytedance.sdk.openadsdk.dax.oo.pcc("biddingtoken_error", false, 1, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.core.pq.3
                        @Override // com.bytedance.sdk.openadsdk.dax.sf
                        public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                            return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("biddingtoken_error").sf(andSet.toString());
                        }
                    });
                    return;
                }
                return;
            }
            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(this.pcc, null, jSONObject);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static JSONObject pcc(PAGBiddingRequest pAGBiddingRequest) {
        try {
            PAGBannerSize bannerSize = pAGBiddingRequest.getBannerSize();
            if (bannerSize != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("width", bannerSize.getWidth());
                if (bannerSize.getType() == 3) {
                    jSONObject.put("height", bannerSize.getMaxHeight());
                } else {
                    jSONObject.put("height", bannerSize.getHeight());
                }
                jSONObject.put("type", bannerSize.getType());
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static JSONObject pcc(JSONObject jSONObject) {
        JSONObject encryptType4 = PangleEncryptManager.encryptType4(jSONObject, new qy(PangleEncryptConstant.CryptDataScene.BIDDING_TOKEN));
        jsj.pcc(encryptType4);
        return encryptType4 != null ? encryptType4 : new JSONObject();
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    public lq sf(int i) {
        this.gm = i;
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    public int oo() {
        return this.gm;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    public lq gm(int i) {
        ork.sf().gm(i);
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.core.lq
    public lq gm(String str) {
        ork.sf().kj(str);
        return this;
    }

    private static void kj(final String str) {
        try {
            com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.pq.4
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf("bidding_token");
                    pccVar.qf(pq.vh(str).toString());
                    return pccVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("TTAdManagerImpl", th.getMessage());
        }
    }

    private static void vy(final String str) {
        try {
            com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.pq.5
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf("bidding_token");
                    pccVar.qf(pq.vh(str).toString());
                    return pccVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("TTAdManagerImpl", th.getMessage());
        }
    }

    private static void ork(final String str) {
        try {
            com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.pq.6
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf("bidding_token");
                    pccVar.qf(pq.vh(str).toString());
                    return pccVar;
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.gm("TTAdManagerImpl", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject vh(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adx_id", str);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
