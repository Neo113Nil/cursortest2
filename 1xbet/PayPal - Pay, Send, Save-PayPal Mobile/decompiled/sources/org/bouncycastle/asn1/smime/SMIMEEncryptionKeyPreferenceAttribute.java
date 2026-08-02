package org.bouncycastle.asn1.smime;

/* loaded from: classes17.dex */
public class SMIMEEncryptionKeyPreferenceAttribute extends org.bouncycastle.asn1.cms.Attribute {
    public SMIMEEncryptionKeyPreferenceAttribute(org.bouncycastle.asn1.cms.RecipientKeyIdentifier recipientKeyIdentifier) {
        super(org.bouncycastle.asn1.smime.SMIMEAttributes.encrypKeyPref, new org.bouncycastle.asn1.DERSet(new org.bouncycastle.asn1.DERTaggedObject(false, 1, (org.bouncycastle.asn1.ASN1Encodable) recipientKeyIdentifier)));
    }

    public SMIMEEncryptionKeyPreferenceAttribute(org.bouncycastle.asn1.cms.IssuerAndSerialNumber issuerAndSerialNumber) {
        super(org.bouncycastle.asn1.smime.SMIMEAttributes.encrypKeyPref, new org.bouncycastle.asn1.DERSet(new org.bouncycastle.asn1.DERTaggedObject(false, 0, (org.bouncycastle.asn1.ASN1Encodable) issuerAndSerialNumber)));
    }

    public SMIMEEncryptionKeyPreferenceAttribute(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        super(org.bouncycastle.asn1.smime.SMIMEAttributes.encrypKeyPref, new org.bouncycastle.asn1.DERSet(new org.bouncycastle.asn1.DERTaggedObject(false, 2, (org.bouncycastle.asn1.ASN1Encodable) aSN1OctetString)));
    }
}
