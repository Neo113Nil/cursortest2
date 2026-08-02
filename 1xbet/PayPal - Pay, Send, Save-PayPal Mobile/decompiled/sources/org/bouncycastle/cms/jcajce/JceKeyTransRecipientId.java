package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public class JceKeyTransRecipientId extends org.bouncycastle.cms.KeyTransRecipientId {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JceKeyTransRecipientId(java.security.cert.X509Certificate x509Certificate) {
        super(r0 == null ? null : org.bouncycastle.asn1.x500.X500Name.getInstance(r0.getEncoded()), x509Certificate.getSerialNumber(), org.bouncycastle.cms.jcajce.CMSUtils.getHighSpeedVideoFpsRanges(x509Certificate));
        javax.security.auth.x500.X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
    }

    public JceKeyTransRecipientId(javax.security.auth.x500.X500Principal x500Principal, java.math.BigInteger bigInteger) {
        super(x500Principal == null ? null : org.bouncycastle.asn1.x500.X500Name.getInstance(x500Principal.getEncoded()), bigInteger);
    }

    public JceKeyTransRecipientId(javax.security.auth.x500.X500Principal x500Principal, java.math.BigInteger bigInteger, byte[] bArr) {
        super(x500Principal == null ? null : org.bouncycastle.asn1.x500.X500Name.getInstance(x500Principal.getEncoded()), bigInteger, bArr);
    }
}
