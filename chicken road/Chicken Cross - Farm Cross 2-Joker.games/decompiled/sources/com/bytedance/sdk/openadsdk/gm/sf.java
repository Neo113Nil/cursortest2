package com.bytedance.sdk.openadsdk.gm;

import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.of;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class sf {
    private static volatile sf pcc;
    private final of<com.bytedance.sdk.openadsdk.oo.pcc> sf = lu.gm();

    private sf() {
    }

    public static sf pcc() {
        if (pcc == null) {
            synchronized (sf.class) {
                if (pcc == null) {
                    pcc = new sf();
                }
            }
        }
        return pcc;
    }

    public void pcc(String str, List<FilterWord> list, String str2) {
        pcc(str, list, null, null, str2);
    }

    public void pcc(String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        this.sf.pcc(str, list, jSONObject, str2, str3);
    }
}
