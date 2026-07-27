package com.bytedance.adsdk.ugeno.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class oo {
    private static Map<String, sf> pcc = new HashMap();

    public static void pcc(List<sf> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (sf sfVar : list) {
            if (sfVar != null) {
                pcc.put(sfVar.pcc(), sfVar);
            }
        }
    }

    public static sf pcc(String str) {
        return pcc.get(str);
    }
}
