package kotlin.comparisons;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u0007\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002`\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lkotlin/comparisons/ReverseOrderComparator;", "Ljava/util/Comparator;", "", "", "Lkotlin/getOutputStallDuration;", "<init>", "()V", "reversed", "()Ljava/util/Comparator;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class ReverseOrderComparator implements java.util.Comparator<java.lang.Comparable<? super java.lang.Object>> {
    public static final kotlin.comparisons.ReverseOrderComparator INSTANCE = new kotlin.comparisons.ReverseOrderComparator();

    private ReverseOrderComparator() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Comparable<? super java.lang.Object> comparable, java.lang.Comparable<? super java.lang.Object> comparable2) {
        java.lang.Comparable<? super java.lang.Object> comparable3 = comparable;
        java.lang.Comparable<? super java.lang.Object> comparable4 = comparable2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparable3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparable4, "");
        return comparable4.compareTo(comparable3);
    }

    @Override // java.util.Comparator
    public final java.util.Comparator<java.lang.Comparable<? super java.lang.Object>> reversed() {
        return kotlin.comparisons.NaturalOrderComparator.INSTANCE;
    }
}
