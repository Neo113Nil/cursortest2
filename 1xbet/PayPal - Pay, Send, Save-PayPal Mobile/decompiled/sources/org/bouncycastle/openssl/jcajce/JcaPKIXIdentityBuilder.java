package org.bouncycastle.openssl.jcajce;

/* loaded from: classes17.dex */
public class JcaPKIXIdentityBuilder {
    private org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter getHighSpeedVideoFpsRangesFor = new org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter();
    private org.bouncycastle.cert.jcajce.JcaX509CertificateConverter Camera2StreamConfigurationMap = new org.bouncycastle.cert.jcajce.JcaX509CertificateConverter();

    public org.bouncycastle.openssl.jcajce.JcaPKIXIdentityBuilder setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.setProvider(provider);
        this.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap.setProvider(provider);
        return this;
    }

    public org.bouncycastle.openssl.jcajce.JcaPKIXIdentityBuilder setProvider(java.lang.String str) {
        this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor.setProvider(str);
        this.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap.setProvider(str);
        return this;
    }

    public org.bouncycastle.pkix.jcajce.JcaPKIXIdentity build(java.io.InputStream inputStream, java.io.InputStream inputStream2) throws java.io.IOException, java.security.cert.CertificateException {
        org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter jcaPEMKeyConverter;
        org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo;
        java.lang.Object readObject = new org.bouncycastle.openssl.PEMParser(new java.io.InputStreamReader(inputStream)).readObject();
        if (readObject instanceof org.bouncycastle.openssl.PEMKeyPair) {
            jcaPEMKeyConverter = this.getHighSpeedVideoFpsRangesFor;
            privateKeyInfo = ((org.bouncycastle.openssl.PEMKeyPair) readObject).getPrivateKeyInfo();
        } else {
            if (!(readObject instanceof org.bouncycastle.asn1.pkcs.PrivateKeyInfo)) {
                throw new java.io.IOException("unrecognised private key file");
            }
            jcaPEMKeyConverter = this.getHighSpeedVideoFpsRangesFor;
            privateKeyInfo = (org.bouncycastle.asn1.pkcs.PrivateKeyInfo) readObject;
        }
        java.security.PrivateKey privateKey = jcaPEMKeyConverter.getPrivateKey(privateKeyInfo);
        org.bouncycastle.openssl.PEMParser pEMParser = new org.bouncycastle.openssl.PEMParser(new java.io.InputStreamReader(inputStream2));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            java.lang.Object readObject2 = pEMParser.readObject();
            if (readObject2 == null) {
                return new org.bouncycastle.pkix.jcajce.JcaPKIXIdentity(privateKey, (java.security.cert.X509Certificate[]) arrayList.toArray(new java.security.cert.X509Certificate[arrayList.size()]));
            }
            arrayList.add(this.Camera2StreamConfigurationMap.getCertificate((org.bouncycastle.cert.X509CertificateHolder) readObject2));
        }
    }

    public org.bouncycastle.pkix.jcajce.JcaPKIXIdentity build(java.io.File file, java.io.File file2) throws java.io.IOException, java.security.cert.CertificateException {
        getHighSpeedVideoFpsRanges(file);
        getHighSpeedVideoFpsRanges(file2);
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file2);
        org.bouncycastle.pkix.jcajce.JcaPKIXIdentity build = build(fileInputStream, fileInputStream2);
        fileInputStream.close();
        fileInputStream2.close();
        return build;
    }

    private static void getHighSpeedVideoFpsRanges(java.io.File file) throws java.io.IOException {
        if (file.canRead()) {
            if (file.exists()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to open file ");
                sb.append(file.getPath());
                sb.append(" for reading.");
                throw new java.io.IOException(sb.toString());
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to open ");
            sb2.append(file.getPath());
            sb2.append(": it does not exist.");
            throw new java.io.FileNotFoundException(sb2.toString());
        }
    }
}
