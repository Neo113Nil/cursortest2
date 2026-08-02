package org.bouncycastle.asn1.cmp;

/* loaded from: classes17.dex */
public class CertOrEncCert extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    private org.bouncycastle.asn1.crmf.EncryptedKey Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.cmp.CMPCertificate getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.cmp.CMPCertificate cMPCertificate = this.getHighSpeedVideoFpsRanges;
        return cMPCertificate != null ? new org.bouncycastle.asn1.DERTaggedObject(true, 0, (org.bouncycastle.asn1.ASN1Encodable) cMPCertificate) : new org.bouncycastle.asn1.DERTaggedObject(true, 1, (org.bouncycastle.asn1.ASN1Encodable) this.Camera2StreamConfigurationMap);
    }

    public org.bouncycastle.asn1.crmf.EncryptedKey getEncryptedCert() {
        return this.Camera2StreamConfigurationMap;
    }

    public org.bouncycastle.asn1.cmp.CMPCertificate getCertificate() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static org.bouncycastle.asn1.cmp.CertOrEncCert getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.cmp.CertOrEncCert) {
            return (org.bouncycastle.asn1.cmp.CertOrEncCert) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1TaggedObject) {
            return new org.bouncycastle.asn1.cmp.CertOrEncCert((org.bouncycastle.asn1.ASN1TaggedObject) obj);
        }
        return null;
    }

    public CertOrEncCert(org.bouncycastle.asn1.crmf.EncryptedValue encryptedValue) {
        if (encryptedValue == null) {
            throw new java.lang.IllegalArgumentException("'encryptedCert' cannot be null");
        }
        this.Camera2StreamConfigurationMap = new org.bouncycastle.asn1.crmf.EncryptedKey(encryptedValue);
    }

    public CertOrEncCert(org.bouncycastle.asn1.crmf.EncryptedKey encryptedKey) {
        if (encryptedKey == null) {
            throw new java.lang.IllegalArgumentException("'encryptedKey' cannot be null");
        }
        this.Camera2StreamConfigurationMap = encryptedKey;
    }

    public CertOrEncCert(org.bouncycastle.asn1.cmp.CMPCertificate cMPCertificate) {
        if (cMPCertificate == null) {
            throw new java.lang.IllegalArgumentException("'certificate' cannot be null");
        }
        this.getHighSpeedVideoFpsRanges = cMPCertificate;
    }

    private CertOrEncCert(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject) {
        if (aSN1TaggedObject.getTagNo() == 0) {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.cmp.CMPCertificate.getInstance(aSN1TaggedObject.getObject());
        } else if (aSN1TaggedObject.getTagNo() == 1) {
            this.Camera2StreamConfigurationMap = org.bouncycastle.asn1.crmf.EncryptedKey.getInstance(aSN1TaggedObject.getObject());
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown tag: ");
            sb.append(aSN1TaggedObject.getTagNo());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }
}
