package com.bytedance.adsdk.sf.gm.sf;

import android.graphics.PointF;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class vh implements gm {
    private final com.bytedance.adsdk.sf.gm.pcc.hc<PointF, PointF> gm;
    private final com.bytedance.adsdk.sf.gm.pcc.sf oo;
    private final String pcc;
    private final com.bytedance.adsdk.sf.gm.pcc.hc<PointF, PointF> sf;
    private final boolean vj;

    public vh(String str, com.bytedance.adsdk.sf.gm.pcc.hc<PointF, PointF> hcVar, com.bytedance.adsdk.sf.gm.pcc.hc<PointF, PointF> hcVar2, com.bytedance.adsdk.sf.gm.pcc.sf sfVar, boolean z) {
        this.pcc = str;
        this.sf = hcVar;
        this.gm = hcVar2;
        this.oo = sfVar;
        this.vj = z;
    }

    public String pcc() {
        return this.pcc;
    }

    public com.bytedance.adsdk.sf.gm.pcc.sf sf() {
        return this.oo;
    }

    public com.bytedance.adsdk.sf.gm.pcc.hc<PointF, PointF> gm() {
        return this.gm;
    }

    public com.bytedance.adsdk.sf.gm.pcc.hc<PointF, PointF> oo() {
        return this.sf;
    }

    public boolean vj() {
        return this.vj;
    }

    @Override // com.bytedance.adsdk.sf.gm.sf.gm
    public com.bytedance.adsdk.sf.pcc.pcc.gm pcc(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar) {
        return new com.bytedance.adsdk.sf.pcc.pcc.jr(vyVar, pccVar, this);
    }

    public String toString() {
        return "RectangleShape{position=" + this.sf + ", size=" + this.gm + AbstractJsonLexerKt.END_OBJ;
    }
}
