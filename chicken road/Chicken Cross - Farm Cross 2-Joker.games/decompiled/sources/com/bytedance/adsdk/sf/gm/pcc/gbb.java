package com.bytedance.adsdk.sf.gm.pcc;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
abstract class gbb<V, O> implements hc<V, O> {
    final List<com.bytedance.adsdk.sf.qf.pcc<V>> pcc;

    gbb(List<com.bytedance.adsdk.sf.qf.pcc<V>> list) {
        this.pcc = list;
    }

    @Override // com.bytedance.adsdk.sf.gm.pcc.hc
    public List<com.bytedance.adsdk.sf.qf.pcc<V>> gm() {
        return this.pcc;
    }

    @Override // com.bytedance.adsdk.sf.gm.pcc.hc
    public boolean sf() {
        return this.pcc.isEmpty() || (this.pcc.size() == 1 && this.pcc.get(0).vj());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.pcc.isEmpty()) {
            sb.append("values=").append(Arrays.toString(this.pcc.toArray()));
        }
        return sb.toString();
    }
}
