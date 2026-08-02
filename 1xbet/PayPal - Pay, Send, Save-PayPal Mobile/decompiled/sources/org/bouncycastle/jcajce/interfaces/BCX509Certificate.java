package org.bouncycastle.jcajce.interfaces;

/* loaded from: classes17.dex */
public interface BCX509Certificate {
    org.bouncycastle.asn1.x500.X500Name getIssuerX500Name();

    org.bouncycastle.asn1.x500.X500Name getSubjectX500Name();

    org.bouncycastle.asn1.x509.TBSCertificate getTBSCertificateNative();
}
