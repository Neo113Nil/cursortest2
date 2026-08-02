package org.bouncycastle.jcajce.provider.digest;

/* loaded from: classes17.dex */
public class SHA3 {

    public static class Mappings extends org.bouncycastle.jcajce.provider.digest.DigestAlgorithmProvider {
        private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.provider.digest.SHA3.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighResolutionOutputSizeshNQ4ISI;
            sb.append(str);
            sb.append("$Digest224");
            configurableProvider.addAlgorithm("MessageDigest.SHA3-224", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$Digest256");
            configurableProvider.addAlgorithm("MessageDigest.SHA3-256", sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$Digest384");
            configurableProvider.addAlgorithm("MessageDigest.SHA3-384", sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$Digest512");
            configurableProvider.addAlgorithm("MessageDigest.SHA3-512", sb4.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_224;
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$Digest224");
            configurableProvider.addAlgorithm("MessageDigest", aSN1ObjectIdentifier, sb5.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_256;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$Digest256");
            configurableProvider.addAlgorithm("MessageDigest", aSN1ObjectIdentifier2, sb6.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier3 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_384;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$Digest384");
            configurableProvider.addAlgorithm("MessageDigest", aSN1ObjectIdentifier3, sb7.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier4 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_sha3_512;
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$Digest512");
            configurableProvider.addAlgorithm("MessageDigest", aSN1ObjectIdentifier4, sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            sb9.append("$DigestShake256_512");
            configurableProvider.addAlgorithm("MessageDigest.SHAKE256-512", sb9.toString());
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            sb10.append(str);
            sb10.append("$DigestShake128_256");
            configurableProvider.addAlgorithm("MessageDigest.SHAKE128-256", sb10.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier5 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake256;
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(str);
            sb11.append("$DigestShake256_512");
            configurableProvider.addAlgorithm("MessageDigest", aSN1ObjectIdentifier5, sb11.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier6 = org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_shake128;
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
            sb12.append(str);
            sb12.append("$DigestShake128_256");
            configurableProvider.addAlgorithm("MessageDigest", aSN1ObjectIdentifier6, sb12.toString());
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHAKE256", "SHAKE256-512");
            configurableProvider.addAlgorithm("Alg.Alias.MessageDigest.SHAKE128", "SHAKE128-256");
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
            sb13.append(str);
            sb13.append("$HashMac224");
            java.lang.String obj = sb13.toString();
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
            sb14.append(str);
            sb14.append("$KeyGenerator224");
            addHMACAlgorithm(configurableProvider, "SHA3-224", obj, sb14.toString());
            addHMACAlias(configurableProvider, "SHA3-224", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_224);
            java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
            sb15.append(str);
            sb15.append("$HashMac256");
            java.lang.String obj2 = sb15.toString();
            java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
            sb16.append(str);
            sb16.append("$KeyGenerator256");
            addHMACAlgorithm(configurableProvider, "SHA3-256", obj2, sb16.toString());
            addHMACAlias(configurableProvider, "SHA3-256", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_256);
            java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
            sb17.append(str);
            sb17.append("$HashMac384");
            java.lang.String obj3 = sb17.toString();
            java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
            sb18.append(str);
            sb18.append("$KeyGenerator384");
            addHMACAlgorithm(configurableProvider, "SHA3-384", obj3, sb18.toString());
            addHMACAlias(configurableProvider, "SHA3-384", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_384);
            java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
            sb19.append(str);
            sb19.append("$HashMac512");
            java.lang.String obj4 = sb19.toString();
            java.lang.StringBuilder sb20 = new java.lang.StringBuilder();
            sb20.append(str);
            sb20.append("$KeyGenerator512");
            addHMACAlgorithm(configurableProvider, "SHA3-512", obj4, sb20.toString());
            addHMACAlias(configurableProvider, "SHA3-512", org.bouncycastle.asn1.nist.NISTObjectIdentifiers.id_hmacWithSHA3_512);
        }
    }

    public static class DigestSHA3 extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.BCMessageDigest bCMessageDigest = (org.bouncycastle.jcajce.provider.digest.BCMessageDigest) super.clone();
            bCMessageDigest.digest = new org.bouncycastle.crypto.digests.SHA3Digest((org.bouncycastle.crypto.digests.SHA3Digest) this.digest);
            return bCMessageDigest;
        }

        public DigestSHA3(int i) {
            super(new org.bouncycastle.crypto.digests.SHA3Digest(i));
        }
    }

    public static class DigestSHAKE extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.BCMessageDigest bCMessageDigest = (org.bouncycastle.jcajce.provider.digest.BCMessageDigest) super.clone();
            bCMessageDigest.digest = new org.bouncycastle.crypto.digests.SHAKEDigest((org.bouncycastle.crypto.digests.SHAKEDigest) this.digest);
            return bCMessageDigest;
        }

        public DigestSHAKE(int i, int i2) {
            super(new org.bouncycastle.crypto.digests.SHAKEDigest(i));
        }
    }

    public static class Digest224 extends org.bouncycastle.jcajce.provider.digest.SHA3.DigestSHA3 {
        public Digest224() {
            super(224);
        }
    }

    public static class Digest256 extends org.bouncycastle.jcajce.provider.digest.SHA3.DigestSHA3 {
        public Digest256() {
            super(256);
        }
    }

    public static class Digest384 extends org.bouncycastle.jcajce.provider.digest.SHA3.DigestSHA3 {
        public Digest384() {
            super(384);
        }
    }

    public static class Digest512 extends org.bouncycastle.jcajce.provider.digest.SHA3.DigestSHA3 {
        public Digest512() {
            super(512);
        }
    }

    public static class DigestShake128_256 extends org.bouncycastle.jcajce.provider.digest.SHA3.DigestSHAKE {
        public DigestShake128_256() {
            super(128, 256);
        }
    }

    public static class DigestShake256_512 extends org.bouncycastle.jcajce.provider.digest.SHA3.DigestSHAKE {
        public DigestShake256_512() {
            super(256, 512);
        }
    }

    public static class HashMac224 extends org.bouncycastle.jcajce.provider.digest.SHA3.HashMacSHA3 {
        public HashMac224() {
            super(224);
        }
    }

    public static class HashMac256 extends org.bouncycastle.jcajce.provider.digest.SHA3.HashMacSHA3 {
        public HashMac256() {
            super(256);
        }
    }

    public static class HashMac384 extends org.bouncycastle.jcajce.provider.digest.SHA3.HashMacSHA3 {
        public HashMac384() {
            super(384);
        }
    }

    public static class HashMac512 extends org.bouncycastle.jcajce.provider.digest.SHA3.HashMacSHA3 {
        public HashMac512() {
            super(512);
        }
    }

    public static class HashMacSHA3 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMacSHA3(int i) {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SHA3Digest(i)));
        }
    }

    public static class KeyGenerator224 extends org.bouncycastle.jcajce.provider.digest.SHA3.KeyGeneratorSHA3 {
        public KeyGenerator224() {
            super(224);
        }
    }

    public static class KeyGenerator256 extends org.bouncycastle.jcajce.provider.digest.SHA3.KeyGeneratorSHA3 {
        public KeyGenerator256() {
            super(256);
        }
    }

    public static class KeyGenerator384 extends org.bouncycastle.jcajce.provider.digest.SHA3.KeyGeneratorSHA3 {
        public KeyGenerator384() {
            super(384);
        }
    }

    public static class KeyGenerator512 extends org.bouncycastle.jcajce.provider.digest.SHA3.KeyGeneratorSHA3 {
        public KeyGenerator512() {
            super(512);
        }
    }

    public static class KeyGeneratorSHA3 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGeneratorSHA3(int i) {
            super("HMACSHA3-".concat(java.lang.String.valueOf(i)), i, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    private SHA3() {
    }
}
