package org.bouncycastle.math.ec;

/* loaded from: classes17.dex */
public class FixedPointCombMultiplier extends org.bouncycastle.math.ec.AbstractECMultiplier {
    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    protected org.bouncycastle.math.ec.ECPoint multiplyPositive(org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger) {
        org.bouncycastle.math.ec.ECCurve curve = eCPoint.getCurve();
        if (bigInteger.bitLength() > org.bouncycastle.math.ec.FixedPointUtil.getCombSize(curve)) {
            throw new java.lang.IllegalStateException("fixed-point comb doesn't support scalars larger than the curve order");
        }
        org.bouncycastle.math.ec.FixedPointPreCompInfo precompute = org.bouncycastle.math.ec.FixedPointUtil.precompute(eCPoint);
        org.bouncycastle.math.ec.ECLookupTable lookupTable = precompute.getLookupTable();
        int width = precompute.getWidth();
        int i = ((r1 + width) - 1) / width;
        org.bouncycastle.math.ec.ECPoint infinity = curve.getInfinity();
        int i2 = width * i;
        int[] fromBigInteger = org.bouncycastle.math.raw.Nat.fromBigInteger(i2, bigInteger);
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 0;
            for (int i5 = (i2 - 1) - i3; i5 >= 0; i5 -= i) {
                int i6 = fromBigInteger[i5 >>> 5] >>> (i5 & 31);
                i4 = ((i4 ^ (i6 >>> 1)) << 1) ^ i6;
            }
            infinity = infinity.twicePlus(lookupTable.lookup(i4));
        }
        return infinity.add(precompute.getOffset());
    }
}
