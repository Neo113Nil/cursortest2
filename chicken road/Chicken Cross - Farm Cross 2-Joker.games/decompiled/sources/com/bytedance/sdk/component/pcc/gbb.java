package com.bytedance.sdk.component.pcc;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public class gbb {
    public final String gm;
    public final String kj;
    public final String oo;
    public final int pcc;
    public final String qf;
    public final String sf;
    public final String vj;
    public final String wh;

    public static pcc pcc() {
        return new pcc();
    }

    public static gbb pcc(String str, int i) {
        return new gbb(str, i);
    }

    private gbb(String str, int i) {
        this.sf = null;
        this.gm = null;
        this.oo = null;
        this.vj = null;
        this.wh = str;
        this.qf = null;
        this.pcc = i;
        this.kj = null;
    }

    private gbb(pcc pccVar) {
        this.sf = pccVar.pcc;
        this.gm = pccVar.sf;
        this.oo = pccVar.gm;
        this.vj = pccVar.oo;
        this.wh = pccVar.vj;
        this.qf = pccVar.wh;
        this.pcc = 1;
        this.kj = pccVar.qf;
    }

    public static boolean pcc(gbb gbbVar) {
        return gbbVar == null || gbbVar.pcc != 1 || TextUtils.isEmpty(gbbVar.oo) || TextUtils.isEmpty(gbbVar.vj);
    }

    public String toString() {
        return "methodName: " + this.oo + ", params: " + this.vj + ", callbackId: " + this.wh + ", type: " + this.gm + ", version: " + this.sf + ", ";
    }

    public static final class pcc {
        private String gm;
        private String oo;
        private String pcc;
        private String qf;
        private String sf;
        private String vj;
        private String wh;

        private pcc() {
        }

        public pcc pcc(String str) {
            this.pcc = str;
            return this;
        }

        public pcc sf(String str) {
            this.sf = str;
            return this;
        }

        public pcc gm(String str) {
            this.gm = str;
            return this;
        }

        public pcc oo(String str) {
            this.oo = str;
            return this;
        }

        public pcc vj(String str) {
            this.vj = str;
            return this;
        }

        public pcc wh(String str) {
            this.wh = str;
            return this;
        }

        public pcc qf(String str) {
            this.qf = str;
            return this;
        }

        public gbb pcc() {
            return new gbb(this);
        }
    }
}
