package org.bouncycastle.asn1.esf;

/* loaded from: classes17.dex */
public class RevocationValues extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.esf.OtherRevVals getHighSpeedVideoFpsRanges;
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.Camera2StreamConfigurationMap;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) aSN1Sequence));
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Sequence2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) aSN1Sequence2));
        }
        org.bouncycastle.asn1.esf.OtherRevVals otherRevVals = this.getHighSpeedVideoFpsRanges;
        if (otherRevVals != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 2, (org.bouncycastle.asn1.ASN1Encodable) otherRevVals.toASN1Primitive()));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.esf.OtherRevVals getOtherRevVals() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.ocsp.BasicOCSPResponse[] getOcspVals() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.getHighSpeedVideoFpsRangesFor;
        if (aSN1Sequence == null) {
            return new org.bouncycastle.asn1.ocsp.BasicOCSPResponse[0];
        }
        int size = aSN1Sequence.size();
        org.bouncycastle.asn1.ocsp.BasicOCSPResponse[] basicOCSPResponseArr = new org.bouncycastle.asn1.ocsp.BasicOCSPResponse[size];
        for (int i = 0; i < size; i++) {
            basicOCSPResponseArr[i] = org.bouncycastle.asn1.ocsp.BasicOCSPResponse.getInstance(this.getHighSpeedVideoFpsRangesFor.getObjectAt(i));
        }
        return basicOCSPResponseArr;
    }

    public org.bouncycastle.asn1.x509.CertificateList[] getCrlVals() {
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = this.Camera2StreamConfigurationMap;
        if (aSN1Sequence == null) {
            return new org.bouncycastle.asn1.x509.CertificateList[0];
        }
        int size = aSN1Sequence.size();
        org.bouncycastle.asn1.x509.CertificateList[] certificateListArr = new org.bouncycastle.asn1.x509.CertificateList[size];
        for (int i = 0; i < size; i++) {
            certificateListArr[i] = org.bouncycastle.asn1.x509.CertificateList.getInstance(this.Camera2StreamConfigurationMap.getObjectAt(i));
        }
        return certificateListArr;
    }

    public static org.bouncycastle.asn1.esf.RevocationValues getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.esf.RevocationValues) {
            return (org.bouncycastle.asn1.esf.RevocationValues) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.esf.RevocationValues(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public RevocationValues(org.bouncycastle.asn1.x509.CertificateList[] certificateListArr, org.bouncycastle.asn1.ocsp.BasicOCSPResponse[] basicOCSPResponseArr, org.bouncycastle.asn1.esf.OtherRevVals otherRevVals) {
        if (certificateListArr != null) {
            this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.DERSequence(certificateListArr);
        }
        if (basicOCSPResponseArr != null) {
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.asn1.DERSequence(basicOCSPResponseArr);
        }
        this.getHighSpeedVideoFpsRanges = otherRevVals;
    }

    private RevocationValues(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() > 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.util.Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = (org.bouncycastle.asn1.ASN1TaggedObject) objects.nextElement();
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                org.bouncycastle.asn1.ASN1Sequence aSN1Sequence2 = (org.bouncycastle.asn1.ASN1Sequence) aSN1TaggedObject.getObject();
                java.util.Enumeration objects2 = aSN1Sequence2.getObjects();
                while (objects2.hasMoreElements()) {
                    org.bouncycastle.asn1.x509.CertificateList.getInstance(objects2.nextElement());
                }
                this.Camera2StreamConfigurationMap = aSN1Sequence2;
            } else if (tagNo == 1) {
                org.bouncycastle.asn1.ASN1Sequence aSN1Sequence3 = (org.bouncycastle.asn1.ASN1Sequence) aSN1TaggedObject.getObject();
                java.util.Enumeration objects3 = aSN1Sequence3.getObjects();
                while (objects3.hasMoreElements()) {
                    org.bouncycastle.asn1.ocsp.BasicOCSPResponse.getInstance(objects3.nextElement());
                }
                this.getHighSpeedVideoFpsRangesFor = aSN1Sequence3;
            } else {
                if (tagNo != 2) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("invalid tag: ");
                    sb2.append(aSN1TaggedObject.getTagNo());
                    throw new java.lang.IllegalArgumentException(sb2.toString());
                }
                this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.esf.OtherRevVals.getInstance(aSN1TaggedObject.getObject());
            }
        }
    }
}
