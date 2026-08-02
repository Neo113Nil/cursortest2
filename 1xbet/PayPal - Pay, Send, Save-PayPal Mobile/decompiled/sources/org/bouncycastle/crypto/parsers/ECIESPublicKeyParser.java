package org.bouncycastle.crypto.parsers;

/* loaded from: classes17.dex */
public class ECIESPublicKeyParser implements org.bouncycastle.crypto.KeyParser {
    private org.bouncycastle.crypto.params.ECDomainParameters Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.crypto.KeyParser
    public org.bouncycastle.crypto.params.AsymmetricKeyParameter readKey(java.io.InputStream inputStream) throws java.io.IOException {
        byte[] bArr;
        int read = inputStream.read();
        if (read == 0) {
            throw new java.io.IOException("Sender's public key invalid.");
        }
        if (read == 2 || read == 3) {
            bArr = new byte[((this.Camera2StreamConfigurationMap.getCurve().getFieldSize() + 7) / 8) + 1];
        } else {
            if (read != 4 && read != 6 && read != 7) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Sender's public key has invalid point encoding 0x");
                sb.append(java.lang.Integer.toString(read, 16));
                throw new java.io.IOException(sb.toString());
            }
            bArr = new byte[(((this.Camera2StreamConfigurationMap.getCurve().getFieldSize() + 7) / 8) * 2) + 1];
        }
        bArr[0] = (byte) read;
        org.bouncycastle.util.io.Streams.readFully(inputStream, bArr, 1, bArr.length - 1);
        return new org.bouncycastle.crypto.params.ECPublicKeyParameters(this.Camera2StreamConfigurationMap.getCurve().decodePoint(bArr), this.Camera2StreamConfigurationMap);
    }

    public ECIESPublicKeyParser(org.bouncycastle.crypto.params.ECDomainParameters eCDomainParameters) {
        this.Camera2StreamConfigurationMap = eCDomainParameters;
    }
}
