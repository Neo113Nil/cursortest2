package kotlin.streams.jdk8;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\u001a#\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002*\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\u0002*\u00020\b¢\u0006\u0004\b\u0003\u0010\n\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\f0\u0002*\u00020\u000b¢\u0006\u0004\b\u0003\u0010\r\u001a#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010*\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0013\u001a\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0010*\u00020\b¢\u0006\u0004\b\u0011\u0010\u0014\u001a\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010*\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0015"}, d2 = {"T", "Ljava/util/stream/Stream;", "Lkotlin/sequences/Sequence;", "asSequence", "(Ljava/util/stream/Stream;)Lkotlin/sequences/Sequence;", "Ljava/util/stream/IntStream;", "", "(Ljava/util/stream/IntStream;)Lkotlin/sequences/Sequence;", "Ljava/util/stream/LongStream;", "", "(Ljava/util/stream/LongStream;)Lkotlin/sequences/Sequence;", "Ljava/util/stream/DoubleStream;", "", "(Ljava/util/stream/DoubleStream;)Lkotlin/sequences/Sequence;", "asStream", "(Lkotlin/sequences/Sequence;)Ljava/util/stream/Stream;", "", "toList", "(Ljava/util/stream/Stream;)Ljava/util/List;", "(Ljava/util/stream/IntStream;)Ljava/util/List;", "(Ljava/util/stream/LongStream;)Ljava/util/List;", "(Ljava/util/stream/DoubleStream;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, pn = "", xi = 48)
/* loaded from: classes17.dex */
public final class StreamsKt {
    public static final <T> kotlin.sequences.Sequence<T> asSequence(final java.util.stream.Stream<T> stream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stream, "");
        return new kotlin.sequences.Sequence<T>() { // from class: kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public final java.util.Iterator<T> iterator() {
                java.util.Iterator<T> it = stream.iterator();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
                return it;
            }
        };
    }

    public static final kotlin.sequences.Sequence<java.lang.Integer> asSequence(final java.util.stream.IntStream intStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intStream, "");
        return new kotlin.sequences.Sequence<java.lang.Integer>() { // from class: kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$2
            @Override // kotlin.sequences.Sequence
            public final java.util.Iterator<java.lang.Integer> iterator() {
                java.util.Iterator<java.lang.Integer> it = intStream.iterator();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
                return it;
            }
        };
    }

    public static final kotlin.sequences.Sequence<java.lang.Long> asSequence(final java.util.stream.LongStream longStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longStream, "");
        return new kotlin.sequences.Sequence<java.lang.Long>() { // from class: kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$3
            @Override // kotlin.sequences.Sequence
            public final java.util.Iterator<java.lang.Long> iterator() {
                java.util.Iterator<java.lang.Long> it = longStream.iterator();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
                return it;
            }
        };
    }

    public static final kotlin.sequences.Sequence<java.lang.Double> asSequence(final java.util.stream.DoubleStream doubleStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(doubleStream, "");
        return new kotlin.sequences.Sequence<java.lang.Double>() { // from class: kotlin.streams.jdk8.StreamsKt$asSequence$$inlined$Sequence$4
            @Override // kotlin.sequences.Sequence
            public final java.util.Iterator<java.lang.Double> iterator() {
                java.util.Iterator<java.lang.Double> it = doubleStream.iterator();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(it, "");
                return it;
            }
        };
    }

    public static final <T> java.util.stream.Stream<T> asStream(final kotlin.sequences.Sequence<? extends T> sequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sequence, "");
        java.util.stream.Stream<T> stream = java.util.stream.StreamSupport.stream(new java.util.function.Supplier() { // from class: kotlin.streams.jdk8.StreamsKt$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final java.lang.Object get() {
                java.util.Spliterator spliteratorUnknownSize;
                spliteratorUnknownSize = java.util.Spliterators.spliteratorUnknownSize(kotlin.sequences.Sequence.this.iterator(), 16);
                return spliteratorUnknownSize;
            }
        }, 16, false);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stream, "");
        return stream;
    }

    public static final <T> java.util.List<T> toList(java.util.stream.Stream<T> stream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stream, "");
        java.lang.Object collect = stream.collect(java.util.stream.Collectors.toList());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(collect, "");
        return (java.util.List) collect;
    }

    public static final java.util.List<java.lang.Integer> toList(java.util.stream.IntStream intStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intStream, "");
        int[] array = intStream.toArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(array, "");
        return kotlin.collections.ArraysKt.asList(array);
    }

    public static final java.util.List<java.lang.Long> toList(java.util.stream.LongStream longStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(longStream, "");
        long[] array = longStream.toArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(array, "");
        return kotlin.collections.ArraysKt.asList(array);
    }

    public static final java.util.List<java.lang.Double> toList(java.util.stream.DoubleStream doubleStream) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(doubleStream, "");
        double[] array = doubleStream.toArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(array, "");
        return kotlin.collections.ArraysKt.asList(array);
    }
}
