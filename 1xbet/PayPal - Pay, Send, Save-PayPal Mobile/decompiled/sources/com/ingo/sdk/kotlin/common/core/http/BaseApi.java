package com.ingo.sdk.kotlin.common.core.http;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/ingo/sdk/kotlin/common/core/http/BaseApi;", "", "<init>", "()V", "", "url", "", "apiAnalyticsProperties", "(Ljava/lang/String;)Ljava/util/Map;", "Lio/ktor/client/statement/HttpResponse;", "response", "", "trackApiRequestFailed", "(Ljava/lang/String;Lio/ktor/client/statement/HttpResponse;)V", "trackApiRequestStarted", "(Ljava/lang/String;)V", "trackApiRequestCompleted", "", "Camera2StreamConfigurationMap", "J"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class BaseApi {
    private long Camera2StreamConfigurationMap = com.ingo.sdk.kotlin.common.analytics.SystemTimeKt.systemTime();

    public abstract java.util.Map<java.lang.String, java.lang.String> apiAnalyticsProperties(java.lang.String url);

    protected final void trackApiRequestStarted(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        this.Camera2StreamConfigurationMap = com.ingo.sdk.kotlin.common.analytics.SystemTimeKt.systemTime();
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
        if (obj != null) {
            ((com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj).trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.ApiRequestStart, apiAnalyticsProperties(url));
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
    }

    protected final void trackApiRequestFailed(java.lang.String url, io.ktor.client.statement.HttpResponse response) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
        if (obj != null) {
            java.util.Map<java.lang.String, java.lang.String> apiAnalyticsProperties = apiAnalyticsProperties(url);
            apiAnalyticsProperties.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.HttpStatus, response.getStatus().toString());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            ((com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj).trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.ApiFailure, apiAnalyticsProperties);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
    }

    protected final void trackApiRequestCompleted(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        java.lang.Object obj = com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoApplicationState().get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.ingo.sdk.kotlin.common.analytics.IngoAnalytics.class));
        if (obj != null) {
            java.util.Map<java.lang.String, java.lang.String> apiAnalyticsProperties = apiAnalyticsProperties(url);
            apiAnalyticsProperties.put(com.ingo.sdk.kotlin.common.analytics.IPropertyNames.ApiRequestDuration, java.lang.String.valueOf(com.ingo.sdk.kotlin.common.analytics.SystemTimeKt.systemTime() - this.Camera2StreamConfigurationMap));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            ((com.ingo.sdk.kotlin.common.analytics.IngoAnalytics) obj).trackEvent(com.ingo.sdk.kotlin.common.analytics.IEventNames.ApiRequestEnd, apiAnalyticsProperties);
            return;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type com.ingo.sdk.kotlin.common.analytics.IngoAnalytics");
    }
}
