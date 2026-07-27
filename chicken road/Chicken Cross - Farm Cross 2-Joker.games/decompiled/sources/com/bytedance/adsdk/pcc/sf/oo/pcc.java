package com.bytedance.adsdk.pcc.sf.oo;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public enum pcc implements vj {
    TRUE,
    FALSE,
    NULL;

    private static final Map<String, pcc> oo = new HashMap(128);

    static {
        for (pcc pccVar : values()) {
            oo.put(pccVar.name().toLowerCase(), pccVar);
        }
    }

    public static pcc pcc(String str) {
        return oo.get(str.toLowerCase());
    }
}
