package com.bytedance.adsdk.sf.pcc.pcc;

import android.graphics.PointF;
import com.bytedance.adsdk.sf.pcc.sf.pcc;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class nac implements gpj, pcc.InterfaceC0101pcc {
    private final com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> gm;
    private com.bytedance.adsdk.sf.gm.sf.gbb oo;
    private final com.bytedance.adsdk.sf.vy pcc;
    private final String sf;

    @Override // com.bytedance.adsdk.sf.pcc.pcc.gm
    public void pcc(List<gm> list, List<gm> list2) {
    }

    public nac(com.bytedance.adsdk.sf.vy vyVar, com.bytedance.adsdk.sf.gm.gm.pcc pccVar, com.bytedance.adsdk.sf.gm.sf.hc hcVar) {
        this.pcc = vyVar;
        this.sf = hcVar.pcc();
        com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> pcc = hcVar.sf().pcc();
        this.gm = pcc;
        pccVar.pcc(pcc);
        pcc.pcc(this);
    }

    @Override // com.bytedance.adsdk.sf.pcc.sf.pcc.InterfaceC0101pcc
    public void pcc() {
        this.pcc.invalidateSelf();
    }

    public com.bytedance.adsdk.sf.pcc.sf.pcc<Float, Float> sf() {
        return this.gm;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
    
        if (r7 == (r0.size() - 1)) goto L27;
     */
    @Override // com.bytedance.adsdk.sf.pcc.pcc.gpj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.bytedance.adsdk.sf.gm.sf.gbb pcc(com.bytedance.adsdk.sf.gm.sf.gbb gbbVar) {
        List<com.bytedance.adsdk.sf.gm.pcc> list;
        boolean z;
        List<com.bytedance.adsdk.sf.gm.pcc> gm = gbbVar.gm();
        if (gm.size() <= 2) {
            return gbbVar;
        }
        float floatValue = this.gm.qf().floatValue();
        if (floatValue == 0.0f) {
            return gbbVar;
        }
        com.bytedance.adsdk.sf.gm.sf.gbb sf = sf(gbbVar);
        sf.pcc(gbbVar.pcc().x, gbbVar.pcc().y);
        List<com.bytedance.adsdk.sf.gm.pcc> gm2 = sf.gm();
        boolean sf2 = gbbVar.sf();
        int i = 0;
        int i2 = 0;
        while (i < gm.size()) {
            com.bytedance.adsdk.sf.gm.pcc pccVar = gm.get(i);
            com.bytedance.adsdk.sf.gm.pcc pccVar2 = gm.get(pcc(i - 1, gm.size()));
            com.bytedance.adsdk.sf.gm.pcc pccVar3 = gm.get(pcc(i - 2, gm.size()));
            PointF gm3 = (i != 0 || sf2) ? pccVar2.gm() : gbbVar.pcc();
            PointF sf3 = (i != 0 || sf2) ? pccVar2.sf() : gm3;
            PointF pcc = pccVar.pcc();
            PointF gm4 = pccVar3.gm();
            PointF gm5 = pccVar.gm();
            boolean z2 = !gbbVar.sf() && i == 0;
            if (sf3.equals(gm3) && pcc.equals(gm3) && !z2) {
                float f = gm3.x - gm4.x;
                float f2 = gm3.y - gm4.y;
                float f3 = gm5.x - gm3.x;
                float f4 = gm5.y - gm3.y;
                list = gm;
                z = sf2;
                float hypot = (float) Math.hypot(f, f2);
                float hypot2 = (float) Math.hypot(f3, f4);
                float min = Math.min(floatValue / hypot, 0.5f);
                float min2 = Math.min(floatValue / hypot2, 0.5f);
                float f5 = gm3.x + ((gm4.x - gm3.x) * min);
                float f6 = gm3.y + ((gm4.y - gm3.y) * min);
                float f7 = gm3.x + ((gm5.x - gm3.x) * min2);
                float f8 = gm3.y + ((gm5.y - gm3.y) * min2);
                float f9 = f5 - ((f5 - gm3.x) * 0.5519f);
                float f10 = f6 - ((f6 - gm3.y) * 0.5519f);
                float f11 = f7 - ((f7 - gm3.x) * 0.5519f);
                float f12 = f8 - ((f8 - gm3.y) * 0.5519f);
                com.bytedance.adsdk.sf.gm.pcc pccVar4 = gm2.get(pcc(i2 - 1, gm2.size()));
                com.bytedance.adsdk.sf.gm.pcc pccVar5 = gm2.get(i2);
                pccVar4.sf(f5, f6);
                pccVar4.gm(f5, f6);
                if (i == 0) {
                    sf.pcc(f5, f6);
                }
                pccVar5.pcc(f9, f10);
                com.bytedance.adsdk.sf.gm.pcc pccVar6 = gm2.get(i2 + 1);
                pccVar5.sf(f11, f12);
                pccVar5.gm(f7, f8);
                pccVar6.pcc(f7, f8);
                i2 += 2;
            } else {
                list = gm;
                z = sf2;
                com.bytedance.adsdk.sf.gm.pcc pccVar7 = gm2.get(pcc(i2 - 1, gm2.size()));
                com.bytedance.adsdk.sf.gm.pcc pccVar8 = gm2.get(i2);
                pccVar7.sf(pccVar2.sf().x, pccVar2.sf().y);
                pccVar7.gm(pccVar2.gm().x, pccVar2.gm().y);
                pccVar8.pcc(pccVar.pcc().x, pccVar.pcc().y);
                i2++;
            }
            i++;
            gm = list;
            sf2 = z;
        }
        return sf;
    }

    private com.bytedance.adsdk.sf.gm.sf.gbb sf(com.bytedance.adsdk.sf.gm.sf.gbb gbbVar) {
        List<com.bytedance.adsdk.sf.gm.pcc> gm = gbbVar.gm();
        boolean sf = gbbVar.sf();
        int size = gm.size() - 1;
        int i = 0;
        while (size >= 0) {
            com.bytedance.adsdk.sf.gm.pcc pccVar = gm.get(size);
            com.bytedance.adsdk.sf.gm.pcc pccVar2 = gm.get(pcc(size - 1, gm.size()));
            PointF gm2 = (size != 0 || sf) ? pccVar2.gm() : gbbVar.pcc();
            i = (((size != 0 || sf) ? pccVar2.sf() : gm2).equals(gm2) && pccVar.pcc().equals(gm2) && !(!gbbVar.sf() && size == 0 && size == gm.size() - 1)) ? i + 2 : i + 1;
            size--;
        }
        com.bytedance.adsdk.sf.gm.sf.gbb gbbVar2 = this.oo;
        if (gbbVar2 == null || gbbVar2.gm().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new com.bytedance.adsdk.sf.gm.pcc());
            }
            this.oo = new com.bytedance.adsdk.sf.gm.sf.gbb(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.oo.pcc(sf);
        return this.oo;
    }

    private static int pcc(int i, int i2) {
        return i - (sf(i, i2) * i2);
    }

    private static int sf(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }
}
