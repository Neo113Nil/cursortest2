package org.bouncycastle.cert.ocsp;

/* loaded from: classes17.dex */
class OCSPUtils {
    static final org.bouncycastle.cert.X509CertificateHolder[] getHighSpeedVideoFpsRanges = new org.bouncycastle.cert.X509CertificateHolder[0];
    static java.util.Set getHighSpeedVideoSizes = java.util.Collections.unmodifiableSet(new java.util.HashSet());
    static java.util.List getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(new java.util.ArrayList());

    static java.util.Set Camera2StreamConfigurationMap(org.bouncycastle.asn1.x509.Extensions extensions) {
        return extensions == null ? getHighSpeedVideoSizes : java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(extensions.getNonCriticalExtensionOIDs())));
    }

    static java.util.List getHighResolutionOutputSizeshNQ4ISI(org.bouncycastle.asn1.x509.Extensions extensions) {
        return extensions == null ? getHighResolutionOutputSizeshNQ4ISI : java.util.Collections.unmodifiableList(java.util.Arrays.asList(extensions.getExtensionOIDs()));
    }

    static java.util.Set getHighSpeedVideoFpsRangesFor(org.bouncycastle.asn1.x509.Extensions extensions) {
        return extensions == null ? getHighSpeedVideoSizes : java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(extensions.getCriticalExtensionOIDs())));
    }

    static java.util.Date Camera2StreamConfigurationMap(org.bouncycastle.asn1.ASN1GeneralizedTime aSN1GeneralizedTime) {
        try {
            return aSN1GeneralizedTime.getDate();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("exception processing GeneralizedTime: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    OCSPUtils() {
    }
}
