package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public class PBEPBKDF2 {
    private static final java.util.Map getHighSpeedVideoSizes;

    public static class BasePBKDF2 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory {
        private int getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoSizes;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public javax.crypto.SecretKey engineGenerateSecret(java.security.spec.KeySpec keySpec) throws java.security.spec.InvalidKeySpecException {
            if (!(keySpec instanceof javax.crypto.spec.PBEKeySpec)) {
                throw new java.security.spec.InvalidKeySpecException("Invalid KeySpec");
            }
            javax.crypto.spec.PBEKeySpec pBEKeySpec = (javax.crypto.spec.PBEKeySpec) keySpec;
            if (pBEKeySpec.getSalt() == null) {
                return new org.bouncycastle.jcajce.PBKDF2Key(pBEKeySpec.getPassword(), this.getHighSpeedVideoFpsRanges == 1 ? org.bouncycastle.crypto.PasswordConverter.ASCII : org.bouncycastle.crypto.PasswordConverter.UTF8);
            }
            if (pBEKeySpec.getIterationCount() <= 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("positive iteration count required: ");
                sb.append(pBEKeySpec.getIterationCount());
                throw new java.security.spec.InvalidKeySpecException(sb.toString());
            }
            if (pBEKeySpec.getKeyLength() <= 0) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("positive key length required: ");
                sb2.append(pBEKeySpec.getKeyLength());
                throw new java.security.spec.InvalidKeySpecException(sb2.toString());
            }
            if (pBEKeySpec.getPassword().length == 0) {
                throw new java.lang.IllegalArgumentException("password empty");
            }
            if (!(pBEKeySpec instanceof org.bouncycastle.jcajce.spec.PBKDF2KeySpec)) {
                int i = this.getHighSpeedVideoSizes;
                int keyLength = pBEKeySpec.getKeyLength();
                return new org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey(this.algName, this.algOid, this.getHighSpeedVideoFpsRanges, i, keyLength, -1, pBEKeySpec, org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEMacParameters(pBEKeySpec, this.getHighSpeedVideoFpsRanges, i, keyLength));
            }
            org.bouncycastle.asn1.ASN1ObjectIdentifier algorithm = ((org.bouncycastle.jcajce.spec.PBKDF2KeySpec) pBEKeySpec).getPrf().getAlgorithm();
            java.lang.Integer num = (java.lang.Integer) org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.getHighSpeedVideoSizes.get(algorithm);
            if (num == null) {
                throw new java.security.spec.InvalidKeySpecException("Invalid KeySpec: unknown PRF algorithm ".concat(java.lang.String.valueOf(algorithm)));
            }
            int intValue = num.intValue();
            int keyLength2 = pBEKeySpec.getKeyLength();
            return new org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey(this.algName, this.algOid, this.getHighSpeedVideoFpsRanges, intValue, keyLength2, -1, pBEKeySpec, org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEMacParameters(pBEKeySpec, this.getHighSpeedVideoFpsRanges, intValue, keyLength2));
        }

        public BasePBKDF2(java.lang.String str, int i, int i2) {
            super(str, org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBKDF2);
            this.getHighSpeedVideoFpsRanges = i;
            this.getHighSpeedVideoSizes = i2;
        }

        public BasePBKDF2(java.lang.String str, int i) {
            this(str, i, 1);
        }
    }

    public static class AlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters {
        org.bouncycastle.asn1.pkcs.PBKDF2Params getHighResolutionOutputSizeshNQ4ISI;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public java.security.spec.AlgorithmParameterSpec localEngineGetParameterSpec(java.lang.Class cls) throws java.security.spec.InvalidParameterSpecException {
            if (cls == javax.crypto.spec.PBEParameterSpec.class || cls == java.security.spec.AlgorithmParameterSpec.class) {
                return new javax.crypto.spec.PBEParameterSpec(this.getHighResolutionOutputSizeshNQ4ISI.getSalt(), this.getHighResolutionOutputSizeshNQ4ISI.getIterationCount().intValue());
            }
            throw new java.security.spec.InvalidParameterSpecException("unknown parameter spec passed to PBKDF2 PBE parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected java.lang.String engineToString() {
            return "PBKDF2 Parameters";
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
            this.getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.asn1.pkcs.PBKDF2Params.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr));
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) throws java.security.spec.InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof javax.crypto.spec.PBEParameterSpec)) {
                throw new java.security.spec.InvalidParameterSpecException("PBEParameterSpec required to initialise a PBKDF2 PBE parameters algorithm parameters object");
            }
            javax.crypto.spec.PBEParameterSpec pBEParameterSpec = (javax.crypto.spec.PBEParameterSpec) algorithmParameterSpec;
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.asn1.pkcs.PBKDF2Params(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
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
                return this.getHighResolutionOutputSizeshNQ4ISI.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER);
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Oooops! ");
                sb.append(e.toString());
                throw new java.lang.RuntimeException(sb.toString());
            }
        }
    }

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoFpsRangesFor;
            sb.append(str);
            sb.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.PBKDF2", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb2.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBKDF2);
            configurableProvider.addAlgorithm(sb2.toString(), org.jose4j.keys.PbkdfKey.ALGORITHM);
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$PBKDF2withUTF8");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBKDF2", sb3.toString());
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1", org.jose4j.keys.PbkdfKey.ALGORITHM);
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1ANDUTF8", org.jose4j.keys.PbkdfKey.ALGORITHM);
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Alg.Alias.SecretKeyFactory.");
            sb4.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_PBKDF2);
            configurableProvider.addAlgorithm(sb4.toString(), org.jose4j.keys.PbkdfKey.ALGORITHM);
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$PBKDF2with8BIT");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBKDF2WITHASCII", sb5.toString());
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBKDF2WITH8BIT", "PBKDF2WITHASCII");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1AND8BIT", "PBKDF2WITHASCII");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$PBKDF2withSHA224");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACSHA224", sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$PBKDF2withSHA256");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACSHA256", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$PBKDF2withSHA384");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACSHA384", sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            sb9.append("$PBKDF2withSHA512");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACSHA512", sb9.toString());
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            sb10.append(str);
            sb10.append("$PBKDF2withSHA3_224");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACSHA3-224", sb10.toString());
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(str);
            sb11.append("$PBKDF2withSHA3_256");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACSHA3-256", sb11.toString());
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
            sb12.append(str);
            sb12.append("$PBKDF2withSHA3_384");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACSHA3-384", sb12.toString());
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
            sb13.append(str);
            sb13.append("$PBKDF2withSHA3_512");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACSHA3-512", sb13.toString());
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
            sb14.append(str);
            sb14.append("$PBKDF2withGOST3411");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACGOST3411", sb14.toString());
            java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
            sb15.append(str);
            sb15.append("$PBKDF2withSM3");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACSM3", sb15.toString());
        }
    }

    public static class PBKDF2with8BIT extends org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public PBKDF2with8BIT() {
            super(org.jose4j.keys.PbkdfKey.ALGORITHM, 1);
        }
    }

    public static class PBKDF2withGOST3411 extends org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public PBKDF2withGOST3411() {
            super(org.jose4j.keys.PbkdfKey.ALGORITHM, 5, 6);
        }
    }

    public static class PBKDF2withSHA224 extends org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public PBKDF2withSHA224() {
            super(org.jose4j.keys.PbkdfKey.ALGORITHM, 5, 7);
        }
    }

    public static class PBKDF2withSHA256 extends org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public PBKDF2withSHA256() {
            super(org.jose4j.keys.PbkdfKey.ALGORITHM, 5, 4);
        }
    }

    public static class PBKDF2withSHA384 extends org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public PBKDF2withSHA384() {
            super(org.jose4j.keys.PbkdfKey.ALGORITHM, 5, 8);
        }
    }

    public static class PBKDF2withSHA3_224 extends org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public PBKDF2withSHA3_224() {
            super(org.jose4j.keys.PbkdfKey.ALGORITHM, 5, 10);
        }
    }

    public static class PBKDF2withSHA3_256 extends org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public PBKDF2withSHA3_256() {
            super(org.jose4j.keys.PbkdfKey.ALGORITHM, 5, 11);
        }
    }

    public static class PBKDF2withSHA3_384 extends org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public PBKDF2withSHA3_384() {
            super(org.jose4j.keys.PbkdfKey.ALGORITHM, 5, 12);
        }
    }

    public static class PBKDF2withSHA3_512 extends org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public PBKDF2withSHA3_512() {
            super(org.jose4j.keys.PbkdfKey.ALGORITHM, 5, 13);
        }
    }

    public static class PBKDF2withSHA512 extends org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public PBKDF2withSHA512() {
            super(org.jose4j.keys.PbkdfKey.ALGORITHM, 5, 9);
        }
    }

    public static class PBKDF2withSM3 extends org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public PBKDF2withSM3() {
            super(org.jose4j.keys.PbkdfKey.ALGORITHM, 5, 14);
        }
    }

    public static class PBKDF2withUTF8 extends org.bouncycastle.jcajce.provider.symmetric.PBEPBKDF2.BasePBKDF2 {
        public PBKDF2withUTF8() {
            super(org.jose4j.keys.PbkdfKey.ALGORITHM, 5);
        }
    }

    private PBEPBKDF2() {
    }

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        getHighSpeedVideoSizes = hashMap;
        hashMap.put(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411Hmac, org.bouncycastle.util.Integers.valueOf(6));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA1, org.bouncycastle.util.Integers.valueOf(1));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA256, org.bouncycastle.util.Integers.valueOf(4));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA224, org.bouncycastle.util.Integers.valueOf(7));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA384, org.bouncycastle.util.Integers.valueOf(8));
        hashMap.put(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA512, org.bouncycastle.util.Integers.valueOf(9));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_256, org.bouncycastle.util.Integers.valueOf(11));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_224, org.bouncycastle.util.Integers.valueOf(10));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_384, org.bouncycastle.util.Integers.valueOf(12));
        hashMap.put(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_512, org.bouncycastle.util.Integers.valueOf(13));
        hashMap.put(org.bouncycastle.asn1.gm.GMObjectIdentifiers.hmac_sm3, org.bouncycastle.util.Integers.valueOf(14));
    }
}
