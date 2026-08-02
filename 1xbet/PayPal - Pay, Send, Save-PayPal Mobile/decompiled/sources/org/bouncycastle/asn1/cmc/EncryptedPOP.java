package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class EncryptedPOP extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;
    private final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.asn1.cms.ContentInfo getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.cmc.TaggedRequest getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRangesFor);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        aSN1EncodableVector.add(new org.bouncycastle.asn1.DEROctetString(this.getHighResolutionOutputSizeshNQ4ISI));
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getWitnessAlgID() {
        return this.Camera2StreamConfigurationMap;
    }

    public byte[] getWitness() {
        return org.bouncycastle.util.Arrays.clone(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getThePOPAlgID() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.cmc.TaggedRequest getRequest() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.cms.ContentInfo getCms() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.cmc.EncryptedPOP getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.EncryptedPOP) {
            return (org.bouncycastle.asn1.cmc.EncryptedPOP) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmc.EncryptedPOP(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public EncryptedPOP(org.bouncycastle.asn1.cmc.TaggedRequest taggedRequest, org.bouncycastle.asn1.cms.ContentInfo contentInfo, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = taggedRequest;
        this.getHighSpeedVideoFpsRanges = contentInfo;
        this.getHighSpeedVideoSizes = algorithmIdentifier;
        this.Camera2StreamConfigurationMap = algorithmIdentifier2;
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(bArr);
    }

    private EncryptedPOP(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 5) {
            throw new java.lang.IllegalArgumentException("incorrect sequence size");
        }
        this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.cmc.TaggedRequest.getInstance(aSN1Sequence.getObjectAt(0));
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.cms.ContentInfo.getInstance(aSN1Sequence.getObjectAt(1));
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(2));
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(3));
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.util.Arrays.clone(org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(4)).getOctets());
    }
}
