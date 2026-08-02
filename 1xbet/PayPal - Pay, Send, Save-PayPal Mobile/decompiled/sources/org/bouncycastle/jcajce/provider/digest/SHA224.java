package org.bouncycastle.jcajce.provider.digest;

/* loaded from: classes17.dex */
public class SHA224 {

    public static class Mappings extends org.bouncycastle.jcajce.provider.digest.DigestAlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.provider.digest.SHA224.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoFpsRangesFor;
            sb.append(str);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.SHA-224", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA224", "SHA-224");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Alg.Alias.MessageDigest.");
            sb2.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha224);
            configurableProvider.addAlgorithm(sb2.toString(), "SHA-224");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$HashMac");
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACSHA224", sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$HashMac");
            java.lang.String obj = sb4.toString();
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$KeyGenerator");
            addHMACAlgorithm(configurableProvider, "SHA224", obj, sb5.toString());
            addHMACAlias(configurableProvider, "SHA224", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA224);
        }
    }

    public static class Digest extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.SHA224.Digest digest = (org.bouncycastle.jcajce.provider.digest.SHA224.Digest) super.clone();
            digest.digest = new org.bouncycastle.crypto.digests.SHA224Digest((org.bouncycastle.crypto.digests.SHA224Digest) this.digest);
            return digest;
        }

        public Digest() {
            super(new org.bouncycastle.crypto.digests.SHA224Digest());
        }
    }

    public static class HashMac extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SHA224Digest()));
        }
    }

    public static class KeyGenerator extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA224", 224, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    private SHA224() {
    }
}
