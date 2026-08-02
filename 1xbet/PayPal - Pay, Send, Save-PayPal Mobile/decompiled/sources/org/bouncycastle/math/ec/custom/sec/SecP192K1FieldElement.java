package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecP192K1FieldElement extends org.bouncycastle.math.ec.ECFieldElement.AbstractFp {
    public static final java.math.BigInteger Q = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));
    protected int[] x;

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public java.math.BigInteger toBigInteger() {
        return org.bouncycastle.math.raw.Nat192.toBigInteger(this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return org.bouncycastle.math.raw.Nat192.getBit(this.x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement subtract(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat192.create();
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.subtract(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP192K1FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP192K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement square() {
        int[] create = org.bouncycastle.math.raw.Nat192.create();
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.square(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP192K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement sqrt() {
        int[] iArr = this.x;
        if (org.bouncycastle.math.raw.Nat192.isZero(iArr) || org.bouncycastle.math.raw.Nat192.isOne(iArr)) {
            return this;
        }
        int[] create = org.bouncycastle.math.raw.Nat192.create();
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.square(iArr, create);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.multiply(create, iArr, create);
        int[] create2 = org.bouncycastle.math.raw.Nat192.create();
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.square(create, create2);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.multiply(create2, iArr, create2);
        int[] create3 = org.bouncycastle.math.raw.Nat192.create();
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.squareN(create2, 3, create3);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.multiply(create3, create2, create3);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.squareN(create3, 2, create3);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.multiply(create3, create, create3);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.squareN(create3, 8, create);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.multiply(create, create3, create);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.squareN(create, 3, create3);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.multiply(create3, create2, create3);
        int[] create4 = org.bouncycastle.math.raw.Nat192.create();
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.squareN(create3, 16, create4);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.multiply(create4, create, create4);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.squareN(create4, 35, create);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.multiply(create, create4, create);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.squareN(create, 70, create4);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.multiply(create4, create, create4);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.squareN(create4, 19, create);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.multiply(create, create3, create);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.squareN(create, 20, create);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.multiply(create, create3, create);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.squareN(create, 4, create);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.multiply(create, create2, create);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.squareN(create, 6, create);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.multiply(create, create2, create);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.square(create, create);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.square(create, create2);
        if (org.bouncycastle.math.raw.Nat192.eq(iArr, create2)) {
            return new org.bouncycastle.math.ec.custom.sec.SecP192K1FieldElement(create);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement negate() {
        int[] create = org.bouncycastle.math.raw.Nat192.create();
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.negate(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP192K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement multiply(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat192.create();
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.multiply(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP192K1FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP192K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return org.bouncycastle.math.raw.Nat192.isZero(this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return org.bouncycastle.math.raw.Nat192.isOne(this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement invert() {
        int[] create = org.bouncycastle.math.raw.Nat192.create();
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.inv(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP192K1FieldElement(create);
    }

    public int hashCode() {
        return Q.hashCode() ^ org.bouncycastle.util.Arrays.hashCode(this.x, 0, 6);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public java.lang.String getFieldName() {
        return "SecP192K1Field";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.math.ec.custom.sec.SecP192K1FieldElement) {
            return org.bouncycastle.math.raw.Nat192.eq(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP192K1FieldElement) obj).x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement divide(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat192.create();
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.inv(((org.bouncycastle.math.ec.custom.sec.SecP192K1FieldElement) eCFieldElement).x, create);
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.multiply(create, this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP192K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement addOne() {
        int[] create = org.bouncycastle.math.raw.Nat192.create();
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.addOne(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP192K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement add(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat192.create();
        org.bouncycastle.math.ec.custom.sec.SecP192K1Field.add(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP192K1FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP192K1FieldElement(create);
    }

    protected SecP192K1FieldElement(int[] iArr) {
        this.x = iArr;
    }

    public SecP192K1FieldElement(java.math.BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new java.lang.IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        this.x = org.bouncycastle.math.ec.custom.sec.SecP192K1Field.fromBigInteger(bigInteger);
    }

    public SecP192K1FieldElement() {
        this.x = org.bouncycastle.math.raw.Nat192.create();
    }
}
