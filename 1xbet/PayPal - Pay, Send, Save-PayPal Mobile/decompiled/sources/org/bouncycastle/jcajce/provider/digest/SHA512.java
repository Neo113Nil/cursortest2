package org.bouncycastle.jcajce.provider.digest;

/* loaded from: classes17.dex */
public class SHA512 {

    public static class Mappings extends org.bouncycastle.jcajce.provider.digest.DigestAlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoFpsRanges = org.bouncycastle.jcajce.provider.digest.SHA512.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoFpsRanges;
            sb.append(str);
            sb.append("$Digest");
            configurableProvider.addAlgorithm("MessageDigest.SHA-512", sb.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512", "SHA-512");
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Alg.Alias.MessageDigest.");
            sb2.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512);
            configurableProvider.addAlgorithm(sb2.toString(), "SHA-512");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$DigestT224");
            configurableProvider.addAlgorithm("MessageDigest.SHA-512/224", sb3.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512/224", org.apache.commons.codec.digest.MessageDigestAlgorithms.SHA_512_224);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512224", org.apache.commons.codec.digest.MessageDigestAlgorithms.SHA_512_224);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA-512(224)", org.apache.commons.codec.digest.MessageDigestAlgorithms.SHA_512_224);
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512(224)", org.apache.commons.codec.digest.MessageDigestAlgorithms.SHA_512_224);
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Alg.Alias.MessageDigest.");
            sb4.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_224);
            configurableProvider.addAlgorithm(sb4.toString(), org.apache.commons.codec.digest.MessageDigestAlgorithms.SHA_512_224);
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$DigestT256");
            configurableProvider.addAlgorithm("MessageDigest.SHA-512/256", sb5.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512/256", "SHA-512/256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512256", "SHA-512/256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA-512(256)", "SHA-512/256");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHA512(256)", "SHA-512/256");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Alg.Alias.MessageDigest.");
            sb6.append(org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha512_256);
            configurableProvider.addAlgorithm(sb6.toString(), "SHA-512/256");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$OldSHA512");
            configurableProvider.addAlgorithm("Mac.OLDHMACSHA512", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$HashMac");
            configurableProvider.addAlgorithm("Mac.PBEWITHHMACSHA512", sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            sb9.append("$HashMac");
            java.lang.String obj = sb9.toString();
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            sb10.append(str);
            sb10.append("$KeyGenerator");
            addHMACAlgorithm(configurableProvider, "SHA512", obj, sb10.toString());
            addHMACAlias(configurableProvider, "SHA512", org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers.id_hmacWithSHA512);
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(str);
            sb11.append("$HashMacT224");
            java.lang.String obj2 = sb11.toString();
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
            sb12.append(str);
            sb12.append("$KeyGeneratorT224");
            addHMACAlgorithm(configurableProvider, "SHA512/224", obj2, sb12.toString());
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
            sb13.append(str);
            sb13.append("$HashMacT256");
            java.lang.String obj3 = sb13.toString();
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
            sb14.append(str);
            sb14.append("$KeyGeneratorT256");
            addHMACAlgorithm(configurableProvider, "SHA512/256", obj3, sb14.toString());
        }
    }

    public static class Digest extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.SHA512.Digest digest = (org.bouncycastle.jcajce.provider.digest.SHA512.Digest) super.clone();
            digest.digest = new org.bouncycastle.crypto.digests.SHA512Digest((org.bouncycastle.crypto.digests.SHA512Digest) this.digest);
            return digest;
        }

        public Digest() {
            super(new org.bouncycastle.crypto.digests.SHA512Digest());
        }
    }

    public static class DigestT extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.SHA512.DigestT digestT = (org.bouncycastle.jcajce.provider.digest.SHA512.DigestT) super.clone();
            digestT.digest = new org.bouncycastle.crypto.digests.SHA512tDigest((org.bouncycastle.crypto.digests.SHA512tDigest) this.digest);
            return digestT;
        }

        public DigestT(int i) {
            super(new org.bouncycastle.crypto.digests.SHA512tDigest(i));
        }
    }

    public static class DigestT224 extends org.bouncycastle.jcajce.provider.digest.SHA512.DigestT {
        public DigestT224() {
            super(224);
        }
    }

    public static class DigestT256 extends org.bouncycastle.jcajce.provider.digest.SHA512.DigestT {
        public DigestT256() {
            super(256);
        }
    }

    public static class HashMac extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SHA512Digest()));
        }
    }

    public static class HashMacT224 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMacT224() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SHA512tDigest(224)));
        }
    }

    public static class HashMacT256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMacT256() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SHA512tDigest(256)));
        }
    }

    public static class KeyGenerator extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator() {
            super("HMACSHA512", 512, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class KeyGeneratorT224 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGeneratorT224() {
            super("HMACSHA512/224", 224, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class KeyGeneratorT256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGeneratorT256() {
            super("HMACSHA512/256", 256, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class OldSHA512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public OldSHA512() {
            super(new org.bouncycastle.crypto.macs.OldHMac(new org.bouncycastle.crypto.digests.SHA512Digest()));
        }
    }

    private SHA512() {
    }
}
