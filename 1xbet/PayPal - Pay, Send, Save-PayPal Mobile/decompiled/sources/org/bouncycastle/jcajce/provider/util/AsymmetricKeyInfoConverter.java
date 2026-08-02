package org.bouncycastle.jcajce.provider.util;

/* loaded from: classes17.dex */
public interface AsymmetricKeyInfoConverter {
    java.security.PrivateKey generatePrivate(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) throws java.io.IOException;

    java.security.PublicKey generatePublic(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) throws java.io.IOException;
}
