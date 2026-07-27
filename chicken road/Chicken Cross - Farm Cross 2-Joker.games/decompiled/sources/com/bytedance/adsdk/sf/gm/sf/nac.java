package com.bytedance.adsdk.sf.gm.sf;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class nac implements gm {
    private final com.bytedance.adsdk.sf.gm.pcc.kj gm;
    private final boolean oo;
    private final String pcc;
    private final int sf;

    public nac(String str, int i, com.bytedance.adsdk.sf.gm.pcc.kj kjVar, boolean z) {
        this.pcc = str;
        this.sf = i;
        this.gm = kjVar;
        this.oo = z;
    }

    public String pcc() {
        return this.pcc;
    }

    public com.bytedance.adsdk.sf.gm.pcc.kj sf() {
        return this.gm;
    }

    @Override // com.bytedance.adsdk.sf.gm.sf.gm
    public com.bytedance.adsdk.sf.pcc.pcc.gm pcc(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar) {
        return new com.bytedance.adsdk.sf.pcc.pcc.lu(vyVar, pccVar, this);
    }

    public boolean gm() {
        return this.oo;
    }

    public String toString() {
        return "ShapePath{name=" + this.pcc + ", index=" + this.sf + AbstractJsonLexerKt.END_OBJ;
    }
}
