package com.datadog.android.trace.internal;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0012R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/datadog/android/trace/internal/DatadogTraceIdAdapter;", "Lcom/datadog/android/trace/api/trace/DatadogTraceId;", "Lcom/datadog/trace/api/DDTraceId;", "delegate", "<init>", "(Lcom/datadog/trace/api/DDTraceId;)V", "copy", "(Lcom/datadog/trace/api/DDTraceId;)Lcom/datadog/android/trace/internal/DatadogTraceIdAdapter;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toHexString", "()Ljava/lang/String;", io.ktor.http.ContentDisposition.Parameters.Size, "toHexStringPadded", "(I)Ljava/lang/String;", "", "toHighOrderLong", "()J", "toLong", "toString", "getHighSpeedVideoSizes", "Lcom/datadog/trace/api/DDTraceId;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DatadogTraceIdAdapter extends com.datadog.trace.api.DDTraceId implements com.datadog.android.trace.api.trace.DatadogTraceId {
    private final com.datadog.trace.api.DDTraceId getHighSpeedVideoSizes;

    public DatadogTraceIdAdapter(com.datadog.trace.api.DDTraceId dDTraceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dDTraceId, "");
        this.getHighSpeedVideoSizes = dDTraceId;
    }

    @Override // com.datadog.trace.api.DDTraceId, com.datadog.android.trace.api.trace.DatadogTraceId
    public final long toLong() {
        return this.getHighSpeedVideoSizes.toLong();
    }

    @Override // com.datadog.trace.api.DDTraceId
    public final java.lang.String toString() {
        java.lang.String obj = this.getHighSpeedVideoSizes.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    @Override // com.datadog.trace.api.DDTraceId, com.datadog.android.trace.api.trace.DatadogTraceId
    public final java.lang.String toHexString() {
        java.lang.String hexString = this.getHighSpeedVideoSizes.toHexString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hexString, "");
        return hexString;
    }

    @Override // com.datadog.trace.api.DDTraceId
    public final long toHighOrderLong() {
        return this.getHighSpeedVideoSizes.toHighOrderLong();
    }

    @Override // com.datadog.trace.api.DDTraceId, com.datadog.android.trace.api.trace.DatadogTraceId
    public final java.lang.String toHexStringPadded(int size) {
        java.lang.String hexStringPadded = this.getHighSpeedVideoSizes.toHexStringPadded(size);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(hexStringPadded, "");
        return hexStringPadded;
    }

    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.datadog.android.trace.internal.DatadogTraceIdAdapter) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, ((com.datadog.android.trace.internal.DatadogTraceIdAdapter) other).getHighSpeedVideoSizes);
    }

    public final com.datadog.android.trace.internal.DatadogTraceIdAdapter copy(com.datadog.trace.api.DDTraceId delegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "");
        return new com.datadog.android.trace.internal.DatadogTraceIdAdapter(delegate);
    }

    public static /* synthetic */ com.datadog.android.trace.internal.DatadogTraceIdAdapter copy$default(com.datadog.android.trace.internal.DatadogTraceIdAdapter datadogTraceIdAdapter, com.datadog.trace.api.DDTraceId dDTraceId, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dDTraceId = datadogTraceIdAdapter.getHighSpeedVideoSizes;
        }
        return datadogTraceIdAdapter.copy(dDTraceId);
    }
}
