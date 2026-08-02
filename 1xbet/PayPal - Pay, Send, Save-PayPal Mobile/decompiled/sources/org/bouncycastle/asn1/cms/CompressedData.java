package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class CompressedData extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Integer Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.cms.ContentInfo getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        return new org.bouncycastle.asn1.BERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.cms.ContentInfo getEncapContentInfo() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getCompressionAlgorithmIdentifier() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cms.CompressedData getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cms.CompressedData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.CompressedData) {
            return (org.bouncycastle.asn1.cms.CompressedData) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.CompressedData(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CompressedData(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.cms.ContentInfo contentInfo) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer(0L);
        this.getHighSpeedVideoSizes = algorithmIdentifier;
        this.getHighSpeedVideoFpsRanges = contentInfo;
    }

    private CompressedData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.Camera2StreamConfigurationMap = (org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(0);
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.cms.ContentInfo.getInstance(aSN1Sequence.getObjectAt(2));
    }
}
