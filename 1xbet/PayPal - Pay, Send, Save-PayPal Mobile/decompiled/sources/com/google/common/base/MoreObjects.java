package com.google.common.base;

/* loaded from: classes.dex */
public final class MoreObjects {
    public static <T> T firstNonNull(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new java.lang.NullPointerException("Both parameters are null");
    }

    public static com.google.common.base.MoreObjects.ToStringHelper toStringHelper(java.lang.Object obj) {
        return new com.google.common.base.MoreObjects.ToStringHelper(obj.getClass().getSimpleName());
    }

    public static com.google.common.base.MoreObjects.ToStringHelper toStringHelper(java.lang.Class<?> cls) {
        return new com.google.common.base.MoreObjects.ToStringHelper(cls.getSimpleName());
    }

    public static com.google.common.base.MoreObjects.ToStringHelper toStringHelper(java.lang.String str) {
        return new com.google.common.base.MoreObjects.ToStringHelper(str);
    }

    public static final class ToStringHelper {
        private final java.lang.String className;
        private final com.google.common.base.MoreObjects.ToStringHelper.ValueHolder holderHead;
        private com.google.common.base.MoreObjects.ToStringHelper.ValueHolder holderTail;
        private boolean omitEmptyValues;
        private boolean omitNullValues;

        private ToStringHelper(java.lang.String str) {
            com.google.common.base.MoreObjects.ToStringHelper.ValueHolder valueHolder = new com.google.common.base.MoreObjects.ToStringHelper.ValueHolder();
            this.holderHead = valueHolder;
            this.holderTail = valueHolder;
            this.omitNullValues = false;
            this.omitEmptyValues = false;
            this.className = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str);
        }

        public final com.google.common.base.MoreObjects.ToStringHelper omitNullValues() {
            this.omitNullValues = true;
            return this;
        }

        public final com.google.common.base.MoreObjects.ToStringHelper omitEmptyValues() {
            this.omitEmptyValues = true;
            return this;
        }

        public final com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String str, java.lang.Object obj) {
            return addHolder(str, obj);
        }

        public final com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String str, boolean z) {
            return addUnconditionalHolder(str, java.lang.String.valueOf(z));
        }

        public final com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String str, char c) {
            return addUnconditionalHolder(str, java.lang.String.valueOf(c));
        }

        public final com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String str, double d) {
            return addUnconditionalHolder(str, java.lang.String.valueOf(d));
        }

        public final com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String str, float f) {
            return addUnconditionalHolder(str, java.lang.String.valueOf(f));
        }

        public final com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String str, int i) {
            return addUnconditionalHolder(str, java.lang.String.valueOf(i));
        }

        public final com.google.common.base.MoreObjects.ToStringHelper add(java.lang.String str, long j) {
            return addUnconditionalHolder(str, java.lang.String.valueOf(j));
        }

        public final com.google.common.base.MoreObjects.ToStringHelper addValue(java.lang.Object obj) {
            return addHolder(obj);
        }

        public final com.google.common.base.MoreObjects.ToStringHelper addValue(boolean z) {
            return addUnconditionalHolder(java.lang.String.valueOf(z));
        }

        public final com.google.common.base.MoreObjects.ToStringHelper addValue(char c) {
            return addUnconditionalHolder(java.lang.String.valueOf(c));
        }

        public final com.google.common.base.MoreObjects.ToStringHelper addValue(double d) {
            return addUnconditionalHolder(java.lang.String.valueOf(d));
        }

        public final com.google.common.base.MoreObjects.ToStringHelper addValue(float f) {
            return addUnconditionalHolder(java.lang.String.valueOf(f));
        }

        public final com.google.common.base.MoreObjects.ToStringHelper addValue(int i) {
            return addUnconditionalHolder(java.lang.String.valueOf(i));
        }

        public final com.google.common.base.MoreObjects.ToStringHelper addValue(long j) {
            return addUnconditionalHolder(java.lang.String.valueOf(j));
        }

        private static boolean isEmpty(java.lang.Object obj) {
            if (obj instanceof java.lang.CharSequence) {
                return ((java.lang.CharSequence) obj).length() == 0;
            }
            if (obj instanceof java.util.Collection) {
                return ((java.util.Collection) obj).isEmpty();
            }
            if (obj instanceof java.util.Map) {
                return ((java.util.Map) obj).isEmpty();
            }
            if (obj instanceof com.google.common.base.Optional) {
                return !((com.google.common.base.Optional) obj).isPresent();
            }
            return obj.getClass().isArray() && java.lang.reflect.Array.getLength(obj) == 0;
        }

        public final java.lang.String toString() {
            boolean z = this.omitNullValues;
            boolean z2 = this.omitEmptyValues;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
            sb.append(this.className);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
            java.lang.String str = "";
            for (com.google.common.base.MoreObjects.ToStringHelper.ValueHolder valueHolder = this.holderHead.next; valueHolder != null; valueHolder = valueHolder.next) {
                java.lang.Object obj = valueHolder.value;
                if (!(valueHolder instanceof com.google.common.base.MoreObjects.ToStringHelper.UnconditionalValueHolder)) {
                    if (obj == null) {
                        if (z) {
                        }
                    } else if (z2 && isEmpty(obj)) {
                    }
                }
                sb.append(str);
                if (valueHolder.f3861name != null) {
                    sb.append(valueHolder.f3861name);
                    sb.append('=');
                }
                if (obj != null && obj.getClass().isArray()) {
                    java.lang.String deepToString = java.util.Arrays.deepToString(new java.lang.Object[]{obj});
                    sb.append((java.lang.CharSequence) deepToString, 1, deepToString.length() - 1);
                } else {
                    sb.append(obj);
                }
                str = ", ";
            }
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
            return sb.toString();
        }

        private com.google.common.base.MoreObjects.ToStringHelper.ValueHolder addHolder() {
            com.google.common.base.MoreObjects.ToStringHelper.ValueHolder valueHolder = new com.google.common.base.MoreObjects.ToStringHelper.ValueHolder();
            this.holderTail.next = valueHolder;
            this.holderTail = valueHolder;
            return valueHolder;
        }

        private com.google.common.base.MoreObjects.ToStringHelper addHolder(java.lang.Object obj) {
            addHolder().value = obj;
            return this;
        }

        private com.google.common.base.MoreObjects.ToStringHelper addHolder(java.lang.String str, java.lang.Object obj) {
            com.google.common.base.MoreObjects.ToStringHelper.ValueHolder addHolder = addHolder();
            addHolder.value = obj;
            addHolder.f3861name = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str);
            return this;
        }

        private com.google.common.base.MoreObjects.ToStringHelper.UnconditionalValueHolder addUnconditionalHolder() {
            com.google.common.base.MoreObjects.ToStringHelper.UnconditionalValueHolder unconditionalValueHolder = new com.google.common.base.MoreObjects.ToStringHelper.UnconditionalValueHolder();
            this.holderTail.next = unconditionalValueHolder;
            this.holderTail = unconditionalValueHolder;
            return unconditionalValueHolder;
        }

        private com.google.common.base.MoreObjects.ToStringHelper addUnconditionalHolder(java.lang.Object obj) {
            addUnconditionalHolder().value = obj;
            return this;
        }

        private com.google.common.base.MoreObjects.ToStringHelper addUnconditionalHolder(java.lang.String str, java.lang.Object obj) {
            com.google.common.base.MoreObjects.ToStringHelper.UnconditionalValueHolder addUnconditionalHolder = addUnconditionalHolder();
            addUnconditionalHolder.value = obj;
            addUnconditionalHolder.f3861name = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str);
            return this;
        }

        /* loaded from: classes4.dex */
        static class ValueHolder {

            /* renamed from: name, reason: collision with root package name */
            java.lang.String f3861name;
            com.google.common.base.MoreObjects.ToStringHelper.ValueHolder next;
            java.lang.Object value;

            ValueHolder() {
            }
        }

        /* loaded from: classes4.dex */
        static final class UnconditionalValueHolder extends com.google.common.base.MoreObjects.ToStringHelper.ValueHolder {
            private UnconditionalValueHolder() {
            }
        }
    }

    private MoreObjects() {
    }
}
