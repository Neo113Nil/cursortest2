package com.adjust.sdk;

/* loaded from: classes2.dex */
public class AdjustTestOptions {
    public java.lang.Boolean allowUrlStrategyFallback;
    public java.lang.String basePath;
    public java.lang.String baseUrl;
    public android.content.Context context;
    public java.lang.String gdprPath;
    public java.lang.String gdprUrl;
    public java.lang.Boolean ignoreSystemLifecycleBootstrap;
    public java.lang.Boolean noBackoffWait;
    public java.lang.String purchaseVerificationPath;
    public java.lang.String purchaseVerificationUrl;
    public java.lang.Long sessionIntervalInMilliseconds;
    public java.lang.String subscriptionPath;
    public java.lang.String subscriptionUrl;
    public java.lang.Long subsessionIntervalInMilliseconds;
    public java.lang.Boolean teardown;
    public java.lang.Long timerIntervalInMilliseconds;
    public java.lang.Long timerStartInMilliseconds;
    public java.lang.Boolean tryInstallReferrer;

    public AdjustTestOptions() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.tryInstallReferrer = bool;
        this.ignoreSystemLifecycleBootstrap = java.lang.Boolean.TRUE;
        this.allowUrlStrategyFallback = bool;
    }
}
