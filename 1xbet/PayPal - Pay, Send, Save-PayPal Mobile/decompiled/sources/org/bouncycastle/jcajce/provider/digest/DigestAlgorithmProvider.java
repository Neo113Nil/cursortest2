package org.bouncycastle.jcajce.provider.digest;

/* loaded from: classes17.dex */
abstract class DigestAlgorithmProvider extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
    protected void addHMACAlias(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider, java.lang.String str, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        java.lang.String concat = org.jose4j.keys.HmacKey.ALGORITHM.concat(java.lang.String.valueOf(str));
        configurableProvider.addAlgorithm("Alg.Alias.Mac.".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)), concat);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)), concat);
    }

    protected void addHMACAlgorithm(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String concat = org.jose4j.keys.HmacKey.ALGORITHM.concat(java.lang.String.valueOf(str));
        configurableProvider.addAlgorithm("Mac.".concat(java.lang.String.valueOf(concat)), str2);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC-".concat(java.lang.String.valueOf(str)), concat);
        configurableProvider.addAlgorithm("Alg.Alias.Mac.HMAC/".concat(java.lang.String.valueOf(str)), concat);
        configurableProvider.addAlgorithm("KeyGenerator.".concat(java.lang.String.valueOf(concat)), str3);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC-".concat(java.lang.String.valueOf(str)), concat);
        configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.HMAC/".concat(java.lang.String.valueOf(str)), concat);
    }

    DigestAlgorithmProvider() {
    }
}
