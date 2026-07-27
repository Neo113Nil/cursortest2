package com.bytedance.sdk.openadsdk.of;

import java.util.Map;

/* loaded from: classes4.dex */
public final class dax {
    public sf pcc(String str, int i, int i2, Map<wh, ?> map) throws lo {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        }
        kj kjVar = kj.L;
        int i3 = 4;
        if (map != null) {
            if (map.containsKey(wh.ERROR_CORRECTION)) {
                kjVar = kj.valueOf(map.get(wh.ERROR_CORRECTION).toString());
            }
            if (map.containsKey(wh.MARGIN)) {
                i3 = Integer.parseInt(map.get(wh.MARGIN).toString());
            }
        }
        return pcc(qf.pcc(str, kjVar, map), i, i2, i3);
    }

    private static sf pcc(jr jrVar, int i, int i2, int i3) {
        gm pcc = jrVar.pcc();
        if (pcc == null) {
            throw new IllegalStateException();
        }
        int sf = pcc.sf();
        int pcc2 = pcc.pcc();
        int i4 = i3 * 2;
        int i5 = sf + i4;
        int i6 = i4 + pcc2;
        int max = Math.max(i, i5);
        int max2 = Math.max(i2, i6);
        int min = Math.min(max / i5, max2 / i6);
        int i7 = (max - (sf * min)) / 2;
        int i8 = (max2 - (pcc2 * min)) / 2;
        sf sfVar = new sf(max, max2);
        int i9 = 0;
        while (i9 < pcc2) {
            int i10 = 0;
            int i11 = i7;
            while (i10 < sf) {
                if (pcc.pcc(i10, i9) == 1) {
                    sfVar.pcc(i11, i8, min, min);
                }
                i10++;
                i11 += min;
            }
            i9++;
            i8 += min;
        }
        return sfVar;
    }
}
