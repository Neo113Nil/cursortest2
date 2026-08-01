package com.bytedance.adsdk.sf.pcc.pcc;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.sf.gm.sf.gpj;
import com.bytedance.adsdk.sf.gm.sf.ork;
import com.bytedance.adsdk.sf.pcc.sf.pcc;
import java.util.List;

/* loaded from: classes4.dex */
public class gbb implements hc, vh, pcc.InterfaceC0101pcc {
    private final com.bytedance.adsdk.sf.vy gm;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> hc;
    private boolean jr;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, PointF> kj;
    private final ork.pcc oo;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> ork;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> qf;
    private final String sf;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> tmg;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> vh;
    private final boolean vj;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> vy;
    private final boolean wh;
    private final Path pcc = new Path();
    private final sf gbb = new sf();

    public gbb(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar, com.bytedance.adsdk.sf.gm.sf.ork orkVar) {
        this.gm = vyVar;
        this.sf = orkVar.pcc();
        ork.pcc sf = orkVar.sf();
        this.oo = sf;
        this.vj = orkVar.ork();
        this.wh = orkVar.vh();
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc = orkVar.gm().pcc();
        this.qf = pcc;
        com.bytedance.adsdk.sf.pcc.sf.pcc<PointF, PointF> pcc2 = orkVar.oo().pcc();
        this.kj = pcc2;
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc3 = orkVar.vj().pcc();
        this.vy = pcc3;
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc4 = orkVar.qf().pcc();
        this.vh = pcc4;
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc5 = orkVar.vy().pcc();
        this.hc = pcc5;
        if (sf == ork.pcc.STAR) {
            this.ork = orkVar.wh().pcc();
            this.tmg = orkVar.kj().pcc();
        } else {
            this.ork = null;
            this.tmg = null;
        }
        pccVar.pcc(pcc);
        pccVar.pcc(pcc2);
        pccVar.pcc(pcc3);
        pccVar.pcc(pcc4);
        pccVar.pcc(pcc5);
        if (sf == ork.pcc.STAR) {
            pccVar.pcc(this.ork);
            pccVar.pcc(this.tmg);
        }
        pcc.pcc(this);
        pcc2.pcc(this);
        pcc3.pcc(this);
        pcc4.pcc(this);
        pcc5.pcc(this);
        if (sf == ork.pcc.STAR) {
            this.ork.pcc(this);
            this.tmg.pcc(this);
        }
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.InterfaceC0101pcc
    public void pcc() {
        sf();
    }

    private void sf() {
        this.jr = false;
        this.gm.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.gm
    public void pcc(List<gm> list, List<gm> list2) {
        for (int i = 0; i < list.size(); i++) {
            gm gmVar = list.get(i);
            if (gmVar instanceof fum) {
                fum fumVar = (fum) gmVar;
                if (fumVar.sf() == gpj.pcc.SIMULTANEOUSLY) {
                    this.gbb.pcc(fumVar);
                    fumVar.pcc(this);
                }
            }
        }
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.hc
    public Path oo() {
        if (this.jr) {
            return this.pcc;
        }
        this.pcc.reset();
        if (this.vj) {
            this.jr = true;
            return this.pcc;
        }
        int i = AnonymousClass1.pcc[this.oo.ordinal()];
        if (i == 1) {
            gm();
        } else if (i == 2) {
            vj();
        }
        this.pcc.close();
        this.gbb.pcc(this.pcc);
        this.jr = true;
        return this.pcc;
    }

    /* renamed from: com.bytedance.adsdk.sf.pcc.pcc.gbb$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pcc;

        static {
            int[] iArr = new int[ork.pcc.values().length];
            pcc = iArr;
            try {
                iArr[ork.pcc.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pcc[ork.pcc.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void gm() {
        int i;
        float f;
        float f2;
        double d;
        float f3;
        float f4;
        float f5;
        float f6;
        double d2;
        float f7;
        float f8;
        float f9;
        double d3;
        float floatValue = this.qf.qf().floatValue();
        double radians = Math.toRadians((this.vy == null ? 0.0d : r2.qf().floatValue()) - 90.0d);
        double d4 = floatValue;
        float f10 = (float) (6.283185307179586d / d4);
        if (this.wh) {
            f10 *= -1.0f;
        }
        float f11 = f10 / 2.0f;
        float f12 = floatValue - ((int) floatValue);
        int i2 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        if (i2 != 0) {
            radians += (1.0f - f12) * f11;
        }
        float floatValue2 = this.vh.qf().floatValue();
        float floatValue3 = this.ork.qf().floatValue();
        com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> pccVar = this.tmg;
        float floatValue4 = pccVar != null ? pccVar.qf().floatValue() / 100.0f : 0.0f;
        com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> pccVar2 = this.hc;
        float floatValue5 = pccVar2 != null ? pccVar2.qf().floatValue() / 100.0f : 0.0f;
        if (i2 != 0) {
            f4 = ((floatValue2 - floatValue3) * f12) + floatValue3;
            i = i2;
            double d5 = f4;
            float cos = (float) (d5 * Math.cos(radians));
            f3 = (float) (d5 * Math.sin(radians));
            this.pcc.moveTo(cos, f3);
            d = radians + ((f10 * f12) / 2.0f);
            f = cos;
            f2 = f11;
        } else {
            i = i2;
            double d6 = floatValue2;
            float cos2 = (float) (Math.cos(radians) * d6);
            float sin = (float) (d6 * Math.sin(radians));
            this.pcc.moveTo(cos2, sin);
            f = cos2;
            f2 = f11;
            d = radians + f2;
            f3 = sin;
            f4 = 0.0f;
        }
        double ceil = Math.ceil(d4) * 2.0d;
        int i3 = 0;
        float f13 = f2;
        float f14 = f;
        boolean z = false;
        while (true) {
            double d7 = i3;
            if (d7 < ceil) {
                float f15 = z ? floatValue2 : floatValue3;
                if (f4 == 0.0f || d7 != ceil - 2.0d) {
                    f5 = f10;
                    f6 = f13;
                } else {
                    f5 = f10;
                    f6 = (f10 * f12) / 2.0f;
                }
                if (f4 == 0.0f || d7 != ceil - 1.0d) {
                    d2 = d7;
                    f7 = f4;
                    f4 = f15;
                } else {
                    d2 = d7;
                    f7 = f4;
                }
                double d8 = f4;
                double d9 = ceil;
                float cos3 = (float) (d8 * Math.cos(d));
                float sin2 = (float) (d8 * Math.sin(d));
                if (floatValue4 == 0.0f && floatValue5 == 0.0f) {
                    this.pcc.lineTo(cos3, sin2);
                    d3 = d;
                    f8 = floatValue4;
                    f9 = floatValue5;
                } else {
                    f8 = floatValue4;
                    double atan2 = (float) (Math.atan2(f3, f14) - 1.5707963267948966d);
                    float cos4 = (float) Math.cos(atan2);
                    float sin3 = (float) Math.sin(atan2);
                    f9 = floatValue5;
                    d3 = d;
                    double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                    float cos5 = (float) Math.cos(atan22);
                    float sin4 = (float) Math.sin(atan22);
                    float f16 = z ? f8 : f9;
                    float f17 = z ? f9 : f8;
                    float f18 = (z ? floatValue3 : floatValue2) * f16 * 0.47829f;
                    float f19 = cos4 * f18;
                    float f20 = f18 * sin3;
                    float f21 = (z ? floatValue2 : floatValue3) * f17 * 0.47829f;
                    float f22 = cos5 * f21;
                    float f23 = f21 * sin4;
                    if (i != 0) {
                        if (i3 == 0) {
                            f19 *= f12;
                            f20 *= f12;
                        } else if (d2 == d9 - 1.0d) {
                            f22 *= f12;
                            f23 *= f12;
                        }
                    }
                    this.pcc.cubicTo(f14 - f19, f3 - f20, cos3 + f22, sin2 + f23, cos3, sin2);
                }
                d = d3 + f6;
                z = !z;
                i3++;
                f14 = cos3;
                f3 = sin2;
                floatValue5 = f9;
                floatValue4 = f8;
                f4 = f7;
                f10 = f5;
                ceil = d9;
            } else {
                PointF qf = this.kj.qf();
                this.pcc.offset(qf.x, qf.y);
                this.pcc.close();
                return;
            }
        }
    }

    private void vj() {
        int i;
        double d;
        double d2;
        double d3;
        int floor = (int) Math.floor(this.qf.qf().floatValue());
        double radians = Math.toRadians((this.vy == null ? 0.0d : r2.qf().floatValue()) - 90.0d);
        double d4 = floor;
        float floatValue = this.hc.qf().floatValue() / 100.0f;
        float floatValue2 = this.vh.qf().floatValue();
        double d5 = floatValue2;
        float cos = (float) (Math.cos(radians) * d5);
        float sin = (float) (Math.sin(radians) * d5);
        this.pcc.moveTo(cos, sin);
        double d6 = (float) (6.283185307179586d / d4);
        double d7 = radians + d6;
        double ceil = Math.ceil(d4);
        int i2 = 0;
        while (i2 < ceil) {
            float cos2 = (float) (Math.cos(d7) * d5);
            double d8 = ceil;
            float sin2 = (float) (d5 * Math.sin(d7));
            if (floatValue != 0.0f) {
                d2 = d5;
                i = i2;
                d = d7;
                double atan2 = (float) (Math.atan2(sin, cos) - 1.5707963267948966d);
                float cos3 = (float) Math.cos(atan2);
                float sin3 = (float) Math.sin(atan2);
                d3 = d6;
                double atan22 = (float) (Math.atan2(sin2, cos2) - 1.5707963267948966d);
                float f = floatValue2 * floatValue * 0.25f;
                this.pcc.cubicTo(cos - (cos3 * f), sin - (sin3 * f), cos2 + (((float) Math.cos(atan22)) * f), sin2 + (f * ((float) Math.sin(atan22))), cos2, sin2);
            } else {
                i = i2;
                d = d7;
                d2 = d5;
                d3 = d6;
                this.pcc.lineTo(cos2, sin2);
            }
            d7 = d + d3;
            i2 = i + 1;
            sin = sin2;
            cos = cos2;
            ceil = d8;
            d5 = d2;
            d6 = d3;
        }
        PointF qf = this.kj.qf();
        this.pcc.offset(qf.x, qf.y);
        this.pcc.close();
    }
}
