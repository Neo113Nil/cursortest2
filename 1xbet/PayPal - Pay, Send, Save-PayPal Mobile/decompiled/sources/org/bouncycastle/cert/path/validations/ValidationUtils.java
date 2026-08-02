package org.bouncycastle.cert.path.validations;

/* loaded from: classes17.dex */
class ValidationUtils {
    static boolean getHighSpeedVideoFpsRanges(org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) {
        return x509CertificateHolder.getSubject().equals(x509CertificateHolder.getIssuer());
    }

    ValidationUtils() {
    }
}
