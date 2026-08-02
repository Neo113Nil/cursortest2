package com.datadog.android.trace.internal.net;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a9\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\f\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u000b"}, d2 = {"Lcom/datadog/android/trace/internal/net/RequestTracingState;", "", "traceIdKey", "spanIdKey", "rulePsrKey", "", "", "toAttributesMap", "(Lcom/datadog/android/trace/internal/net/RequestTracingState;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;", "", "ALL_IN_SAMPLE_RATE", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "ZERO_SAMPLE_RATE"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RequestTracingStateKt {
    public static final float ALL_IN_SAMPLE_RATE = 100.0f;
    public static final float ZERO_SAMPLE_RATE = 0.0f;

    public static final java.util.Map<java.lang.String, java.lang.Object> toAttributesMap(com.datadog.android.trace.internal.net.RequestTracingState requestTracingState, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.datadog.android.trace.api.span.DatadogSpan span;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        java.util.Map<java.lang.String, java.lang.Object> map = null;
        if (requestTracingState != null && (span = requestTracingState.getSpan()) != null) {
            if (!requestTracingState.isSampled()) {
                span = null;
            }
            if (span != null) {
                java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                createMapBuilder.put(str, span.context().getTraceId().toHexString());
                createMapBuilder.put(str2, java.lang.String.valueOf(span.context().getSpanId()));
                java.lang.Float sampleRate = requestTracingState.getSampleRate();
                createMapBuilder.put(str3, java.lang.Float.valueOf((sampleRate != null ? sampleRate.floatValue() : 0.0f) / 100.0f));
                map = kotlin.collections.MapsKt.build(createMapBuilder);
            }
        }
        return map == null ? kotlin.collections.MapsKt.emptyMap() : map;
    }
}
