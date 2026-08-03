package com.moloco.sdk.acm;

/* loaded from: classes5.dex */
public final class e {
    public static final com.moloco.sdk.acm.a a(com.moloco.sdk.acm.InitConfig initConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initConfig, "<this>");
        return new com.moloco.sdk.acm.a(initConfig.getAppId(), initConfig.getPostAnalyticsUrl(), initConfig.getRequestPeriodSeconds(), initConfig.getClientOptions());
    }
}
