package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
interface JcaJceExtHelper extends org.bouncycastle.jcajce.util.JcaJceHelper {
    org.bouncycastle.operator.jcajce.JceKTSKeyUnwrapper Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, java.security.PrivateKey privateKey, byte[] bArr, byte[] bArr2);

    org.bouncycastle.operator.SymmetricKeyUnwrapper getHighSpeedVideoFpsRanges(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, javax.crypto.SecretKey secretKey);

    org.bouncycastle.operator.jcajce.JceAsymmetricKeyUnwrapper getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, java.security.PrivateKey privateKey);
}
