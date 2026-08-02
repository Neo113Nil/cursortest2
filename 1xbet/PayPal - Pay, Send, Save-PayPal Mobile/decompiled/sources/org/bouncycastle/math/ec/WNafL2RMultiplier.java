package org.bouncycastle.math.ec;

/* loaded from: classes17.dex */
public class WNafL2RMultiplier extends org.bouncycastle.math.ec.AbstractECMultiplier {
    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    protected org.bouncycastle.math.ec.ECPoint multiplyPositive(org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger) {
        org.bouncycastle.math.ec.ECPoint eCPoint2;
        org.bouncycastle.math.ec.WNafPreCompInfo precompute = org.bouncycastle.math.ec.WNafUtil.precompute(eCPoint, org.bouncycastle.math.ec.WNafUtil.getWindowSize(bigInteger.bitLength()), true);
        org.bouncycastle.math.ec.ECPoint[] preComp = precompute.getPreComp();
        org.bouncycastle.math.ec.ECPoint[] preCompNeg = precompute.getPreCompNeg();
        int width = precompute.getWidth();
        int[] generateCompactWindowNaf = org.bouncycastle.math.ec.WNafUtil.generateCompactWindowNaf(width, bigInteger);
        org.bouncycastle.math.ec.ECPoint infinity = eCPoint.getCurve().getInfinity();
        int length = generateCompactWindowNaf.length;
        if (length > 1) {
            length--;
            int i = generateCompactWindowNaf[length];
            int i2 = i >> 16;
            int i3 = i & 65535;
            int abs = java.lang.Math.abs(i2);
            org.bouncycastle.math.ec.ECPoint[] eCPointArr = i2 < 0 ? preCompNeg : preComp;
            if ((abs << 2) < (1 << width)) {
                int numberOfLeadingZeros = org.bouncycastle.util.Integers.numberOfLeadingZeros(abs);
                int i4 = width - (32 - numberOfLeadingZeros);
                eCPoint2 = eCPointArr[((1 << (width - 1)) - 1) >>> 1].add(eCPointArr[(((abs ^ (1 << (31 - numberOfLeadingZeros))) << i4) + 1) >>> 1]);
                i3 -= i4;
            } else {
                eCPoint2 = eCPointArr[abs >>> 1];
            }
            infinity = eCPoint2.timesPow2(i3);
        }
        while (length > 0) {
            length--;
            int i5 = generateCompactWindowNaf[length];
            int i6 = i5 >> 16;
            infinity = infinity.twicePlus((i6 < 0 ? preCompNeg : preComp)[java.lang.Math.abs(i6) >>> 1]).timesPow2(i5 & 65535);
        }
        return infinity;
    }
}
