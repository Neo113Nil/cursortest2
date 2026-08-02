package io.ktor.client.plugins;

@io.ktor.utils.io.KtorDsl
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB-\b\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00028G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00028G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R(\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00028G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018"}, d2 = {"Lio/ktor/client/plugins/HttpTimeoutConfig;", "", "", "requestTimeoutMillis", "connectTimeoutMillis", "socketTimeoutMillis", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Camera2StreamConfigurationMap", "Ljava/lang/Long;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getRequestTimeoutMillis", "()Ljava/lang/Long;", "setRequestTimeoutMillis", "(Ljava/lang/Long;)V", "getConnectTimeoutMillis", "setConnectTimeoutMillis", "getSocketTimeoutMillis", "setSocketTimeoutMillis", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class HttpTimeoutConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final io.ktor.client.plugins.HttpTimeoutConfig.Companion INSTANCE = new io.ktor.client.plugins.HttpTimeoutConfig.Companion(0 == true ? 1 : 0);
    public static final long INFINITE_TIMEOUT_MS = Long.MAX_VALUE;
    private static final io.ktor.util.AttributeKey<io.ktor.client.plugins.HttpTimeoutConfig> key;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.lang.Long getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.lang.Long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.lang.Long getHighSpeedVideoSizes;

    public /* synthetic */ HttpTimeoutConfig(java.lang.Long l, java.lang.Long l2, java.lang.Long l3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : l3);
    }

    public HttpTimeoutConfig(java.lang.Long l, java.lang.Long l2, java.lang.Long l3) {
        this.getHighSpeedVideoFpsRanges = 0L;
        this.getHighSpeedVideoFpsRangesFor = 0L;
        this.getHighSpeedVideoSizes = 0L;
        setRequestTimeoutMillis(l);
        setConnectTimeoutMillis(l2);
        setSocketTimeoutMillis(l3);
    }

    /* renamed from: getRequestTimeoutMillis, reason: from getter */
    public final java.lang.Long getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    /* renamed from: getConnectTimeoutMillis, reason: from getter */
    public final java.lang.Long getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: getSocketTimeoutMillis, reason: from getter */
    public final java.lang.Long getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        io.ktor.client.plugins.HttpTimeoutConfig httpTimeoutConfig = (io.ktor.client.plugins.HttpTimeoutConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, httpTimeoutConfig.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, httpTimeoutConfig.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, httpTimeoutConfig.getHighSpeedVideoSizes);
    }

    public final int hashCode() {
        java.lang.Long l = this.getHighSpeedVideoFpsRanges;
        int hashCode = l != null ? l.hashCode() : 0;
        java.lang.Long l2 = this.getHighSpeedVideoFpsRangesFor;
        int hashCode2 = l2 != null ? l2.hashCode() : 0;
        java.lang.Long l3 = this.getHighSpeedVideoSizes;
        return (((hashCode * 31) + hashCode2) * 31) + (l3 != null ? l3.hashCode() : 0);
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lio/ktor/client/plugins/HttpTimeoutConfig$Companion;", "", "<init>", "()V", "", "INFINITE_TIMEOUT_MS", "J", "Lio/ktor/util/AttributeKey;", "Lio/ktor/client/plugins/HttpTimeoutConfig;", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final io.ktor.util.AttributeKey<io.ktor.client.plugins.HttpTimeoutConfig> getKey() {
            return io.ktor.client.plugins.HttpTimeoutConfig.key;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        kotlin.reflect.KType kType = null;
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(io.ktor.client.plugins.HttpTimeoutConfig.class);
        try {
            kType = kotlin.jvm.internal.Reflection.typeOf(io.ktor.client.plugins.HttpTimeoutConfig.class);
        } catch (java.lang.Throwable unused) {
        }
        key = new io.ktor.util.AttributeKey<>("TimeoutConfiguration", new io.ktor.util.reflect.TypeInfo(orCreateKotlinClass, kType));
    }

    public final void setConnectTimeoutMillis(java.lang.Long l) {
        if (l != null && l.longValue() <= 0) {
            throw new java.lang.IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeoutConfig.INFINITE_TIMEOUT_MS".toString());
        }
        this.getHighSpeedVideoFpsRangesFor = l;
    }

    public final void setRequestTimeoutMillis(java.lang.Long l) {
        if (l != null && l.longValue() <= 0) {
            throw new java.lang.IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeoutConfig.INFINITE_TIMEOUT_MS".toString());
        }
        this.getHighSpeedVideoFpsRanges = l;
    }

    public final void setSocketTimeoutMillis(java.lang.Long l) {
        if (l != null && l.longValue() <= 0) {
            throw new java.lang.IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeoutConfig.INFINITE_TIMEOUT_MS".toString());
        }
        this.getHighSpeedVideoSizes = l;
    }
}
