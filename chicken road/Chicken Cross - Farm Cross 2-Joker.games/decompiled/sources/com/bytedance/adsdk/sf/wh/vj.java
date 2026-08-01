package com.bytedance.adsdk.sf.wh;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.sf.gm.sf.gbb;

/* loaded from: classes4.dex */
public class vj {
    private static final PointF pcc = new PointF();

    public static boolean gm(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static float pcc(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int pcc(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static PointF pcc(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void pcc(gbb gbbVar, Path path) {
        path.reset();
        PointF pcc2 = gbbVar.pcc();
        path.moveTo(pcc2.x, pcc2.y);
        pcc.set(pcc2.x, pcc2.y);
        for (int i = 0; i < gbbVar.gm().size(); i++) {
            com.bytedance.adsdk.sf.gm.pcc pccVar = gbbVar.gm().get(i);
            PointF pcc3 = pccVar.pcc();
            PointF sf = pccVar.sf();
            PointF gm = pccVar.gm();
            PointF pointF = pcc;
            if (pcc3.equals(pointF) && sf.equals(gm)) {
                path.lineTo(gm.x, gm.y);
            } else {
                path.cubicTo(pcc3.x, pcc3.y, sf.x, sf.y, gm.x, gm.y);
            }
            pointF.set(gm.x, gm.y);
        }
        if (gbbVar.sf()) {
            path.close();
        }
    }

    static int pcc(float f, float f2) {
        return pcc((int) f, (int) f2);
    }

    private static int pcc(int i, int i2) {
        return i - (i2 * sf(i, i2));
    }

    private static int sf(int i, int i2) {
        int i3 = i / i2;
        return (((i ^ i2) >= 0) || i % i2 == 0) ? i3 : i3 - 1;
    }

    public static int pcc(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i3, i));
    }

    public static float sf(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }
}
