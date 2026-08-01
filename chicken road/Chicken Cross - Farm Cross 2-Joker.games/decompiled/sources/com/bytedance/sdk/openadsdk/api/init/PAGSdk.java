package com.bytedance.sdk.openadsdk.api.init;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.qf.oo;
import com.bytedance.sdk.component.kj.sf.gm;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.common.wh;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.vy;
import com.bytedance.sdk.openadsdk.core.zti;
import com.bytedance.sdk.openadsdk.kj.pcc;
import com.bytedance.sdk.openadsdk.utils.rnn;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class PAGSdk {
    public static final int INIT_LOCAL_FAIL_CODE = 4000;

    public interface PAGInitCallback {
        void fail(int i, String str);

        void success();
    }

    static {
        pcc.pcc();
    }

    public static void init(final Context context, final PAGConfig pAGConfig, final PAGInitCallback pAGInitCallback) {
        jr.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.1
            @Override // java.lang.Runnable
            public void run() {
                pcc.pcc(context, pAGConfig, pAGInitCallback);
            }
        });
        jr.qf();
    }

    public static boolean isInitSuccess() {
        return jr.oo() == 1;
    }

    public static String getSDKVersion() {
        if (zti.pcc() != null) {
            return zti.pcc().gm();
        }
        return "";
    }

    public static void getBiddingToken(final Context context, final PAGBiddingRequest pAGBiddingRequest, final BiddingTokenCallback biddingTokenCallback) {
        if (biddingTokenCallback == null) {
            return;
        }
        if (wh.pcc()) {
            biddingTokenCallback.onBiddingTokenCollected("");
        } else {
            rnn.oo(new gm("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2
                @Override // java.lang.Runnable
                public void run() {
                    lu.sf(context);
                    pcc.pcc(pAGBiddingRequest, new PAGBidCallback() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.2.1
                        @Override // com.bytedance.sdk.openadsdk.api.init.PAGBidCallback
                        public void onBiddingTokenCollected(String str) {
                            biddingTokenCallback.onBiddingTokenCollected(str);
                        }

                        @Override // com.bytedance.sdk.openadsdk.api.init.PAGBidCallback
                        public void onBiddingTokenFailed(PAGBidError pAGBidError) {
                            biddingTokenCallback.onBiddingTokenCollected("");
                        }
                    });
                    com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().pcc(false);
                }
            });
        }
    }

    public static void getBiddingToken(final Context context, final PAGBiddingRequest pAGBiddingRequest, final PAGBidCallback pAGBidCallback) {
        if (pAGBidCallback == null) {
            return;
        }
        if (wh.pcc()) {
            pAGBidCallback.onBiddingTokenFailed(new PAGBidError(10009, vy.pcc(10009)));
        } else {
            rnn.oo(new gm("getBiddingToken") { // from class: com.bytedance.sdk.openadsdk.api.init.PAGSdk.3
                @Override // java.lang.Runnable
                public void run() {
                    lu.sf(context);
                    pcc.pcc(pAGBiddingRequest, pAGBidCallback);
                    com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().pcc(false);
                }
            });
        }
    }

    public static void closeMultiWebViewFileLock() {
        com.bytedance.sdk.openadsdk.gpj.pcc.pcc();
    }

    public static void addPAGInitCallback(PAGInitCallback pAGInitCallback) {
        if (pAGInitCallback != null && jr.oo() == 0) {
            pcc.pcc.add(pAGInitCallback);
        }
    }

    public static void setAabPackageName(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        tz.pcc(str);
        oo.pcc(str);
    }

    public static void setAdRevenue(JSONObject jSONObject) {
        if (jSONObject != null && lu.oo().nac() && isInitSuccess()) {
            com.bytedance.sdk.openadsdk.dax.oo.pcc().pcc(jSONObject);
        }
    }

    private static void setSdkDisable(boolean z) {
        wh.pcc(z);
    }
}
