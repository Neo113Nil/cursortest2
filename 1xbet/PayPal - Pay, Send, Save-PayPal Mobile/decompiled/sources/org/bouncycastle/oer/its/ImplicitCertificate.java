package org.bouncycastle.oer.its;

/* loaded from: classes17.dex */
public class ImplicitCertificate extends org.bouncycastle.oer.its.CertificateBase {
    public ImplicitCertificate(org.bouncycastle.asn1.ASN1Integer aSN1Integer, org.bouncycastle.oer.its.IssuerIdentifier issuerIdentifier, org.bouncycastle.oer.its.ToBeSignedCertificate toBeSignedCertificate, org.bouncycastle.oer.its.Signature signature) {
        super(aSN1Integer, org.bouncycastle.oer.its.CertificateType.Implicit, issuerIdentifier, toBeSignedCertificate, signature);
    }
}
