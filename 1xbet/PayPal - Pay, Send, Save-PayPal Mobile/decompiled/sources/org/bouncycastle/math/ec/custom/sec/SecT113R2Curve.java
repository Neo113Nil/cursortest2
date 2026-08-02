package org.bouncycastle.math.ec.custom.sec;

/* loaded from: classes17.dex */
public class SecT113R2Curve extends org.bouncycastle.math.ec.ECCurve.AbstractF2m {
    private static final org.bouncycastle.math.ec.ECFieldElement[] getHighSpeedVideoSizes = {new org.bouncycastle.math.ec.custom.sec.SecT113FieldElement(org.bouncycastle.math.ec.ECConstants.ONE)};
    protected org.bouncycastle.math.ec.custom.sec.SecT113R2Point infinity;

    @Override // org.bouncycastle.math.ec.ECCurve
    public int getFieldSize() {
        return 113;
    }

    public int getK1() {
        return 9;
    }

    public int getK2() {
        return 0;
    }

    public int getK3() {
        return 0;
    }

    public int getM() {
        return 113;
    }

    @Override // org.bouncycastle.math.ec.ECCurve.AbstractF2m
    public boolean isKoblitz() {
        return false;
    }

    public boolean isTrinomial() {
        return true;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public boolean supportsCoordinateSystem(int i) {
        return i == 6;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECPoint getInfinity() {
        return this.infinity;
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECFieldElement fromBigInteger(java.math.BigInteger bigInteger) {
        return new org.bouncycastle.math.ec.custom.sec.SecT113FieldElement(bigInteger);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECPoint createRawPoint(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2, org.bouncycastle.math.ec.ECFieldElement[] eCFieldElementArr) {
        return new org.bouncycastle.math.ec.custom.sec.SecT113R2Point(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECPoint createRawPoint(org.bouncycastle.math.ec.ECFieldElement eCFieldElement, org.bouncycastle.math.ec.ECFieldElement eCFieldElement2) {
        return new org.bouncycastle.math.ec.custom.sec.SecT113R2Point(this, eCFieldElement, eCFieldElement2);
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECLookupTable createCacheSafeLookupTable(org.bouncycastle.math.ec.ECPoint[] eCPointArr, int i, final int i2) {
        final long[] jArr = new long[i2 * 4];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            org.bouncycastle.math.ec.ECPoint eCPoint = eCPointArr[i + i4];
            org.bouncycastle.math.raw.Nat128.copy64(((org.bouncycastle.math.ec.custom.sec.SecT113FieldElement) eCPoint.getRawXCoord()).x, 0, jArr, i3);
            org.bouncycastle.math.raw.Nat128.copy64(((org.bouncycastle.math.ec.custom.sec.SecT113FieldElement) eCPoint.getRawYCoord()).x, 0, jArr, i3 + 2);
            i3 += 4;
        }
        return new org.bouncycastle.math.ec.AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.custom.sec.SecT113R2Curve.1
            @Override // org.bouncycastle.math.ec.ECLookupTable
            public org.bouncycastle.math.ec.ECPoint lookup(int i5) {
                long[] create64 = org.bouncycastle.math.raw.Nat128.create64();
                long[] create642 = org.bouncycastle.math.raw.Nat128.create64();
                int i6 = 0;
                for (int i7 = 0; i7 < i2; i7++) {
                    long j = ((i7 ^ i5) - 1) >> 31;
                    for (int i8 = 0; i8 < 2; i8++) {
                        long j2 = create64[i8];
                        long[] jArr2 = jArr;
                        create64[i8] = j2 ^ (jArr2[i6 + i8] & j);
                        create642[i8] = create642[i8] ^ (jArr2[(i6 + 2) + i8] & j);
                    }
                    i6 += 4;
                }
                return org.bouncycastle.math.ec.custom.sec.SecT113R2Curve.this.createRawPoint(new org.bouncycastle.math.ec.custom.sec.SecT113FieldElement(create64), new org.bouncycastle.math.ec.custom.sec.SecT113FieldElement(create642), org.bouncycastle.math.ec.custom.sec.SecT113R2Curve.getHighSpeedVideoSizes);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public org.bouncycastle.math.ec.ECPoint lookupVar(int i5) {
                long[] create64 = org.bouncycastle.math.raw.Nat128.create64();
                long[] create642 = org.bouncycastle.math.raw.Nat128.create64();
                int i6 = i5 * 4;
                for (int i7 = 0; i7 < 2; i7++) {
                    long[] jArr2 = jArr;
                    create64[i7] = jArr2[i6 + i7];
                    create642[i7] = jArr2[2 + i6 + i7];
                }
                return org.bouncycastle.math.ec.custom.sec.SecT113R2Curve.this.createRawPoint(new org.bouncycastle.math.ec.custom.sec.SecT113FieldElement(create64), new org.bouncycastle.math.ec.custom.sec.SecT113FieldElement(create642), org.bouncycastle.math.ec.custom.sec.SecT113R2Curve.getHighSpeedVideoSizes);
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i2;
            }
        };
    }

    @Override // org.bouncycastle.math.ec.ECCurve
    public org.bouncycastle.math.ec.ECCurve cloneCurve() {
        return new org.bouncycastle.math.ec.custom.sec.SecT113R2Curve();
    }

    public SecT113R2Curve() {
        super(113, 9, 0, 0);
        this.infinity = new org.bouncycastle.math.ec.custom.sec.SecT113R2Point(this, null, null);
        this.f7050a = fromBigInteger(new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("00689918DBEC7E5A0DD6DFC0AA55C7")));
        this.b = fromBigInteger(new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("0095E9A9EC9B297BD4BF36E059184F")));
        this.order = new java.math.BigInteger(1, org.bouncycastle.util.encoders.Hex.decodeStrict("010000000000000108789B2496AF93"));
        this.cofactor = java.math.BigInteger.valueOf(2L);
        this.coord = 6;
    }
}
