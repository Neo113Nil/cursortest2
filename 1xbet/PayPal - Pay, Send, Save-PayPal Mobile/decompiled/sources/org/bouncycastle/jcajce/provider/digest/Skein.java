package org.bouncycastle.jcajce.provider.digest;

/* loaded from: classes17.dex */
public class Skein {

    public static class Mappings extends org.bouncycastle.jcajce.provider.digest.DigestAlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoFpsRanges = org.bouncycastle.jcajce.provider.digest.Skein.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoFpsRanges;
            sb.append(str);
            sb.append("$Digest_256_128");
            configurableProvider.addAlgorithm("MessageDigest.Skein-256-128", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$Digest_256_160");
            configurableProvider.addAlgorithm("MessageDigest.Skein-256-160", sb2.toString());
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$Digest_256_224");
            configurableProvider.addAlgorithm("MessageDigest.Skein-256-224", sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(str);
            sb4.append("$Digest_256_256");
            configurableProvider.addAlgorithm("MessageDigest.Skein-256-256", sb4.toString());
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$Digest_512_128");
            configurableProvider.addAlgorithm("MessageDigest.Skein-512-128", sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str);
            sb6.append("$Digest_512_160");
            configurableProvider.addAlgorithm("MessageDigest.Skein-512-160", sb6.toString());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$Digest_512_224");
            configurableProvider.addAlgorithm("MessageDigest.Skein-512-224", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str);
            sb8.append("$Digest_512_256");
            configurableProvider.addAlgorithm("MessageDigest.Skein-512-256", sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str);
            sb9.append("$Digest_512_384");
            configurableProvider.addAlgorithm("MessageDigest.Skein-512-384", sb9.toString());
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            sb10.append(str);
            sb10.append("$Digest_512_512");
            configurableProvider.addAlgorithm("MessageDigest.Skein-512-512", sb10.toString());
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(str);
            sb11.append("$Digest_1024_384");
            configurableProvider.addAlgorithm("MessageDigest.Skein-1024-384", sb11.toString());
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
            sb12.append(str);
            sb12.append("$Digest_1024_512");
            configurableProvider.addAlgorithm("MessageDigest.Skein-1024-512", sb12.toString());
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
            sb13.append(str);
            sb13.append("$Digest_1024_1024");
            configurableProvider.addAlgorithm("MessageDigest.Skein-1024-1024", sb13.toString());
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
            sb14.append(str);
            sb14.append("$HashMac_256_128");
            java.lang.String obj = sb14.toString();
            java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
            sb15.append(str);
            sb15.append("$HMacKeyGenerator_256_128");
            addHMACAlgorithm(configurableProvider, "Skein-256-128", obj, sb15.toString());
            java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
            sb16.append(str);
            sb16.append("$HashMac_256_160");
            java.lang.String obj2 = sb16.toString();
            java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
            sb17.append(str);
            sb17.append("$HMacKeyGenerator_256_160");
            addHMACAlgorithm(configurableProvider, "Skein-256-160", obj2, sb17.toString());
            java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
            sb18.append(str);
            sb18.append("$HashMac_256_224");
            java.lang.String obj3 = sb18.toString();
            java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
            sb19.append(str);
            sb19.append("$HMacKeyGenerator_256_224");
            addHMACAlgorithm(configurableProvider, "Skein-256-224", obj3, sb19.toString());
            java.lang.StringBuilder sb20 = new java.lang.StringBuilder();
            sb20.append(str);
            sb20.append("$HashMac_256_256");
            java.lang.String obj4 = sb20.toString();
            java.lang.StringBuilder sb21 = new java.lang.StringBuilder();
            sb21.append(str);
            sb21.append("$HMacKeyGenerator_256_256");
            addHMACAlgorithm(configurableProvider, "Skein-256-256", obj4, sb21.toString());
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
            sb22.append(str);
            sb22.append("$HashMac_512_128");
            java.lang.String obj5 = sb22.toString();
            java.lang.StringBuilder sb23 = new java.lang.StringBuilder();
            sb23.append(str);
            sb23.append("$HMacKeyGenerator_512_128");
            addHMACAlgorithm(configurableProvider, "Skein-512-128", obj5, sb23.toString());
            java.lang.StringBuilder sb24 = new java.lang.StringBuilder();
            sb24.append(str);
            sb24.append("$HashMac_512_160");
            java.lang.String obj6 = sb24.toString();
            java.lang.StringBuilder sb25 = new java.lang.StringBuilder();
            sb25.append(str);
            sb25.append("$HMacKeyGenerator_512_160");
            addHMACAlgorithm(configurableProvider, "Skein-512-160", obj6, sb25.toString());
            java.lang.StringBuilder sb26 = new java.lang.StringBuilder();
            sb26.append(str);
            sb26.append("$HashMac_512_224");
            java.lang.String obj7 = sb26.toString();
            java.lang.StringBuilder sb27 = new java.lang.StringBuilder();
            sb27.append(str);
            sb27.append("$HMacKeyGenerator_512_224");
            addHMACAlgorithm(configurableProvider, "Skein-512-224", obj7, sb27.toString());
            java.lang.StringBuilder sb28 = new java.lang.StringBuilder();
            sb28.append(str);
            sb28.append("$HashMac_512_256");
            java.lang.String obj8 = sb28.toString();
            java.lang.StringBuilder sb29 = new java.lang.StringBuilder();
            sb29.append(str);
            sb29.append("$HMacKeyGenerator_512_256");
            addHMACAlgorithm(configurableProvider, "Skein-512-256", obj8, sb29.toString());
            java.lang.StringBuilder sb30 = new java.lang.StringBuilder();
            sb30.append(str);
            sb30.append("$HashMac_512_384");
            java.lang.String obj9 = sb30.toString();
            java.lang.StringBuilder sb31 = new java.lang.StringBuilder();
            sb31.append(str);
            sb31.append("$HMacKeyGenerator_512_384");
            addHMACAlgorithm(configurableProvider, "Skein-512-384", obj9, sb31.toString());
            java.lang.StringBuilder sb32 = new java.lang.StringBuilder();
            sb32.append(str);
            sb32.append("$HashMac_512_512");
            java.lang.String obj10 = sb32.toString();
            java.lang.StringBuilder sb33 = new java.lang.StringBuilder();
            sb33.append(str);
            sb33.append("$HMacKeyGenerator_512_512");
            addHMACAlgorithm(configurableProvider, "Skein-512-512", obj10, sb33.toString());
            java.lang.StringBuilder sb34 = new java.lang.StringBuilder();
            sb34.append(str);
            sb34.append("$HashMac_1024_384");
            java.lang.String obj11 = sb34.toString();
            java.lang.StringBuilder sb35 = new java.lang.StringBuilder();
            sb35.append(str);
            sb35.append("$HMacKeyGenerator_1024_384");
            addHMACAlgorithm(configurableProvider, "Skein-1024-384", obj11, sb35.toString());
            java.lang.StringBuilder sb36 = new java.lang.StringBuilder();
            sb36.append(str);
            sb36.append("$HashMac_1024_512");
            java.lang.String obj12 = sb36.toString();
            java.lang.StringBuilder sb37 = new java.lang.StringBuilder();
            sb37.append(str);
            sb37.append("$HMacKeyGenerator_1024_512");
            addHMACAlgorithm(configurableProvider, "Skein-1024-512", obj12, sb37.toString());
            java.lang.StringBuilder sb38 = new java.lang.StringBuilder();
            sb38.append(str);
            sb38.append("$HashMac_1024_1024");
            java.lang.String obj13 = sb38.toString();
            java.lang.StringBuilder sb39 = new java.lang.StringBuilder();
            sb39.append(str);
            sb39.append("$HMacKeyGenerator_1024_1024");
            addHMACAlgorithm(configurableProvider, "Skein-1024-1024", obj13, sb39.toString());
            Camera2StreamConfigurationMap(configurableProvider, 256, 128);
            Camera2StreamConfigurationMap(configurableProvider, 256, 160);
            Camera2StreamConfigurationMap(configurableProvider, 256, 224);
            Camera2StreamConfigurationMap(configurableProvider, 256, 256);
            Camera2StreamConfigurationMap(configurableProvider, 512, 128);
            Camera2StreamConfigurationMap(configurableProvider, 512, 160);
            Camera2StreamConfigurationMap(configurableProvider, 512, 224);
            Camera2StreamConfigurationMap(configurableProvider, 512, 256);
            Camera2StreamConfigurationMap(configurableProvider, 512, 384);
            Camera2StreamConfigurationMap(configurableProvider, 512, 512);
            Camera2StreamConfigurationMap(configurableProvider, 1024, 384);
            Camera2StreamConfigurationMap(configurableProvider, 1024, 512);
            Camera2StreamConfigurationMap(configurableProvider, 1024, 1024);
        }

        private static void Camera2StreamConfigurationMap(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider, int i, int i2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Skein-MAC-");
            sb.append(i);
            sb.append("-");
            sb.append(i2);
            java.lang.String obj = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoFpsRanges;
            sb2.append(str);
            sb2.append("$SkeinMac_");
            sb2.append(i);
            sb2.append("_");
            sb2.append(i2);
            java.lang.String obj2 = sb2.toString();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$SkeinMacKeyGenerator_");
            sb3.append(i);
            sb3.append("_");
            sb3.append(i2);
            java.lang.String obj3 = sb3.toString();
            configurableProvider.addAlgorithm("Mac.".concat(java.lang.String.valueOf(obj)), obj2);
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Alg.Alias.Mac.Skein-MAC");
            sb4.append(i);
            sb4.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb4.append(i2);
            configurableProvider.addAlgorithm(sb4.toString(), obj);
            configurableProvider.addAlgorithm("KeyGenerator.".concat(java.lang.String.valueOf(obj)), obj3);
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Alg.Alias.KeyGenerator.Skein-MAC");
            sb5.append(i);
            sb5.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb5.append(i2);
            configurableProvider.addAlgorithm(sb5.toString(), obj);
        }
    }

    public static class DigestSkein1024 extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.BCMessageDigest bCMessageDigest = (org.bouncycastle.jcajce.provider.digest.BCMessageDigest) super.clone();
            bCMessageDigest.digest = new org.bouncycastle.crypto.digests.SkeinDigest((org.bouncycastle.crypto.digests.SkeinDigest) this.digest);
            return bCMessageDigest;
        }

        public DigestSkein1024(int i) {
            super(new org.bouncycastle.crypto.digests.SkeinDigest(1024, i));
        }
    }

    public static class DigestSkein256 extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.BCMessageDigest bCMessageDigest = (org.bouncycastle.jcajce.provider.digest.BCMessageDigest) super.clone();
            bCMessageDigest.digest = new org.bouncycastle.crypto.digests.SkeinDigest((org.bouncycastle.crypto.digests.SkeinDigest) this.digest);
            return bCMessageDigest;
        }

        public DigestSkein256(int i) {
            super(new org.bouncycastle.crypto.digests.SkeinDigest(256, i));
        }
    }

    public static class DigestSkein512 extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.BCMessageDigest bCMessageDigest = (org.bouncycastle.jcajce.provider.digest.BCMessageDigest) super.clone();
            bCMessageDigest.digest = new org.bouncycastle.crypto.digests.SkeinDigest((org.bouncycastle.crypto.digests.SkeinDigest) this.digest);
            return bCMessageDigest;
        }

        public DigestSkein512(int i) {
            super(new org.bouncycastle.crypto.digests.SkeinDigest(512, i));
        }
    }

    public static class Digest_1024_1024 extends org.bouncycastle.jcajce.provider.digest.Skein.DigestSkein1024 {
        public Digest_1024_1024() {
            super(1024);
        }
    }

    public static class Digest_1024_384 extends org.bouncycastle.jcajce.provider.digest.Skein.DigestSkein1024 {
        public Digest_1024_384() {
            super(384);
        }
    }

    public static class Digest_1024_512 extends org.bouncycastle.jcajce.provider.digest.Skein.DigestSkein1024 {
        public Digest_1024_512() {
            super(512);
        }
    }

    public static class Digest_256_128 extends org.bouncycastle.jcajce.provider.digest.Skein.DigestSkein256 {
        public Digest_256_128() {
            super(128);
        }
    }

    public static class Digest_256_160 extends org.bouncycastle.jcajce.provider.digest.Skein.DigestSkein256 {
        public Digest_256_160() {
            super(160);
        }
    }

    public static class Digest_256_224 extends org.bouncycastle.jcajce.provider.digest.Skein.DigestSkein256 {
        public Digest_256_224() {
            super(224);
        }
    }

    public static class Digest_256_256 extends org.bouncycastle.jcajce.provider.digest.Skein.DigestSkein256 {
        public Digest_256_256() {
            super(256);
        }
    }

    public static class Digest_512_128 extends org.bouncycastle.jcajce.provider.digest.Skein.DigestSkein512 {
        public Digest_512_128() {
            super(128);
        }
    }

    public static class Digest_512_160 extends org.bouncycastle.jcajce.provider.digest.Skein.DigestSkein512 {
        public Digest_512_160() {
            super(160);
        }
    }

    public static class Digest_512_224 extends org.bouncycastle.jcajce.provider.digest.Skein.DigestSkein512 {
        public Digest_512_224() {
            super(224);
        }
    }

    public static class Digest_512_256 extends org.bouncycastle.jcajce.provider.digest.Skein.DigestSkein512 {
        public Digest_512_256() {
            super(256);
        }
    }

    public static class Digest_512_384 extends org.bouncycastle.jcajce.provider.digest.Skein.DigestSkein512 {
        public Digest_512_384() {
            super(384);
        }
    }

    public static class Digest_512_512 extends org.bouncycastle.jcajce.provider.digest.Skein.DigestSkein512 {
        public Digest_512_512() {
            super(512);
        }
    }

    public static class HMacKeyGenerator_1024_1024 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public HMacKeyGenerator_1024_1024() {
            super("HMACSkein-1024-1024", 1024, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_1024_384 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public HMacKeyGenerator_1024_384() {
            super("HMACSkein-1024-384", 384, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_1024_512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public HMacKeyGenerator_1024_512() {
            super("HMACSkein-1024-512", 512, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_256_128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public HMacKeyGenerator_256_128() {
            super("HMACSkein-256-128", 128, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_256_160 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public HMacKeyGenerator_256_160() {
            super("HMACSkein-256-160", 160, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_256_224 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public HMacKeyGenerator_256_224() {
            super("HMACSkein-256-224", 224, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_256_256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public HMacKeyGenerator_256_256() {
            super("HMACSkein-256-256", 256, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public HMacKeyGenerator_512_128() {
            super("HMACSkein-512-128", 128, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_160 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public HMacKeyGenerator_512_160() {
            super("HMACSkein-512-160", 160, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_224 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public HMacKeyGenerator_512_224() {
            super("HMACSkein-512-224", 224, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public HMacKeyGenerator_512_256() {
            super("HMACSkein-512-256", 256, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_384 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public HMacKeyGenerator_512_384() {
            super("HMACSkein-512-384", 384, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class HMacKeyGenerator_512_512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public HMacKeyGenerator_512_512() {
            super("HMACSkein-512-512", 512, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class HashMac_1024_1024 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac_1024_1024() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SkeinDigest(1024, 1024)));
        }
    }

    public static class HashMac_1024_384 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac_1024_384() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SkeinDigest(1024, 384)));
        }
    }

    public static class HashMac_1024_512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac_1024_512() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SkeinDigest(1024, 512)));
        }
    }

    public static class HashMac_256_128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac_256_128() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SkeinDigest(256, 128)));
        }
    }

    public static class HashMac_256_160 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac_256_160() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SkeinDigest(256, 160)));
        }
    }

    public static class HashMac_256_224 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac_256_224() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SkeinDigest(256, 224)));
        }
    }

    public static class HashMac_256_256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac_256_256() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SkeinDigest(256, 256)));
        }
    }

    public static class HashMac_512_128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac_512_128() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SkeinDigest(512, 128)));
        }
    }

    public static class HashMac_512_160 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac_512_160() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SkeinDigest(512, 160)));
        }
    }

    public static class HashMac_512_224 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac_512_224() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SkeinDigest(512, 224)));
        }
    }

    public static class HashMac_512_256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac_512_256() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SkeinDigest(512, 256)));
        }
    }

    public static class HashMac_512_384 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac_512_384() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SkeinDigest(512, 384)));
        }
    }

    public static class HashMac_512_512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public HashMac_512_512() {
            super(new org.bouncycastle.crypto.macs.HMac(new org.bouncycastle.crypto.digests.SkeinDigest(512, 512)));
        }
    }

    public static class SkeinMacKeyGenerator_1024_1024 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_1024() {
            super("Skein-MAC-1024-1024", 1024, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_1024_384 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_384() {
            super("Skein-MAC-1024-384", 384, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_1024_512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public SkeinMacKeyGenerator_1024_512() {
            super("Skein-MAC-1024-512", 512, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_256_128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_128() {
            super("Skein-MAC-256-128", 128, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_256_160 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_160() {
            super("Skein-MAC-256-160", 160, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_256_224 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_224() {
            super("Skein-MAC-256-224", 224, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_256_256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public SkeinMacKeyGenerator_256_256() {
            super("Skein-MAC-256-256", 256, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_128() {
            super("Skein-MAC-512-128", 128, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_160 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_160() {
            super("Skein-MAC-512-160", 160, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_224 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_224() {
            super("Skein-MAC-512-224", 224, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_256() {
            super("Skein-MAC-512-256", 256, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_384 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_384() {
            super("Skein-MAC-512-384", 384, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class SkeinMacKeyGenerator_512_512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator {
        public SkeinMacKeyGenerator_512_512() {
            super("Skein-MAC-512-512", 512, new org.bouncycastle.crypto.CipherKeyGenerator());
        }
    }

    public static class SkeinMac_1024_1024 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public SkeinMac_1024_1024() {
            super(new org.bouncycastle.crypto.macs.SkeinMac(1024, 1024));
        }
    }

    public static class SkeinMac_1024_384 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public SkeinMac_1024_384() {
            super(new org.bouncycastle.crypto.macs.SkeinMac(1024, 384));
        }
    }

    public static class SkeinMac_1024_512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public SkeinMac_1024_512() {
            super(new org.bouncycastle.crypto.macs.SkeinMac(1024, 512));
        }
    }

    public static class SkeinMac_256_128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public SkeinMac_256_128() {
            super(new org.bouncycastle.crypto.macs.SkeinMac(256, 128));
        }
    }

    public static class SkeinMac_256_160 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public SkeinMac_256_160() {
            super(new org.bouncycastle.crypto.macs.SkeinMac(256, 160));
        }
    }

    public static class SkeinMac_256_224 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public SkeinMac_256_224() {
            super(new org.bouncycastle.crypto.macs.SkeinMac(256, 224));
        }
    }

    public static class SkeinMac_256_256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public SkeinMac_256_256() {
            super(new org.bouncycastle.crypto.macs.SkeinMac(256, 256));
        }
    }

    public static class SkeinMac_512_128 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public SkeinMac_512_128() {
            super(new org.bouncycastle.crypto.macs.SkeinMac(512, 128));
        }
    }

    public static class SkeinMac_512_160 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public SkeinMac_512_160() {
            super(new org.bouncycastle.crypto.macs.SkeinMac(512, 160));
        }
    }

    public static class SkeinMac_512_224 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public SkeinMac_512_224() {
            super(new org.bouncycastle.crypto.macs.SkeinMac(512, 224));
        }
    }

    public static class SkeinMac_512_256 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public SkeinMac_512_256() {
            super(new org.bouncycastle.crypto.macs.SkeinMac(512, 256));
        }
    }

    public static class SkeinMac_512_384 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public SkeinMac_512_384() {
            super(new org.bouncycastle.crypto.macs.SkeinMac(512, 384));
        }
    }

    public static class SkeinMac_512_512 extends org.bouncycastle.jcajce.provider.symmetric.util.BaseMac {
        public SkeinMac_512_512() {
            super(new org.bouncycastle.crypto.macs.SkeinMac(512, 512));
        }
    }

    private Skein() {
    }
}
