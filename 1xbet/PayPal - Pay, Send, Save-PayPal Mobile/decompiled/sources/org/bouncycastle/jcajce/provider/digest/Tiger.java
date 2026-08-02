package org.bouncycastle.jcajce.provider.digest;

/* loaded from: classes17.dex */
public class Tiger {

    public static class Mappings extends org.bouncycastle.jcajce.provider.digest.DigestAlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.provider.digest.Tiger.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoFpsRangesFor;
            sb.append(str);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.TIGER", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.Tiger", sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$HashMac");
            java.lang.String obj = sb3.toString();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$KeyGenerator");
            addHMACAlgorithm(configurableProvider, "TIGER", obj, sb4.toString());
            addHMACAlias(configurableProvider, "TIGER", org.bouncycastle.asn1.iana.IANAObjectIdentifiers.hmacTIGER);
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$PBEWithMacKeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHHMACTIGER", sb5.toString());
        }
    }

    public static class Digest extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.Tiger.Digest digest = (org.bouncycastle.jcajce.provider.digest.Tiger.Digest) super.clone();
            digest.digest = new org.bouncycastle.crypto.digests.TigerDigest((org.bouncycastle.crypto.digests.TigerDigest) this.digest);
            return digest;
        }

        public Digest() {
            super(new org.bouncycastle.crypto.digests.TigerDigest());
        }
    }

    public static class HashMac extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.TigerDigest()));
        }
    }

    public static class KeyGenerator extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACTIGER", 192, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class PBEWithHashMac extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public PBEWithHashMac() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.TigerDigest()), 2, 3, 192);
        }
    }

    public static class PBEWithMacKeyFactory extends org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacTiger", null, false, 2, 3, 192, 0);
        }
    }

    public static class TigerHmac extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public TigerHmac() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.TigerDigest()));
        }
    }

    private Tiger() {
    }
}
