package arrow.core;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001aL\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0004\u001a\u00028\u0002H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a^\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\b*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0003H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\n\u001ap\u0010\u0006\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\b\"\u0004\b\u0004\u0010\u000b*\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\t2\u0006\u0010\u0004\u001a\u00028\u0004H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\r\u001a\u0082\u0001\u0010\u0006\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u000f\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\b\"\u0004\b\u0004\u0010\u000b\"\u0004\b\u0005\u0010\u000e* \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\f2\u0006\u0010\u0004\u001a\u00028\u0005H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0010\u001a\u0094\u0001\u0010\u0006\u001a,\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060\u0012\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\b\"\u0004\b\u0004\u0010\u000b\"\u0004\b\u0005\u0010\u000e\"\u0004\b\u0006\u0010\u0011*&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u000f2\u0006\u0010\u0004\u001a\u00028\u0006H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0013\u001a¦\u0001\u0010\u0006\u001a2\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u0015\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\b\"\u0004\b\u0004\u0010\u000b\"\u0004\b\u0005\u0010\u000e\"\u0004\b\u0006\u0010\u0011\"\u0004\b\u0007\u0010\u0014*,\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00060\u00122\u0006\u0010\u0004\u001a\u00028\u0007H\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0016\u001a¸\u0001\u0010\u0006\u001a8\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b0\u0018\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\b\"\u0004\b\u0004\u0010\u000b\"\u0004\b\u0005\u0010\u000e\"\u0004\b\u0006\u0010\u0011\"\u0004\b\u0007\u0010\u0014\"\u0004\b\b\u0010\u0017*2\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u00152\u0006\u0010\u0004\u001a\u00028\bH\u0086\u0002¢\u0006\u0004\b\u0006\u0010\u0019\u001a\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001b\u0010\u001c"}, d2 = {"A", "B", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "Lkotlin/Pair;", "p0", "Lkotlin/Triple;", "plus", "(Lkotlin/Pair;Ljava/lang/Object;)Lkotlin/Triple;", "D", "Larrow/core/Tuple4;", "(Lkotlin/Triple;Ljava/lang/Object;)Larrow/core/Tuple4;", "E", "Larrow/core/Tuple5;", "(Larrow/core/Tuple4;Ljava/lang/Object;)Larrow/core/Tuple5;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "Larrow/core/Tuple6;", "(Larrow/core/Tuple5;Ljava/lang/Object;)Larrow/core/Tuple6;", "G", "Larrow/core/Tuple7;", "(Larrow/core/Tuple6;Ljava/lang/Object;)Larrow/core/Tuple7;", "H", "Larrow/core/Tuple8;", "(Larrow/core/Tuple7;Ljava/lang/Object;)Larrow/core/Tuple8;", com.visa.cbp.getEncExpo.warmup, "Larrow/core/Tuple9;", "(Larrow/core/Tuple8;Ljava/lang/Object;)Larrow/core/Tuple9;", "", "mapCapacity", "(I)I"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "arrow/core/TupleNKt")
/* loaded from: classes7.dex */
final /* synthetic */ class TupleNKt__TupleNKt {
    public static final <A, B, C> kotlin.Triple<A, B, C> plus(kotlin.Pair<? extends A, ? extends B> pair, C c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        return new kotlin.Triple<>(pair.getFirst(), pair.getSecond(), c);
    }

    public static final <A, B, C, D> arrow.core.Tuple4<A, B, C, D> plus(kotlin.Triple<? extends A, ? extends B, ? extends C> triple, D d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(triple, "");
        return new arrow.core.Tuple4<>(triple.getFirst(), triple.getSecond(), triple.getThird(), d);
    }

    public static final <A, B, C, D, E> arrow.core.Tuple5<A, B, C, D, E> plus(arrow.core.Tuple4<? extends A, ? extends B, ? extends C, ? extends D> tuple4, E e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tuple4, "");
        return new arrow.core.Tuple5<>(tuple4.getFirst(), tuple4.getSecond(), tuple4.getThird(), tuple4.getFourth(), e);
    }

    public static final <A, B, C, D, E, F> arrow.core.Tuple6<A, B, C, D, E, F> plus(arrow.core.Tuple5<? extends A, ? extends B, ? extends C, ? extends D, ? extends E> tuple5, F f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tuple5, "");
        return new arrow.core.Tuple6<>(tuple5.getFirst(), tuple5.getSecond(), tuple5.getThird(), tuple5.getFourth(), tuple5.getFifth(), f);
    }

    public static final <A, B, C, D, E, F, G> arrow.core.Tuple7<A, B, C, D, E, F, G> plus(arrow.core.Tuple6<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends F> tuple6, G g) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tuple6, "");
        return new arrow.core.Tuple7<>(tuple6.getFirst(), tuple6.getSecond(), tuple6.getThird(), tuple6.getFourth(), tuple6.getFifth(), tuple6.getSixth(), g);
    }

    public static final <A, B, C, D, E, F, G, H> arrow.core.Tuple8<A, B, C, D, E, F, G, H> plus(arrow.core.Tuple7<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends F, ? extends G> tuple7, H h) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tuple7, "");
        return new arrow.core.Tuple8<>(tuple7.getFirst(), tuple7.getSecond(), tuple7.getThird(), tuple7.getFourth(), tuple7.getFifth(), tuple7.getSixth(), tuple7.getSeventh(), h);
    }

    public static final <A, B, C, D, E, F, G, H, I> arrow.core.Tuple9<A, B, C, D, E, F, G, H, I> plus(arrow.core.Tuple8<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends F, ? extends G, ? extends H> tuple8, I i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tuple8, "");
        return new arrow.core.Tuple9<>(tuple8.getFirst(), tuple8.getSecond(), tuple8.getThird(), tuple8.getFourth(), tuple8.getFifth(), tuple8.getSixth(), tuple8.getSeventh(), tuple8.getEighth(), i);
    }

    public static final int mapCapacity(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return i + (i / 3);
        }
        return Integer.MAX_VALUE;
    }
}
