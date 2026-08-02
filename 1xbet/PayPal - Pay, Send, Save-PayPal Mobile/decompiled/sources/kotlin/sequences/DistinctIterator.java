package kotlin.sequences;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0012j\b\u0012\u0004\u0012\u00028\u0001`\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0014"}, d2 = {"Lkotlin/sequences/DistinctIterator;", "T", "K", "Lkotlin/collections/AbstractIterator;", "", "p0", "Lkotlin/Function1;", "p1", "<init>", "(Ljava/util/Iterator;Lkotlin/jvm/functions/Function1;)V", "", "computeNext", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Iterator;", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/HashSet;", "Lkotlin/collections/getHighSpeedVideoSizesFor;", "Ljava/util/HashSet;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class DistinctIterator<T, K> extends kotlin.collections.AbstractIterator<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<T, K> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Iterator<T> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.HashSet<K> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctIterator(java.util.Iterator<? extends T> it, kotlin.jvm.functions.Function1<? super T, ? extends K> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.Camera2StreamConfigurationMap = it;
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoSizes = new java.util.HashSet<>();
    }

    @Override // kotlin.collections.AbstractIterator
    public final void computeNext() {
        while (this.Camera2StreamConfigurationMap.hasNext()) {
            T next = this.Camera2StreamConfigurationMap.next();
            if (this.getHighSpeedVideoSizes.add(this.getHighSpeedVideoFpsRangesFor.invoke(next))) {
                setNext(next);
                return;
            }
        }
        done();
    }
}
