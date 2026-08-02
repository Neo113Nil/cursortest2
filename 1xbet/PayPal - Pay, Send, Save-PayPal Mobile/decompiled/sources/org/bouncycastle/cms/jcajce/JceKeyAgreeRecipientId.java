package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public class JceKeyAgreeRecipientId extends org.bouncycastle.cms.KeyAgreeRecipientId {
    public JceKeyAgreeRecipientId(javax.security.auth.x500.X500Principal x500Principal, java.math.BigInteger bigInteger) {
        super(org.bouncycastle.asn1.x500.X500Name.getInstance(x500Principal.getEncoded()), bigInteger);
    }

    public JceKeyAgreeRecipientId(java.security.cert.X509Certificate x509Certificate) {
        this(x509Certificate.getIssuerX500Principal(), x509Certificate.getSerialNumber());
    }
}
