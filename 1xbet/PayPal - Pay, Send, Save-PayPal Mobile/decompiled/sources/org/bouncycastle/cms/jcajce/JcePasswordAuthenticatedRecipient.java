package org.bouncycastle.cms.jcajce;

import org.bouncycastle.cms.jcajce.EnvelopedDataHelper.AnonymousClass2;

/* loaded from: classes17.dex */
public class JcePasswordAuthenticatedRecipient extends org.bouncycastle.cms.jcajce.JcePasswordRecipient {
    @Override // org.bouncycastle.cms.PasswordRecipient
    public org.bouncycastle.cms.RecipientOperator getRecipientOperator(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, final org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, byte[] bArr, byte[] bArr2) throws org.bouncycastle.cms.CMSException {
        final java.security.Key extractSecretKey = extractSecretKey(algorithmIdentifier, algorithmIdentifier2, bArr, bArr2);
        final javax.crypto.Mac mac = (javax.crypto.Mac) org.bouncycastle.cms.jcajce.EnvelopedDataHelper.Camera2StreamConfigurationMap(this.helper.new AnonymousClass2(algorithmIdentifier2, extractSecretKey));
        return new org.bouncycastle.cms.RecipientOperator(new org.bouncycastle.operator.MacCalculator() { // from class: org.bouncycastle.cms.jcajce.JcePasswordAuthenticatedRecipient.1
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

    public JcePasswordAuthenticatedRecipient(char[] cArr) {
        super(cArr);
    }
}
