package com.google.common.base;

/* loaded from: classes4.dex */
public class Joiner {
    private final java.lang.String separator;

    public static com.google.common.base.Joiner on(java.lang.String str) {
        return new com.google.common.base.Joiner(str);
    }

    public static com.google.common.base.Joiner on(char c) {
        return new com.google.common.base.Joiner(java.lang.String.valueOf(c));
    }

    private Joiner(java.lang.String str) {
        this.separator = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str);
    }

    private Joiner(com.google.common.base.Joiner joiner) {
        this.separator = joiner.separator;
    }

    public <A extends java.lang.Appendable> A appendTo(A a2, java.lang.Iterable<?> iterable) throws java.io.IOException {
        return (A) appendTo((com.google.common.base.Joiner) a2, iterable.iterator());
    }

    public <A extends java.lang.Appendable> A appendTo(A a2, java.util.Iterator<?> it) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(a2);
        if (it.hasNext()) {
            a2.append(toString(it.next()));
            while (it.hasNext()) {
                a2.append(this.separator);
                a2.append(toString(it.next()));
            }
        }
        return a2;
    }

    public final <A extends java.lang.Appendable> A appendTo(A a2, java.lang.Object[] objArr) throws java.io.IOException {
        return (A) appendTo((com.google.common.base.Joiner) a2, (java.lang.Iterable<?>) java.util.Arrays.asList(objArr));
    }

    public final <A extends java.lang.Appendable> A appendTo(A a2, java.lang.Object obj, java.lang.Object obj2, java.lang.Object... objArr) throws java.io.IOException {
        return (A) appendTo((com.google.common.base.Joiner) a2, iterable(obj, obj2, objArr));
    }

    public final java.lang.StringBuilder appendTo(java.lang.StringBuilder sb, java.lang.Iterable<?> iterable) {
        return appendTo(sb, iterable.iterator());
    }

    public final java.lang.StringBuilder appendTo(java.lang.StringBuilder sb, java.util.Iterator<?> it) {
        try {
            appendTo((com.google.common.base.Joiner) sb, it);
            return sb;
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public final java.lang.StringBuilder appendTo(java.lang.StringBuilder sb, java.lang.Object[] objArr) {
        return appendTo(sb, (java.lang.Iterable<?>) java.util.Arrays.asList(objArr));
    }

    public final java.lang.StringBuilder appendTo(java.lang.StringBuilder sb, java.lang.Object obj, java.lang.Object obj2, java.lang.Object... objArr) {
        return appendTo(sb, iterable(obj, obj2, objArr));
    }

    public java.lang.String join(java.lang.Iterable<?> iterable) {
        return join(iterable.iterator());
    }

    public final java.lang.String join(java.util.Iterator<?> it) {
        return appendTo(new java.lang.StringBuilder(), it).toString();
    }

    public final java.lang.String join(java.lang.Object[] objArr) {
        return join(java.util.Arrays.asList(objArr));
    }

    public final java.lang.String join(java.lang.Object obj, java.lang.Object obj2, java.lang.Object... objArr) {
        return join(iterable(obj, obj2, objArr));
    }

    public com.google.common.base.Joiner useForNull(final java.lang.String str) {
        com.google.common.base.Preconditions.checkNotNull(str);
        return new com.google.common.base.Joiner(this, this) { // from class: com.google.common.base.Joiner.1
            final /* synthetic */ com.google.common.base.Joiner this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.base.Joiner
            java.lang.CharSequence toString(java.lang.Object obj) {
                return obj == null ? str : this.this$0.toString(obj);
            }

            @Override // com.google.common.base.Joiner
            public com.google.common.base.Joiner useForNull(java.lang.String str2) {
                throw new java.lang.UnsupportedOperationException("already specified useForNull");
            }

            @Override // com.google.common.base.Joiner
            public com.google.common.base.Joiner skipNulls() {
                throw new java.lang.UnsupportedOperationException("already specified useForNull");
            }
        };
    }

    public com.google.common.base.Joiner skipNulls() {
        return new com.google.common.base.Joiner(this) { // from class: com.google.common.base.Joiner.2
            @Override // com.google.common.base.Joiner
            public java.lang.String join(java.lang.Iterable<?> iterable) {
                return join(iterable.iterator());
            }

            @Override // com.google.common.base.Joiner
            public <A extends java.lang.Appendable> A appendTo(A a2, java.util.Iterator<?> it) throws java.io.IOException {
                com.google.common.base.Preconditions.checkNotNull(a2, "appendable");
                com.google.common.base.Preconditions.checkNotNull(it, "parts");
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (next != null) {
                        a2.append(com.google.common.base.Joiner.this.toString(next));
                        break;
                    }
                }
                while (it.hasNext()) {
                    java.lang.Object next2 = it.next();
                    if (next2 != null) {
                        a2.append(com.google.common.base.Joiner.this.separator);
                        a2.append(com.google.common.base.Joiner.this.toString(next2));
                    }
                }
                return a2;
            }

            @Override // com.google.common.base.Joiner
            public com.google.common.base.Joiner useForNull(java.lang.String str) {
                throw new java.lang.UnsupportedOperationException("already specified skipNulls");
            }

            @Override // com.google.common.base.Joiner
            public com.google.common.base.Joiner.MapJoiner withKeyValueSeparator(java.lang.String str) {
                throw new java.lang.UnsupportedOperationException("can't use .skipNulls() with maps");
            }
        };
    }

    public com.google.common.base.Joiner.MapJoiner withKeyValueSeparator(char c) {
        return withKeyValueSeparator(java.lang.String.valueOf(c));
    }

    public com.google.common.base.Joiner.MapJoiner withKeyValueSeparator(java.lang.String str) {
        return new com.google.common.base.Joiner.MapJoiner(str);
    }

    /* loaded from: classes9.dex */
    public static final class MapJoiner {
        private final com.google.common.base.Joiner joiner;
        private final java.lang.String keyValueSeparator;

        private MapJoiner(com.google.common.base.Joiner joiner, java.lang.String str) {
            this.joiner = joiner;
            this.keyValueSeparator = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str);
        }

        public final <A extends java.lang.Appendable> A appendTo(A a2, java.util.Map<?, ?> map) throws java.io.IOException {
            return (A) appendTo((com.google.common.base.Joiner.MapJoiner) a2, (java.lang.Iterable<? extends java.util.Map.Entry<?, ?>>) map.entrySet());
        }

        public final java.lang.StringBuilder appendTo(java.lang.StringBuilder sb, java.util.Map<?, ?> map) {
            return appendTo(sb, (java.lang.Iterable<? extends java.util.Map.Entry<?, ?>>) map.entrySet());
        }

        public final <A extends java.lang.Appendable> A appendTo(A a2, java.lang.Iterable<? extends java.util.Map.Entry<?, ?>> iterable) throws java.io.IOException {
            return (A) appendTo((com.google.common.base.Joiner.MapJoiner) a2, iterable.iterator());
        }

        public final <A extends java.lang.Appendable> A appendTo(A a2, java.util.Iterator<? extends java.util.Map.Entry<?, ?>> it) throws java.io.IOException {
            com.google.common.base.Preconditions.checkNotNull(a2);
            if (it.hasNext()) {
                java.util.Map.Entry<?, ?> next = it.next();
                a2.append(this.joiner.toString(next.getKey()));
                a2.append(this.keyValueSeparator);
                a2.append(this.joiner.toString(next.getValue()));
                while (it.hasNext()) {
                    a2.append(this.joiner.separator);
                    java.util.Map.Entry<?, ?> next2 = it.next();
                    a2.append(this.joiner.toString(next2.getKey()));
                    a2.append(this.keyValueSeparator);
                    a2.append(this.joiner.toString(next2.getValue()));
                }
            }
            return a2;
        }

        public final java.lang.StringBuilder appendTo(java.lang.StringBuilder sb, java.lang.Iterable<? extends java.util.Map.Entry<?, ?>> iterable) {
            return appendTo(sb, iterable.iterator());
        }

        public final java.lang.StringBuilder appendTo(java.lang.StringBuilder sb, java.util.Iterator<? extends java.util.Map.Entry<?, ?>> it) {
            try {
                appendTo((com.google.common.base.Joiner.MapJoiner) sb, it);
                return sb;
            } catch (java.io.IOException e) {
                throw new java.lang.AssertionError(e);
            }
        }

        public final java.lang.String join(java.util.Map<?, ?> map) {
            return join(map.entrySet());
        }

        public final java.lang.String join(java.lang.Iterable<? extends java.util.Map.Entry<?, ?>> iterable) {
            return join(iterable.iterator());
        }

        public final java.lang.String join(java.util.Iterator<? extends java.util.Map.Entry<?, ?>> it) {
            return appendTo(new java.lang.StringBuilder(), it).toString();
        }

        public final com.google.common.base.Joiner.MapJoiner useForNull(java.lang.String str) {
            return new com.google.common.base.Joiner.MapJoiner(this.joiner.useForNull(str), this.keyValueSeparator);
        }
    }

    java.lang.CharSequence toString(java.lang.Object obj) {
        java.util.Objects.requireNonNull(obj);
        return obj instanceof java.lang.CharSequence ? (java.lang.CharSequence) obj : obj.toString();
    }

    private static java.lang.Iterable<java.lang.Object> iterable(final java.lang.Object obj, final java.lang.Object obj2, final java.lang.Object[] objArr) {
        com.google.common.base.Preconditions.checkNotNull(objArr);
        return new java.util.AbstractList<java.lang.Object>() { // from class: com.google.common.base.Joiner.3
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return objArr.length + 2;
            }

            @Override // java.util.AbstractList, java.util.List
            public java.lang.Object get(int i) {
                if (i == 0) {
                    return obj;
                }
                if (i == 1) {
                    return obj2;
                }
                return objArr[i - 2];
            }
        };
    }

    private static int expandedCapacity(int i, int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            i3 = java.lang.Integer.highestOneBit(i2 - 1) << 1;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }
}
