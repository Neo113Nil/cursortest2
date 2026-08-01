package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.of;

/* loaded from: classes4.dex */
class vj {
    private static volatile vj pcc;
    private final Context sf;

    public void pcc(String str, of ofVar) {
        com.bytedance.sdk.openadsdk.common.sf.pcc("sp_full_screen_video_new").pcc(str, ofVar);
    }

    public void pcc() {
        com.bytedance.sdk.openadsdk.common.sf.pcc("sp_full_screen_video_new").pcc();
    }

    public void pcc(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        if (pccVar == null || pccVar.qf() == null || !pccVar.qf().duh()) {
            com.bytedance.sdk.openadsdk.common.sf.pcc("sp_full_screen_video_new").pcc(adSlot, pccVar);
        }
    }

    public static vj pcc(Context context) {
        if (pcc == null) {
            synchronized (vj.class) {
                if (pcc == null) {
                    pcc = new vj(context);
                }
            }
        }
        return pcc;
    }

    private vj(Context context) {
        this.sf = context == null ? com.bytedance.sdk.openadsdk.core.lu.pcc() : context.getApplicationContext();
    }

    public String pcc(String str, boolean z) {
        com.bytedance.sdk.openadsdk.common.sf pcc2 = com.bytedance.sdk.openadsdk.common.sf.pcc("sp_full_screen_video_new");
        String pcc3 = pcc2.pcc(str, 10500000L);
        if (z && !TextUtils.isEmpty(pcc3) && pcc2.oo(str)) {
            return null;
        }
        return pcc3;
    }

    public boolean pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        return com.bytedance.sdk.openadsdk.common.sf.pcc("sp_full_screen_video_new").pcc(pccVar, true);
    }

    public void pcc(String str) {
        com.bytedance.sdk.openadsdk.common.sf.pcc("sp_full_screen_video_new").gm(str);
    }
}
