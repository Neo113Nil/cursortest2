package org.bouncycastle.jcajce.provider.asymmetric.edec;

/* loaded from: classes17.dex */
class Utils {
    static java.lang.String getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        byte[] encoded = asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.X448PublicKeyParameters ? ((org.bouncycastle.crypto.params.X448PublicKeyParameters) asymmetricKeyParameter).getEncoded() : asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.Ed448PublicKeyParameters ? ((org.bouncycastle.crypto.params.Ed448PublicKeyParameters) asymmetricKeyParameter).getEncoded() : asymmetricKeyParameter instanceof org.bouncycastle.crypto.params.X25519PublicKeyParameters ? ((org.bouncycastle.crypto.params.X25519PublicKeyParameters) asymmetricKeyParameter).getEncoded() : ((org.bouncycastle.crypto.params.Ed25519PublicKeyParameters) asymmetricKeyParameter).getEncoded();
        stringBuffer.append(str2).append(" ").append(str).append(" [").append(new org.bouncycastle.util.Fingerprint(encoded).toString()).append("]").append(lineSeparator).append("    public data: ").append(org.bouncycastle.util.encoders.Hex.toHexString(encoded)).append(lineSeparator);
        return stringBuffer.toString();
    }

    static boolean getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return !getHighSpeedVideoSizes(bArr, bArr);
        }
        int i = 0;
        for (int i2 = 0; i2 != bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i == 0;
    }

    Utils() {
    }
}
