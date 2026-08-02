package org.bouncycastle.jce.provider;

/* loaded from: classes17.dex */
public class X509StoreLDAPAttrCerts extends org.bouncycastle.x509.X509StoreSpi {
    private org.bouncycastle.x509.util.LDAPStoreHelper getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.x509.X509StoreSpi
    public void engineInit(org.bouncycastle.x509.X509StoreParameters x509StoreParameters) {
        if (x509StoreParameters instanceof org.bouncycastle.jce.X509LDAPCertStoreParameters) {
            this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.x509.util.LDAPStoreHelper((org.bouncycastle.jce.X509LDAPCertStoreParameters) x509StoreParameters);
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Initialization parameters must be an instance of ");
        sb.append(org.bouncycastle.jce.X509LDAPCertStoreParameters.class.getName());
        sb.append(".");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // org.bouncycastle.x509.X509StoreSpi
    public java.util.Collection engineGetMatches(org.bouncycastle.util.Selector selector) throws org.bouncycastle.util.StoreException {
        if (!(selector instanceof org.bouncycastle.x509.X509AttributeCertStoreSelector)) {
            return java.util.Collections.EMPTY_SET;
        }
        org.bouncycastle.x509.X509AttributeCertStoreSelector x509AttributeCertStoreSelector = (org.bouncycastle.x509.X509AttributeCertStoreSelector) selector;
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(this.getHighSpeedVideoFpsRangesFor.getAACertificates(x509AttributeCertStoreSelector));
        hashSet.addAll(this.getHighSpeedVideoFpsRangesFor.getAttributeCertificateAttributes(x509AttributeCertStoreSelector));
        hashSet.addAll(this.getHighSpeedVideoFpsRangesFor.getAttributeDescriptorCertificates(x509AttributeCertStoreSelector));
        return hashSet;
    }
}
