package org.bouncycastle.math.ec.custom.gm;

/* loaded from: classes17.dex */
public class SM2P256V1FieldElement extends org.bouncycastle.math.ec.ECFieldElement.AbstractFp {
    public static final java.math.BigInteger Q = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"));
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
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.subtract(this.x, ((org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement square() {
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.square(this.x, create);
        return new org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement sqrt() {
        int[] iArr = this.x;
        if (org.bouncycastle.math.raw.Nat256.isZero(iArr) || org.bouncycastle.math.raw.Nat256.isOne(iArr)) {
            return this;
        }
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.square(iArr, create);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.multiply(create, iArr, create);
        int[] create2 = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.squareN(create, 2, create2);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.multiply(create2, create, create2);
        int[] create3 = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.squareN(create2, 2, create3);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.multiply(create3, create, create3);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.squareN(create3, 6, create);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.multiply(create, create3, create);
        int[] create4 = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.squareN(create, 12, create4);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.multiply(create4, create, create4);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.squareN(create4, 6, create);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.multiply(create, create3, create);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.square(create, create3);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.multiply(create3, iArr, create3);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.squareN(create3, 31, create4);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.multiply(create4, create3, create);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.squareN(create4, 32, create4);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.multiply(create4, create, create4);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.squareN(create4, 62, create4);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.multiply(create4, create, create4);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.squareN(create4, 4, create4);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.multiply(create4, create2, create4);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.squareN(create4, 32, create4);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.multiply(create4, iArr, create4);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.squareN(create4, 62, create4);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.square(create4, create2);
        if (org.bouncycastle.math.raw.Nat256.eq(iArr, create2)) {
            return new org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement(create4);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement negate() {
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.negate(this.x, create);
        return new org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement multiply(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.multiply(this.x, ((org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement(create);
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
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.inv(this.x, create);
        return new org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement(create);
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
        return "SM2P256V1Field";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement) {
            return org.bouncycastle.math.raw.Nat256.eq(this.x, ((org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement) obj).x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement divide(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.inv(((org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement) eCFieldElement).x, create);
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.multiply(create, this.x, create);
        return new org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement addOne() {
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.addOne(this.x, create);
        return new org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement add(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.add(this.x, ((org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.gm.SM2P256V1FieldElement(create);
    }

    protected SM2P256V1FieldElement(int[] iArr) {
        this.x = iArr;
    }

    public SM2P256V1FieldElement(java.math.BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new java.lang.IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        this.x = org.bouncycastle.math.ec.custom.gm.SM2P256V1Field.fromBigInteger(bigInteger);
    }

    public SM2P256V1FieldElement() {
        this.x = org.bouncycastle.math.raw.Nat256.create();
    }
}
