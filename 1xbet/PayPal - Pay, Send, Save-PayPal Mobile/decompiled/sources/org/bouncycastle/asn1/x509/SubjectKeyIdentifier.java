package org.bouncycastle.asn1.x509;

/* loaded from: classes17.dex */
public class SubjectKeyIdentifier extends org.bouncycastle.asn1.ASN1Object {
    private byte[] getHighSpeedVideoSizes;

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public org.bouncycastle.asn1.ASN1Primitive toASN1Primitive() {
        return new org.bouncycastle.asn1.DEROctetString(getKeyIdentifier());
    }

    public byte[] getKeyIdentifier() {
        return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes);
    }

    public static org.bouncycastle.asn1.x509.SubjectKeyIdentifier getInstance(org.bouncycastle.asn1.ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return getInstance(org.bouncycastle.asn1.ASN1OctetString.getInstance(aSN1TaggedObject, z));
    }

    public static org.bouncycastle.asn1.x509.SubjectKeyIdentifier getInstance(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.asn1.x509.SubjectKeyIdentifier) {
            return (org.bouncycastle.asn1.x509.SubjectKeyIdentifier) obj;
        }
        if (obj != null) {
            return new org.bouncycastle.asn1.x509.SubjectKeyIdentifier(org.bouncycastle.asn1.ASN1OctetString.getInstance(obj));
        }
        return null;
    }

    public static org.bouncycastle.asn1.x509.SubjectKeyIdentifier fromExtensions(org.bouncycastle.asn1.x509.Extensions extensions) {
        return getInstance(org.bouncycastle.asn1.x509.Extensions.getExtensionParsedValue(extensions, org.bouncycastle.asn1.x509.Extension.subjectKeyIdentifier));
    }

    public SubjectKeyIdentifier(byte[] bArr) {
        this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(bArr);
    }

    protected SubjectKeyIdentifier(org.bouncycastle.asn1.ASN1OctetString aSN1OctetString) {
        this(aSN1OctetString.getOctets());
    }
}
