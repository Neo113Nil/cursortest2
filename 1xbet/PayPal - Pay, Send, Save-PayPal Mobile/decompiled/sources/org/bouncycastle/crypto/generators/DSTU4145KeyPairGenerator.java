package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class DSTU4145KeyPairGenerator extends org.bouncycastle.crypto.generators.ECKeyPairGenerator {
    @Override // org.bouncycastle.crypto.generators.ECKeyPairGenerator, org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        org.bouncycastle.crypto.params.ECPublicKeyParameters eCPublicKeyParameters = (org.bouncycastle.crypto.params.ECPublicKeyParameters) super.generateKeyPair().getPublic();
        return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.crypto.params.ECPublicKeyParameters(eCPublicKeyParameters.getQ().negate(), eCPublicKeyParameters.getParameters()), r0.getPrivate());
    }
}
