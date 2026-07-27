package com.bytedance.adsdk.sf.gm.sf;

import android.graphics.Path;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class jr implements gm {
    private final String gm;
    private final com.bytedance.adsdk.sf.gm.pcc.pcc oo;
    private final boolean pcc;
    private final Path.FillType sf;
    private final com.bytedance.adsdk.sf.gm.pcc.oo vj;
    private final boolean wh;

    public jr(String str, boolean z, Path.FillType fillType, com.bytedance.adsdk.sf.gm.pcc.pcc pccVar, com.bytedance.adsdk.sf.gm.pcc.oo ooVar, boolean z2) {
        this.gm = str;
        this.pcc = z;
        this.sf = fillType;
        this.oo = pccVar;
        this.vj = ooVar;
        this.wh = z2;
    }

    public String pcc() {
        return this.gm;
    }

    public com.bytedance.adsdk.sf.gm.pcc.pcc sf() {
        return this.oo;
    }

    public com.bytedance.adsdk.sf.gm.pcc.oo gm() {
        return this.vj;
    }

    public Path.FillType oo() {
        return this.sf;
    }

    public boolean vj() {
        return this.wh;
    }

    @Override // com.bytedance.adsdk.sf.gm.sf.gm
    public com.bytedance.adsdk.sf.pcc.pcc.gm pcc(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar) {
        return new com.bytedance.adsdk.sf.pcc.pcc.qf(vyVar, pccVar, this);
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.pcc + AbstractJsonLexerKt.END_OBJ;
    }
}
