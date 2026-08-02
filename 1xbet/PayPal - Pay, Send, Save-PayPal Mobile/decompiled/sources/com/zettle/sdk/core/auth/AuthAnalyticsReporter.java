package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004"}, d2 = {"Lcom/zettle/sdk/core/auth/AuthAnalyticsReporter;", "", "", "reportAuthStarted", "()V", "reportAuthSuccess", "reportVerifyStarted", "reportVerifySuccess", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AuthAnalyticsReporter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.auth.AuthAnalyticsReporter.Companion INSTANCE = com.zettle.sdk.core.auth.AuthAnalyticsReporter.Companion.Camera2StreamConfigurationMap;

    void reportAuthStarted();

    void reportAuthSuccess();

    void reportVerifyStarted();

    void reportVerifySuccess();

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/core/auth/AuthAnalyticsReporter$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.core.auth.AuthAnalyticsReporter.Companion Camera2StreamConfigurationMap = new com.zettle.sdk.core.auth.AuthAnalyticsReporter.Companion();

        private Companion() {
        }
    }
}
