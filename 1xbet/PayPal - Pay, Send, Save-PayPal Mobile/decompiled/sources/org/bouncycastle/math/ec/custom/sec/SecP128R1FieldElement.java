package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecP128R1FieldElement extends org.bouncycastle.math.ec.ECFieldElement.AbstractFp {
    public static final java.math.BigInteger Q = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));
    protected int[] x;

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public java.math.BigInteger toBigInteger() {
        return org.bouncycastle.math.raw.Nat128.toBigInteger(this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean testBitZero() {
        return org.bouncycastle.math.raw.Nat128.getBit(this.x, 0) == 1;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement subtract(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat128.create();
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.subtract(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP128R1FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP128R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement square() {
        int[] create = org.bouncycastle.math.raw.Nat128.create();
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.square(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP128R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement sqrt() {
        int[] iArr = this.x;
        if (org.bouncycastle.math.raw.Nat128.isZero(iArr) || org.bouncycastle.math.raw.Nat128.isOne(iArr)) {
            return this;
        }
        int[] create = org.bouncycastle.math.raw.Nat128.create();
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.square(iArr, create);
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.multiply(create, iArr, create);
        int[] create2 = org.bouncycastle.math.raw.Nat128.create();
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.squareN(create, 2, create2);
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.multiply(create2, create, create2);
        int[] create3 = org.bouncycastle.math.raw.Nat128.create();
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.squareN(create2, 4, create3);
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.multiply(create3, create2, create3);
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.squareN(create3, 2, create2);
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.multiply(create2, create, create2);
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.squareN(create2, 10, create);
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.multiply(create, create2, create);
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.squareN(create, 10, create3);
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.multiply(create3, create2, create3);
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.square(create3, create2);
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.multiply(create2, iArr, create2);
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.squareN(create2, 95, create2);
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.square(create2, create3);
        if (org.bouncycastle.math.raw.Nat128.eq(iArr, create3)) {
            return new org.bouncycastle.math.ec.custom.sec.SecP128R1FieldElement(create2);
        }
        return null;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement negate() {
        int[] create = org.bouncycastle.math.raw.Nat128.create();
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.negate(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP128R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement multiply(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat128.create();
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.multiply(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP128R1FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP128R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isZero() {
        return org.bouncycastle.math.raw.Nat128.isZero(this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public boolean isOne() {
        return org.bouncycastle.math.raw.Nat128.isOne(this.x);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement invert() {
        int[] create = org.bouncycastle.math.raw.Nat128.create();
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.inv(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP128R1FieldElement(create);
    }

    public int hashCode() {
        return Q.hashCode() ^ org.bouncycastle.util.Arrays.hashCode(this.x, 0, 4);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public int getFieldSize() {
        return Q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public java.lang.String getFieldName() {
        return "SecP128R1Field";
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof org.bouncycastle.math.ec.custom.sec.SecP128R1FieldElement) {
            return org.bouncycastle.math.raw.Nat128.eq(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP128R1FieldElement) obj).x);
        }
        return false;
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement divide(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat128.create();
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.inv(((org.bouncycastle.math.ec.custom.sec.SecP128R1FieldElement) eCFieldElement).x, create);
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.multiply(create, this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP128R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement addOne() {
        int[] create = org.bouncycastle.math.raw.Nat128.create();
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.addOne(this.x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP128R1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECFieldElement
    public org.bouncycastle.math.ec.ECFieldElement add(org.bouncycastle.math.ec.ECFieldElement eCFieldElement) {
        int[] create = org.bouncycastle.math.raw.Nat128.create();
        org.bouncycastle.math.ec.custom.sec.SecP128R1Field.add(this.x, ((org.bouncycastle.math.ec.custom.sec.SecP128R1FieldElement) eCFieldElement).x, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP128R1FieldElement(create);
    }

    protected SecP128R1FieldElement(int[] iArr) {
        this.x = iArr;
    }

    public SecP128R1FieldElement(java.math.BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(Q) >= 0) {
            throw new java.lang.IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        this.x = org.bouncycastle.math.ec.custom.sec.SecP128R1Field.fromBigInteger(bigInteger);
    }

    public SecP128R1FieldElement() {
        this.x = org.bouncycastle.math.raw.Nat128.create();
    }
}
