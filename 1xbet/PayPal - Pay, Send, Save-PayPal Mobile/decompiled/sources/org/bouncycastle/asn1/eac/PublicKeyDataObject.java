package org.bouncycastle.asn1.eac;

/* loaded from: classes17.dex */
public abstract class PublicKeyDataObject extends org.bouncycastle.asn1.ASN1Object {
    public abstract org.bouncycastle.asn1.ASN1ObjectIdentifier getUsage();

    public static org.bouncycastle.asn1.eac.PublicKeyDataObject getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.eac.PublicKeyDataObject) {
            return (org.bouncycastle.asn1.eac.PublicKeyDataObject) obj;
        }
        if (obj == null) {
            return null;
        }
        org.bouncycastle.asn1.ASN1Sequence aSN1Sequence = org.bouncycastle.asn1.ASN1Sequence.getInstance(obj);
        return org.bouncycastle.asn1.ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0)).on(org.bouncycastle.asn1.eac.EACObjectIdentifiers.id_TA_ECDSA) ? new org.bouncycastle.asn1.eac.ECDSAPublicKey(aSN1Sequence) : new org.bouncycastle.asn1.eac.RSAPublicKey(aSN1Sequence);
    }
}
