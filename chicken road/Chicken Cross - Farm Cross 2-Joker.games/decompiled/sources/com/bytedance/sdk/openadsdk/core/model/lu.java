package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public class lu {
    private int gm;
    private double oo;
    private String pcc;
    private int sf;
    private boolean vj;
    private String wh;

    public String pcc() {
        return this.pcc;
    }

    public void pcc(String str) {
        this.pcc = str;
    }

    public int sf() {
        return this.sf;
    }

    public void pcc(int i) {
        this.sf = i;
    }

    public int gm() {
        return this.gm;
    }

    public void sf(int i) {
        this.gm = i;
    }

    public double oo() {
        return this.oo;
    }

    public boolean vj() {
        return !TextUtils.isEmpty(this.pcc) && this.sf > 0 && this.gm > 0;
    }

    public boolean wh() {
        return this.vj;
    }

    public void pcc(boolean z) {
        this.vj = z;
    }

    public String qf() {
        return this.wh;
    }

    public void sf(String str) {
        this.wh = str;
    }
}
