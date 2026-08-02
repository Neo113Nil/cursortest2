package com.google.android.material.color.utilities;

/* loaded from: classes8.dex */
public final class QuantizerCelebi {
    private QuantizerCelebi() {
    }

    public static java.util.Map<java.lang.Integer, java.lang.Integer> quantize(int[] iArr, int i) {
        java.util.Set<java.lang.Integer> keySet = new com.google.android.material.color.utilities.QuantizerWu().quantize(iArr, i).colorToCount.keySet();
        int[] iArr2 = new int[keySet.size()];
        java.util.Iterator<java.lang.Integer> it = keySet.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            iArr2[i2] = it.next().intValue();
            i2++;
        }
        return com.google.android.material.color.utilities.QuantizerWsmeans.quantize(iArr, iArr2, i);
    }
}
