package org.bouncycastle.math.ec;

/* loaded from: classes17.dex */
public class WTauNafMultiplier extends org.bouncycastle.math.ec.AbstractECMultiplier {
    @Override // org.bouncycastle.math.ec.AbstractECMultiplier
    protected org.bouncycastle.math.ec.ECPoint multiplyPositive(org.bouncycastle.math.ec.ECPoint eCPoint, java.math.BigInteger bigInteger) {
        if (!(eCPoint instanceof org.bouncycastle.math.ec.ECPoint.AbstractF2m)) {
            throw new java.lang.IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
        }
        final org.bouncycastle.math.ec.ECPoint.AbstractF2m abstractF2m = (org.bouncycastle.math.ec.ECPoint.AbstractF2m) eCPoint;
        org.bouncycastle.math.ec.ECCurve.AbstractF2m abstractF2m2 = (org.bouncycastle.math.ec.ECCurve.AbstractF2m) abstractF2m.getCurve();
        int fieldSize = abstractF2m2.getFieldSize();
        byte byteValue = abstractF2m2.getA().toBigInteger().byteValue();
        byte highSpeedVideoFpsRanges = org.bouncycastle.math.ec.Tnaf.getHighSpeedVideoFpsRanges(byteValue);
        byte[] Camera2StreamConfigurationMap = org.bouncycastle.math.ec.Tnaf.Camera2StreamConfigurationMap(highSpeedVideoFpsRanges, org.bouncycastle.math.ec.Tnaf.getHighResolutionOutputSizeshNQ4ISI(bigInteger, fieldSize, byteValue, abstractF2m2.getHighSpeedVideoFpsRanges(), highSpeedVideoFpsRanges), (byte) 4, java.math.BigInteger.valueOf(16L), org.bouncycastle.math.ec.Tnaf.Camera2StreamConfigurationMap(highSpeedVideoFpsRanges), byteValue == 0 ? org.bouncycastle.math.ec.Tnaf.Camera2StreamConfigurationMap : org.bouncycastle.math.ec.Tnaf.getHighSpeedVideoSizes);
        org.bouncycastle.math.ec.ECCurve.AbstractF2m abstractF2m3 = (org.bouncycastle.math.ec.ECCurve.AbstractF2m) abstractF2m.getCurve();
        final byte byteValue2 = abstractF2m3.getA().toBigInteger().byteValue();
        org.bouncycastle.math.ec.ECPoint.AbstractF2m[] preComp = ((org.bouncycastle.math.ec.WTauNafPreCompInfo) abstractF2m3.precompute(abstractF2m, "bc_wtnaf", new org.bouncycastle.math.ec.PreCompCallback() { // from class: org.bouncycastle.math.ec.WTauNafMultiplier.1
            @Override // org.bouncycastle.math.ec.PreCompCallback
            public final org.bouncycastle.math.ec.PreCompInfo precompute(org.bouncycastle.math.ec.PreCompInfo preCompInfo) {
                if (preCompInfo instanceof org.bouncycastle.math.ec.WTauNafPreCompInfo) {
                    return preCompInfo;
                }
                org.bouncycastle.math.ec.WTauNafPreCompInfo wTauNafPreCompInfo = new org.bouncycastle.math.ec.WTauNafPreCompInfo();
                wTauNafPreCompInfo.setPreComp(org.bouncycastle.math.ec.Tnaf.getHighSpeedVideoSizes(org.bouncycastle.math.ec.ECPoint.AbstractF2m.this, byteValue2));
                return wTauNafPreCompInfo;
            }
        })).getPreComp();
        org.bouncycastle.math.ec.ECPoint.AbstractF2m[] abstractF2mArr = new org.bouncycastle.math.ec.ECPoint.AbstractF2m[preComp.length];
        for (int i = 0; i < preComp.length; i++) {
            abstractF2mArr[i] = (org.bouncycastle.math.ec.ECPoint.AbstractF2m) preComp[i].negate();
        }
        org.bouncycastle.math.ec.ECPoint.AbstractF2m abstractF2m4 = (org.bouncycastle.math.ec.ECPoint.AbstractF2m) abstractF2m.getCurve().getInfinity();
        int i2 = 0;
        for (int length = Camera2StreamConfigurationMap.length - 1; length >= 0; length--) {
            i2++;
            byte b = Camera2StreamConfigurationMap[length];
            if (b != 0) {
                abstractF2m4 = (org.bouncycastle.math.ec.ECPoint.AbstractF2m) abstractF2m4.tauPow(i2).add(b > 0 ? preComp[b >>> 1] : abstractF2mArr[(-b) >>> 1]);
                i2 = 0;
            }
        }
        return i2 > 0 ? abstractF2m4.tauPow(i2) : abstractF2m4;
    }
}
