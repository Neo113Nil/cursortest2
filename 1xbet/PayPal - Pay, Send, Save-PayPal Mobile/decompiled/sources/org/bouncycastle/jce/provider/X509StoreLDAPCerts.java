package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class X509StoreLDAPCerts extends org.bouncycastle.x509.X509StoreSpi {
    private org.bouncycastle.x509.util.LDAPStoreHelper getHighSpeedVideoFpsRanges;

    @Override // org.bouncycastle.x509.X509StoreSpi
    public java.util.Collection engineGetMatches(org.bouncycastle.util.Selector selector) throws org.bouncycastle.util.StoreException {
        java.util.Collection collection;
        if (!(selector instanceof org.bouncycastle.x509.X509CertStoreSelector)) {
            return java.util.Collections.EMPTY_SET;
        }
        org.bouncycastle.x509.X509CertStoreSelector x509CertStoreSelector = (org.bouncycastle.x509.X509CertStoreSelector) selector;
        java.util.HashSet hashSet = new java.util.HashSet();
        if (x509CertStoreSelector.getBasicConstraints() <= 0) {
            if (x509CertStoreSelector.getBasicConstraints() == -2) {
                collection = this.getHighSpeedVideoFpsRanges.getUserCertificates(x509CertStoreSelector);
                hashSet.addAll(collection);
                return hashSet;
            }
            hashSet.addAll(this.getHighSpeedVideoFpsRanges.getUserCertificates(x509CertStoreSelector));
        }
        hashSet.addAll(this.getHighSpeedVideoFpsRanges.getCACertificates(x509CertStoreSelector));
        java.util.HashSet hashSet2 = new java.util.HashSet();
        org.bouncycastle.x509.X509CertPairStoreSelector x509CertPairStoreSelector = new org.bouncycastle.x509.X509CertPairStoreSelector();
        x509CertPairStoreSelector.setForwardSelector(x509CertStoreSelector);
        x509CertPairStoreSelector.setReverseSelector(new org.bouncycastle.x509.X509CertStoreSelector());
        java.util.HashSet<org.bouncycastle.x509.X509CertificatePair> hashSet3 = new java.util.HashSet(this.getHighSpeedVideoFpsRanges.getCrossCertificatePairs(x509CertPairStoreSelector));
        java.util.HashSet hashSet4 = new java.util.HashSet();
        java.util.HashSet hashSet5 = new java.util.HashSet();
        for (org.bouncycastle.x509.X509CertificatePair x509CertificatePair : hashSet3) {
            if (x509CertificatePair.getForward() != null) {
                hashSet4.add(x509CertificatePair.getForward());
            }
            if (x509CertificatePair.getReverse() != null) {
                hashSet5.add(x509CertificatePair.getReverse());
            }
        }
        hashSet2.addAll(hashSet4);
        hashSet2.addAll(hashSet5);
        collection = hashSet2;
        hashSet.addAll(collection);
        return hashSet;
    }

    @Override // org.bouncycastle.x509.X509StoreSpi
    public void engineInit(org.bouncycastle.x509.X509StoreParameters x509StoreParameters) {
        if (x509StoreParameters instanceof org.bouncycastle.jce.X509LDAPCertStoreParameters) {
            this.getHighSpeedVideoFpsRanges = new org.bouncycastle.x509.util.LDAPStoreHelper((org.bouncycastle.jce.X509LDAPCertStoreParameters) x509StoreParameters);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialization parameters must be an instance of ");
        sb.append(org.bouncycastle.jce.X509LDAPCertStoreParameters.class.getName());
        sb.append(".");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
