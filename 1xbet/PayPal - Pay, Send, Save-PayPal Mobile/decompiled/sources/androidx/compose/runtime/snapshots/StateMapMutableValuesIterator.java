package androidx.compose.runtime.snapshots;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B5\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/runtime/snapshots/StateMapMutableValuesIterator;", "K", "V", "Landroidx/compose/runtime/snapshots/StateMapMutableIterator;", "", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "p0", "", "", "p1", "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;Ljava/util/Iterator;)V", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class StateMapMutableValuesIterator<K, V> extends androidx.compose.runtime.snapshots.StateMapMutableIterator<K, V> implements java.util.Iterator<V>, kotlin.jvm.internal.markers.KMutableIterator {
    public StateMapMutableValuesIterator(androidx.compose.runtime.snapshots.SnapshotStateMap<K, V> snapshotStateMap, java.util.Iterator<? extends java.util.Map.Entry<? extends K, ? extends V>> it) {
        super(snapshotStateMap, it);
    }

    @Override // java.util.Iterator
    public final V next() {
        java.util.Map.Entry<K, V> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges == null) {
            throw new java.lang.IllegalStateException();
        }
        getHighSpeedVideoFpsRangesFor();
        return highSpeedVideoFpsRanges.getValue();
    }
}
