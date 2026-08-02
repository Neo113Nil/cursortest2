package org.bouncycastle.asn1.eac;

/* loaded from: classes17.dex */
public class CertificateHolderReference {
    private java.lang.String Camera2StreamConfigurationMap;
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRangesFor;

    public java.lang.String getSequenceNumber() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.String getHolderMnemonic() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public byte[] getEncoded() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        try {
            return sb.toString().getBytes("ISO-8859-1");
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.IllegalStateException(e.toString());
        }
    }

    public java.lang.String getCountryCode() {
        return this.Camera2StreamConfigurationMap;
    }

    CertificateHolderReference(byte[] bArr) {
        try {
            java.lang.String str = new java.lang.String(bArr, "ISO-8859-1");
            this.Camera2StreamConfigurationMap = str.substring(0, 2);
            this.getHighResolutionOutputSizeshNQ4ISI = str.substring(2, str.length() - 5);
            this.getHighSpeedVideoFpsRangesFor = str.substring(str.length() - 5);
        } catch (java.io.UnsupportedEncodingException e) {
            throw new java.lang.IllegalStateException(e.toString());
        }
    }

    public CertificateHolderReference(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.Camera2StreamConfigurationMap = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.getHighSpeedVideoFpsRangesFor = str3;
    }
}
