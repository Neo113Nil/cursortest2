package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public class PBEPKCS12 {

    public static class AlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters {
        org.bouncycastle.asn1.pkcs.PKCS12PBEParams getHighSpeedVideoFpsRanges;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException {
            if (cls == javax.crypto.spec.PBEParameterSpec.class || cls == java.security.spec.AlgorithmParameterSpec.class) {
                return new javax.crypto.spec.PBEParameterSpec(this.getHighSpeedVideoFpsRanges.getIV(), this.getHighSpeedVideoFpsRanges.getIterations().intValue());
            }
            throw new java.security.spec.InvalidParameterSpecException("unknown parameter spec passed to PKCS12 PBE parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected java.lang.String engineToString() {
            return "PKCS12 PBE Parameters";
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, java.lang.String str) throws java.io.IOException {
            if (!isASN1FormatString(str)) {
                throw new java.io.IOException("Unknown parameters format in PKCS12 PBE parameters object");
            }
            engineInit(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) throws java.io.IOException {
            this.getHighSpeedVideoFpsRanges = org.bouncycastle.asn1.pkcs.PKCS12PBEParams.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr));
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.spec.InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof javax.crypto.spec.PBEParameterSpec)) {
                throw new java.security.spec.InvalidParameterSpecException("PBEParameterSpec required to initialise a PKCS12 PBE parameters algorithm parameters object");
            }
            javax.crypto.spec.PBEParameterSpec pBEParameterSpec = (javax.crypto.spec.PBEParameterSpec) algorithmParameterSpec;
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.asn1.pkcs.PKCS12PBEParams(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
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
                return this.getHighSpeedVideoFpsRanges.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Oooops! ");
                sb.append(e.toString());
                throw new java.lang.RuntimeException(sb.toString());
            }
        }
    }

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.provider.symmetric.PBEPKCS12.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getHighSpeedVideoFpsRangesFor);
            sb.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.PKCS12PBE", sb.toString());
        }
    }

    private PBEPKCS12() {
    }
}
