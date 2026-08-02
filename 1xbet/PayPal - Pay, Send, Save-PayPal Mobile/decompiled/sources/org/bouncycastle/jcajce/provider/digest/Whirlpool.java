package org.bouncycastle.jcajce.provider.digest;

/* loaded from: classes17.dex */
public class Whirlpool {

    public static class Mappings extends org.bouncycastle.jcajce.provider.digest.DigestAlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.provider.digest.Whirlpool.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoFpsRangesFor;
            sb.append(str);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.WHIRLPOOL", sb.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.iso.ISOIECObjectIdentifiers.whirlpool;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest", aSN1ObjectIdentifier, sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$HashMac");
            java.lang.String obj = sb3.toString();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$KeyGenerator");
            addHMACAlgorithm(configurableProvider, "WHIRLPOOL", obj, sb4.toString());
        }
    }

    public static class Digest extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.Whirlpool.Digest digest = (org.bouncycastle.jcajce.provider.digest.Whirlpool.Digest) super.clone();
            digest.digest = new org.bouncycastle.crypto.digests.WhirlpoolDigest((org.bouncycastle.crypto.digests.WhirlpoolDigest) this.digest);
            return digest;
        }

        public Digest() {
            super(new org.bouncycastle.crypto.digests.WhirlpoolDigest());
        }
    }

    public static class HashMac extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.WhirlpoolDigest()));
        }
    }

    public static class KeyGenerator extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACWHIRLPOOL", 512, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    private Whirlpool() {
    }
}
