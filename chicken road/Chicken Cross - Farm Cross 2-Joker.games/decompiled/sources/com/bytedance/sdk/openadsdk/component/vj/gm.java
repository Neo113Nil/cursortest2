package com.bytedance.sdk.openadsdk.component.vj;

import com.bytedance.sdk.openadsdk.core.model.of;

/* loaded from: classes4.dex */
public class gm {
    private of gm;
    private com.bytedance.sdk.openadsdk.core.model.pcc oo;
    private int pcc;
    private boolean qf;
    private int sf;
    private int vj;
    private String wh;

    public gm(int i, int i2, of ofVar, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        this.pcc = i;
        this.sf = i2;
        this.gm = ofVar;
        this.oo = pccVar;
    }

    public gm(int i, int i2, int i3, String str) {
        this.pcc = i;
        this.sf = i2;
        this.vj = i3;
        this.wh = str;
    }

    public com.bytedance.sdk.openadsdk.core.model.pcc pcc() {
        return this.oo;
    }

    public void pcc(boolean z) {
        this.qf = z;
    }

    public int sf() {
        return this.pcc;
    }

    public int gm() {
        return this.sf;
    }

    public of oo() {
        return this.gm;
    }

    public int vj() {
        return this.vj;
    }

    public String wh() {
        return this.wh;
    }
}
