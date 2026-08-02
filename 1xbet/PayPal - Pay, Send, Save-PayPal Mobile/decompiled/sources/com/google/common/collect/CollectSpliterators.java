package com.google.common.collect;

/* loaded from: classes9.dex */
final class CollectSpliterators {
    private CollectSpliterators() {
    }

    static <T> java.util.Spliterator<T> indexed(int i, int i2, java.util.function.IntFunction<T> intFunction) {
        return indexed(i, i2, intFunction, null);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Spliterator$OfInt] */
    static <T> java.util.Spliterator<T> indexed(int i, int i2, java.util.function.IntFunction<T> intFunction, java.util.Comparator<? super T> comparator) {
        if (comparator != null) {
            com.google.common.base.Preconditions.checkArgument((i2 & 4) != 0);
        }
        return new com.google.common.collect.CollectSpliterators.C1WithCharacteristics(java.util.stream.IntStream.range(0, i).spliterator(), intFunction, i2, comparator);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.CollectSpliterators$1WithCharacteristics, reason: invalid class name */
    final class C1WithCharacteristics<T> implements java.util.Spliterator<T> {
        private final java.util.Spliterator.OfInt delegate;
        final /* synthetic */ java.util.Comparator val$comparator;
        final /* synthetic */ int val$extraCharacteristics;
        final /* synthetic */ java.util.function.IntFunction val$function;

        C1WithCharacteristics(java.util.Spliterator.OfInt ofInt, java.util.function.IntFunction intFunction, int i, java.util.Comparator comparator) {
            this.val$function = intFunction;
            this.val$extraCharacteristics = i;
            this.val$comparator = comparator;
            this.delegate = ofInt;
        }

        @Override // java.util.Spliterator
        public final boolean tryAdvance(final java.util.function.Consumer<? super T> consumer) {
            java.util.Spliterator.OfInt ofInt = this.delegate;
            final java.util.function.IntFunction intFunction = this.val$function;
            return ofInt.tryAdvance(new java.util.function.IntConsumer() { // from class: com.google.common.collect.CollectSpliterators$1WithCharacteristics$$ExternalSyntheticLambda1
                @Override // java.util.function.IntConsumer
                public final void accept(int i) {
                    consumer.accept(intFunction.apply(i));
                }
            });
        }

        @Override // java.util.Spliterator
        public final void forEachRemaining(final java.util.function.Consumer<? super T> consumer) {
            java.util.Spliterator.OfInt ofInt = this.delegate;
            final java.util.function.IntFunction intFunction = this.val$function;
            ofInt.forEachRemaining(new java.util.function.IntConsumer() { // from class: com.google.common.collect.CollectSpliterators$1WithCharacteristics$$ExternalSyntheticLambda0
                @Override // java.util.function.IntConsumer
                public final void accept(int i) {
                    consumer.accept(intFunction.apply(i));
                }
            });
        }

        @Override // java.util.Spliterator
        public final java.util.Spliterator<T> trySplit() {
            java.util.Spliterator.OfInt trySplit = this.delegate.trySplit();
            if (trySplit == null) {
                return null;
            }
            return new com.google.common.collect.CollectSpliterators.C1WithCharacteristics(trySplit, this.val$function, this.val$extraCharacteristics, this.val$comparator);
        }

        @Override // java.util.Spliterator
        public final long estimateSize() {
            return this.delegate.estimateSize();
        }

        @Override // java.util.Spliterator
        public final int characteristics() {
            return this.val$extraCharacteristics | 16464;
        }

        @Override // java.util.Spliterator
        public final java.util.Comparator<? super T> getComparator() {
            if (hasCharacteristics(4)) {
                return this.val$comparator;
            }
            throw new java.lang.IllegalStateException();
        }
    }

    static <InElementT, OutElementT> java.util.Spliterator<OutElementT> map(java.util.Spliterator<InElementT> spliterator, java.util.function.Function<? super InElementT, ? extends OutElementT> function) {
        com.google.common.base.Preconditions.checkNotNull(spliterator);
        com.google.common.base.Preconditions.checkNotNull(function);
        return new com.google.common.collect.CollectSpliterators.AnonymousClass1(spliterator, function);
    }

    /* JADX INFO: Add missing generic type declarations: [OutElementT] */
    /* renamed from: com.google.common.collect.CollectSpliterators$1, reason: invalid class name */
    class AnonymousClass1<OutElementT> implements java.util.Spliterator<OutElementT> {
        final /* synthetic */ java.util.Spliterator val$fromSpliterator;
        final /* synthetic */ java.util.function.Function val$function;

        AnonymousClass1(java.util.Spliterator spliterator, java.util.function.Function function) {
            this.val$fromSpliterator = spliterator;
            this.val$function = function;
        }

        @Override // java.util.Spliterator
        public boolean tryAdvance(final java.util.function.Consumer<? super OutElementT> consumer) {
            java.util.Spliterator spliterator = this.val$fromSpliterator;
            final java.util.function.Function function = this.val$function;
            return spliterator.tryAdvance(new java.util.function.Consumer() { // from class: com.google.common.collect.CollectSpliterators$1$$ExternalSyntheticLambda1
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    consumer.accept(function.apply(obj));
                }
            });
        }

        @Override // java.util.Spliterator
        public void forEachRemaining(final java.util.function.Consumer<? super OutElementT> consumer) {
            java.util.Spliterator spliterator = this.val$fromSpliterator;
            final java.util.function.Function function = this.val$function;
            spliterator.forEachRemaining(new java.util.function.Consumer() { // from class: com.google.common.collect.CollectSpliterators$1$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    consumer.accept(function.apply(obj));
                }
            });
        }

        @Override // java.util.Spliterator
        public java.util.Spliterator<OutElementT> trySplit() {
            java.util.Spliterator trySplit = this.val$fromSpliterator.trySplit();
            if (trySplit != null) {
                return com.google.common.collect.CollectSpliterators.map(trySplit, this.val$function);
            }
            return null;
        }

        @Override // java.util.Spliterator
        public long estimateSize() {
            return this.val$fromSpliterator.estimateSize();
        }

        @Override // java.util.Spliterator
        public int characteristics() {
            return this.val$fromSpliterator.characteristics() & (-262);
        }
    }

    static <T> java.util.Spliterator<T> filter(java.util.Spliterator<T> spliterator, java.util.function.Predicate<? super T> predicate) {
        com.google.common.base.Preconditions.checkNotNull(spliterator);
        com.google.common.base.Preconditions.checkNotNull(predicate);
        return new com.google.common.collect.CollectSpliterators.C1Splitr(spliterator, predicate);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.google.common.collect.CollectSpliterators$1Splitr, reason: invalid class name */
    final class C1Splitr<T> implements java.util.Spliterator<T>, java.util.function.Consumer<T> {
        T holder = null;
        final /* synthetic */ java.util.Spliterator val$fromSpliterator;
        final /* synthetic */ java.util.function.Predicate val$predicate;

        C1Splitr(java.util.Spliterator spliterator, java.util.function.Predicate predicate) {
            this.val$fromSpliterator = spliterator;
            this.val$predicate = predicate;
        }

        @Override // java.util.function.Consumer
        public final void accept(T t) {
            this.holder = t;
        }

        @Override // java.util.Spliterator
        public final boolean tryAdvance(java.util.function.Consumer<? super T> consumer) {
            while (this.val$fromSpliterator.tryAdvance(this)) {
                try {
                    a.d dVar = (java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(this.holder);
                    if (this.val$predicate.test(dVar)) {
                        consumer.accept(dVar);
                        this.holder = null;
                        return true;
                    }
                } finally {
                    this.holder = null;
                }
            }
            return false;
        }

        @Override // java.util.Spliterator
        public final java.util.Spliterator<T> trySplit() {
            java.util.Spliterator<T> trySplit = this.val$fromSpliterator.trySplit();
            if (trySplit == null) {
                return null;
            }
            return com.google.common.collect.CollectSpliterators.filter(trySplit, this.val$predicate);
        }

        @Override // java.util.Spliterator
        public final long estimateSize() {
            return this.val$fromSpliterator.estimateSize() / 2;
        }

        @Override // java.util.Spliterator
        public final java.util.Comparator<? super T> getComparator() {
            return this.val$fromSpliterator.getComparator();
        }

        @Override // java.util.Spliterator
        public final int characteristics() {
            return this.val$fromSpliterator.characteristics() & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE;
        }
    }

    static <InElementT, OutElementT> java.util.Spliterator<OutElementT> flatMap(java.util.Spliterator<InElementT> spliterator, java.util.function.Function<? super InElementT, java.util.Spliterator<OutElementT>> function, int i, long j) {
        com.google.common.base.Preconditions.checkArgument((i & 16384) == 0, "flatMap does not support SUBSIZED characteristic");
        com.google.common.base.Preconditions.checkArgument((i & 4) == 0, "flatMap does not support SORTED characteristic");
        com.google.common.base.Preconditions.checkNotNull(spliterator);
        com.google.common.base.Preconditions.checkNotNull(function);
        return new com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfObject(null, spliterator, function, i, j);
    }

    static <InElementT> java.util.Spliterator.OfInt flatMapToInt(java.util.Spliterator<InElementT> spliterator, java.util.function.Function<? super InElementT, java.util.Spliterator.OfInt> function, int i, long j) {
        com.google.common.base.Preconditions.checkArgument((i & 16384) == 0, "flatMap does not support SUBSIZED characteristic");
        com.google.common.base.Preconditions.checkArgument((i & 4) == 0, "flatMap does not support SORTED characteristic");
        com.google.common.base.Preconditions.checkNotNull(spliterator);
        com.google.common.base.Preconditions.checkNotNull(function);
        return new com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfInt(null, spliterator, function, i, j);
    }

    static <InElementT> java.util.Spliterator.OfLong flatMapToLong(java.util.Spliterator<InElementT> spliterator, java.util.function.Function<? super InElementT, java.util.Spliterator.OfLong> function, int i, long j) {
        com.google.common.base.Preconditions.checkArgument((i & 16384) == 0, "flatMap does not support SUBSIZED characteristic");
        com.google.common.base.Preconditions.checkArgument((i & 4) == 0, "flatMap does not support SORTED characteristic");
        com.google.common.base.Preconditions.checkNotNull(spliterator);
        com.google.common.base.Preconditions.checkNotNull(function);
        return new com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfLong(null, spliterator, function, i, j);
    }

    static <InElementT> java.util.Spliterator.OfDouble flatMapToDouble(java.util.Spliterator<InElementT> spliterator, java.util.function.Function<? super InElementT, java.util.Spliterator.OfDouble> function, int i, long j) {
        com.google.common.base.Preconditions.checkArgument((i & 16384) == 0, "flatMap does not support SUBSIZED characteristic");
        com.google.common.base.Preconditions.checkArgument((i & 4) == 0, "flatMap does not support SORTED characteristic");
        com.google.common.base.Preconditions.checkNotNull(spliterator);
        com.google.common.base.Preconditions.checkNotNull(function);
        return new com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfDouble(null, spliterator, function, i, j);
    }

    static abstract class FlatMapSpliterator<InElementT, OutElementT, OutSpliteratorT extends java.util.Spliterator<OutElementT>> implements java.util.Spliterator<OutElementT> {
        int characteristics;
        long estimatedSize;
        final com.google.common.collect.CollectSpliterators.FlatMapSpliterator.Factory<InElementT, OutSpliteratorT> factory;
        final java.util.Spliterator<InElementT> from;
        final java.util.function.Function<? super InElementT, OutSpliteratorT> function;
        OutSpliteratorT prefix;

        interface Factory<InElementT, OutSpliteratorT extends java.util.Spliterator<?>> {
            OutSpliteratorT newFlatMapSpliterator(OutSpliteratorT outspliteratort, java.util.Spliterator<InElementT> spliterator, java.util.function.Function<? super InElementT, OutSpliteratorT> function, int i, long j);
        }

        FlatMapSpliterator(OutSpliteratorT outspliteratort, java.util.Spliterator<InElementT> spliterator, java.util.function.Function<? super InElementT, OutSpliteratorT> function, com.google.common.collect.CollectSpliterators.FlatMapSpliterator.Factory<InElementT, OutSpliteratorT> factory, int i, long j) {
            this.prefix = outspliteratort;
            this.from = spliterator;
            this.function = function;
            this.factory = factory;
            this.characteristics = i;
            this.estimatedSize = j;
        }

        @Override // java.util.Spliterator
        public boolean tryAdvance(java.util.function.Consumer<? super OutElementT> consumer) {
            do {
                OutSpliteratorT outspliteratort = this.prefix;
                if (outspliteratort != null && outspliteratort.tryAdvance(consumer)) {
                    long j = this.estimatedSize;
                    if (j == Long.MAX_VALUE) {
                        return true;
                    }
                    this.estimatedSize = j - 1;
                    return true;
                }
                this.prefix = null;
            } while (this.from.tryAdvance(new java.util.function.Consumer() { // from class: com.google.common.collect.CollectSpliterators$FlatMapSpliterator$$ExternalSyntheticLambda1
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    com.google.common.collect.CollectSpliterators.FlatMapSpliterator.this.m10311xf1ca5dcf(obj);
                }
            }));
            return false;
        }

        /* renamed from: lambda$tryAdvance$0$com-google-common-collect-CollectSpliterators$FlatMapSpliterator, reason: not valid java name */
        /* synthetic */ void m10311xf1ca5dcf(java.lang.Object obj) {
            this.prefix = this.function.apply(obj);
        }

        @Override // java.util.Spliterator
        public void forEachRemaining(final java.util.function.Consumer<? super OutElementT> consumer) {
            OutSpliteratorT outspliteratort = this.prefix;
            if (outspliteratort != null) {
                outspliteratort.forEachRemaining(consumer);
                this.prefix = null;
            }
            this.from.forEachRemaining(new java.util.function.Consumer() { // from class: com.google.common.collect.CollectSpliterators$FlatMapSpliterator$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    com.google.common.collect.CollectSpliterators.FlatMapSpliterator.this.m10310xe354510a(consumer, obj);
                }
            });
            this.estimatedSize = 0L;
        }

        /* renamed from: lambda$forEachRemaining$0$com-google-common-collect-CollectSpliterators$FlatMapSpliterator, reason: not valid java name */
        /* synthetic */ void m10310xe354510a(java.util.function.Consumer consumer, java.lang.Object obj) {
            OutSpliteratorT apply = this.function.apply(obj);
            if (apply != null) {
                apply.forEachRemaining(consumer);
            }
        }

        @Override // java.util.Spliterator
        public final OutSpliteratorT trySplit() {
            java.util.Spliterator<InElementT> trySplit = this.from.trySplit();
            if (trySplit != null) {
                int i = this.characteristics & (-65);
                long estimateSize = estimateSize();
                if (estimateSize < Long.MAX_VALUE) {
                    estimateSize /= 2;
                    this.estimatedSize -= estimateSize;
                    this.characteristics = i;
                }
                OutSpliteratorT newFlatMapSpliterator = this.factory.newFlatMapSpliterator(this.prefix, trySplit, this.function, i, estimateSize);
                this.prefix = null;
                return newFlatMapSpliterator;
            }
            OutSpliteratorT outspliteratort = this.prefix;
            if (outspliteratort == null) {
                return null;
            }
            this.prefix = null;
            return outspliteratort;
        }

        @Override // java.util.Spliterator
        public final long estimateSize() {
            OutSpliteratorT outspliteratort = this.prefix;
            if (outspliteratort != null) {
                this.estimatedSize = java.lang.Math.max(this.estimatedSize, outspliteratort.estimateSize());
            }
            return java.lang.Math.max(this.estimatedSize, 0L);
        }

        @Override // java.util.Spliterator
        public final int characteristics() {
            return this.characteristics;
        }
    }

    static final class FlatMapSpliteratorOfObject<InElementT, OutElementT> extends com.google.common.collect.CollectSpliterators.FlatMapSpliterator<InElementT, OutElementT, java.util.Spliterator<OutElementT>> {
        FlatMapSpliteratorOfObject(java.util.Spliterator<OutElementT> spliterator, java.util.Spliterator<InElementT> spliterator2, java.util.function.Function<? super InElementT, java.util.Spliterator<OutElementT>> function, int i, long j) {
            super(spliterator, spliterator2, function, new com.google.common.collect.CollectSpliterators.FlatMapSpliterator.Factory() { // from class: com.google.common.collect.CollectSpliterators$FlatMapSpliteratorOfObject$$ExternalSyntheticLambda0
                @Override // com.google.common.collect.CollectSpliterators.FlatMapSpliterator.Factory
                public final java.util.Spliterator newFlatMapSpliterator(java.util.Spliterator spliterator3, java.util.Spliterator spliterator4, java.util.function.Function function2, int i2, long j2) {
                    return new com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfObject(spliterator3, spliterator4, function2, i2, j2);
                }
            }, i, j);
        }
    }

    static abstract class FlatMapSpliteratorOfPrimitive<InElementT, OutElementT, OutConsumerT, OutSpliteratorT extends java.util.Spliterator.OfPrimitive<OutElementT, OutConsumerT, OutSpliteratorT>> extends com.google.common.collect.CollectSpliterators.FlatMapSpliterator<InElementT, OutElementT, OutSpliteratorT> implements java.util.Spliterator.OfPrimitive<OutElementT, OutConsumerT, OutSpliteratorT> {
        @Override // com.google.common.collect.CollectSpliterators.FlatMapSpliterator, java.util.Spliterator
        public /* bridge */ /* synthetic */ java.util.Spliterator.OfPrimitive trySplit() {
            return (java.util.Spliterator.OfPrimitive) super.trySplit();
        }

        FlatMapSpliteratorOfPrimitive(OutSpliteratorT outspliteratort, java.util.Spliterator<InElementT> spliterator, java.util.function.Function<? super InElementT, OutSpliteratorT> function, com.google.common.collect.CollectSpliterators.FlatMapSpliterator.Factory<InElementT, OutSpliteratorT> factory, int i, long j) {
            super(outspliteratort, spliterator, function, factory, i, j);
        }

        @Override // java.util.Spliterator.OfPrimitive
        public final boolean tryAdvance(OutConsumerT outconsumert) {
            do {
                if (this.prefix != 0 && ((java.util.Spliterator.OfPrimitive) this.prefix).tryAdvance((java.util.Spliterator.OfPrimitive) outconsumert)) {
                    if (this.estimatedSize == Long.MAX_VALUE) {
                        return true;
                    }
                    this.estimatedSize--;
                    return true;
                }
                this.prefix = null;
            } while (this.from.tryAdvance(new java.util.function.Consumer() { // from class: com.google.common.collect.CollectSpliterators$FlatMapSpliteratorOfPrimitive$$ExternalSyntheticLambda1
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfPrimitive.this.m10313xff99a381(obj);
                }
            }));
            return false;
        }

        /* renamed from: lambda$tryAdvance$0$com-google-common-collect-CollectSpliterators$FlatMapSpliteratorOfPrimitive, reason: not valid java name */
        /* synthetic */ void m10313xff99a381(java.lang.Object obj) {
            this.prefix = (OutSpliteratorT) this.function.apply(obj);
        }

        @Override // java.util.Spliterator.OfPrimitive
        public final void forEachRemaining(final OutConsumerT outconsumert) {
            if (this.prefix != 0) {
                ((java.util.Spliterator.OfPrimitive) this.prefix).forEachRemaining((java.util.Spliterator.OfPrimitive) outconsumert);
                this.prefix = null;
            }
            this.from.forEachRemaining(new java.util.function.Consumer() { // from class: com.google.common.collect.CollectSpliterators$FlatMapSpliteratorOfPrimitive$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfPrimitive.this.m10312x545aed66(outconsumert, obj);
                }
            });
            this.estimatedSize = 0L;
        }

        /* renamed from: lambda$forEachRemaining$0$com-google-common-collect-CollectSpliterators$FlatMapSpliteratorOfPrimitive, reason: not valid java name */
        /* synthetic */ void m10312x545aed66(java.lang.Object obj, java.lang.Object obj2) {
            java.util.Spliterator.OfPrimitive ofPrimitive = (java.util.Spliterator.OfPrimitive) this.function.apply(obj2);
            if (ofPrimitive != null) {
                ofPrimitive.forEachRemaining((java.util.Spliterator.OfPrimitive) obj);
            }
        }
    }

    static final class FlatMapSpliteratorOfInt<InElementT> extends com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfPrimitive<InElementT, java.lang.Integer, java.util.function.IntConsumer, java.util.Spliterator.OfInt> implements java.util.Spliterator.OfInt {
        @Override // java.util.Spliterator.OfInt
        public final /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.IntConsumer intConsumer) {
            super.forEachRemaining((com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfInt<InElementT>) intConsumer);
        }

        @Override // java.util.Spliterator.OfInt
        public final /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.IntConsumer intConsumer) {
            return super.tryAdvance((com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfInt<InElementT>) intConsumer);
        }

        @Override // com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfPrimitive, com.google.common.collect.CollectSpliterators.FlatMapSpliterator, java.util.Spliterator
        public final /* bridge */ /* synthetic */ java.util.Spliterator.OfInt trySplit() {
            return (java.util.Spliterator.OfInt) super.trySplit();
        }

        FlatMapSpliteratorOfInt(java.util.Spliterator.OfInt ofInt, java.util.Spliterator<InElementT> spliterator, java.util.function.Function<? super InElementT, java.util.Spliterator.OfInt> function, int i, long j) {
            super(ofInt, spliterator, function, new com.google.common.collect.CollectSpliterators.FlatMapSpliterator.Factory() { // from class: com.google.common.collect.CollectSpliterators$FlatMapSpliteratorOfInt$$ExternalSyntheticLambda0
                @Override // com.google.common.collect.CollectSpliterators.FlatMapSpliterator.Factory
                public final java.util.Spliterator newFlatMapSpliterator(java.util.Spliterator spliterator2, java.util.Spliterator spliterator3, java.util.function.Function function2, int i2, long j2) {
                    return new com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfInt((java.util.Spliterator.OfInt) spliterator2, spliterator3, function2, i2, j2);
                }
            }, i, j);
        }
    }

    static final class FlatMapSpliteratorOfLong<InElementT> extends com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfPrimitive<InElementT, java.lang.Long, java.util.function.LongConsumer, java.util.Spliterator.OfLong> implements java.util.Spliterator.OfLong {
        @Override // java.util.Spliterator.OfLong
        public final /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.LongConsumer longConsumer) {
            super.forEachRemaining((com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfLong<InElementT>) longConsumer);
        }

        @Override // java.util.Spliterator.OfLong
        public final /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.LongConsumer longConsumer) {
            return super.tryAdvance((com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfLong<InElementT>) longConsumer);
        }

        @Override // com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfPrimitive, com.google.common.collect.CollectSpliterators.FlatMapSpliterator, java.util.Spliterator
        public final /* bridge */ /* synthetic */ java.util.Spliterator.OfLong trySplit() {
            return (java.util.Spliterator.OfLong) super.trySplit();
        }

        FlatMapSpliteratorOfLong(java.util.Spliterator.OfLong ofLong, java.util.Spliterator<InElementT> spliterator, java.util.function.Function<? super InElementT, java.util.Spliterator.OfLong> function, int i, long j) {
            super(ofLong, spliterator, function, new com.google.common.collect.CollectSpliterators.FlatMapSpliterator.Factory() { // from class: com.google.common.collect.CollectSpliterators$FlatMapSpliteratorOfLong$$ExternalSyntheticLambda0
                @Override // com.google.common.collect.CollectSpliterators.FlatMapSpliterator.Factory
                public final java.util.Spliterator newFlatMapSpliterator(java.util.Spliterator spliterator2, java.util.Spliterator spliterator3, java.util.function.Function function2, int i2, long j2) {
                    return new com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfLong((java.util.Spliterator.OfLong) spliterator2, spliterator3, function2, i2, j2);
                }
            }, i, j);
        }
    }

    static final class FlatMapSpliteratorOfDouble<InElementT> extends com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfPrimitive<InElementT, java.lang.Double, java.util.function.DoubleConsumer, java.util.Spliterator.OfDouble> implements java.util.Spliterator.OfDouble {
        @Override // java.util.Spliterator.OfDouble
        public final /* bridge */ /* synthetic */ void forEachRemaining(java.util.function.DoubleConsumer doubleConsumer) {
            super.forEachRemaining((com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfDouble<InElementT>) doubleConsumer);
        }

        @Override // java.util.Spliterator.OfDouble
        public final /* bridge */ /* synthetic */ boolean tryAdvance(java.util.function.DoubleConsumer doubleConsumer) {
            return super.tryAdvance((com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfDouble<InElementT>) doubleConsumer);
        }

        @Override // com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfPrimitive, com.google.common.collect.CollectSpliterators.FlatMapSpliterator, java.util.Spliterator
        public final /* bridge */ /* synthetic */ java.util.Spliterator.OfDouble trySplit() {
            return (java.util.Spliterator.OfDouble) super.trySplit();
        }

        FlatMapSpliteratorOfDouble(java.util.Spliterator.OfDouble ofDouble, java.util.Spliterator<InElementT> spliterator, java.util.function.Function<? super InElementT, java.util.Spliterator.OfDouble> function, int i, long j) {
            super(ofDouble, spliterator, function, new com.google.common.collect.CollectSpliterators.FlatMapSpliterator.Factory() { // from class: com.google.common.collect.CollectSpliterators$FlatMapSpliteratorOfDouble$$ExternalSyntheticLambda0
                @Override // com.google.common.collect.CollectSpliterators.FlatMapSpliterator.Factory
                public final java.util.Spliterator newFlatMapSpliterator(java.util.Spliterator spliterator2, java.util.Spliterator spliterator3, java.util.function.Function function2, int i2, long j2) {
                    return new com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfDouble((java.util.Spliterator.OfDouble) spliterator2, spliterator3, function2, i2, j2);
                }
            }, i, j);
        }
    }
}
