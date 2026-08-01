package com.bytedance.sdk.component.sf.pcc;

/* loaded from: classes4.dex */
public final class wh {
    private final String[] pcc;

    public wh(String[] strArr) {
        this.pcc = strArr;
    }

    public int pcc() {
        return this.pcc.length / 2;
    }

    public String pcc(int i) {
        return this.pcc[i * 2];
    }

    public String sf(int i) {
        return this.pcc[(i * 2) + 1];
    }
}
