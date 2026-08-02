package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecP256K1FieldElement extends org.bouncycastle.math.ec.ECFieldElement.AbstractFp {
    public static final java.math.BigInteger Q = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));
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
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.subtract(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP256K1FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP256K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement square() {
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.square(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP256K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement sqrt() {
        int[] iArr = this.x;
        if (org.bouncycastle.math.raw.Nat256.isZero(iArr) || org.bouncycastle.math.raw.Nat256.isOne(iArr)) {
            return this;
        }
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.square(iArr, create);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.multiply(create, iArr, create);
        int[] create2 = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.square(create, create2);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.multiply(create2, iArr, create2);
        int[] create3 = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.squareN(create2, 3, create3);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.multiply(create3, create2, create3);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.squareN(create3, 3, create3);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.multiply(create3, create2, create3);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.squareN(create3, 2, create3);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.multiply(create3, create, create3);
        int[] create4 = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.squareN(create3, 11, create4);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.multiply(create4, create3, create4);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.squareN(create4, 22, create3);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.multiply(create3, create4, create3);
        int[] create5 = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.squareN(create3, 44, create5);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.multiply(create5, create3, create5);
        int[] create6 = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.squareN(create5, 88, create6);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.multiply(create6, create5, create6);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.squareN(create6, 44, create5);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.multiply(create5, create3, create5);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.squareN(create5, 3, create3);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.multiply(create3, create2, create3);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.squareN(create3, 23, create3);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.multiply(create3, create4, create3);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.squareN(create3, 6, create3);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.multiply(create3, create, create3);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.squareN(create3, 2, create3);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.square(create3, create);
        if (org.bouncycastle.math.raw.Nat256.eq(iArr, create)) {
            return new org.bouncycastle.math.ec.custom.sec.SecP256K1FieldElement(create3);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement negate() {
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.negate(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP256K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement multiply(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.multiply(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP256K1FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP256K1FieldElement(create);
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
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.inv(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP256K1FieldElement(create);
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
        return "SecP256K1Field";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.math.ec.custom.sec.SecP256K1FieldElement) {
            return org.bouncycastle.math.raw.Nat256.eq(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP256K1FieldElement) obj).x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement divide(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.inv(((org.bouncycastle.math.ec.custom.sec.SecP256K1FieldElement) eCFieldElement).x, create);
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.multiply(create, this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP256K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement addOne() {
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.addOne(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP256K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement add(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat256.create();
        org.bouncycastle.math.ec.custom.sec.SecP256K1Field.add(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP256K1FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP256K1FieldElement(create);
    }

    protected SecP256K1FieldElement(int[] iArr) {
        this.x = iArr;
    }

    public SecP256K1FieldElement(java.math.BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new java.lang.IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.x = org.bouncycastle.math.ec.custom.sec.SecP256K1Field.fromBigInteger(bigInteger);
    }

    public SecP256K1FieldElement() {
        this.x = org.bouncycastle.math.raw.Nat256.create();
    }
}
