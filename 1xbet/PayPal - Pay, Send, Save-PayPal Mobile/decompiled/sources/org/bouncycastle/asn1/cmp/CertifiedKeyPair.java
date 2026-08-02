package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class CertifiedKeyPair extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.crmf.EncryptedKey Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.crmf.PKIPublicationInfo getHighSpeedVideoFpsRangesFor;
    private org.bouncycastle.asn1.cmp.CertOrEncCert getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.ASN1EncodableVector aSN1EncodableVector = new org.bouncycastle.asn1.ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.getHighSpeedVideoSizes);
        org.bouncycastle.asn1.crmf.EncryptedKey encryptedKey = this.Camera2StreamConfigurationMap;
        if (encryptedKey != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) encryptedKey));
        }
        org.bouncycastle.asn1.crmf.PKIPublicationInfo pKIPublicationInfo = this.getHighSpeedVideoFpsRangesFor;
        if (pKIPublicationInfo != null) {
            aSN1EncodableVector.add(new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) pKIPublicationInfo));
        }
        return new org.bouncycastle.asn1.DERSequence(aSN1EncodableVector);
    }

    public org.bouncycastle.asn1.crmf.PKIPublicationInfo getPublicationInfo() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public org.bouncycastle.asn1.crmf.EncryptedKey getPrivateKey() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.cmp.CertOrEncCert getCertOrEncCert() {
        return this.getHighSpeedVideoSizes;
    }

    public static org.bouncycastle.asn1.cmp.CertifiedKeyPair getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.CertifiedKeyPair) {
            return (org.bouncycastle.asn1.cmp.CertifiedKeyPair) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.cmp.CertifiedKeyPair(org.bouncycastle.asn1.ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public CertifiedKeyPair(org.bouncycastle.asn1.cmp.CertOrEncCert certOrEncCert, org.bouncycastle.asn1.crmf.EncryptedValue encryptedValue, org.bouncycastle.asn1.crmf.PKIPublicationInfo pKIPublicationInfo) {
        if (certOrEncCert == null) {
            throw new java.lang.IllegalArgumentException("'certOrEncCert' cannot be null");
        }
        this.getHighSpeedVideoSizes = certOrEncCert;
        this.Camera2StreamConfigurationMap = encryptedValue != null ? new org.bouncycastle.asn1.crmf.EncryptedKey(encryptedValue) : null;
        this.getHighSpeedVideoFpsRangesFor = pKIPublicationInfo;
    }

    public CertifiedKeyPair(org.bouncycastle.asn1.cmp.CertOrEncCert certOrEncCert, org.bouncycastle.asn1.crmf.EncryptedKey encryptedKey, org.bouncycastle.asn1.crmf.PKIPublicationInfo pKIPublicationInfo) {
        if (certOrEncCert == null) {
            throw new java.lang.IllegalArgumentException("'certOrEncCert' cannot be null");
        }
        this.getHighSpeedVideoSizes = certOrEncCert;
        this.Camera2StreamConfigurationMap = encryptedKey;
        this.getHighSpeedVideoFpsRangesFor = pKIPublicationInfo;
    }

    public CertifiedKeyPair(org.bouncycastle.asn1.cmp.CertOrEncCert certOrEncCert) {
        this(certOrEncCert, (org.bouncycastle.asn1.crmf.EncryptedKey) null, (org.bouncycastle.asn1.crmf.PKIPublicationInfo) null);
    }

    private CertifiedKeyPair(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoSizes = org.bouncycastle.asn1.cmp.CertOrEncCert.getInstance(aSN1Sequence.getObjectAt(0));
        if (aSN1Sequence.size() >= 2) {
            if (aSN1Sequence.size() != 2) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.crmf.EncryptedKey.getInstance(org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1)).getObject());
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.crmf.PKIPublicationInfo.getInstance(org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(2)).getObject());
                return;
            }
            org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject = org.bouncycastle.asn1.ASN1TaggedObject.getInstance(aSN1Sequence.getObjectAt(1));
            int tagNo = aSN1TaggedObject.getTagNo();
            org.bouncycastle.asn1.ASN1Primitive object = aSN1TaggedObject.getObject();
            if (tagNo == 0) {
                this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.crmf.EncryptedKey.getInstance(object);
            } else {
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.asn1.crmf.PKIPublicationInfo.getInstance(object);
            }
        }
    }
}
