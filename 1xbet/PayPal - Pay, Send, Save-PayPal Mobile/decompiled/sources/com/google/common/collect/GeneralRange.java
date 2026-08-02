package com.google.common.collect;

/* loaded from: classes9.dex */
final class GeneralRange<T> implements java.io.Serializable {
    private final java.util.Comparator<? super T> comparator;
    private final boolean hasLowerBound;
    private final boolean hasUpperBound;
    private final com.google.common.collect.BoundType lowerBoundType;
    private final T lowerEndpoint;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.GeneralRange<T> reverse;
    private final com.google.common.collect.BoundType upperBoundType;
    private final T upperEndpoint;

    static <T extends java.lang.Comparable> com.google.common.collect.GeneralRange<T> from(com.google.common.collect.Range<T> range) {
        return new com.google.common.collect.GeneralRange<>(com.google.common.collect.Ordering.natural(), range.hasLowerBound(), range.hasLowerBound() ? range.lowerEndpoint() : null, range.hasLowerBound() ? range.lowerBoundType() : com.google.common.collect.BoundType.OPEN, range.hasUpperBound(), range.hasUpperBound() ? range.upperEndpoint() : null, range.hasUpperBound() ? range.upperBoundType() : com.google.common.collect.BoundType.OPEN);
    }

    static <T> com.google.common.collect.GeneralRange<T> all(java.util.Comparator<? super T> comparator) {
        return new com.google.common.collect.GeneralRange<>(comparator, false, null, com.google.common.collect.BoundType.OPEN, false, null, com.google.common.collect.BoundType.OPEN);
    }

    static <T> com.google.common.collect.GeneralRange<T> downTo(java.util.Comparator<? super T> comparator, T t, com.google.common.collect.BoundType boundType) {
        return new com.google.common.collect.GeneralRange<>(comparator, true, t, boundType, false, null, com.google.common.collect.BoundType.OPEN);
    }

    static <T> com.google.common.collect.GeneralRange<T> upTo(java.util.Comparator<? super T> comparator, T t, com.google.common.collect.BoundType boundType) {
        return new com.google.common.collect.GeneralRange<>(comparator, false, null, com.google.common.collect.BoundType.OPEN, true, t, boundType);
    }

    static <T> com.google.common.collect.GeneralRange<T> range(java.util.Comparator<? super T> comparator, T t, com.google.common.collect.BoundType boundType, T t2, com.google.common.collect.BoundType boundType2) {
        return new com.google.common.collect.GeneralRange<>(comparator, true, t, boundType, true, t2, boundType2);
    }

    private GeneralRange(java.util.Comparator<? super T> comparator, boolean z, T t, com.google.common.collect.BoundType boundType, boolean z2, T t2, com.google.common.collect.BoundType boundType2) {
        this.comparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator);
        this.hasLowerBound = z;
        this.hasUpperBound = z2;
        this.lowerEndpoint = t;
        this.lowerBoundType = (com.google.common.collect.BoundType) com.google.common.base.Preconditions.checkNotNull(boundType);
        this.upperEndpoint = t2;
        this.upperBoundType = (com.google.common.collect.BoundType) com.google.common.base.Preconditions.checkNotNull(boundType2);
        if (z) {
            comparator.compare((java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(t), (java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(t));
        }
        if (z2) {
            comparator.compare((java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(t2), (java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(t2));
        }
        if (z && z2) {
            int compare = comparator.compare((java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(t), (java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(t2));
            com.google.common.base.Preconditions.checkArgument(compare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t, t2);
            if (compare == 0) {
                com.google.common.base.Preconditions.checkArgument((boundType == com.google.common.collect.BoundType.OPEN && boundType2 == com.google.common.collect.BoundType.OPEN) ? false : true);
            }
        }
    }

    final java.util.Comparator<? super T> comparator() {
        return this.comparator;
    }

    final boolean hasLowerBound() {
        return this.hasLowerBound;
    }

    final boolean hasUpperBound() {
        return this.hasUpperBound;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final boolean isEmpty() {
        if (hasUpperBound() && tooLow(com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(getUpperEndpoint()))) {
            return true;
        }
        return hasLowerBound() && tooHigh(com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(getLowerEndpoint()));
    }

    final boolean tooLow(T t) {
        if (!hasLowerBound()) {
            return false;
        }
        int compare = this.comparator.compare(t, com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(getLowerEndpoint()));
        return ((compare == 0) & (getLowerBoundType() == com.google.common.collect.BoundType.OPEN)) | (compare < 0);
    }

    final boolean tooHigh(T t) {
        if (!hasUpperBound()) {
            return false;
        }
        int compare = this.comparator.compare(t, com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(getUpperEndpoint()));
        return ((compare == 0) & (getUpperBoundType() == com.google.common.collect.BoundType.OPEN)) | (compare > 0);
    }

    final boolean contains(T t) {
        return (tooLow(t) || tooHigh(t)) ? false : true;
    }

    final com.google.common.collect.GeneralRange<T> intersect(com.google.common.collect.GeneralRange<T> generalRange) {
        int compare;
        int compare2;
        T t;
        com.google.common.collect.BoundType boundType;
        com.google.common.collect.BoundType boundType2;
        int compare3;
        com.google.common.base.Preconditions.checkNotNull(generalRange);
        com.google.common.base.Preconditions.checkArgument(this.comparator.equals(generalRange.comparator));
        boolean z = this.hasLowerBound;
        T lowerEndpoint = getLowerEndpoint();
        com.google.common.collect.BoundType lowerBoundType = getLowerBoundType();
        if (!hasLowerBound()) {
            z = generalRange.hasLowerBound;
            lowerEndpoint = generalRange.getLowerEndpoint();
            lowerBoundType = generalRange.getLowerBoundType();
        } else if (generalRange.hasLowerBound() && ((compare = this.comparator.compare(getLowerEndpoint(), generalRange.getLowerEndpoint())) < 0 || (compare == 0 && generalRange.getLowerBoundType() == com.google.common.collect.BoundType.OPEN))) {
            lowerEndpoint = generalRange.getLowerEndpoint();
            lowerBoundType = generalRange.getLowerBoundType();
        }
        boolean z2 = z;
        boolean z3 = this.hasUpperBound;
        T upperEndpoint = getUpperEndpoint();
        com.google.common.collect.BoundType upperBoundType = getUpperBoundType();
        if (!hasUpperBound()) {
            z3 = generalRange.hasUpperBound;
            upperEndpoint = generalRange.getUpperEndpoint();
            upperBoundType = generalRange.getUpperBoundType();
        } else if (generalRange.hasUpperBound() && ((compare2 = this.comparator.compare(getUpperEndpoint(), generalRange.getUpperEndpoint())) > 0 || (compare2 == 0 && generalRange.getUpperBoundType() == com.google.common.collect.BoundType.OPEN))) {
            upperEndpoint = generalRange.getUpperEndpoint();
            upperBoundType = generalRange.getUpperBoundType();
        }
        boolean z4 = z3;
        T t2 = upperEndpoint;
        if (z2 && z4 && ((compare3 = this.comparator.compare(lowerEndpoint, t2)) > 0 || (compare3 == 0 && lowerBoundType == com.google.common.collect.BoundType.OPEN && upperBoundType == com.google.common.collect.BoundType.OPEN))) {
            boundType = com.google.common.collect.BoundType.OPEN;
            boundType2 = com.google.common.collect.BoundType.CLOSED;
            t = t2;
        } else {
            t = lowerEndpoint;
            boundType = lowerBoundType;
            boundType2 = upperBoundType;
        }
        return new com.google.common.collect.GeneralRange<>(this.comparator, z2, t, boundType, z4, t2, boundType2);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.common.collect.GeneralRange)) {
            return false;
        }
        com.google.common.collect.GeneralRange generalRange = (com.google.common.collect.GeneralRange) obj;
        return this.comparator.equals(generalRange.comparator) && this.hasLowerBound == generalRange.hasLowerBound && this.hasUpperBound == generalRange.hasUpperBound && getLowerBoundType().equals(generalRange.getLowerBoundType()) && getUpperBoundType().equals(generalRange.getUpperBoundType()) && java.util.Objects.equals(getLowerEndpoint(), generalRange.getLowerEndpoint()) && java.util.Objects.equals(getUpperEndpoint(), generalRange.getUpperEndpoint());
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.comparator, getLowerEndpoint(), getLowerBoundType(), getUpperEndpoint(), getUpperBoundType());
    }

    final com.google.common.collect.GeneralRange<T> reverse() {
        com.google.common.collect.GeneralRange<T> generalRange = this.reverse;
        if (generalRange != null) {
            return generalRange;
        }
        com.google.common.collect.GeneralRange<T> generalRange2 = new com.google.common.collect.GeneralRange<>(reverseComparator(this.comparator), this.hasUpperBound, getUpperEndpoint(), getUpperBoundType(), this.hasLowerBound, getLowerEndpoint(), getLowerBoundType());
        generalRange2.reverse = this;
        this.reverse = generalRange2;
        return generalRange2;
    }

    private static <T> java.util.Comparator<T> reverseComparator(java.util.Comparator<T> comparator) {
        return com.google.common.collect.Ordering.from(comparator).reverse();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.comparator);
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(this.lowerBoundType == com.google.common.collect.BoundType.CLOSED ? kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST : '(');
        sb.append(this.hasLowerBound ? this.lowerEndpoint : "-∞");
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        sb.append(this.hasUpperBound ? this.upperEndpoint : "∞");
        sb.append(this.upperBoundType == com.google.common.collect.BoundType.CLOSED ? kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST : ')');
        return sb.toString();
    }

    final T getLowerEndpoint() {
        return this.lowerEndpoint;
    }

    final com.google.common.collect.BoundType getLowerBoundType() {
        return this.lowerBoundType;
    }

    final T getUpperEndpoint() {
        return this.upperEndpoint;
    }

    final com.google.common.collect.BoundType getUpperBoundType() {
        return this.upperBoundType;
    }
}
