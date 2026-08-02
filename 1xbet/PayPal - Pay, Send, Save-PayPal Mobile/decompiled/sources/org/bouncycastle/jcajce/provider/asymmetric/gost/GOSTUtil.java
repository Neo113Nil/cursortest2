package org.bouncycastle.jcajce.provider.asymmetric.gost;

/* loaded from: classes17.dex */
class GOSTUtil {
    static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str, java.math.BigInteger bigInteger, org.bouncycastle.crypto.params.GOST3410Parameters gOST3410Parameters) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        java.math.BigInteger modPow = gOST3410Parameters.getA().modPow(bigInteger, gOST3410Parameters.getP());
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [").append(new org.bouncycastle.util.Fingerprint(org.bouncycastle.util.Arrays.concatenate(modPow.toByteArray(), gOST3410Parameters.getP().toByteArray(), gOST3410Parameters.getA().toByteArray())).toString()).append("]").append(lineSeparator);
        stringBuffer.append("                  Y: ").append(modPow.toString(16)).append(lineSeparator);
        return stringBuffer.toString();
    }

    static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str, java.math.BigInteger bigInteger, org.bouncycastle.crypto.params.GOST3410Parameters gOST3410Parameters) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.lang.String lineSeparator = org.bouncycastle.util.Strings.lineSeparator();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [").append(new org.bouncycastle.util.Fingerprint(org.bouncycastle.util.Arrays.concatenate(bigInteger.toByteArray(), gOST3410Parameters.getP().toByteArray(), gOST3410Parameters.getA().toByteArray())).toString()).append("]").append(lineSeparator);
        stringBuffer.append("                 Y: ").append(bigInteger.toString(16)).append(lineSeparator);
        return stringBuffer.toString();
    }

    GOSTUtil() {
    }
}
