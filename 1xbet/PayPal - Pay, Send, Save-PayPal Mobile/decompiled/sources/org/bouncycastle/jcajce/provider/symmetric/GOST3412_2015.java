package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public class GOST3412_2015 {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoSizes = org.bouncycastle.jcajce.provider.symmetric.GOST3412_2015.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoSizes;
            sb.append(str);
            sb.append("$ECB");
            configurableProvider.addAlgorithm("Cipher.GOST3412-2015", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$GCFB");
            configurableProvider.addAlgorithm("Cipher.GOST3412-2015/CFB", sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$GCFB8");
            configurableProvider.addAlgorithm("Cipher.GOST3412-2015/CFB8", sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$OFB");
            configurableProvider.addAlgorithm("Cipher.GOST3412-2015/OFB", sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$CBC");
            configurableProvider.addAlgorithm("Cipher.GOST3412-2015/CBC", sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$CTR");
            configurableProvider.addAlgorithm("Cipher.GOST3412-2015/CTR", sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.GOST3412-2015", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$Mac");
            configurableProvider.addAlgorithm("Mac.GOST3412MAC", sb8.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Mac.GOST3412-2015", "GOST3412MAC");
        }
    }

    public static class KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen(int i) {
            super("GOST3412-2015", i, new org.bouncycastle.crypto.CipherKeyGenerator());
        }

        public KeyGen() {
            this(256);
        }
    }

    public static class CBC extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CBC() {
            super((org.bouncycastle.crypto.BlockCipher) new org.bouncycastle.crypto.modes.G3413CBCBlockCipher(new org.bouncycastle.crypto.engines.GOST3412_2015Engine()), false, 128);
        }
    }

    public static class CTR extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public CTR() {
            super(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.G3413CTRBlockCipher(new org.bouncycastle.crypto.engines.GOST3412_2015Engine())), true, 64);
        }
    }

    public static class ECB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public ECB() {
            super(new org.bouncycastle.crypto.engines.GOST3412_2015Engine());
        }
    }

    public static class GCFB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public GCFB() {
            super(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.G3413CFBBlockCipher(new org.bouncycastle.crypto.engines.GOST3412_2015Engine())), false, 128);
        }
    }

    public static class GCFB8 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public GCFB8() {
            super(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.G3413CFBBlockCipher(new org.bouncycastle.crypto.engines.GOST3412_2015Engine(), 8)), false, 128);
        }
    }

    public static class Mac extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public Mac() {
            super(new org.bouncycastle.crypto.macs.CMac(new org.bouncycastle.crypto.engines.GOST3412_2015Engine()));
        }
    }

    public static class OFB extends org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher {
        public OFB() {
            super(new org.bouncycastle.crypto.BufferedBlockCipher(new org.bouncycastle.crypto.modes.G3413OFBBlockCipher(new org.bouncycastle.crypto.engines.GOST3412_2015Engine())), false, 128);
        }
    }
}
