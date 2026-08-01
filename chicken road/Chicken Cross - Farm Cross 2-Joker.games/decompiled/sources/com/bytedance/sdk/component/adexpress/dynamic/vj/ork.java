package com.bytedance.sdk.component.adexpress.dynamic.vj;

import com.bytedance.sdk.component.adexpress.dynamic.vj.sf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class ork {
    public static float pcc(float f) {
        return (float) Math.ceil((f * 16.0f) / 16.0f);
    }

    public static List<sf.pcc> pcc(float f, List<sf.pcc> list) {
        ArrayList<sf.pcc> arrayList = new ArrayList();
        Iterator<sf.pcc> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((sf.pcc) it.next().clone());
        }
        boolean z = true;
        int i = 0;
        int i2 = 0;
        for (sf.pcc pccVar : arrayList) {
            if (pccVar.sf) {
                i = (int) (i + pccVar.pcc);
            } else {
                i2 = (int) (i2 + pccVar.pcc);
                z = false;
            }
        }
        if (z && f > i) {
            return arrayList;
        }
        float f2 = i;
        float f3 = f < f2 ? f / f2 : 1.0f;
        float f4 = f > f2 ? (f - f2) / i2 : 0.0f;
        if (f4 > 1.0f) {
            ArrayList arrayList2 = new ArrayList();
            boolean z2 = false;
            for (sf.pcc pccVar2 : arrayList) {
                if (!pccVar2.sf && pccVar2.gm != 0.0f && pccVar2.pcc * f4 > pccVar2.gm) {
                    pccVar2.pcc = pccVar2.gm;
                    pccVar2.sf = true;
                    z2 = true;
                }
                arrayList2.add(pccVar2);
            }
            if (z2) {
                return pcc(f, arrayList2);
            }
        }
        int i3 = 0;
        for (sf.pcc pccVar3 : arrayList) {
            if (pccVar3.sf) {
                pccVar3.pcc = pcc(pccVar3.pcc * f3);
            } else {
                pccVar3.pcc = pcc(pccVar3.pcc * f4);
            }
            i3 = (int) (i3 + pccVar3.pcc);
        }
        float f5 = i3;
        if (f5 < f) {
            float f6 = f - f5;
            for (int i4 = 0; i4 < arrayList.size() && f6 > 0.0f; i4 = (i4 + 1) % arrayList.size()) {
                sf.pcc pccVar4 = (sf.pcc) arrayList.get(i4);
                if ((f < f2 && pccVar4.sf) || (f > f2 && !pccVar4.sf)) {
                    pccVar4.pcc += 0.0625f;
                    f6 -= 0.0625f;
                }
            }
        }
        return arrayList;
    }
}
