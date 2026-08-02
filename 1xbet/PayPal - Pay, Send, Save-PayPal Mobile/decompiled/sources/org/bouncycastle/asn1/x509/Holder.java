package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class Holder extends org.bouncycastle.asn1.ASN1Object {
    public static final int V1_CERTIFICATE_HOLDER = 0;
    public static final int V2_CERTIFICATE_HOLDER = 1;
    org.bouncycastle.asn1.x509.ObjectDigestInfo Camera2StreamConfigurationMap;
    private int getHighResolutionOutputSizeshNQ4ISI;
    org.bouncycastle.asn1.x509.IssuerSerial getHighSpeedVideoFpsRangesFor;
    org.bouncycastle.asn1.x509.GeneralNames getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        if (this.getHighResolutionOutputSizeshNQ4ISI != 1) {
            org.bouncycastle.asn1.x509.GeneralNames generalNames = this.getHighSpeedVideoSizes;
            return generalNames != null ? new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) generalNames) : new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) this.getHighSpeedVideoFpsRangesFor);
        }
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        org.bouncycastle.asn1.x509.IssuerSerial issuerSerial = this.getHighSpeedVideoFpsRangesFor;
        if (issuerSerial != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) issuerSerial));
        }
        org.bouncycastle.asn1.x509.GeneralNames generalNames2 = this.getHighSpeedVideoSizes;
        if (generalNames2 != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) generalNames2));
        }
        org.bouncycastle.asn1.x509.ObjectDigestInfo objectDigestInfo = this.Camera2StreamConfigurationMap;
        if (objectDigestInfo != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(false, 2, (org.bouncycastle.asn1.ASN1Encodable) objectDigestInfo));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public int getVersion() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.asn1.x509.ObjectDigestInfo getObjectDigestInfo() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.x509.GeneralNames getEntityName() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.x509.IssuerSerial getBaseCertificateID() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.x509.Holder getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.Holder) {
            return (org.bouncycastle.asn1.x509.Holder) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            return new org.bouncycastle.asn1.x509.Holder(org.bouncycastle.asn1.ASN1TaggedObject.getInstance(obj));
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.Holder(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public Holder(org.bouncycastle.asn1.x509.ObjectDigestInfo objectDigestInfo) {
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        this.Camera2StreamConfigurationMap = objectDigestInfo;
    }

    public Holder(org.bouncycastle.asn1.x509.IssuerSerial issuerSerial, int i) {
        this.getHighSpeedVideoFpsRangesFor = issuerSerial;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public Holder(org.bouncycastle.asn1.x509.IssuerSerial issuerSerial) {
        this(issuerSerial, 1);
    }

    public Holder(org.bouncycastle.asn1.x509.GeneralNames generalNames, int i) {
        this.getHighSpeedVideoSizes = generalNames;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public Holder(org.bouncycastle.asn1.x509.GeneralNames generalNames) {
        this(generalNames, 1);
    }

    private Holder(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject) {
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.IssuerSerial.getInstance(aSN1TaggedObject, true);
        } else {
            if (tagNo != 1) {
                throw new java.lang.IllegalArgumentException("unknown tag in Holder");
            }
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.GeneralNames.getInstance(aSN1TaggedObject, true);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
    }

    private Holder(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        if (aSN1Sequence.size() > 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Bad sequence size: ");
            sb.append(aSN1Sequence.size());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i != aSN1Sequence.size(); i++) {
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(i));
            int tagNo = aSN1TaggedObject.getTagNo();
            if (tagNo == 0) {
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.x509.IssuerSerial.getInstance(aSN1TaggedObject, false);
            } else if (tagNo == 1) {
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.x509.GeneralNames.getInstance(aSN1TaggedObject, false);
            } else {
                if (tagNo != 2) {
                    throw new java.lang.IllegalArgumentException("unknown tag in Holder");
                }
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.x509.ObjectDigestInfo.getInstance(aSN1TaggedObject, false);
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
    }
}
