package org.bouncycastle.cert.jcajce;

/* loaded from: classes17.dex */
public class JcaX509CRLConverter {
    private org.bouncycastle.cert.jcajce.CertHelper getHighResolutionOutputSizeshNQ4ISI;

    public org.bouncycastle.cert.jcajce.JcaX509CRLConverter setProvider(java.security.Provider provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.cert.jcajce.ProviderCertHelper(provider);
        return this;
    }

    class ExCRLException extends java.security.cert.CRLException {
        private java.lang.Throwable getHighResolutionOutputSizeshNQ4ISI;

        @Override // java.lang.Throwable
        public java.lang.Throwable getCause() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public ExCRLException(java.lang.String str, java.lang.Throwable th) {
            super(str);
            this.getHighResolutionOutputSizeshNQ4ISI = th;
        }
    }

    public org.bouncycastle.cert.jcajce.JcaX509CRLConverter setProvider(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.cert.jcajce.NamedCertHelper(str);
        return this;
    }

    public java.security.cert.X509CRL getCRL(org.bouncycastle.cert.X509CRLHolder x509CRLHolder) throws java.security.cert.CRLException {
        try {
            return (java.security.cert.X509CRL) this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap("X.509").generateCRL(new java.io.ByteArrayInputStream(x509CRLHolder.getEncoded()));
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception parsing certificate: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.cert.jcajce.JcaX509CRLConverter.ExCRLException(sb.toString(), e);
        } catch (java.security.NoSuchProviderException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("cannot find required provider:");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.cert.jcajce.JcaX509CRLConverter.ExCRLException(sb2.toString(), e2);
        } catch (java.security.cert.CertificateException e3) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("cannot create factory: ");
            sb3.append(e3.getMessage());
            throw new org.bouncycastle.cert.jcajce.JcaX509CRLConverter.ExCRLException(sb3.toString(), e3);
        }
    }

    public JcaX509CRLConverter() {
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.cert.jcajce.DefaultCertHelper();
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.cert.jcajce.DefaultCertHelper();
    }
}
