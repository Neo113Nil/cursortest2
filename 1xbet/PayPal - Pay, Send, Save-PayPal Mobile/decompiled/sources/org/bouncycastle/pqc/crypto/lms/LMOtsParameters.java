package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes17.dex */
public class LMOtsParameters {
    public static final int reserved = 0;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private final int getInputFormats;
    private final int getOutputFormats;
    private final int getOutputMinFrameDuration;
    public static final org.bouncycastle.pqc.crypto.lms.LMOtsParameters sha256_n32_w1 = new org.bouncycastle.pqc.crypto.lms.LMOtsParameters(1, 32, 1, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_SHIELD_VALUE, 7, 8516, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
    public static final org.bouncycastle.pqc.crypto.lms.LMOtsParameters sha256_n32_w2 = new org.bouncycastle.pqc.crypto.lms.LMOtsParameters(2, 32, 2, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 6, 4292, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
    public static final org.bouncycastle.pqc.crypto.lms.LMOtsParameters sha256_n32_w4 = new org.bouncycastle.pqc.crypto.lms.LMOtsParameters(3, 32, 4, 67, 4, 2180, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
    public static final org.bouncycastle.pqc.crypto.lms.LMOtsParameters sha256_n32_w8 = new org.bouncycastle.pqc.crypto.lms.LMOtsParameters(4, 32, 8, 34, 0, 1124, org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
    private static final java.util.Map<java.lang.Object, org.bouncycastle.pqc.crypto.lms.LMOtsParameters> Camera2StreamConfigurationMap = new java.util.HashMap<java.lang.Object, org.bouncycastle.pqc.crypto.lms.LMOtsParameters>() { // from class: org.bouncycastle.pqc.crypto.lms.LMOtsParameters.1
        {
            put(java.lang.Integer.valueOf(org.bouncycastle.pqc.crypto.lms.LMOtsParameters.sha256_n32_w1.getInputFormats), org.bouncycastle.pqc.crypto.lms.LMOtsParameters.sha256_n32_w1);
            put(java.lang.Integer.valueOf(org.bouncycastle.pqc.crypto.lms.LMOtsParameters.sha256_n32_w2.getInputFormats), org.bouncycastle.pqc.crypto.lms.LMOtsParameters.sha256_n32_w2);
            put(java.lang.Integer.valueOf(org.bouncycastle.pqc.crypto.lms.LMOtsParameters.sha256_n32_w4.getInputFormats), org.bouncycastle.pqc.crypto.lms.LMOtsParameters.sha256_n32_w4);
            put(java.lang.Integer.valueOf(org.bouncycastle.pqc.crypto.lms.LMOtsParameters.sha256_n32_w8.getInputFormats), org.bouncycastle.pqc.crypto.lms.LMOtsParameters.sha256_n32_w8);
        }
    };

    public int getW() {
        return this.getOutputMinFrameDuration;
    }

    public int getType() {
        return this.getInputFormats;
    }

    public int getSigLen() {
        return this.getOutputFormats;
    }

    public int getP() {
        return this.getHighSpeedVideoSizes;
    }

    public int getN() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getLs() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getDigestOID() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.pqc.crypto.lms.LMOtsParameters getParametersForType(int i) {
        return Camera2StreamConfigurationMap.get(java.lang.Integer.valueOf(i));
    }

    protected LMOtsParameters(int i, int i2, int i3, int i4, int i5, int i6, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.getInputFormats = i;
        this.getHighSpeedVideoFpsRangesFor = i2;
        this.getOutputMinFrameDuration = i3;
        this.getHighSpeedVideoSizes = i4;
        this.getHighResolutionOutputSizeshNQ4ISI = i5;
        this.getOutputFormats = i6;
        this.getHighSpeedVideoFpsRanges = aSN1ObjectIdentifier;
    }
}
