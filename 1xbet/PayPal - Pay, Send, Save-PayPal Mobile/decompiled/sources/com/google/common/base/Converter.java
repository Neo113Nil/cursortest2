package com.google.common.base;

/* loaded from: classes9.dex */
public abstract class Converter<A, B> implements com.google.common.base.Function<A, B> {
    private final boolean handleNullAutomatically;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.base.Converter<B, A> reverse;

    protected abstract A doBackward(B b);

    protected abstract B doForward(A a2);

    public Converter() {
        this(true);
    }

    Converter(boolean z) {
        this.handleNullAutomatically = z;
    }

    public final B convert(A a2) {
        return correctedDoForward(a2);
    }

    B correctedDoForward(A a2) {
        if (!this.handleNullAutomatically) {
            return unsafeDoForward(a2);
        }
        if (a2 == null) {
            return null;
        }
        return (B) com.google.common.base.Preconditions.checkNotNull(doForward(a2));
    }

    A correctedDoBackward(B b) {
        if (!this.handleNullAutomatically) {
            return unsafeDoBackward(b);
        }
        if (b == null) {
            return null;
        }
        return (A) com.google.common.base.Preconditions.checkNotNull(doBackward(b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private B unsafeDoForward(A a2) {
        return (B) doForward(com.google.common.base.NullnessCasts.uncheckedCastNullableTToT(a2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private A unsafeDoBackward(B b) {
        return (A) doBackward(com.google.common.base.NullnessCasts.uncheckedCastNullableTToT(b));
    }

    public java.lang.Iterable<B> convertAll(final java.lang.Iterable<? extends A> iterable) {
        com.google.common.base.Preconditions.checkNotNull(iterable, "fromIterable");
        return new java.lang.Iterable() { // from class: com.google.common.base.Converter$$ExternalSyntheticLambda0
            @Override // java.lang.Iterable
            public final java.util.Iterator iterator() {
                return com.google.common.base.Converter.this.m10307lambda$convertAll$0$comgooglecommonbaseConverter(iterable);
            }
        };
    }

    /* renamed from: lambda$convertAll$0$com-google-common-base-Converter, reason: not valid java name */
    /* synthetic */ java.util.Iterator m10307lambda$convertAll$0$comgooglecommonbaseConverter(java.lang.Iterable iterable) {
        return new java.util.Iterator<B>(this, iterable) { // from class: com.google.common.base.Converter.1
            private final java.util.Iterator<? extends A> fromIterator;
            final /* synthetic */ com.google.common.base.Converter this$0;
            final /* synthetic */ java.lang.Iterable val$fromIterable;

            {
                this.val$fromIterable = iterable;
                this.this$0 = this;
                this.fromIterator = iterable.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.fromIterator.hasNext();
            }

            @Override // java.util.Iterator
            public B next() {
                return (B) this.this$0.convert(this.fromIterator.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.fromIterator.remove();
            }
        };
    }

    @com.google.errorprone.annotations.CheckReturnValue
    public com.google.common.base.Converter<B, A> reverse() {
        com.google.common.base.Converter<B, A> converter = this.reverse;
        if (converter != null) {
            return converter;
        }
        com.google.common.base.Converter.ReverseConverter reverseConverter = new com.google.common.base.Converter.ReverseConverter(this);
        this.reverse = reverseConverter;
        return reverseConverter;
    }

    static final class ReverseConverter<A, B> extends com.google.common.base.Converter<B, A> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.Converter<A, B> original;

        ReverseConverter(com.google.common.base.Converter<A, B> converter) {
            this.original = converter;
        }

        @Override // com.google.common.base.Converter
        protected final A doForward(B b) {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.base.Converter
        protected final B doBackward(A a2) {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.base.Converter
        final A correctedDoForward(B b) {
            return this.original.correctedDoBackward(b);
        }

        @Override // com.google.common.base.Converter
        final B correctedDoBackward(A a2) {
            return this.original.correctedDoForward(a2);
        }

        @Override // com.google.common.base.Converter
        public final com.google.common.base.Converter<A, B> reverse() {
            return this.original;
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.base.Converter.ReverseConverter) {
                return this.original.equals(((com.google.common.base.Converter.ReverseConverter) obj).original);
            }
            return false;
        }

        public final int hashCode() {
            return ~this.original.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.original);
            sb.append(".reverse()");
            return sb.toString();
        }
    }

    public final <C> com.google.common.base.Converter<A, C> andThen(com.google.common.base.Converter<B, C> converter) {
        return doAndThen(converter);
    }

    <C> com.google.common.base.Converter<A, C> doAndThen(com.google.common.base.Converter<B, C> converter) {
        return new com.google.common.base.Converter.ConverterComposition(this, (com.google.common.base.Converter) com.google.common.base.Preconditions.checkNotNull(converter));
    }

    static final class ConverterComposition<A, B, C> extends com.google.common.base.Converter<A, C> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.Converter<A, B> first;
        final com.google.common.base.Converter<B, C> second;

        ConverterComposition(com.google.common.base.Converter<A, B> converter, com.google.common.base.Converter<B, C> converter2) {
            this.first = converter;
            this.second = converter2;
        }

        @Override // com.google.common.base.Converter
        protected final C doForward(A a2) {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.base.Converter
        protected final A doBackward(C c) {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.base.Converter
        final C correctedDoForward(A a2) {
            return (C) this.second.correctedDoForward(this.first.correctedDoForward(a2));
        }

        @Override // com.google.common.base.Converter
        final A correctedDoBackward(C c) {
            return (A) this.first.correctedDoBackward(this.second.correctedDoBackward(c));
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.common.base.Converter.ConverterComposition)) {
                return false;
            }
            com.google.common.base.Converter.ConverterComposition converterComposition = (com.google.common.base.Converter.ConverterComposition) obj;
            return this.first.equals(converterComposition.first) && this.second.equals(converterComposition.second);
        }

        public final int hashCode() {
            return (this.first.hashCode() * 31) + this.second.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.first);
            sb.append(".andThen(");
            sb.append(this.second);
            sb.append(")");
            return sb.toString();
        }
    }

    @Override // com.google.common.base.Function
    @java.lang.Deprecated
    public final B apply(A a2) {
        return convert(a2);
    }

    @Override // com.google.common.base.Function
    public boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    public static <A, B> com.google.common.base.Converter<A, B> from(com.google.common.base.Function<? super A, ? extends B> function, com.google.common.base.Function<? super B, ? extends A> function2) {
        return new com.google.common.base.Converter.FunctionBasedConverter(function, function2);
    }

    static final class FunctionBasedConverter<A, B> extends com.google.common.base.Converter<A, B> implements java.io.Serializable {
        private final com.google.common.base.Function<? super B, ? extends A> backwardFunction;
        private final com.google.common.base.Function<? super A, ? extends B> forwardFunction;

        private FunctionBasedConverter(com.google.common.base.Function<? super A, ? extends B> function, com.google.common.base.Function<? super B, ? extends A> function2) {
            this.forwardFunction = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function);
            this.backwardFunction = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function2);
        }

        @Override // com.google.common.base.Converter
        protected final B doForward(A a2) {
            return this.forwardFunction.apply(a2);
        }

        @Override // com.google.common.base.Converter
        protected final A doBackward(B b) {
            return this.backwardFunction.apply(b);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.common.base.Converter.FunctionBasedConverter)) {
                return false;
            }
            com.google.common.base.Converter.FunctionBasedConverter functionBasedConverter = (com.google.common.base.Converter.FunctionBasedConverter) obj;
            return this.forwardFunction.equals(functionBasedConverter.forwardFunction) && this.backwardFunction.equals(functionBasedConverter.backwardFunction);
        }

        public final int hashCode() {
            return (this.forwardFunction.hashCode() * 31) + this.backwardFunction.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Converter.from(");
            sb.append(this.forwardFunction);
            sb.append(", ");
            sb.append(this.backwardFunction);
            sb.append(")");
            return sb.toString();
        }
    }

    public static <T> com.google.common.base.Converter<T, T> identity() {
        return (com.google.common.base.Converter.IdentityConverter) com.google.common.base.Converter.IdentityConverter.INSTANCE;
    }

    static final class IdentityConverter<T> extends com.google.common.base.Converter<T, T> implements java.io.Serializable {
        static final com.google.common.base.Converter<?, ?> INSTANCE = new com.google.common.base.Converter.IdentityConverter();
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Converter
        protected final T doBackward(T t) {
            return t;
        }

        @Override // com.google.common.base.Converter
        protected final T doForward(T t) {
            return t;
        }

        @Override // com.google.common.base.Converter
        public final com.google.common.base.Converter.IdentityConverter<T> reverse() {
            return this;
        }

        private IdentityConverter() {
        }

        @Override // com.google.common.base.Converter
        final <S> com.google.common.base.Converter<T, S> doAndThen(com.google.common.base.Converter<T, S> converter) {
            return (com.google.common.base.Converter) com.google.common.base.Preconditions.checkNotNull(converter, "otherConverter");
        }

        public final java.lang.String toString() {
            return "Converter.identity()";
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }
    }
}
