package org.bouncycastle.pkix.jcajce;

/* loaded from: classes17.dex */
abstract class PKIXCRLUtil {
    private static void Camera2StreamConfigurationMap(java.util.HashSet hashSet, org.bouncycastle.jcajce.PKIXCRLStoreSelector pKIXCRLStoreSelector, java.util.List list) throws org.bouncycastle.pkix.jcajce.AnnotatedException {
        org.bouncycastle.pkix.jcajce.AnnotatedException annotatedException;
        org.bouncycastle.pkix.jcajce.AnnotatedException annotatedException2 = null;
        boolean z = false;
        for (java.lang.Object obj : list) {
            if (obj instanceof org.bouncycastle.util.Store) {
                try {
                    hashSet.addAll(((org.bouncycastle.util.Store) obj).getMatches(pKIXCRLStoreSelector));
                } catch (org.bouncycastle.util.StoreException e) {
                    annotatedException = new org.bouncycastle.pkix.jcajce.AnnotatedException("Exception searching in X.509 CRL store.", e);
                    annotatedException2 = annotatedException;
                }
            } else {
                try {
                    hashSet.addAll(org.bouncycastle.jcajce.PKIXCRLStoreSelector.getCRLs(pKIXCRLStoreSelector, (java.security.cert.CertStore) obj));
                } catch (java.security.cert.CertStoreException e2) {
                    annotatedException = new org.bouncycastle.pkix.jcajce.AnnotatedException("Exception searching in X.509 CRL store.", e2);
                    annotatedException2 = annotatedException;
                }
            }
            z = true;
        }
        if (!z && annotatedException2 != null) {
            throw annotatedException2;
        }
    }

    static java.util.Set getHighSpeedVideoSizes(org.bouncycastle.jcajce.PKIXCRLStoreSelector pKIXCRLStoreSelector, java.util.Date date, java.util.List list, java.util.List list2) throws org.bouncycastle.pkix.jcajce.AnnotatedException {
        java.util.HashSet hashSet = new java.util.HashSet();
        try {
            Camera2StreamConfigurationMap(hashSet, pKIXCRLStoreSelector, list2);
            Camera2StreamConfigurationMap(hashSet, pKIXCRLStoreSelector, list);
            java.util.HashSet hashSet2 = new java.util.HashSet();
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                java.security.cert.X509CRL x509crl = (java.security.cert.X509CRL) it.next();
                java.util.Date nextUpdate = x509crl.getNextUpdate();
                if (nextUpdate == null || nextUpdate.after(date)) {
                    java.security.cert.X509Certificate certificateChecking = pKIXCRLStoreSelector.getCertificateChecking();
                    if (certificateChecking == null || x509crl.getThisUpdate().before(certificateChecking.getNotAfter())) {
                        hashSet2.add(x509crl);
                    }
                }
            }
            return hashSet2;
        } catch (org.bouncycastle.pkix.jcajce.AnnotatedException e) {
            throw new org.bouncycastle.pkix.jcajce.AnnotatedException("Exception obtaining complete CRLs.", e);
        }
    }

    PKIXCRLUtil() {
    }
}
