package com.google.common.collect;

/* loaded from: classes9.dex */
public abstract class ComparisonChain {
    private static final com.google.common.collect.ComparisonChain ACTIVE = new com.google.common.collect.ComparisonChain() { // from class: com.google.common.collect.ComparisonChain.1
        @Override // com.google.common.collect.ComparisonChain
        public int result() {
            return 0;
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(java.lang.Comparable<?> comparable, java.lang.Comparable<?> comparable2) {
            return classify(comparable.compareTo(comparable2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public <T> com.google.common.collect.ComparisonChain compare(T t, T t2, java.util.Comparator<T> comparator) {
            return classify(comparator.compare(t, t2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(int i, int i2) {
            return classify(java.lang.Integer.compare(i, i2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(long j, long j2) {
            return classify(java.lang.Long.compare(j, j2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(float f, float f2) {
            return classify(java.lang.Float.compare(f, f2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compare(double d, double d2) {
            return classify(java.lang.Double.compare(d, d2));
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compareTrueFirst(boolean z, boolean z2) {
            return classify(java.lang.Boolean.compare(z2, z));
        }

        @Override // com.google.common.collect.ComparisonChain
        public com.google.common.collect.ComparisonChain compareFalseFirst(boolean z, boolean z2) {
            return classify(java.lang.Boolean.compare(z, z2));
        }

        com.google.common.collect.ComparisonChain classify(int i) {
            if (i < 0) {
                return com.google.common.collect.ComparisonChain.LESS;
            }
            return i > 0 ? com.google.common.collect.ComparisonChain.GREATER : com.google.common.collect.ComparisonChain.ACTIVE;
        }
    };
    private static final com.google.common.collect.ComparisonChain LESS = new com.google.common.collect.ComparisonChain.InactiveComparisonChain(-1);
    private static final com.google.common.collect.ComparisonChain GREATER = new com.google.common.collect.ComparisonChain.InactiveComparisonChain(1);

    public abstract com.google.common.collect.ComparisonChain compare(double d, double d2);

    public abstract com.google.common.collect.ComparisonChain compare(float f, float f2);

    public abstract com.google.common.collect.ComparisonChain compare(int i, int i2);

    public abstract com.google.common.collect.ComparisonChain compare(long j, long j2);

    public abstract com.google.common.collect.ComparisonChain compare(java.lang.Comparable<?> comparable, java.lang.Comparable<?> comparable2);

    public abstract <T> com.google.common.collect.ComparisonChain compare(T t, T t2, java.util.Comparator<T> comparator);

    public abstract com.google.common.collect.ComparisonChain compareFalseFirst(boolean z, boolean z2);

    public abstract com.google.common.collect.ComparisonChain compareTrueFirst(boolean z, boolean z2);

    public abstract int result();

    private ComparisonChain() {
    }

    public static com.google.common.collect.ComparisonChain start() {
        return ACTIVE;
    }

    static final class InactiveComparisonChain extends com.google.common.collect.ComparisonChain {
        final int result;

        @Override // com.google.common.collect.ComparisonChain
        public final com.google.common.collect.ComparisonChain compare(double d, double d2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final com.google.common.collect.ComparisonChain compare(float f, float f2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final com.google.common.collect.ComparisonChain compare(int i, int i2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final com.google.common.collect.ComparisonChain compare(long j, long j2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final com.google.common.collect.ComparisonChain compare(java.lang.Comparable<?> comparable, java.lang.Comparable<?> comparable2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final <T> com.google.common.collect.ComparisonChain compare(T t, T t2, java.util.Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final com.google.common.collect.ComparisonChain compareFalseFirst(boolean z, boolean z2) {
            return this;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final com.google.common.collect.ComparisonChain compareTrueFirst(boolean z, boolean z2) {
            return this;
        }

        InactiveComparisonChain(int i) {
            super();
            this.result = i;
        }

        @Override // com.google.common.collect.ComparisonChain
        public final int result() {
            return this.result;
        }
    }

    @java.lang.Deprecated
    public final com.google.common.collect.ComparisonChain compare(java.lang.Boolean bool, java.lang.Boolean bool2) {
        return compareFalseFirst(bool.booleanValue(), bool2.booleanValue());
    }
}
