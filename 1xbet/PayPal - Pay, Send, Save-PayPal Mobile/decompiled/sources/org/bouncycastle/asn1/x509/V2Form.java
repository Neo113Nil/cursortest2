package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class V2Form extends org.bouncycastle.asn1.ASN1Object {
    org.bouncycastle.asn1.x509.ObjectDigestInfo Camera2StreamConfigurationMap;
    org.bouncycastle.asn1.x509.GeneralNames getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.x509.IssuerSerial getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        org.bouncycastle.asn1.x509.GeneralNames generalNames = this.getHighSpeedVideoFpsRangesFor;
        if (generalNames != null) {
            aSN1EncodableVector.add(generalNames);
        }
        org.bouncycastle.asn1.x509.IssuerSerial issuerSerial = this.getHighSpeedVideoSizes;
        if (issuerSerial != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) issuerSerial));
        }
        org.bouncycastle.asn1.x509.ObjectDigestInfo objectDigestInfo = this.Camera2StreamConfigurationMap;
        if (objectDigestInfo != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) objectDigestInfo));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.x509.ObjectDigestInfo getObjectDigestInfo() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.GeneralNames getIssuerName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.x509.IssuerSerial getBaseCertificateID() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.x509.V2Form getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.V2Form getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.V2Form) {
            return (org.bouncycastle.asn1.x509.V2Form) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.V2Form(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public V2Form(org.bouncycastle.asn1.x509.GeneralNames generalNames, org.bouncycastle.asn1.x509.ObjectDigestInfo objectDigestInfo) {
        this(generalNames, null, objectDigestInfo);
    }

    public V2Form(org.bouncycastle.asn1.x509.GeneralNames generalNames, org.bouncycastle.asn1.x509.IssuerSerial issuerSerial, org.bouncycastle.asn1.x509.ObjectDigestInfo objectDigestInfo) {
        this.getHighSpeedVideoFpsRangesFor = generalNames;
        this.getHighSpeedVideoSizes = issuerSerial;
        this.Camera2StreamConfigurationMap = objectDigestInfo;
    }

    public V2Form(org.bouncycastle.asn1.x509.GeneralNames generalNames, org.bouncycastle.asn1.x509.IssuerSerial issuerSerial) {
        this(generalNames, issuerSerial, null);
    }

    public V2Form(org.bouncycastle.asn1.x509.GeneralNames generalNames) {
        this(generalNames, null, null);
    }

    private V2Form(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        int i;
        if (aSN1Sequence.size() > 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (aSN1Sequence.getObjectAt(0) instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            i = 0;
        } else {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.GeneralNames.getInstance(aSN1Sequence.getObjectAt(0));
            i = 1;
        }
        while (i != aSN1Sequence.size()) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i));
            if (aSN1TaggedObject.getTagNo() == 0) {
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.IssuerSerial.getInstance(aSN1TaggedObject, false);
            } else {
                if (aSN1TaggedObject.getTagNo() != 1) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Bad tag number: ");
                    sb2.append(aSN1TaggedObject.getTagNo());
                    throw new java.lang.IllegalArgumentException(sb2.toString());
                }
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.ObjectDigestInfo.getInstance(aSN1TaggedObject, false);
            }
            i++;
        }
    }
}
