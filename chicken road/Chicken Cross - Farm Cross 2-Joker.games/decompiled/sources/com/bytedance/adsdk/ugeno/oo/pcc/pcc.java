package com.bytedance.adsdk.ugeno.oo.pcc;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class pcc {
    private volatile Map<String, gm> pcc = new HashMap();

    public gm pcc(String str) {
        if (this.pcc.containsKey(str) && this.pcc.get(str) != null) {
            return this.pcc.get(str);
        }
        sf sfVar = new sf();
        this.pcc.put(str, sfVar);
        return sfVar;
    }

    public void pcc(String str, gm gmVar) {
        if (!this.pcc.containsKey(str) || this.pcc.get(str) == null) {
            this.pcc.put(str, gmVar);
        }
    }
}
