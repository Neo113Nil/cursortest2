package com.google.common.base;

@com.google.errorprone.annotations.DoNotMock("Use Optional.of(value) or Optional.absent()")
/* loaded from: classes4.dex */
public abstract class Optional<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;

    public abstract java.util.Set<T> asSet();

    public abstract boolean equals(java.lang.Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract com.google.common.base.Optional<T> or(com.google.common.base.Optional<? extends T> optional);

    public abstract T or(com.google.common.base.Supplier<? extends T> supplier);

    public abstract T or(T t);

    public abstract T orNull();

    public abstract java.lang.String toString();

    public abstract <V> com.google.common.base.Optional<V> transform(com.google.common.base.Function<? super T, V> function);

    public static <T> com.google.common.base.Optional<T> absent() {
        return com.google.common.base.Absent.withType();
    }

    public static <T> com.google.common.base.Optional<T> of(T t) {
        return new com.google.common.base.Present(com.google.common.base.Preconditions.checkNotNull(t));
    }

    public static <T> com.google.common.base.Optional<T> fromNullable(T t) {
        return t == null ? absent() : new com.google.common.base.Present(t);
    }

    public static <T> com.google.common.base.Optional<T> fromJavaUtil(java.util.Optional<T> optional) {
        if (optional == null) {
            return null;
        }
        return fromNullable(optional.orElse(null));
    }

    public static <T> java.util.Optional<T> toJavaUtil(com.google.common.base.Optional<T> optional) {
        if (optional == null) {
            return null;
        }
        return optional.toJavaUtil();
    }

    public java.util.Optional<T> toJavaUtil() {
        return java.util.Optional.ofNullable(orNull());
    }

    Optional() {
    }

    public static <T> java.lang.Iterable<T> presentInstances(final java.lang.Iterable<? extends com.google.common.base.Optional<? extends T>> iterable) {
        com.google.common.base.Preconditions.checkNotNull(iterable);
        return new java.lang.Iterable() { // from class: com.google.common.base.Optional$$ExternalSyntheticLambda0
            @Override // java.lang.Iterable
            public final java.util.Iterator iterator() {
                return com.google.common.base.Optional.lambda$presentInstances$0(iterable);
            }
        };
    }

    static /* synthetic */ java.util.Iterator lambda$presentInstances$0(java.lang.Iterable iterable) {
        return new com.google.common.base.AbstractIterator<T>(iterable) { // from class: com.google.common.base.Optional.1
            private final java.util.Iterator<? extends com.google.common.base.Optional<? extends T>> iterator;
            final /* synthetic */ java.lang.Iterable val$optionals;

            {
                this.val$optionals = iterable;
                this.iterator = (java.util.Iterator) com.google.common.base.Preconditions.checkNotNull(iterable.iterator());
            }

            @Override // com.google.common.base.AbstractIterator
            protected T computeNext() {
                while (this.iterator.hasNext()) {
                    com.google.common.base.Optional<? extends T> next = this.iterator.next();
                    if (next.isPresent()) {
                        return next.get();
                    }
                }
                return endOfData();
            }
        };
    }
}
