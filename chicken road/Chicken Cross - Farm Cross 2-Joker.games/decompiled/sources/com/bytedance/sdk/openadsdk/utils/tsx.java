package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* loaded from: classes4.dex */
public class tsx {
    public long pcc;
    private long sf;

    public long pcc() {
        return this.sf;
    }

    private tsx(boolean z) {
        if (z) {
            vj();
        }
    }

    public static tsx sf() {
        return new tsx(true);
    }

    public static tsx gm() {
        return new tsx(false);
    }

    public long oo() {
        return SystemClock.elapsedRealtime() - this.sf;
    }

    public long pcc(tsx tsxVar) {
        return Math.abs(tsxVar.sf - this.sf);
    }

    public void vj() {
        this.pcc = System.currentTimeMillis();
        this.sf = SystemClock.elapsedRealtime();
    }

    public boolean wh() {
        return this.sf > 0;
    }

    public String toString() {
        return String.valueOf(this.pcc);
    }
}
