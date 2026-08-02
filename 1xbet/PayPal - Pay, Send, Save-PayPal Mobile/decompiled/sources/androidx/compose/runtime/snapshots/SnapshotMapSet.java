package androidx.compose.runtime.snapshots;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotMapSet;", "K", "V", "E", "", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "p0", "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "", "clear", "()V", "", "isEmpty", "()Z", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "getHighSpeedVideoFpsRangesFor", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "getHighResolutionOutputSizeshNQ4ISI", "", "()I", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
abstract class SnapshotMapSet<K, V, E> implements java.util.Set<E>, kotlin.jvm.internal.markers.KMutableSet {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> getHighResolutionOutputSizeshNQ4ISI;

    public SnapshotMapSet(androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> snapshotStateMap) {
        this.getHighResolutionOutputSizeshNQ4ISI = snapshotStateMap;
    }

    public final androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> getHighSpeedVideoFpsRangesFor() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return getHighResolutionOutputSizeshNQ4ISI();
    }

    private int getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI.size();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }
}
