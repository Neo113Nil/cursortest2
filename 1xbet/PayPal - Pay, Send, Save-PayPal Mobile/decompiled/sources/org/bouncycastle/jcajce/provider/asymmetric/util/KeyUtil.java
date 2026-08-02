package org.bouncycastle.jcajce.provider.asymmetric.util;

/* loaded from: classes17.dex */
public class KeyUtil {
    public static byte[] getEncodedSubjectPublicKeyInfo(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        try {
            return subjectPublicKeyInfo.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, byte[] bArr) {
        try {
            return getEncodedSubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(algorithmIdentifier, bArr));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedSubjectPublicKeyInfo(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        try {
            return getEncodedSubjectPublicKeyInfo(new org.bouncycastle.asn1.x509.SubjectPublicKeyInfo(algorithmIdentifier, aSN1Encodable));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedPrivateKeyInfo(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, org.bouncycastle.asn1.ASN1Encodable aSN1Encodable) {
        try {
            return getEncodedPrivateKeyInfo(new org.bouncycastle.asn1.pkcs.PrivateKeyInfo(algorithmIdentifier, aSN1Encodable.toASN1Primitive()));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static byte[] getEncodedPrivateKeyInfo(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) {
        try {
            return privateKeyInfo.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
