package androidx.compose.runtime.snapshots;

/* JADX INFO: Add missing generic type declarations: [V, K] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\b\n\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0017\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00028\u00008\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00028\u00018\u0017@\u0017X\u0097\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\"\u0004\b\u0003\u0010\u000b"}, d2 = {"Landroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "key", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getValue", "(Ljava/lang/Object;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StateMapMutableEntriesIterator$next$1<K, V> implements java.util.Map.Entry<K, V>, kotlin.jvm.internal.markers.KMutableMap.Entry {
    final /* synthetic */ androidx.compose.runtime.snapshots.StateMapMutableEntriesIterator<K, V> getHighSpeedVideoFpsRanges;
    private final K key;
    private V value;

    StateMapMutableEntriesIterator$next$1(androidx.compose.runtime.snapshots.StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator) {
        this.getHighSpeedVideoFpsRanges = stateMapMutableEntriesIterator;
        java.util.Map.Entry<? extends K, ? extends V> entry = stateMapMutableEntriesIterator.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(entry);
        this.key = entry.getKey();
        java.util.Map.Entry<? extends K, ? extends V> entry2 = stateMapMutableEntriesIterator.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(entry2);
        this.value = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public final void setValue(V v) {
        this.value = v;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V newValue) {
        int i;
        androidx.compose.runtime.snapshots.StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator = this.getHighSpeedVideoFpsRanges;
        androidx.compose.runtime.snapshots.StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator2 = stateMapMutableEntriesIterator;
        int modification$runtime = stateMapMutableEntriesIterator2.Camera2StreamConfigurationMap().getModification$runtime();
        i = stateMapMutableEntriesIterator2.getHighResolutionOutputSizeshNQ4ISI;
        if (modification$runtime == i) {
            V value = getValue();
            stateMapMutableEntriesIterator.Camera2StreamConfigurationMap().put(getKey(), newValue);
            setValue((androidx.compose.runtime.snapshots.StateMapMutableEntriesIterator$next$1<K, V>) newValue);
            return value;
        }
        throw new java.util.ConcurrentModificationException();
    }
}
