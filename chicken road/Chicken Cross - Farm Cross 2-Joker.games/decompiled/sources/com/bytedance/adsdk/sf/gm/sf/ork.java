package com.bytedance.adsdk.sf.gm.sf;

import android.graphics.PointF;

/* loaded from: classes4.dex */
public class ork implements gm {
    private final com.bytedance.adsdk.sf.gm.pcc.sf gm;
    private final com.bytedance.adsdk.sf.gm.pcc.sf kj;
    private final com.bytedance.adsdk.sf.gm.pcc.hc<PointF, PointF> oo;
    private final boolean ork;
    private final String pcc;
    private final com.bytedance.adsdk.sf.gm.pcc.sf qf;
    private final pcc sf;
    private final boolean vh;
    private final com.bytedance.adsdk.sf.gm.pcc.sf vj;
    private final com.bytedance.adsdk.sf.gm.pcc.sf vy;
    private final com.bytedance.adsdk.sf.gm.pcc.sf wh;

    public enum pcc {
        STAR(1),
        POLYGON(2);

        private final int gm;

        pcc(int i) {
            this.gm = i;
        }

        public static pcc pcc(int i) {
            for (pcc pccVar : values()) {
                if (pccVar.gm == i) {
                    return pccVar;
                }
            }
            return null;
        }
    }

    public ork(String str, pcc pccVar, com.bytedance.adsdk.sf.gm.pcc.sf sfVar, com.bytedance.adsdk.sf.gm.pcc.hc<PointF, PointF> hcVar, com.bytedance.adsdk.sf.gm.pcc.sf sfVar2, com.bytedance.adsdk.sf.gm.pcc.sf sfVar3, com.bytedance.adsdk.sf.gm.pcc.sf sfVar4, com.bytedance.adsdk.sf.gm.pcc.sf sfVar5, com.bytedance.adsdk.sf.gm.pcc.sf sfVar6, boolean z, boolean z2) {
        this.pcc = str;
        this.sf = pccVar;
        this.gm = sfVar;
        this.oo = hcVar;
        this.vj = sfVar2;
        this.wh = sfVar3;
        this.qf = sfVar4;
        this.kj = sfVar5;
        this.vy = sfVar6;
        this.ork = z;
        this.vh = z2;
    }

    public String pcc() {
        return this.pcc;
    }

    public pcc sf() {
        return this.sf;
    }

    public com.bytedance.adsdk.sf.gm.pcc.sf gm() {
        return this.gm;
    }

    public com.bytedance.adsdk.sf.gm.pcc.hc<PointF, PointF> oo() {
        return this.oo;
    }

    public com.bytedance.adsdk.sf.gm.pcc.sf vj() {
        return this.vj;
    }

    public com.bytedance.adsdk.sf.gm.pcc.sf wh() {
        return this.wh;
    }

    public com.bytedance.adsdk.sf.gm.pcc.sf qf() {
        return this.qf;
    }

    public com.bytedance.adsdk.sf.gm.pcc.sf kj() {
        return this.kj;
    }

    public com.bytedance.adsdk.sf.gm.pcc.sf vy() {
        return this.vy;
    }

    public boolean ork() {
        return this.ork;
    }

    public boolean vh() {
        return this.vh;
    }

    @Override // com.bytedance.adsdk.sf.gm.sf.gm
    public com.bytedance.adsdk.sf.pcc.pcc.gm pcc(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar) {
        return new com.bytedance.adsdk.sf.pcc.pcc.gbb(vyVar, pccVar, this);
    }
}
