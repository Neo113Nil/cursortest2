package com.visa.cbp.encryptionutils.common;

/* loaded from: classes16.dex */
public class CertMetaData {
    private long Camera2StreamConfigurationMap;
    private long getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x500.X500Name getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.x500.X500Name getHighSpeedVideoSizes;

    public org.bouncycastle.asn1.x500.X500Name getIssuer() {
        return this.getHighSpeedVideoSizes;
    }

    public void setIssuer(org.bouncycastle.asn1.x500.X500Name x500Name) {
        this.getHighSpeedVideoSizes = x500Name;
    }

    public java.lang.String getSerial() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setSerial(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = str;
    }

    public long getNotBefore() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setNotBefore(long j) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
    }

    public long getNotAfter() {
        return this.Camera2StreamConfigurationMap;
    }

    public void setNotAfter(long j) {
        this.Camera2StreamConfigurationMap = j;
    }

    public org.bouncycastle.asn1.x500.X500Name getSubject() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setSubject(org.bouncycastle.asn1.x500.X500Name x500Name) {
        this.getHighSpeedVideoFpsRangesFor = x500Name;
    }
}
