package org.bouncycastle.cert.dane;

/* loaded from: classes17.dex */
public class DANEEntry {
    public static final int CERT_USAGE_ACCEPT = 3;
    public static final int CERT_USAGE_CA = 0;
    public static final int CERT_USAGE_PKIX_VALIDATE = 1;
    public static final int CERT_USAGE_TRUST_ANCHOR = 2;
    private final byte[] Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.cert.X509CertificateHolder getHighSpeedVideoFpsRangesFor;

    public byte[] getRDATA() throws java.io.IOException {
        byte[] encoded = this.getHighSpeedVideoFpsRangesFor.getEncoded();
        byte[] bArr = this.Camera2StreamConfigurationMap;
        byte[] bArr2 = new byte[bArr.length + encoded.length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        java.lang.System.arraycopy(encoded, 0, bArr2, this.Camera2StreamConfigurationMap.length, encoded.length);
        return bArr2;
    }

    public byte[] getFlags() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap);
    }

    public java.lang.String getDomainName() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.cert.X509CertificateHolder getCertificate() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static boolean isValidCertificate(byte[] bArr) {
        byte b = bArr[0];
        return (b >= 0 || b <= 3) && bArr[1] == 0 && bArr[2] == 0;
    }

    DANEEntry(java.lang.String str, byte[] bArr, org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) {
        this.Camera2StreamConfigurationMap = bArr;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = x509CertificateHolder;
    }

    public DANEEntry(java.lang.String str, byte[] bArr) throws java.io.IOException {
        this(str, org.bouncycastle.util.Arrays.copyOfRange(bArr, 0, 3), new org.bouncycastle.cert.X509CertificateHolder(org.bouncycastle.util.Arrays.copyOfRange(bArr, 3, bArr.length)));
    }
}
