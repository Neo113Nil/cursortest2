package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class SipHash {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoSizes = org.bouncycastle.jcajce.provider.symmetric.SipHash.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoSizes;
            sb.append(str);
            sb.append("$Mac24");
            configurableProvider.addAlgorithm("Mac.SIPHASH-2-4", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.SIPHASH", "SIPHASH-2-4");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$Mac48");
            configurableProvider.addAlgorithm("Mac.SIPHASH-4-8", sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.SIPHASH", sb3.toString());
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.SIPHASH-2-4", "SIPHASH");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.SIPHASH-4-8", "SIPHASH");
        }
    }

    public static class KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen() {
            super("SipHash", 128, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class Mac24 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public Mac24() {
            super(new org.bouncycastle.crypto.macs.SipHash());
        }
    }

    public static class Mac48 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public Mac48() {
            super(new org.bouncycastle.crypto.macs.SipHash(4, 8));
        }
    }

    private SipHash() {
    }
}
