package com.paypal.oslo.core.telemetry.analytics;

@dagger.hilt.android.EarlyEntryPoint
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/AnalyticsHandlerEntryPoint;", "", "Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIAnalyticsHandler;", "fptiAnalyticsHandler", "()Lcom/paypal/oslo/core/telemetry/vendors/fpti/FPTIAnalyticsHandler;", "Lcom/paypal/oslo/core/telemetry/vendors/datadog/DatadogAnalyticsHandler;", "datadogAnalyticsHandler", "()Lcom/paypal/oslo/core/telemetry/vendors/datadog/DatadogAnalyticsHandler;", "Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobeAnalyticsHandler;", "adobeAnalyticsHandler", "()Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobeAnalyticsHandler;", "Lcom/paypal/oslo/core/telemetry/vendors/pie/PieAnalyticsHandler;", "pieAnalyticsHandler", "()Lcom/paypal/oslo/core/telemetry/vendors/pie/PieAnalyticsHandler;", "Lcom/paypal/oslo/core/telemetry/analytics/context/global/GlobalContextEnricher;", "globalContextEnricher", "()Lcom/paypal/oslo/core/telemetry/analytics/context/global/GlobalContextEnricher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AnalyticsHandlerEntryPoint {
    com.paypal.oslo.core.telemetry.vendors.adobe.AdobeAnalyticsHandler adobeAnalyticsHandler();

    com.paypal.oslo.core.telemetry.vendors.datadog.DatadogAnalyticsHandler datadogAnalyticsHandler();

    com.paypal.oslo.core.telemetry.vendors.fpti.FPTIAnalyticsHandler fptiAnalyticsHandler();

    com.paypal.oslo.core.telemetry.analytics.context.global.GlobalContextEnricher globalContextEnricher();

    com.paypal.oslo.core.telemetry.vendors.pie.PieAnalyticsHandler pieAnalyticsHandler();
}
