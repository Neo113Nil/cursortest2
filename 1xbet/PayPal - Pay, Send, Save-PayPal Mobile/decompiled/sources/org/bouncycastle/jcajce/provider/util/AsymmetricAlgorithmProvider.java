package org.bouncycastle.jcajce.provider.util;

/* loaded from: classes17.dex */
public abstract class AsymmetricAlgorithmProvider extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
    protected void registerOidAlgorithmParameters(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str) {
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)), str);
    }

    protected void registerOidAlgorithmParameterGenerator(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str) {
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)), str);
        configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)), str);
    }

    protected void registerOid(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.lang.String str, org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        configurableProvider.addAlgorithm("Alg.Alias.KeyFactory.".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)), str);
        configurableProvider.addAlgorithm("Alg.Alias.KeyPairGenerator.".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)), str);
        configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
    }

    protected void addSignatureAlgorithm(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider, java.lang.String str, java.lang.String str2, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("Signature.".concat(java.lang.String.valueOf(str)), str2);
        configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)), str);
        configurableProvider.addAlgorithm("Alg.Alias.Signature.OID.".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)), str);
    }

    protected void addSignatureAlgorithm(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider, java.lang.String str, java.lang.String str2, java.lang.String str3, org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("WITH");
        sb.append(str2);
        java.lang.String obj = sb.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(str);
        sb2.append("with");
        sb2.append(str2);
        java.lang.String obj2 = sb2.toString();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(str);
        sb3.append("With");
        sb3.append(str2);
        java.lang.String obj3 = sb3.toString();
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
        sb4.append(str);
        sb4.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb4.append(str2);
        java.lang.String obj4 = sb4.toString();
        configurableProvider.addAlgorithm("Signature.".concat(java.lang.String.valueOf(obj)), str3);
        configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(java.lang.String.valueOf(obj2)), obj);
        configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(java.lang.String.valueOf(obj3)), obj);
        configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(java.lang.String.valueOf(obj4)), obj);
        if (aSN1ObjectIdentifier != null) {
            configurableProvider.addAlgorithm("Alg.Alias.Signature.".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)), obj);
            configurableProvider.addAlgorithm("Alg.Alias.Signature.OID.".concat(java.lang.String.valueOf(aSN1ObjectIdentifier)), obj);
        }
    }

    protected void addSignatureAlgorithm(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        addSignatureAlgorithm(configurableProvider, str, str2, str3, null);
    }
}
