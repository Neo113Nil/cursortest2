package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.C4561o2;
import com.ironsource.mediationsdk.d;
import java.util.Map;

/* loaded from: classes4.dex */
public class zti {
    public static void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, Double d) {
        if (ofVar == null || ofVar.oa() == null) {
            return;
        }
        Map<String, Object> oa = ofVar.oa();
        try {
            Object obj = ofVar.oa().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String str = (String) oa.get(C4561o2.A);
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (d != null) {
                    str = str.replace("${AUCTION_BID_TO_WIN}", String.valueOf(d));
                }
                com.bytedance.sdk.openadsdk.core.lu.gm().pcc(str);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.lo.gm("report Win error", new Object[0]);
        }
    }

    public static void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, Double d, String str, String str2) {
        if (ofVar == null || ofVar.oa() == null) {
            return;
        }
        Map<String, Object> oa = ofVar.oa();
        try {
            Object obj = ofVar.oa().get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null && Integer.parseInt(obj.toString()) == 2) {
                String str3 = (String) oa.get(C4561o2.z);
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                if (d != null) {
                    str3 = str3.replace(d.n, String.valueOf(d));
                }
                if (str != null) {
                    str3 = str3.replace(d.l, str);
                }
                if (str2 != null) {
                    str3 = str3.replace("${AUCTION_WINNER}", str2);
                }
                com.bytedance.sdk.openadsdk.core.lu.gm().pcc(str3);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.utils.lo.gm("report Loss error", new Object[0]);
        }
    }
}
