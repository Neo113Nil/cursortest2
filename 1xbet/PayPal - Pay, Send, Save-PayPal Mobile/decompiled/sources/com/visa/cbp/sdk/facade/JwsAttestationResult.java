package com.visa.cbp.sdk.facade;

/* loaded from: classes5.dex */
public class JwsAttestationResult {
    java.lang.String advice;
    java.util.List<java.lang.String> apkCertificateDigestSha256;
    java.lang.String apkDigestSha256;
    java.lang.String apkPackageName;
    boolean basicIntegrity;
    boolean ctsProfileMatch;
    java.lang.String error;
    java.lang.String evaluationType;
    java.lang.String extension;
    java.lang.String nonce;
    long timestampMs;

    public java.lang.String getNonce() {
        return this.nonce;
    }

    public long getTimestampMs() {
        return this.timestampMs;
    }

    public java.lang.String getApkPackageName() {
        return this.apkPackageName;
    }

    public java.lang.String getApkDigestSha256() {
        return this.apkDigestSha256;
    }

    public boolean isCtsProfileMatch() {
        return this.ctsProfileMatch;
    }

    public java.lang.String getExtension() {
        return this.extension;
    }

    public java.util.List<java.lang.String> getApkCertificateDigestSha256() {
        return this.apkCertificateDigestSha256;
    }

    public boolean isBasicIntegrity() {
        return this.basicIntegrity;
    }

    public java.lang.String getError() {
        return this.error;
    }

    public java.lang.String getAdvice() {
        return this.advice;
    }

    public java.lang.String getEvaluationType() {
        return this.evaluationType;
    }
}
