package com.bytedance.adsdk.sf.gm;

import com.bytedance.adsdk.sf.gm.sf.dax;
import java.util.List;

/* loaded from: classes4.dex */
public class oo {
    private final double gm;
    private final double oo;
    private final List<dax> pcc;
    private final char sf;
    private final String vj;
    private final String wh;

    public static int pcc(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public oo(List<dax> list, char c, double d, double d2, String str, String str2) {
        this.pcc = list;
        this.sf = c;
        this.gm = d;
        this.oo = d2;
        this.vj = str;
        this.wh = str2;
    }

    public List<dax> pcc() {
        return this.pcc;
    }

    public double sf() {
        return this.oo;
    }

    public int hashCode() {
        return pcc(this.sf, this.wh, this.vj);
    }
}
