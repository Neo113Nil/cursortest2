package org.bouncycastle.cert.jcajce;

/* loaded from: classes17.dex */
public class JcaCertStoreBuilder {
    private java.lang.Object getHighSpeedVideoSizes;
    private java.util.List getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
    private java.util.List getHighSpeedVideoFpsRanges = new java.util.ArrayList();
    private org.bouncycastle.cert.jcajce.JcaX509CertificateConverter Camera2StreamConfigurationMap = new org.bouncycastle.cert.jcajce.JcaX509CertificateConverter();
    private org.bouncycastle.cert.jcajce.JcaX509CRLConverter getHighSpeedVideoFpsRangesFor = new org.bouncycastle.cert.jcajce.JcaX509CRLConverter();
    private java.lang.String getHighSpeedVideoSizesFor = "Collection";

    public java.security.cert.CertStore build() throws java.security.GeneralSecurityException {
        org.bouncycastle.cert.jcajce.JcaX509CertificateConverter jcaX509CertificateConverter = this.Camera2StreamConfigurationMap;
        org.bouncycastle.cert.jcajce.JcaX509CRLConverter jcaX509CRLConverter = this.getHighSpeedVideoFpsRangesFor;
        java.util.ArrayList arrayList = new java.util.ArrayList(this.getHighResolutionOutputSizeshNQ4ISI.size() + this.getHighSpeedVideoFpsRanges.size());
        java.util.Iterator it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
        while (it.hasNext()) {
            arrayList.add(jcaX509CertificateConverter.getCertificate((org.bouncycastle.cert.X509CertificateHolder) it.next()));
        }
        java.util.Iterator it2 = this.getHighSpeedVideoFpsRanges.iterator();
        while (it2.hasNext()) {
            arrayList.add(jcaX509CRLConverter.getCRL((org.bouncycastle.cert.X509CRLHolder) it2.next()));
        }
        java.security.cert.CollectionCertStoreParameters collectionCertStoreParameters = new java.security.cert.CollectionCertStoreParameters(arrayList);
        java.lang.Object obj = this.getHighSpeedVideoSizes;
        return obj instanceof java.lang.String ? java.security.cert.CertStore.getInstance(this.getHighSpeedVideoSizesFor, collectionCertStoreParameters, (java.lang.String) obj) : obj instanceof java.security.Provider ? java.security.cert.CertStore.getInstance(this.getHighSpeedVideoSizesFor, collectionCertStoreParameters, (java.security.Provider) obj) : java.security.cert.CertStore.getInstance(this.getHighSpeedVideoSizesFor, collectionCertStoreParameters);
    }

    public org.bouncycastle.cert.jcajce.JcaCertStoreBuilder setType(java.lang.String str) {
        this.getHighSpeedVideoSizesFor = str;
        return this;
    }

    public org.bouncycastle.cert.jcajce.JcaCertStoreBuilder setProvider(java.security.Provider provider) {
        this.Camera2StreamConfigurationMap.setProvider(provider);
        this.getHighSpeedVideoFpsRangesFor.setProvider(provider);
        this.getHighSpeedVideoSizes = provider;
        return this;
    }

    public org.bouncycastle.cert.jcajce.JcaCertStoreBuilder setProvider(java.lang.String str) {
        this.Camera2StreamConfigurationMap.setProvider(str);
        this.getHighSpeedVideoFpsRangesFor.setProvider(str);
        this.getHighSpeedVideoSizes = str;
        return this;
    }

    public org.bouncycastle.cert.jcajce.JcaCertStoreBuilder addCertificates(org.bouncycastle.util.Store store) {
        this.getHighResolutionOutputSizeshNQ4ISI.addAll(store.getMatches(null));
        return this;
    }

    public org.bouncycastle.cert.jcajce.JcaCertStoreBuilder addCertificate(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) {
        this.getHighResolutionOutputSizeshNQ4ISI.add(x509CertificateHolder);
        return this;
    }

    public org.bouncycastle.cert.jcajce.JcaCertStoreBuilder addCRLs(org.bouncycastle.util.Store store) {
        this.getHighSpeedVideoFpsRanges.addAll(store.getMatches(null));
        return this;
    }

    public org.bouncycastle.cert.jcajce.JcaCertStoreBuilder addCRL(org.bouncycastle.cert.X509CRLHolder x509CRLHolder) {
        this.getHighSpeedVideoFpsRanges.add(x509CRLHolder);
        return this;
    }
}
