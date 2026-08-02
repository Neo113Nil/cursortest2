package kotlinx.datetime.internal.format;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlinx/datetime/internal/format/ConjunctionPredicate;", "T", "Lkotlinx/datetime/internal/format/Predicate;", "", "p0", "<init>", "(Ljava/util/List;)V", "", "test", "(Ljava/lang/Object;)Z", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ConjunctionPredicate<T> implements kotlinx.datetime.internal.format.Predicate<T> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<kotlinx.datetime.internal.format.Predicate<T>> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public ConjunctionPredicate(java.util.List<? extends kotlinx.datetime.internal.format.Predicate<? super T>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.getHighSpeedVideoSizes = list;
    }

    @Override // kotlinx.datetime.internal.format.Predicate
    public final boolean test(T p0) {
        java.util.List<kotlinx.datetime.internal.format.Predicate<T>> list = this.getHighSpeedVideoSizes;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((kotlinx.datetime.internal.format.Predicate) it.next()).test(p0)) {
                return false;
            }
        }
        return true;
    }
}
