package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class MultiCertStoreSpi extends java.security.cert.CertStoreSpi {
    private org.bouncycastle.jce.MultiCertStoreParameters Camera2StreamConfigurationMap;

    @Override // java.security.cert.CertStoreSpi
    public java.util.Collection engineGetCertificates(java.security.cert.CertSelector certSelector) throws java.security.cert.CertStoreException {
        boolean searchAllStores = this.Camera2StreamConfigurationMap.getSearchAllStores();
        java.util.Iterator it = this.Camera2StreamConfigurationMap.getCertStores().iterator();
        java.util.List arrayList = searchAllStores ? new java.util.ArrayList() : java.util.Collections.EMPTY_LIST;
        while (it.hasNext()) {
            java.util.Collection<? extends java.security.cert.Certificate> certificates = ((java.security.cert.CertStore) it.next()).getCertificates(certSelector);
            if (searchAllStores) {
                arrayList.addAll(certificates);
            } else if (!certificates.isEmpty()) {
                return certificates;
            }
        }
        return arrayList;
    }

    @Override // java.security.cert.CertStoreSpi
    public java.util.Collection engineGetCRLs(java.security.cert.CRLSelector cRLSelector) throws java.security.cert.CertStoreException {
        boolean searchAllStores = this.Camera2StreamConfigurationMap.getSearchAllStores();
        java.util.Iterator it = this.Camera2StreamConfigurationMap.getCertStores().iterator();
        java.util.List arrayList = searchAllStores ? new java.util.ArrayList() : java.util.Collections.EMPTY_LIST;
        while (it.hasNext()) {
            java.util.Collection<? extends java.security.cert.CRL> cRLs = ((java.security.cert.CertStore) it.next()).getCRLs(cRLSelector);
            if (searchAllStores) {
                arrayList.addAll(cRLs);
            } else if (!cRLs.isEmpty()) {
                return cRLs;
            }
        }
        return arrayList;
    }

    public MultiCertStoreSpi(java.security.cert.CertStoreParameters certStoreParameters) throws java.security.InvalidAlgorithmParameterException {
        super(certStoreParameters);
        if (certStoreParameters instanceof org.bouncycastle.jce.MultiCertStoreParameters) {
            this.Camera2StreamConfigurationMap = (org.bouncycastle.jce.MultiCertStoreParameters) certStoreParameters;
        } else {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("org.bouncycastle.jce.provider.MultiCertStoreSpi: parameter must be a MultiCertStoreParameters object\n");
            sb.append(certStoreParameters.toString());
            throw new java.security.InvalidAlgorithmParameterException(sb.toString());
        }
    }
}
