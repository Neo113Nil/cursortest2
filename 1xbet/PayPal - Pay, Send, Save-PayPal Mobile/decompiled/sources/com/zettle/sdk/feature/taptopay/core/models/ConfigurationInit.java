package com.zettle.sdk.feature.taptopay.core.models;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001c\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b \u0010\u0017R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b!\u0010\u0017"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/models/ConfigurationInit;", "", "", "attestationHost", "attestationHostCertPinning", "", "attestationHostReadTimeOut", "attestationConnectionTimeout", "attestationRefreshInterval", "attestationMinimumRefreshInterval", "keyLoadingHost", "keyLoadingCertPinning", "keyLoadingCaCert", "libAccessKey", "libSecretKey", "libGooglePlayProjNum", "<init>", "(Ljava/lang/String;Ljava/lang/String;JJJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "J", "getAttestationConnectionTimeout", "()J", "Ljava/lang/String;", "getAttestationHost", "()Ljava/lang/String;", "getAttestationHostCertPinning", "getAttestationHostReadTimeOut", "getAttestationMinimumRefreshInterval", "getAttestationRefreshInterval", "getKeyLoadingCaCert", "getKeyLoadingCertPinning", "getKeyLoadingHost", "getLibAccessKey", "getLibGooglePlayProjNum", "getLibSecretKey"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ConfigurationInit {
    private final long attestationConnectionTimeout;
    private final java.lang.String attestationHost;
    private final java.lang.String attestationHostCertPinning;
    private final long attestationHostReadTimeOut;
    private final long attestationMinimumRefreshInterval;
    private final long attestationRefreshInterval;
    private final java.lang.String keyLoadingCaCert;
    private final java.lang.String keyLoadingCertPinning;
    private final java.lang.String keyLoadingHost;
    private final java.lang.String libAccessKey;
    private final java.lang.String libGooglePlayProjNum;
    private final java.lang.String libSecretKey;

    public ConfigurationInit(java.lang.String str, java.lang.String str2, long j, long j2, long j3, long j4, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
        this.attestationHost = str;
        this.attestationHostCertPinning = str2;
        this.attestationHostReadTimeOut = j;
        this.attestationConnectionTimeout = j2;
        this.attestationRefreshInterval = j3;
        this.attestationMinimumRefreshInterval = j4;
        this.keyLoadingHost = str3;
        this.keyLoadingCertPinning = str4;
        this.keyLoadingCaCert = str5;
        this.libAccessKey = str6;
        this.libSecretKey = str7;
        this.libGooglePlayProjNum = str8;
    }

    public final java.lang.String getAttestationHost() {
        return this.attestationHost;
    }

    public final java.lang.String getAttestationHostCertPinning() {
        return this.attestationHostCertPinning;
    }

    public final long getAttestationHostReadTimeOut() {
        return this.attestationHostReadTimeOut;
    }

    public final long getAttestationConnectionTimeout() {
        return this.attestationConnectionTimeout;
    }

    public final long getAttestationRefreshInterval() {
        return this.attestationRefreshInterval;
    }

    public final long getAttestationMinimumRefreshInterval() {
        return this.attestationMinimumRefreshInterval;
    }

    public final java.lang.String getKeyLoadingHost() {
        return this.keyLoadingHost;
    }

    public final java.lang.String getKeyLoadingCertPinning() {
        return this.keyLoadingCertPinning;
    }

    public final java.lang.String getKeyLoadingCaCert() {
        return this.keyLoadingCaCert;
    }

    public final java.lang.String getLibAccessKey() {
        return this.libAccessKey;
    }

    public final java.lang.String getLibSecretKey() {
        return this.libSecretKey;
    }

    public final java.lang.String getLibGooglePlayProjNum() {
        return this.libGooglePlayProjNum;
    }
}
