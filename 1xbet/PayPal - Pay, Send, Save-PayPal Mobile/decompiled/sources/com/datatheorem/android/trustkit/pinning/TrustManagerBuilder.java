package com.datatheorem.android.trustkit.pinning;

/* loaded from: classes8.dex */
public class TrustManagerBuilder {
    protected static com.datatheorem.android.trustkit.reporting.BackgroundReporter backgroundReporter = null;
    protected static javax.net.ssl.X509TrustManager baselineTrustManager = null;
    protected static boolean shouldOverridePins = false;

    public static void initializeBaselineTrustManager(java.util.Set<java.security.cert.Certificate> set, boolean z, com.datatheorem.android.trustkit.reporting.BackgroundReporter backgroundReporter2) throws java.security.cert.CertificateException, java.security.NoSuchAlgorithmException, java.security.KeyStoreException, java.io.IOException {
        if (baselineTrustManager != null) {
            throw new java.lang.IllegalStateException("TrustManagerBuilder has already been initialized");
        }
        baselineTrustManager = com.datatheorem.android.trustkit.pinning.SystemTrustManager.getInstance();
        shouldOverridePins = z;
        if (set != null) {
            set.size();
        }
        backgroundReporter = backgroundReporter2;
    }

    public static javax.net.ssl.X509TrustManager getTrustManager(java.lang.String str) {
        if (baselineTrustManager == null) {
            throw new java.lang.IllegalStateException("TrustManagerBuilder has not been initialized");
        }
        com.datatheorem.android.trustkit.config.DomainPinningPolicy policyForHostname = com.datatheorem.android.trustkit.TrustKit.getInstance().getConfiguration().getPolicyForHostname(str);
        if (policyForHostname == null || shouldOverridePins) {
            return baselineTrustManager;
        }
        return new com.datatheorem.android.trustkit.pinning.PinningTrustManager(str, policyForHostname, baselineTrustManager);
    }

    static com.datatheorem.android.trustkit.reporting.BackgroundReporter getHighSpeedVideoFpsRangesFor() {
        com.datatheorem.android.trustkit.reporting.BackgroundReporter backgroundReporter2 = backgroundReporter;
        if (backgroundReporter2 != null) {
            return backgroundReporter2;
        }
        throw new java.lang.IllegalStateException("TrustManagerBuilder has not been initialized");
    }
}
