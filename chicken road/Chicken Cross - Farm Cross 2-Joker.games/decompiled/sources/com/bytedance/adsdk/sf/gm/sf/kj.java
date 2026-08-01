package com.bytedance.adsdk.sf.gm.sf;

/* loaded from: classes4.dex */
public class kj {
    private final com.bytedance.adsdk.sf.gm.pcc.oo gm;
    private final boolean oo;
    private final pcc pcc;
    private final com.bytedance.adsdk.sf.gm.pcc.kj sf;

    public enum pcc {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public kj(pcc pccVar, com.bytedance.adsdk.sf.gm.pcc.kj kjVar, com.bytedance.adsdk.sf.gm.pcc.oo ooVar, boolean z) {
        this.pcc = pccVar;
        this.sf = kjVar;
        this.gm = ooVar;
        this.oo = z;
    }

    public pcc pcc() {
        return this.pcc;
    }

    public com.bytedance.adsdk.sf.gm.pcc.kj sf() {
        return this.sf;
    }

    public com.bytedance.adsdk.sf.gm.pcc.oo gm() {
        return this.gm;
    }

    public boolean oo() {
        return this.oo;
    }
}
