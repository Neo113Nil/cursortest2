package org.bouncycastle.jcajce.provider.asymmetric.dh;

/* loaded from: classes17.dex */
class DHUtil {
    static java.lang.String Camera2StreamConfigurationMap(java.lang.String str, java.math.BigInteger bigInteger, org.bouncycastle.crypto.params.DHParameters dHParameters) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        java.math.BigInteger modPow = dHParameters.getG().modPow(bigInteger, dHParameters.getP());
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [").append(new org.bouncycastle.util.Fingerprint(org.bouncycastle.util.Arrays.concatenate(modPow.toByteArray(), dHParameters.getP().toByteArray(), dHParameters.getG().toByteArray())).toString()).append("]").append(lineSeparator);
        stringBuffer.append("              Y: ").append(modPow.toString(16)).append(lineSeparator);
        return stringBuffer.toString();
    }

    static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str, java.math.BigInteger bigInteger, org.bouncycastle.crypto.params.DHParameters dHParameters) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [").append(new org.bouncycastle.util.Fingerprint(org.bouncycastle.util.Arrays.concatenate(bigInteger.toByteArray(), dHParameters.getP().toByteArray(), dHParameters.getG().toByteArray())).toString()).append("]").append(lineSeparator);
        stringBuffer.append("             Y: ").append(bigInteger.toString(16)).append(lineSeparator);
        return stringBuffer.toString();
    }

    DHUtil() {
    }
}
