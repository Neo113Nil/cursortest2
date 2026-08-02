package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public class ZlibCompressor implements org.bouncycastle.operator.OutputCompressor {
    @Override // org.bouncycastle.operator.OutputCompressor
    public java.io.OutputStream getOutputStream(java.io.OutputStream outputStream) {
        return new java.util.zip.DeflaterOutputStream(outputStream);
    }

    @Override // org.bouncycastle.operator.OutputCompressor
    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
        return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(new org.bouncycastle.asn1.ASN1ObjectIdentifier("1.2.840.113549.1.9.16.3.8"));
    }
}
