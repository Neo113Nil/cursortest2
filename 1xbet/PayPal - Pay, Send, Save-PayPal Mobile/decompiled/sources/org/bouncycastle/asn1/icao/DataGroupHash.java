package org.bouncycastle.asn1.icao;

/* loaded from: classes17.dex */
public class DataGroupHash extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.ASN1OctetString Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public int getDataGroupNumber() {
        return this.getHighSpeedVideoFpsRangesFor.intValueExact();
    }

    public org.bouncycastle.asn1.ASN1OctetString getDataGroupHashValue() {
        return this.Camera2StreamConfigurationMap;
    }

    public static org.bouncycastle.asn1.icao.DataGroupHash getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.icao.DataGroupHash) {
            return (org.bouncycastle.asn1.icao.DataGroupHash) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.icao.DataGroupHash(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private DataGroupHash(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement());
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1OctetString.getInstance(objects.nextElement());
    }

    public DataGroupHash(int i, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1Integer(i);
        this.Camera2StreamConfigurationMap = aSN1OctetString;
    }
}
