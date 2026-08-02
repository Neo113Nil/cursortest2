package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecP384R1FieldElement extends org.bouncycastle.math.ec.ECFieldElement.AbstractFp {
    public static final java.math.BigInteger Q = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF"));
    protected int[] x;

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public java.math.BigInteger toBigInteger() {
        return org.bouncycastle.math.raw.Nat.toBigInteger(12, this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return org.bouncycastle.math.raw.Nat.getBit(this.x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement subtract(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat.create(12);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.subtract(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement square() {
        int[] create = org.bouncycastle.math.raw.Nat.create(12);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.square(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement sqrt() {
        int[] iArr = this.x;
        if (org.bouncycastle.math.raw.Nat.isZero(12, iArr) || org.bouncycastle.math.raw.Nat.isOne(12, iArr)) {
            return this;
        }
        int[] create = org.bouncycastle.math.raw.Nat.create(12);
        int[] create2 = org.bouncycastle.math.raw.Nat.create(12);
        int[] create3 = org.bouncycastle.math.raw.Nat.create(12);
        int[] create4 = org.bouncycastle.math.raw.Nat.create(12);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.square(iArr, create);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create, iArr, create);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.squareN(create, 2, create2);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create2, create, create2);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.square(create2, create2);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create2, iArr, create2);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.squareN(create2, 5, create3);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create3, create2, create3);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.squareN(create3, 5, create4);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create4, create2, create4);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.squareN(create4, 15, create2);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create2, create4, create2);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.squareN(create2, 2, create3);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create, create3, create);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.squareN(create3, 28, create3);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create2, create3, create2);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.squareN(create2, 60, create3);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create3, create2, create3);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.squareN(create3, 120, create2);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create2, create3, create2);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.squareN(create2, 15, create2);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create2, create4, create2);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.squareN(create2, 33, create2);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create2, create, create2);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.squareN(create2, 64, create2);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create2, iArr, create2);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.squareN(create2, 30, create);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.square(create, create2);
        if (org.bouncycastle.math.raw.Nat.eq(12, iArr, create2)) {
            return new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(create);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement negate() {
        int[] create = org.bouncycastle.math.raw.Nat.create(12);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.negate(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement multiply(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat.create(12);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return org.bouncycastle.math.raw.Nat.isZero(12, this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return org.bouncycastle.math.raw.Nat.isOne(12, this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement invert() {
        int[] create = org.bouncycastle.math.raw.Nat.create(12);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.inv(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(create);
    }

    public int hashCode() {
        return Q.hashCode() ^ org.bouncycastle.util.Arrays.hashCode(this.x, 0, 12);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public java.lang.String getFieldName() {
        return "SecP384R1Field";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement) {
            return org.bouncycastle.math.raw.Nat.eq(12, this.x, ((org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement) obj).x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement divide(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat.create(12);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.inv(((org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement) eCFieldElement).x, create);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.multiply(create, this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement addOne() {
        int[] create = org.bouncycastle.math.raw.Nat.create(12);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.addOne(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement add(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat.create(12);
        org.bouncycastle.math.ec.custom.sec.SecP384R1Field.add(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP384R1FieldElement(create);
    }

    protected SecP384R1FieldElement(int[] iArr) {
        this.x = iArr;
    }

    public SecP384R1FieldElement(java.math.BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new java.lang.IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        this.x = org.bouncycastle.math.ec.custom.sec.SecP384R1Field.fromBigInteger(bigInteger);
    }

    public SecP384R1FieldElement() {
        this.x = org.bouncycastle.math.raw.Nat.create(12);
    }
}
