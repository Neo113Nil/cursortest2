package org.bouncycastle.math.ec.custom.djb;

/* loaded from: classes17.dex */
public class Curve25519FieldElement extends org.bouncycastle.math.ec.ECFieldElement.AbstractFp {
    public static final java.math.BigInteger Q = org.bouncycastle.math.raw.Nat256.toBigInteger(org.bouncycastle.math.ec.custom.djb.Curve25519Field.getHighSpeedVideoSizes);
    private static final int[] getHighSpeedVideoFpsRanges = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};
    protected int[] x;

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public java.math.BigInteger toBigInteger() {
        return org.bouncycastle.math.raw.Nat256.toBigInteger(this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return org.bouncycastle.math.raw.Nat256.getBit(this.x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement subtract(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.subtract(this.x, ((org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement square() {
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.square(this.x, create);
        return new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement sqrt() {
        int[] iArr = this.x;
        if (org.bouncycastle.math.raw.Nat256.isZero(iArr) || org.bouncycastle.math.raw.Nat256.isOne(iArr)) {
            return this;
        }
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.square(iArr, create);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create, iArr, create);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.square(create, create);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create, iArr, create);
        int[] create2 = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.square(create, create2);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create2, iArr, create2);
        int[] create3 = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.squareN(create2, 3, create3);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create3, create, create3);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.squareN(create3, 4, create);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create, create2, create);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.squareN(create, 4, create3);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create3, create2, create3);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.squareN(create3, 15, create2);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create2, create3, create2);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.squareN(create2, 30, create3);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create3, create2, create3);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.squareN(create3, 60, create2);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create2, create3, create2);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.squareN(create2, 11, create3);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create3, create, create3);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.squareN(create3, 120, create);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create, create2, create);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.square(create, create);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.square(create, create2);
        if (org.bouncycastle.math.raw.Nat256.eq(iArr, create2)) {
            return new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create);
        }
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create, getHighSpeedVideoFpsRanges, create);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.square(create, create2);
        if (org.bouncycastle.math.raw.Nat256.eq(iArr, create2)) {
            return new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement negate() {
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.negate(this.x, create);
        return new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement multiply(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(this.x, ((org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return org.bouncycastle.math.raw.Nat256.isZero(this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return org.bouncycastle.math.raw.Nat256.isOne(this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement invert() {
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.inv(this.x, create);
        return new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create);
    }

    public int hashCode() {
        return Q.hashCode() ^ org.bouncycastle.util.Arrays.hashCode(this.x, 0, 8);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public java.lang.String getFieldName() {
        return "Curve25519Field";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement) {
            return org.bouncycastle.math.raw.Nat256.eq(this.x, ((org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement) obj).x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement divide(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.inv(((org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement) eCFieldElement).x, create);
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.multiply(create, this.x, create);
        return new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement addOne() {
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.addOne(this.x, create);
        return new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement add(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.djb.Curve25519Field.add(this.x, ((org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.djb.Curve25519FieldElement(create);
    }

    protected Curve25519FieldElement(int[] iArr) {
        this.x = iArr;
    }

    public Curve25519FieldElement(java.math.BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new java.lang.IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        this.x = org.bouncycastle.math.ec.custom.djb.Curve25519Field.fromBigInteger(bigInteger);
    }

    public Curve25519FieldElement() {
        this.x = org.bouncycastle.math.raw.Nat256.create();
    }
}
