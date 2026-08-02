package org.bouncycastle.asn1.crmf;

/* loaded from: classes17.dex */
public class EncryptedKey extends org.bouncycastle.asn1.ASN1Object implements org.bouncycastle.asn1.ASN1Choice {
    private org.bouncycastle.asn1.crmf.EncryptedValue Camera2StreamConfigurationMap;
    private org.bouncycastle.asn1.cms.EnvelopedData getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        org.bouncycastle.asn1.crmf.EncryptedValue encryptedValue = this.Camera2StreamConfigurationMap;
        return encryptedValue != null ? encryptedValue.toASN1Primitive() : new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) this.getHighSpeedVideoFpsRangesFor);
    }

    public boolean isEncryptedValue() {
        return this.Camera2StreamConfigurationMap != null;
    }

    public org.bouncycastle.asn1.ASN1Encodable getValue() {
        org.bouncycastle.asn1.crmf.EncryptedValue encryptedValue = this.Camera2StreamConfigurationMap;
        return encryptedValue != null ? encryptedValue : this.getHighSpeedVideoFpsRangesFor;
    }

    public static org.bouncycastle.asn1.crmf.EncryptedKey getInstance(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.asn1.crmf.EncryptedKey ? (org.bouncycastle.asn1.crmf.EncryptedKey) obj : obj instanceof org.bouncycastle.asn1.ASN1TaggedObject ? new org.bouncycastle.asn1.crmf.EncryptedKey(org.bouncycastle.asn1.cms.EnvelopedData.getInstance((org.bouncycastle.asn1.ASN1TaggedObject) obj, false)) : obj instanceof org.bouncycastle.asn1.crmf.EncryptedValue ? new org.bouncycastle.asn1.crmf.EncryptedKey((org.bouncycastle.asn1.crmf.EncryptedValue) obj) : new org.bouncycastle.asn1.crmf.EncryptedKey(org.bouncycastle.asn1.crmf.EncryptedValue.getInstance(obj));
    }

    public EncryptedKey(org.bouncycastle.asn1.crmf.EncryptedValue encryptedValue) {
        this.Camera2StreamConfigurationMap = encryptedValue;
    }

    public EncryptedKey(org.bouncycastle.asn1.cms.EnvelopedData envelopedData) {
        this.getHighSpeedVideoFpsRangesFor = envelopedData;
    }
}
