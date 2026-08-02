package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/sequences/SequencesKt__SequencesKt$sequenceOf$1$1;", "", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "hasNext", "()Z", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SequencesKt__SequencesKt$sequenceOf$1$1<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes = true;
    final /* synthetic */ T getHighSpeedVideoFpsRangesFor;

    SequencesKt__SequencesKt$sequenceOf$1$1(T t) {
        this.getHighSpeedVideoFpsRangesFor = t;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!this.getHighSpeedVideoSizes) {
            throw new java.util.NoSuchElementException();
        }
        this.getHighSpeedVideoSizes = false;
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
