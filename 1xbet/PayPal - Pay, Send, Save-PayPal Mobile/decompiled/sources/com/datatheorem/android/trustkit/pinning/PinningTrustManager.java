package com.datatheorem.android.trustkit.pinning;

/* loaded from: classes8.dex */
class PinningTrustManager implements javax.net.ssl.X509TrustManager {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final android.net.http.X509TrustManagerExtensions getHighResolutionOutputSizeshNQ4ISI;
    private final com.datatheorem.android.trustkit.config.DomainPinningPolicy getHighSpeedVideoSizes;

    public PinningTrustManager(java.lang.String str, com.datatheorem.android.trustkit.config.DomainPinningPolicy domainPinningPolicy, javax.net.ssl.X509TrustManager x509TrustManager) {
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = domainPinningPolicy;
        this.getHighResolutionOutputSizeshNQ4ISI = new android.net.http.X509TrustManagerExtensions(x509TrustManager);
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) throws java.security.cert.CertificateException {
        boolean startsWith;
        boolean z;
        java.util.List<java.security.cert.X509Certificate> list;
        java.util.List<java.security.cert.X509Certificate> asList = java.util.Arrays.asList(x509CertificateArr);
        boolean z2 = !com.datatheorem.android.trustkit.pinning.OkHostnameVerifier.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, x509CertificateArr[0]);
        try {
            list = this.getHighResolutionOutputSizeshNQ4ISI.checkServerTrusted(x509CertificateArr, str, this.Camera2StreamConfigurationMap);
            z = z2;
            startsWith = false;
        } catch (java.security.cert.CertificateException e) {
            startsWith = e.getMessage().startsWith("Pin verification failed");
            z = startsWith ? z2 : true;
            list = asList;
        }
        if (z || startsWith) {
            com.datatheorem.android.trustkit.pinning.PinningValidationResult pinningValidationResult = com.datatheorem.android.trustkit.pinning.PinningValidationResult.FAILED;
            if (z) {
                pinningValidationResult = com.datatheorem.android.trustkit.pinning.PinningValidationResult.FAILED_CERTIFICATE_CHAIN_NOT_TRUSTED;
            }
            com.datatheorem.android.trustkit.pinning.TrustManagerBuilder.getHighSpeedVideoFpsRangesFor().pinValidationFailed(this.Camera2StreamConfigurationMap, 0, asList, list, this.getHighSpeedVideoSizes, pinningValidationResult);
        }
        if (z) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Certificate validation failed for ");
            sb.append(this.Camera2StreamConfigurationMap);
            throw new java.security.cert.CertificateException(sb.toString());
        }
        if (startsWith && this.getHighSpeedVideoSizes.shouldEnforcePinning()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Pin verification failed\n  Configured pins: ");
            java.util.Iterator<com.datatheorem.android.trustkit.config.PublicKeyPin> it = this.getHighSpeedVideoSizes.getPublicKeyPins().iterator();
            while (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(" ");
            }
            sb2.append("\n  Peer certificate chain: ");
            for (java.security.cert.X509Certificate x509Certificate : list) {
                sb2.append("\n    ");
                sb2.append(new com.datatheorem.android.trustkit.config.PublicKeyPin(x509Certificate));
                sb2.append(" - ");
                sb2.append(x509Certificate.getSubjectDN());
            }
            throw new java.security.cert.CertificateException(sb2.toString());
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(java.security.cert.X509Certificate[] x509CertificateArr, java.lang.String str) throws java.security.cert.CertificateException {
        throw new java.security.cert.CertificateException("Client certificates not supported!");
    }

    @Override // javax.net.ssl.X509TrustManager
    public java.security.cert.X509Certificate[] getAcceptedIssuers() {
        return new java.security.cert.X509Certificate[0];
    }
}
