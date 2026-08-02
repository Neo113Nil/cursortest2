package lib.android.paypal.com.magnessdk.network.base;

/* loaded from: classes5.dex */
final class g extends javax.net.ssl.SSLSocketFactory {
    private javax.net.ssl.TrustManager[] Camera2StreamConfigurationMap;
    private javax.net.ssl.SSLSocketFactory getHighSpeedVideoFpsRanges;
    private javax.net.ssl.TrustManager[] getHighSpeedVideoFpsRangesFor;
    private javax.net.ssl.SSLContext getHighSpeedVideoSizes;

    private static java.net.Socket getHighSpeedVideoFpsRanges(java.net.Socket socket) {
        if (socket instanceof javax.net.ssl.SSLSocket) {
            javax.net.ssl.SSLSocket sSLSocket = (javax.net.ssl.SSLSocket) socket;
            java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(sSLSocket.getSupportedProtocols()));
            arrayList.retainAll(java.util.Arrays.asList("TLSv1.2", "TLSv1.1", "TLSv1"));
            sSLSocket.setEnabledProtocols((java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]));
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String str, int i) throws java.io.IOException {
        return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges.createSocket(str, i));
    }

    static lib.android.paypal.com.magnessdk.network.base.g getHighSpeedVideoFpsRanges() {
        return new lib.android.paypal.com.magnessdk.network.base.g();
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.lang.String str, int i, java.net.InetAddress inetAddress, int i2) throws java.io.IOException {
        return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress inetAddress, int i) throws java.io.IOException {
        return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public final java.net.Socket createSocket(java.net.InetAddress inetAddress, int i, java.net.InetAddress inetAddress2, int i2) throws java.io.IOException {
        return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges.createSocket(inetAddress, i, inetAddress2, i2));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.net.Socket createSocket(java.net.Socket socket, java.lang.String str, int i, boolean z) throws java.io.IOException {
        return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges.createSocket(socket, str, i, z));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getSupportedCipherSuites() {
        return this.getHighSpeedVideoFpsRanges.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final java.lang.String[] getDefaultCipherSuites() {
        return this.getHighSpeedVideoFpsRanges.getDefaultCipherSuites();
    }

    private javax.net.ssl.TrustManager[] getHighSpeedVideoSizes() {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            try {
                java.security.KeyStore keyStore = java.security.KeyStore.getInstance(java.security.KeyStore.getDefaultType());
                keyStore.load(null, null);
                for (java.security.cert.Certificate certificate : java.security.cert.CertificateFactory.getInstance("X.509").generateCertificates(lib.android.paypal.com.magnessdk.network.base.PayPalCertificate.getCertInputStream())) {
                    if (certificate instanceof java.security.cert.X509Certificate) {
                        keyStore.setCertificateEntry(((java.security.cert.X509Certificate) certificate).getSubjectDN().getName(), certificate);
                    }
                }
                javax.net.ssl.TrustManagerFactory trustManagerFactory = javax.net.ssl.TrustManagerFactory.getInstance(javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init(keyStore);
                this.Camera2StreamConfigurationMap = trustManagerFactory.getTrustManagers();
            } catch (java.lang.Exception e) {
                lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.network.base.g.class, 3, e);
            }
            this.getHighSpeedVideoFpsRangesFor = this.Camera2StreamConfigurationMap;
        }
        return this.getHighSpeedVideoFpsRangesFor;
    }

    private g() {
        try {
            this.getHighSpeedVideoSizes = javax.net.ssl.SSLContext.getInstance("TLS");
            javax.net.ssl.TrustManager[] highSpeedVideoSizes = getHighSpeedVideoSizes();
            this.Camera2StreamConfigurationMap = highSpeedVideoSizes;
            this.getHighSpeedVideoSizes.init(null, highSpeedVideoSizes, null);
            this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes.getSocketFactory();
        } catch (java.lang.Exception e) {
            lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.network.base.g.class, 3, e);
        }
    }
}
