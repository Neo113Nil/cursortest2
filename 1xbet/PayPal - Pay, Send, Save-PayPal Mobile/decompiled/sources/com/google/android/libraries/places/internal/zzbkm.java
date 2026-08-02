package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbkm {
    public zzbkm(javax.net.ssl.SSLSession sSLSession) {
        java.util.logging.Logger logger;
        sSLSession.getCipherSuite();
        java.security.cert.Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            java.security.cert.Certificate certificate = localCertificates[0];
        }
        try {
            java.security.cert.Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            if (peerCertificates != null) {
                java.security.cert.Certificate certificate2 = peerCertificates[0];
            }
        } catch (javax.net.ssl.SSLPeerUnverifiedException e) {
            java.util.logging.Level level = java.util.logging.Level.FINE;
            java.lang.String format = java.lang.String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost());
            logger = com.google.android.libraries.places.internal.zzbkn.zzb;
            logger.logp(level, "io.grpc.InternalChannelz$Tls", "<init>", format, (java.lang.Throwable) e);
        }
    }
}
