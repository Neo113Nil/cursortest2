package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class ChaCha {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String Camera2StreamConfigurationMap = org.bouncycastle.jcajce.provider.symmetric.ChaCha.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = Camera2StreamConfigurationMap;
            sb.append(str);
            sb.append("$Base");
            configurableProvider.addAlgorithm("Cipher.CHACHA", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.CHACHA", sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$Base7539");
            configurableProvider.addAlgorithm("Cipher.CHACHA7539", sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$KeyGen7539");
            configurableProvider.addAlgorithm("KeyGenerator.CHACHA7539", sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.CHACHA7539", sb5.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.CHACHA20", "CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.CHACHA20", "CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.CHACHA20", "CHACHA7539");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.CHACHA20-POLY1305", "CHACHA7539");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Alg.Alias.KeyGenerator.");
            sb6.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_AEADChaCha20Poly1305);
            configurableProvider.addAlgorithm(sb6.toString(), "CHACHA7539");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$BaseCC20P1305");
            configurableProvider.addAlgorithm("Cipher.CHACHA20-POLY1305", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$AlgParamsCC1305");
            configurableProvider.addAlgorithm("AlgorithmParameters.CHACHA20-POLY1305", sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("Alg.Alias.Cipher.");
            sb9.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_AEADChaCha20Poly1305);
            configurableProvider.addAlgorithm(sb9.toString(), "CHACHA20-POLY1305");
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb10.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_AEADChaCha20Poly1305);
            configurableProvider.addAlgorithm(sb10.toString(), "CHACHA20-POLY1305");
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder("Alg.Alias.Cipher.OID.");
            sb11.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_AEADChaCha20Poly1305);
            configurableProvider.addAlgorithm(sb11.toString(), "CHACHA20-POLY1305");
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.OID.");
            sb12.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_alg_AEADChaCha20Poly1305);
            configurableProvider.addAlgorithm(sb12.toString(), "CHACHA20-POLY1305");
        }
    }

    public static class AlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public java.lang.String engineToString() {
            return "ChaCha7539 IV";
        }
    }

    public static class AlgParamsCC1305 extends org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public java.lang.String engineToString() {
            return "ChaCha20-Poly1305 IV";
        }
    }

    public static class Base extends org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher {
        public Base() {
            super(new org.bouncycastle.crypto.engines.ChaChaEngine(), 8);
        }
    }

    public static class Base7539 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher {
        public Base7539() {
            super(new org.bouncycastle.crypto.engines.ChaCha7539Engine(), 12);
        }
    }

    public static class BaseCC20P1305 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public BaseCC20P1305() {
            super((org.bouncycastle.crypto.modes.AEADCipher) new org.bouncycastle.crypto.modes.ChaCha20Poly1305(), true, 12);
        }
    }

    public static class KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen() {
            super("ChaCha", 128, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class KeyGen7539 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen7539() {
            super("ChaCha7539", 256, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    private ChaCha() {
    }
}
