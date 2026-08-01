package com.bytedance.adsdk.sf.gm;

import android.graphics.PointF;

/* loaded from: classes4.dex */
public class sf {
    public float gm;
    public PointF hc;
    public int kj;
    public pcc oo;
    public float ork;
    public String pcc;
    public float qf;
    public String sf;
    public PointF tmg;
    public boolean vh;
    public int vj;
    public int vy;
    public float wh;

    public enum pcc {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public sf(String str, String str2, float f, pcc pccVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        pcc(str, str2, f, pccVar, i, f2, f3, i2, i3, f4, z, pointF, pointF2);
    }

    public sf() {
    }

    public void pcc(String str, String str2, float f, pcc pccVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        this.pcc = str;
        this.sf = str2;
        this.gm = f;
        this.oo = pccVar;
        this.vj = i;
        this.wh = f2;
        this.qf = f3;
        this.kj = i2;
        this.vy = i3;
        this.ork = f4;
        this.vh = z;
        this.tmg = pointF;
        this.hc = pointF2;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.pcc.hashCode() * 31) + this.sf.hashCode()) * 31) + this.gm)) * 31) + this.oo.ordinal()) * 31) + this.vj;
        long floatToRawIntBits = Float.floatToRawIntBits(this.wh);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.kj;
    }
}
