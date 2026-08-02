package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
final class WOTSPlusSignature {
    byte[][] getHighSpeedVideoFpsRanges;

    protected WOTSPlusSignature(org.bouncycastle.pqc.crypto.xmss.WOTSPlusParameters wOTSPlusParameters, byte[][] bArr) {
        if (wOTSPlusParameters == null) {
            throw new java.lang.NullPointerException("params == null");
        }
        if (bArr == null) {
            throw new java.lang.NullPointerException("signature == null");
        }
        if (org.bouncycastle.pqc.crypto.xmss.XMSSUtil.hasNullPointer(bArr)) {
            throw new java.lang.NullPointerException("signature byte array == null");
        }
        if (bArr.length != wOTSPlusParameters.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalArgumentException("wrong signature size");
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != wOTSPlusParameters.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalArgumentException("wrong signature format");
            }
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(bArr);
    }
}
