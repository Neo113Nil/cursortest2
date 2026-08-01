package com.bytedance.sdk.openadsdk.dax.pcc;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* loaded from: classes4.dex */
public class pcc {
    float dax;
    int gbb;
    float gm;
    float hc;
    String jr;
    float kj;
    int nac;
    float oo;
    int ork;
    String pcc;
    float qf;
    int sf;
    float tmg;
    float vh;
    float vj;
    float vy;
    int wh;
    int lu = -1;
    String gpj = "";

    public int pcc() {
        return this.lu;
    }

    public void pcc(int i) {
        this.lu = i;
    }

    public String sf() {
        return this.gpj;
    }

    public void pcc(String str) {
        this.gpj = str;
    }

    public String gm() {
        return this.pcc;
    }

    public void sf(String str) {
        this.pcc = str;
    }

    public int oo() {
        return this.sf;
    }

    public void sf(int i) {
        this.sf = i;
    }

    public float vj() {
        return this.gm;
    }

    public void pcc(float f) {
        this.gm = f;
    }

    public float wh() {
        return this.oo;
    }

    public void sf(float f) {
        this.oo = f;
    }

    public float qf() {
        return this.vj;
    }

    public void gm(float f) {
        this.vj = f;
    }

    public int kj() {
        return this.wh;
    }

    public void gm(int i) {
        this.wh = i;
    }

    public float vy() {
        return this.qf;
    }

    public void oo(float f) {
        this.qf = f;
    }

    public float ork() {
        return this.kj;
    }

    public void vj(float f) {
        this.kj = f;
    }

    public float vh() {
        return this.vy;
    }

    public void wh(float f) {
        this.vy = f;
    }

    public int tmg() {
        return this.ork;
    }

    public void oo(int i) {
        this.ork = i;
    }

    public float hc() {
        return this.vh;
    }

    public void qf(float f) {
        this.vh = f;
    }

    public float gbb() {
        return this.tmg;
    }

    public void kj(float f) {
        this.tmg = f;
    }

    public BigDecimal jr() {
        return new BigDecimal(this.hc).setScale(3, RoundingMode.HALF_UP);
    }

    public void vy(float f) {
        this.hc = f;
    }

    public int dax() {
        return this.gbb;
    }

    public void vj(int i) {
        this.gbb = i;
    }

    public String nac() {
        return this.jr;
    }

    public void gm(String str) {
        this.jr = str;
    }

    public float lu() {
        return this.dax;
    }

    public void ork(float f) {
        this.dax = f;
    }

    public int gpj() {
        return this.nac;
    }

    public void wh(int i) {
        this.nac = i;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.dax.pcc.pcc$pcc, reason: collision with other inner class name */
    public static class C0182pcc {
        pcc pcc = new pcc();

        public C0182pcc pcc(String str) {
            this.pcc.sf(str);
            return this;
        }

        public C0182pcc pcc(int i) {
            this.pcc.sf(i);
            return this;
        }

        public C0182pcc pcc(float f) {
            this.pcc.pcc(f);
            return this;
        }

        public C0182pcc sf(float f) {
            this.pcc.sf(f);
            return this;
        }

        public C0182pcc gm(float f) {
            this.pcc.gm(f);
            return this;
        }

        public C0182pcc oo(float f) {
            this.pcc.oo(f);
            return this;
        }

        public C0182pcc vj(float f) {
            this.pcc.vj(f);
            return this;
        }

        public C0182pcc wh(float f) {
            this.pcc.wh(f);
            return this;
        }

        public C0182pcc qf(float f) {
            this.pcc.qf(f);
            return this;
        }

        public C0182pcc kj(float f) {
            this.pcc.kj(f);
            return this;
        }

        public C0182pcc vy(float f) {
            this.pcc.vy(f);
            return this;
        }

        public C0182pcc sf(int i) {
            this.pcc.vj(i);
            return this;
        }

        public C0182pcc sf(String str) {
            this.pcc.gm(str);
            return this;
        }

        public C0182pcc ork(float f) {
            this.pcc.ork(f);
            return this;
        }

        public C0182pcc gm(int i) {
            this.pcc.wh(i);
            return this;
        }

        public pcc pcc() {
            return this.pcc;
        }
    }
}
