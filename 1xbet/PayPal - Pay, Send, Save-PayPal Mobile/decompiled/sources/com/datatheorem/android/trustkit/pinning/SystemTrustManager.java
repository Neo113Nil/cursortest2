package com.datatheorem.android.trustkit.pinning;

/* loaded from: classes8.dex */
public class SystemTrustManager {
    private static final javax.net.ssl.X509TrustManager getHighSpeedVideoSizes = getHighSpeedVideoFpsRangesFor();

    public static javax.net.ssl.X509TrustManager getInstance() {
        return getHighSpeedVideoSizes;
    }

    private static javax.net.ssl.X509TrustManager getHighSpeedVideoFpsRangesFor() {
        try {
            javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
            javax.net.ssl.X509TrustManager x509TrustManager = null;
            try {
                trustManagerFactory.init((java.security.KeyStore) null);
                for (javax.net.ssl.TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                    if (trustManager instanceof javax.net.ssl.X509TrustManager) {
                        x509TrustManager = (javax.net.ssl.X509TrustManager) trustManager;
                    }
                }
                if (x509TrustManager != null) {
                    return x509TrustManager;
                }
                throw new java.lang.IllegalStateException("Should never happen");
            } catch (java.security.KeyStoreException unused) {
                throw new java.lang.IllegalStateException("Should never happen");
            }
        } catch (java.security.NoSuchAlgorithmException unused2) {
            throw new java.lang.IllegalStateException("Should never happen");
        }
    }
}
