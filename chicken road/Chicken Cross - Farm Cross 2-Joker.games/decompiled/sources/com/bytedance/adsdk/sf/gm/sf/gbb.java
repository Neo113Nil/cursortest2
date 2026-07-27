package com.bytedance.adsdk.sf.gm.sf;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class gbb {
    private boolean gm;
    private final List<com.bytedance.adsdk.sf.gm.pcc> pcc;
    private PointF sf;

    public gbb(PointF pointF, boolean z, List<com.bytedance.adsdk.sf.gm.pcc> list) {
        this.sf = pointF;
        this.gm = z;
        this.pcc = new ArrayList(list);
    }

    public gbb() {
        this.pcc = new ArrayList();
    }

    public void pcc(float f, float f2) {
        if (this.sf == null) {
            this.sf = new PointF();
        }
        this.sf.set(f, f2);
    }

    public PointF pcc() {
        return this.sf;
    }

    public void pcc(boolean z) {
        this.gm = z;
    }

    public boolean sf() {
        return this.gm;
    }

    public List<com.bytedance.adsdk.sf.gm.pcc> gm() {
        return this.pcc;
    }

    public void pcc(gbb gbbVar, gbb gbbVar2, float f) {
        if (this.sf == null) {
            this.sf = new PointF();
        }
        this.gm = gbbVar.sf() || gbbVar2.sf();
        if (gbbVar.gm().size() != gbbVar2.gm().size()) {
            gbbVar.gm().size();
            gbbVar2.gm().size();
        }
        int min = Math.min(gbbVar.gm().size(), gbbVar2.gm().size());
        if (this.pcc.size() < min) {
            for (int size = this.pcc.size(); size < min; size++) {
                this.pcc.add(new com.bytedance.adsdk.sf.gm.pcc());
            }
        } else if (this.pcc.size() > min) {
            for (int size2 = this.pcc.size() - 1; size2 >= min; size2--) {
                List<com.bytedance.adsdk.sf.gm.pcc> list = this.pcc;
                list.remove(list.size() - 1);
            }
        }
        PointF pcc = gbbVar.pcc();
        PointF pcc2 = gbbVar2.pcc();
        pcc(com.bytedance.adsdk.sf.wh.vj.pcc(pcc.x, pcc2.x, f), com.bytedance.adsdk.sf.wh.vj.pcc(pcc.y, pcc2.y, f));
        for (int size3 = this.pcc.size() - 1; size3 >= 0; size3--) {
            com.bytedance.adsdk.sf.gm.pcc pccVar = gbbVar.gm().get(size3);
            com.bytedance.adsdk.sf.gm.pcc pccVar2 = gbbVar2.gm().get(size3);
            PointF pcc3 = pccVar.pcc();
            PointF sf = pccVar.sf();
            PointF gm = pccVar.gm();
            PointF pcc4 = pccVar2.pcc();
            PointF sf2 = pccVar2.sf();
            PointF gm2 = pccVar2.gm();
            this.pcc.get(size3).pcc(com.bytedance.adsdk.sf.wh.vj.pcc(pcc3.x, pcc4.x, f), com.bytedance.adsdk.sf.wh.vj.pcc(pcc3.y, pcc4.y, f));
            this.pcc.get(size3).sf(com.bytedance.adsdk.sf.wh.vj.pcc(sf.x, sf2.x, f), com.bytedance.adsdk.sf.wh.vj.pcc(sf.y, sf2.y, f));
            this.pcc.get(size3).gm(com.bytedance.adsdk.sf.wh.vj.pcc(gm.x, gm2.x, f), com.bytedance.adsdk.sf.wh.vj.pcc(gm.y, gm2.y, f));
        }
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.pcc.size() + "closed=" + this.gm + AbstractJsonLexerKt.END_OBJ;
    }
}
