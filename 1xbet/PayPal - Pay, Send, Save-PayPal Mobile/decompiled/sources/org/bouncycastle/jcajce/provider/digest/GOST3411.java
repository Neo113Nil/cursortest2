package org.bouncycastle.jcajce.provider.digest;

/* loaded from: classes17.dex */
public class GOST3411 {

    public static class Mappings extends org.bouncycastle.jcajce.provider.digest.DigestAlgorithmProvider {
        private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.provider.digest.GOST3411.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighResolutionOutputSizeshNQ4ISI;
            sb.append(str);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.GOST3411", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST", "GOST3411");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-3411", "GOST3411");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Alg.Alias.MessageDigest.");
            sb2.append(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411);
            configurableProvider.addAlgorithm(sb2.toString(), "GOST3411");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$HashMac");
            java.lang.String obj = sb3.toString();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$KeyGenerator");
            addHMACAlgorithm(configurableProvider, "GOST3411", obj, sb4.toString());
            addHMACAlias(configurableProvider, "GOST3411", org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411);
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$Digest2012_256");
            configurableProvider.addAlgorithm("MessageDigest.GOST3411-2012-256", sb5.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-2012-256", "GOST3411-2012-256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-3411-2012-256", "GOST3411-2012-256");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Alg.Alias.MessageDigest.");
            sb6.append(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_256);
            configurableProvider.addAlgorithm(sb6.toString(), "GOST3411-2012-256");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$HashMac2012_256");
            java.lang.String obj2 = sb7.toString();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$KeyGenerator2012_256");
            addHMACAlgorithm(configurableProvider, "GOST3411-2012-256", obj2, sb8.toString());
            addHMACAlias(configurableProvider, "GOST3411-2012-256", org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_hmac_gost_3411_12_256);
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            sb9.append("$Digest2012_512");
            configurableProvider.addAlgorithm("MessageDigest.GOST3411-2012-512", sb9.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-2012-512", "GOST3411-2012-512");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.GOST-3411-2012-512", "GOST3411-2012-512");
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("Alg.Alias.MessageDigest.");
            sb10.append(org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_gost_3411_12_512);
            configurableProvider.addAlgorithm(sb10.toString(), "GOST3411-2012-512");
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(str);
            sb11.append("$HashMac2012_512");
            java.lang.String obj3 = sb11.toString();
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
            sb12.append(str);
            sb12.append("$KeyGenerator2012_512");
            addHMACAlgorithm(configurableProvider, "GOST3411-2012-512", obj3, sb12.toString());
            addHMACAlias(configurableProvider, "GOST3411-2012-512", org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers.id_tc26_hmac_gost_3411_12_512);
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
            sb13.append(str);
            sb13.append("$PBEWithMacKeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHHMACGOST3411", sb13.toString());
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder("Alg.Alias.SecretKeyFactory.");
            sb14.append(org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers.gostR3411);
            configurableProvider.addAlgorithm(sb14.toString(), "PBEWITHHMACGOST3411");
        }
    }

    public static class Digest extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.GOST3411.Digest digest = (org.bouncycastle.jcajce.provider.digest.GOST3411.Digest) super.clone();
            digest.digest = new org.bouncycastle.crypto.digests.GOST3411Digest((org.bouncycastle.crypto.digests.GOST3411Digest) this.digest);
            return digest;
        }

        public Digest() {
            super(new org.bouncycastle.crypto.digests.GOST3411Digest());
        }
    }

    public static class Digest2012_256 extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.GOST3411.Digest2012_256 digest2012_256 = (org.bouncycastle.jcajce.provider.digest.GOST3411.Digest2012_256) super.clone();
            digest2012_256.digest = new org.bouncycastle.crypto.digests.GOST3411_2012_256Digest((org.bouncycastle.crypto.digests.GOST3411_2012_256Digest) this.digest);
            return digest2012_256;
        }

        public Digest2012_256() {
            super(new org.bouncycastle.crypto.digests.GOST3411_2012_256Digest());
        }
    }

    public static class Digest2012_512 extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.GOST3411.Digest2012_512 digest2012_512 = (org.bouncycastle.jcajce.provider.digest.GOST3411.Digest2012_512) super.clone();
            digest2012_512.digest = new org.bouncycastle.crypto.digests.GOST3411_2012_512Digest((org.bouncycastle.crypto.digests.GOST3411_2012_512Digest) this.digest);
            return digest2012_512;
        }

        public Digest2012_512() {
            super(new org.bouncycastle.crypto.digests.GOST3411_2012_512Digest());
        }
    }

    public static class HashMac extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.GOST3411Digest()));
        }
    }

    public static class HashMac2012_256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac2012_256() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.GOST3411_2012_256Digest()));
        }
    }

    public static class HashMac2012_512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac2012_512() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.GOST3411_2012_512Digest()));
        }
    }

    public static class KeyGenerator extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACGOST3411", 256, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class KeyGenerator2012_256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator2012_256() {
            super("HMACGOST3411", 256, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class KeyGenerator2012_512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator2012_512() {
            super("HMACGOST3411", 512, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class PBEWithMacKeyFactory extends org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacGOST3411", null, false, 2, 6, 256, 0);
        }
    }

    private GOST3411() {
    }
}
