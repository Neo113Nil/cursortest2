package org.bouncycastle.jcajce.provider.symmetric;

/* loaded from: classes17.dex */
public final class ARC4 {

    public static class Mappings extends org.bouncycastle.jcajce.provider.util.AlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoSizes = org.bouncycastle.jcajce.provider.symmetric.ARC4.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoSizes;
            sb.append(str);
            sb.append("$Base");
            configurableProvider.addAlgorithm("Cipher.ARC4", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.rc4, "ARC4");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.ARCFOUR", "ARC4");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.RC4", "ARC4");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$KeyGen");
            configurableProvider.addAlgorithm("KeyGenerator.ARC4", sb2.toString());
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.RC4", "ARC4");
            configurableProvider.addAlgorithm("Alg.Alias.KeyGenerator.1.2.840.113549.3.4", "ARC4");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$PBEWithSHAAnd128BitKeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND128BITRC4", sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$PBEWithSHAAnd40BitKeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND40BITRC4", sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb5.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4);
            configurableProvider.addAlgorithm(sb5.toString(), "PKCS12PBE");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Alg.Alias.AlgorithmParameters.");
            sb6.append(org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC4);
            configurableProvider.addAlgorithm(sb6.toString(), "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC4", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC4", "PKCS12PBE");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC4", "PKCS12PBE");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$PBEWithSHAAnd128Bit");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND128BITRC4", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$PBEWithSHAAnd40Bit");
            configurableProvider.addAlgorithm("Cipher.PBEWITHSHAAND40BITRC4", sb8.toString());
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4, "PBEWITHSHAAND128BITRC4");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC4, "PBEWITHSHAAND40BITRC4");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC4", "PBEWITHSHAAND128BITRC4");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC4", "PBEWITHSHAAND40BITRC4");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4, "PBEWITHSHAAND128BITRC4");
            configurableProvider.addAlgorithm("Alg.Alias.Cipher", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC4, "PBEWITHSHAAND40BITRC4");
        }
    }

    public static class Base extends org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher {
        public Base() {
            super(new org.bouncycastle.crypto.engines.RC4Engine(), 0);
        }
    }

    public static class KeyGen extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGen() {
            super("RC4", 128, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class PBEWithSHAAnd128Bit extends org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher {
        public PBEWithSHAAnd128Bit() {
            super(new org.bouncycastle.crypto.engines.RC4Engine(), 0, 128, 1);
        }
    }

    public static class PBEWithSHAAnd128BitKeyFactory extends org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHAAnd128BitKeyFactory() {
            super("PBEWithSHAAnd128BitRC4", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4, true, 2, 1, 128, 0);
        }
    }

    public static class PBEWithSHAAnd40Bit extends org.bouncycastle.jcajce.provider.symmetric.util.BaseStreamCipher {
        public PBEWithSHAAnd40Bit() {
            super(new org.bouncycastle.crypto.engines.RC4Engine(), 0, 40, 1);
        }
    }

    public static class PBEWithSHAAnd40BitKeyFactory extends org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithSHAAnd40BitKeyFactory() {
            super("PBEWithSHAAnd128BitRC4", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.pbeWithSHAAnd128BitRC4, true, 2, 1, 40, 0);
        }
    }

    private ARC4() {
    }
}
