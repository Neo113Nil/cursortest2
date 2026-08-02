package org.bouncycastle.asn1.cms;

/* loaded from: classes17.dex */
public class SignedData extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoFpsRanges;
    private boolean getHighSpeedVideoSizesFor;
    private org.bouncycastle.asn1.ASN1Set getInputFormats;
    private boolean getInputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Set getOutputFormats;
    private org.bouncycastle.asn1.cms.ContentInfo getOutputMinFrameDuration;
    private org.bouncycastle.asn1.ASN1Set getOutputMinFrameDurationlomOqCM;
    private org.bouncycastle.asn1.ASN1Integer getOutputSizeshNQ4ISI;
    private static final org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoSizes = new org.bouncycastle.asn1.ASN1Integer(1);
    private static final org.bouncycastle.asn1.ASN1Integer getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.ASN1Integer(3);
    private static final org.bouncycastle.asn1.ASN1Integer Camera2StreamConfigurationMap = new org.bouncycastle.asn1.ASN1Integer(4);
    private static final org.bouncycastle.asn1.ASN1Integer getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.ASN1Integer(5);

    public SignedData(org.bouncycastle.asn1.ASN1Set aSN1Set, org.bouncycastle.asn1.cms.ContentInfo contentInfo, org.bouncycastle.asn1.ASN1Set aSN1Set2, org.bouncycastle.asn1.ASN1Set aSN1Set3, org.bouncycastle.asn1.ASN1Set aSN1Set4) {
        boolean z;
        boolean z2;
        boolean z3;
        org.bouncycastle.asn1.ASN1Integer aSN1Integer;
        org.bouncycastle.asn1.ASN1ObjectIdentifier contentType = contentInfo.getContentType();
        boolean z4 = false;
        if (aSN1Set2 != null) {
            java.util.Enumeration objects = aSN1Set2.getObjects();
            z = false;
            z2 = false;
            z3 = false;
            while (objects.hasMoreElements()) {
                java.lang.Object nextElement = objects.nextElement();
                if (nextElement instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                    org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(nextElement);
                    if (aSN1TaggedObject.getTagNo() == 1) {
                        z2 = true;
                    } else if (aSN1TaggedObject.getTagNo() == 2) {
                        z3 = true;
                    } else if (aSN1TaggedObject.getTagNo() == 3) {
                        z = true;
                    }
                }
            }
        } else {
            z = false;
            z2 = false;
            z3 = false;
        }
        if (z) {
            aSN1Integer = new org.bouncycastle.asn1.ASN1Integer(5L);
        } else {
            if (aSN1Set3 != null) {
                java.util.Enumeration objects2 = aSN1Set3.getObjects();
                while (objects2.hasMoreElements()) {
                    if (objects2.nextElement() instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                        z4 = true;
                    }
                }
                if (z4) {
                    aSN1Integer = getHighSpeedVideoFpsRangesFor;
                }
            }
            if (z3) {
                aSN1Integer = Camera2StreamConfigurationMap;
            } else {
                if (!z2) {
                    java.util.Enumeration objects3 = aSN1Set4.getObjects();
                    while (true) {
                        if (objects3.hasMoreElements()) {
                            if (org.bouncycastle.asn1.cms.SignerInfo.getInstance(objects3.nextElement()).getVersion().hasValue(3)) {
                                break;
                            }
                        } else if (org.bouncycastle.asn1.cms.CMSObjectIdentifiers.data.equals((org.bouncycastle.asn1.ASN1Primitive) contentType)) {
                            aSN1Integer = getHighSpeedVideoSizes;
                        }
                    }
                }
                aSN1Integer = getHighResolutionOutputSizeshNQ4ISI;
            }
        }
        this.getOutputSizeshNQ4ISI = aSN1Integer;
        this.getInputFormats = aSN1Set;
        this.getOutputMinFrameDuration = contentInfo;
        this.getHighSpeedVideoFpsRanges = aSN1Set2;
        this.getOutputFormats = aSN1Set3;
        this.getOutputMinFrameDurationlomOqCM = aSN1Set4;
        this.getHighSpeedVideoSizesFor = aSN1Set3 instanceof org.bouncycastle.asn1.BERSet;
        this.getInputSizeshNQ4ISI = aSN1Set2 instanceof org.bouncycastle.asn1.BERSet;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.getOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getInputFormats);
        aSN1EncodableVector.add(this.getOutputMinFrameDuration);
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.getHighSpeedVideoFpsRanges;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(this.getInputSizeshNQ4ISI ? new org.bouncycastle.asn1.BERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set) : new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set));
        }
        org.bouncycastle.asn1.ASN1Set aSN1Set2 = this.getOutputFormats;
        if (aSN1Set2 != null) {
            aSN1EncodableVector.add(this.getHighSpeedVideoSizesFor ? new org.bouncycastle.asn1.BERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set2) : new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set2));
        }
        aSN1EncodableVector.add(this.getOutputMinFrameDurationlomOqCM);
        return new org.bouncycastle.asn1.BERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.ASN1Set getSignerInfos() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public org.bouncycastle.asn1.cms.ContentInfo getEncapContentInfo() {
        return this.getOutputMinFrameDuration;
    }

    public org.bouncycastle.asn1.ASN1Set getDigestAlgorithms() {
        return this.getInputFormats;
    }

    public org.bouncycastle.asn1.ASN1Set getCertificates() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ASN1Set getCRLs() {
        return this.getOutputFormats;
    }

    public static org.bouncycastle.asn1.cms.SignedData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cms.SignedData) {
            return (org.bouncycastle.asn1.cms.SignedData) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cms.SignedData(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private SignedData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Integer.getInstance(objects.nextElement());
        this.getInputFormats = (org.bouncycastle.asn1.ASN1Set) objects.nextElement();
        this.getOutputMinFrameDuration = org.bouncycastle.asn1.cms.ContentInfo.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = (org.bouncycastle.asn1.ASN1Primitive) objects.nextElement();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Primitive;
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    this.getInputSizeshNQ4ISI = aSN1TaggedObject instanceof org.bouncycastle.asn1.BERTaggedObject;
                    this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Set.getInstance(aSN1TaggedObject, false);
                } else {
                    if (tagNo != 1) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown tag value ");
                        sb.append(aSN1TaggedObject.getTagNo());
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                    this.getHighSpeedVideoSizesFor = aSN1TaggedObject instanceof org.bouncycastle.asn1.BERTaggedObject;
                    this.getOutputFormats = org.bouncycastle.asn1.ASN1Set.getInstance(aSN1TaggedObject, false);
                }
            } else {
                this.getOutputMinFrameDurationlomOqCM = (org.bouncycastle.asn1.ASN1Set) aSN1Primitive;
            }
        }
    }
}
