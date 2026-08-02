package com.google.common.base;

/* loaded from: classes9.dex */
public abstract class Equivalence<T> {
    protected abstract boolean doEquivalent(T t, T t2);

    protected abstract int doHash(T t);

    protected Equivalence() {
    }

    public final boolean equivalent(T t, T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return doEquivalent(t, t2);
    }

    public boolean equals(java.lang.Object obj) {
        return super.equals(obj);
    }

    public final int hash(T t) {
        if (t == null) {
            return 0;
        }
        return doHash(t);
    }

    public final <F> com.google.common.base.Equivalence<F> onResultOf(com.google.common.base.Function<? super F, ? extends T> function) {
        return new com.google.common.base.FunctionalEquivalence(function, this);
    }

    public final <S extends T> com.google.common.base.Equivalence.Wrapper<S> wrap(S s) {
        return new com.google.common.base.Equivalence.Wrapper<>(s);
    }

    public static final class Wrapper<T> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Equivalence<? super T> equivalence;
        private final T reference;

        private Wrapper(com.google.common.base.Equivalence<? super T> equivalence, T t) {
            this.equivalence = (com.google.common.base.Equivalence) com.google.common.base.Preconditions.checkNotNull(equivalence);
            this.reference = t;
        }

        public final T get() {
            return this.reference;
        }

        public final boolean equals(java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.google.common.base.Equivalence.Wrapper)) {
                return false;
            }
            com.google.common.base.Equivalence.Wrapper wrapper = (com.google.common.base.Equivalence.Wrapper) obj;
            if (this.equivalence.equals(wrapper.equivalence)) {
                return this.equivalence.equivalent(this.reference, wrapper.reference);
            }
            return false;
        }

        public final int hashCode() {
            return this.equivalence.hash(this.reference);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.equivalence);
            sb.append(".wrap(");
            sb.append(this.reference);
            sb.append(")");
            return sb.toString();
        }
    }

    public final <S extends T> com.google.common.base.Equivalence<java.lang.Iterable<S>> pairwise() {
        return new com.google.common.base.PairwiseEquivalence(this);
    }

    public final com.google.common.base.Predicate<T> equivalentTo(T t) {
        return new com.google.common.base.Equivalence.EquivalentToPredicate(this, t);
    }

    static final class EquivalentToPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Equivalence<T> equivalence;
        private final T target;

        EquivalentToPredicate(com.google.common.base.Equivalence<T> equivalence, T t) {
            this.equivalence = (com.google.common.base.Equivalence) com.google.common.base.Preconditions.checkNotNull(equivalence);
            this.target = t;
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(T t) {
            return this.equivalence.equivalent(t, this.target);
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.common.base.Equivalence.EquivalentToPredicate)) {
                return false;
            }
            com.google.common.base.Equivalence.EquivalentToPredicate equivalentToPredicate = (com.google.common.base.Equivalence.EquivalentToPredicate) obj;
            return this.equivalence.equals(equivalentToPredicate.equivalence) && java.util.Objects.equals(this.target, equivalentToPredicate.target);
        }

        public final int hashCode() {
            return java.util.Objects.hash(this.equivalence, this.target);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.equivalence);
            sb.append(".equivalentTo(");
            sb.append(this.target);
            sb.append(")");
            return sb.toString();
        }
    }

    public static com.google.common.base.Equivalence<java.lang.Object> equals() {
        return com.google.common.base.Equivalence.Equals.INSTANCE;
    }

    public static com.google.common.base.Equivalence<java.lang.Object> identity() {
        return com.google.common.base.Equivalence.Identity.INSTANCE;
    }

    static final class Equals extends com.google.common.base.Equivalence<java.lang.Object> implements java.io.Serializable {
        static final com.google.common.base.Equivalence.Equals INSTANCE = new com.google.common.base.Equivalence.Equals();
        private static final long serialVersionUID = 1;

        Equals() {
        }

        @Override // com.google.common.base.Equivalence
        protected final boolean doEquivalent(java.lang.Object obj, java.lang.Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.Equivalence
        protected final int doHash(java.lang.Object obj) {
            return obj.hashCode();
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }
    }

    static final class Identity extends com.google.common.base.Equivalence<java.lang.Object> implements java.io.Serializable {
        static final com.google.common.base.Equivalence.Identity INSTANCE = new com.google.common.base.Equivalence.Identity();
        private static final long serialVersionUID = 1;

        @Override // com.google.common.base.Equivalence
        protected final boolean doEquivalent(java.lang.Object obj, java.lang.Object obj2) {
            return false;
        }

        Identity() {
        }

        @Override // com.google.common.base.Equivalence
        protected final int doHash(java.lang.Object obj) {
            return java.lang.System.identityHashCode(obj);
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }
    }
}
