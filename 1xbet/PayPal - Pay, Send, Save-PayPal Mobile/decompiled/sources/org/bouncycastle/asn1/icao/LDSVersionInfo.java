package org.bouncycastle.asn1.icao;

/* loaded from: classes17.dex */
public class LDSVersionInfo extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1PrintableString Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1PrintableString getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.lang.String getUnicodeVersion() {
        return this.getHighSpeedVideoFpsRanges.getString();
    }

    public java.lang.String getLdsVersion() {
        return this.Camera2StreamConfigurationMap.getString();
    }

    public static org.bouncycastle.asn1.icao.LDSVersionInfo getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.icao.LDSVersionInfo) {
            return (org.bouncycastle.asn1.icao.LDSVersionInfo) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.icao.LDSVersionInfo(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private LDSVersionInfo(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new java.lang.IllegalArgumentException("sequence wrong size for LDSVersionInfo");
        }
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1PrintableString.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1PrintableString.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public LDSVersionInfo(java.lang.String str, java.lang.String str2) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERPrintableString(str);
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DERPrintableString(str2);
    }
}
