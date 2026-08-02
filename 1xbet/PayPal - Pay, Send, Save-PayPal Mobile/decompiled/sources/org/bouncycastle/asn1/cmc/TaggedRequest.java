package org.bouncycastle.asn1.cmc;

/* loaded from: classes17.dex */
public class TaggedRequest extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    public static final int CRM = 1;
    public static final int ORM = 2;
    public static final int TCR = 0;
    private final org.bouncycastle.asn1.ASN1Encodable getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoSizes = 2;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DERTaggedObject(false, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public org.bouncycastle.asn1.ASN1Encodable getValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int getTagNo() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cmc.TaggedRequest getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmc.TaggedRequest) {
            return (org.bouncycastle.asn1.cmc.TaggedRequest) obj;
        }
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof org.bouncycastle.asn1.ASN1Encodable)) {
            if (obj instanceof byte[]) {
                try {
                    return getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray((byte[]) obj));
                } catch (java.io.IOException unused) {
                    throw new java.lang.IllegalArgumentException("unknown encoding in getInstance()");
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object in getInstance(): ");
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(((org.bouncycastle.asn1.ASN1Encodable) obj).toASN1Primitive());
        int tagNo = aSN1TaggedObject.getTagNo();
        if (tagNo == 0) {
            return new org.bouncycastle.asn1.cmc.TaggedRequest(org.bouncycastle.asn1.cmc.TaggedCertificationRequest.getInstance(aSN1TaggedObject, false));
        }
        if (tagNo == 1) {
            return new org.bouncycastle.asn1.cmc.TaggedRequest(org.bouncycastle.asn1.crmf.CertReqMsg.getInstance(aSN1TaggedObject, false));
        }
        if (tagNo == 2) {
            return new org.bouncycastle.asn1.cmc.TaggedRequest(org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1TaggedObject, false));
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unknown tag in getInstance(): ");
        sb2.append(aSN1TaggedObject.getTagNo());
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    public TaggedRequest(org.bouncycastle.asn1.crmf.CertReqMsg certReqMsg) {
        this.getHighResolutionOutputSizeshNQ4ISI = certReqMsg;
    }

    public TaggedRequest(org.bouncycastle.asn1.cmc.TaggedCertificationRequest taggedCertificationRequest) {
        this.getHighResolutionOutputSizeshNQ4ISI = taggedCertificationRequest;
    }

    private TaggedRequest(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighResolutionOutputSizeshNQ4ISI = aSN1Sequence;
    }
}
