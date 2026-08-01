package com.bytedance.sdk.openadsdk.component.kj;

import com.ironsource.U3;

/* loaded from: classes4.dex */
public final class pcc {
    private long gm;
    private boolean oo;
    private float pcc;
    private long sf;
    private long vj;

    public void pcc(boolean z) {
        this.oo = z;
    }

    public long pcc() {
        return this.vj;
    }

    public void pcc(long j) {
        this.vj = j;
    }

    public float sf() {
        return this.pcc;
    }

    public void pcc(float f) {
        new Object[]{"open_ad", "setTotalTime() called with: time = [" + f + U3.j.e};
        this.pcc = f;
    }

    public long gm() {
        new Object[]{"getCurrentTime() currentTime =", Long.valueOf(this.sf)};
        return this.sf;
    }

    public void sf(long j) {
        this.sf = j;
    }

    public long oo() {
        new Object[]{"getVideoPlayTime() videoPlayTime =", Long.valueOf(this.gm)};
        return this.gm;
    }

    public void gm(long j) {
        this.gm = j;
    }
}
