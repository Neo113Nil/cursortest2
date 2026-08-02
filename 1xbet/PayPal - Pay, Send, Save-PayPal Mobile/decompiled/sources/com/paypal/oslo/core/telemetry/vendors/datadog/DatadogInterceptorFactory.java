package com.paypal.oslo.core.telemetry.vendors.datadog;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/datadog/DatadogInterceptorFactory;", "", "<init>", "()V", "", "baseUrl", "appVersion", "Lcom/datadog/android/okhttp/DatadogInterceptor;", "create", "(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/okhttp/DatadogInterceptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DatadogInterceptorFactory {
    public static final int $stable = 0;
    public static final com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInterceptorFactory INSTANCE = new com.paypal.oslo.core.telemetry.vendors.datadog.DatadogInterceptorFactory();

    private DatadogInterceptorFactory() {
    }

    public final com.datadog.android.okhttp.DatadogInterceptor create(java.lang.String baseUrl, java.lang.String appVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appVersion, "");
        java.util.Set of = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.datadog.android.trace.TracingHeaderType[]{com.datadog.android.trace.TracingHeaderType.DATADOG, com.datadog.android.trace.TracingHeaderType.TRACECONTEXT});
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        java.lang.String host = java.net.URI.create(baseUrl).getHost();
        if (host != null) {
            createMapBuilder.put(host, of);
        }
        return new com.datadog.android.okhttp.DatadogInterceptor.Builder((java.util.Map<java.lang.String, ? extends java.util.Set<? extends com.datadog.android.trace.TracingHeaderType>>) kotlin.collections.MapsKt.build(createMapBuilder)).setRumResourceAttributesProvider(new com.paypal.oslo.core.telemetry.vendors.datadog.ModuleNameRumResourceAttributesProvider(appVersion)).build();
    }
}
