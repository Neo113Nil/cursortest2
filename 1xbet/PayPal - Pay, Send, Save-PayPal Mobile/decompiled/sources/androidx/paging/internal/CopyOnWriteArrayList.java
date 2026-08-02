package androidx.paging.internal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\bJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/paging/internal/CopyOnWriteArrayList;", "T", "", "<init>", "()V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Z", "remove", "", "iterator", "()Ljava/util/Iterator;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CopyOnWriteArrayList<T> implements java.lang.Iterable<T>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.concurrent.CopyOnWriteArrayList<T> Camera2StreamConfigurationMap = new java.util.concurrent.CopyOnWriteArrayList<>();

    public final boolean add(T value) {
        return this.Camera2StreamConfigurationMap.add(value);
    }

    public final boolean remove(T value) {
        return this.Camera2StreamConfigurationMap.remove(value);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        java.util.Iterator<T> it = this.Camera2StreamConfigurationMap.iterator();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
        return it;
    }
}
