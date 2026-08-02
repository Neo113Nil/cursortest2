package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class X509StoreLDAPCRLs extends org.bouncycastle.x509.X509StoreSpi {
    private org.bouncycastle.x509.util.LDAPStoreHelper getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.x509.X509StoreSpi
    public void engineInit(org.bouncycastle.x509.X509StoreParameters x509StoreParameters) {
        if (x509StoreParameters instanceof org.bouncycastle.jce.X509LDAPCertStoreParameters) {
            this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.x509.util.LDAPStoreHelper((org.bouncycastle.jce.X509LDAPCertStoreParameters) x509StoreParameters);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialization parameters must be an instance of ");
        sb.append(org.bouncycastle.jce.X509LDAPCertStoreParameters.class.getName());
        sb.append(".");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // org.bouncycastle.x509.X509StoreSpi
    public java.util.Collection engineGetMatches(org.bouncycastle.util.Selector selector) throws org.bouncycastle.util.StoreException {
        java.util.Collection certificateRevocationLists;
        if (!(selector instanceof org.bouncycastle.x509.X509CRLStoreSelector)) {
            return java.util.Collections.EMPTY_SET;
        }
        org.bouncycastle.x509.X509CRLStoreSelector x509CRLStoreSelector = (org.bouncycastle.x509.X509CRLStoreSelector) selector;
        java.util.HashSet hashSet = new java.util.HashSet();
        if (x509CRLStoreSelector.isDeltaCRLIndicatorEnabled()) {
            certificateRevocationLists = this.getHighResolutionOutputSizeshNQ4ISI.getDeltaCertificateRevocationLists(x509CRLStoreSelector);
        } else {
            hashSet.addAll(this.getHighResolutionOutputSizeshNQ4ISI.getDeltaCertificateRevocationLists(x509CRLStoreSelector));
            hashSet.addAll(this.getHighResolutionOutputSizeshNQ4ISI.getAttributeAuthorityRevocationLists(x509CRLStoreSelector));
            hashSet.addAll(this.getHighResolutionOutputSizeshNQ4ISI.getAttributeCertificateRevocationLists(x509CRLStoreSelector));
            hashSet.addAll(this.getHighResolutionOutputSizeshNQ4ISI.getAuthorityRevocationLists(x509CRLStoreSelector));
            certificateRevocationLists = this.getHighResolutionOutputSizeshNQ4ISI.getCertificateRevocationLists(x509CRLStoreSelector);
        }
        hashSet.addAll(certificateRevocationLists);
        return hashSet;
    }
}
