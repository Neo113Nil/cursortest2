package org.bouncycastle.asn1.bc;

/* loaded from: classes17.dex */
public class ObjectStoreData extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.bc.ObjectDataSequence Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.ASN1GeneralizedTime getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.ASN1GeneralizedTime getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;
    private final java.math.BigInteger getHighSpeedVideoSizesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(6);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.ASN1Integer(this.getHighSpeedVideoSizesFor));
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        if (this.getHighSpeedVideoSizes != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERUTF8String(this.getHighSpeedVideoSizes));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public java.math.BigInteger getVersion() {
        return this.getHighSpeedVideoSizesFor;
    }

    public org.bouncycastle.asn1.bc.ObjectDataSequence getObjectDataSequence() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getLastModifiedDate() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getIntegrityAlgorithm() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1GeneralizedTime getCreationDate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.String getComment() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.bc.ObjectStoreData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.bc.ObjectStoreData) {
            return (org.bouncycastle.asn1.bc.ObjectStoreData) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.bc.ObjectStoreData(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ObjectStoreData(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, java.util.Date date, java.util.Date date2, org.bouncycastle.asn1.bc.ObjectDataSequence objectDataSequence, java.lang.String str) {
        this.getHighSpeedVideoSizesFor = java.math.BigInteger.valueOf(1L);
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.DERGeneralizedTime(date);
        this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.DERGeneralizedTime(date2);
        this.Camera2StreamConfigurationMap = objectDataSequence;
        this.getHighSpeedVideoSizes = str;
    }

    private ObjectStoreData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizesFor = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0)).getValue();
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(2));
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1GeneralizedTime.getInstance(aSN1Sequence.getObjectAt(3));
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.bc.ObjectDataSequence.getInstance(aSN1Sequence.getObjectAt(4));
        this.getHighSpeedVideoSizes = aSN1Sequence.size() == 6 ? org.bouncycastle.asn1.ASN1UTF8String.getInstance(aSN1Sequence.getObjectAt(5)).getString() : null;
    }
}
