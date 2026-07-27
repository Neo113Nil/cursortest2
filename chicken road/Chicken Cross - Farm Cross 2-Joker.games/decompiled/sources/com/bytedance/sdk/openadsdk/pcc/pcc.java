package com.bytedance.sdk.openadsdk.pcc;

import android.text.TextUtils;
import com.bytedance.sdk.component.kj.sf.gm;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.core.settings.qf;
import com.bytedance.sdk.openadsdk.core.vh.sf;
import com.bytedance.sdk.openadsdk.core.vy;
import com.bytedance.sdk.openadsdk.lu.oo;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.google.android.gms.games.GamesActivityResultCodes;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* loaded from: classes4.dex */
public class pcc {
    public static boolean pcc(PAGLoadListener pAGLoadListener) {
        if (qf.pcc()) {
            return false;
        }
        if (pAGLoadListener == null) {
            return true;
        }
        pAGLoadListener.onError(1000, "Ad request is temporarily paused, Please contact your AM");
        return true;
    }

    public static void pcc(final gm gmVar, final PAGLoadListener pAGLoadListener, final AdSlot adSlot) {
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.pcc.pcc.1
            @Override // java.lang.Runnable
            public void run() {
                if (!jr.vj()) {
                    PAGLoadListener pAGLoadListener2 = PAGLoadListener.this;
                    if (pAGLoadListener2 != null) {
                        pAGLoadListener2.onError(10000, "Please exec TTAdSdk.init before load ad");
                        return;
                    }
                    return;
                }
                if (sf.pcc().vh() && ork.sf().vh()) {
                    PAGLoadListener pAGLoadListener3 = PAGLoadListener.this;
                    if (pAGLoadListener3 != null) {
                        pAGLoadListener3.onError(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED, vy.pcc(GamesActivityResultCodes.RESULT_APP_MISCONFIGURED));
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.lu.gm.pcc(new oo() { // from class: com.bytedance.sdk.openadsdk.pcc.pcc.1.1
                    @Override // com.bytedance.sdk.openadsdk.lu.oo
                    public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                        com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                        pccVar.sf("load_ad");
                        pccVar.gm(adSlot.getCodeId());
                        pccVar.oo(kun.gm(adSlot.getDurationSlotType()));
                        pccVar.qf(kun.pcc(adSlot).toString());
                        return pccVar;
                    }
                });
                rnn.gm(gmVar);
            }
        };
        if (jr.vj()) {
            runnable.run();
        } else {
            jr.sf().post(runnable);
        }
    }

    public static void pcc(AdSlot.Builder builder, PAGRequest pAGRequest) {
        Map<String, Object> extraInfo;
        if (!jr.vj() || pAGRequest == null || builder == null || (extraInfo = pAGRequest.getExtraInfo()) == null) {
            return;
        }
        if (extraInfo.containsKey("ad_id") && extraInfo.get("ad_id") != null) {
            builder.setAdId(extraInfo.get("ad_id").toString());
        }
        if (extraInfo.containsKey(CampaignEx.JSON_KEY_CREATIVE_ID) && extraInfo.get(CampaignEx.JSON_KEY_CREATIVE_ID) != null) {
            builder.setCreativeId(extraInfo.get(CampaignEx.JSON_KEY_CREATIVE_ID).toString());
        }
        if (extraInfo.containsKey("ext") && extraInfo.get("ext") != null) {
            builder.setExt(extraInfo.get("ext").toString());
        }
        if (!extraInfo.containsKey("media_extra") || extraInfo.get("media_extra") == null) {
            return;
        }
        builder.setMediaExtra(extraInfo.get("media_extra").toString());
    }

    public static boolean pcc(String str, PAGRequest pAGRequest, PAGLoadListener pAGLoadListener) {
        if (TextUtils.isEmpty(str) && pAGLoadListener != null) {
            pAGLoadListener.onError(1, PAGErrorCode.PAGAdErrorCodeSlotIdNULLMsg);
            return true;
        }
        if (pAGRequest != null || pAGLoadListener == null) {
            return false;
        }
        pAGLoadListener.onError(2, PAGErrorCode.PAGAdErrorCodeRequestNULLMsg);
        return true;
    }
}
