package org.bouncycastle.asn1.pkcs;

/* loaded from: classes17.dex */
public class SignedData extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers {
    private org.bouncycastle.asn1.ASN1Set Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Set getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Set getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.pkcs.ContentInfo getHighSpeedVideoSizes;
    private org.bouncycastle.asn1.ASN1Integer getOutputFormats;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.getOutputFormats);
        aSN1EncodableVector.add(this.getHighResolutionOutputSizeshNQ4ISI);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        org.bouncycastle.asn1.ASN1Set aSN1Set = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Set != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set));
        }
        org.bouncycastle.asn1.ASN1Set aSN1Set2 = this.getHighSpeedVideoFpsRanges;
        if (aSN1Set2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1Set2));
        }
        aSN1EncodableVector.add(this.Camera2StreamConfigurationMap);
        return new org.bouncycastle.asn1.BERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.ASN1Integer getVersion() {
        return this.getOutputFormats;
    }

    public org.bouncycastle.asn1.ASN1Set getSignerInfos() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.ASN1Set getDigestAlgorithms() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.pkcs.ContentInfo getContentInfo() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1Set getCertificates() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.ASN1Set getCRLs() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.pkcs.SignedData getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.pkcs.SignedData) {
            return (org.bouncycastle.asn1.pkcs.SignedData) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.pkcs.SignedData(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public SignedData(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getOutputFormats = (org.bouncycastle.asn1.ASN1Integer) objects.nextElement();
        this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.asn1.ASN1Set) objects.nextElement();
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.pkcs.ContentInfo.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1Primitive aSN1Primitive = (org.bouncycastle.asn1.ASN1Primitive) objects.nextElement();
            if (aSN1Primitive instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
                org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) aSN1Primitive;
                int tagNo = aSN1TaggedObject.getTagNo();
                if (tagNo == 0) {
                    this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.ASN1Set.getInstance(aSN1TaggedObject, false);
                } else {
                    if (tagNo != 1) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown tag value ");
                        sb.append(aSN1TaggedObject.getTagNo());
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                    this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.ASN1Set.getInstance(aSN1TaggedObject, false);
                }
            } else {
                this.Camera2StreamConfigurationMap = (org.bouncycastle.asn1.ASN1Set) aSN1Primitive;
            }
        }
    }

    public SignedData(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.asn1.ASN1Set aSN1Set, org.bouncycastle.asn1.pkcs.ContentInfo contentInfo, org.bouncycastle.asn1.ASN1Set aSN1Set2, org.bouncycastle.asn1.ASN1Set aSN1Set3, org.bouncycastle.asn1.ASN1Set aSN1Set4) {
        this.getOutputFormats = aSN1Integer;
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Set;
        this.getHighSpeedVideoSizes = contentInfo;
        this.getHighSpeedVideoFpsRangesFor = aSN1Set2;
        this.getHighSpeedVideoFpsRanges = aSN1Set3;
        this.Camera2StreamConfigurationMap = aSN1Set4;
    }
}
