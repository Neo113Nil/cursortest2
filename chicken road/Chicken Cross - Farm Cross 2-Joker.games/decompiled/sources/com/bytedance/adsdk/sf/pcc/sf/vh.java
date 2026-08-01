package com.bytedance.adsdk.sf.pcc.sf;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes4.dex */
public class vh extends qf<PointF> {
    private final PointF oo;

    public vh(List<com.bytedance.adsdk.sf.qf.pcc<PointF>> list) {
        super(list);
        this.oo = new PointF();
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public PointF pcc(com.bytedance.adsdk.sf.qf.pcc<PointF> pccVar, float f) {
        return pcc(pccVar, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc
    /* renamed from: sf, reason: merged with bridge method [inline-methods] */
    public PointF pcc(com.bytedance.adsdk.sf.qf.pcc<PointF> pccVar, float f, float f2, float f3) {
        if (pccVar.pcc == null || pccVar.sf == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = pccVar.pcc;
        PointF pointF2 = pccVar.sf;
        if (this.gm != null) {
            pccVar.qf.floatValue();
            oo();
            kj();
            throw null;
        }
        this.oo.set(pointF.x + (f2 * (pointF2.x - pointF.x)), pointF.y + (f3 * (pointF2.y - pointF.y)));
        return this.oo;
    }
}
