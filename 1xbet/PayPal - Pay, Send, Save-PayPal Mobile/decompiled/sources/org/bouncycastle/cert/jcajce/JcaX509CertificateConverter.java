package org.bouncycastle.cert.jcajce;

/* loaded from: classes17.dex */
public class JcaX509CertificateConverter {
    private org.bouncycastle.cert.jcajce.CertHelper Camera2StreamConfigurationMap;

    public org.bouncycastle.cert.jcajce.JcaX509CertificateConverter setProvider(java.security.Provider provider) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.cert.jcajce.ProviderCertHelper(provider);
        return this;
    }

    class ExCertificateException extends java.security.cert.CertificateException {
        private java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;

        @Override // java.lang.Throwable
        public java.lang.Throwable getCause() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public ExCertificateException(java.lang.String str, java.lang.Throwable th) {
            super(str);
            this.getHighResolutionOutputSizeshNQ4ISI = th;
        }
    }

    class ExCertificateParsingException extends java.security.cert.CertificateParsingException {
        private java.lang.Throwable getHighSpeedVideoFpsRanges;

        @Override // java.lang.Throwable
        public java.lang.Throwable getCause() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public ExCertificateParsingException(java.lang.String str, java.lang.Throwable th) {
            super(str);
            this.getHighSpeedVideoFpsRanges = th;
        }
    }

    public org.bouncycastle.cert.jcajce.JcaX509CertificateConverter setProvider(java.lang.String str) {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.cert.jcajce.NamedCertHelper(str);
        return this;
    }

    public java.security.cert.X509Certificate getCertificate(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) throws java.security.cert.CertificateException {
        try {
            return (java.security.cert.X509Certificate) this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap("X.509").generateCertificate(new java.io.ByteArrayInputStream(x509CertificateHolder.getEncoded()));
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception parsing certificate: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.jcajce.JcaX509CertificateConverter.ExCertificateParsingException(sb.toString(), e);
        } catch (java.security.NoSuchProviderException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("cannot find required provider:");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.cert.jcajce.JcaX509CertificateConverter.ExCertificateException(sb2.toString(), e2);
        }
    }

    public JcaX509CertificateConverter() {
        this.Camera2StreamConfigurationMap = new org.bouncycastle.cert.jcajce.DefaultCertHelper();
        this.Camera2StreamConfigurationMap = new org.bouncycastle.cert.jcajce.DefaultCertHelper();
    }
}
