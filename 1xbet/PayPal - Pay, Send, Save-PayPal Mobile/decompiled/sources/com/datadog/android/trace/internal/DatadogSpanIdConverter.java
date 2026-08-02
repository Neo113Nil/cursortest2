package com.datadog.android.trace.internal;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/datadog/android/trace/internal/DatadogSpanIdConverter;", "", "<init>", "()V", "", "spanId", "", "fromHex", "(Ljava/lang/String;)J", "toHexStringPadded", "(J)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatadogSpanIdConverter {
    public final long fromHex(java.lang.String spanId) throws java.lang.NumberFormatException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spanId, "");
        return com.datadog.trace.api.DDSpanId.fromHex(spanId);
    }

    public final java.lang.String toHexStringPadded(long spanId) {
        java.lang.String hexStringPadded = com.datadog.trace.api.DDSpanId.toHexStringPadded(spanId);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hexStringPadded, "");
        return hexStringPadded;
    }
}
