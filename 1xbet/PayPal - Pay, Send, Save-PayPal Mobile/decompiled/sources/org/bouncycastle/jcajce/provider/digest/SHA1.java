package org.bouncycastle.jcajce.provider.digest;

/* loaded from: classes17.dex */
public class SHA1 {

    public static class Mappings extends org.bouncycastle.jcajce.provider.digest.DigestAlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoFpsRanges = org.bouncycastle.jcajce.provider.digest.SHA1.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoFpsRanges;
            sb.append(str);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.SHA-1", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA1", "SHA-1");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA", "SHA-1");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Alg.Alias.MessageDigest.");
            sb2.append(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1);
            configurableProvider.addAlgorithm(sb2.toString(), "SHA-1");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$HashMac");
            java.lang.String obj = sb3.toString();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$KeyGenerator");
            addHMACAlgorithm(configurableProvider, "SHA1", obj, sb4.toString());
            addHMACAlias(configurableProvider, "SHA1", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA1);
            addHMACAlias(configurableProvider, "SHA1", org.bouncycastle.asn1.iana.IANAObjectIdentifiers.hmacSHA1);
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$SHA1Mac");
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACSHA", sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$SHA1Mac");
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACSHA1", sb6.toString());
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA", "PBEWITHHMACSHA1");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("Alg.Alias.SecretKeyFactory.");
            sb7.append(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1);
            configurableProvider.addAlgorithm(sb7.toString(), "PBEWITHHMACSHA1");
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Alg.Alias.Mac.");
            sb8.append(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1);
            configurableProvider.addAlgorithm(sb8.toString(), "PBEWITHHMACSHA");
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            sb9.append("$PBEWithMacKeyFactory");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBEWITHHMACSHA1", sb9.toString());
        }
    }

    public static class Digest extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.SHA1.Digest digest = (org.bouncycastle.jcajce.provider.digest.SHA1.Digest) super.clone();
            digest.digest = new org.bouncycastle.crypto.digests.SHA1Digest((org.bouncycastle.crypto.digests.SHA1Digest) this.digest);
            return digest;
        }

        public Digest() {
            super(new org.bouncycastle.crypto.digests.SHA1Digest());
        }
    }

    public static class HashMac extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SHA1Digest()));
        }
    }

    public static class KeyGenerator extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA1", 160, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class PBEWithMacKeyFactory extends org.bouncycastle.jcajce.provider.symmetric.util.PBESecretKeyFactory {
        public PBEWithMacKeyFactory() {
            super("PBEwithHmacSHA", null, false, 2, 1, 160, 0);
        }
    }

    public static class SHA1Mac extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public SHA1Mac() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SHA1Digest()));
        }
    }

    private SHA1() {
    }
}
