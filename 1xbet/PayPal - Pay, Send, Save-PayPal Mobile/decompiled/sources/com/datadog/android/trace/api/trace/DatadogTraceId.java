package com.datadog.android.trace.api.trace;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/datadog/android/trace/api/trace/DatadogTraceId;", "", "", "toHexString", "()Ljava/lang/String;", "", io.ktor.http.ContentDisposition.Parameters.Size, "toHexStringPadded", "(I)Ljava/lang/String;", "", "toLong", "()J", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DatadogTraceId {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.trace.api.trace.DatadogTraceId.Companion INSTANCE = com.datadog.android.trace.api.trace.DatadogTraceId.Companion.getHighSpeedVideoSizes;

    java.lang.String toHexString();

    java.lang.String toHexStringPadded(int size);

    long toLong();

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/trace/api/trace/DatadogTraceId$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ com.datadog.android.trace.api.trace.DatadogTraceId.Companion getHighSpeedVideoSizes = new com.datadog.android.trace.api.trace.DatadogTraceId.Companion();

        private Companion() {
        }
    }
}
