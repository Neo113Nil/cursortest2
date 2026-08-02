package arrow.core;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a¨\u0001\u0010\t\u001a\u00020\b\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u000e\b\u0002\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00020\u0000\"\u000e\b\u0003\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00030\u0000\"\u000e\b\u0004\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00040\u0000* \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00062$\u0010\u0007\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "A", "B", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "D", "E", "Larrow/core/Tuple5;", "p0", "", "compareTo", "(Larrow/core/Tuple5;Larrow/core/Tuple5;)I"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "arrow/core/TupleNKt")
/* loaded from: classes7.dex */
final /* synthetic */ class TupleNKt__Tuple5Kt {
    public static final <A extends java.lang.Comparable<? super A>, B extends java.lang.Comparable<? super B>, C extends java.lang.Comparable<? super C>, D extends java.lang.Comparable<? super D>, E extends java.lang.Comparable<? super E>> int compareTo(arrow.core.Tuple5<? extends A, ? extends B, ? extends C, ? extends D, ? extends E> tuple5, arrow.core.Tuple5<? extends A, ? extends B, ? extends C, ? extends D, ? extends E> tuple52) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tuple5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tuple52, "");
        int compareTo = tuple5.getFirst().compareTo(tuple52.getFirst());
        return (compareTo == 0 && (compareTo = tuple5.getSecond().compareTo(tuple52.getSecond())) == 0 && (compareTo = tuple5.getThird().compareTo(tuple52.getThird())) == 0 && (compareTo = tuple5.getFourth().compareTo(tuple52.getFourth())) == 0) ? tuple5.getFifth().compareTo(tuple52.getFifth()) : compareTo;
    }
}
