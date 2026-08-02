package org.bouncycastle.math.field;

/* loaded from: classes17.dex */
class GF2Polynomial implements org.bouncycastle.math.field.Polynomial {
    protected final int[] Camera2StreamConfigurationMap;

    public int hashCode() {
        return org.bouncycastle.util.Arrays.hashCode(this.Camera2StreamConfigurationMap);
    }

    @Override // org.bouncycastle.math.field.Polynomial
    public int[] getExponentsPresent() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
    }

    @Override // org.bouncycastle.math.field.Polynomial
    public int getDegree() {
        return this.Camera2StreamConfigurationMap[r0.length - 1];
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof org.bouncycastle.math.field.GF2Polynomial) {
            return org.bouncycastle.util.Arrays.areEqual(this.Camera2StreamConfigurationMap, ((org.bouncycastle.math.field.GF2Polynomial) obj).Camera2StreamConfigurationMap);
        }
        return false;
    }

    GF2Polynomial(int[] iArr) {
        this.Camera2StreamConfigurationMap = org.bouncycastle.util.Arrays.clone(iArr);
    }
}
