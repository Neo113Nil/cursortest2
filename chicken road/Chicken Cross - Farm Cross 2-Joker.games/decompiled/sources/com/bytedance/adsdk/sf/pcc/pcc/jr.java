package com.bytedance.adsdk.sf.pcc.pcc;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.adsdk.sf.gm.sf.gpj;
import com.bytedance.adsdk.sf.pcc.sf.pcc;
import java.util.List;

/* loaded from: classes4.dex */
public class jr implements hc, vh, pcc.InterfaceC0101pcc {
    private final String gm;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> kj;
    private final boolean oo;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, PointF> qf;
    private boolean vh;
    private final com.bytedance.adsdk.sf.vy vj;
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<?, PointF> wh;
    private final Path pcc = new Path();
    private final RectF sf = new RectF();
    private final sf vy = new sf();
    private com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> ork = null;

    public jr(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar, com.bytedance.adsdk.sf.gm.sf.vh vhVar) {
        this.gm = vhVar.pcc();
        this.oo = vhVar.vj();
        this.vj = vyVar;
        com.bytedance.adsdk.sf.pcc.sf.pcc<PointF, PointF> pcc = vhVar.oo().pcc();
        this.wh = pcc;
        com.bytedance.adsdk.sf.pcc.sf.pcc<PointF, PointF> pcc2 = vhVar.gm().pcc();
        this.qf = pcc2;
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc3 = vhVar.sf().pcc();
        this.kj = pcc3;
        pccVar.pcc(pcc);
        pccVar.pcc(pcc2);
        pccVar.pcc(pcc3);
        pcc.pcc(this);
        pcc2.pcc(this);
        pcc3.pcc(this);
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.InterfaceC0101pcc
    public void pcc() {
        sf();
    }

    private void sf() {
        this.vh = false;
        this.vj.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.gm
    public void pcc(List<gm> list, List<gm> list2) {
        for (int i = 0; i < list.size(); i++) {
            gm gmVar = list.get(i);
            if (gmVar instanceof fum) {
                fum fumVar = (fum) gmVar;
                if (fumVar.sf() == gpj.pcc.SIMULTANEOUSLY) {
                    this.vy.pcc(fumVar);
                    fumVar.pcc(this);
                }
            }
            if (gmVar instanceof nac) {
                this.ork = ((nac) gmVar).sf();
            }
        }
    }

    @Override // com.bytedance.adsdk.sf.pcc.pcc.hc
    public Path oo() {
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pccVar;
        if (this.vh) {
            return this.pcc;
        }
        this.pcc.reset();
        if (this.oo) {
            this.vh = true;
            return this.pcc;
        }
        PointF qf = this.qf.qf();
        float f = qf.x / 2.0f;
        float f2 = qf.y / 2.0f;
        com.bytedance.adsdk.sf.pcc.sf.pcc<?, Float> pccVar2 = this.kj;
        float vy = pccVar2 == null ? 0.0f : ((com.bytedance.adsdk.sf.pcc.sf.oo) pccVar2).vy();
        if (vy == 0.0f && (pccVar = this.ork) != null) {
            vy = Math.min(pccVar.qf().floatValue(), Math.min(f, f2));
        }
        float min = Math.min(f, f2);
        if (vy > min) {
            vy = min;
        }
        PointF qf2 = this.wh.qf();
        this.pcc.moveTo(qf2.x + f, (qf2.y - f2) + vy);
        this.pcc.lineTo(qf2.x + f, (qf2.y + f2) - vy);
        if (vy > 0.0f) {
            float f3 = vy * 2.0f;
            this.sf.set((qf2.x + f) - f3, (qf2.y + f2) - f3, qf2.x + f, qf2.y + f2);
            this.pcc.arcTo(this.sf, 0.0f, 90.0f, false);
        }
        this.pcc.lineTo((qf2.x - f) + vy, qf2.y + f2);
        if (vy > 0.0f) {
            float f4 = vy * 2.0f;
            this.sf.set(qf2.x - f, (qf2.y + f2) - f4, (qf2.x - f) + f4, qf2.y + f2);
            this.pcc.arcTo(this.sf, 90.0f, 90.0f, false);
        }
        this.pcc.lineTo(qf2.x - f, (qf2.y - f2) + vy);
        if (vy > 0.0f) {
            float f5 = vy * 2.0f;
            this.sf.set(qf2.x - f, qf2.y - f2, (qf2.x - f) + f5, (qf2.y - f2) + f5);
            this.pcc.arcTo(this.sf, 180.0f, 90.0f, false);
        }
        this.pcc.lineTo((qf2.x + f) - vy, qf2.y - f2);
        if (vy > 0.0f) {
            float f6 = vy * 2.0f;
            this.sf.set((qf2.x + f) - f6, qf2.y - f2, qf2.x + f, (qf2.y - f2) + f6);
            this.pcc.arcTo(this.sf, 270.0f, 90.0f, false);
        }
        this.pcc.close();
        this.vy.pcc(this.pcc);
        this.vh = true;
        return this.pcc;
    }
}
