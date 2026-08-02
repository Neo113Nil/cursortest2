package com.datatheorem.android.trustkit.config;

/* loaded from: classes8.dex */
public final class PublicKeyPin {
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    public PublicKeyPin(java.security.cert.Certificate certificate) {
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            this.getHighResolutionOutputSizeshNQ4ISI = android.util.Base64.encodeToString(messageDigest.digest(certificate.getPublicKey().getEncoded()), 0).trim();
        } catch (java.security.NoSuchAlgorithmException unused) {
            throw new java.lang.IllegalStateException("Should never happen");
        }
    }

    public PublicKeyPin(java.lang.String str) {
        if (android.util.Base64.decode(str, 0).length != 32) {
            throw new java.lang.IllegalArgumentException("Invalid pin: length is not 32 bytes");
        }
        this.getHighResolutionOutputSizeshNQ4ISI = str.trim();
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.datatheorem.android.trustkit.config.PublicKeyPin) && obj.toString().equals(toString());
    }

    public final int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public final java.lang.String toString() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
