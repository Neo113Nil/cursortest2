package com.bytedance.sdk.openadsdk.nac;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class sf {
    public static int gm = 1;
    public static int oo = 2;
    public static int pcc = -1;
    public static int sf = 0;
    public static int vj = 3;
    private int wh = pcc;
    private long qf = 0;
    private long kj = 0;
    private final List<gm> vy = new ArrayList();
    private long ork = 0;

    public void pcc(long j) {
        this.wh = sf;
        this.qf = j;
    }

    public void sf(long j) {
        int i;
        int i2 = this.wh;
        if (i2 == pcc || i2 == (i = vj)) {
            return;
        }
        this.wh = i;
        this.kj = j;
    }

    public void gm(long j) {
        int i;
        int i2 = this.wh;
        if (i2 == pcc || i2 == (i = oo) || i2 == vj) {
            return;
        }
        this.wh = i;
        this.ork = j;
    }

    public void oo(long j) {
        int i = this.wh;
        if (i == pcc || i != oo) {
            return;
        }
        this.wh = gm;
        this.vy.add(new gm(this.ork, j));
        this.ork = 0L;
    }

    public long pcc(long j, long j2) {
        long j3;
        long j4;
        long sf2;
        long j5 = this.kj;
        if (j5 != 0 && j > j5) {
            return 0L;
        }
        int i = 0;
        for (gm gmVar : this.vy) {
            if (gmVar.sf() > j) {
                if (j < gmVar.pcc()) {
                    j4 = i;
                    sf2 = gmVar.sf() - gmVar.pcc();
                } else {
                    j4 = i;
                    sf2 = gmVar.sf() - j;
                }
                i = (int) (j4 + sf2);
            }
        }
        long j6 = this.qf;
        if (j6 < j) {
            long j7 = this.ork;
            if (j7 == 0) {
                j7 = this.kj;
                if (j7 == 0) {
                    j3 = j2 - j;
                }
            } else if (j7 <= j) {
                return 0L;
            }
            return (j7 - j) - i;
        }
        long j8 = this.ork;
        if (j8 == 0) {
            j8 = this.kj;
            if (j8 == 0) {
                j3 = j2 - j6;
            }
        } else if (j8 <= j6) {
            return 0L;
        }
        return (j8 - j6) - i;
        return j3 - i;
    }

    public int pcc() {
        return this.wh;
    }
}
