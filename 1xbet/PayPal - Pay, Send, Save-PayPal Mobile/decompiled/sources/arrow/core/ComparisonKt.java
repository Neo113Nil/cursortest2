package arrow.core;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0010\u000f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\u001a9\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aG\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\b\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\t\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\"\u00028\u0000¢\u0006\u0004\b\u0005\u0010\r\u001aG\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000ej\b\u0012\u0004\u0012\u00028\u0000`\u000f¢\u0006\u0004\b\u0005\u0010\u0011\u001aU\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u00002\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000ej\b\u0012\u0004\u0012\u00028\u0000`\u000f¢\u0006\u0004\b\u0005\u0010\u0012\u001aM\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n\"\u00028\u00002\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u000ej\b\u0012\u0004\u0012\u00028\u0000`\u000f¢\u0006\u0004\b\u0005\u0010\u0013\u001a)\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010\u0002\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0014¢\u0006\u0004\b\u0005\u0010\u0015\u001a7\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u0002\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0014¢\u0006\u0004\b\u0005\u0010\u0016\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010\u0002\u001a\u00020\u00142\n\u0010\u000b\u001a\u00020\u0017\"\u00020\u0014¢\u0006\u0004\b\u0005\u0010\u0018\u001a)\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00042\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0019¢\u0006\u0004\b\u0005\u0010\u001a\u001a7\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\b2\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0019¢\u0006\u0004\b\u0005\u0010\u001b\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010\u0002\u001a\u00020\u00192\n\u0010\u000b\u001a\u00020\u001c\"\u00020\u0019¢\u0006\u0004\b\u0005\u0010\u001d\u001a)\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\u00042\u0006\u0010\u0002\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001e¢\u0006\u0004\b\u0005\u0010\u001f\u001a7\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\b2\u0006\u0010\u0002\u001a\u00020\u001e2\u0006\u0010\u0003\u001a\u00020\u001e2\u0006\u0010\u0007\u001a\u00020\u001e¢\u0006\u0004\b\u0005\u0010 \u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u001e0\f2\u0006\u0010\u0002\u001a\u00020\u001e2\n\u0010\u000b\u001a\u00020!\"\u00020\u001e¢\u0006\u0004\b\u0005\u0010\"\u001a)\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0\u00042\u0006\u0010\u0002\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020#¢\u0006\u0004\b\u0005\u0010$\u001a7\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020#0\b2\u0006\u0010\u0002\u001a\u00020#2\u0006\u0010\u0003\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020#¢\u0006\u0004\b\u0005\u0010%\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020#0\f2\u0006\u0010\u0002\u001a\u00020#2\n\u0010\u000b\u001a\u00020&\"\u00020#¢\u0006\u0004\b\u0005\u0010'"}, d2 = {"", "A", "a", util.h.xy.cb.b.f1091, "Lkotlin/Pair;", "sort", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/Pair;", "c", "Lkotlin/Triple;", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/Triple;", "", "aas", "", "(Ljava/lang/Comparable;[Ljava/lang/Comparable;)Ljava/util/List;", "Ljava/util/Comparator;", "Lkotlin/getOutputStallDuration;", "comparator", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lkotlin/Pair;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lkotlin/Triple;", "(Ljava/lang/Object;[Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;", "", "(BB)Lkotlin/Pair;", "(BBB)Lkotlin/Triple;", "", "(B[B)Ljava/util/List;", "", "(SS)Lkotlin/Pair;", "(SSS)Lkotlin/Triple;", "", "(S[S)Ljava/util/List;", "", "(II)Lkotlin/Pair;", "(III)Lkotlin/Triple;", "", "(I[I)Ljava/util/List;", "", "(JJ)Lkotlin/Pair;", "(JJJ)Lkotlin/Triple;", "", "(J[J)Ljava/util/List;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ComparisonKt {
    public static final <A extends java.lang.Comparable<? super A>> kotlin.Pair<A, A> sort(A a2, A a3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a3, "");
        return a2.compareTo(a3) <= 0 ? new kotlin.Pair<>(a2, a3) : new kotlin.Pair<>(a3, a2);
    }

    public static final <A extends java.lang.Comparable<? super A>> kotlin.Triple<A, A, A> sort(A a2, A a3, A a4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a4, "");
        return a2.compareTo(a3) <= 0 ? a3.compareTo(a4) <= 0 ? new kotlin.Triple<>(a2, a3, a4) : a2.compareTo(a4) <= 0 ? new kotlin.Triple<>(a2, a4, a3) : new kotlin.Triple<>(a4, a2, a3) : a2.compareTo(a4) <= 0 ? new kotlin.Triple<>(a3, a2, a4) : a3.compareTo(a4) <= 0 ? new kotlin.Triple<>(a3, a4, a2) : new kotlin.Triple<>(a4, a3, a2);
    }

    public static final <A extends java.lang.Comparable<? super A>> java.util.List<A> sort(A a2, A... aArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aArr, "");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder(aArr.length + 1);
        createListBuilder.add(a2);
        kotlin.collections.CollectionsKt.addAll(createListBuilder, aArr);
        kotlin.collections.CollectionsKt.sort(createListBuilder);
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }

    public static final <A> java.util.List<A> sort(A a2, A[] aArr, java.util.Comparator<A> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder(aArr.length + 1);
        createListBuilder.add(a2);
        kotlin.collections.CollectionsKt.addAll(createListBuilder, aArr);
        kotlin.collections.CollectionsKt.sortWith(createListBuilder, comparator);
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }

    public static final kotlin.Pair<java.lang.Byte, java.lang.Byte> sort(byte b, byte b2) {
        java.lang.Byte valueOf = java.lang.Byte.valueOf(b);
        java.lang.Byte valueOf2 = java.lang.Byte.valueOf(b2);
        return valueOf.byteValue() <= valueOf2.byteValue() ? new kotlin.Pair<>(valueOf, valueOf2) : new kotlin.Pair<>(valueOf2, valueOf);
    }

    public static final kotlin.Triple<java.lang.Byte, java.lang.Byte, java.lang.Byte> sort(byte b, byte b2, byte b3) {
        java.lang.Byte valueOf = java.lang.Byte.valueOf(b);
        java.lang.Byte valueOf2 = java.lang.Byte.valueOf(b2);
        java.lang.Byte valueOf3 = java.lang.Byte.valueOf(b3);
        java.lang.Byte b4 = valueOf2;
        java.lang.Byte b5 = valueOf;
        if (b5.byteValue() <= b4.byteValue()) {
            java.lang.Byte b6 = valueOf3;
            if (b4.byteValue() <= b6.byteValue()) {
                return new kotlin.Triple<>(valueOf, valueOf2, valueOf3);
            }
            return b5.byteValue() <= b6.byteValue() ? new kotlin.Triple<>(valueOf, valueOf3, valueOf2) : new kotlin.Triple<>(valueOf3, valueOf, valueOf2);
        }
        java.lang.Byte b7 = valueOf3;
        if (b5.byteValue() <= b7.byteValue()) {
            return new kotlin.Triple<>(valueOf2, valueOf, valueOf3);
        }
        return b4.byteValue() <= b7.byteValue() ? new kotlin.Triple<>(valueOf2, valueOf3, valueOf) : new kotlin.Triple<>(valueOf3, valueOf2, valueOf);
    }

    public static final java.util.List<java.lang.Byte> sort(byte b, byte... bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        kotlin.jvm.internal.ByteSpreadBuilder byteSpreadBuilder = new kotlin.jvm.internal.ByteSpreadBuilder(2);
        byteSpreadBuilder.add(b);
        byteSpreadBuilder.addSpread(bArr);
        byte[] array = byteSpreadBuilder.toArray();
        kotlin.collections.ArraysKt.sort(array);
        return kotlin.collections.ArraysKt.asList(array);
    }

    public static final kotlin.Pair<java.lang.Short, java.lang.Short> sort(short s, short s2) {
        java.lang.Short valueOf = java.lang.Short.valueOf(s);
        java.lang.Short valueOf2 = java.lang.Short.valueOf(s2);
        return valueOf.shortValue() <= valueOf2.shortValue() ? new kotlin.Pair<>(valueOf, valueOf2) : new kotlin.Pair<>(valueOf2, valueOf);
    }

    public static final kotlin.Triple<java.lang.Short, java.lang.Short, java.lang.Short> sort(short s, short s2, short s3) {
        java.lang.Short valueOf = java.lang.Short.valueOf(s);
        java.lang.Short valueOf2 = java.lang.Short.valueOf(s2);
        java.lang.Short valueOf3 = java.lang.Short.valueOf(s3);
        java.lang.Short sh = valueOf2;
        java.lang.Short sh2 = valueOf;
        if (sh2.shortValue() <= sh.shortValue()) {
            java.lang.Short sh3 = valueOf3;
            if (sh.shortValue() <= sh3.shortValue()) {
                return new kotlin.Triple<>(valueOf, valueOf2, valueOf3);
            }
            return sh2.shortValue() <= sh3.shortValue() ? new kotlin.Triple<>(valueOf, valueOf3, valueOf2) : new kotlin.Triple<>(valueOf3, valueOf, valueOf2);
        }
        java.lang.Short sh4 = valueOf3;
        if (sh2.shortValue() <= sh4.shortValue()) {
            return new kotlin.Triple<>(valueOf2, valueOf, valueOf3);
        }
        return sh.shortValue() <= sh4.shortValue() ? new kotlin.Triple<>(valueOf2, valueOf3, valueOf) : new kotlin.Triple<>(valueOf3, valueOf2, valueOf);
    }

    public static final java.util.List<java.lang.Short> sort(short s, short... sArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sArr, "");
        kotlin.jvm.internal.ShortSpreadBuilder shortSpreadBuilder = new kotlin.jvm.internal.ShortSpreadBuilder(2);
        shortSpreadBuilder.add(s);
        shortSpreadBuilder.addSpread(sArr);
        short[] array = shortSpreadBuilder.toArray();
        kotlin.collections.ArraysKt.sort(array);
        return kotlin.collections.ArraysKt.asList(array);
    }

    public static final kotlin.Pair<java.lang.Integer, java.lang.Integer> sort(int i, int i2) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i2);
        return valueOf.intValue() <= valueOf2.intValue() ? new kotlin.Pair<>(valueOf, valueOf2) : new kotlin.Pair<>(valueOf2, valueOf);
    }

    public static final kotlin.Triple<java.lang.Integer, java.lang.Integer, java.lang.Integer> sort(int i, int i2, int i3) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i2);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i3);
        java.lang.Integer num = valueOf2;
        java.lang.Integer num2 = valueOf;
        if (num2.intValue() <= num.intValue()) {
            java.lang.Integer num3 = valueOf3;
            if (num.intValue() <= num3.intValue()) {
                return new kotlin.Triple<>(valueOf, valueOf2, valueOf3);
            }
            return num2.intValue() <= num3.intValue() ? new kotlin.Triple<>(valueOf, valueOf3, valueOf2) : new kotlin.Triple<>(valueOf3, valueOf, valueOf2);
        }
        java.lang.Integer num4 = valueOf3;
        if (num2.intValue() <= num4.intValue()) {
            return new kotlin.Triple<>(valueOf2, valueOf, valueOf3);
        }
        return num.intValue() <= num4.intValue() ? new kotlin.Triple<>(valueOf2, valueOf3, valueOf) : new kotlin.Triple<>(valueOf3, valueOf2, valueOf);
    }

    public static final java.util.List<java.lang.Integer> sort(int i, int... iArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        kotlin.jvm.internal.IntSpreadBuilder intSpreadBuilder = new kotlin.jvm.internal.IntSpreadBuilder(2);
        intSpreadBuilder.add(i);
        intSpreadBuilder.addSpread(iArr);
        int[] array = intSpreadBuilder.toArray();
        kotlin.collections.ArraysKt.sort(array);
        return kotlin.collections.ArraysKt.asList(array);
    }

    public static final kotlin.Pair<java.lang.Long, java.lang.Long> sort(long j, long j2) {
        java.lang.Long valueOf = java.lang.Long.valueOf(j);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(j2);
        return valueOf.longValue() <= valueOf2.longValue() ? new kotlin.Pair<>(valueOf, valueOf2) : new kotlin.Pair<>(valueOf2, valueOf);
    }

    public static final kotlin.Triple<java.lang.Long, java.lang.Long, java.lang.Long> sort(long j, long j2, long j3) {
        java.lang.Long valueOf = java.lang.Long.valueOf(j);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(j2);
        java.lang.Long valueOf3 = java.lang.Long.valueOf(j3);
        java.lang.Long l = valueOf2;
        java.lang.Long l2 = valueOf;
        if (l2.longValue() <= l.longValue()) {
            java.lang.Long l3 = valueOf3;
            if (l.longValue() <= l3.longValue()) {
                return new kotlin.Triple<>(valueOf, valueOf2, valueOf3);
            }
            return l2.longValue() <= l3.longValue() ? new kotlin.Triple<>(valueOf, valueOf3, valueOf2) : new kotlin.Triple<>(valueOf3, valueOf, valueOf2);
        }
        java.lang.Long l4 = valueOf3;
        if (l2.longValue() <= l4.longValue()) {
            return new kotlin.Triple<>(valueOf2, valueOf, valueOf3);
        }
        return l.longValue() <= l4.longValue() ? new kotlin.Triple<>(valueOf2, valueOf3, valueOf) : new kotlin.Triple<>(valueOf3, valueOf2, valueOf);
    }

    public static final java.util.List<java.lang.Long> sort(long j, long... jArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jArr, "");
        kotlin.jvm.internal.LongSpreadBuilder longSpreadBuilder = new kotlin.jvm.internal.LongSpreadBuilder(2);
        longSpreadBuilder.add(j);
        longSpreadBuilder.addSpread(jArr);
        long[] array = longSpreadBuilder.toArray();
        kotlin.collections.ArraysKt.sort(array);
        return kotlin.collections.ArraysKt.asList(array);
    }

    public static final <A> kotlin.Pair<A, A> sort(A a2, A a3, java.util.Comparator<A> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        return comparator.compare(a2, a3) <= 0 ? new kotlin.Pair<>(a2, a3) : new kotlin.Pair<>(a3, a2);
    }

    public static final <A> kotlin.Triple<A, A, A> sort(A a2, A a3, A a4, java.util.Comparator<A> comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "");
        if (comparator.compare(a2, a3) <= 0) {
            if (comparator.compare(a3, a4) <= 0) {
                return new kotlin.Triple<>(a2, a3, a4);
            }
            if (comparator.compare(a2, a4) <= 0) {
                return new kotlin.Triple<>(a2, a4, a3);
            }
            return new kotlin.Triple<>(a4, a2, a3);
        }
        if (comparator.compare(a2, a4) <= 0) {
            return new kotlin.Triple<>(a3, a2, a4);
        }
        if (comparator.compare(a3, a4) <= 0) {
            return new kotlin.Triple<>(a3, a4, a2);
        }
        return new kotlin.Triple<>(a4, a3, a2);
    }
}
