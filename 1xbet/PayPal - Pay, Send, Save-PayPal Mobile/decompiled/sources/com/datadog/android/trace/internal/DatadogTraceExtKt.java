package com.datadog.android.trace.internal;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/datadog/android/trace/api/trace/DatadogTraceId$Companion;", "", "traceId", "Lcom/datadog/android/trace/api/trace/DatadogTraceId;", "fromHex", "(Lcom/datadog/android/trace/api/trace/DatadogTraceId$Companion;Ljava/lang/String;)Lcom/datadog/android/trace/api/trace/DatadogTraceId;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DatadogTraceExtKt {
    public static final com.datadog.android.trace.api.trace.DatadogTraceId fromHex(com.datadog.android.trace.api.trace.DatadogTraceId.Companion companion, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.datadog.trace.api.DDTraceId fromHex = com.datadog.trace.api.DDTraceId.fromHex(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromHex, "");
        return new com.datadog.android.trace.internal.DatadogTraceIdAdapter(fromHex);
    }
}
