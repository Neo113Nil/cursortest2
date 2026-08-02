package org.bouncycastle.jcajce.provider.digest;

/* loaded from: classes17.dex */
public class Blake2b {

    public static class Mappings extends org.bouncycastle.jcajce.provider.digest.DigestAlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoFpsRangesFor = org.bouncycastle.jcajce.provider.digest.Blake2b.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoFpsRangesFor;
            sb.append(str);
            sb.append("$Blake2b512");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2B-512", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Alg.Alias.MessageDigest.");
            sb2.append(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_blake2b512);
            configurableProvider.addAlgorithm(sb2.toString(), "BLAKE2B-512");
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(str);
            sb3.append("$Blake2b384");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2B-384", sb3.toString());
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Alg.Alias.MessageDigest.");
            sb4.append(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_blake2b384);
            configurableProvider.addAlgorithm(sb4.toString(), "BLAKE2B-384");
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(str);
            sb5.append("$Blake2b256");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2B-256", sb5.toString());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Alg.Alias.MessageDigest.");
            sb6.append(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_blake2b256);
            configurableProvider.addAlgorithm(sb6.toString(), "BLAKE2B-256");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str);
            sb7.append("$Blake2b160");
            configurableProvider.addAlgorithm("MessageDigest.BLAKE2B-160", sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Alg.Alias.MessageDigest.");
            sb8.append(org.bouncycastle.asn1.misc.MiscObjectIdentifiers.id_blake2b160);
            configurableProvider.addAlgorithm(sb8.toString(), "BLAKE2B-160");
        }
    }

    public static class Blake2b160 extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.Blake2b.Blake2b160 blake2b160 = (org.bouncycastle.jcajce.provider.digest.Blake2b.Blake2b160) super.clone();
            blake2b160.digest = new org.bouncycastle.crypto.digests.Blake2bDigest((org.bouncycastle.crypto.digests.Blake2bDigest) this.digest);
            return blake2b160;
        }

        public Blake2b160() {
            super(new org.bouncycastle.crypto.digests.Blake2bDigest(160));
        }
    }

    public static class Blake2b256 extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.Blake2b.Blake2b256 blake2b256 = (org.bouncycastle.jcajce.provider.digest.Blake2b.Blake2b256) super.clone();
            blake2b256.digest = new org.bouncycastle.crypto.digests.Blake2bDigest((org.bouncycastle.crypto.digests.Blake2bDigest) this.digest);
            return blake2b256;
        }

        public Blake2b256() {
            super(new org.bouncycastle.crypto.digests.Blake2bDigest(256));
        }
    }

    public static class Blake2b384 extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.Blake2b.Blake2b384 blake2b384 = (org.bouncycastle.jcajce.provider.digest.Blake2b.Blake2b384) super.clone();
            blake2b384.digest = new org.bouncycastle.crypto.digests.Blake2bDigest((org.bouncycastle.crypto.digests.Blake2bDigest) this.digest);
            return blake2b384;
        }

        public Blake2b384() {
            super(new org.bouncycastle.crypto.digests.Blake2bDigest(384));
        }
    }

    public static class Blake2b512 extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.Blake2b.Blake2b512 blake2b512 = (org.bouncycastle.jcajce.provider.digest.Blake2b.Blake2b512) super.clone();
            blake2b512.digest = new org.bouncycastle.crypto.digests.Blake2bDigest((org.bouncycastle.crypto.digests.Blake2bDigest) this.digest);
            return blake2b512;
        }

        public Blake2b512() {
            super(new org.bouncycastle.crypto.digests.Blake2bDigest(512));
        }
    }

    private Blake2b() {
    }
}
