package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class KeyRecRepContent extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.ASN1Sequence getHighResolutionOutputSizeshNQ4ISI;
    private org.bouncycastle.asn1.cmp.PKIStatusInfo getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.cmp.CMPCertificate getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(4);
        aSN1EncodableVector.add(this.getHighSpeedVideoFpsRanges);
        org.bouncycastle.asn1.cmp.CMPCertificate cMPCertificate = this.getHighSpeedVideoSizes;
        if (cMPCertificate != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) cMPCertificate));
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.Camera2StreamConfigurationMap;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1Sequence));
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Sequence2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 2, (org.bouncycastle.asn1.ASN1Encodable) aSN1Sequence2));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.cmp.PKIStatusInfo getStatus() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.cmp.CMPCertificate getNewSigCert() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.cmp.CertifiedKeyPair[] getKeyPairHist() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighResolutionOutputSizeshNQ4ISI;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        org.bouncycastle.asn1.cmp.CertifiedKeyPair[] certifiedKeyPairArr = new org.bouncycastle.asn1.cmp.CertifiedKeyPair[size];
        for (int i = 0; i != size; i++) {
            certifiedKeyPairArr[i] = org.bouncycastle.asn1.cmp.CertifiedKeyPair.getInstance(this.getHighResolutionOutputSizeshNQ4ISI.getObjectAt(i));
        }
        return certifiedKeyPairArr;
    }

    public org.bouncycastle.asn1.cmp.CMPCertificate[] getCaCerts() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.Camera2StreamConfigurationMap;
        if (aSN1Sequence == null) {
            return null;
        }
        int size = aSN1Sequence.size();
        org.bouncycastle.asn1.cmp.CMPCertificate[] cMPCertificateArr = new org.bouncycastle.asn1.cmp.CMPCertificate[size];
        for (int i = 0; i != size; i++) {
            cMPCertificateArr[i] = org.bouncycastle.asn1.cmp.CMPCertificate.getInstance(this.Camera2StreamConfigurationMap.getObjectAt(i));
        }
        return cMPCertificateArr;
    }

    public static org.bouncycastle.asn1.cmp.KeyRecRepContent getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.KeyRecRepContent) {
            return (org.bouncycastle.asn1.cmp.KeyRecRepContent) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.KeyRecRepContent(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private KeyRecRepContent(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.cmp.PKIStatusInfo.getInstance(objects.nextElement());
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(objects.nextElement());
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.cmp.CMPCertificate.getInstance(aSN1TaggedObject.getObject());
            } else if (tagNo == 1) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject.getObject());
            } else {
                if (tagNo != 2) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown tag number: ");
                    sb.append(aSN1TaggedObject.getTagNo());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject.getObject());
            }
        }
    }
}
