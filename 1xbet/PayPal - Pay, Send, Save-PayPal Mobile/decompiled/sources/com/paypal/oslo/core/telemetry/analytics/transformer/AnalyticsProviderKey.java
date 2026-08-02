package com.paypal.oslo.core.telemetry.analytics.transformer;

@dagger.MapKey(unwrapValue = true)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/transformer/AnalyticsProviderKey;", "", "Lcom/paypal/oslo/core/telemetry/analytics/transformer/ProviderType;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "()Lcom/paypal/oslo/core/telemetry/analytics/transformer/ProviderType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.RUNTIME)
/* loaded from: classes2.dex */
public @interface AnalyticsProviderKey {
    com.paypal.oslo.core.telemetry.analytics.transformer.ProviderType value();
}
