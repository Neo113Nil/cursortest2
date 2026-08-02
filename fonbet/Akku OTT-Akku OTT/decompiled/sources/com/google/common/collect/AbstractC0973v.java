package com.google.common.collect;

import java.util.Comparator;

/* renamed from: com.google.common.collect.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0973v {
    public static final a a = new a();
    public static final b b = new b(-1);
    public static final b c = new b(1);

    /* renamed from: com.google.common.collect.v$a */
    public class a extends AbstractC0973v {
        public static AbstractC0973v g(int i) {
            return i < 0 ? AbstractC0973v.b : i > 0 ? AbstractC0973v.c : AbstractC0973v.a;
        }

        @Override // com.google.common.collect.AbstractC0973v
        public final AbstractC0973v a(int i, int i2) {
            return g(Integer.compare(i, i2));
        }

        @Override // com.google.common.collect.AbstractC0973v
        public final AbstractC0973v b(long j, long j2) {
            return g(Long.compare(j, j2));
        }

        @Override // com.google.common.collect.AbstractC0973v
        public final <T> AbstractC0973v c(T t, T t2, Comparator<T> comparator) {
            return g(comparator.compare(t, t2));
        }

        @Override // com.google.common.collect.AbstractC0973v
        public final AbstractC0973v d(boolean z, boolean z2) {
            return g(Boolean.compare(z, z2));
        }

        @Override // com.google.common.collect.AbstractC0973v
        public final AbstractC0973v e(boolean z, boolean z2) {
            return g(Boolean.compare(z2, z));
        }

        @Override // com.google.common.collect.AbstractC0973v
        public final int f() {
            return 0;
        }
    }

    /* renamed from: com.google.common.collect.v$b */
    public static final class b extends AbstractC0973v {
        public final int d;

        public b(int i) {
            this.d = i;
        }

        @Override // com.google.common.collect.AbstractC0973v
        public final AbstractC0973v a(int i, int i2) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC0973v
        public final AbstractC0973v b(long j, long j2) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC0973v
        public final <T> AbstractC0973v c(T t, T t2, Comparator<T> comparator) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC0973v
        public final AbstractC0973v d(boolean z, boolean z2) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC0973v
        public final AbstractC0973v e(boolean z, boolean z2) {
            return this;
        }

        @Override // com.google.common.collect.AbstractC0973v
        public final int f() {
            return this.d;
        }
    }

    public abstract AbstractC0973v a(int i, int i2);

    public abstract AbstractC0973v b(long j, long j2);

    public abstract <T> AbstractC0973v c(T t, T t2, Comparator<T> comparator);

    public abstract AbstractC0973v d(boolean z, boolean z2);

    public abstract AbstractC0973v e(boolean z, boolean z2);

    public abstract int f();
}
