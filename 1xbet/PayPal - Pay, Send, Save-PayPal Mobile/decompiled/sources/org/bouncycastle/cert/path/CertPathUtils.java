package org.bouncycastle.cert.path;

/* loaded from: classes17.dex */
class CertPathUtils {
    static java.util.Set Camera2StreamConfigurationMap(org.bouncycastle.cert.X509CertificateHolder[] x509CertificateHolderArr) {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (int i = 0; i != x509CertificateHolderArr.length; i++) {
            hashSet.addAll(x509CertificateHolderArr[i].getCriticalExtensionOIDs());
        }
        return hashSet;
    }

    CertPathUtils() {
    }
}
