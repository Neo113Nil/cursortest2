package com.bytedance.adsdk.sf.gm.sf;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class vy implements gm {
    private final boolean gm;
    private final String pcc;
    private final pcc sf;

    public enum pcc {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static pcc pcc(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i == 5) {
                return EXCLUDE_INTERSECTIONS;
            }
            return MERGE;
        }
    }

    public vy(String str, pcc pccVar, boolean z) {
        this.pcc = str;
        this.sf = pccVar;
        this.gm = z;
    }

    public String pcc() {
        return this.pcc;
    }

    public pcc sf() {
        return this.sf;
    }

    public boolean gm() {
        return this.gm;
    }

    @Override // com.bytedance.adsdk.sf.gm.sf.gm
    public com.bytedance.adsdk.sf.pcc.pcc.gm pcc(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.qf qfVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar) {
        return new com.bytedance.adsdk.sf.pcc.pcc.tmg(this);
    }

    public String toString() {
        return "MergePaths{mode=" + this.sf + AbstractJsonLexerKt.END_OBJ;
    }
}
