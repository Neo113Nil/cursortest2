package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
final class WOTSPlusPublicKeyParameters {
    final byte[][] Camera2StreamConfigurationMap;

    protected WOTSPlusPublicKeyParameters(org.bouncycastle.pqc.crypto.xmss.WOTSPlusParameters wOTSPlusParameters, byte[][] bArr) {
        if (wOTSPlusParameters == null) {
            throw new java.lang.NullPointerException("params == null");
        }
        if (org.bouncycastle.pqc.crypto.xmss.XMSSUtil.hasNullPointer(bArr)) {
            throw new java.lang.NullPointerException("publicKey byte array == null");
        }
        if (bArr.length != wOTSPlusParameters.getHighSpeedVideoFpsRangesFor) {
            throw new java.lang.IllegalArgumentException("wrong publicKey size");
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != wOTSPlusParameters.getHighSpeedVideoSizes) {
                throw new java.lang.IllegalArgumentException("wrong publicKey format");
            }
        }
        this.Camera2StreamConfigurationMap = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.cloneArray(bArr);
    }
}
