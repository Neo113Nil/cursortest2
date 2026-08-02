package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class Skipjack {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoFpsRanges = org.bouncycastle.jcajce.provider.symmetric.Skipjack.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoFpsRanges;
            sb.append(str);
            sb.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.SKIPJACK", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.SKIPJACK", sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$AlgParams");
            configurableProvider.addAlgorithm("AlgorithmParameters.SKIPJACK", sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$Mac");
            configurableProvider.addAlgorithm("Mac.SKIPJACKMAC", sb4.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.SKIPJACK", "SKIPJACKMAC");
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$MacCFB8");
            configurableProvider.addAlgorithm("Mac.SKIPJACKMAC/CFB8", sb5.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.SKIPJACK/CFB8", "SKIPJACKMAC/CFB8");
        }
    }

    public static class AlgParams extends org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters {
        @Override // org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters, java.security.AlgorithmParametersSpi
        public java.lang.String engineToString() {
            return "Skipjack IV";
        }
    }

    public static class ECB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB() {
            super(new org.bouncycastle.crypto.engines.SkipjackEngine());
        }
    }

    public static class KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen() {
            super("Skipjack", 80, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class Mac extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public Mac() {
            super(new org.bouncycastle.crypto.macs.CBCBlockCipherMac(new org.bouncycastle.crypto.engines.SkipjackEngine()));
        }
    }

    public static class MacCFB8 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public MacCFB8() {
            super(new org.bouncycastle.crypto.macs.CFBBlockCipherMac(new org.bouncycastle.crypto.engines.SkipjackEngine()));
        }
    }

    private Skipjack() {
    }
}
