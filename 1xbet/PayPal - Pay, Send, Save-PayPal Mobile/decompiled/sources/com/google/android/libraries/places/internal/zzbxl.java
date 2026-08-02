package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbxl {
    public static final java.net.PasswordAuthentication zza(java.lang.String str, java.net.InetAddress inetAddress, int i, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.util.logging.Logger logger;
        java.net.URL url;
        try {
            url = new java.net.URL("https", str, i, "");
        } catch (java.net.MalformedURLException unused) {
            logger = com.google.android.libraries.places.internal.zzbxn.zzb;
            logger.logp(java.util.logging.Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", "failed to create URL for Authenticator: {0} {1}", new java.lang.Object[]{"https", str});
            url = null;
        }
        return java.net.Authenticator.requestPasswordAuthentication(str, inetAddress, i, "https", "", null, url, java.net.Authenticator.RequestorType.PROXY);
    }

    zzbxl() {
    }
}
