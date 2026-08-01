package com.bykv.vk.openvk.pcc.pcc.pcc.gm;

/* loaded from: classes5.dex */
public class pcc {
    private String gm;
    private int pcc;
    private int sf;

    public pcc(int i, int i2) {
        this.pcc = i;
        this.sf = i2;
    }

    public pcc(int i, int i2, String str) {
        this.pcc = i;
        this.sf = i2;
        this.gm = str;
    }

    public int pcc() {
        return this.pcc;
    }

    public int sf() {
        return this.sf;
    }

    public String gm() {
        return this.gm;
    }

    public void pcc(String str) {
        this.gm = str;
    }
}
