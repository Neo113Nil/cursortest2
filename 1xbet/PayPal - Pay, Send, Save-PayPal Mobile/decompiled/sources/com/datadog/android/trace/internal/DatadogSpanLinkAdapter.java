package com.datadog.android.trace.internal;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/datadog/android/trace/internal/DatadogSpanLinkAdapter;", "Lcom/datadog/trace/bootstrap/instrumentation/api/SpanLink;", "Lcom/datadog/android/trace/api/span/DatadogSpanLink;", "delegate", "<init>", "(Lcom/datadog/android/trace/api/span/DatadogSpanLink;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DatadogSpanLinkAdapter extends com.datadog.trace.bootstrap.instrumentation.api.SpanLink {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DatadogSpanLinkAdapter(com.datadog.android.trace.api.span.DatadogSpanLink datadogSpanLink) {
        super(r2, r3, r5 ? (byte) 1 : (byte) 0, datadogSpanLink.getTraceStrace(), com.datadog.trace.bootstrap.instrumentation.api.SpanLinkAttributes.fromMap(datadogSpanLink.getAttributes()));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogSpanLink, "");
        com.datadog.trace.api.DDTraceId fromHex = com.datadog.trace.api.DDTraceId.fromHex(datadogSpanLink.getTraceId().toHexString());
        long spanId = datadogSpanLink.getSpanId();
        boolean sampled = datadogSpanLink.getSampled();
    }
}
