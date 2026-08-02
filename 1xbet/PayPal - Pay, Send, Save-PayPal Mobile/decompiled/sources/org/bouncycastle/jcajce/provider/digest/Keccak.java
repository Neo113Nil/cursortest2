package org.bouncycastle.jcajce.provider.digest;

/* loaded from: classes17.dex */
public class Keccak {

    public static class Mappings extends org.bouncycastle.jcajce.provider.digest.DigestAlgorithmProvider {
        private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.provider.digest.Keccak.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighResolutionOutputSizeshNQ4ISI;
            sb.append(str);
            sb.append("$Digest224");
            configurableProvider.addAlgorithm("MessageDigest.KECCAK-224", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$Digest288");
            configurableProvider.addAlgorithm("MessageDigest.KECCAK-288", sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$Digest256");
            configurableProvider.addAlgorithm("MessageDigest.KECCAK-256", sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$Digest384");
            configurableProvider.addAlgorithm("MessageDigest.KECCAK-384", sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$Digest512");
            configurableProvider.addAlgorithm("MessageDigest.KECCAK-512", sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$HashMac224");
            java.lang.String obj = sb6.toString();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$KeyGenerator224");
            addHMACAlgorithm(configurableProvider, "KECCAK224", obj, sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$HashMac256");
            java.lang.String obj2 = sb8.toString();
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            sb9.append("$KeyGenerator256");
            addHMACAlgorithm(configurableProvider, "KECCAK256", obj2, sb9.toString());
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            sb10.append(str);
            sb10.append("$HashMac288");
            java.lang.String obj3 = sb10.toString();
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(str);
            sb11.append("$KeyGenerator288");
            addHMACAlgorithm(configurableProvider, "KECCAK288", obj3, sb11.toString());
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
            sb12.append(str);
            sb12.append("$HashMac384");
            java.lang.String obj4 = sb12.toString();
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
            sb13.append(str);
            sb13.append("$KeyGenerator384");
            addHMACAlgorithm(configurableProvider, "KECCAK384", obj4, sb13.toString());
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
            sb14.append(str);
            sb14.append("$HashMac512");
            java.lang.String obj5 = sb14.toString();
            java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
            sb15.append(str);
            sb15.append("$KeyGenerator512");
            addHMACAlgorithm(configurableProvider, "KECCAK512", obj5, sb15.toString());
        }
    }

    public static class DigestKeccak extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.BCMessageDigest bCMessageDigest = (org.bouncycastle.jcajce.provider.digest.BCMessageDigest) super.clone();
            bCMessageDigest.digest = new org.bouncycastle.crypto.digests.KeccakDigest((org.bouncycastle.crypto.digests.KeccakDigest) this.digest);
            return bCMessageDigest;
        }

        public DigestKeccak(int i) {
            super(new org.bouncycastle.crypto.digests.KeccakDigest(i));
        }
    }

    public static class Digest224 extends org.bouncycastle.jcajce.provider.digest.Keccak.DigestKeccak {
        public Digest224() {
            super(224);
        }
    }

    public static class Digest256 extends org.bouncycastle.jcajce.provider.digest.Keccak.DigestKeccak {
        public Digest256() {
            super(256);
        }
    }

    public static class Digest288 extends org.bouncycastle.jcajce.provider.digest.Keccak.DigestKeccak {
        public Digest288() {
            super(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE);
        }
    }

    public static class Digest384 extends org.bouncycastle.jcajce.provider.digest.Keccak.DigestKeccak {
        public Digest384() {
            super(384);
        }
    }

    public static class Digest512 extends org.bouncycastle.jcajce.provider.digest.Keccak.DigestKeccak {
        public Digest512() {
            super(512);
        }
    }

    public static class HashMac224 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac224() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.KeccakDigest(224)));
        }
    }

    public static class HashMac256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac256() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.KeccakDigest(256)));
        }
    }

    public static class HashMac288 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac288() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.KeccakDigest(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE)));
        }
    }

    public static class HashMac384 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac384() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.KeccakDigest(384)));
        }
    }

    public static class HashMac512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac512() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.KeccakDigest(512)));
        }
    }

    public static class KeyGenerator224 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator224() {
            super("HMACKECCAK224", 224, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class KeyGenerator256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator256() {
            super("HMACKECCAK256", 256, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class KeyGenerator288 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator288() {
            super("HMACKECCAK288", com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class KeyGenerator384 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator384() {
            super("HMACKECCAK384", 384, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class KeyGenerator512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator512() {
            super("HMACKECCAK512", 512, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    private Keccak() {
    }
}
