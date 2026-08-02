package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class PEMUtil {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;

    final org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes(java.io.InputStream inputStream) throws java.io.IOException {
        java.lang.String highSpeedVideoFpsRanges;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        do {
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(inputStream);
            if (highSpeedVideoFpsRanges == null || highSpeedVideoFpsRanges.startsWith(this.getHighSpeedVideoFpsRanges)) {
                break;
            }
        } while (!highSpeedVideoFpsRanges.startsWith(this.Camera2StreamConfigurationMap));
        while (true) {
            java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(inputStream);
            if (highSpeedVideoFpsRanges2 == null || highSpeedVideoFpsRanges2.startsWith(this.getHighSpeedVideoFpsRangesFor) || highSpeedVideoFpsRanges2.startsWith(this.getHighSpeedVideoSizes)) {
                break;
            }
            stringBuffer.append(highSpeedVideoFpsRanges2);
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        org.bouncycastle.asn1.ASN1Primitive readObject = new org.bouncycastle.asn1.ASN1InputStream(org.bouncycastle.util.encoders.Base64.decode(stringBuffer.toString())).readObject();
        if (readObject instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return (org.bouncycastle.asn1.ASN1Sequence) readObject;
        }
        throw new java.io.IOException("malformed PEM data encountered");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r0.length() == 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String getHighSpeedVideoFpsRanges(java.io.InputStream inputStream) throws java.io.IOException {
        int read;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        while (true) {
            read = inputStream.read();
            if (read == 13 || read == 10 || read < 0) {
                break;
            }
            if (read != 13) {
                stringBuffer.append((char) read);
            }
        }
        if (read < 0) {
            return null;
        }
        return stringBuffer.toString();
    }

    PEMUtil(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("-----BEGIN ");
        sb.append(str);
        sb.append("-----");
        this.getHighSpeedVideoFpsRanges = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("-----BEGIN X509 ");
        sb2.append(str);
        sb2.append("-----");
        this.Camera2StreamConfigurationMap = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("-----END ");
        sb3.append(str);
        sb3.append("-----");
        this.getHighSpeedVideoFpsRangesFor = sb3.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("-----END X509 ");
        sb4.append(str);
        sb4.append("-----");
        this.getHighSpeedVideoSizes = sb4.toString();
    }
}
