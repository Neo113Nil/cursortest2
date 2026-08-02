package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public class PBEPBKDF1 {

    public static class AlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters {
        org.bouncycastle.asn1.pkcs.PBEParameter getHighSpeedVideoSizes;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException {
            if (cls == javax.crypto.spec.PBEParameterSpec.class || cls == java.security.spec.AlgorithmParameterSpec.class) {
                return new javax.crypto.spec.PBEParameterSpec(this.getHighSpeedVideoSizes.getSalt(), this.getHighSpeedVideoSizes.getIterationCount().intValue());
            }
            throw new java.security.spec.InvalidParameterSpecException("unknown parameter spec passed to PBKDF1 PBE parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected java.lang.String engineToString() {
            return "PBKDF1 Parameters";
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, java.lang.String str) throws java.io.IOException {
            if (!isASN1FormatString(str)) {
                throw new java.io.IOException("Unknown parameters format in PBKDF2 parameters object");
            }
            engineInit(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) throws java.io.IOException {
            this.getHighSpeedVideoSizes = org.bouncycastle.asn1.pkcs.PBEParameter.getInstance(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.spec.InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof javax.crypto.spec.PBEParameterSpec)) {
                throw new java.security.spec.InvalidParameterSpecException("PBEParameterSpec required to initialise a PBKDF1 PBE parameters algorithm parameters object");
            }
            javax.crypto.spec.PBEParameterSpec pBEParameterSpec = (javax.crypto.spec.PBEParameterSpec) algorithmParameterSpec;
            this.getHighSpeedVideoSizes = new org.bouncycastle.asn1.pkcs.PBEParameter(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(java.lang.String str) {
            if (isASN1FormatString(str)) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            try {
                return this.getHighSpeedVideoSizes.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Oooops! ");
                sb.append(e.toString());
                throw new java.lang.RuntimeException(sb.toString());
            }
        }
    }

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF1.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getHighSpeedVideoFpsRangesFor);
            sb.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.PBKDF1", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb2.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD2AndDES_CBC);
            configurableProvider.addAlgorithm(sb2.toString(), "PBKDF1");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb3.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD5AndDES_CBC);
            configurableProvider.addAlgorithm(sb3.toString(), "PBKDF1");
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb4.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD5AndRC2_CBC);
            configurableProvider.addAlgorithm(sb4.toString(), "PBKDF1");
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb5.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHA1AndDES_CBC);
            configurableProvider.addAlgorithm(sb5.toString(), "PBKDF1");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb6.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHA1AndRC2_CBC);
            configurableProvider.addAlgorithm(sb6.toString(), "PBKDF1");
        }
    }

    private PBEPBKDF1() {
    }
}
