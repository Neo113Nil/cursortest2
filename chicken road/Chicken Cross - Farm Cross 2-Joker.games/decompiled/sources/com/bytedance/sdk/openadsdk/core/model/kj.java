package com.bytedance.sdk.openadsdk.core.model;

import java.util.List;

/* loaded from: classes4.dex */
public class kj {
    private List<Integer> gm;
    private int oo;
    private int pcc;
    private int qf;
    private int sf;
    private List<String> vj;
    private int wh;

    public boolean pcc() {
        return this.wh == 1;
    }

    public void pcc(int i) {
        this.wh = i;
    }

    public int sf() {
        int i = this.qf;
        if (i >= 2) {
            return i;
        }
        return 0;
    }

    public void sf(int i) {
        this.qf = i;
    }

    public List<String> gm() {
        return this.vj;
    }

    public void pcc(List<String> list) {
        this.vj = list;
    }

    public int oo() {
        return this.pcc;
    }

    public void gm(int i) {
        this.pcc = i;
    }

    public int vj() {
        return this.sf;
    }

    public void oo(int i) {
        this.sf = i;
    }

    public List<Integer> wh() {
        return this.gm;
    }

    public void sf(List<Integer> list) {
        this.gm = list;
    }

    public int qf() {
        return this.oo;
    }

    public void vj(int i) {
        this.oo = i;
    }
}
