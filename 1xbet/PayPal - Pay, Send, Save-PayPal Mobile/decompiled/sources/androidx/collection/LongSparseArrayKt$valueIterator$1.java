package androidx.collection;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r"}, d2 = {"Landroidx/collection/LongSparseArrayKt$valueIterator$1;", "", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "index", com.visa.cbp.getEncExpo.warmup, "getIndex", "()I", "setIndex", "(I)V"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LongSparseArrayKt$valueIterator$1<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {
    final /* synthetic */ androidx.collection.LongSparseArray<T> getHighSpeedVideoFpsRangesFor;
    private int index;

    LongSparseArrayKt$valueIterator$1(androidx.collection.LongSparseArray<T> longSparseArray) {
        this.getHighSpeedVideoFpsRangesFor = longSparseArray;
    }

    public final int getIndex() {
        return this.index;
    }

    public final void setIndex(int i) {
        this.index = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.index < this.getHighSpeedVideoFpsRangesFor.size();
    }

    @Override // java.util.Iterator
    public final T next() {
        androidx.collection.LongSparseArray<T> longSparseArray = this.getHighSpeedVideoFpsRangesFor;
        int i = this.index;
        this.index = i + 1;
        return longSparseArray.valueAt(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
