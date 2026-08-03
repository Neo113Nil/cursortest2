package androidx.core.util;

/* loaded from: classes.dex */
public interface Predicate<T> {
    androidx.core.util.Predicate<T> and(androidx.core.util.Predicate<? super T> predicate);

    androidx.core.util.Predicate<T> negate();

    androidx.core.util.Predicate<T> or(androidx.core.util.Predicate<? super T> predicate);

    boolean test(T t);

    /* renamed from: androidx.core.util.Predicate$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static androidx.core.util.Predicate $default$and(final androidx.core.util.Predicate _this, final androidx.core.util.Predicate predicate) {
            java.util.Objects.requireNonNull(predicate);
            return new androidx.core.util.Predicate() { // from class: androidx.core.util.Predicate$$ExternalSyntheticLambda4
                @Override // androidx.core.util.Predicate
                public /* synthetic */ androidx.core.util.Predicate and(androidx.core.util.Predicate predicate2) {
                    return androidx.core.util.Predicate.CC.$default$and(this, predicate2);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ androidx.core.util.Predicate negate() {
                    return androidx.core.util.Predicate.CC.$default$negate(this);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ androidx.core.util.Predicate or(androidx.core.util.Predicate predicate2) {
                    return androidx.core.util.Predicate.CC.$default$or(this, predicate2);
                }

                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    return androidx.core.util.Predicate.CC.$private$lambda$and$0(androidx.core.util.Predicate.this, predicate, obj);
                }
            };
        }

        public static /* synthetic */ boolean $private$lambda$and$0(androidx.core.util.Predicate _this, androidx.core.util.Predicate predicate, java.lang.Object obj) {
            return _this.test(obj) && predicate.test(obj);
        }

        public static androidx.core.util.Predicate $default$negate(final androidx.core.util.Predicate _this) {
            return new androidx.core.util.Predicate() { // from class: androidx.core.util.Predicate$$ExternalSyntheticLambda5
                @Override // androidx.core.util.Predicate
                public /* synthetic */ androidx.core.util.Predicate and(androidx.core.util.Predicate predicate) {
                    return androidx.core.util.Predicate.CC.$default$and(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ androidx.core.util.Predicate negate() {
                    return androidx.core.util.Predicate.CC.$default$negate(this);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ androidx.core.util.Predicate or(androidx.core.util.Predicate predicate) {
                    return androidx.core.util.Predicate.CC.$default$or(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    return androidx.core.util.Predicate.CC.$private$lambda$negate$1(androidx.core.util.Predicate.this, obj);
                }
            };
        }

        public static /* synthetic */ boolean $private$lambda$negate$1(androidx.core.util.Predicate _this, java.lang.Object obj) {
            return !_this.test(obj);
        }

        public static androidx.core.util.Predicate $default$or(final androidx.core.util.Predicate _this, final androidx.core.util.Predicate predicate) {
            java.util.Objects.requireNonNull(predicate);
            return new androidx.core.util.Predicate() { // from class: androidx.core.util.Predicate$$ExternalSyntheticLambda1
                @Override // androidx.core.util.Predicate
                public /* synthetic */ androidx.core.util.Predicate and(androidx.core.util.Predicate predicate2) {
                    return androidx.core.util.Predicate.CC.$default$and(this, predicate2);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ androidx.core.util.Predicate negate() {
                    return androidx.core.util.Predicate.CC.$default$negate(this);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ androidx.core.util.Predicate or(androidx.core.util.Predicate predicate2) {
                    return androidx.core.util.Predicate.CC.$default$or(this, predicate2);
                }

                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj) {
                    return androidx.core.util.Predicate.CC.$private$lambda$or$2(androidx.core.util.Predicate.this, predicate, obj);
                }
            };
        }

        public static /* synthetic */ boolean $private$lambda$or$2(androidx.core.util.Predicate _this, androidx.core.util.Predicate predicate, java.lang.Object obj) {
            return _this.test(obj) || predicate.test(obj);
        }

        public static <T> androidx.core.util.Predicate<T> isEqual(final java.lang.Object obj) {
            return obj == null ? new androidx.core.util.Predicate() { // from class: androidx.core.util.Predicate$$ExternalSyntheticLambda2
                @Override // androidx.core.util.Predicate
                public /* synthetic */ androidx.core.util.Predicate and(androidx.core.util.Predicate predicate) {
                    return androidx.core.util.Predicate.CC.$default$and(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ androidx.core.util.Predicate negate() {
                    return androidx.core.util.Predicate.CC.$default$negate(this);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ androidx.core.util.Predicate or(androidx.core.util.Predicate predicate) {
                    return androidx.core.util.Predicate.CC.$default$or(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj2) {
                    boolean m;
                    m = kotlin.UByte$$ExternalSyntheticBackport0.m(obj2);
                    return m;
                }
            } : new androidx.core.util.Predicate() { // from class: androidx.core.util.Predicate$$ExternalSyntheticLambda3
                @Override // androidx.core.util.Predicate
                public /* synthetic */ androidx.core.util.Predicate and(androidx.core.util.Predicate predicate) {
                    return androidx.core.util.Predicate.CC.$default$and(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ androidx.core.util.Predicate negate() {
                    return androidx.core.util.Predicate.CC.$default$negate(this);
                }

                @Override // androidx.core.util.Predicate
                public /* synthetic */ androidx.core.util.Predicate or(androidx.core.util.Predicate predicate) {
                    return androidx.core.util.Predicate.CC.$default$or(this, predicate);
                }

                @Override // androidx.core.util.Predicate
                public final boolean test(java.lang.Object obj2) {
                    boolean equals;
                    equals = obj.equals(obj2);
                    return equals;
                }
            };
        }

        public static <T> androidx.core.util.Predicate<T> not(androidx.core.util.Predicate<? super T> predicate) {
            java.util.Objects.requireNonNull(predicate);
            return predicate.negate();
        }
    }
}
