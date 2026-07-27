package com.bytedance.adsdk.sf.gm;

import com.bytedance.adsdk.sf.gbb;

/* loaded from: classes4.dex */
public class vj {
    private static final vj pcc = new vj();
    private final gbb<String, com.bytedance.adsdk.sf.qf> sf = new gbb<>(20);

    public static vj pcc() {
        return pcc;
    }

    vj() {
    }

    public com.bytedance.adsdk.sf.qf pcc(String str) {
        if (str == null) {
            return null;
        }
        return this.sf.pcc((gbb<String, com.bytedance.adsdk.sf.qf>) str);
    }

    public void pcc(String str, com.bytedance.adsdk.sf.qf qfVar) {
        if (str == null) {
            return;
        }
        this.sf.pcc(str, qfVar);
    }
}
