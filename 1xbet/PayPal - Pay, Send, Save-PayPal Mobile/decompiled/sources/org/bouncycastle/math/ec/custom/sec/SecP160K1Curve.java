package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecP160K1Curve extends org.bouncycastle.math.ec.ECCurve.AbstractFp {
    protected org.bouncycastle.math.ec.custom.sec.SecP160K1Point infinity;
    public static final java.math.BigInteger q = org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement.Q;
    private static final org.bouncycastle.math.ec.ECFieldElement[] getHighSpeedVideoFpsRanges = {new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(org.bouncycastle.math.ec.ECConstants.ONE)};

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECFieldElement randomFieldElementMult(java.security.SecureRandom secureRandom) {
        int[] create = org.bouncycastle.math.raw.Nat160.create();
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.randomMult(secureRandom, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECFieldElement randomFieldElement(java.security.SecureRandom secureRandom) {
        int[] create = org.bouncycastle.math.raw.Nat160.create();
        org.bouncycastle.math.ec.custom.sec.SecP160R2Field.random(secureRandom, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(create);
    }

    public java.math.BigInteger getQ() {
        return q;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECPoint getInfinity() {
        return this.infinity;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return q.bitLength();
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECFieldElement fromBigInteger(java.math.BigInteger bigInteger) {
        return new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECPoint createRawPoint(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr) {
        return new org.bouncycastle.math.ec.custom.sec.SecP160K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECPoint createRawPoint(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
        return new org.bouncycastle.math.ec.custom.sec.SecP160K1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECLookupTable createCacheSafeLookupTable(org.bouncycastle.math.ec.ECPoint[] eCPointArr, int i, final int i2) {
        final int[] iArr = new int[i2 * 10];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            org.bouncycastle.math.ec.ECPoint eCPoint = eCPointArr[i + i4];
            org.bouncycastle.math.raw.Nat160.copy(((org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement) eCPoint.getRawXCoord()).x, 0, iArr, i3);
            org.bouncycastle.math.raw.Nat160.copy(((org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement) eCPoint.getRawYCoord()).x, 0, iArr, i3 + 5);
            i3 += 10;
        }
        return new org.bouncycastle.math.ec.AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecP160K1Curve.1
            @Override // org.bouncycastle.math.ec.ECLookupTable
            public org.bouncycastle.math.ec.ECPoint lookup(int i5) {
                int[] create = org.bouncycastle.math.raw.Nat160.create();
                int[] create2 = org.bouncycastle.math.raw.Nat160.create();
                int i6 = 0;
                for (int i7 = 0; i7 < i2; i7++) {
                    int i8 = ((i7 ^ i5) - 1) >> 31;
                    for (int i9 = 0; i9 < 5; i9++) {
                        int i10 = create[i9];
                        int[] iArr2 = iArr;
                        create[i9] = i10 ^ (iArr2[i6 + i9] & i8);
                        create2[i9] = create2[i9] ^ (iArr2[(i6 + 5) + i9] & i8);
                    }
                    i6 += 10;
                }
                return org.bouncycastle.math.ec.custom.sec.SecP160K1Curve.this.createRawPoint(new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(create), new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(create2), org.bouncycastle.math.ec.custom.sec.SecP160K1Curve.getHighSpeedVideoFpsRanges);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public org.bouncycastle.math.ec.ECPoint lookupVar(int i5) {
                int[] create = org.bouncycastle.math.raw.Nat160.create();
                int[] create2 = org.bouncycastle.math.raw.Nat160.create();
                int i6 = i5 * 10;
                for (int i7 = 0; i7 < 5; i7++) {
                    int[] iArr2 = iArr;
                    create[i7] = iArr2[i6 + i7];
                    create2[i7] = iArr2[5 + i6 + i7];
                }
                return org.bouncycastle.math.ec.custom.sec.SecP160K1Curve.this.createRawPoint(new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(create), new org.bouncycastle.math.ec.custom.sec.SecP160R2FieldElement(create2), org.bouncycastle.math.ec.custom.sec.SecP160K1Curve.getHighSpeedVideoFpsRanges);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i2;
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECCurve cloneCurve() {
        return new org.bouncycastle.math.ec.custom.sec.SecP160K1Curve();
    }

    public SecP160K1Curve() {
        super(q);
        this.infinity = new org.bouncycastle.math.ec.custom.sec.SecP160K1Point(this, null, null);
        this.f7050a = fromBigInteger(org.bouncycastle.math.ec.ECConstants.ZERO);
        this.b = fromBigInteger(java.math.BigInteger.valueOf(7L));
        this.order = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("0100000000000000000001B8FA16DFAB9ACA16B6B3"));
        this.cofactor = java.math.BigInteger.valueOf(1L);
        this.coord = 2;
    }
}
