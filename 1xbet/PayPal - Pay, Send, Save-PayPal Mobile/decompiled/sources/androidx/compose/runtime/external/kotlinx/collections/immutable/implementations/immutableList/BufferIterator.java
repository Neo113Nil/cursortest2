package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\u000bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/BufferIterator;", "T", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "", "buffer", "", "index", io.ktor.http.ContentDisposition.Parameters.Size, "<init>", "([Ljava/lang/Object;II)V", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "previous", "getHighSpeedVideoFpsRanges", "[Ljava/lang/Object;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BufferIterator<T> extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator<T> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final T[] Camera2StreamConfigurationMap;

    public BufferIterator(T[] tArr, int i, int i2) {
        super(i, i2);
        this.Camera2StreamConfigurationMap = tArr;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        T[] tArr = this.Camera2StreamConfigurationMap;
        int index = getIndex();
        setIndex(index + 1);
        return tArr[index];
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        T[] tArr = this.Camera2StreamConfigurationMap;
        setIndex(getIndex() - 1);
        return tArr[getIndex()];
    }
}
