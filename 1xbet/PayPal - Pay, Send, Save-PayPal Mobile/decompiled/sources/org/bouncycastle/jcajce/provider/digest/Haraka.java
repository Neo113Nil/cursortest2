package org.bouncycastle.jcajce.provider.digest;

/* loaded from: classes17.dex */
public class Haraka {

    public static class Mappings extends org.bouncycastle.jcajce.provider.digest.DigestAlgorithmProvider {
        private static final java.lang.String getHighSpeedVideoSizes = org.bouncycastle.jcajce.provider.digest.Haraka.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(org.bouncycastle.jcajce.provider.config.ConfigurableProvider configurableProvider) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String str = getHighSpeedVideoSizes;
            sb.append(str);
            sb.append("$Digest256");
            configurableProvider.addAlgorithm("MessageDigest.HARAKA-256", sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append("$Digest512");
            configurableProvider.addAlgorithm("MessageDigest.HARAKA-512", sb2.toString());
        }
    }

    public static class Digest256 extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.Haraka.Digest256 digest256 = (org.bouncycastle.jcajce.provider.digest.Haraka.Digest256) super.clone();
            digest256.digest = new org.bouncycastle.crypto.digests.Haraka256Digest((org.bouncycastle.crypto.digests.Haraka256Digest) this.digest);
            return digest256;
        }

        public Digest256() {
            super(new org.bouncycastle.crypto.digests.Haraka256Digest());
        }
    }

    public static class Digest512 extends org.bouncycastle.jcajce.provider.digest.BCMessageDigest implements java.lang.Cloneable {
        @Override // java.security.MessageDigest, java.security.MessageDigestSpi
        public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            org.bouncycastle.jcajce.provider.digest.Haraka.Digest512 digest512 = (org.bouncycastle.jcajce.provider.digest.Haraka.Digest512) super.clone();
            digest512.digest = new org.bouncycastle.crypto.digests.Haraka512Digest((org.bouncycastle.crypto.digests.Haraka512Digest) this.digest);
            return digest512;
        }

        public Digest512() {
            super(new org.bouncycastle.crypto.digests.Haraka512Digest());
        }
    }

    private Haraka() {
    }
}
