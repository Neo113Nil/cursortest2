package com.bytedance.sdk.openadsdk.tmg.pcc;

import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.mu;
import com.ironsource.U3;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class kj extends com.bytedance.sdk.component.pcc.lu<JSONObject, JSONObject> {
    public static final HashSet<String> pcc = new HashSet<>(Arrays.asList("appInfo", "adInfo", "sendLog", "playable_style", "getTemplateInfo", "getTeMaiAds", U3.i.o, "getScreenSize", "getCloseButtonInfo", "getVolume", "removeLoading", "sendReward", "subscribe_app_ad", "download_app_ad", "cancel_download_app_ad", "unsubscribe_app_ad", "landscape_click", "clickEvent", "renderDidFinish", "dynamicTrack", "skipVideo", "muteVideo", "changeVideoState", "getCurrentVideoState", "send_temai_product_ids", "getMaterialMeta", "endcard_load", "pauseWebView", "pauseWebViewTimers", "webview_time_track", "getDownloadStatus", "openPrivacy", "openAdLandPageLinks", "getNativeSiteCustomData", "close"));
    private final mu sf;

    public kj(mu muVar) {
        this.sf = muVar;
    }

    public static void pcc(com.bytedance.sdk.component.pcc.jr jrVar, mu muVar) {
        jrVar.pcc(pcc, new kj(muVar));
    }

    @Override // com.bytedance.sdk.component.pcc.oo
    public JSONObject pcc(String str, JSONObject jSONObject, com.bytedance.sdk.component.pcc.vj vjVar) throws Exception {
        mu.sf sfVar = new mu.sf();
        sfVar.pcc = NotificationCompat.CATEGORY_CALL;
        sfVar.gm = str;
        sfVar.oo = jSONObject;
        return this.sf.pcc(sfVar, 3);
    }
}
