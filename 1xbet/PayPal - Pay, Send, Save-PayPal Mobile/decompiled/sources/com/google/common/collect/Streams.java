package com.google.common.collect;

/* loaded from: classes9.dex */
public final class Streams {

    public interface DoubleFunctionWithIndex<R> {
        R apply(double d, long j);
    }

    public interface FunctionWithIndex<T, R> {
        R apply(T t, long j);
    }

    public interface IntFunctionWithIndex<R> {
        R apply(int i, long j);
    }

    public interface LongFunctionWithIndex<R> {
        R apply(long j, long j2);
    }

    static /* synthetic */ java.util.Spliterator lambda$concat$0(java.util.Spliterator spliterator) {
        return spliterator;
    }

    static /* synthetic */ java.util.Spliterator.OfInt lambda$concat$2(java.util.Spliterator.OfInt ofInt) {
        return ofInt;
    }

    static /* synthetic */ java.util.Spliterator.OfLong lambda$concat$4(java.util.Spliterator.OfLong ofLong) {
        return ofLong;
    }

    static /* synthetic */ java.util.Spliterator.OfDouble lambda$concat$6(java.util.Spliterator.OfDouble ofDouble) {
        return ofDouble;
    }

    public static <T> java.util.stream.Stream<T> stream(java.lang.Iterable<T> iterable) {
        if (iterable instanceof java.util.Collection) {
            return ((java.util.Collection) iterable).stream();
        }
        return java.util.stream.StreamSupport.stream(iterable.spliterator(), false);
    }

    @java.lang.Deprecated
    public static <T> java.util.stream.Stream<T> stream(java.util.Collection<T> collection) {
        return collection.stream();
    }

    public static <T> java.util.stream.Stream<T> stream(java.util.Iterator<T> it) {
        return java.util.stream.StreamSupport.stream(java.util.Spliterators.spliteratorUnknownSize(it, 0), false);
    }

    public static <T> java.util.stream.Stream<T> stream(com.google.common.base.Optional<T> optional) {
        return optional.isPresent() ? java.util.stream.Stream.of(optional.get()) : java.util.stream.Stream.empty();
    }

    public static <T> java.util.stream.Stream<T> stream(java.util.Optional<T> optional) {
        return optional.isPresent() ? java.util.stream.Stream.of(optional.get()) : java.util.stream.Stream.empty();
    }

    public static java.util.stream.IntStream stream(java.util.OptionalInt optionalInt) {
        return optionalInt.isPresent() ? java.util.stream.IntStream.of(optionalInt.getAsInt()) : java.util.stream.IntStream.empty();
    }

    public static java.util.stream.LongStream stream(java.util.OptionalLong optionalLong) {
        return optionalLong.isPresent() ? java.util.stream.LongStream.of(optionalLong.getAsLong()) : java.util.stream.LongStream.empty();
    }

    public static java.util.stream.DoubleStream stream(java.util.OptionalDouble optionalDouble) {
        return optionalDouble.isPresent() ? java.util.stream.DoubleStream.of(optionalDouble.getAsDouble()) : java.util.stream.DoubleStream.empty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void closeAll(java.util.stream.BaseStream<?, ?>[] baseStreamArr) {
        java.lang.Exception exc = null;
        for (java.util.stream.BaseStream<?, ?> baseStream : baseStreamArr) {
            try {
                baseStream.close();
            } catch (java.lang.Exception e) {
                if (exc == null) {
                    exc = e;
                } else {
                    exc.addSuppressed(e);
                }
            }
        }
        if (exc != null) {
            com.google.common.collect.SneakyThrows.sneakyThrow(exc);
        }
    }

    @java.lang.SafeVarargs
    public static <T> java.util.stream.Stream<T> concat(final java.util.stream.Stream<? extends T>... streamArr) {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder(streamArr.length);
        int i = 336;
        long j = 0;
        boolean z = false;
        for (java.util.stream.Stream<? extends T> stream : streamArr) {
            z |= stream.isParallel();
            java.util.Spliterator<? extends T> spliterator = stream.spliterator();
            builder.add((com.google.common.collect.ImmutableList.Builder) spliterator);
            i &= spliterator.characteristics();
            j = com.google.common.math.LongMath.saturatedAdd(j, spliterator.estimateSize());
        }
        return (java.util.stream.Stream) java.util.stream.StreamSupport.stream(com.google.common.collect.CollectSpliterators.flatMap(builder.build().spliterator(), new java.util.function.Function() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda14
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.common.collect.Streams.lambda$concat$0((java.util.Spliterator) obj);
            }
        }, i, j), z).onClose(new java.lang.Runnable() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                com.google.common.collect.Streams.closeAll(streamArr);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Spliterator$OfInt] */
    public static java.util.stream.IntStream concat(final java.util.stream.IntStream... intStreamArr) {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder(intStreamArr.length);
        int i = 336;
        long j = 0;
        boolean z = false;
        for (java.util.stream.IntStream intStream : intStreamArr) {
            z |= intStream.isParallel();
            ?? spliterator = intStream.spliterator();
            builder.add((com.google.common.collect.ImmutableList.Builder) spliterator);
            i &= spliterator.characteristics();
            j = com.google.common.math.LongMath.saturatedAdd(j, spliterator.estimateSize());
        }
        return (java.util.stream.IntStream) java.util.stream.StreamSupport.intStream(com.google.common.collect.CollectSpliterators.flatMapToInt(builder.build().spliterator(), new java.util.function.Function() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda17
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.common.collect.Streams.lambda$concat$2((java.util.Spliterator.OfInt) obj);
            }
        }, i, j), z).onClose(new java.lang.Runnable() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.google.common.collect.Streams.closeAll(intStreamArr);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Spliterator$OfLong] */
    public static java.util.stream.LongStream concat(final java.util.stream.LongStream... longStreamArr) {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder(longStreamArr.length);
        int i = 336;
        long j = 0;
        boolean z = false;
        for (java.util.stream.LongStream longStream : longStreamArr) {
            z |= longStream.isParallel();
            ?? spliterator = longStream.spliterator();
            builder.add((com.google.common.collect.ImmutableList.Builder) spliterator);
            i &= spliterator.characteristics();
            j = com.google.common.math.LongMath.saturatedAdd(j, spliterator.estimateSize());
        }
        return (java.util.stream.LongStream) java.util.stream.StreamSupport.longStream(com.google.common.collect.CollectSpliterators.flatMapToLong(builder.build().spliterator(), new java.util.function.Function() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda11
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.common.collect.Streams.lambda$concat$4((java.util.Spliterator.OfLong) obj);
            }
        }, i, j), z).onClose(new java.lang.Runnable() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                com.google.common.collect.Streams.closeAll(longStreamArr);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Spliterator$OfDouble] */
    public static java.util.stream.DoubleStream concat(final java.util.stream.DoubleStream... doubleStreamArr) {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder(doubleStreamArr.length);
        int i = 336;
        long j = 0;
        boolean z = false;
        for (java.util.stream.DoubleStream doubleStream : doubleStreamArr) {
            z |= doubleStream.isParallel();
            ?? spliterator = doubleStream.spliterator();
            builder.add((com.google.common.collect.ImmutableList.Builder) spliterator);
            i &= spliterator.characteristics();
            j = com.google.common.math.LongMath.saturatedAdd(j, spliterator.estimateSize());
        }
        return (java.util.stream.DoubleStream) java.util.stream.StreamSupport.doubleStream(com.google.common.collect.CollectSpliterators.flatMapToDouble(builder.build().spliterator(), new java.util.function.Function() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda9
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return com.google.common.collect.Streams.lambda$concat$6((java.util.Spliterator.OfDouble) obj);
            }
        }, i, j), z).onClose(new java.lang.Runnable() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                com.google.common.collect.Streams.closeAll(doubleStreamArr);
            }
        });
    }

    public static <A, B, R> java.util.stream.Stream<R> zip(java.util.stream.Stream<A> stream, java.util.stream.Stream<B> stream2, final java.util.function.BiFunction<? super A, ? super B, R> biFunction) {
        com.google.common.base.Preconditions.checkNotNull(stream);
        com.google.common.base.Preconditions.checkNotNull(stream2);
        com.google.common.base.Preconditions.checkNotNull(biFunction);
        boolean z = stream.isParallel() || stream2.isParallel();
        java.util.Spliterator<A> spliterator = stream.spliterator();
        java.util.Spliterator<B> spliterator2 = stream2.spliterator();
        int characteristics = spliterator.characteristics();
        int characteristics2 = spliterator2.characteristics();
        final java.util.Iterator it = java.util.Spliterators.iterator(spliterator);
        final java.util.Iterator it2 = java.util.Spliterators.iterator(spliterator2);
        java.util.stream.Stream stream3 = java.util.stream.StreamSupport.stream(new java.util.Spliterators.AbstractSpliterator<R>(java.lang.Math.min(spliterator.estimateSize(), spliterator2.estimateSize()), characteristics & characteristics2 & 80) { // from class: com.google.common.collect.Streams.1
            @Override // java.util.Spliterator
            public boolean tryAdvance(java.util.function.Consumer<? super R> consumer) {
                if (!it.hasNext() || !it2.hasNext()) {
                    return false;
                }
                consumer.accept((java.lang.Object) biFunction.apply(it.next(), it2.next()));
                return true;
            }
        }, z);
        java.util.Objects.requireNonNull(stream);
        java.util.stream.Stream stream4 = (java.util.stream.Stream) stream3.onClose(new com.google.common.collect.Streams$$ExternalSyntheticLambda13(stream));
        java.util.Objects.requireNonNull(stream2);
        return (java.util.stream.Stream) stream4.onClose(new com.google.common.collect.Streams$$ExternalSyntheticLambda13(stream2));
    }

    public static <A, B> void forEachPair(java.util.stream.Stream<A> stream, java.util.stream.Stream<B> stream2, final java.util.function.BiConsumer<? super A, ? super B> biConsumer) {
        com.google.common.base.Preconditions.checkNotNull(biConsumer);
        if (stream.isParallel() || stream2.isParallel()) {
            zip(stream, stream2, new java.util.function.BiFunction() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda2
                @Override // java.util.function.BiFunction
                public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
                    return new com.google.common.collect.Streams.TemporaryPair(obj, obj2);
                }
            }).forEach(new java.util.function.Consumer() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda3
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    biConsumer.accept(r2.f3863a, ((com.google.common.collect.Streams.TemporaryPair) obj).b);
                }
            });
            return;
        }
        java.util.Iterator<A> it = stream.iterator();
        java.util.Iterator<B> it2 = stream2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            biConsumer.accept(it.next(), it2.next());
        }
    }

    static final class TemporaryPair<A, B> {

        /* renamed from: a, reason: collision with root package name */
        final A f3863a;
        final B b;

        TemporaryPair(A a2, B b) {
            this.f3863a = a2;
            this.b = b;
        }
    }

    public static <T, R> java.util.stream.Stream<R> mapWithIndex(java.util.stream.Stream<T> stream, final com.google.common.collect.Streams.FunctionWithIndex<? super T, ? extends R> functionWithIndex) {
        com.google.common.base.Preconditions.checkNotNull(stream);
        com.google.common.base.Preconditions.checkNotNull(functionWithIndex);
        boolean isParallel = stream.isParallel();
        java.util.Spliterator<T> spliterator = stream.spliterator();
        if (!spliterator.hasCharacteristics(16384)) {
            final java.util.Iterator it = java.util.Spliterators.iterator(spliterator);
            java.util.stream.Stream stream2 = java.util.stream.StreamSupport.stream(new java.util.Spliterators.AbstractSpliterator<R>(spliterator.estimateSize(), spliterator.characteristics() & 80) { // from class: com.google.common.collect.Streams.2
                long index = 0;

                @Override // java.util.Spliterator
                public boolean tryAdvance(java.util.function.Consumer<? super R> consumer) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    com.google.common.collect.Streams.FunctionWithIndex functionWithIndex2 = functionWithIndex;
                    java.lang.Object next = it.next();
                    long j = this.index;
                    this.index = 1 + j;
                    consumer.accept((java.lang.Object) functionWithIndex2.apply(next, j));
                    return true;
                }
            }, isParallel);
            java.util.Objects.requireNonNull(stream);
            return (java.util.stream.Stream) stream2.onClose(new com.google.common.collect.Streams$$ExternalSyntheticLambda13(stream));
        }
        java.util.stream.Stream stream3 = java.util.stream.StreamSupport.stream(new com.google.common.collect.Streams.C1Splitr(spliterator, 0L, functionWithIndex), isParallel);
        java.util.Objects.requireNonNull(stream);
        return (java.util.stream.Stream) stream3.onClose(new com.google.common.collect.Streams$$ExternalSyntheticLambda13(stream));
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* renamed from: com.google.common.collect.Streams$1Splitr, reason: invalid class name */
    final class C1Splitr<R, T> extends com.google.common.collect.Streams.MapWithIndexSpliterator<java.util.Spliterator<T>, R, com.google.common.collect.Streams.C1Splitr> implements java.util.function.Consumer<T> {
        T holder;
        final /* synthetic */ com.google.common.collect.Streams.FunctionWithIndex val$function;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0000: IPUT (r4 I:com.google.common.collect.Streams$FunctionWithIndex), (r0 I:com.google.common.collect.Streams$1Splitr) (LINE:481) com.google.common.collect.Streams.1Splitr.val$function com.google.common.collect.Streams$FunctionWithIndex, block:B:1:0x0000 */
        C1Splitr(java.util.Spliterator spliterator, java.util.Spliterator<T> spliterator2, long j) {
            super(spliterator, spliterator2);
            com.google.common.collect.Streams.FunctionWithIndex functionWithIndex;
            this.val$function = functionWithIndex;
        }

        @Override // java.util.function.Consumer
        public final void accept(T t) {
            this.holder = t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Spliterator
        public final boolean tryAdvance(java.util.function.Consumer<? super R> consumer) {
            if (!this.fromSpliterator.tryAdvance(this)) {
                return false;
            }
            try {
                com.google.common.collect.Streams.FunctionWithIndex functionWithIndex = this.val$function;
                java.lang.Object uncheckedCastNullableTToT = com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.holder);
                long j = this.index;
                this.index = 1 + j;
                consumer.accept((java.lang.Object) functionWithIndex.apply(uncheckedCastNullableTToT, j));
                this.holder = null;
                return true;
            } catch (java.lang.Throwable th) {
                this.holder = null;
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.collect.Streams.MapWithIndexSpliterator
        public final com.google.common.collect.Streams.C1Splitr createSplit(java.util.Spliterator<T> spliterator, long j) {
            return new com.google.common.collect.Streams.C1Splitr(spliterator, j, this.val$function);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Spliterator$OfInt] */
    public static <R> java.util.stream.Stream<R> mapWithIndex(final java.util.stream.IntStream intStream, final com.google.common.collect.Streams.IntFunctionWithIndex<R> intFunctionWithIndex) {
        com.google.common.base.Preconditions.checkNotNull(intStream);
        com.google.common.base.Preconditions.checkNotNull(intFunctionWithIndex);
        boolean isParallel = intStream.isParallel();
        ?? spliterator = intStream.spliterator();
        if (!spliterator.hasCharacteristics(16384)) {
            final java.util.PrimitiveIterator.OfInt it = java.util.Spliterators.iterator((java.util.Spliterator.OfInt) spliterator);
            java.util.stream.Stream stream = java.util.stream.StreamSupport.stream(new java.util.Spliterators.AbstractSpliterator<R>(spliterator.estimateSize(), spliterator.characteristics() & 80) { // from class: com.google.common.collect.Streams.3
                long index = 0;

                @Override // java.util.Spliterator
                public boolean tryAdvance(java.util.function.Consumer<? super R> consumer) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    com.google.common.collect.Streams.IntFunctionWithIndex intFunctionWithIndex2 = intFunctionWithIndex;
                    int nextInt = it.nextInt();
                    long j = this.index;
                    this.index = 1 + j;
                    consumer.accept((java.lang.Object) intFunctionWithIndex2.apply(nextInt, j));
                    return true;
                }
            }, isParallel);
            java.util.Objects.requireNonNull(intStream);
            return (java.util.stream.Stream) stream.onClose(new java.lang.Runnable() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    intStream.close();
                }
            });
        }
        java.util.stream.Stream stream2 = java.util.stream.StreamSupport.stream(new com.google.common.collect.Streams.C2Splitr(spliterator, 0L, intFunctionWithIndex), isParallel);
        java.util.Objects.requireNonNull(intStream);
        return (java.util.stream.Stream) stream2.onClose(new java.lang.Runnable() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                intStream.close();
            }
        });
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* renamed from: com.google.common.collect.Streams$2Splitr, reason: invalid class name */
    final class C2Splitr<R> extends com.google.common.collect.Streams.MapWithIndexSpliterator<java.util.Spliterator.OfInt, R, com.google.common.collect.Streams.C2Splitr> implements java.util.function.IntConsumer {
        int holder;
        final /* synthetic */ com.google.common.collect.Streams.IntFunctionWithIndex val$function;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0000: IPUT (r4 I:com.google.common.collect.Streams$IntFunctionWithIndex), (r0 I:com.google.common.collect.Streams$2Splitr) (LINE:566) com.google.common.collect.Streams.2Splitr.val$function com.google.common.collect.Streams$IntFunctionWithIndex, block:B:1:0x0000 */
        C2Splitr(java.util.Spliterator.OfInt ofInt, java.util.Spliterator.OfInt ofInt2, long j) {
            super(ofInt, ofInt2);
            com.google.common.collect.Streams.IntFunctionWithIndex intFunctionWithIndex;
            this.val$function = intFunctionWithIndex;
        }

        @Override // java.util.function.IntConsumer
        public final void accept(int i) {
            this.holder = i;
        }

        @Override // java.util.Spliterator
        public final boolean tryAdvance(java.util.function.Consumer<? super R> consumer) {
            if (!((java.util.Spliterator.OfInt) this.fromSpliterator).tryAdvance((java.util.function.IntConsumer) this)) {
                return false;
            }
            com.google.common.collect.Streams.IntFunctionWithIndex intFunctionWithIndex = this.val$function;
            int i = this.holder;
            long j = this.index;
            this.index = 1 + j;
            consumer.accept((java.lang.Object) intFunctionWithIndex.apply(i, j));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Streams.MapWithIndexSpliterator
        public final com.google.common.collect.Streams.C2Splitr createSplit(java.util.Spliterator.OfInt ofInt, long j) {
            return new com.google.common.collect.Streams.C2Splitr(ofInt, j, this.val$function);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Spliterator$OfLong] */
    public static <R> java.util.stream.Stream<R> mapWithIndex(final java.util.stream.LongStream longStream, final com.google.common.collect.Streams.LongFunctionWithIndex<R> longFunctionWithIndex) {
        com.google.common.base.Preconditions.checkNotNull(longStream);
        com.google.common.base.Preconditions.checkNotNull(longFunctionWithIndex);
        boolean isParallel = longStream.isParallel();
        ?? spliterator = longStream.spliterator();
        if (!spliterator.hasCharacteristics(16384)) {
            final java.util.PrimitiveIterator.OfLong it = java.util.Spliterators.iterator((java.util.Spliterator.OfLong) spliterator);
            java.util.stream.Stream stream = java.util.stream.StreamSupport.stream(new java.util.Spliterators.AbstractSpliterator<R>(spliterator.estimateSize(), spliterator.characteristics() & 80) { // from class: com.google.common.collect.Streams.4
                long index = 0;

                @Override // java.util.Spliterator
                public boolean tryAdvance(java.util.function.Consumer<? super R> consumer) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    com.google.common.collect.Streams.LongFunctionWithIndex longFunctionWithIndex2 = longFunctionWithIndex;
                    long nextLong = it.nextLong();
                    long j = this.index;
                    this.index = 1 + j;
                    consumer.accept((java.lang.Object) longFunctionWithIndex2.apply(nextLong, j));
                    return true;
                }
            }, isParallel);
            java.util.Objects.requireNonNull(longStream);
            return (java.util.stream.Stream) stream.onClose(new java.lang.Runnable() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    longStream.close();
                }
            });
        }
        java.util.stream.Stream stream2 = java.util.stream.StreamSupport.stream(new com.google.common.collect.Streams.C3Splitr(spliterator, 0L, longFunctionWithIndex), isParallel);
        java.util.Objects.requireNonNull(longStream);
        return (java.util.stream.Stream) stream2.onClose(new java.lang.Runnable() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                longStream.close();
            }
        });
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* renamed from: com.google.common.collect.Streams$3Splitr, reason: invalid class name */
    final class C3Splitr<R> extends com.google.common.collect.Streams.MapWithIndexSpliterator<java.util.Spliterator.OfLong, R, com.google.common.collect.Streams.C3Splitr> implements java.util.function.LongConsumer {
        long holder;
        final /* synthetic */ com.google.common.collect.Streams.LongFunctionWithIndex val$function;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0000: IPUT (r4 I:com.google.common.collect.Streams$LongFunctionWithIndex), (r0 I:com.google.common.collect.Streams$3Splitr) (LINE:646) com.google.common.collect.Streams.3Splitr.val$function com.google.common.collect.Streams$LongFunctionWithIndex, block:B:1:0x0000 */
        C3Splitr(java.util.Spliterator.OfLong ofLong, java.util.Spliterator.OfLong ofLong2, long j) {
            super(ofLong, ofLong2);
            com.google.common.collect.Streams.LongFunctionWithIndex longFunctionWithIndex;
            this.val$function = longFunctionWithIndex;
        }

        @Override // java.util.function.LongConsumer
        public final void accept(long j) {
            this.holder = j;
        }

        @Override // java.util.Spliterator
        public final boolean tryAdvance(java.util.function.Consumer<? super R> consumer) {
            if (!((java.util.Spliterator.OfLong) this.fromSpliterator).tryAdvance((java.util.function.LongConsumer) this)) {
                return false;
            }
            com.google.common.collect.Streams.LongFunctionWithIndex longFunctionWithIndex = this.val$function;
            long j = this.holder;
            long j2 = this.index;
            this.index = 1 + j2;
            consumer.accept((java.lang.Object) longFunctionWithIndex.apply(j, j2));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Streams.MapWithIndexSpliterator
        public final com.google.common.collect.Streams.C3Splitr createSplit(java.util.Spliterator.OfLong ofLong, long j) {
            return new com.google.common.collect.Streams.C3Splitr(ofLong, j, this.val$function);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Spliterator$OfDouble] */
    public static <R> java.util.stream.Stream<R> mapWithIndex(final java.util.stream.DoubleStream doubleStream, final com.google.common.collect.Streams.DoubleFunctionWithIndex<R> doubleFunctionWithIndex) {
        com.google.common.base.Preconditions.checkNotNull(doubleStream);
        com.google.common.base.Preconditions.checkNotNull(doubleFunctionWithIndex);
        boolean isParallel = doubleStream.isParallel();
        ?? spliterator = doubleStream.spliterator();
        if (!spliterator.hasCharacteristics(16384)) {
            final java.util.PrimitiveIterator.OfDouble it = java.util.Spliterators.iterator((java.util.Spliterator.OfDouble) spliterator);
            java.util.stream.Stream stream = java.util.stream.StreamSupport.stream(new java.util.Spliterators.AbstractSpliterator<R>(spliterator.estimateSize(), spliterator.characteristics() & 80) { // from class: com.google.common.collect.Streams.5
                long index = 0;

                @Override // java.util.Spliterator
                public boolean tryAdvance(java.util.function.Consumer<? super R> consumer) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    com.google.common.collect.Streams.DoubleFunctionWithIndex doubleFunctionWithIndex2 = doubleFunctionWithIndex;
                    double nextDouble = it.nextDouble();
                    long j = this.index;
                    this.index = 1 + j;
                    consumer.accept((java.lang.Object) doubleFunctionWithIndex2.apply(nextDouble, j));
                    return true;
                }
            }, isParallel);
            java.util.Objects.requireNonNull(doubleStream);
            return (java.util.stream.Stream) stream.onClose(new java.lang.Runnable() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    doubleStream.close();
                }
            });
        }
        java.util.stream.Stream stream2 = java.util.stream.StreamSupport.stream(new com.google.common.collect.Streams.C4Splitr(spliterator, 0L, doubleFunctionWithIndex), isParallel);
        java.util.Objects.requireNonNull(doubleStream);
        return (java.util.stream.Stream) stream2.onClose(new java.lang.Runnable() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                doubleStream.close();
            }
        });
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* renamed from: com.google.common.collect.Streams$4Splitr, reason: invalid class name */
    final class C4Splitr<R> extends com.google.common.collect.Streams.MapWithIndexSpliterator<java.util.Spliterator.OfDouble, R, com.google.common.collect.Streams.C4Splitr> implements java.util.function.DoubleConsumer {
        double holder;
        final /* synthetic */ com.google.common.collect.Streams.DoubleFunctionWithIndex val$function;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0000: IPUT (r4 I:com.google.common.collect.Streams$DoubleFunctionWithIndex), (r0 I:com.google.common.collect.Streams$4Splitr) (LINE:726) com.google.common.collect.Streams.4Splitr.val$function com.google.common.collect.Streams$DoubleFunctionWithIndex, block:B:1:0x0000 */
        C4Splitr(java.util.Spliterator.OfDouble ofDouble, java.util.Spliterator.OfDouble ofDouble2, long j) {
            super(ofDouble, ofDouble2);
            com.google.common.collect.Streams.DoubleFunctionWithIndex doubleFunctionWithIndex;
            this.val$function = doubleFunctionWithIndex;
        }

        @Override // java.util.function.DoubleConsumer
        public final void accept(double d) {
            this.holder = d;
        }

        @Override // java.util.Spliterator
        public final boolean tryAdvance(java.util.function.Consumer<? super R> consumer) {
            if (!((java.util.Spliterator.OfDouble) this.fromSpliterator).tryAdvance((java.util.function.DoubleConsumer) this)) {
                return false;
            }
            com.google.common.collect.Streams.DoubleFunctionWithIndex doubleFunctionWithIndex = this.val$function;
            double d = this.holder;
            long j = this.index;
            this.index = 1 + j;
            consumer.accept((java.lang.Object) doubleFunctionWithIndex.apply(d, j));
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Streams.MapWithIndexSpliterator
        public final com.google.common.collect.Streams.C4Splitr createSplit(java.util.Spliterator.OfDouble ofDouble, long j) {
            return new com.google.common.collect.Streams.C4Splitr(ofDouble, j, this.val$function);
        }
    }

    static abstract class MapWithIndexSpliterator<F extends java.util.Spliterator<?>, R, S extends com.google.common.collect.Streams.MapWithIndexSpliterator<F, R, S>> implements java.util.Spliterator<R> {
        final F fromSpliterator;
        long index;

        abstract S createSplit(F f, long j);

        MapWithIndexSpliterator(F f, long j) {
            this.fromSpliterator = f;
            this.index = j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Spliterator
        public S trySplit() {
            java.util.Spliterator trySplit = this.fromSpliterator.trySplit();
            if (trySplit == null) {
                return null;
            }
            S s = (S) createSplit(trySplit, this.index);
            this.index += trySplit.getExactSizeIfKnown();
            return s;
        }

        @Override // java.util.Spliterator
        public long estimateSize() {
            return this.fromSpliterator.estimateSize();
        }

        @Override // java.util.Spliterator
        public int characteristics() {
            return this.fromSpliterator.characteristics() & 16464;
        }
    }

    /* renamed from: com.google.common.collect.Streams$1OptionalState, reason: invalid class name */
    final class C1OptionalState {
        boolean set = false;
        T value = null;

        C1OptionalState() {
        }

        final void set(T t) {
            this.set = true;
            this.value = t;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        final T get() {
            return java.util.Objects.requireNonNull(this.value);
        }
    }

    public static <T> java.util.Optional<T> findLast(java.util.stream.Stream<T> stream) {
        final com.google.common.collect.Streams.C1OptionalState c1OptionalState = new com.google.common.collect.Streams.C1OptionalState();
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        arrayDeque.addLast(stream.spliterator());
        while (!arrayDeque.isEmpty()) {
            java.util.Spliterator<T> spliterator = (java.util.Spliterator) arrayDeque.removeLast();
            if (spliterator.getExactSizeIfKnown() != 0) {
                if (spliterator.hasCharacteristics(16384)) {
                    while (true) {
                        java.util.Spliterator<T> trySplit = spliterator.trySplit();
                        if (trySplit == null || trySplit.getExactSizeIfKnown() == 0) {
                            break;
                        }
                        if (spliterator.getExactSizeIfKnown() == 0) {
                            spliterator = trySplit;
                            break;
                        }
                    }
                    spliterator.forEachRemaining(new java.util.function.Consumer() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda4
                        @Override // java.util.function.Consumer
                        public final void accept(java.lang.Object obj) {
                            com.google.common.collect.Streams.C1OptionalState.this.set(obj);
                        }
                    });
                    return java.util.Optional.of(c1OptionalState.get());
                }
                java.util.Spliterator<T> trySplit2 = spliterator.trySplit();
                if (trySplit2 == null || trySplit2.getExactSizeIfKnown() == 0) {
                    spliterator.forEachRemaining(new java.util.function.Consumer() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda4
                        @Override // java.util.function.Consumer
                        public final void accept(java.lang.Object obj) {
                            com.google.common.collect.Streams.C1OptionalState.this.set(obj);
                        }
                    });
                    if (c1OptionalState.set) {
                        return java.util.Optional.of(c1OptionalState.get());
                    }
                } else {
                    arrayDeque.addLast(trySplit2);
                    arrayDeque.addLast(spliterator);
                }
            }
        }
        return java.util.Optional.empty();
    }

    public static java.util.OptionalInt findLast(java.util.stream.IntStream intStream) {
        return (java.util.OptionalInt) findLast(intStream.boxed()).map(new java.util.function.Function() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.util.OptionalInt of;
                of = java.util.OptionalInt.of(((java.lang.Integer) obj).intValue());
                return of;
            }
        }).orElse(java.util.OptionalInt.empty());
    }

    public static java.util.OptionalLong findLast(java.util.stream.LongStream longStream) {
        return (java.util.OptionalLong) findLast(longStream.boxed()).map(new java.util.function.Function() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda16
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.util.OptionalLong of;
                of = java.util.OptionalLong.of(((java.lang.Long) obj).longValue());
                return of;
            }
        }).orElse(java.util.OptionalLong.empty());
    }

    public static java.util.OptionalDouble findLast(java.util.stream.DoubleStream doubleStream) {
        return (java.util.OptionalDouble) findLast(doubleStream.boxed()).map(new java.util.function.Function() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda6
            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                java.util.OptionalDouble of;
                of = java.util.OptionalDouble.of(((java.lang.Double) obj).doubleValue());
                return of;
            }
        }).orElse(java.util.OptionalDouble.empty());
    }

    private Streams() {
    }
}
