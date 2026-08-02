package androidx.navigation3.runtime;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\n\u001a\u00020\t\"\u000e\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00010\u0004\"\b\b\u0001\u0010\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/navigation3/runtime/MetadataScope;", "", "<init>", "()V", "Landroidx/navigation3/runtime/NavMetadataKey;", "K", "T", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "put", "(Landroidx/navigation3/runtime/NavMetadataKey;Ljava/lang/Object;)V", "", "", "build", "()Ljava/util/Map;", "", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
@androidx.navigation3.runtime.MetadataDsl
/* loaded from: classes7.dex */
public final class MetadataScope {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();

    public final <K extends androidx.navigation3.runtime.NavMetadataKey<T>, T> void put(K key, T value) {
        java.util.Map<java.lang.String, java.lang.Object> map = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String obj = key.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
        map.put(obj, value);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> build() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
