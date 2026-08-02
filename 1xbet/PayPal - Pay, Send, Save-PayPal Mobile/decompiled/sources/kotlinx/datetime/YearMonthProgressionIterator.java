package kotlinx.datetime;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlinx/datetime/YearMonthProgressionIterator;", "", "Lkotlinx/datetime/YearMonth;", "Lkotlin/collections/LongIterator;", "p0", "<init>", "(Lkotlin/collections/LongIterator;)V", "", "hasNext", "()Z", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/collections/LongIterator;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class YearMonthProgressionIterator implements java.util.Iterator<kotlinx.datetime.YearMonth>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.collections.LongIterator Camera2StreamConfigurationMap;

    public YearMonthProgressionIterator(kotlin.collections.LongIterator longIterator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longIterator, "");
        this.Camera2StreamConfigurationMap = longIterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Camera2StreamConfigurationMap.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ kotlinx.datetime.YearMonth next() {
        return kotlinx.datetime.YearMonthKt.fromProlepticMonth(kotlinx.datetime.YearMonth.INSTANCE, this.Camera2StreamConfigurationMap.nextLong());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
