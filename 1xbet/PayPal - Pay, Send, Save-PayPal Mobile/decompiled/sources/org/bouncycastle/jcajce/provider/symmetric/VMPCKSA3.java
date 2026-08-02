package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class VMPCKSA3 {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoFpsRanges = org.bouncycastle.jcajce.provider.symmetric.VMPCKSA3.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoFpsRanges;
            sb.append(str);
            sb.append("$Base");
            configurableProvider.addAlgorithm("Cipher.VMPC-KSA3", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.VMPC-KSA3", sb2.toString());
        }
    }

    public static class Base extends org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher {
        public Base() {
            super(new org.bouncycastle.crypto.engines.VMPCKSA3Engine(), 16);
        }
    }

    public static class KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen() {
            super("VMPC-KSA3", 128, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    private VMPCKSA3() {
    }
}
