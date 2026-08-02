package com.ingo.sdk.kotlin.common;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0016\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\t\u001a\u00020\u00028\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018"}, d2 = {"Lcom/ingo/sdk/kotlin/common/IngoBaseConfiguration;", "", "", "baseUrl", "deviceBlackBox", "Lcom/ingo/sdk/kotlin/common/core/model/DeviceInfo;", "deviceInfo", "", "loggingEnabled", "customerId", "Lcom/ingo/sdk/kotlin/ux/IngoSdkTheme;", com.ingo.sdk.android.ux.activity.IngoSdkActivity.THEME, "allowSimulators", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingo/sdk/kotlin/common/core/model/DeviceInfo;ZLjava/lang/String;Lcom/ingo/sdk/kotlin/ux/IngoSdkTheme;Z)V", "Ljava/lang/String;", "getBaseUrl", "()Ljava/lang/String;", "getDeviceBlackBox", "Lcom/ingo/sdk/kotlin/common/core/model/DeviceInfo;", "getDeviceInfo", "()Lcom/ingo/sdk/kotlin/common/core/model/DeviceInfo;", "Z", "getLoggingEnabled", "()Z", "getCustomerId", "setCustomerId", "(Ljava/lang/String;)V", "Lcom/ingo/sdk/kotlin/ux/IngoSdkTheme;", "getTheme", "()Lcom/ingo/sdk/kotlin/ux/IngoSdkTheme;", "getAllowSimulators"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public class IngoBaseConfiguration {
    private final boolean allowSimulators;
    private final java.lang.String baseUrl;
    private java.lang.String customerId;
    private final java.lang.String deviceBlackBox;
    private final com.ingo.sdk.kotlin.common.core.model.DeviceInfo deviceInfo;
    private final boolean loggingEnabled;
    private final com.ingo.sdk.kotlin.ux.IngoSdkTheme theme;

    public IngoBaseConfiguration(java.lang.String str, java.lang.String str2, com.ingo.sdk.kotlin.common.core.model.DeviceInfo deviceInfo, boolean z, java.lang.String str3, com.ingo.sdk.kotlin.ux.IngoSdkTheme ingoSdkTheme, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ingoSdkTheme, "");
        this.baseUrl = str;
        this.deviceBlackBox = str2;
        this.deviceInfo = deviceInfo;
        this.loggingEnabled = z;
        this.customerId = str3;
        this.theme = ingoSdkTheme;
        this.allowSimulators = z2;
    }

    public java.lang.String getBaseUrl() {
        return this.baseUrl;
    }

    public java.lang.String getDeviceBlackBox() {
        return this.deviceBlackBox;
    }

    public com.ingo.sdk.kotlin.common.core.model.DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public boolean getLoggingEnabled() {
        return this.loggingEnabled;
    }

    public java.lang.String getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.customerId = str;
    }

    public com.ingo.sdk.kotlin.ux.IngoSdkTheme getTheme() {
        return this.theme;
    }

    public boolean getAllowSimulators() {
        return this.allowSimulators;
    }
}
