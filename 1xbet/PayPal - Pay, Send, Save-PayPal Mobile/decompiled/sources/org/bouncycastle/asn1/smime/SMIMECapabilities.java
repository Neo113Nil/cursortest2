package org.bouncycastle.asn1.smime;

/* loaded from: classes17.dex */
public class SMIMECapabilities extends org.bouncycastle.asn1.ASN1Object {
    private org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier preferSignedData = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.preferSignedData;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier canNotDecryptAny = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.canNotDecryptAny;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier sMIMECapabilitesVersions = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.sMIMECapabilitiesVersions;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier aes256_CBC = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes256_CBC;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier aes192_CBC = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes192_CBC;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier aes128_CBC = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_aes128_CBC;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier idea_CBC = new org.bouncycastle.asn1.ASN1ObjectIdentifier(org.bouncycastle.cms.CMSEnvelopedGenerator.IDEA_CBC);
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier cast5_CBC = new org.bouncycastle.asn1.ASN1ObjectIdentifier(org.bouncycastle.cms.CMSEnvelopedGenerator.CAST5_CBC);
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier dES_CBC = new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.3.14.3.2.7");
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier dES_EDE3_CBC = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.des_EDE3_CBC;
    public static final org.bouncycastle.asn1.ASN1ObjectIdentifier rC2_CBC = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.RC2_CBC;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.util.Vector getCapabilities(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        java.util.Enumeration objects = this.getHighSpeedVideoFpsRanges.getObjects();
        java.util.Vector vector = new java.util.Vector();
        if (aSN1ObjectIdentifier == null) {
            while (objects.hasMoreElements()) {
                vector.addElement(org.bouncycastle.asn1.smime.SMIMECapability.getInstance(objects.nextElement()));
            }
        } else {
            while (objects.hasMoreElements()) {
                org.bouncycastle.asn1.smime.SMIMECapability sMIMECapability = org.bouncycastle.asn1.smime.SMIMECapability.getInstance(objects.nextElement());
                if (aSN1ObjectIdentifier.equals((org.bouncycastle.asn1.ASN1Primitive) sMIMECapability.getCapabilityID())) {
                    vector.addElement(sMIMECapability);
                }
            }
        }
        return vector;
    }

    public static org.bouncycastle.asn1.smime.SMIMECapabilities getInstance(java.lang.Object obj) {
        if (obj == null || (obj instanceof org.bouncycastle.asn1.smime.SMIMECapabilities)) {
            return (org.bouncycastle.asn1.smime.SMIMECapabilities) obj;
        }
        if (obj instanceof org.bouncycastle.asn1.ASN1Sequence) {
            return new org.bouncycastle.asn1.smime.SMIMECapabilities((org.bouncycastle.asn1.ASN1Sequence) obj);
        }
        if (obj instanceof org.bouncycastle.asn1.cms.Attribute) {
            return new org.bouncycastle.asn1.smime.SMIMECapabilities((org.bouncycastle.asn1.ASN1Sequence) ((org.bouncycastle.asn1.cms.Attribute) obj).getAttrValues().getObjectAt(0));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown object in factory: ");
        sb.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public SMIMECapabilities(org.bouncycastle.asn1.ASN1Sequence aSN1Sequence) {
        this.getHighSpeedVideoFpsRanges = aSN1Sequence;
    }
}
