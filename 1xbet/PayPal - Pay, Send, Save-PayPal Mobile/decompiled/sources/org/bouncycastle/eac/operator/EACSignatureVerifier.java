package org.bouncycastle.eac.operator;

/* loaded from: classes17.dex */
public interface EACSignatureVerifier {
    java.io.OutputStream getOutputStream();

    org.bouncycastle.asn1.ASN1ObjectIdentifier getUsageIdentifier();

    boolean verify(byte[] bArr);
}
