package com.google.android.material.color.utilities;

/* loaded from: classes8.dex */
public final class QuantizerMap implements com.google.android.material.color.utilities.Quantizer {
    java.util.Map<java.lang.Integer, java.lang.Integer> colorToCount;

    @Override // com.google.android.material.color.utilities.Quantizer
    public final com.google.android.material.color.utilities.QuantizerResult quantize(int[] iArr, int i) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (int i2 : iArr) {
            java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(java.lang.Integer.valueOf(i2));
            int i3 = 1;
            if (num != null) {
                i3 = 1 + num.intValue();
            }
            linkedHashMap.put(java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3));
        }
        this.colorToCount = linkedHashMap;
        return new com.google.android.material.color.utilities.QuantizerResult(linkedHashMap);
    }

    public final java.util.Map<java.lang.Integer, java.lang.Integer> getColorToCount() {
        return this.colorToCount;
    }
}
