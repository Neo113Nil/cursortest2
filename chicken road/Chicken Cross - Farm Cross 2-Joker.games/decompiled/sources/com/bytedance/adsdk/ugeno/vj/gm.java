package com.bytedance.adsdk.ugeno.vj;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class gm {
    int dax;
    int hc;
    int jr;
    int kj;
    boolean lu;
    boolean nac;
    float ork;
    int qf;
    int tmg;
    float vh;
    int vj;
    int vy;
    int wh;
    int pcc = Integer.MAX_VALUE;
    int sf = Integer.MAX_VALUE;
    int gm = Integer.MIN_VALUE;
    int oo = Integer.MIN_VALUE;
    List<Integer> gbb = new ArrayList();

    gm() {
    }

    public int pcc() {
        return this.qf;
    }

    public int sf() {
        return this.kj - this.vy;
    }

    void pcc(View view, int i, int i2, int i3, int i4) {
        sf sfVar = (sf) view.getLayoutParams();
        this.pcc = Math.min(this.pcc, (view.getLeft() - sfVar.hc()) - i);
        this.sf = Math.min(this.sf, (view.getTop() - sfVar.gbb()) - i2);
        this.gm = Math.max(this.gm, view.getRight() + sfVar.jr() + i3);
        this.oo = Math.max(this.oo, view.getBottom() + sfVar.dax() + i4);
    }
}
