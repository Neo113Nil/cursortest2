package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B=\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorIterator;", "T", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "", "", "root", "tail", "", "index", io.ktor.http.ContentDisposition.Parameters.Size, "trieHeight", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;III)V", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "previous", "getHighSpeedVideoFpsRanges", "[Ljava/lang/Object;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersistentVectorIterator<T> extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator<T> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator<T> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final T[] getHighSpeedVideoSizes;

    public PersistentVectorIterator(java.lang.Object[] objArr, T[] tArr, int i, int i2, int i3) {
        super(i, i2);
        this.getHighSpeedVideoSizes = tArr;
        int rootSize = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(i2);
        this.getHighSpeedVideoFpsRanges = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator<>(objArr, kotlin.ranges.RangesKt.coerceAtMost(i, rootSize), rootSize, i3);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public final T next() {
        checkHasNext$runtime();
        if (this.getHighSpeedVideoFpsRanges.hasNext()) {
            setIndex(getIndex() + 1);
            return this.getHighSpeedVideoFpsRanges.next();
        }
        T[] tArr = this.getHighSpeedVideoSizes;
        int index = getIndex();
        setIndex(index + 1);
        return tArr[index - this.getHighSpeedVideoFpsRanges.getSize()];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        checkHasPrevious$runtime();
        if (getIndex() > this.getHighSpeedVideoFpsRanges.getSize()) {
            T[] tArr = this.getHighSpeedVideoSizes;
            setIndex(getIndex() - 1);
            return tArr[getIndex() - this.getHighSpeedVideoFpsRanges.getSize()];
        }
        setIndex(getIndex() - 1);
        return this.getHighSpeedVideoFpsRanges.previous();
    }
}
