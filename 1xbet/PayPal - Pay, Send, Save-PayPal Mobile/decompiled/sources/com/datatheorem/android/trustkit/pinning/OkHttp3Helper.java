package com.datatheorem.android.trustkit.pinning;

/* loaded from: classes8.dex */
public class OkHttp3Helper {
    private static javax.net.ssl.X509TrustManager getHighSpeedVideoFpsRangesFor = new com.datatheorem.android.trustkit.pinning.OkHttpRootTrustManager();

    public static javax.net.ssl.SSLSocketFactory getSSLSocketFactory() {
        try {
            javax.net.ssl.SSLContext sSLContext = javax.net.ssl.SSLContext.getInstance("TLS");
            sSLContext.init(null, new javax.net.ssl.X509TrustManager[]{getHighSpeedVideoFpsRangesFor}, null);
            return sSLContext.getSocketFactory();
        } catch (java.security.KeyManagementException | java.security.NoSuchAlgorithmException e) {
            e.printStackTrace();
            throw new java.lang.IllegalStateException("SSLSocketFactory creation failed");
        }
    }

    public static okhttp3.Interceptor getPinningInterceptor() {
        return new com.datatheorem.android.trustkit.pinning.OkHttp3PinningInterceptor((com.datatheorem.android.trustkit.pinning.OkHttpRootTrustManager) getHighSpeedVideoFpsRangesFor);
    }

    public static javax.net.ssl.X509TrustManager getTrustManager() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
