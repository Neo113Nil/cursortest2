package org.bouncycastle.asn1.tsp;

/* loaded from: classes17.dex */
public class EvidenceRecord extends org.bouncycastle.asn1.ASN1Object {
    private static final org.bouncycastle.asn1.ASN1ObjectIdentifier getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.6.1.5.5.11.0.2.1");
    private org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.tsp.ArchiveTimeStampSequence getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.tsp.EncryptionInfo getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.tsp.CryptoInfos getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.ASN1Integer getInputFormats;

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EvidenceRecord: Oid(");
        sb.append(getHighSpeedVideoFpsRangesFor);
        sb.append(")");
        return sb.toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(5);
        aSN1EncodableVector.add(this.getInputFormats);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        org.bouncycastle.asn1.tsp.CryptoInfos cryptoInfos = this.getHighSpeedVideoSizes;
        if (cryptoInfos != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) cryptoInfos));
        }
        org.bouncycastle.asn1.tsp.EncryptionInfo encryptionInfo = this.getHighSpeedVideoFpsRanges;
        if (encryptionInfo != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) encryptionInfo));
        }
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier[] getDigestAlgorithms() {
        int size = this.Camera2StreamConfigurationMap.size();
        org.bouncycastle.asn1.x509.AlgorithmIdentifier[] algorithmIdentifierArr = new org.bouncycastle.asn1.x509.AlgorithmIdentifier[size];
        for (int i = 0; i != size; i++) {
            algorithmIdentifierArr[i] = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(this.Camera2StreamConfigurationMap.getObjectAt(i));
        }
        return algorithmIdentifierArr;
    }

    public org.bouncycastle.asn1.tsp.ArchiveTimeStampSequence getArchiveTimeStampSequence() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.tsp.EvidenceRecord addArchiveTimeStamp(org.bouncycastle.asn1.tsp.ArchiveTimeStamp archiveTimeStamp, boolean z) {
        if (z) {
            return new org.bouncycastle.asn1.tsp.EvidenceRecord(this, this.getHighResolutionOutputSizeshNQ4ISI.append(new org.bouncycastle.asn1.tsp.ArchiveTimeStampChain(archiveTimeStamp)), archiveTimeStamp);
        }
        org.bouncycastle.asn1.tsp.ArchiveTimeStampChain[] archiveTimeStampChains = this.getHighResolutionOutputSizeshNQ4ISI.getArchiveTimeStampChains();
        archiveTimeStampChains[archiveTimeStampChains.length - 1] = archiveTimeStampChains[archiveTimeStampChains.length - 1].append(archiveTimeStamp);
        return new org.bouncycastle.asn1.tsp.EvidenceRecord(this, new org.bouncycastle.asn1.tsp.ArchiveTimeStampSequence(archiveTimeStampChains), (org.bouncycastle.asn1.tsp.ArchiveTimeStamp) null);
    }

    public static org.bouncycastle.asn1.tsp.EvidenceRecord getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.tsp.EvidenceRecord getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.tsp.EvidenceRecord) {
            return (org.bouncycastle.asn1.tsp.EvidenceRecord) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.tsp.EvidenceRecord(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public EvidenceRecord(org.bouncycastle.asn1.x509.AlgorithmIdentifier[] algorithmIdentifierArr, org.bouncycastle.asn1.tsp.CryptoInfos cryptoInfos, org.bouncycastle.asn1.tsp.EncryptionInfo encryptionInfo, org.bouncycastle.asn1.tsp.ArchiveTimeStampSequence archiveTimeStampSequence) {
        this.getInputFormats = new org.bouncycastle.asn1.ASN1Integer(1L);
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERSequence(algorithmIdentifierArr);
        this.getHighSpeedVideoSizes = cryptoInfos;
        this.getHighSpeedVideoFpsRanges = encryptionInfo;
        this.getHighResolutionOutputSizeshNQ4ISI = archiveTimeStampSequence;
    }

    private EvidenceRecord(org.bouncycastle.asn1.tsp.EvidenceRecord evidenceRecord, org.bouncycastle.asn1.tsp.ArchiveTimeStampSequence archiveTimeStampSequence, org.bouncycastle.asn1.tsp.ArchiveTimeStamp archiveTimeStamp) {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence;
        this.getInputFormats = new org.bouncycastle.asn1.ASN1Integer(1L);
        this.getInputFormats = evidenceRecord.getInputFormats;
        if (archiveTimeStamp != null) {
            org.bouncycastle.asn1.x509.AlgorithmIdentifier digestAlgorithmIdentifier = archiveTimeStamp.getDigestAlgorithmIdentifier();
            org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector();
            java.util.Enumeration objects = evidenceRecord.Camera2StreamConfigurationMap.getObjects();
            while (objects.hasMoreElements()) {
                org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(objects.nextElement());
                aSN1EncodableVector.add(algorithmIdentifier);
                if (algorithmIdentifier.equals(digestAlgorithmIdentifier)) {
                }
            }
            aSN1EncodableVector.add(digestAlgorithmIdentifier);
            aSN1Sequence = new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
            this.Camera2StreamConfigurationMap = aSN1Sequence;
            this.getHighSpeedVideoSizes = evidenceRecord.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRanges = evidenceRecord.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = archiveTimeStampSequence;
        }
        aSN1Sequence = evidenceRecord.Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = aSN1Sequence;
        this.getHighSpeedVideoSizes = evidenceRecord.getHighSpeedVideoSizes;
        this.getHighSpeedVideoFpsRanges = evidenceRecord.getHighSpeedVideoFpsRanges;
        this.getHighResolutionOutputSizeshNQ4ISI = archiveTimeStampSequence;
    }

    public EvidenceRecord(org.bouncycastle.asn1.tsp.CryptoInfos cryptoInfos, org.bouncycastle.asn1.tsp.EncryptionInfo encryptionInfo, org.bouncycastle.asn1.tsp.ArchiveTimeStamp archiveTimeStamp) {
        this.getInputFormats = new org.bouncycastle.asn1.ASN1Integer(1L);
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERSequence(archiveTimeStamp.getDigestAlgorithmIdentifier());
        this.getHighSpeedVideoSizes = cryptoInfos;
        this.getHighSpeedVideoFpsRanges = encryptionInfo;
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.tsp.ArchiveTimeStampSequence(new org.bouncycastle.asn1.tsp.ArchiveTimeStampChain(archiveTimeStamp));
    }

    private EvidenceRecord(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getInputFormats = new org.bouncycastle.asn1.ASN1Integer(1L);
        if (aSN1Sequence.size() < 3 && aSN1Sequence.size() > 5) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("wrong sequence size in constructor: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        org.bouncycastle.asn1.ASN1Integer aSN1Integer = org.bouncycastle.asn1.ASN1Integer.getInstance(aSN1Sequence.getObjectAt(0));
        if (!aSN1Integer.hasValue(1)) {
            throw new java.lang.IllegalArgumentException("incompatible version");
        }
        this.getInputFormats = aSN1Integer;
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        for (int i = 2; i != aSN1Sequence.size() - 1; i++) {
            org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Sequence.getObjectAt(i);
            if (!(objectAt instanceof org.bouncycastle.asn1.ASN1TaggedObject)) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unknown object in getInstance: ");
                sb2.append(objectAt.getClass().getName());
                throw new java.lang.IllegalArgumentException(sb2.toString());
            }
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) objectAt;
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.tsp.CryptoInfos.getInstance(aSN1TaggedObject, false);
            } else {
                if (tagNo != 1) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("unknown tag in getInstance: ");
                    sb3.append(aSN1TaggedObject.getTagNo());
                    throw new java.lang.IllegalArgumentException(sb3.toString());
                }
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.tsp.EncryptionInfo.getInstance(aSN1TaggedObject, false);
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.tsp.ArchiveTimeStampSequence.getInstance(aSN1Sequence.getObjectAt(aSN1Sequence.size() - 1));
    }
}
