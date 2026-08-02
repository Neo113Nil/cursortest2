package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class AuthenticatedData extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.x509.AlgorithmIdentifier getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.cms.ContentInfo getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.ASN1OctetString getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.cms.OriginatorInfo getHighSpeedVideoSizesFor;
    private org.bouncycastle.asn1.ASN1Integer getInputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Set getOutputFormats;
    private org.bouncycastle.asn1.ASN1Set getOutputMinFrameDuration;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(9);
        aSN1EncodableVector.add(this.getInputSizeshNQ4ISI);
        org.bouncycastle.asn1.cms.OriginatorInfo originatorInfo = this.getHighSpeedVideoSizesFor;
        if (originatorInfo != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) originatorInfo));
        }
        aSN1EncodableVector.add(this.getOutputFormats);
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier = this.getHighResolutionOutputSizeshNQ4ISI;
        if (algorithmIdentifier != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) algorithmIdentifier));
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 2, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set));
        }
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        org.bouncycastle.asn1.ASN1Set aSN1Set2 = this.getOutputMinFrameDuration;
        if (aSN1Set2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 3, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set2));
        }
        return new org.bouncycastle.asn1.BERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getInputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1Set getUnauthAttrs() {
        return this.getOutputMinFrameDuration;
    }

    public org.bouncycastle.asn1.ASN1Set getRecipientInfos() {
        return this.getOutputFormats;
    }

    public org.bouncycastle.asn1.cms.OriginatorInfo getOriginatorInfo() {
        return this.getHighSpeedVideoSizesFor;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getMacAlgorithm() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1OctetString getMac() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.cms.ContentInfo getEncapsulatedContentInfo() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getDigestAlgorithm() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1Set getAuthAttrs() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.cms.AuthenticatedData getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.cms.AuthenticatedData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.AuthenticatedData) {
            return (org.bouncycastle.asn1.cms.AuthenticatedData) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.AuthenticatedData(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static int calculateVersion(org.bouncycastle.asn1.cms.OriginatorInfo originatorInfo) {
        int i = 0;
        if (originatorInfo == null) {
            return 0;
        }
        java.util.Enumeration objects = originatorInfo.getCertificates().getObjects();
        while (true) {
            if (!objects.hasMoreElements()) {
                break;
            }
            java.lang.Object nextElement = objects.nextElement();
            if (nextElement instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) nextElement;
                if (aSN1TaggedObject.getTagNo() == 2) {
                    i = 1;
                } else if (aSN1TaggedObject.getTagNo() == 3) {
                    i = 3;
                    break;
                }
            }
        }
        if (originatorInfo.getCRLs() != null) {
            java.util.Enumeration objects2 = originatorInfo.getCRLs().getObjects();
            while (objects2.hasMoreElements()) {
                java.lang.Object nextElement2 = objects2.nextElement();
                if ((nextElement2 instanceof org.bouncycastle.asn1.ASN1TaggedObject) && ((org.bouncycastle.asn1.ASN1TaggedObject) nextElement2).getTagNo() == 1) {
                    return 3;
                }
            }
        }
        return i;
    }

    public AuthenticatedData(org.bouncycastle.asn1.cms.OriginatorInfo originatorInfo, org.bouncycastle.asn1.ASN1Set aSN1Set, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, org.bouncycastle.asn1.cms.ContentInfo contentInfo, org.bouncycastle.asn1.ASN1Set aSN1Set2, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString, org.bouncycastle.asn1.ASN1Set aSN1Set3) {
        if (!(algorithmIdentifier2 == null && aSN1Set2 == null) && (algorithmIdentifier2 == null || aSN1Set2 == null)) {
            throw new java.lang.IllegalArgumentException("digestAlgorithm and authAttrs must be set together");
        }
        this.getInputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1Integer(calculateVersion(originatorInfo));
        this.getHighSpeedVideoSizesFor = originatorInfo;
        this.Camera2StreamConfigurationMap = algorithmIdentifier;
        this.getHighResolutionOutputSizeshNQ4ISI = algorithmIdentifier2;
        this.getOutputFormats = aSN1Set;
        this.getHighSpeedVideoFpsRanges = contentInfo;
        this.getHighSpeedVideoFpsRangesFor = aSN1Set2;
        this.getHighSpeedVideoSizes = aSN1OctetString;
        this.getOutputMinFrameDuration = aSN1Set3;
    }

    private AuthenticatedData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int i;
        this.getInputSizeshNQ4ISI = (org.bouncycastle.asn1.ASN1Integer) aSN1Sequence.getObjectAt(0);
        org.bouncycastle.asn1.ASN1Encodable objectAt = aSN1Sequence.getObjectAt(1);
        if (objectAt instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            this.getHighSpeedVideoSizesFor = org.bouncycastle.asn1.cms.OriginatorInfo.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) objectAt, false);
            objectAt = aSN1Sequence.getObjectAt(2);
            i = 3;
        } else {
            i = 2;
        }
        this.getOutputFormats = org.bouncycastle.asn1.ASN1Set.getInstance(objectAt);
        this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance(aSN1Sequence.getObjectAt(i));
        int i2 = i + 2;
        org.bouncycastle.asn1.ASN1Encodable objectAt2 = aSN1Sequence.getObjectAt(i + 1);
        if (objectAt2 instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.x509.AlgorithmIdentifier.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) objectAt2, false);
            objectAt2 = aSN1Sequence.getObjectAt(i2);
            i2 = i + 3;
        }
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.cms.ContentInfo.getInstance(objectAt2);
        int i3 = i2 + 1;
        org.bouncycastle.asn1.ASN1Encodable objectAt3 = aSN1Sequence.getObjectAt(i2);
        if (objectAt3 instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Set.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) objectAt3, false);
            objectAt3 = aSN1Sequence.getObjectAt(i3);
            i3 = i2 + 2;
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1OctetString.getInstance(objectAt3);
        if (aSN1Sequence.size() > i3) {
            this.getOutputMinFrameDuration = org.bouncycastle.asn1.ASN1Set.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) aSN1Sequence.getObjectAt(i3), false);
        }
    }
}
