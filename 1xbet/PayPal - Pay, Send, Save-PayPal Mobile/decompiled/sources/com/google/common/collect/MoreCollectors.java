package com.google.common.collect;

/* loaded from: classes9.dex */
public final class MoreCollectors {
    private static final java.util.stream.Collector<java.lang.Object, ?, java.util.Optional<java.lang.Object>> TO_OPTIONAL = java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda0
        @Override // java.util.function.Supplier
        public final java.lang.Object get() {
            return new com.google.common.collect.MoreCollectors.ToOptionalState();
        }
    }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda1
        @Override // java.util.function.BiConsumer
        public final void accept(java.lang.Object obj, java.lang.Object obj2) {
            ((com.google.common.collect.MoreCollectors.ToOptionalState) obj).add(obj2);
        }
    }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda2
        @Override // java.util.function.BiFunction
        public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
            return ((com.google.common.collect.MoreCollectors.ToOptionalState) obj).combine((com.google.common.collect.MoreCollectors.ToOptionalState) obj2);
        }
    }, new java.util.function.Function() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda3
        @Override // java.util.function.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            return ((com.google.common.collect.MoreCollectors.ToOptionalState) obj).getOptional();
        }
    }, java.util.stream.Collector.Characteristics.UNORDERED);
    private static final java.lang.Object NULL_PLACEHOLDER = new java.lang.Object();
    private static final java.util.stream.Collector<java.lang.Object, ?, java.lang.Object> ONLY_ELEMENT = java.util.stream.Collector.of(new java.util.function.Supplier() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda0
        @Override // java.util.function.Supplier
        public final java.lang.Object get() {
            return new com.google.common.collect.MoreCollectors.ToOptionalState();
        }
    }, new java.util.function.BiConsumer() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda4
        @Override // java.util.function.BiConsumer
        public final void accept(java.lang.Object obj, java.lang.Object obj2) {
            com.google.common.collect.MoreCollectors.lambda$static$0((com.google.common.collect.MoreCollectors.ToOptionalState) obj, obj2);
        }
    }, new java.util.function.BinaryOperator() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda2
        @Override // java.util.function.BiFunction
        public final java.lang.Object apply(java.lang.Object obj, java.lang.Object obj2) {
            return ((com.google.common.collect.MoreCollectors.ToOptionalState) obj).combine((com.google.common.collect.MoreCollectors.ToOptionalState) obj2);
        }
    }, new java.util.function.Function() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda5
        @Override // java.util.function.Function
        public final java.lang.Object apply(java.lang.Object obj) {
            return com.google.common.collect.MoreCollectors.lambda$static$1((com.google.common.collect.MoreCollectors.ToOptionalState) obj);
        }
    }, java.util.stream.Collector.Characteristics.UNORDERED);

    public static <T> java.util.stream.Collector<T, ?, java.util.Optional<T>> toOptional() {
        return (java.util.stream.Collector<T, ?, java.util.Optional<T>>) TO_OPTIONAL;
    }

    static /* synthetic */ void lambda$static$0(com.google.common.collect.MoreCollectors.ToOptionalState toOptionalState, java.lang.Object obj) {
        if (obj == null) {
            obj = NULL_PLACEHOLDER;
        }
        toOptionalState.add(obj);
    }

    static /* synthetic */ java.lang.Object lambda$static$1(com.google.common.collect.MoreCollectors.ToOptionalState toOptionalState) {
        java.lang.Object element = toOptionalState.getElement();
        if (element == NULL_PLACEHOLDER) {
            return null;
        }
        return element;
    }

    public static <T> java.util.stream.Collector<T, ?, T> onlyElement() {
        return (java.util.stream.Collector<T, ?, T>) ONLY_ELEMENT;
    }

    static final class ToOptionalState {
        static final int MAX_EXTRAS = 4;
        java.lang.Object element = null;
        java.util.List<java.lang.Object> extras = java.util.Collections.emptyList();

        ToOptionalState() {
        }

        final java.lang.IllegalArgumentException multiples(boolean z) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("expected one element but was: <");
            sb.append(this.element);
            for (java.lang.Object obj : this.extras) {
                sb.append(", ");
                sb.append(obj);
            }
            if (z) {
                sb.append(", ...");
            }
            sb.append(kotlin.text.Typography.greater);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }

        final void add(java.lang.Object obj) {
            com.google.common.base.Preconditions.checkNotNull(obj);
            if (this.element == null) {
                this.element = obj;
                return;
            }
            if (this.extras.isEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList(4);
                this.extras = arrayList;
                arrayList.add(obj);
            } else {
                if (this.extras.size() < 4) {
                    this.extras.add(obj);
                    return;
                }
                throw multiples(true);
            }
        }

        final com.google.common.collect.MoreCollectors.ToOptionalState combine(com.google.common.collect.MoreCollectors.ToOptionalState toOptionalState) {
            if (this.element == null) {
                return toOptionalState;
            }
            if (toOptionalState.element != null) {
                if (this.extras.isEmpty()) {
                    this.extras = new java.util.ArrayList();
                }
                this.extras.add(toOptionalState.element);
                this.extras.addAll(toOptionalState.extras);
                if (this.extras.size() > 4) {
                    java.util.List<java.lang.Object> list = this.extras;
                    list.subList(4, list.size()).clear();
                    throw multiples(true);
                }
            }
            return this;
        }

        final java.util.Optional<java.lang.Object> getOptional() {
            if (this.extras.isEmpty()) {
                return java.util.Optional.ofNullable(this.element);
            }
            throw multiples(false);
        }

        final java.lang.Object getElement() {
            if (this.element == null) {
                throw new java.util.NoSuchElementException();
            }
            if (this.extras.isEmpty()) {
                return this.element;
            }
            throw multiples(false);
        }
    }

    private MoreCollectors() {
    }
}
