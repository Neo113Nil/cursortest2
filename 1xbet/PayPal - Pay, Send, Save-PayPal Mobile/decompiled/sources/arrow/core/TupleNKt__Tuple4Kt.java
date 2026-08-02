package arrow.core;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u008c\u0001\u0010\b\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020\u0000\"\u000e\b\u0003\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00030\u0000*\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00052\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005H\u0086\u0002¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "A", "B", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "D", "Larrow/core/Tuple4;", "p0", "", "compareTo", "(Larrow/core/Tuple4;Larrow/core/Tuple4;)I"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "arrow/core/TupleNKt")
/* loaded from: classes7.dex */
final /* synthetic */ class TupleNKt__Tuple4Kt {
    public static final <A extends java.lang.Comparable<? super A>, B extends java.lang.Comparable<? super B>, C extends java.lang.Comparable<? super C>, D extends java.lang.Comparable<? super D>> int compareTo(arrow.core.Tuple4<? extends A, ? extends B, ? extends C, ? extends D> tuple4, arrow.core.Tuple4<? extends A, ? extends B, ? extends C, ? extends D> tuple42) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tuple4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tuple42, "");
        int compareTo = tuple4.getFirst().compareTo(tuple42.getFirst());
        return (compareTo == 0 && (compareTo = tuple4.getSecond().compareTo(tuple42.getSecond())) == 0 && (compareTo = tuple4.getThird().compareTo(tuple42.getThird())) == 0) ? tuple4.getFourth().compareTo(tuple42.getFourth()) : compareTo;
    }
}
