package org.bouncycastle.crypto.parsers;

/* loaded from: classes17.dex */
public class DHIESPublicKeyParser implements org.bouncycastle.crypto.KeyParser {
    private org.bouncycastle.crypto.params.DHParameters getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.KeyParser
    public org.bouncycastle.crypto.params.AsymmetricKeyParameter readKey(java.io.InputStream inputStream) throws java.io.IOException {
        int bitLength = (this.getHighSpeedVideoFpsRangesFor.getP().bitLength() + 7) / 8;
        byte[] bArr = new byte[bitLength];
        org.bouncycastle.util.io.Streams.readFully(inputStream, bArr, 0, bitLength);
        return new org.bouncycastle.crypto.params.DHPublicKeyParameters(new java.math.BigInteger(1, bArr), this.getHighSpeedVideoFpsRangesFor);
    }

    public DHIESPublicKeyParser(org.bouncycastle.crypto.params.DHParameters dHParameters) {
        this.getHighSpeedVideoFpsRangesFor = dHParameters;
    }
}
