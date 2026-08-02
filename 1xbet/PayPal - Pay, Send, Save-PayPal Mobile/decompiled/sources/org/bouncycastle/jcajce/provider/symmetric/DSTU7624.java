package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public class DSTU7624 {

    public static class AlgParamGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator {
        private final int getHighSpeedVideoSizes;

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
            throw new java.security.InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSTU7624 parameter generation.");
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected java.security.AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[this.getHighSpeedVideoSizes];
            if (this.random == null) {
                this.random = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                java.security.AlgorithmParameters createParametersInstance = createParametersInstance("DSTU7624");
                createParametersInstance.init(new javax.crypto.spec.IvParameterSpec(bArr));
                return createParametersInstance;
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.getMessage());
            }
        }

        public AlgParamGen(int i) {
            this.getHighSpeedVideoSizes = i / 8;
        }
    }

    public static class Mappings extends org.bouncycastle.jcajce.provider.symmetric.SymmetricAlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.provider.symmetric.DSTU7624.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoFpsRangesFor;
            sb.append(str);
            sb.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.DSTU7624", sb.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624cbc_128;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters", aSN1ObjectIdentifier, sb2.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624cbc_256;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters", aSN1ObjectIdentifier2, sb3.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier3 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624cbc_512;
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters", aSN1ObjectIdentifier3, sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$AlgParamGen128");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.DSTU7624", sb5.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier4 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624cbc_128;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$AlgParamGen128");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator", aSN1ObjectIdentifier4, sb6.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier5 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624cbc_256;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$AlgParamGen256");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator", aSN1ObjectIdentifier5, sb7.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier6 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624cbc_512;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$AlgParamGen512");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator", aSN1ObjectIdentifier6, sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            sb9.append("$ECB_128");
            configurableProvider.addAlgorithm("Cipher.DSTU7624", sb9.toString());
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            sb10.append(str);
            sb10.append("$ECB_128");
            configurableProvider.addAlgorithm("Cipher.DSTU7624-128", sb10.toString());
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(str);
            sb11.append("$ECB_256");
            configurableProvider.addAlgorithm("Cipher.DSTU7624-256", sb11.toString());
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
            sb12.append(str);
            sb12.append("$ECB_512");
            configurableProvider.addAlgorithm("Cipher.DSTU7624-512", sb12.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier7 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ecb_128;
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
            sb13.append(str);
            sb13.append("$ECB128");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier7, sb13.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier8 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ecb_256;
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
            sb14.append(str);
            sb14.append("$ECB256");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier8, sb14.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier9 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ecb_512;
            java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
            sb15.append(str);
            sb15.append("$ECB512");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier9, sb15.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier10 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624cbc_128;
            java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
            sb16.append(str);
            sb16.append("$CBC128");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier10, sb16.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier11 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624cbc_256;
            java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
            sb17.append(str);
            sb17.append("$CBC256");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier11, sb17.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier12 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624cbc_512;
            java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
            sb18.append(str);
            sb18.append("$CBC512");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier12, sb18.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier13 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ofb_128;
            java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
            sb19.append(str);
            sb19.append("$OFB128");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier13, sb19.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier14 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ofb_256;
            java.lang.StringBuilder sb20 = new java.lang.StringBuilder();
            sb20.append(str);
            sb20.append("$OFB256");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier14, sb20.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier15 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ofb_512;
            java.lang.StringBuilder sb21 = new java.lang.StringBuilder();
            sb21.append(str);
            sb21.append("$OFB512");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier15, sb21.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier16 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624cfb_128;
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
            sb22.append(str);
            sb22.append("$CFB128");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier16, sb22.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier17 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624cfb_256;
            java.lang.StringBuilder sb23 = new java.lang.StringBuilder();
            sb23.append(str);
            sb23.append("$CFB256");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier17, sb23.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier18 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624cfb_512;
            java.lang.StringBuilder sb24 = new java.lang.StringBuilder();
            sb24.append(str);
            sb24.append("$CFB512");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier18, sb24.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier19 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ctr_128;
            java.lang.StringBuilder sb25 = new java.lang.StringBuilder();
            sb25.append(str);
            sb25.append("$CTR128");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier19, sb25.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier20 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ctr_256;
            java.lang.StringBuilder sb26 = new java.lang.StringBuilder();
            sb26.append(str);
            sb26.append("$CTR256");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier20, sb26.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier21 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ctr_512;
            java.lang.StringBuilder sb27 = new java.lang.StringBuilder();
            sb27.append(str);
            sb27.append("$CTR512");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier21, sb27.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier22 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ccm_128;
            java.lang.StringBuilder sb28 = new java.lang.StringBuilder();
            sb28.append(str);
            sb28.append("$CCM128");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier22, sb28.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier23 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ccm_256;
            java.lang.StringBuilder sb29 = new java.lang.StringBuilder();
            sb29.append(str);
            sb29.append("$CCM256");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier23, sb29.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier24 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ccm_512;
            java.lang.StringBuilder sb30 = new java.lang.StringBuilder();
            sb30.append(str);
            sb30.append("$CCM512");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier24, sb30.toString());
            java.lang.StringBuilder sb31 = new java.lang.StringBuilder();
            sb31.append(str);
            sb31.append("$Wrap");
            configurableProvider.addAlgorithm("Cipher.DSTU7624KW", sb31.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.DSTU7624WRAP", "DSTU7624KW");
            java.lang.StringBuilder sb32 = new java.lang.StringBuilder();
            sb32.append(str);
            sb32.append("$Wrap128");
            configurableProvider.addAlgorithm("Cipher.DSTU7624-128KW", sb32.toString());
            java.lang.StringBuilder sb33 = new java.lang.StringBuilder("Alg.Alias.Cipher.");
            sb33.append(org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624kw_128.getId());
            configurableProvider.addAlgorithm(sb33.toString(), "DSTU7624-128KW");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.DSTU7624-128WRAP", "DSTU7624-128KW");
            java.lang.StringBuilder sb34 = new java.lang.StringBuilder();
            sb34.append(str);
            sb34.append("$Wrap256");
            configurableProvider.addAlgorithm("Cipher.DSTU7624-256KW", sb34.toString());
            java.lang.StringBuilder sb35 = new java.lang.StringBuilder("Alg.Alias.Cipher.");
            sb35.append(org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624kw_256.getId());
            configurableProvider.addAlgorithm(sb35.toString(), "DSTU7624-256KW");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.DSTU7624-256WRAP", "DSTU7624-256KW");
            java.lang.StringBuilder sb36 = new java.lang.StringBuilder();
            sb36.append(str);
            sb36.append("$Wrap512");
            configurableProvider.addAlgorithm("Cipher.DSTU7624-512KW", sb36.toString());
            java.lang.StringBuilder sb37 = new java.lang.StringBuilder("Alg.Alias.Cipher.");
            sb37.append(org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624kw_512.getId());
            configurableProvider.addAlgorithm(sb37.toString(), "DSTU7624-512KW");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.DSTU7624-512WRAP", "DSTU7624-512KW");
            java.lang.StringBuilder sb38 = new java.lang.StringBuilder();
            sb38.append(str);
            sb38.append("$GMAC");
            configurableProvider.addAlgorithm("Mac.DSTU7624GMAC", sb38.toString());
            java.lang.StringBuilder sb39 = new java.lang.StringBuilder();
            sb39.append(str);
            sb39.append("$GMAC128");
            configurableProvider.addAlgorithm("Mac.DSTU7624-128GMAC", sb39.toString());
            java.lang.StringBuilder sb40 = new java.lang.StringBuilder("Alg.Alias.Mac.");
            sb40.append(org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624gmac_128.getId());
            configurableProvider.addAlgorithm(sb40.toString(), "DSTU7624-128GMAC");
            java.lang.StringBuilder sb41 = new java.lang.StringBuilder();
            sb41.append(str);
            sb41.append("$GMAC256");
            configurableProvider.addAlgorithm("Mac.DSTU7624-256GMAC", sb41.toString());
            java.lang.StringBuilder sb42 = new java.lang.StringBuilder("Alg.Alias.Mac.");
            sb42.append(org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624gmac_256.getId());
            configurableProvider.addAlgorithm(sb42.toString(), "DSTU7624-256GMAC");
            java.lang.StringBuilder sb43 = new java.lang.StringBuilder();
            sb43.append(str);
            sb43.append("$GMAC512");
            configurableProvider.addAlgorithm("Mac.DSTU7624-512GMAC", sb43.toString());
            java.lang.StringBuilder sb44 = new java.lang.StringBuilder("Alg.Alias.Mac.");
            sb44.append(org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624gmac_512.getId());
            configurableProvider.addAlgorithm(sb44.toString(), "DSTU7624-512GMAC");
            java.lang.StringBuilder sb45 = new java.lang.StringBuilder();
            sb45.append(str);
            sb45.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.DSTU7624", sb45.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier25 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624kw_128;
            java.lang.StringBuilder sb46 = new java.lang.StringBuilder();
            sb46.append(str);
            sb46.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier25, sb46.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier26 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624kw_256;
            java.lang.StringBuilder sb47 = new java.lang.StringBuilder();
            sb47.append(str);
            sb47.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier26, sb47.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier27 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624kw_512;
            java.lang.StringBuilder sb48 = new java.lang.StringBuilder();
            sb48.append(str);
            sb48.append("$KeyGen512");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier27, sb48.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier28 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ecb_128;
            java.lang.StringBuilder sb49 = new java.lang.StringBuilder();
            sb49.append(str);
            sb49.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier28, sb49.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier29 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ecb_256;
            java.lang.StringBuilder sb50 = new java.lang.StringBuilder();
            sb50.append(str);
            sb50.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier29, sb50.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier30 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ecb_512;
            java.lang.StringBuilder sb51 = new java.lang.StringBuilder();
            sb51.append(str);
            sb51.append("$KeyGen512");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier30, sb51.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier31 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624cbc_128;
            java.lang.StringBuilder sb52 = new java.lang.StringBuilder();
            sb52.append(str);
            sb52.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier31, sb52.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier32 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624cbc_256;
            java.lang.StringBuilder sb53 = new java.lang.StringBuilder();
            sb53.append(str);
            sb53.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier32, sb53.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier33 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624cbc_512;
            java.lang.StringBuilder sb54 = new java.lang.StringBuilder();
            sb54.append(str);
            sb54.append("$KeyGen512");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier33, sb54.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier34 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ofb_128;
            java.lang.StringBuilder sb55 = new java.lang.StringBuilder();
            sb55.append(str);
            sb55.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier34, sb55.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier35 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ofb_256;
            java.lang.StringBuilder sb56 = new java.lang.StringBuilder();
            sb56.append(str);
            sb56.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier35, sb56.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier36 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ofb_512;
            java.lang.StringBuilder sb57 = new java.lang.StringBuilder();
            sb57.append(str);
            sb57.append("$KeyGen512");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier36, sb57.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier37 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624cfb_128;
            java.lang.StringBuilder sb58 = new java.lang.StringBuilder();
            sb58.append(str);
            sb58.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier37, sb58.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier38 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624cfb_256;
            java.lang.StringBuilder sb59 = new java.lang.StringBuilder();
            sb59.append(str);
            sb59.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier38, sb59.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier39 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624cfb_512;
            java.lang.StringBuilder sb60 = new java.lang.StringBuilder();
            sb60.append(str);
            sb60.append("$KeyGen512");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier39, sb60.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier40 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ctr_128;
            java.lang.StringBuilder sb61 = new java.lang.StringBuilder();
            sb61.append(str);
            sb61.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier40, sb61.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier41 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ctr_256;
            java.lang.StringBuilder sb62 = new java.lang.StringBuilder();
            sb62.append(str);
            sb62.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier41, sb62.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier42 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ctr_512;
            java.lang.StringBuilder sb63 = new java.lang.StringBuilder();
            sb63.append(str);
            sb63.append("$KeyGen512");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier42, sb63.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier43 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ccm_128;
            java.lang.StringBuilder sb64 = new java.lang.StringBuilder();
            sb64.append(str);
            sb64.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier43, sb64.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier44 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ccm_256;
            java.lang.StringBuilder sb65 = new java.lang.StringBuilder();
            sb65.append(str);
            sb65.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier44, sb65.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier45 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624ccm_512;
            java.lang.StringBuilder sb66 = new java.lang.StringBuilder();
            sb66.append(str);
            sb66.append("$KeyGen512");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier45, sb66.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier46 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624gmac_128;
            java.lang.StringBuilder sb67 = new java.lang.StringBuilder();
            sb67.append(str);
            sb67.append("$KeyGen128");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier46, sb67.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier47 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624gmac_256;
            java.lang.StringBuilder sb68 = new java.lang.StringBuilder();
            sb68.append(str);
            sb68.append("$KeyGen256");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier47, sb68.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier48 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7624gmac_512;
            java.lang.StringBuilder sb69 = new java.lang.StringBuilder();
            sb69.append(str);
            sb69.append("$KeyGen512");
            configurableProvider.addAlgorithm("KeyGenerator", aSN1ObjectIdentifier48, sb69.toString());
        }
    }

    public static class AlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public java.lang.String engineToString() {
            return "DSTU7624 IV";
        }
    }

    public static class KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen(int i) {
            super("DSTU7624", i, new org.bouncycastle.crypto.CipherKeyGenerator());
        }

        public KeyGen() {
            this(256);
        }
    }

    public static class AlgParamGen128 extends org.bouncycastle.jcajce.provider.symmetric.DSTU7624.AlgParamGen {
        public AlgParamGen128() {
            super(128);
        }
    }

    public static class AlgParamGen256 extends org.bouncycastle.jcajce.provider.symmetric.DSTU7624.AlgParamGen {
        public AlgParamGen256() {
            super(256);
        }
    }

    public static class AlgParamGen512 extends org.bouncycastle.jcajce.provider.symmetric.DSTU7624.AlgParamGen {
        public AlgParamGen512() {
            super(512);
        }
    }

    public static class CBC128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC128() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DSTU7624Engine(128)), 128);
        }
    }

    public static class CBC256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC256() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DSTU7624Engine(256)), 256);
        }
    }

    public static class CBC512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC512() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.DSTU7624Engine(512)), 512);
        }
    }

    public static class CCM128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CCM128() {
            super(new org.bouncycastle.crypto.modes.KCCMBlockCipher(new org.bouncycastle.crypto.engines.DSTU7624Engine(128)));
        }
    }

    public static class CCM256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CCM256() {
            super(new org.bouncycastle.crypto.modes.KCCMBlockCipher(new org.bouncycastle.crypto.engines.DSTU7624Engine(256)));
        }
    }

    public static class CCM512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CCM512() {
            super(new org.bouncycastle.crypto.modes.KCCMBlockCipher(new org.bouncycastle.crypto.engines.DSTU7624Engine(512)));
        }
    }

    public static class CFB128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CFB128() {
            super(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.CFBBlockCipher(new org.bouncycastle.crypto.engines.DSTU7624Engine(128), 128)), 128);
        }
    }

    public static class CFB256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CFB256() {
            super(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.CFBBlockCipher(new org.bouncycastle.crypto.engines.DSTU7624Engine(256), 256)), 256);
        }
    }

    public static class CFB512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CFB512() {
            super(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.CFBBlockCipher(new org.bouncycastle.crypto.engines.DSTU7624Engine(512), 512)), 512);
        }
    }

    public static class CTR128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CTR128() {
            super(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.KCTRBlockCipher(new org.bouncycastle.crypto.engines.DSTU7624Engine(128))), 128);
        }
    }

    public static class CTR256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CTR256() {
            super(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.KCTRBlockCipher(new org.bouncycastle.crypto.engines.DSTU7624Engine(256))), 256);
        }
    }

    public static class CTR512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CTR512() {
            super(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.KCTRBlockCipher(new org.bouncycastle.crypto.engines.DSTU7624Engine(512))), 512);
        }
    }

    public static class ECB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB() {
            super(new org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider() { // from class: org.bouncycastle.jcajce.provider.symmetric.DSTU7624.ECB.1
                @Override // org.bouncycastle.jcajce.provider.symmetric.util.BlockCipherProvider
                public org.bouncycastle.crypto.BlockCipher get() {
                    return new org.bouncycastle.crypto.engines.DSTU7624Engine(128);
                }
            });
        }
    }

    public static class ECB128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB128() {
            super(new org.bouncycastle.crypto.engines.DSTU7624Engine(128));
        }
    }

    public static class ECB256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB256() {
            super(new org.bouncycastle.crypto.engines.DSTU7624Engine(256));
        }
    }

    public static class ECB512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB512() {
            super(new org.bouncycastle.crypto.engines.DSTU7624Engine(512));
        }
    }

    public static class ECB_128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB_128() {
            super(new org.bouncycastle.crypto.engines.DSTU7624Engine(128));
        }
    }

    public static class ECB_256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB_256() {
            super(new org.bouncycastle.crypto.engines.DSTU7624Engine(256));
        }
    }

    public static class ECB_512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB_512() {
            super(new org.bouncycastle.crypto.engines.DSTU7624Engine(512));
        }
    }

    public static class GCM128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public GCM128() {
            super(new org.bouncycastle.crypto.modes.KGCMBlockCipher(new org.bouncycastle.crypto.engines.DSTU7624Engine(128)));
        }
    }

    public static class GCM256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public GCM256() {
            super(new org.bouncycastle.crypto.modes.KGCMBlockCipher(new org.bouncycastle.crypto.engines.DSTU7624Engine(256)));
        }
    }

    public static class GCM512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public GCM512() {
            super(new org.bouncycastle.crypto.modes.KGCMBlockCipher(new org.bouncycastle.crypto.engines.DSTU7624Engine(512)));
        }
    }

    public static class GMAC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public GMAC() {
            super(new org.bouncycastle.crypto.macs.KGMac(new org.bouncycastle.crypto.modes.KGCMBlockCipher(new org.bouncycastle.crypto.engines.DSTU7624Engine(128)), 128));
        }
    }

    public static class GMAC128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public GMAC128() {
            super(new org.bouncycastle.crypto.macs.KGMac(new org.bouncycastle.crypto.modes.KGCMBlockCipher(new org.bouncycastle.crypto.engines.DSTU7624Engine(128)), 128));
        }
    }

    public static class GMAC256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public GMAC256() {
            super(new org.bouncycastle.crypto.macs.KGMac(new org.bouncycastle.crypto.modes.KGCMBlockCipher(new org.bouncycastle.crypto.engines.DSTU7624Engine(256)), 256));
        }
    }

    public static class GMAC512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public GMAC512() {
            super(new org.bouncycastle.crypto.macs.KGMac(new org.bouncycastle.crypto.modes.KGCMBlockCipher(new org.bouncycastle.crypto.engines.DSTU7624Engine(512)), 512));
        }
    }

    public static class KeyGen128 extends org.bouncycastle.jcajce.provider.symmetric.DSTU7624.KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public static class KeyGen256 extends org.bouncycastle.jcajce.provider.symmetric.DSTU7624.KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public static class KeyGen512 extends org.bouncycastle.jcajce.provider.symmetric.DSTU7624.KeyGen {
        public KeyGen512() {
            super(512);
        }
    }

    public static class OFB128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public OFB128() {
            super(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.OFBBlockCipher(new org.bouncycastle.crypto.engines.DSTU7624Engine(128), 128)), 128);
        }
    }

    public static class OFB256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public OFB256() {
            super(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.OFBBlockCipher(new org.bouncycastle.crypto.engines.DSTU7624Engine(256), 256)), 256);
        }
    }

    public static class OFB512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public OFB512() {
            super(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.OFBBlockCipher(new org.bouncycastle.crypto.engines.DSTU7624Engine(512), 512)), 512);
        }
    }

    public static class Wrap extends org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher {
        public Wrap() {
            super(new org.bouncycastle.crypto.engines.DSTU7624WrapEngine(128));
        }
    }

    public static class Wrap128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher {
        public Wrap128() {
            super(new org.bouncycastle.crypto.engines.DSTU7624WrapEngine(128));
        }
    }

    public static class Wrap256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher {
        public Wrap256() {
            super(new org.bouncycastle.crypto.engines.DSTU7624WrapEngine(256));
        }
    }

    public static class Wrap512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher {
        public Wrap512() {
            super(new org.bouncycastle.crypto.engines.DSTU7624WrapEngine(512));
        }
    }

    private DSTU7624() {
    }
}
