package com.bytedance.sdk.openadsdk.of;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class nac {
    private final vy pcc;
    private final List<ork> sf;

    public nac(vy vyVar) {
        this.pcc = vyVar;
        ArrayList arrayList = new ArrayList();
        this.sf = arrayList;
        arrayList.add(new ork(vyVar, new int[]{1}));
    }

    private ork pcc(int i) {
        if (i >= this.sf.size()) {
            List<ork> list = this.sf;
            ork orkVar = list.get(list.size() - 1);
            for (int size = this.sf.size(); size <= i; size++) {
                vy vyVar = this.pcc;
                orkVar = orkVar.sf(new ork(vyVar, new int[]{1, vyVar.pcc((size - 1) + vyVar.sf())}));
                this.sf.add(orkVar);
            }
        }
        return this.sf.get(i);
    }

    public void pcc(int[] iArr, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        ork pcc = pcc(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] pcc2 = new ork(this.pcc, iArr2).pcc(i, 1).gm(pcc)[1].pcc();
        int length2 = i - pcc2.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(pcc2, 0, iArr, length + length2, pcc2.length);
    }
}
