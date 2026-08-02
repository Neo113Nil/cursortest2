package org.bouncycastle.jcajce.provider.digest;

/* loaded from: classes17.dex */
public class Blake2s {

    public static class Mappings extends org.bouncycastle.jcajce.provider.digest.DigestAlgorithmProvider {
        private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI = org.bouncycastle.jcajce.provider.digest.Blake2s.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighResolutionOutputSizeshNQ4ISI;
            sb.append(str);
            sb.append("$Blake2s256");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2S-256", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Alg.Alias.MessageDigest.");
            sb2.append(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_blake2s256);
            configurableProvider.addAlgorithm(sb2.toString(), "BLAKE2S-256");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$Blake2s224");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2S-224", sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Alg.Alias.MessageDigest.");
            sb4.append(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_blake2s224);
            configurableProvider.addAlgorithm(sb4.toString(), "BLAKE2S-224");
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$Blake2s160");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2S-160", sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Alg.Alias.MessageDigest.");
            sb6.append(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_blake2s160);
            configurableProvider.addAlgorithm(sb6.toString(), "BLAKE2S-160");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$Blake2s128");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2S-128", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Alg.Alias.MessageDigest.");
            sb8.append(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_blake2s128);
            configurableProvider.addAlgorithm(sb8.toString(), "BLAKE2S-128");
        }
    }

    public static class Blake2s128 extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.Blake2s.Blake2s128 blake2s128 = (org.bouncycastle.jcajce.provider.digest.Blake2s.Blake2s128) super.clone();
            blake2s128.digest = new org.bouncycastle.crypto.digests.Blake2sDigest((org.bouncycastle.crypto.digests.Blake2sDigest) this.digest);
            return blake2s128;
        }

        public Blake2s128() {
            super(new org.bouncycastle.crypto.digests.Blake2sDigest(128));
        }
    }

    public static class Blake2s160 extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.Blake2s.Blake2s160 blake2s160 = (org.bouncycastle.jcajce.provider.digest.Blake2s.Blake2s160) super.clone();
            blake2s160.digest = new org.bouncycastle.crypto.digests.Blake2sDigest((org.bouncycastle.crypto.digests.Blake2sDigest) this.digest);
            return blake2s160;
        }

        public Blake2s160() {
            super(new org.bouncycastle.crypto.digests.Blake2sDigest(160));
        }
    }

    public static class Blake2s224 extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.Blake2s.Blake2s224 blake2s224 = (org.bouncycastle.jcajce.provider.digest.Blake2s.Blake2s224) super.clone();
            blake2s224.digest = new org.bouncycastle.crypto.digests.Blake2sDigest((org.bouncycastle.crypto.digests.Blake2sDigest) this.digest);
            return blake2s224;
        }

        public Blake2s224() {
            super(new org.bouncycastle.crypto.digests.Blake2sDigest(224));
        }
    }

    public static class Blake2s256 extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.Blake2s.Blake2s256 blake2s256 = (org.bouncycastle.jcajce.provider.digest.Blake2s.Blake2s256) super.clone();
            blake2s256.digest = new org.bouncycastle.crypto.digests.Blake2sDigest((org.bouncycastle.crypto.digests.Blake2sDigest) this.digest);
            return blake2s256;
        }

        public Blake2s256() {
            super(new org.bouncycastle.crypto.digests.Blake2sDigest(256));
        }
    }

    private Blake2s() {
    }
}
