package com.datadog.android.okhttp.trace;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/okhttp/trace/TracedRequestListener;", "", "Lokhttp3/Request;", "request", "Lcom/datadog/android/trace/api/span/DatadogSpan;", "span", "Lokhttp3/Response;", "response", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "onRequestIntercepted", "(Lokhttp3/Request;Lcom/datadog/android/trace/api/span/DatadogSpan;Lokhttp3/Response;Ljava/lang/Throwable;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface TracedRequestListener {
    void onRequestIntercepted(okhttp3.Request request, com.datadog.android.trace.api.span.DatadogSpan span, okhttp3.Response response, java.lang.Throwable throwable);
}
