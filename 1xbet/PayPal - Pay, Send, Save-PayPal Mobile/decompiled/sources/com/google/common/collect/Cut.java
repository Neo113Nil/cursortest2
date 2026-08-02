package com.google.common.collect;

/* loaded from: classes9.dex */
abstract class Cut<C extends java.lang.Comparable> implements java.lang.Comparable<com.google.common.collect.Cut<C>>, java.io.Serializable {
    private static final long serialVersionUID = 0;
    final C endpoint;

    com.google.common.collect.Cut<C> canonical(com.google.common.collect.DiscreteDomain<C> discreteDomain) {
        return this;
    }

    abstract void describeAsLowerBound(java.lang.StringBuilder sb);

    abstract void describeAsUpperBound(java.lang.StringBuilder sb);

    abstract C greatestValueBelow(com.google.common.collect.DiscreteDomain<C> discreteDomain);

    public abstract int hashCode();

    abstract boolean isLessThan(C c);

    abstract C leastValueAbove(com.google.common.collect.DiscreteDomain<C> discreteDomain);

    abstract com.google.common.collect.BoundType typeAsLowerBound();

    abstract com.google.common.collect.BoundType typeAsUpperBound();

    abstract com.google.common.collect.Cut<C> withLowerBoundType(com.google.common.collect.BoundType boundType, com.google.common.collect.DiscreteDomain<C> discreteDomain);

    abstract com.google.common.collect.Cut<C> withUpperBoundType(com.google.common.collect.BoundType boundType, com.google.common.collect.DiscreteDomain<C> discreteDomain);

    Cut(C c) {
        this.endpoint = c;
    }

    @Override // java.lang.Comparable
    public int compareTo(com.google.common.collect.Cut<C> cut) {
        if (cut == belowAll()) {
            return 1;
        }
        if (cut == aboveAll()) {
            return -1;
        }
        int compareOrThrow = com.google.common.collect.Range.compareOrThrow(this.endpoint, cut.endpoint);
        return compareOrThrow != 0 ? compareOrThrow : java.lang.Boolean.compare(this instanceof com.google.common.collect.Cut.AboveValue, cut instanceof com.google.common.collect.Cut.AboveValue);
    }

    C endpoint() {
        return this.endpoint;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.common.collect.Cut)) {
            return false;
        }
        try {
            return compareTo((com.google.common.collect.Cut) obj) == 0;
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }

    static <C extends java.lang.Comparable> com.google.common.collect.Cut<C> belowAll() {
        return com.google.common.collect.Cut.BelowAll.INSTANCE;
    }

    static final class BelowAll extends com.google.common.collect.Cut<java.lang.Comparable<?>> {
        private static final com.google.common.collect.Cut.BelowAll INSTANCE = new com.google.common.collect.Cut.BelowAll();
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final int compareTo(com.google.common.collect.Cut<java.lang.Comparable<?>> cut) {
            return cut == this ? 0 : -1;
        }

        @Override // com.google.common.collect.Cut
        final boolean isLessThan(java.lang.Comparable<?> comparable) {
            return true;
        }

        private BelowAll() {
            super("");
        }

        @Override // com.google.common.collect.Cut
        final java.lang.Comparable<?> endpoint() {
            throw new java.lang.IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.Cut
        final com.google.common.collect.BoundType typeAsLowerBound() {
            throw new java.lang.IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        final com.google.common.collect.BoundType typeAsUpperBound() {
            throw new java.lang.AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        final com.google.common.collect.Cut<java.lang.Comparable<?>> withLowerBoundType(com.google.common.collect.BoundType boundType, com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> discreteDomain) {
            throw new java.lang.IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        final com.google.common.collect.Cut<java.lang.Comparable<?>> withUpperBoundType(com.google.common.collect.BoundType boundType, com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> discreteDomain) {
            throw new java.lang.AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        final void describeAsLowerBound(java.lang.StringBuilder sb) {
            sb.append("(-∞");
        }

        @Override // com.google.common.collect.Cut
        final void describeAsUpperBound(java.lang.StringBuilder sb) {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.Cut
        final java.lang.Comparable<?> leastValueAbove(com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> discreteDomain) {
            return discreteDomain.minValue();
        }

        @Override // com.google.common.collect.Cut
        final java.lang.Comparable<?> greatestValueBelow(com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> discreteDomain) {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.Cut
        final com.google.common.collect.Cut<java.lang.Comparable<?>> canonical(com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> discreteDomain) {
            try {
                return com.google.common.collect.Cut.belowValue(discreteDomain.minValue());
            } catch (java.util.NoSuchElementException unused) {
                return this;
            }
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return java.lang.System.identityHashCode(this);
        }

        public final java.lang.String toString() {
            return "-∞";
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }
    }

    static <C extends java.lang.Comparable> com.google.common.collect.Cut<C> aboveAll() {
        return com.google.common.collect.Cut.AboveAll.INSTANCE;
    }

    static final class AboveAll extends com.google.common.collect.Cut<java.lang.Comparable<?>> {
        private static final com.google.common.collect.Cut.AboveAll INSTANCE = new com.google.common.collect.Cut.AboveAll();
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final int compareTo(com.google.common.collect.Cut<java.lang.Comparable<?>> cut) {
            return cut == this ? 0 : 1;
        }

        @Override // com.google.common.collect.Cut
        final boolean isLessThan(java.lang.Comparable<?> comparable) {
            return false;
        }

        private AboveAll() {
            super("");
        }

        @Override // com.google.common.collect.Cut
        final java.lang.Comparable<?> endpoint() {
            throw new java.lang.IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.Cut
        final com.google.common.collect.BoundType typeAsLowerBound() {
            throw new java.lang.AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        final com.google.common.collect.BoundType typeAsUpperBound() {
            throw new java.lang.IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        final com.google.common.collect.Cut<java.lang.Comparable<?>> withLowerBoundType(com.google.common.collect.BoundType boundType, com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> discreteDomain) {
            throw new java.lang.AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        final com.google.common.collect.Cut<java.lang.Comparable<?>> withUpperBoundType(com.google.common.collect.BoundType boundType, com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> discreteDomain) {
            throw new java.lang.IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        final void describeAsLowerBound(java.lang.StringBuilder sb) {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.Cut
        final void describeAsUpperBound(java.lang.StringBuilder sb) {
            sb.append("+∞)");
        }

        @Override // com.google.common.collect.Cut
        final java.lang.Comparable<?> leastValueAbove(com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> discreteDomain) {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.Cut
        final java.lang.Comparable<?> greatestValueBelow(com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> discreteDomain) {
            return discreteDomain.maxValue();
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return java.lang.System.identityHashCode(this);
        }

        public final java.lang.String toString() {
            return "+∞";
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }
    }

    static <C extends java.lang.Comparable> com.google.common.collect.Cut<C> belowValue(C c) {
        return new com.google.common.collect.Cut.BelowValue(c);
    }

    static final class BelowValue<C extends java.lang.Comparable> extends com.google.common.collect.Cut<C> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
            return super.compareTo((com.google.common.collect.Cut) obj);
        }

        BelowValue(C c) {
            super((java.lang.Comparable) com.google.common.base.Preconditions.checkNotNull(c));
        }

        @Override // com.google.common.collect.Cut
        final boolean isLessThan(C c) {
            return com.google.common.collect.Range.compareOrThrow(this.endpoint, c) <= 0;
        }

        @Override // com.google.common.collect.Cut
        final com.google.common.collect.BoundType typeAsLowerBound() {
            return com.google.common.collect.BoundType.CLOSED;
        }

        @Override // com.google.common.collect.Cut
        final com.google.common.collect.BoundType typeAsUpperBound() {
            return com.google.common.collect.BoundType.OPEN;
        }

        @Override // com.google.common.collect.Cut
        final com.google.common.collect.Cut<C> withLowerBoundType(com.google.common.collect.BoundType boundType, com.google.common.collect.DiscreteDomain<C> discreteDomain) {
            int i = com.google.common.collect.Cut.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType[boundType.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i == 2) {
                C previous = discreteDomain.previous(this.endpoint);
                return previous == null ? com.google.common.collect.Cut.belowAll() : new com.google.common.collect.Cut.AboveValue(previous);
            }
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.Cut
        final com.google.common.collect.Cut<C> withUpperBoundType(com.google.common.collect.BoundType boundType, com.google.common.collect.DiscreteDomain<C> discreteDomain) {
            int i = com.google.common.collect.Cut.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType[boundType.ordinal()];
            if (i == 1) {
                C previous = discreteDomain.previous(this.endpoint);
                return previous == null ? com.google.common.collect.Cut.aboveAll() : new com.google.common.collect.Cut.AboveValue(previous);
            }
            if (i == 2) {
                return this;
            }
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.Cut
        final void describeAsLowerBound(java.lang.StringBuilder sb) {
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(this.endpoint);
        }

        @Override // com.google.common.collect.Cut
        final void describeAsUpperBound(java.lang.StringBuilder sb) {
            sb.append(this.endpoint);
            sb.append(')');
        }

        @Override // com.google.common.collect.Cut
        final C leastValueAbove(com.google.common.collect.DiscreteDomain<C> discreteDomain) {
            return this.endpoint;
        }

        @Override // com.google.common.collect.Cut
        final C greatestValueBelow(com.google.common.collect.DiscreteDomain<C> discreteDomain) {
            return discreteDomain.previous(this.endpoint);
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return this.endpoint.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("\\");
            sb.append(this.endpoint);
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.collect.Cut$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$BoundType;

        static {
            int[] iArr = new int[com.google.common.collect.BoundType.values().length];
            $SwitchMap$com$google$common$collect$BoundType = iArr;
            try {
                iArr[com.google.common.collect.BoundType.CLOSED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$collect$BoundType[com.google.common.collect.BoundType.OPEN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    static <C extends java.lang.Comparable> com.google.common.collect.Cut<C> aboveValue(C c) {
        return new com.google.common.collect.Cut.AboveValue(c);
    }

    static final class AboveValue<C extends java.lang.Comparable> extends com.google.common.collect.Cut<C> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
            return super.compareTo((com.google.common.collect.Cut) obj);
        }

        AboveValue(C c) {
            super((java.lang.Comparable) com.google.common.base.Preconditions.checkNotNull(c));
        }

        @Override // com.google.common.collect.Cut
        final boolean isLessThan(C c) {
            return com.google.common.collect.Range.compareOrThrow(this.endpoint, c) < 0;
        }

        @Override // com.google.common.collect.Cut
        final com.google.common.collect.BoundType typeAsLowerBound() {
            return com.google.common.collect.BoundType.OPEN;
        }

        @Override // com.google.common.collect.Cut
        final com.google.common.collect.BoundType typeAsUpperBound() {
            return com.google.common.collect.BoundType.CLOSED;
        }

        @Override // com.google.common.collect.Cut
        final com.google.common.collect.Cut<C> withLowerBoundType(com.google.common.collect.BoundType boundType, com.google.common.collect.DiscreteDomain<C> discreteDomain) {
            int i = com.google.common.collect.Cut.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType[boundType.ordinal()];
            if (i == 1) {
                C next = discreteDomain.next(this.endpoint);
                return next == null ? com.google.common.collect.Cut.belowAll() : belowValue(next);
            }
            if (i == 2) {
                return this;
            }
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.Cut
        final com.google.common.collect.Cut<C> withUpperBoundType(com.google.common.collect.BoundType boundType, com.google.common.collect.DiscreteDomain<C> discreteDomain) {
            int i = com.google.common.collect.Cut.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType[boundType.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i == 2) {
                C next = discreteDomain.next(this.endpoint);
                return next == null ? com.google.common.collect.Cut.aboveAll() : belowValue(next);
            }
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.Cut
        final void describeAsLowerBound(java.lang.StringBuilder sb) {
            sb.append('(');
            sb.append(this.endpoint);
        }

        @Override // com.google.common.collect.Cut
        final void describeAsUpperBound(java.lang.StringBuilder sb) {
            sb.append(this.endpoint);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        }

        @Override // com.google.common.collect.Cut
        final C leastValueAbove(com.google.common.collect.DiscreteDomain<C> discreteDomain) {
            return discreteDomain.next(this.endpoint);
        }

        @Override // com.google.common.collect.Cut
        final C greatestValueBelow(com.google.common.collect.DiscreteDomain<C> discreteDomain) {
            return this.endpoint;
        }

        @Override // com.google.common.collect.Cut
        final com.google.common.collect.Cut<C> canonical(com.google.common.collect.DiscreteDomain<C> discreteDomain) {
            C leastValueAbove = leastValueAbove(discreteDomain);
            return leastValueAbove != null ? belowValue(leastValueAbove) : com.google.common.collect.Cut.aboveAll();
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return ~this.endpoint.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            sb.append(this.endpoint);
            sb.append("\\");
            return sb.toString();
        }
    }
}
