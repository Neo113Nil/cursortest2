package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class RC2 {

    public static class AlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters {
        private static final short[] getHighResolutionOutputSizeshNQ4ISI = {189, 86, 234, 242, 162, 241, 172, 42, 176, com.visa.cbp.setDeviceName.isOutputSupportedFor, 209, 156, 27, 51, 253, 208, 48, 4, 182, 220, 125, 223, 50, 75, 247, 203, 69, 155, 49, 187, 33, 90, 65, 159, 225, 217, 74, 77, 158, 218, 160, 104, 44, 195, 39, 95, 128, 54, 62, 238, 251, 149, 26, 254, 206, 168, 52, 169, 19, 240, 166, 63, 216, 12, 120, 36, 175, 35, 82, 193, 103, 23, 245, 102, com.visa.cbp.setDeviceName.Camera2StreamConfigurationMap, 231, 232, 7, 184, 96, 72, 230, 30, 83, 243, com.visa.cbp.setDeviceName.getOutputStallDurationlomOqCM, com.visa.cbp.getEncExpo.ResultReceiverMyResultReceiver, 114, 140, 8, 21, 110, 134, 0, com.visa.cbp.setDeviceName.getHighSpeedVideoFpsRanges, 250, 244, 127, 138, 66, 25, 246, 219, 205, 20, 141, 80, 18, 186, 60, 6, 78, 236, 179, 53, 17, 161, 136, 142, 43, com.visa.cbp.setDeviceName.coroutineBoundary, 153, 183, 113, 116, 211, 228, 191, 58, 222, 150, 14, 188, 10, 237, 119, 252, 55, 107, 3, 121, 137, 98, 198, 215, 192, 210, 124, 106, 139, 34, 163, 91, 5, 93, 2, 117, 213, 97, 227, 24, com.visa.cbp.setDeviceName.getOutputSizeshNQ4ISI, 85, 81, 173, 31, 11, 94, 133, 229, 194, 87, 99, 202, 61, 108, 180, 197, 204, 112, com.visa.cbp.getEncExpo.invoke, com.visa.cbp.setDeviceName.getHighSpeedVideoSizesFor, 89, 13, 71, 32, 200, 79, 88, 224, 1, 226, 22, 56, 196, com.visa.cbp.setDeviceName.getHighResolutionOutputSizeshNQ4ISI, 59, 15, 101, 70, 190, 126, 45, 123, 130, 249, 64, 181, 29, 115, 248, 235, 38, 199, com.visa.cbp.setDeviceName.unwrapAs, 151, 37, 84, 177, 40, 170, 152, 157, com.visa.cbp.setDeviceName._CREATION, 100, 109, 122, 212, 16, 129, 68, 239, 73, 214, 174, 46, 221, 118, 92, 47, 167, 28, 201, 9, 105, 154, 131, 207, 41, 57, 185, 233, 76, 255, 67, 171};
        private static final short[] getHighSpeedVideoFpsRangesFor = {93, 190, 155, 139, 17, 153, 110, 77, 89, 243, 133, 166, 63, 183, 131, 197, 228, 115, 107, 58, 104, 90, 192, 71, 160, 100, 52, 12, 241, 208, 82, com.visa.cbp.setDeviceName._CREATION, 185, 30, 150, 67, 65, 216, 212, 44, 219, 248, 7, 119, 42, 202, 235, 239, 16, 28, 22, 13, 56, 114, 47, 137, 193, 249, 128, 196, 109, 174, 48, 61, 206, 32, 99, 254, 230, 26, 199, 184, 80, 232, 36, 23, 252, 37, com.visa.cbp.setDeviceName.getHighResolutionOutputSizeshNQ4ISI, 187, 106, 163, 68, 83, 217, 162, 1, 171, 188, 182, 31, 152, 238, 154, 167, 45, 79, 158, 142, 172, 224, 198, 73, 70, 41, 244, com.visa.cbp.setDeviceName.coroutineBoundary, 138, 175, 225, 91, 195, 179, 123, 87, 209, 124, 156, 237, com.visa.cbp.setDeviceName.unwrapAs, 64, 140, 226, 203, com.visa.cbp.setDeviceName.isOutputSupportedFor, 20, 201, 97, 46, 229, 204, 246, 94, 168, 92, 214, 117, 141, 98, 149, 88, 105, 118, 161, 74, 181, 85, 9, 120, 51, 130, 215, 221, 121, 245, 27, 11, 222, 38, 33, 40, 116, 4, 151, 86, 223, 60, 240, 55, 57, 220, 255, 6, com.visa.cbp.getEncExpo.ResultReceiverMyResultReceiver, 234, 66, 8, 218, 180, 113, 176, 207, 18, 122, 78, 250, 108, 29, com.visa.cbp.setDeviceName.getHighSpeedVideoFpsRanges, 0, 200, 127, com.visa.cbp.setDeviceName.getHighSpeedVideoSizesFor, 69, 170, 43, 194, 177, com.visa.cbp.setDeviceName.getOutputSizeshNQ4ISI, 213, 186, 242, 173, 25, com.visa.cbp.getEncExpo.invoke, 103, 54, 247, 15, 10, com.visa.cbp.setDeviceName.getOutputStallDurationlomOqCM, 125, 227, 157, 233, com.visa.cbp.setDeviceName.Camera2StreamConfigurationMap, 62, 35, 39, 102, 19, 236, 129, 21, 189, 34, 191, 159, 126, 169, 81, 75, 76, 251, 2, 211, 112, 134, 49, 231, 59, 5, 3, 84, 96, 72, 101, 24, 210, 205, 95, 50, 136, 14, 53, 253};
        private int getHighSpeedVideoFpsRanges = 58;
        private byte[] getHighSpeedVideoSizes;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException {
            int i;
            if ((cls == javax.crypto.spec.RC2ParameterSpec.class || cls == java.security.spec.AlgorithmParameterSpec.class) && (i = this.getHighSpeedVideoFpsRanges) != -1) {
                return i < 256 ? new javax.crypto.spec.RC2ParameterSpec(getHighSpeedVideoFpsRangesFor[this.getHighSpeedVideoFpsRanges], this.getHighSpeedVideoSizes) : new javax.crypto.spec.RC2ParameterSpec(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes);
            }
            if (cls == javax.crypto.spec.IvParameterSpec.class) {
                return new javax.crypto.spec.IvParameterSpec(this.getHighSpeedVideoSizes);
            }
            throw new java.security.spec.InvalidParameterSpecException("unknown parameter spec passed to RC2 parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected java.lang.String engineToString() {
            return "RC2 Parameters";
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, java.lang.String str) throws java.io.IOException {
            if (!isASN1FormatString(str)) {
                if (!str.equals("RAW")) {
                    throw new java.io.IOException("Unknown parameters format in IV parameters object");
                }
                engineInit(bArr);
            } else {
                org.bouncycastle.asn1.pkcs.RC2CBCParameter rC2CBCParameter = org.bouncycastle.asn1.pkcs.RC2CBCParameter.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr));
                if (rC2CBCParameter.getRC2ParameterVersion() != null) {
                    this.getHighSpeedVideoFpsRanges = rC2CBCParameter.getRC2ParameterVersion().intValue();
                }
                this.getHighSpeedVideoSizes = rC2CBCParameter.getIV();
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) throws java.io.IOException {
            this.getHighSpeedVideoSizes = org.bouncycastle.util.Arrays.clone(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.spec.InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof javax.crypto.spec.IvParameterSpec) {
                this.getHighSpeedVideoSizes = ((javax.crypto.spec.IvParameterSpec) algorithmParameterSpec).getIV();
                return;
            }
            if (!(algorithmParameterSpec instanceof javax.crypto.spec.RC2ParameterSpec)) {
                throw new java.security.spec.InvalidParameterSpecException("IvParameterSpec or RC2ParameterSpec required to initialise a RC2 parameters algorithm parameters object");
            }
            javax.crypto.spec.RC2ParameterSpec rC2ParameterSpec = (javax.crypto.spec.RC2ParameterSpec) algorithmParameterSpec;
            int effectiveKeyBits = rC2ParameterSpec.getEffectiveKeyBits();
            if (effectiveKeyBits != -1) {
                int i = effectiveKeyBits;
                if (effectiveKeyBits < 256) {
                    i = getHighResolutionOutputSizeshNQ4ISI[effectiveKeyBits];
                }
                this.getHighSpeedVideoFpsRanges = i;
            }
            this.getHighSpeedVideoSizes = rC2ParameterSpec.getIV();
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(java.lang.String str) throws java.io.IOException {
            if (isASN1FormatString(str)) {
                int i = this.getHighSpeedVideoFpsRanges;
                return (i == -1 ? new org.bouncycastle.asn1.pkcs.RC2CBCParameter(engineGetEncoded()) : new org.bouncycastle.asn1.pkcs.RC2CBCParameter(i, engineGetEncoded())).getEncoded();
            }
            if (str.equals("RAW")) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            return org.bouncycastle.util.Arrays.clone(this.getHighSpeedVideoSizes);
        }
    }

    public static class AlgParamGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator {
        javax.crypto.spec.RC2ParameterSpec getHighSpeedVideoFpsRangesFor = null;

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec, java.security.SecureRandom secureRandom) throws java.security.InvalidAlgorithmParameterException {
            if (!(algorithmParameterSpec instanceof javax.crypto.spec.RC2ParameterSpec)) {
                throw new java.security.InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for RC2 parameter generation.");
            }
            this.getHighSpeedVideoFpsRangesFor = (javax.crypto.spec.RC2ParameterSpec) algorithmParameterSpec;
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        protected java.security.AlgorithmParameters engineGenerateParameters() {
            if (this.getHighSpeedVideoFpsRangesFor != null) {
                try {
                    java.security.AlgorithmParameters createParametersInstance = createParametersInstance("RC2");
                    createParametersInstance.init(this.getHighSpeedVideoFpsRangesFor);
                    return createParametersInstance;
                } catch (java.lang.Exception e) {
                    throw new java.lang.RuntimeException(e.getMessage());
                }
            }
            byte[] bArr = new byte[8];
            if (this.random == null) {
                this.random = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
            }
            this.random.nextBytes(bArr);
            try {
                java.security.AlgorithmParameters createParametersInstance2 = createParametersInstance("RC2");
                createParametersInstance2.init(new javax.crypto.spec.IvParameterSpec(bArr));
                return createParametersInstance2;
            } catch (java.lang.Exception e2) {
                throw new java.lang.RuntimeException(e2.getMessage());
            }
        }
    }

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoSizes = org.bouncycastle.jcajce.provider.symmetric.RC2.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoSizes;
            sb.append(str);
            sb.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.RC2", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$AlgParamGen");
            configurableProvider.addAlgorithm("AlgorithmParameterGenerator.1.2.840.113549.3.2", sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$KeyGenerator");
            configurableProvider.addAlgorithm("KeyGenerator.RC2", sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$KeyGenerator");
            configurableProvider.addAlgorithm("KeyGenerator.1.2.840.113549.3.2", sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.RC2", sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.1.2.840.113549.3.2", sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.RC2", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$Wrap");
            configurableProvider.addAlgorithm("Cipher.RC2WRAP", sb8.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_CMSRC2wrap, "RC2WRAP");
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.RC2_CBC;
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            sb9.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, sb9.toString());
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            sb10.append(str);
            sb10.append("$CBCMAC");
            configurableProvider.addAlgorithm("Mac.RC2MAC", sb10.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.RC2", "RC2MAC");
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(str);
            sb11.append("$CFB8MAC");
            configurableProvider.addAlgorithm("Mac.RC2MAC/CFB8", sb11.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.RC2/CFB8", "RC2MAC/CFB8");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDRC2-CBC", "PBEWITHMD2ANDRC2");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDRC2-CBC", "PBEWITHMD5ANDRC2");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDRC2-CBC", "PBEWITHSHA1ANDRC2");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD2AndRC2_CBC, "PBEWITHMD2ANDRC2");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD5AndRC2_CBC, "PBEWITHMD5ANDRC2");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHA1AndRC2_CBC, "PBEWITHSHA1ANDRC2");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.5", "PBEWITHSHAAND128BITRC2-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.6", "PBEWITHSHAAND40BITRC2-CBC");
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
            sb12.append(str);
            sb12.append("$PBEWithMD2KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD2ANDRC2", sb12.toString());
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
            sb13.append(str);
            sb13.append("$PBEWithMD5KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHMD5ANDRC2", sb13.toString());
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
            sb14.append(str);
            sb14.append("$PBEWithSHA1KeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHA1ANDRC2", sb14.toString());
            java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
            sb15.append(str);
            sb15.append("$PBEWithSHAAnd128BitKeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND128BITRC2-CBC", sb15.toString());
            java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
            sb16.append(str);
            sb16.append("$PBEWithSHAAnd40BitKeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND40BITRC2-CBC", sb16.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD2AndRC2_CBC, "PBEWITHMD2ANDRC2");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD5AndRC2_CBC, "PBEWITHMD5ANDRC2");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHA1AndRC2_CBC, "PBEWITHSHA1ANDRC2");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.5", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.6", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWithSHAAnd3KeyTripleDES", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC2_CBC, "PBEWITHSHAAND128BITRC2-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC, "PBEWITHSHAAND40BITRC2-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC2-CBC", "PBEWITHSHAAND128BITRC2-CBC");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC2-CBC", "PBEWITHSHAAND40BITRC2-CBC");
            java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
            sb17.append(str);
            sb17.append("$PBEWithSHA1AndRC2");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHA1ANDRC2", sb17.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAANDRC2-CBC", "PBEWITHSHA1ANDRC2");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1ANDRC2-CBC", "PBEWITHSHA1ANDRC2");
            java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
            sb18.append(str);
            sb18.append("$PBEWithSHAAnd128BitRC2");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND128BITRC2-CBC", sb18.toString());
            java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
            sb19.append(str);
            sb19.append("$PBEWithSHAAnd40BitRC2");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND40BITRC2-CBC", sb19.toString());
            java.lang.StringBuilder sb20 = new java.lang.StringBuilder();
            sb20.append(str);
            sb20.append("$PBEWithMD5AndRC2");
            configurableProvider.addAlgorithm("Cipher.PBEWITHMD5ANDRC2", sb20.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHMD5ANDRC2-CBC", "PBEWITHMD5ANDRC2");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC2", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2-CBC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC2-CBC", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC2-CBC", "PKCS12PBE");
        }
    }

    public static class CBC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.RC2Engine()), 64);
        }
    }

    public static class CBCMAC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public CBCMAC() {
            super(new org.bouncycastle.crypto.macs.CBCBlockCipherMac(new org.bouncycastle.crypto.engines.RC2Engine()));
        }
    }

    public static class CFB8MAC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public CFB8MAC() {
            super(new org.bouncycastle.crypto.macs.CFBBlockCipherMac(new org.bouncycastle.crypto.engines.RC2Engine()));
        }
    }

    public static class ECB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB() {
            super(new org.bouncycastle.crypto.engines.RC2Engine());
        }
    }

    public static class KeyGenerator extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator() {
            super("RC2", 128, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class PBEWithMD2KeyFactory extends org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithMD2KeyFactory() {
            super("PBEwithMD2andRC2", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD2AndRC2_CBC, true, 0, 5, 64, 64);
        }
    }

    public static class PBEWithMD5AndRC2 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithMD5AndRC2() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.RC2Engine()), 0, 0, 64, 8);
        }
    }

    public static class PBEWithMD5KeyFactory extends org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithMD5KeyFactory() {
            super("PBEwithMD5andRC2", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithMD5AndRC2_CBC, true, 0, 0, 64, 64);
        }
    }

    public static class PBEWithSHA1AndRC2 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHA1AndRC2() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.RC2Engine()), 0, 1, 64, 8);
        }
    }

    public static class PBEWithSHA1KeyFactory extends org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHA1KeyFactory() {
            super("PBEwithSHA1andRC2", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHA1AndRC2_CBC, true, 0, 1, 64, 64);
        }
    }

    public static class PBEWithSHAAnd128BitKeyFactory extends org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHAAnd128BitKeyFactory() {
            super("PBEwithSHAand128BitRC2-CBC", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC2_CBC, true, 2, 1, 128, 64);
        }
    }

    public static class PBEWithSHAAnd128BitRC2 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHAAnd128BitRC2() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.RC2Engine()), 2, 1, 128, 8);
        }
    }

    public static class PBEWithSHAAnd40BitKeyFactory extends org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHAAnd40BitKeyFactory() {
            super("PBEwithSHAand40BitRC2-CBC", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC, true, 2, 1, 40, 64);
        }
    }

    public static class PBEWithSHAAnd40BitRC2 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public PBEWithSHAAnd40BitRC2() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.RC2Engine()), 2, 1, 40, 8);
        }
    }

    public static class Wrap extends org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher {
        public Wrap() {
            super(new org.bouncycastle.crypto.engines.RC2WrapEngine());
        }
    }

    private RC2() {
    }
}
