package com.datadog.android.rum.metric.networksettled;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014"}, d2 = {"Lcom/datadog/android/rum/metric/networksettled/TimeBasedInitialResourceIdentifier;", "Lcom/datadog/android/rum/metric/networksettled/InitialResourceIdentifier;", "", "timeThresholdInMilliseconds", "<init>", "(J)V", "", "defaultThresholdUsed$dd_sdk_android_rum_release", "()Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/datadog/android/rum/metric/networksettled/NetworkSettledResourceContext;", "context", "validate", "(Lcom/datadog/android/rum/metric/networksettled/NetworkSettledResourceContext;)Z", "J", "getTimeThresholdInMilliseconds$dd_sdk_android_rum_release", "()J", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TimeBasedInitialResourceIdentifier implements com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier {
    public static final long DEFAULT_TIME_THRESHOLD_MS = 100;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final long Camera2StreamConfigurationMap;
    private final long timeThresholdInMilliseconds;

    public TimeBasedInitialResourceIdentifier(long j) {
        this.timeThresholdInMilliseconds = j;
        this.Camera2StreamConfigurationMap = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j);
    }

    public /* synthetic */ TimeBasedInitialResourceIdentifier(long j, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 100L : j);
    }

    /* renamed from: getTimeThresholdInMilliseconds$dd_sdk_android_rum_release, reason: from getter */
    public final long getTimeThresholdInMilliseconds() {
        return this.timeThresholdInMilliseconds;
    }

    @Override // com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier
    public final boolean validate(com.datadog.android.rum.metric.networksettled.NetworkSettledResourceContext context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Long viewCreatedTimestamp = context.getViewCreatedTimestamp();
        if (viewCreatedTimestamp != null) {
            return context.getEventCreatedAtNanos() - viewCreatedTimestamp.longValue() < this.Camera2StreamConfigurationMap;
        }
        return false;
    }

    public final boolean defaultThresholdUsed$dd_sdk_android_rum_release() {
        return 100 == this.timeThresholdInMilliseconds;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "");
        return this.Camera2StreamConfigurationMap == ((com.datadog.android.rum.metric.networksettled.TimeBasedInitialResourceIdentifier) other).Camera2StreamConfigurationMap;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.Camera2StreamConfigurationMap);
    }

    public TimeBasedInitialResourceIdentifier() {
        this(0L, 1, null);
    }
}
