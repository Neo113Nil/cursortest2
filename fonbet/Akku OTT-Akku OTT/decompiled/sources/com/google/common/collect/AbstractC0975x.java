package com.google.common.collect;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.Serializable;
import java.lang.Comparable;

/* renamed from: com.google.common.collect.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0975x<C extends Comparable> implements Comparable<AbstractC0975x<C>>, Serializable {
    private static final long serialVersionUID = 0;
    public final Object a;

    /* renamed from: com.google.common.collect.x$a */
    public static final class a extends AbstractC0975x<Comparable<?>> {
        public static final a b = new a("");
        private static final long serialVersionUID = 0;

        private Object readResolve() {
            return b;
        }

        @Override // com.google.common.collect.AbstractC0975x
        /* renamed from: a */
        public final int compareTo(AbstractC0975x<Comparable<?>> abstractC0975x) {
            return abstractC0975x == this ? 0 : 1;
        }

        @Override // com.google.common.collect.AbstractC0975x
        public final void b(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.AbstractC0975x
        public final void c(StringBuilder sb) {
            sb.append("+∞)");
        }

        @Override // com.google.common.collect.AbstractC0975x, java.lang.Comparable
        public final int compareTo(Object obj) {
            return ((AbstractC0975x) obj) == this ? 0 : 1;
        }

        @Override // com.google.common.collect.AbstractC0975x
        public final Comparable<?> d() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.AbstractC0975x
        public final boolean e(Comparable<?> comparable) {
            return false;
        }

        @Override // com.google.common.collect.AbstractC0975x
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        public final String toString() {
            return "+∞";
        }
    }

    /* renamed from: com.google.common.collect.x$b */
    public static final class b extends AbstractC0975x<Comparable<?>> {
        public static final b b = new b("");
        private static final long serialVersionUID = 0;

        private Object readResolve() {
            return b;
        }

        @Override // com.google.common.collect.AbstractC0975x
        /* renamed from: a */
        public final int compareTo(AbstractC0975x<Comparable<?>> abstractC0975x) {
            return abstractC0975x == this ? 0 : -1;
        }

        @Override // com.google.common.collect.AbstractC0975x
        public final void b(StringBuilder sb) {
            sb.append("(-∞");
        }

        @Override // com.google.common.collect.AbstractC0975x
        public final void c(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.AbstractC0975x, java.lang.Comparable
        public final int compareTo(Object obj) {
            return ((AbstractC0975x) obj) == this ? 0 : -1;
        }

        @Override // com.google.common.collect.AbstractC0975x
        public final Comparable<?> d() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.AbstractC0975x
        public final boolean e(Comparable<?> comparable) {
            return true;
        }

        @Override // com.google.common.collect.AbstractC0975x
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        public final String toString() {
            return "-∞";
        }
    }

    /* renamed from: com.google.common.collect.x$c */
    public static final class c<C extends Comparable> extends AbstractC0975x<C> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.AbstractC0975x
        public final void b(StringBuilder sb) {
            sb.append('[');
            sb.append(this.a);
        }

        @Override // com.google.common.collect.AbstractC0975x
        public final void c(StringBuilder sb) {
            sb.append(this.a);
            sb.append(')');
        }

        @Override // com.google.common.collect.AbstractC0975x, java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((AbstractC0975x) obj);
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Comparable, java.lang.Object] */
        @Override // com.google.common.collect.AbstractC0975x
        public final boolean e(C c) {
            e0<Comparable> e0Var = e0.c;
            return this.a.compareTo(c) <= 0;
        }

        @Override // com.google.common.collect.AbstractC0975x
        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "\\" + this.a + DomExceptionUtils.SEPARATOR;
        }
    }

    public AbstractC0975x(C c2) {
        this.a = c2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Comparable, java.lang.Object] */
    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC0975x<C> abstractC0975x) {
        if (abstractC0975x == b.b) {
            return 1;
        }
        if (abstractC0975x == a.b) {
            return -1;
        }
        Object obj = abstractC0975x.a;
        e0<Comparable> e0Var = e0.c;
        int compareTo = this.a.compareTo(obj);
        return compareTo != 0 ? compareTo : Boolean.compare(false, false);
    }

    public abstract void b(StringBuilder sb);

    public abstract void c(StringBuilder sb);

    public C d() {
        return (C) this.a;
    }

    public abstract boolean e(C c2);

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC0975x) {
            try {
                if (compareTo((AbstractC0975x) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();
}
