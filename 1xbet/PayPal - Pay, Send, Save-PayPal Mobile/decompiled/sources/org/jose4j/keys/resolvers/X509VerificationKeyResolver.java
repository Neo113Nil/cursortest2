package org.jose4j.keys.resolvers;

/* loaded from: classes18.dex */
public class X509VerificationKeyResolver implements org.jose4j.keys.resolvers.VerificationKeyResolver {
    private static final org.slf4j.Logger getHighSpeedVideoFpsRangesFor = org.slf4j.LoggerFactory.getLogger((java.lang.Class<?>) org.jose4j.keys.resolvers.X509VerificationKeyResolver.class);
    private java.util.Map<java.lang.String, java.security.cert.X509Certificate> Camera2StreamConfigurationMap;
    private java.util.Map<java.lang.String, java.security.cert.X509Certificate> getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;

    public X509VerificationKeyResolver(java.util.List<java.security.cert.X509Certificate> list) {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap();
        this.Camera2StreamConfigurationMap = new java.util.LinkedHashMap();
        for (java.security.cert.X509Certificate x509Certificate : list) {
            try {
                this.getHighResolutionOutputSizeshNQ4ISI.put(org.jose4j.keys.X509Util.x5t(x509Certificate), x509Certificate);
                this.Camera2StreamConfigurationMap.put(org.jose4j.keys.X509Util.x5tS256(x509Certificate), x509Certificate);
            } catch (org.jose4j.lang.UncheckedJoseException e) {
                getHighSpeedVideoFpsRangesFor.warn("Unable to get certificate thumbprint.", (java.lang.Throwable) e);
            }
        }
    }

    public X509VerificationKeyResolver(java.security.cert.X509Certificate... x509CertificateArr) {
        this((java.util.List<java.security.cert.X509Certificate>) java.util.Arrays.asList(x509CertificateArr));
    }

    public void setTryAllOnNoThumbHeader(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
    }

    @Override // org.jose4j.keys.resolvers.VerificationKeyResolver
    public java.security.Key resolveKey(org.jose4j.jws.JsonWebSignature jsonWebSignature, java.util.List<org.jose4j.jwx.JsonWebStructure> list) throws org.jose4j.lang.UnresolvableKeyException {
        java.lang.String x509CertSha1ThumbprintHeaderValue = jsonWebSignature.getX509CertSha1ThumbprintHeaderValue();
        java.lang.String x509CertSha256ThumbprintHeaderValue = jsonWebSignature.getX509CertSha256ThumbprintHeaderValue();
        if (x509CertSha1ThumbprintHeaderValue == null && x509CertSha256ThumbprintHeaderValue == null) {
            if (this.getHighSpeedVideoFpsRanges) {
                return getHighSpeedVideoFpsRanges(jsonWebSignature);
            }
            throw new org.jose4j.lang.UnresolvableKeyException("Neither the x5t header nor the x5t#S256 header are present in the JWS.");
        }
        java.security.cert.X509Certificate x509Certificate = this.getHighResolutionOutputSizeshNQ4ISI.get(x509CertSha1ThumbprintHeaderValue);
        if (x509Certificate == null) {
            x509Certificate = this.Camera2StreamConfigurationMap.get(x509CertSha256ThumbprintHeaderValue);
        }
        if (x509Certificate == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The X.509 Certificate Thumbprint header(s) in the JWS do not identify any of the provided Certificates -");
            if (x509CertSha1ThumbprintHeaderValue != null) {
                sb.append(" x5t=");
                sb.append(x509CertSha1ThumbprintHeaderValue);
                sb.append(" vs. SHA-1 thumbs:");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI.keySet());
            }
            if (x509CertSha256ThumbprintHeaderValue != null) {
                sb.append(" x5t#S256=");
                sb.append(x509CertSha256ThumbprintHeaderValue);
                sb.append(" vs. SHA-256 thumbs:");
                sb.append(this.Camera2StreamConfigurationMap.keySet());
            }
            sb.append(".");
            throw new org.jose4j.lang.UnresolvableKeyException(sb.toString());
        }
        return x509Certificate.getPublicKey();
    }

    private java.security.Key getHighSpeedVideoFpsRanges(org.jose4j.jws.JsonWebSignature jsonWebSignature) throws org.jose4j.lang.UnresolvableKeyException {
        java.util.Iterator<java.security.cert.X509Certificate> it = this.getHighResolutionOutputSizeshNQ4ISI.values().iterator();
        while (it.hasNext()) {
            java.security.PublicKey publicKey = it.next().getPublicKey();
            jsonWebSignature.setKey(publicKey);
            try {
            } catch (org.jose4j.lang.JoseException e) {
                getHighSpeedVideoFpsRangesFor.debug("Verify signature didn't work: {}", org.jose4j.lang.ExceptionHelp.toStringWithCauses(e));
            }
            if (jsonWebSignature.verifySignature()) {
                return publicKey;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to verify the signature with any of the provided keys - SHA-1 thumbs of provided certificates: ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI.keySet());
        sb.append(".");
        throw new org.jose4j.lang.UnresolvableKeyException(sb.toString());
    }
}
