package org.bouncycastle.crypto.agreement.kdf;

/* loaded from: classes17.dex */
public class DHKDFParameters implements org.bouncycastle.crypto.DerivationParameters {
    private byte[] getHighResolutionOutputSizeshNQ4ISI;
    private byte[] getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoSizes;

    public byte[] getZ() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getKeySize() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public byte[] getExtraInfo() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getAlgorithm() {
        return this.getHighSpeedVideoSizes;
    }

    public DHKDFParameters(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, int i, byte[] bArr, byte[] bArr2) {
        this.getHighSpeedVideoSizes = aSN1ObjectIdentifier;
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRanges = bArr;
        this.getHighResolutionOutputSizeshNQ4ISI = bArr2;
    }

    public DHKDFParameters(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, int i, byte[] bArr) {
        this(aSN1ObjectIdentifier, i, bArr, null);
    }
}
