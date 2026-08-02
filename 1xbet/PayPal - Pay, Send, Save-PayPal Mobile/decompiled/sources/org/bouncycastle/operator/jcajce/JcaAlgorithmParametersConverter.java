package org.bouncycastle.operator.jcajce;

/* loaded from: classes17.dex */
public class JcaAlgorithmParametersConverter {
    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.InvalidAlgorithmParameterException {
        if (!(algorithmParameterSpec instanceof javax.crypto.spec.OAEPParameterSpec)) {
            throw new java.security.InvalidAlgorithmParameterException("unknown parameter spec passed.");
        }
        if (algorithmParameterSpec.equals(javax.crypto.spec.OAEPParameterSpec.DEFAULT)) {
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, new org.bouncycastle.asn1.pkcs.RSAESOAEPparams(org.bouncycastle.asn1.pkcs.RSAESOAEPparams.DEFAULT_HASH_ALGORITHM, org.bouncycastle.asn1.pkcs.RSAESOAEPparams.DEFAULT_MASK_GEN_FUNCTION, org.bouncycastle.asn1.pkcs.RSAESOAEPparams.DEFAULT_P_SOURCE_ALGORITHM));
        }
        javax.crypto.spec.OAEPParameterSpec oAEPParameterSpec = (javax.crypto.spec.OAEPParameterSpec) algorithmParameterSpec;
        javax.crypto.spec.PSource pSource = oAEPParameterSpec.getPSource();
        if (!oAEPParameterSpec.getMGFAlgorithm().equals(javax.crypto.spec.OAEPParameterSpec.DEFAULT.getMGFAlgorithm())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("only ");
            sb.append(javax.crypto.spec.OAEPParameterSpec.DEFAULT.getMGFAlgorithm());
            sb.append(" mask generator supported.");
            throw new java.security.InvalidAlgorithmParameterException(sb.toString());
        }
        org.bouncycastle.asn1.x509.AlgorithmIdentifier find = new org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder().find(oAEPParameterSpec.getDigestAlgorithm());
        if (find.getParameters() == null) {
            find = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(find.getAlgorithm(), org.bouncycastle.asn1.DERNull.INSTANCE);
        }
        org.bouncycastle.asn1.x509.AlgorithmIdentifier find2 = new org.bouncycastle.operator.DefaultDigestAlgorithmIdentifierFinder().find(((java.security.spec.MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters()).getDigestAlgorithm());
        if (find2.getParameters() == null) {
            find2 = new org.bouncycastle.asn1.x509.AlgorithmIdentifier(find2.getAlgorithm(), org.bouncycastle.asn1.DERNull.INSTANCE);
        }
        return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, new org.bouncycastle.asn1.pkcs.RSAESOAEPparams(find, new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_mgf1, find2), new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_pSpecified, new org.bouncycastle.asn1.DEROctetString(((javax.crypto.spec.PSource.PSpecified) pSource).getValue()))));
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier(org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier, java.security.AlgorithmParameters algorithmParameters) throws java.security.InvalidAlgorithmParameterException {
        try {
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(aSN1ObjectIdentifier, org.bouncycastle.asn1.ASN1Primitive.fromByteArray(algorithmParameters.getEncoded()));
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to encode parameters object: ");
            sb.append(e.getMessage());
            throw new java.security.InvalidAlgorithmParameterException(sb.toString());
        }
    }
}
