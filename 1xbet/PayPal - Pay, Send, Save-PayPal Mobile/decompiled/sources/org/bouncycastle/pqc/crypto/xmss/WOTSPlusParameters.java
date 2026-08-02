package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes17.dex */
final class WOTSPlusParameters {
    final org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final int getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;
    final int getOutputFormats;
    private final org.bouncycastle.pqc.crypto.xmss.XMSSOid getOutputMinFrameDuration;

    protected WOTSPlusParameters(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier == null) {
            throw new java.lang.NullPointerException("treeDigest == null");
        }
        this.Camera2StreamConfigurationMap = aSN1ObjectIdentifier;
        org.bouncycastle.crypto.Digest highResolutionOutputSizeshNQ4ISI = org.bouncycastle.pqc.crypto.xmss.DigestUtil.getHighResolutionOutputSizeshNQ4ISI(aSN1ObjectIdentifier);
        int digestSize = org.bouncycastle.pqc.crypto.xmss.XMSSUtil.getDigestSize(highResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoSizes = digestSize;
        this.getOutputFormats = 16;
        int ceil = (int) java.lang.Math.ceil((digestSize * 8) / org.bouncycastle.pqc.crypto.xmss.XMSSUtil.log2(16));
        this.getHighResolutionOutputSizeshNQ4ISI = ceil;
        int log2 = (org.bouncycastle.pqc.crypto.xmss.XMSSUtil.log2(ceil * 15) / org.bouncycastle.pqc.crypto.xmss.XMSSUtil.log2(16)) + 1;
        this.getHighSpeedVideoFpsRanges = log2;
        int i = ceil + log2;
        this.getHighSpeedVideoFpsRangesFor = i;
        org.bouncycastle.pqc.crypto.xmss.WOTSPlusOid highSpeedVideoFpsRangesFor = org.bouncycastle.pqc.crypto.xmss.WOTSPlusOid.getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI.getAlgorithmName(), digestSize, i);
        this.getOutputMinFrameDuration = highSpeedVideoFpsRangesFor;
        if (highSpeedVideoFpsRangesFor != null) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("cannot find OID for digest algorithm: ");
        sb.append(highResolutionOutputSizeshNQ4ISI.getAlgorithmName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
