package org.bouncycastle.jcajce.provider.digest;

/* loaded from: classes17.dex */
public class SHA256 {

    public static class Mappings extends org.bouncycastle.jcajce.provider.digest.DigestAlgorithmProvider {
        private static final java.lang.String Camera2StreamConfigurationMap = org.bouncycastle.jcajce.provider.digest.SHA256.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = Camera2StreamConfigurationMap;
            sb.append(str);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.SHA-256", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA256", "SHA-256");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Alg.Alias.MessageDigest.");
            sb2.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
            configurableProvider.addAlgorithm(sb2.toString(), "SHA-256");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$PBEWithMacKeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHHMACSHA256", sb3.toString());
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA-256", "PBEWITHHMACSHA256");
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Alg.Alias.SecretKeyFactory.");
            sb4.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
            configurableProvider.addAlgorithm(sb4.toString(), "PBEWITHHMACSHA256");
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$HashMac");
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACSHA256", sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$HashMac");
            java.lang.String obj = sb6.toString();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$KeyGenerator");
            addHMACAlgorithm(configurableProvider, "SHA256", obj, sb7.toString());
            addHMACAlias(configurableProvider, "SHA256", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA256);
            addHMACAlias(configurableProvider, "SHA256", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha256);
        }
    }

    public static class Digest extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.SHA256.Digest digest = (org.bouncycastle.jcajce.provider.digest.SHA256.Digest) super.clone();
            digest.digest = new org.bouncycastle.crypto.digests.SHA256Digest((org.bouncycastle.crypto.digests.SHA256Digest) this.digest);
            return digest;
        }

        public Digest() {
            super(new org.bouncycastle.crypto.digests.SHA256Digest());
        }
    }

    public static class HashMac extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SHA256Digest()));
        }
    }

    public static class KeyGenerator extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA256", 256, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class PBEWithMacKeyFactory extends org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacSHA256", null, false, 2, 4, 256, 0);
        }
    }

    private SHA256() {
    }
}
