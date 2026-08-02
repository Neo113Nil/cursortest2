package kotlin.comparisons;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003B\u001f\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u0003¢\u0006\u0004\b\u000b\u0010\fR!\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0002j\b\u0012\u0004\u0012\u00028\u0000`\u00038\u0007¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lkotlin/comparisons/ReversedComparator;", "T", "Ljava/util/Comparator;", "Lkotlin/getOutputStallDuration;", "p0", "<init>", "(Ljava/util/Comparator;)V", "p1", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "reversed", "()Ljava/util/Comparator;", "Camera2StreamConfigurationMap", "Ljava/util/Comparator;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ReversedComparator<T> implements java.util.Comparator<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final java.util.Comparator<T> getHighResolutionOutputSizeshNQ4ISI;

    public ReversedComparator(java.util.Comparator<T> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        this.getHighResolutionOutputSizeshNQ4ISI = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(T p0, T p1) {
        return this.getHighResolutionOutputSizeshNQ4ISI.compare(p1, p0);
    }

    @Override // java.util.Comparator
    public final java.util.Comparator<T> reversed() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
