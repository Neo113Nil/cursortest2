package com.bytedance.sdk.openadsdk.core.model;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class oo {
    private com.bytedance.sdk.openadsdk.core.gbb.oo pcc = new com.bytedance.sdk.openadsdk.core.gbb.oo();
    private Set<com.bytedance.sdk.openadsdk.core.gbb.ork> sf = new HashSet();

    public com.bytedance.sdk.openadsdk.core.gbb.oo pcc() {
        return this.pcc;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.gbb.oo ooVar) {
        if (ooVar == null) {
            ooVar = new com.bytedance.sdk.openadsdk.core.gbb.oo();
        }
        this.pcc = ooVar;
    }

    public Set<com.bytedance.sdk.openadsdk.core.gbb.ork> sf() {
        return this.sf;
    }

    public void pcc(Set<com.bytedance.sdk.openadsdk.core.gbb.ork> set) {
        this.sf = set;
    }

    public void pcc(of ofVar) {
        com.bytedance.sdk.openadsdk.core.gbb.oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.pcc(ofVar);
        }
    }

    public void sf(Set<com.bytedance.sdk.openadsdk.core.gbb.ork> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        this.sf.addAll(set);
    }
}
