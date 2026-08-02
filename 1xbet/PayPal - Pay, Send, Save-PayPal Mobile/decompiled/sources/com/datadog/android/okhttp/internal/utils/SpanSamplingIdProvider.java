package com.datadog.android.okhttp.internal.utils;

@kotlin.Deprecated(message = "Use com.datadog.android.trace.internal.net.SpanSamplingIdProvider instead.", replaceWith = @kotlin.ReplaceWith(expression = "SpanSamplingIdProvider", imports = {"com.datadog.android.trace.internal.net.SpanSamplingIdProvider"}))
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Lcom/datadog/android/okhttp/internal/utils/SpanSamplingIdProvider;", "", "<init>", "()V", "Lcom/datadog/android/trace/api/span/DatadogSpan;", "span", "Lkotlin/ULong;", "provideId-I7RO_PI", "(Lcom/datadog/android/trace/api/span/DatadogSpan;)J", "provideId"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpanSamplingIdProvider {
    public static final com.datadog.android.okhttp.internal.utils.SpanSamplingIdProvider INSTANCE = new com.datadog.android.okhttp.internal.utils.SpanSamplingIdProvider();

    private SpanSamplingIdProvider() {
    }

    /* renamed from: provideId-I7RO_PI, reason: not valid java name */
    public final long m10015provideIdI7RO_PI(com.datadog.android.trace.api.span.DatadogSpan span) {
        java.util.List split$default;
        java.lang.String str;
        java.lang.Long longOrNull;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(span, "");
        com.datadog.android.trace.api.span.DatadogSpanContext context = span.context();
        java.lang.Object obj = context.getTags().get("session_id");
        kotlin.ULong uLong = null;
        java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str2 != null && (split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str2, new char[]{'-'}, false, 0, 6, (java.lang.Object) null)) != null && (str = (java.lang.String) kotlin.collections.CollectionsKt.lastOrNull(split$default)) != null && (longOrNull = kotlin.text.StringsKt.toLongOrNull(str, 16)) != null) {
            uLong = kotlin.ULong.m23493boximpl(kotlin.ULong.m23494constructorimpl(longOrNull.longValue()));
        }
        return uLong != null ? uLong.getGetHighSpeedVideoFpsRanges() : kotlin.ULong.m23494constructorimpl(context.getTraceId().toLong());
    }
}
