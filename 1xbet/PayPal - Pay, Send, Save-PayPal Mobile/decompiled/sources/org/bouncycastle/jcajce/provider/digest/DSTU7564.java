package org.bouncycastle.jcajce.provider.digest;

/* loaded from: classes17.dex */
public class DSTU7564 {

    public static class Mappings extends org.bouncycastle.jcajce.provider.digest.DigestAlgorithmProvider {
        private static final java.lang.String Camera2StreamConfigurationMap = org.bouncycastle.jcajce.provider.digest.DSTU7564.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = Camera2StreamConfigurationMap;
            sb.append(str);
            sb.append("$Digest256");
            configurableProvider.addAlgorithm("MessageDigest.DSTU7564-256", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$Digest384");
            configurableProvider.addAlgorithm("MessageDigest.DSTU7564-384", sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$Digest512");
            configurableProvider.addAlgorithm("MessageDigest.DSTU7564-512", sb3.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7564digest_256;
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$Digest256");
            configurableProvider.addAlgorithm("MessageDigest", aSN1ObjectIdentifier, sb4.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier2 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7564digest_384;
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$Digest384");
            configurableProvider.addAlgorithm("MessageDigest", aSN1ObjectIdentifier2, sb5.toString());
            org.bouncycastle.asn1.ASN1ObjectIdentifier aSN1ObjectIdentifier3 = org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7564digest_512;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$Digest512");
            configurableProvider.addAlgorithm("MessageDigest", aSN1ObjectIdentifier3, sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$HashMac256");
            java.lang.String obj = sb7.toString();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$KeyGenerator256");
            addHMACAlgorithm(configurableProvider, "DSTU7564-256", obj, sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            sb9.append("$HashMac384");
            java.lang.String obj2 = sb9.toString();
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            sb10.append(str);
            sb10.append("$KeyGenerator384");
            addHMACAlgorithm(configurableProvider, "DSTU7564-384", obj2, sb10.toString());
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(str);
            sb11.append("$HashMac512");
            java.lang.String obj3 = sb11.toString();
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
            sb12.append(str);
            sb12.append("$KeyGenerator512");
            addHMACAlgorithm(configurableProvider, "DSTU7564-512", obj3, sb12.toString());
            addHMACAlias(configurableProvider, "DSTU7564-256", org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7564mac_256);
            addHMACAlias(configurableProvider, "DSTU7564-384", org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7564mac_384);
            addHMACAlias(configurableProvider, "DSTU7564-512", org.bouncycastle.asn1.ua.UAObjectIdentifiers.dstu7564mac_512);
        }
    }

    public static class DigestDSTU7564 extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.BCMessageDigest bCMessageDigest = (org.bouncycastle.jcajce.provider.digest.BCMessageDigest) super.clone();
            bCMessageDigest.digest = new org.bouncycastle.crypto.digests.DSTU7564Digest((org.bouncycastle.crypto.digests.DSTU7564Digest) this.digest);
            return bCMessageDigest;
        }

        public DigestDSTU7564(int i) {
            super(new org.bouncycastle.crypto.digests.DSTU7564Digest(i));
        }
    }

    public static class Digest256 extends org.bouncycastle.jcajce.provider.digest.DSTU7564.DigestDSTU7564 {
        public Digest256() {
            super(256);
        }
    }

    public static class Digest384 extends org.bouncycastle.jcajce.provider.digest.DSTU7564.DigestDSTU7564 {
        public Digest384() {
            super(384);
        }
    }

    public static class Digest512 extends org.bouncycastle.jcajce.provider.digest.DSTU7564.DigestDSTU7564 {
        public Digest512() {
            super(512);
        }
    }

    public static class HashMac256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac256() {
            super(new org.bouncycastle.crypto.macs.DSTU7564Mac(256));
        }
    }

    public static class HashMac384 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac384() {
            super(new org.bouncycastle.crypto.macs.DSTU7564Mac(384));
        }
    }

    public static class HashMac512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac512() {
            super(new org.bouncycastle.crypto.macs.DSTU7564Mac(512));
        }
    }

    public static class KeyGenerator256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator256() {
            super("HMACDSTU7564-256", 256, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class KeyGenerator384 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator384() {
            super("HMACDSTU7564-384", 384, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class KeyGenerator512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public KeyGenerator512() {
            super("HMACDSTU7564-512", 512, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    private DSTU7564() {
    }
}
