package org.bouncycastle.asn1.tsp;

/* loaded from: classes17.dex */
public class ArchiveTimeStamp extends org.bouncycastle.asn1.ASN1Object {
    private final org.bouncycastle.asn1.cms.ContentInfo Camera2StreamConfigurationMap;
    private final org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges;
    private final org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighSpeedVideoFpsRangesFor;
    private final org.bouncycastle.asn1.cms.Attributes getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.getHighSpeedVideoFpsRangesFor;
        if (algorithmIdentifier != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) algorithmIdentifier));
        }
        org.bouncycastle.asn1.cms.Attributes attributes = this.getHighSpeedVideoSizes;
        if (attributes != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) attributes));
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoFpsRanges;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 2, (org.bouncycastle.asn1.ASN1Encodable) aSN1Sequence));
        }
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.cms.ContentInfo getTimeStamp() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.tsp.PartialHashtree[] getReducedHashTree() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoFpsRanges;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        org.bouncycastle.asn1.tsp.PartialHashtree[] partialHashtreeArr = new org.bouncycastle.asn1.tsp.PartialHashtree[size];
        for (int i = 0; i != size; i++) {
            partialHashtreeArr[i] = org.bouncycastle.asn1.tsp.PartialHashtree.getInstance(this.getHighSpeedVideoFpsRanges.getObjectAt(i));
        }
        return partialHashtreeArr;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithmIdentifier() {
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.getHighSpeedVideoFpsRangesFor;
        if (algorithmIdentifier != null) {
            return algorithmIdentifier;
        }
        if (!this.Camera2StreamConfigurationMap.getContentType().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.cms.CMSObjectIdentifiers.signedData)) {
            throw new java.lang.IllegalStateException("cannot identify algorithm identifier for digest");
        }
        org.bouncycastle.asn1.cms.SignedData signedData = org.bouncycastle.asn1.cms.SignedData.getInstance(this.Camera2StreamConfigurationMap.getContent());
        if (signedData.getEncapContentInfo().getContentType().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_ct_TSTInfo)) {
            return org.bouncycastle.asn1.tsp.TSTInfo.getInstance(signedData.getEncapContentInfo()).getMessageImprint().getHashAlgorithm();
        }
        throw new java.lang.IllegalStateException("cannot parse time stamp");
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithm() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.tsp.ArchiveTimeStamp getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.tsp.ArchiveTimeStamp) {
            return (org.bouncycastle.asn1.tsp.ArchiveTimeStamp) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.tsp.ArchiveTimeStamp(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public ArchiveTimeStamp(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.tsp.PartialHashtree[] partialHashtreeArr, org.bouncycastle.asn1.cms.ContentInfo contentInfo) {
        this(algorithmIdentifier, null, partialHashtreeArr, contentInfo);
    }

    public ArchiveTimeStamp(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.cms.Attributes attributes, org.bouncycastle.asn1.tsp.PartialHashtree[] partialHashtreeArr, org.bouncycastle.asn1.cms.ContentInfo contentInfo) {
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
        this.getHighSpeedVideoSizes = attributes;
        this.getHighSpeedVideoFpsRanges = partialHashtreeArr != null ? new org.bouncycastle.asn1.DERSequence(partialHashtreeArr) : null;
        this.Camera2StreamConfigurationMap = contentInfo;
    }

    public ArchiveTimeStamp(org.bouncycastle.asn1.cms.ContentInfo contentInfo) {
        this(null, null, null, contentInfo);
    }

    private ArchiveTimeStamp(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() <= 0 || aSN1Sequence.size() > 4) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("wrong sequence size in constructor: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = null;
        org.bouncycastle.asn1.cms.Attributes attributes = null;
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = null;
        for (int i = 0; i < aSN1Sequence.size() - 1; i++) {
            org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Sequence.getObjectAt(i);
            if (objectAt instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(objectAt);
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    algorithmIdentifier = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1TaggedObject, false);
                } else if (tagNo == 1) {
                    attributes = org.bouncycastle.asn1.cms.Attributes.getInstance(aSN1TaggedObject, false);
                } else {
                    if (tagNo != 2) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("invalid tag no in constructor: ");
                        sb2.append(aSN1TaggedObject.getTagNo());
                        throw new java.lang.IllegalArgumentException(sb2.toString());
                    }
                    aSN1Sequence2 = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, false);
                }
            }
        }
        this.getHighSpeedVideoFpsRangesFor = algorithmIdentifier;
        this.getHighSpeedVideoSizes = attributes;
        this.getHighSpeedVideoFpsRanges = aSN1Sequence2;
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.cms.ContentInfo.getInstance(aSN1Sequence.getObjectAt(aSN1Sequence.size() - 1));
    }
}
