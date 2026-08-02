package arrow.core;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001ap\u0010\u0007\u001a\u00020\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020\u0000*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "A", "B", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "Lkotlin/Triple;", "p0", "", "compareTo", "(Lkotlin/Triple;Lkotlin/Triple;)I"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "arrow/core/TupleNKt")
/* loaded from: classes7.dex */
final /* synthetic */ class TupleNKt__TripleKt {
    public static final <A extends java.lang.Comparable<? super A>, B extends java.lang.Comparable<? super B>, C extends java.lang.Comparable<? super C>> int compareTo(kotlin.Triple<? extends A, ? extends B, ? extends C> triple, kotlin.Triple<? extends A, ? extends B, ? extends C> triple2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(triple, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(triple2, "");
        int compareTo = triple.getFirst().compareTo(triple2.getFirst());
        return (compareTo == 0 && (compareTo = triple.getSecond().compareTo(triple2.getSecond())) == 0) ? triple.getThird().compareTo(triple2.getThird()) : compareTo;
    }
}
