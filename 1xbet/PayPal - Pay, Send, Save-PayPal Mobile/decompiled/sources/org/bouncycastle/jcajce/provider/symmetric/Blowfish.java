package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class Blowfish {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoSizes = org.bouncycastle.jcajce.provider.symmetric.Blowfish.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoSizes;
            sb.append(str);
            sb.append("$CMAC");
            configurableProvider.addAlgorithm("Mac.BLOWFISHCMAC", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.BLOWFISH", sb2.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.misc.MiscObjectIdentifiers.cryptlib_algorithm_blowfish_CBC;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$CBC");
            configurableProvider.addAlgorithm("Cipher", aSN1ObjectIdentifier, sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.BLOWFISH", sb4.toString());
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator", org.bouncycastle.asn1.misc.MiscObjectIdentifiers.cryptlib_algorithm_blowfish_CBC, "BLOWFISH");
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.BLOWFISH", sb5.toString());
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters", org.bouncycastle.asn1.misc.MiscObjectIdentifiers.cryptlib_algorithm_blowfish_CBC, "BLOWFISH");
        }
    }

    public static class AlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public java.lang.String engineToString() {
            return "Blowfish IV";
        }
    }

    public static class CBC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC() {
            super(new org.bouncycastle.crypto.modes.CBCBlockCipher(new org.bouncycastle.crypto.engines.BlowfishEngine()), 64);
        }
    }

    public static class CMAC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public CMAC() {
            super(new org.bouncycastle.crypto.macs.CMac(new org.bouncycastle.crypto.engines.BlowfishEngine()));
        }
    }

    public static class ECB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB() {
            super(new org.bouncycastle.crypto.engines.BlowfishEngine());
        }
    }

    public static class KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen() {
            super("Blowfish", 128, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    private Blowfish() {
    }
}
