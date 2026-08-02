package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [V] */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0004\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/collection/MutableValues$iterator$1;", "", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "remove", "()V", "", "current", com.visa.cbp.getEncExpo.warmup, "getCurrent", "()I", "setCurrent", "(I)V", "", "iterator", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MutableValues$iterator$1<V> implements java.util.Iterator<V>, kotlin.jvm.internal.markers.KMutableIterator {
    private int current = -1;
    final /* synthetic */ androidx.collection.MutableValues<K, V> getHighSpeedVideoFpsRangesFor;
    private final java.util.Iterator<java.lang.Integer> iterator;

    MutableValues$iterator$1(androidx.collection.MutableValues<K, V> mutableValues) {
        this.getHighSpeedVideoFpsRangesFor = mutableValues;
        this.iterator = kotlin.sequences.SequencesKt.iterator(new androidx.collection.MutableValues$iterator$1$iterator$1(mutableValues, null));
    }

    public final java.util.Iterator<java.lang.Integer> getIterator() {
        return this.iterator;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final void setCurrent(int i) {
        this.current = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public final V next() {
        androidx.collection.MutableScatterMap mutableScatterMap;
        this.current = this.iterator.next().intValue();
        mutableScatterMap = ((androidx.collection.MutableValues) this.getHighSpeedVideoFpsRangesFor).Camera2StreamConfigurationMap;
        return (V) mutableScatterMap.values[this.current];
    }

    @Override // java.util.Iterator
    public final void remove() {
        androidx.collection.MutableScatterMap mutableScatterMap;
        if (this.current >= 0) {
            mutableScatterMap = ((androidx.collection.MutableValues) this.getHighSpeedVideoFpsRangesFor).Camera2StreamConfigurationMap;
            mutableScatterMap.removeValueAt(this.current);
            this.current = -1;
        }
    }
}
