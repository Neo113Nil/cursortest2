package org.bouncycastle.pkcs;

/* loaded from: classes17.dex */
public class PKCS12SafeBag {
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier friendlyNameAttribute = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pkcs_9_at_friendlyName;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier localKeyIdAttribute = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pkcs_9_at_localKeyId;
    private org.bouncycastle.asn1.pkcs.SafeBag getHighSpeedVideoSizes;

    public org.bouncycastle.asn1.pkcs.SafeBag toASN1Structure() {
        return this.getHighSpeedVideoSizes;
    }

    public org.bouncycastle.asn1.ASN1ObjectIdentifier getType() {
        return this.getHighSpeedVideoSizes.getBagId();
    }

    public java.lang.Object getBagValue() {
        return getType().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pkcs8ShroudedKeyBag) ? new org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfo(org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo.getInstance(this.getHighSpeedVideoSizes.getBagValue())) : getType().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.certBag) ? new org.bouncycastle.cert.X509CertificateHolder(org.bouncycastle.asn1.x509.Certificate.getInstance(org.bouncycastle.asn1.ASN1OctetString.getInstance(org.bouncycastle.asn1.pkcs.CertBag.getInstance(this.getHighSpeedVideoSizes.getBagValue()).getCertValue()).getOctets())) : getType().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.keyBag) ? org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(this.getHighSpeedVideoSizes.getBagValue()) : getType().equals((org.bouncycastle.asn1.ASN1Primitive) org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.crlBag) ? new org.bouncycastle.cert.X509CRLHolder(org.bouncycastle.asn1.x509.CertificateList.getInstance(org.bouncycastle.asn1.ASN1OctetString.getInstance(org.bouncycastle.asn1.pkcs.CRLBag.getInstance(this.getHighSpeedVideoSizes.getBagValue()).getCrlValue()).getOctets())) : this.getHighSpeedVideoSizes.getBagValue();
    }

    public org.bouncycastle.asn1.pkcs.Attribute[] getAttributes() {
        org.bouncycastle.asn1.ASN1Set bagAttributes = this.getHighSpeedVideoSizes.getBagAttributes();
        if (bagAttributes == null) {
            return null;
        }
        org.bouncycastle.asn1.pkcs.Attribute[] attributeArr = new org.bouncycastle.asn1.pkcs.Attribute[bagAttributes.size()];
        for (int i = 0; i != bagAttributes.size(); i++) {
            attributeArr[i] = org.bouncycastle.asn1.pkcs.Attribute.getInstance(bagAttributes.getObjectAt(i));
        }
        return attributeArr;
    }

    public PKCS12SafeBag(org.bouncycastle.asn1.pkcs.SafeBag safeBag) {
        this.getHighSpeedVideoSizes = safeBag;
    }
}
