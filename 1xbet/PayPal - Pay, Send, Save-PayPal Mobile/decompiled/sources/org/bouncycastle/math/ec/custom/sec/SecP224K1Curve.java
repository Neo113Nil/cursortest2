package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecP224K1Curve extends org.bouncycastle.math.ec.ECCurve.AbstractFp {
    protected org.bouncycastle.math.ec.custom.sec.SecP224K1Point infinity;
    public static final java.math.BigInteger q = org.bouncycastle.math.ec.custom.sec.SecP224K1FieldElement.Q;
    private static final org.bouncycastle.math.ec.ECFieldElement[] getHighSpeedVideoFpsRangesFor = {new org.bouncycastle.math.ec.custom.sec.SecP224K1FieldElement(org.bouncycastle.math.ec.ECConstants.ONE)};

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 2;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECFieldElement randomFieldElementMult(java.security.SecureRandom secureRandom) {
        int[] create = org.bouncycastle.math.raw.Nat224.create();
        org.bouncycastle.math.ec.custom.sec.SecP224K1Field.randomMult(secureRandom, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP224K1FieldElement(create);
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractFp, org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECFieldElement randomFieldElement(java.security.SecureRandom secureRandom) {
        int[] create = org.bouncycastle.math.raw.Nat224.create();
        org.bouncycastle.math.ec.custom.sec.SecP224K1Field.random(secureRandom, create);
        return new org.bouncycastle.math.ec.custom.sec.SecP224K1FieldElement(create);
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
        return new org.bouncycastle.math.ec.custom.sec.SecP224K1FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECPoint createRawPoint(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr) {
        return new org.bouncycastle.math.ec.custom.sec.SecP224K1Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECPoint createRawPoint(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
        return new org.bouncycastle.math.ec.custom.sec.SecP224K1Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECLookupTable createCacheSafeLookupTable(org.bouncycastle.math.ec.ECPoint[] eCPointArr, int i, final int i2) {
        final int[] iArr = new int[i2 * 14];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            org.bouncycastle.math.ec.ECPoint eCPoint = eCPointArr[i + i4];
            org.bouncycastle.math.raw.Nat224.copy(((org.bouncycastle.math.ec.custom.sec.SecP224K1FieldElement) eCPoint.getRawXCoord()).x, 0, iArr, i3);
            org.bouncycastle.math.raw.Nat224.copy(((org.bouncycastle.math.ec.custom.sec.SecP224K1FieldElement) eCPoint.getRawYCoord()).x, 0, iArr, i3 + 7);
            i3 += 14;
        }
        return new org.bouncycastle.math.ec.AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecP224K1Curve.1
            @Override // org.bouncycastle.math.ec.ECLookupTable
            public org.bouncycastle.math.ec.ECPoint lookup(int i5) {
                int[] create = org.bouncycastle.math.raw.Nat224.create();
                int[] create2 = org.bouncycastle.math.raw.Nat224.create();
                int i6 = 0;
                for (int i7 = 0; i7 < i2; i7++) {
                    int i8 = ((i7 ^ i5) - 1) >> 31;
                    for (int i9 = 0; i9 < 7; i9++) {
                        int i10 = create[i9];
                        int[] iArr2 = iArr;
                        create[i9] = i10 ^ (iArr2[i6 + i9] & i8);
                        create2[i9] = create2[i9] ^ (iArr2[(i6 + 7) + i9] & i8);
                    }
                    i6 += 14;
                }
                return org.bouncycastle.math.ec.custom.sec.SecP224K1Curve.this.createRawPoint(new org.bouncycastle.math.ec.custom.sec.SecP224K1FieldElement(create), new org.bouncycastle.math.ec.custom.sec.SecP224K1FieldElement(create2), org.bouncycastle.math.ec.custom.sec.SecP224K1Curve.getHighSpeedVideoFpsRangesFor);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public org.bouncycastle.math.ec.ECPoint lookupVar(int i5) {
                int[] create = org.bouncycastle.math.raw.Nat224.create();
                int[] create2 = org.bouncycastle.math.raw.Nat224.create();
                int i6 = 0;
                for (int i7 = 0; i7 < i2; i7++) {
                    int i8 = ((i7 ^ i5) - 1) >> 31;
                    for (int i9 = 0; i9 < 7; i9++) {
                        int i10 = create[i9];
                        int[] iArr2 = iArr;
                        create[i9] = i10 ^ (iArr2[i6 + i9] & i8);
                        create2[i9] = create2[i9] ^ (iArr2[(i6 + 7) + i9] & i8);
                    }
                    i6 += 14;
                }
                return org.bouncycastle.math.ec.custom.sec.SecP224K1Curve.this.createRawPoint(new org.bouncycastle.math.ec.custom.sec.SecP224K1FieldElement(create), new org.bouncycastle.math.ec.custom.sec.SecP224K1FieldElement(create2), org.bouncycastle.math.ec.custom.sec.SecP224K1Curve.getHighSpeedVideoFpsRangesFor);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i2;
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECCurve cloneCurve() {
        return new org.bouncycastle.math.ec.custom.sec.SecP224K1Curve();
    }

    public SecP224K1Curve() {
        super(q);
        this.infinity = new org.bouncycastle.math.ec.custom.sec.SecP224K1Point(this, null, null);
        this.f7050a = fromBigInteger(org.bouncycastle.math.ec.ECConstants.ZERO);
        this.b = fromBigInteger(java.math.BigInteger.valueOf(5L));
        this.order = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.cofactor = java.math.BigInteger.valueOf(1L);
        this.coord = 2;
    }
}
