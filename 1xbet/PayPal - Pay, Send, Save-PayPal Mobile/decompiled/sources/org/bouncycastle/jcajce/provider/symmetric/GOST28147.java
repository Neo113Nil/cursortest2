package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class GOST28147 {
    private static java.util.Map<org.bouncycastle.asn1.ASN1ObjectIdentifier, java.lang.String> Camera2StreamConfigurationMap = new java.util.HashMap();
    private static java.util.Map<java.lang.String, org.bouncycastle.asn1.ASN1ObjectIdentifier> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();

    public static abstract class BaseAlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters {
        private org.bouncycastle.asn1.ASN1ObjectIdentifier Camera2StreamConfigurationMap = org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet;
        private byte[] getHighSpeedVideoFpsRangesFor;

        abstract void localInit(byte[] bArr) throws java.io.IOException;

        protected byte[] localGetEncoded() throws java.io.IOException {
            return new org.bouncycastle.asn1.cryptopro.GOST28147Parameters(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap).getEncoded();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException {
            if (cls == javax.crypto.spec.IvParameterSpec.class) {
                return new javax.crypto.spec.IvParameterSpec(this.getHighSpeedVideoFpsRangesFor);
            }
            if (cls == org.bouncycastle.jcajce.spec.GOST28147ParameterSpec.class || cls == java.security.spec.AlgorithmParameterSpec.class) {
                return new org.bouncycastle.jcajce.spec.GOST28147ParameterSpec(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AlgorithmParameterSpec not recognized: ");
            sb.append(cls.getName());
            throw new java.security.spec.InvalidParameterSpecException(sb.toString());
        }

        @Override // java.security.AlgorithmParametersSpi
        protected final void engineInit(byte[] bArr, java.lang.String str) throws java.io.IOException {
            if (bArr == null) {
                throw new java.lang.NullPointerException("Encoded parameters cannot be null");
            }
            if (!isASN1FormatString(str)) {
                throw new java.io.IOException("Unknown parameter format: ".concat(java.lang.String.valueOf(str)));
            }
            try {
                localInit(bArr);
            } catch (java.io.IOException e) {
                throw e;
            } catch (java.lang.Exception e2) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Parameter parsing failed: ");
                sb.append(e2.getMessage());
                throw new java.io.IOException(sb.toString());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected final void engineInit(byte[] bArr) throws java.io.IOException {
            engineInit(bArr, "ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.spec.InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof javax.crypto.spec.IvParameterSpec) {
                this.getHighSpeedVideoFpsRangesFor = ((javax.crypto.spec.IvParameterSpec) algorithmParameterSpec).getIV();
            } else {
                if (!(algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.GOST28147ParameterSpec)) {
                    throw new java.security.spec.InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
                }
                this.getHighSpeedVideoFpsRangesFor = ((org.bouncycastle.jcajce.spec.GOST28147ParameterSpec) algorithmParameterSpec).getIV();
                try {
                    this.Camera2StreamConfigurationMap = getSBoxOID(((org.bouncycastle.jcajce.spec.GOST28147ParameterSpec) algorithmParameterSpec).getSBox());
                } catch (java.lang.IllegalArgumentException e) {
                    throw new java.security.spec.InvalidParameterSpecException(e.getMessage());
                }
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected final byte[] engineGetEncoded(java.lang.String str) throws java.io.IOException {
            if (isASN1FormatString(str)) {
                return localGetEncoded();
            }
            throw new java.io.IOException("Unknown parameter format: ".concat(java.lang.String.valueOf(str)));
        }

        @Override // java.security.AlgorithmParametersSpi
        protected final byte[] engineGetEncoded() throws java.io.IOException {
            return engineGetEncoded("ASN.1");
        }

        protected static org.bouncycastle.asn1.ASN1ObjectIdentifier getSBoxOID(byte[] bArr) {
            return getSBoxOID(org.bouncycastle.crypto.engines.GOST28147Engine.getSBoxName(bArr));
        }

        protected static org.bouncycastle.asn1.ASN1ObjectIdentifier getSBoxOID(java.lang.String str) {
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = str != null ? (org.bouncycastle.asn1.ASN1ObjectIdentifier) org.bouncycastle.jcajce.provider.symmetric.GOST28147.getHighResolutionOutputSizeshNQ4ISI.get(org.bouncycastle.util.Strings.toUpperCase(str)) : null;
            if (aSN1ObjectIdentifier != null) {
                return aSN1ObjectIdentifier;
            }
            throw new java.lang.IllegalArgumentException("Unknown SBOX name: ".concat(java.lang.String.valueOf(str)));
        }
    }

    public static class AlgParams extends org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams {
        private org.bouncycastle.asn1.ASN1ObjectIdentifier getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet;
        private byte[] getHighSpeedVideoSizes;

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams
        protected void localInit(byte[] bArr) throws java.io.IOException {
            org.bouncycastle.asn1.ASN1Primitive fromByteArray = org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr);
            if (fromByteArray instanceof org.bouncycastle.asn1.ASN1OctetString) {
                this.getHighSpeedVideoSizes = org.bouncycastle.asn1.ASN1OctetString.getInstance(fromByteArray).getOctets();
            } else {
                if (!(fromByteArray instanceof org.bouncycastle.asn1.ASN1Sequence)) {
                    throw new java.io.IOException("Unable to recognize parameters");
                }
                org.bouncycastle.asn1.cryptopro.GOST28147Parameters gOST28147Parameters = org.bouncycastle.asn1.cryptopro.GOST28147Parameters.getInstance(fromByteArray);
                this.getHighResolutionOutputSizeshNQ4ISI = gOST28147Parameters.getEncryptionParamSet();
                this.getHighSpeedVideoSizes = gOST28147Parameters.getIV();
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams
        protected byte[] localGetEncoded() throws java.io.IOException {
            return new org.bouncycastle.asn1.cryptopro.GOST28147Parameters(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI).getEncoded();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams, org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException {
            if (cls == javax.crypto.spec.IvParameterSpec.class) {
                return new javax.crypto.spec.IvParameterSpec(this.getHighSpeedVideoSizes);
            }
            if (cls == org.bouncycastle.jcajce.spec.GOST28147ParameterSpec.class || cls == java.security.spec.AlgorithmParameterSpec.class) {
                return new org.bouncycastle.jcajce.spec.GOST28147ParameterSpec(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AlgorithmParameterSpec not recognized: ");
            sb.append(cls.getName());
            throw new java.security.spec.InvalidParameterSpecException(sb.toString());
        }

        @Override // java.security.AlgorithmParametersSpi
        protected java.lang.String engineToString() {
            return "GOST 28147 IV Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.GOST28147.BaseAlgParams, java.security.AlgorithmParametersSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.spec.InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof javax.crypto.spec.IvParameterSpec) {
                this.getHighSpeedVideoSizes = ((javax.crypto.spec.IvParameterSpec) algorithmParameterSpec).getIV();
            } else {
                if (!(algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.GOST28147ParameterSpec)) {
                    throw new java.security.spec.InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
                }
                this.getHighSpeedVideoSizes = ((org.bouncycastle.jcajce.spec.GOST28147ParameterSpec) algorithmParameterSpec).getIV();
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI = getSBoxOID(((org.bouncycastle.jcajce.spec.GOST28147ParameterSpec) algorithmParameterSpec).getSBox());
                } catch (java.lang.IllegalArgumentException e) {
                    throw new java.security.spec.InvalidParameterSpecException(e.getMessage());
                }
            }
        }
    }

    public static class AlgParamGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator {
        byte[] getHighSpeedVideoFpsRangesFor = new byte[8];
        byte[] getHighSpeedVideoSizes = org.bouncycastle.crypto.engines.GOST28147Engine.getSBox("E-A");

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
            if (!(algorithmParameterSpec instanceof org.bouncycastle.jcajce.spec.GOST28147ParameterSpec)) {
                throw new java.security.InvalidAlgorithmParameterException("parameter spec not supported");
            }
            this.getHighSpeedVideoSizes = ((org.bouncycastle.jcajce.spec.GOST28147ParameterSpec) algorithmParameterSpec).getSBox();
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected java.security.AlgorithmParameters engineGenerateParameters() {
            if (this.random == null) {
                this.random = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(this.getHighSpeedVideoFpsRangesFor);
            try {
                java.security.AlgorithmParameters createParametersInstance = createParametersInstance("GOST28147");
                createParametersInstance.init(new org.bouncycastle.jcajce.spec.GOST28147ParameterSpec(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor));
                return createParametersInstance;
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e.getMessage());
            }
        }
    }

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoSizes = org.bouncycastle.jcajce.provider.symmetric.GOST28147.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoSizes;
            sb.append(str);
            sb.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.GOST28147", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.GOST", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.GOST-28147", "GOST28147");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Cipher.");
            sb2.append(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR28147_gcfb);
            java.lang.String obj = sb2.toString();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$GCFB");
            configurableProvider.addAlgorithm(obj, sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.GOST28147", sb4.toString());
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.GOST", "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.GOST-28147", "GOST28147");
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Alg.Alias.KeyGenerator.");
            sb5.append(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR28147_gcfb);
            configurableProvider.addAlgorithm(sb5.toString(), "GOST28147");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.GOST28147", sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.GOST28147", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb8.append(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR28147_gcfb);
            configurableProvider.addAlgorithm(sb8.toString(), "GOST28147");
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameterGenerator.");
            sb9.append(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR28147_gcfb);
            configurableProvider.addAlgorithm(sb9.toString(), "GOST28147");
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("Cipher.");
            sb10.append(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_KeyWrap);
            java.lang.String obj2 = sb10.toString();
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(str);
            sb11.append("$CryptoProWrap");
            configurableProvider.addAlgorithm(obj2, sb11.toString());
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder("Cipher.");
            sb12.append(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_None_KeyWrap);
            java.lang.String obj3 = sb12.toString();
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
            sb13.append(str);
            sb13.append("$GostWrap");
            configurableProvider.addAlgorithm(obj3, sb13.toString());
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
            sb14.append(str);
            sb14.append("$Mac");
            configurableProvider.addAlgorithm("Mac.GOST28147MAC", sb14.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.GOST28147", "GOST28147MAC");
        }
    }

    public static class KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen(int i) {
            super("GOST28147", i, new org.bouncycastle.crypto.CipherKeyGenerator());
        }

        public KeyGen() {
            this(256);
        }
    }

    public static class CBC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.GOST28147Engine()), 64);
        }
    }

    public static class CryptoProWrap extends org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher {
        public CryptoProWrap() {
            super(new org.bouncycastle.crypto.engines.CryptoProWrapEngine());
        }
    }

    public static class ECB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB() {
            super(new org.bouncycastle.crypto.engines.GOST28147Engine());
        }
    }

    public static class GCFB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public GCFB() {
            super(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.GCFBBlockCipher(new org.bouncycastle.crypto.engines.GOST28147Engine())), 64);
        }
    }

    public static class GostWrap extends org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher {
        public GostWrap() {
            super(new org.bouncycastle.crypto.engines.GOST28147WrapEngine());
        }
    }

    public static class Mac extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public Mac() {
            super(new org.bouncycastle.crypto.macs.GOST28147Mac());
        }
    }

    private GOST28147() {
    }

    static {
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_TestParamSet, "E-TEST");
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet, "E-A");
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_B_ParamSet, "E-B");
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_C_ParamSet, "E-C");
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_D_ParamSet, "E-D");
        Camera2StreamConfigurationMap.put(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_28147_param_Z, "PARAM-Z");
        getHighResolutionOutputSizeshNQ4ISI.put("E-A", org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet);
        getHighResolutionOutputSizeshNQ4ISI.put("E-B", org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_B_ParamSet);
        getHighResolutionOutputSizeshNQ4ISI.put("E-C", org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_C_ParamSet);
        getHighResolutionOutputSizeshNQ4ISI.put("E-D", org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_D_ParamSet);
        getHighResolutionOutputSizeshNQ4ISI.put("PARAM-Z", org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_28147_param_Z);
    }
}
