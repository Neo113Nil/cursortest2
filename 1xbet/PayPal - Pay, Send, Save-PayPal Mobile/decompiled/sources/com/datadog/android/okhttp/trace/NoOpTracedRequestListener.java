package com.datadog.android.okhttp.trace;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/datadog/android/okhttp/trace/NoOpTracedRequestListener;", "Lcom/datadog/android/okhttp/trace/TracedRequestListener;", "<init>", "()V", "Lokhttp3/Request;", "request", "Lcom/datadog/android/trace/api/span/DatadogSpan;", "span", "Lokhttp3/Response;", "response", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "onRequestIntercepted", "(Lokhttp3/Request;Lcom/datadog/android/trace/api/span/DatadogSpan;Lokhttp3/Response;Ljava/lang/Throwable;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NoOpTracedRequestListener implements com.datadog.android.okhttp.trace.TracedRequestListener {
    @Override // com.datadog.android.okhttp.trace.TracedRequestListener
    public final void onRequestIntercepted(okhttp3.Request request, com.datadog.android.trace.api.span.DatadogSpan span, okhttp3.Response response, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(span, "");
    }
}
