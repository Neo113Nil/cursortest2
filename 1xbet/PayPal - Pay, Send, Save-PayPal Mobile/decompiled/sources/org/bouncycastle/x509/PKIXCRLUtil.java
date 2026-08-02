package org.bouncycastle.x509;

/* loaded from: classes17.dex */
abstract class PKIXCRLUtil {
    static java.util.Set getHighSpeedVideoSizes(org.bouncycastle.x509.X509CRLStoreSelector x509CRLStoreSelector, java.security.cert.PKIXParameters pKIXParameters) throws org.bouncycastle.jce.provider.AnnotatedException {
        org.bouncycastle.jce.provider.AnnotatedException annotatedException;
        java.util.HashSet hashSet = new java.util.HashSet();
        try {
            org.bouncycastle.jce.provider.AnnotatedException annotatedException2 = null;
            boolean z = false;
            for (java.lang.Object obj : pKIXParameters.getCertStores()) {
                if (obj instanceof org.bouncycastle.x509.X509Store) {
                    try {
                        hashSet.addAll(((org.bouncycastle.x509.X509Store) obj).getMatches(x509CRLStoreSelector));
                        z = true;
                    } catch (org.bouncycastle.util.StoreException e) {
                        annotatedException = new org.bouncycastle.jce.provider.AnnotatedException("Exception searching in X.509 CRL store.", e);
                        annotatedException2 = annotatedException;
                    }
                } else {
                    try {
                        hashSet.addAll(((java.security.cert.CertStore) obj).getCRLs(x509CRLStoreSelector));
                        z = true;
                    } catch (java.security.cert.CertStoreException e2) {
                        annotatedException = new org.bouncycastle.jce.provider.AnnotatedException("Exception searching in X.509 CRL store.", e2);
                        annotatedException2 = annotatedException;
                    }
                }
            }
            if (!z && annotatedException2 != null) {
                throw annotatedException2;
            }
            return hashSet;
        } catch (org.bouncycastle.jce.provider.AnnotatedException e3) {
            throw new org.bouncycastle.jce.provider.AnnotatedException("Exception obtaining complete CRLs.", e3);
        }
    }

    PKIXCRLUtil() {
    }
}
