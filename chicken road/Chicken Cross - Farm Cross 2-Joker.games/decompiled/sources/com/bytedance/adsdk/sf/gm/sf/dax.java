package com.bytedance.adsdk.sf.gm.sf;

import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class dax implements gm {
    private final boolean gm;
    private final String pcc;
    private final List<gm> sf;

    public dax(String str, List<gm> list, boolean z) {
        this.pcc = str;
        this.sf = list;
        this.gm = z;
    }

    public String pcc() {
        return this.pcc;
    }

    public List<gm> sf() {
        return this.sf;
    }

    public boolean gm() {
        return this.gm;
    }

    @Override // com.bytedance.adsdk.sf.gm.sf.gm
    public com.bytedance.adsdk.sf.pcc.pcc.gm pcc(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar) {
        return new com.bytedance.adsdk.sf.pcc.pcc.oo(vyVar, pccVar, this, qfVar);
    }

    public String toString() {
        return "ShapeGroup{name='" + this.pcc + "' Shapes: " + Arrays.toString(this.sf.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}
