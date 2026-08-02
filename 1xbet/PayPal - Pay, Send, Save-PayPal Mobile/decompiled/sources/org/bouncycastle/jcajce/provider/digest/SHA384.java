package org.bouncycastle.jcajce.provider.digest;

/* loaded from: classes17.dex */
public class SHA384 {

    public static class Mappings extends org.bouncycastle.jcajce.provider.digest.DigestAlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoSizes = org.bouncycastle.jcajce.provider.digest.SHA384.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoSizes;
            sb.append(str);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.SHA-384", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA384", "SHA-384");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Alg.Alias.MessageDigest.");
            sb2.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha384);
            configurableProvider.addAlgorithm(sb2.toString(), "SHA-384");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$OldSHA384");
            configurableProvider.addAlgorithm("Mac.OLDHMACSHA384", sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$HashMac");
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACSHA384", sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$HashMac");
            java.lang.String obj = sb5.toString();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$KeyGenerator");
            addHMACAlgorithm(configurableProvider, "SHA384", obj, sb6.toString());
            addHMACAlias(configurableProvider, "SHA384", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA384);
        }
    }

    public static class Digest extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.SHA384.Digest digest = (org.bouncycastle.jcajce.provider.digest.SHA384.Digest) super.clone();
            digest.digest = new org.bouncycastle.crypto.digests.SHA384Digest((org.bouncycastle.crypto.digests.SHA384Digest) this.digest);
            return digest;
        }

        public Digest() {
            super(new org.bouncycastle.crypto.digests.SHA384Digest());
        }
    }

    public static class HashMac extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SHA384Digest()));
        }
    }

    public static class KeyGenerator extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA384", 384, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class OldSHA384 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public OldSHA384() {
            super(new org.bouncycastle.crypto.macs.OldHMac(new org.bouncycastle.crypto.digests.SHA384Digest()));
        }
    }

    private SHA384() {
    }
}
