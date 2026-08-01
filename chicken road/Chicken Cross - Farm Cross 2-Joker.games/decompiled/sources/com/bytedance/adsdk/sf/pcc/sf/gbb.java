package com.bytedance.adsdk.sf.pcc.sf;

import android.graphics.PointF;
import java.util.Collections;

/* loaded from: classes4.dex */
public class gbb extends pcc<PointF, PointF> {
    private final pcc<Float, Float> kj;
    protected com.bytedance.adsdk.sf.qf.sf<Float> oo;
    private final PointF qf;
    protected com.bytedance.adsdk.sf.qf.sf<Float> vj;
    private final pcc<Float, Float> vy;
    private final PointF wh;

    public gbb(pcc<Float, Float> pccVar, pcc<Float, Float> pccVar2) {
        super(Collections.emptyList());
        this.wh = new PointF();
        this.qf = new PointF();
        this.kj = pccVar;
        this.vy = pccVar2;
        pcc(kj());
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc
    public void pcc(float f) {
        this.kj.pcc(f);
        this.vy.pcc(f);
        this.wh.set(this.kj.qf().floatValue(), this.vy.qf().floatValue());
        for (int i = 0; i < this.pcc.size(); i++) {
            this.pcc.get(i).pcc();
        }
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc
    /* renamed from: vy, reason: merged with bridge method [inline-methods] */
    public PointF qf() {
        return pcc(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public PointF pcc(com.bytedance.adsdk.sf.qf.pcc<PointF> pccVar, float f) {
        com.bytedance.adsdk.sf.qf.pcc<Float> gm;
        com.bytedance.adsdk.sf.qf.pcc<Float> gm2;
        if (this.oo != null && (gm2 = this.kj.gm()) != null) {
            this.kj.vj();
            Float f2 = gm2.qf;
            if (f2 == null) {
                throw null;
            }
            f2.floatValue();
            throw null;
        }
        if (this.vj != null && (gm = this.vy.gm()) != null) {
            this.vy.vj();
            Float f3 = gm.qf;
            if (f3 == null) {
                throw null;
            }
            f3.floatValue();
            throw null;
        }
        this.qf.set(this.wh.x, 0.0f);
        PointF pointF = this.qf;
        pointF.set(pointF.x, this.wh.y);
        return this.qf;
    }
}
