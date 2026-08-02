package org.bouncycastle.cms.jcajce;

import org.bouncycastle.cms.jcajce.EnvelopedDataHelper.AnonymousClass2;

/* loaded from: classes17.dex */
public class JceKeyAgreeAuthenticatedRecipient extends org.bouncycastle.cms.jcajce.JceKeyAgreeRecipient {
    @Override // org.bouncycastle.cms.KeyAgreeRecipient
    public org.bouncycastle.cms.RecipientOperator getRecipientOperator(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, final org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo, org.bouncycastle.asn1.ASN1OctetString aSN1OctetString, byte[] bArr) throws org.bouncycastle.cms.CMSException {
        final java.security.Key extractSecretKey = extractSecretKey(algorithmIdentifier, algorithmIdentifier2, subjectPublicKeyInfo, aSN1OctetString, bArr);
        final javax.crypto.Mac mac = (javax.crypto.Mac) org.bouncycastle.cms.jcajce.EnvelopedDataHelper.Camera2StreamConfigurationMap(this.contentHelper.new AnonymousClass2(algorithmIdentifier2, extractSecretKey));
        return new org.bouncycastle.cms.RecipientOperator(new org.bouncycastle.operator.MacCalculator() { // from class: org.bouncycastle.cms.jcajce.JceKeyAgreeAuthenticatedRecipient.1
            @Override // org.bouncycastle.operator.MacCalculator
            public java.io.OutputStream getOutputStream() {
                return new org.bouncycastle.jcajce.io.MacOutputStream(mac);
            }

            @Override // org.bouncycastle.operator.MacCalculator
            public byte[] getMac() {
                return mac.doFinal();
            }

            @Override // org.bouncycastle.operator.MacCalculator
            public org.bouncycastle.operator.GenericKey getKey() {
                return new org.bouncycastle.operator.jcajce.JceGenericKey(algorithmIdentifier2, extractSecretKey);
            }

            @Override // org.bouncycastle.operator.MacCalculator
            public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
                return algorithmIdentifier2;
            }
        });
    }

    public JceKeyAgreeAuthenticatedRecipient(java.security.PrivateKey privateKey) {
        super(privateKey);
    }
}
