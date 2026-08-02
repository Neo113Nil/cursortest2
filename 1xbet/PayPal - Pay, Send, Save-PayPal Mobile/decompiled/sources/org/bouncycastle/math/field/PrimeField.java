package org.bouncycastle.math.field;

/* loaded from: classes17.dex */
class PrimeField implements org.bouncycastle.math.field.FiniteField {
    protected final java.math.BigInteger getHighSpeedVideoSizes;

    @Override // org.bouncycastle.math.field.FiniteField
    public int getDimension() {
        return 1;
    }

    public int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }

    @Override // org.bouncycastle.math.field.FiniteField
    public java.math.BigInteger getCharacteristic() {
        return this.getHighSpeedVideoSizes;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof org.bouncycastle.math.field.PrimeField) {
            return this.getHighSpeedVideoSizes.equals(((org.bouncycastle.math.field.PrimeField) obj).getHighSpeedVideoSizes);
        }
        return false;
    }

    PrimeField(java.math.BigInteger bigInteger) {
        this.getHighSpeedVideoSizes = bigInteger;
    }
}
