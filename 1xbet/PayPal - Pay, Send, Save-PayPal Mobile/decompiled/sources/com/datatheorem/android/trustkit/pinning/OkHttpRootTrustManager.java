package com.datatheorem.android.trustkit.pinning;

/* loaded from: classes8.dex */
class OkHttpRootTrustManager implements javax.net.ssl.X509TrustManager {
    final java.lang.ThreadLocal<java.lang.String> getHighResolutionOutputSizeshNQ4ISI = new java.lang.ThreadLocal<>();

    OkHttpRootTrustManager() {
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) throws java.security.cert.CertificateException {
        com.datatheorem.android.trustkit.TrustKit.getInstance().getTrustManager(this.getHighResolutionOutputSizeshNQ4ISI.get()).checkClientTrusted(x509CertificateArr, str);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) throws java.security.cert.CertificateException {
        java.lang.String str2 = this.getHighResolutionOutputSizeshNQ4ISI.get();
        com.datatheorem.android.trustkit.config.DomainPinningPolicy policyForHostname = com.datatheorem.android.trustkit.TrustKit.getInstance().getConfiguration().getPolicyForHostname(str2);
        javax.net.ssl.X509TrustManager trustManager = com.datatheorem.android.trustkit.TrustKit.getInstance().getTrustManager(str2);
        if (policyForHostname == null) {
            new android.net.http.X509TrustManagerExtensions(trustManager).checkServerTrusted(x509CertificateArr, str, str2);
        } else {
            trustManager.checkServerTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
        return new java.security.cert.X509Certificate[0];
    }
}
