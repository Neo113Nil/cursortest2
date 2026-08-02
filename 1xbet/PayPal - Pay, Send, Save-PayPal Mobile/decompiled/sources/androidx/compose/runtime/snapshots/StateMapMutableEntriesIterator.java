package androidx.compose.runtime.snapshots;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B5\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator;", "K", "V", "Landroidx/compose/runtime/snapshots/StateMapMutableIterator;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "p0", "", "", "p1", "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;Ljava/util/Iterator;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class StateMapMutableEntriesIterator<K, V> extends androidx.compose.runtime.snapshots.StateMapMutableIterator<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>>, kotlin.jvm.internal.markers.KMutableIterator {
    public StateMapMutableEntriesIterator(androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> snapshotStateMap, java.util.Iterator<? extends java.util.Map.Entry<? extends K, ? extends V>> it) {
        super(snapshotStateMap, it);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.Object next() {
        getHighSpeedVideoFpsRangesFor();
        if (this.getHighSpeedVideoSizes != null) {
            return new androidx.compose.runtime.snapshots.StateMapMutableEntriesIterator$next$1(this);
        }
        throw new java.lang.IllegalStateException();
    }
}
