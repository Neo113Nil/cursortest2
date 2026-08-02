package org.bouncycastle.cert.bc;

/* loaded from: classes17.dex */
public class BcX509ExtensionUtils extends org.bouncycastle.cert.X509ExtensionUtils {

    static class SHA1DigestCalculator implements org.bouncycastle.operator.DigestCalculator {
        private java.io.ByteArrayOutputStream Camera2StreamConfigurationMap;

        @Override // org.bouncycastle.operator.DigestCalculator
        public java.io.OutputStream getOutputStream() {
            return this.Camera2StreamConfigurationMap;
        }

        @Override // org.bouncycastle.operator.DigestCalculator
        public byte[] getDigest() {
            byte[] byteArray = this.Camera2StreamConfigurationMap.toByteArray();
            this.Camera2StreamConfigurationMap.reset();
            org.bouncycastle.crypto.digests.SHA1Digest sHA1Digest = new org.bouncycastle.crypto.digests.SHA1Digest();
            sHA1Digest.update(byteArray, 0, byteArray.length);
            byte[] bArr = new byte[sHA1Digest.getDigestSize()];
            sHA1Digest.doFinal(bArr, 0);
            return bArr;
        }

        @Override // org.bouncycastle.operator.DigestCalculator
        public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
            return new org.bouncycastle.asn1.x509.AlgorithmIdentifier(org.bouncycastle.asn1.oiw.OIWObjectIdentifiers.idSHA1);
        }

        /* synthetic */ SHA1DigestCalculator(byte b) {
            this();
        }

        private SHA1DigestCalculator() {
            this.Camera2StreamConfigurationMap = new java.io.ByteArrayOutputStream();
        }
    }

    public org.bouncycastle.asn1.x509.SubjectKeyIdentifier createSubjectKeyIdentifier(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) throws java.io.IOException {
        return super.createSubjectKeyIdentifier(org.bouncycastle.crypto.util.SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(asymmetricKeyParameter));
    }

    public org.bouncycastle.asn1.x509.AuthorityKeyIdentifier createAuthorityKeyIdentifier(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) throws java.io.IOException {
        return super.createAuthorityKeyIdentifier(org.bouncycastle.crypto.util.SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(asymmetricKeyParameter));
    }

    public BcX509ExtensionUtils(org.bouncycastle.operator.DigestCalculator digestCalculator) {
        super(digestCalculator);
    }

    public BcX509ExtensionUtils() {
        super(new org.bouncycastle.cert.bc.BcX509ExtensionUtils.SHA1DigestCalculator((byte) 0));
    }
}
