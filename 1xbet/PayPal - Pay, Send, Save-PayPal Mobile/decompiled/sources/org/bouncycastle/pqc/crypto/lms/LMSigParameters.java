package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
public class LMSigParameters {
    private final int Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoSizes;
    public static final org.bouncycastle.pqc.crypto.lms.LMSigParameters lms_sha256_n32_h5 = new org.bouncycastle.pqc.crypto.lms.LMSigParameters(5, 32, 5, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
    public static final org.bouncycastle.pqc.crypto.lms.LMSigParameters lms_sha256_n32_h10 = new org.bouncycastle.pqc.crypto.lms.LMSigParameters(6, 32, 10, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
    public static final org.bouncycastle.pqc.crypto.lms.LMSigParameters lms_sha256_n32_h15 = new org.bouncycastle.pqc.crypto.lms.LMSigParameters(7, 32, 15, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
    public static final org.bouncycastle.pqc.crypto.lms.LMSigParameters lms_sha256_n32_h20 = new org.bouncycastle.pqc.crypto.lms.LMSigParameters(8, 32, 20, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
    public static final org.bouncycastle.pqc.crypto.lms.LMSigParameters lms_sha256_n32_h25 = new org.bouncycastle.pqc.crypto.lms.LMSigParameters(9, 32, 25, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
    private static java.util.Map<java.lang.Object, org.bouncycastle.pqc.crypto.lms.LMSigParameters> getHighSpeedVideoFpsRangesFor = new java.util.HashMap<java.lang.Object, org.bouncycastle.pqc.crypto.lms.LMSigParameters>() { // from class: org.bouncycastle.pqc.crypto.lms.LMSigParameters.1
        {
            put(java.lang.Integer.valueOf(org.bouncycastle.pqc.crypto.lms.LMSigParameters.lms_sha256_n32_h5.getHighSpeedVideoSizes), org.bouncycastle.pqc.crypto.lms.LMSigParameters.lms_sha256_n32_h5);
            put(java.lang.Integer.valueOf(org.bouncycastle.pqc.crypto.lms.LMSigParameters.lms_sha256_n32_h10.getHighSpeedVideoSizes), org.bouncycastle.pqc.crypto.lms.LMSigParameters.lms_sha256_n32_h10);
            put(java.lang.Integer.valueOf(org.bouncycastle.pqc.crypto.lms.LMSigParameters.lms_sha256_n32_h15.getHighSpeedVideoSizes), org.bouncycastle.pqc.crypto.lms.LMSigParameters.lms_sha256_n32_h15);
            put(java.lang.Integer.valueOf(org.bouncycastle.pqc.crypto.lms.LMSigParameters.lms_sha256_n32_h20.getHighSpeedVideoSizes), org.bouncycastle.pqc.crypto.lms.LMSigParameters.lms_sha256_n32_h20);
            put(java.lang.Integer.valueOf(org.bouncycastle.pqc.crypto.lms.LMSigParameters.lms_sha256_n32_h25.getHighSpeedVideoSizes), org.bouncycastle.pqc.crypto.lms.LMSigParameters.lms_sha256_n32_h25);
        }
    };

    public int getType() {
        return this.getHighSpeedVideoSizes;
    }

    public int getM() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getH() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getDigestOID() {
        return this.getHighSpeedVideoFpsRanges;
    }

    static org.bouncycastle.pqc.crypto.lms.LMSigParameters Camera2StreamConfigurationMap(int i) {
        return getHighSpeedVideoFpsRangesFor.get(java.lang.Integer.valueOf(i));
    }

    protected LMSigParameters(int i, int i2, int i3, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getHighSpeedVideoSizes = i;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.Camera2StreamConfigurationMap = i3;
        this.getHighSpeedVideoFpsRanges = aSN1ObjectIdentifier;
    }
}
