package org.bouncycastle.jce;

/* loaded from: classes17.dex */
public class X509Principal extends org.bouncycastle.asn1.x509.X509Name implements java.security.Principal {
    @Override // java.security.Principal
    public java.lang.String getName() {
        return toString();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.util.Encodable
    public byte[] getEncoded() {
        try {
            return getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException(e.toString());
        }
    }

    private static org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.ASN1InputStream aSN1InputStream) throws java.io.IOException {
        try {
            return org.bouncycastle.asn1.ASN1Sequence.getInstance(aSN1InputStream.readObject());
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.io.IOException("not an ASN.1 Sequence: ".concat(java.lang.String.valueOf(e)));
        }
    }

    public X509Principal(byte[] bArr) throws java.io.IOException {
        super(getHighSpeedVideoFpsRanges(new org.bouncycastle.asn1.ASN1InputStream(bArr)));
    }

    public X509Principal(boolean z, java.util.Hashtable hashtable, java.lang.String str) {
        super(z, hashtable, str);
    }

    public X509Principal(boolean z, java.lang.String str) {
        super(z, str);
    }

    public X509Principal(org.bouncycastle.asn1.x509.X509Name x509Name) {
        super((org.bouncycastle.asn1.ASN1Sequence) x509Name.toASN1Primitive());
    }

    public X509Principal(org.bouncycastle.asn1.x500.X500Name x500Name) {
        super((org.bouncycastle.asn1.ASN1Sequence) x500Name.toASN1Primitive());
    }

    public X509Principal(java.util.Vector vector, java.util.Vector vector2) {
        super(vector, vector2);
    }

    public X509Principal(java.util.Vector vector, java.util.Hashtable hashtable) {
        super(vector, hashtable);
    }

    public X509Principal(java.util.Hashtable hashtable) {
        super(hashtable);
    }

    public X509Principal(java.lang.String str) {
        super(str);
    }
}
