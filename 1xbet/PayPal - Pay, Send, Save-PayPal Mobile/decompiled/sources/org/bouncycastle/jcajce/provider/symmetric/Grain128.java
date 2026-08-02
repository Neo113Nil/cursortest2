package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class Grain128 {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoFpsRanges = org.bouncycastle.jcajce.provider.symmetric.Grain128.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoFpsRanges;
            sb.append(str);
            sb.append("$Base");
            configurableProvider.addAlgorithm("Cipher.Grain128", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.Grain128", sb2.toString());
        }
    }

    public static class Base extends org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher {
        public Base() {
            super(new org.bouncycastle.crypto.engines.Grain128Engine(), 12);
        }
    }

    public static class KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen() {
            super("Grain128", 128, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    private Grain128() {
    }
}
