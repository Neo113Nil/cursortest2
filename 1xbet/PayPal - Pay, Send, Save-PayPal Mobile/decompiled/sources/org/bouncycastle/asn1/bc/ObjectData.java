package org.bouncycastle.asn1.bc;

/* loaded from: classes17.dex */
public class ObjectData extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.ASN1OctetString Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.ASN1GeneralizedTime getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.ASN1GeneralizedTime getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;
    private final java.math.BigInteger getOutputFormats;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(6);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getOutputFormats));
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DERUTF8String(this.getHighSpeedVideoSizes));
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        if (this.getHighSpeedVideoFpsRanges != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERUTF8String(this.getHighSpeedVideoFpsRanges));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.math.BigInteger getType() {
        return this.getOutputFormats;
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getLastModifiedDate() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.lang.String getIdentifier() {
        return this.getHighSpeedVideoSizes;
    }

    public byte[] getData() {
        return org.bouncycastle.util.Arrays.clone(this.Camera2StreamConfigurationMap.getOctets());
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getCreationDate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.String getComment() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.bc.ObjectData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.bc.ObjectData) {
            return (org.bouncycastle.asn1.bc.ObjectData) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.bc.ObjectData(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private ObjectData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getOutputFormats = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getValue();
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1UTF8String.getInstance(aSN1Sequence.getObjectAt(1)).getString();
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(2));
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(3));
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(4));
        this.getHighSpeedVideoFpsRanges = aSN1Sequence.size() == 6 ? org.bouncycastle.asn1.ASN1UTF8String.getInstance(aSN1Sequence.getObjectAt(5)).getString() : null;
    }

    public ObjectData(java.math.BigInteger bigInteger, java.lang.String str, java.util.Date date, java.util.Date date2, byte[] bArr, java.lang.String str2) {
        this.getOutputFormats = bigInteger;
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DERGeneralizedTime(date);
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERGeneralizedTime(date2);
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DEROctetString(org.bouncycastle.util.Arrays.clone(bArr));
        this.getHighSpeedVideoFpsRanges = str2;
    }
}
