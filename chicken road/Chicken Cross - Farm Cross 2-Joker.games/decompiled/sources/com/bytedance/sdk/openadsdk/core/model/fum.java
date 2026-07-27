package com.bytedance.sdk.openadsdk.core.model;

/* loaded from: classes4.dex */
public class fum {
    private long pcc = 10000;
    private long sf = 10000;
    private long gm = 10;
    private long oo = 20;
    private String vj = "";

    public long pcc() {
        return this.pcc;
    }

    public void pcc(long j) {
        if (j <= 0) {
            this.pcc = 10L;
        } else {
            this.pcc = j;
        }
    }

    public long sf() {
        return this.sf;
    }

    public void sf(long j) {
        if (j < 0) {
            this.sf = 20L;
        } else {
            this.sf = j;
        }
    }

    public long gm() {
        return this.gm;
    }

    public void gm(long j) {
        if (j <= 0) {
            this.gm = 10L;
        } else {
            this.gm = j;
        }
    }

    public long oo() {
        return this.oo;
    }

    public void oo(long j) {
        if (j < 0) {
            this.oo = 20L;
        } else {
            this.oo = j;
        }
    }

    public String vj() {
        return this.vj;
    }

    public void pcc(String str) {
        this.vj = str;
    }
}
