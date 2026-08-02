package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public class JceKEKRecipientInfoGenerator extends org.bouncycastle.cms.KEKRecipientInfoGenerator {
    public org.bouncycastle.cms.jcajce.JceKEKRecipientInfoGenerator setSecureRandom(java.security.SecureRandom secureRandom) {
        ((org.bouncycastle.operator.jcajce.JceSymmetricKeyWrapper) this.wrapper).setSecureRandom(secureRandom);
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKEKRecipientInfoGenerator setProvider(java.security.Provider provider) {
        ((org.bouncycastle.operator.jcajce.JceSymmetricKeyWrapper) this.wrapper).setProvider(provider);
        return this;
    }

    public org.bouncycastle.cms.jcajce.JceKEKRecipientInfoGenerator setProvider(java.lang.String str) {
        ((org.bouncycastle.operator.jcajce.JceSymmetricKeyWrapper) this.wrapper).setProvider(str);
        return this;
    }

    public JceKEKRecipientInfoGenerator(byte[] bArr, javax.crypto.SecretKey secretKey) {
        this(new org.bouncycastle.asn1.cms.KEKIdentifier(bArr, null, null), secretKey);
    }

    public JceKEKRecipientInfoGenerator(org.bouncycastle.asn1.cms.KEKIdentifier kEKIdentifier, javax.crypto.SecretKey secretKey) {
        super(kEKIdentifier, new org.bouncycastle.operator.jcajce.JceSymmetricKeyWrapper(secretKey));
    }
}
