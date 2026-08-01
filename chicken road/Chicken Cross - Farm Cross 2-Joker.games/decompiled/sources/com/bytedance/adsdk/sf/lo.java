package com.bytedance.adsdk.sf;

import java.util.Map;

/* loaded from: classes4.dex */
public class lo {
    private final Map<String, String> pcc;
    private boolean sf;

    public String pcc(String str) {
        return str;
    }

    public String pcc(String str, String str2) {
        return pcc(str2);
    }

    public final String sf(String str, String str2) {
        if (this.sf && this.pcc.containsKey(str2)) {
            return this.pcc.get(str2);
        }
        String pcc = pcc(str, str2);
        if (this.sf) {
            this.pcc.put(str2, pcc);
        }
        return pcc;
    }
}
