package org.bouncycastle.jcajce.provider.digest;

/* loaded from: classes17.dex */
public class RIPEMD160 {

    public static class Mappings extends org.bouncycastle.jcajce.provider.digest.DigestAlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoSizes = org.bouncycastle.jcajce.provider.digest.RIPEMD160.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoSizes;
            sb.append(str);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.RIPEMD160", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Alg.Alias.MessageDigest.");
            sb2.append(org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers.ripemd160);
            configurableProvider.addAlgorithm(sb2.toString(), "RIPEMD160");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$HashMac");
            java.lang.String obj = sb3.toString();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$KeyGenerator");
            addHMACAlgorithm(configurableProvider, "RIPEMD160", obj, sb4.toString());
            addHMACAlias(configurableProvider, "RIPEMD160", org.bouncycastle.asn1.iana.IANAObjectIdentifiers.hmacRIPEMD160);
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$PBEWithHmacKeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHHMACRIPEMD160", sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$PBEWithHmac");
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACRIPEMD160", sb6.toString());
        }
    }

    public static class Digest extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.RIPEMD160.Digest digest = (org.bouncycastle.jcajce.provider.digest.RIPEMD160.Digest) super.clone();
            digest.digest = new org.bouncycastle.crypto.digests.RIPEMD160Digest((org.bouncycastle.crypto.digests.RIPEMD160Digest) this.digest);
            return digest;
        }

        public Digest() {
            super(new org.bouncycastle.crypto.digests.RIPEMD160Digest());
        }
    }

    public static class HashMac extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.RIPEMD160Digest()));
        }
    }

    public static class KeyGenerator extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACRIPEMD160", 160, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class PBEWithHmac extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public PBEWithHmac() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.RIPEMD160Digest()), 2, 2, 160);
        }
    }

    public static class PBEWithHmacKeyFactory extends org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithHmacKeyFactory() {
            super("PBEwithHmacRIPEMD160", null, false, 2, 2, 160, 0);
        }
    }

    private RIPEMD160() {
    }
}
