package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B/\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\r\u001a\u00020\f2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0014J\u0010\u0010\u0015\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0012\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0016\u0010\u0017\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "", "", "root", "", "index", io.ktor.http.ContentDisposition.Parameters.Size, "height", "<init>", "([Ljava/lang/Object;III)V", "", "reset$runtime", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(II)V", "getHighSpeedVideoFpsRangesFor", "(I)V", "()Ljava/lang/Object;", io.ktor.http.LinkHeader.Rel.Next, "previous", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "[Ljava/lang/Object;", "", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrieIterator<E> extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator<E> {
    public static final int $stable = 8;
    private java.lang.Object[] getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public TrieIterator(java.lang.Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.getHighSpeedVideoFpsRangesFor = i3;
        java.lang.Object[] objArr2 = new java.lang.Object[i3];
        this.getHighResolutionOutputSizeshNQ4ISI = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.getHighSpeedVideoSizes = r5;
        objArr2[0] = objArr;
        getHighResolutionOutputSizeshNQ4ISI(i - r5, 1);
    }

    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public final void reset$runtime(java.lang.Object[] root, int index, int size, int height) {
        setIndex(index);
        setSize(size);
        this.getHighSpeedVideoFpsRangesFor = height;
        if (this.getHighResolutionOutputSizeshNQ4ISI.length < height) {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object[height];
        }
        this.getHighResolutionOutputSizeshNQ4ISI[0] = root;
        ?? r0 = index == size ? 1 : 0;
        this.getHighSpeedVideoSizes = r0;
        getHighResolutionOutputSizeshNQ4ISI(index - r0, 1);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(int p0, int p1) {
        int i = (this.getHighSpeedVideoFpsRangesFor - p1) * 5;
        while (p1 < this.getHighSpeedVideoFpsRangesFor) {
            java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
            java.lang.Object obj = objArr[p1 - 1];
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            objArr[p1] = ((java.lang.Object[]) obj)[androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(p0, i)];
            i -= 5;
            p1++;
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(int p0) {
        int i = 0;
        while (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(getIndex(), i) == p0) {
            i += 5;
        }
        if (i > 0) {
            getHighResolutionOutputSizeshNQ4ISI(getIndex(), ((this.getHighSpeedVideoFpsRangesFor - 1) - (i / 5)) + 1);
        }
    }

    private final E getHighResolutionOutputSizeshNQ4ISI() {
        int index = getIndex();
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI[this.getHighSpeedVideoFpsRangesFor - 1];
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return (E) ((java.lang.Object[]) obj)[index & 31];
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        E highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        setIndex(getIndex() + 1);
        if (getIndex() == getSize()) {
            this.getHighSpeedVideoSizes = true;
            return highResolutionOutputSizeshNQ4ISI;
        }
        getHighSpeedVideoFpsRangesFor(0);
        return highResolutionOutputSizeshNQ4ISI;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        setIndex(getIndex() - 1);
        if (this.getHighSpeedVideoSizes) {
            this.getHighSpeedVideoSizes = false;
            return getHighResolutionOutputSizeshNQ4ISI();
        }
        getHighSpeedVideoFpsRangesFor(31);
        return getHighResolutionOutputSizeshNQ4ISI();
    }
}
