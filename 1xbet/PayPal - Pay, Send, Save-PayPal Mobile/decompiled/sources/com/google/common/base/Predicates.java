package com.google.common.base;

/* loaded from: classes9.dex */
public final class Predicates {

    enum ObjectPredicate implements com.google.common.base.Predicate<java.lang.Object> {
        ALWAYS_TRUE { // from class: com.google.common.base.Predicates.ObjectPredicate.1
            @Override // com.google.common.base.Predicate
            public final boolean apply(java.lang.Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE { // from class: com.google.common.base.Predicates.ObjectPredicate.2
            @Override // com.google.common.base.Predicate
            public final boolean apply(java.lang.Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.3
            @Override // com.google.common.base.Predicate
            public final boolean apply(java.lang.Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL { // from class: com.google.common.base.Predicates.ObjectPredicate.4
            @Override // com.google.common.base.Predicate
            public final boolean apply(java.lang.Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final java.lang.String toString() {
                return "Predicates.notNull()";
            }
        };

        <T> com.google.common.base.Predicate<T> withNarrowedType() {
            return this;
        }
    }

    public static <T> com.google.common.base.Predicate<T> alwaysTrue() {
        return com.google.common.base.Predicates.ObjectPredicate.ALWAYS_TRUE.withNarrowedType();
    }

    public static <T> com.google.common.base.Predicate<T> alwaysFalse() {
        return com.google.common.base.Predicates.ObjectPredicate.ALWAYS_FALSE.withNarrowedType();
    }

    public static <T> com.google.common.base.Predicate<T> isNull() {
        return com.google.common.base.Predicates.ObjectPredicate.IS_NULL.withNarrowedType();
    }

    public static <T> com.google.common.base.Predicate<T> notNull() {
        return com.google.common.base.Predicates.ObjectPredicate.NOT_NULL.withNarrowedType();
    }

    public static <T> com.google.common.base.Predicate<T> not(com.google.common.base.Predicate<T> predicate) {
        return new com.google.common.base.Predicates.NotPredicate(predicate);
    }

    public static <T> com.google.common.base.Predicate<T> and(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>> iterable) {
        return new com.google.common.base.Predicates.AndPredicate(defensiveCopy(iterable));
    }

    @java.lang.SafeVarargs
    public static <T> com.google.common.base.Predicate<T> and(com.google.common.base.Predicate<? super T>... predicateArr) {
        return new com.google.common.base.Predicates.AndPredicate(defensiveCopy(predicateArr));
    }

    public static <T> com.google.common.base.Predicate<T> and(com.google.common.base.Predicate<? super T> predicate, com.google.common.base.Predicate<? super T> predicate2) {
        return new com.google.common.base.Predicates.AndPredicate(asList((com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate), (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate2)));
    }

    public static <T> com.google.common.base.Predicate<T> or(java.lang.Iterable<? extends com.google.common.base.Predicate<? super T>> iterable) {
        return new com.google.common.base.Predicates.OrPredicate(defensiveCopy(iterable));
    }

    @java.lang.SafeVarargs
    public static <T> com.google.common.base.Predicate<T> or(com.google.common.base.Predicate<? super T>... predicateArr) {
        return new com.google.common.base.Predicates.OrPredicate(defensiveCopy(predicateArr));
    }

    public static <T> com.google.common.base.Predicate<T> or(com.google.common.base.Predicate<? super T> predicate, com.google.common.base.Predicate<? super T> predicate2) {
        return new com.google.common.base.Predicates.OrPredicate(asList((com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate), (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate2)));
    }

    public static <T> com.google.common.base.Predicate<T> equalTo(T t) {
        if (t == null) {
            return isNull();
        }
        return new com.google.common.base.Predicates.IsEqualToPredicate(t).withNarrowedType();
    }

    public static <T> com.google.common.base.Predicate<T> instanceOf(java.lang.Class<?> cls) {
        return new com.google.common.base.Predicates.InstanceOfPredicate(cls);
    }

    public static com.google.common.base.Predicate<java.lang.Class<?>> subtypeOf(java.lang.Class<?> cls) {
        return new com.google.common.base.Predicates.SubtypeOfPredicate(cls);
    }

    public static <T> com.google.common.base.Predicate<T> in(java.util.Collection<? extends T> collection) {
        return new com.google.common.base.Predicates.InPredicate(collection);
    }

    public static <A, B> com.google.common.base.Predicate<A> compose(com.google.common.base.Predicate<B> predicate, com.google.common.base.Function<A, ? extends B> function) {
        return new com.google.common.base.Predicates.CompositionPredicate(predicate, function);
    }

    public static com.google.common.base.Predicate<java.lang.CharSequence> containsPattern(java.lang.String str) {
        return new com.google.common.base.Predicates.ContainsPatternFromStringPredicate(str);
    }

    public static com.google.common.base.Predicate<java.lang.CharSequence> contains(java.util.regex.Pattern pattern) {
        return new com.google.common.base.Predicates.ContainsPatternPredicate(new com.google.common.base.JdkPattern(pattern));
    }

    static final class NotPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.Predicate<T> predicate;

        NotPredicate(com.google.common.base.Predicate<T> predicate) {
            this.predicate = (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate);
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(T t) {
            return !this.predicate.apply(t);
        }

        public final int hashCode() {
            return ~this.predicate.hashCode();
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.base.Predicates.NotPredicate) {
                return this.predicate.equals(((com.google.common.base.Predicates.NotPredicate) obj).predicate);
            }
            return false;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Predicates.not(");
            sb.append(this.predicate);
            sb.append(")");
            return sb.toString();
        }
    }

    static final class AndPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.util.List<? extends com.google.common.base.Predicate<? super T>> components;

        private AndPredicate(java.util.List<? extends com.google.common.base.Predicate<? super T>> list) {
            this.components = list;
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(T t) {
            for (int i = 0; i < this.components.size(); i++) {
                if (!this.components.get(i).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            return this.components.hashCode() + 306654252;
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.base.Predicates.AndPredicate) {
                return this.components.equals(((com.google.common.base.Predicates.AndPredicate) obj).components);
            }
            return false;
        }

        public final java.lang.String toString() {
            return com.google.common.base.Predicates.toStringHelper("and", this.components);
        }
    }

    static final class OrPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.util.List<? extends com.google.common.base.Predicate<? super T>> components;

        private OrPredicate(java.util.List<? extends com.google.common.base.Predicate<? super T>> list) {
            this.components = list;
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(T t) {
            for (int i = 0; i < this.components.size(); i++) {
                if (this.components.get(i).apply(t)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.components.hashCode() + 87855567;
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.base.Predicates.OrPredicate) {
                return this.components.equals(((com.google.common.base.Predicates.OrPredicate) obj).components);
            }
            return false;
        }

        public final java.lang.String toString() {
            return com.google.common.base.Predicates.toStringHelper("or", this.components);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String toStringHelper(java.lang.String str, java.lang.Iterable<?> iterable) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (java.lang.Object obj : iterable) {
            if (!z) {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    static final class IsEqualToPredicate implements com.google.common.base.Predicate<java.lang.Object>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.Object target;

        final <T> com.google.common.base.Predicate<T> withNarrowedType() {
            return this;
        }

        private IsEqualToPredicate(java.lang.Object obj) {
            this.target = obj;
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(java.lang.Object obj) {
            return this.target.equals(obj);
        }

        public final int hashCode() {
            return this.target.hashCode();
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.base.Predicates.IsEqualToPredicate) {
                return this.target.equals(((com.google.common.base.Predicates.IsEqualToPredicate) obj).target);
            }
            return false;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Predicates.equalTo(");
            sb.append(this.target);
            sb.append(")");
            return sb.toString();
        }
    }

    static final class InstanceOfPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.Class<?> clazz;

        private InstanceOfPredicate(java.lang.Class<?> cls) {
            this.clazz = (java.lang.Class) com.google.common.base.Preconditions.checkNotNull(cls);
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(T t) {
            return this.clazz.isInstance(t);
        }

        public final int hashCode() {
            return this.clazz.hashCode();
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(java.lang.Object obj) {
            return (obj instanceof com.google.common.base.Predicates.InstanceOfPredicate) && this.clazz == ((com.google.common.base.Predicates.InstanceOfPredicate) obj).clazz;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Predicates.instanceOf(");
            sb.append(this.clazz.getName());
            sb.append(")");
            return sb.toString();
        }
    }

    static final class SubtypeOfPredicate implements com.google.common.base.Predicate<java.lang.Class<?>>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.lang.Class<?> clazz;

        private SubtypeOfPredicate(java.lang.Class<?> cls) {
            this.clazz = (java.lang.Class) com.google.common.base.Preconditions.checkNotNull(cls);
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(java.lang.Class<?> cls) {
            return this.clazz.isAssignableFrom(cls);
        }

        public final int hashCode() {
            return this.clazz.hashCode();
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(java.lang.Object obj) {
            return (obj instanceof com.google.common.base.Predicates.SubtypeOfPredicate) && this.clazz == ((com.google.common.base.Predicates.SubtypeOfPredicate) obj).clazz;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Predicates.subtypeOf(");
            sb.append(this.clazz.getName());
            sb.append(")");
            return sb.toString();
        }
    }

    static final class InPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final java.util.Collection<?> target;

        private InPredicate(java.util.Collection<?> collection) {
            this.target = (java.util.Collection) com.google.common.base.Preconditions.checkNotNull(collection);
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(T t) {
            try {
                return this.target.contains(t);
            } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
                return false;
            }
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(java.lang.Object obj) {
            if (obj instanceof com.google.common.base.Predicates.InPredicate) {
                return this.target.equals(((com.google.common.base.Predicates.InPredicate) obj).target);
            }
            return false;
        }

        public final int hashCode() {
            return this.target.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Predicates.in(");
            sb.append(this.target);
            sb.append(")");
            return sb.toString();
        }
    }

    static final class CompositionPredicate<A, B> implements com.google.common.base.Predicate<A>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.Function<A, ? extends B> f;
        final com.google.common.base.Predicate<B> p;

        private CompositionPredicate(com.google.common.base.Predicate<B> predicate, com.google.common.base.Function<A, ? extends B> function) {
            this.p = (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate);
            this.f = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function);
        }

        @Override // com.google.common.base.Predicate
        public final boolean apply(A a2) {
            return this.p.apply(this.f.apply(a2));
        }

        @Override // com.google.common.base.Predicate
        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.common.base.Predicates.CompositionPredicate)) {
                return false;
            }
            com.google.common.base.Predicates.CompositionPredicate compositionPredicate = (com.google.common.base.Predicates.CompositionPredicate) obj;
            return this.f.equals(compositionPredicate.f) && this.p.equals(compositionPredicate.p);
        }

        public final int hashCode() {
            return this.f.hashCode() ^ this.p.hashCode();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.p);
            sb.append("(");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    static class ContainsPatternPredicate implements com.google.common.base.Predicate<java.lang.CharSequence>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.CommonPattern pattern;

        ContainsPatternPredicate(com.google.common.base.CommonPattern commonPattern) {
            this.pattern = (com.google.common.base.CommonPattern) com.google.common.base.Preconditions.checkNotNull(commonPattern);
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(java.lang.CharSequence charSequence) {
            return this.pattern.matcher(charSequence).find();
        }

        public int hashCode() {
            return java.util.Objects.hash(this.pattern.pattern(), java.lang.Integer.valueOf(this.pattern.flags()));
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.common.base.Predicates.ContainsPatternPredicate)) {
                return false;
            }
            com.google.common.base.Predicates.ContainsPatternPredicate containsPatternPredicate = (com.google.common.base.Predicates.ContainsPatternPredicate) obj;
            return java.util.Objects.equals(this.pattern.pattern(), containsPatternPredicate.pattern.pattern()) && this.pattern.flags() == containsPatternPredicate.pattern.flags();
        }

        public java.lang.String toString() {
            java.lang.String obj = com.google.common.base.MoreObjects.toStringHelper(this.pattern).add("pattern", this.pattern.pattern()).add("pattern.flags", this.pattern.flags()).toString();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Predicates.contains(");
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    static final class ContainsPatternFromStringPredicate extends com.google.common.base.Predicates.ContainsPatternPredicate {
        private static final long serialVersionUID = 0;

        ContainsPatternFromStringPredicate(java.lang.String str) {
            super(com.google.common.base.Platform.compilePattern(str));
        }

        @Override // com.google.common.base.Predicates.ContainsPatternPredicate
        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Predicates.containsPattern(");
            sb.append(this.pattern.pattern());
            sb.append(")");
            return sb.toString();
        }
    }

    private static <T> java.util.List<com.google.common.base.Predicate<? super T>> asList(com.google.common.base.Predicate<? super T> predicate, com.google.common.base.Predicate<? super T> predicate2) {
        return java.util.Arrays.asList(predicate, predicate2);
    }

    private static <T> java.util.List<T> defensiveCopy(T... tArr) {
        return defensiveCopy(java.util.Arrays.asList(tArr));
    }

    static <T> java.util.List<T> defensiveCopy(java.lang.Iterable<T> iterable) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(com.google.common.base.Preconditions.checkNotNull(it.next()));
        }
        return arrayList;
    }

    private Predicates() {
    }
}
