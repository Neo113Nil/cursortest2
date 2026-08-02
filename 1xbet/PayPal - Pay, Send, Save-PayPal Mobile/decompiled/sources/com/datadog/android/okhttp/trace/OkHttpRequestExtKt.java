package com.datadog.android.okhttp.trace;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lokhttp3/Request$Builder;", "Lcom/datadog/android/trace/api/span/DatadogSpan;", "span", "parentSpan", "(Lokhttp3/Request$Builder;Lcom/datadog/android/trace/api/span/DatadogSpan;)Lokhttp3/Request$Builder;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OkHttpRequestExtKt {
    public static final okhttp3.Request.Builder parentSpan(okhttp3.Request.Builder builder, com.datadog.android.trace.api.span.DatadogSpan datadogSpan) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogSpan, "");
        builder.tag((java.lang.Class<? super java.lang.Class>) com.datadog.android.trace.api.span.DatadogSpan.class, (java.lang.Class) datadogSpan);
        return builder;
    }
}
