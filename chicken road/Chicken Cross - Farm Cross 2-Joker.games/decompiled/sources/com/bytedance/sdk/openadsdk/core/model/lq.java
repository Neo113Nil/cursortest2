package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.tsx;

/* loaded from: classes4.dex */
public class lq {
    private int hc;
    private long kj;
    private long ork;
    public boolean pcc;
    private long qf;
    public long sf;
    private long tmg;
    private int vh;
    private long vj;
    private long vy;
    private long wh;
    private tsx gm = tsx.gm();
    private tsx oo = tsx.gm();

    public void pcc(tsx tsxVar, tsx tsxVar2, int i, tsx tsxVar3) {
        this.vj = tsxVar.pcc(this.gm);
        this.wh = tsxVar2.pcc(tsxVar);
        this.qf = i;
        this.kj = tsxVar3.pcc(tsxVar2);
    }

    public void pcc(tsx tsxVar) {
        this.gm = tsxVar;
    }

    public void sf(tsx tsxVar) {
        this.oo = tsxVar;
        this.vy = tsxVar.pcc(this.gm);
    }

    public tsx pcc() {
        return this.gm;
    }

    public long sf() {
        return this.vj;
    }

    public long gm() {
        return this.wh;
    }

    public long oo() {
        return this.qf;
    }

    public long vj() {
        return this.kj;
    }

    public long wh() {
        return this.vy;
    }

    public long qf() {
        return this.ork;
    }

    public void pcc(long j) {
        this.ork = j;
    }

    public int kj() {
        return this.vh;
    }

    public void pcc(int i) {
        this.vh = i;
    }

    public void sf(long j) {
        this.tmg = j;
    }

    public long vy() {
        return this.tmg;
    }

    public synchronized void sf(int i) {
        this.hc = i;
    }

    public synchronized int ork() {
        return this.hc;
    }
}
