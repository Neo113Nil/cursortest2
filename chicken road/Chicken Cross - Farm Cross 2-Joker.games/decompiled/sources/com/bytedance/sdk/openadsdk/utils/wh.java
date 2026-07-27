package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.ironsource.U3;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class wh {
    public static String pcc(String str) {
        if (!com.bytedance.sdk.component.utils.jr.gm() || TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.ork orkVar = new com.bytedance.sdk.openadsdk.core.model.ork(com.bytedance.sdk.openadsdk.core.ork.sf().tmg());
        StringBuilder sb = new StringBuilder(str);
        Iterator<String> it = orkVar.sf().iterator();
        while (it.hasNext()) {
            if (sb.toString().contains(it.next())) {
                if (sb.toString().contains("?")) {
                    sb.append(U3.j.c).append(orkVar.pcc());
                } else {
                    sb.append("?").append(orkVar.pcc());
                }
            }
        }
        return sb.toString();
    }
}
