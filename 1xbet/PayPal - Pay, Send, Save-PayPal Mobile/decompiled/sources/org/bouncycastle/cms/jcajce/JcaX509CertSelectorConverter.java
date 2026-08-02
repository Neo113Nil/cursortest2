package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public class JcaX509CertSelectorConverter extends org.bouncycastle.cert.selector.jcajce.JcaX509CertSelectorConverter {
    public java.security.cert.X509CertSelector getCertSelector(org.bouncycastle.cms.SignerId signerId) {
        return doConversion(signerId.getIssuer(), signerId.getSerialNumber(), signerId.getSubjectKeyIdentifier());
    }

    public java.security.cert.X509CertSelector getCertSelector(org.bouncycastle.cms.KeyTransRecipientId keyTransRecipientId) {
        return doConversion(keyTransRecipientId.getIssuer(), keyTransRecipientId.getSerialNumber(), keyTransRecipientId.getSubjectKeyIdentifier());
    }
}
