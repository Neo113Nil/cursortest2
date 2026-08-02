package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public class Poly1305 {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.provider.symmetric.Poly1305.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoFpsRangesFor;
            sb.append(str);
            sb.append("$Mac");
            configurableProvider.addAlgorithm("Mac.POLY1305", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.POLY1305", sb2.toString());
        }
    }

    public static class KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen() {
            super("Poly1305", 256, new org.bouncycastle.crypto.generators.Poly1305KeyGenerator());
        }
    }

    public static class Mac extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public Mac() {
            super(new org.bouncycastle.crypto.macs.Poly1305());
        }
    }

    private Poly1305() {
    }
}
