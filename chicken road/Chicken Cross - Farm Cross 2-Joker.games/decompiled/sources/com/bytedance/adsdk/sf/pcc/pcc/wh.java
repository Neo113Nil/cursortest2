package com.bytedance.adsdk.sf.pcc.pcc;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.sf.gm.sf.gpj;
import com.bytedance.adsdk.sf.pcc.sf.pcc;
import java.util.List;

/* loaded from: classes4.dex */
public class wh implements hc, vh, pcc.InterfaceC0101pcc {
    private final com.bytedance.adsdk.sf.vy gm;
    private boolean kj;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, PointF> oo;
    private final Path pcc = new Path();
    private final sf qf = new sf();
    private final String sf;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, PointF> vj;
    private final com.bytedance.adsdk.sf.gm.sf.sf wh;

    public wh(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar, com.bytedance.adsdk.sf.gm.sf.sf sfVar) {
        this.sf = sfVar.pcc();
        this.gm = vyVar;
        com.bytedance.adsdk.sf.pcc.sf.pcc<PointF, PointF> pcc = sfVar.gm().pcc();
        this.oo = pcc;
        com.bytedance.adsdk.sf.pcc.sf.pcc<PointF, PointF> pcc2 = sfVar.sf().pcc();
        this.vj = pcc2;
        this.wh = sfVar;
        pccVar.pcc(pcc);
        pccVar.pcc(pcc2);
        pcc.pcc(this);
        pcc2.pcc(this);
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.InterfaceC0101pcc
    public void pcc() {
        sf();
    }

    private void sf() {
        this.kj = false;
        this.gm.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.gm
    public void pcc(List<gm> list, List<gm> list2) {
        for (int i = 0; i < list.size(); i++) {
            gm gmVar = list.get(i);
            if (gmVar instanceof fum) {
                fum fumVar = (fum) gmVar;
                if (fumVar.sf() == gpj.pcc.SIMULTANEOUSLY) {
                    this.qf.pcc(fumVar);
                    fumVar.pcc(this);
                }
            }
        }
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.hc
    public Path oo() {
        if (this.kj) {
            return this.pcc;
        }
        this.pcc.reset();
        if (this.wh.vj()) {
            this.kj = true;
            return this.pcc;
        }
        PointF qf = this.oo.qf();
        float f = qf.x / 2.0f;
        float f2 = qf.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.pcc.reset();
        if (this.wh.oo()) {
            float f5 = -f2;
            this.pcc.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.pcc.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.pcc.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.pcc.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.pcc.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.pcc.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.pcc.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.pcc.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.pcc.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.pcc.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF qf2 = this.vj.qf();
        this.pcc.offset(qf2.x, qf2.y);
        this.pcc.close();
        this.qf.pcc(this.pcc);
        this.kj = true;
        return this.pcc;
    }
}
