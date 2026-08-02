package com.google.common.collect;

import com.google.common.collect.AbstractC0975x;
import java.lang.Comparable;

/* loaded from: classes4.dex */
public final class e0<C extends Comparable> extends f0 implements com.google.common.base.l<C> {
    public static final e0<Comparable> c = new e0<>(AbstractC0975x.b.b, AbstractC0975x.a.b);
    private static final long serialVersionUID = 0;
    public final AbstractC0975x<C> a;
    public final AbstractC0975x<C> b;

    public e0(AbstractC0975x<C> abstractC0975x, AbstractC0975x<C> abstractC0975x2) {
        this.a = abstractC0975x;
        this.b = abstractC0975x2;
        if (abstractC0975x.compareTo(abstractC0975x2) > 0 || abstractC0975x == AbstractC0975x.a.b || abstractC0975x2 == AbstractC0975x.b.b) {
            StringBuilder sb = new StringBuilder("Invalid range: ");
            StringBuilder sb2 = new StringBuilder(16);
            abstractC0975x.b(sb2);
            sb2.append("..");
            abstractC0975x2.c(sb2);
            sb.append(sb2.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.base.l
    @Deprecated
    public final boolean apply(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return this.a.e(comparable) && !this.b.e(comparable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (this.a.equals(e0Var.a) && this.b.equals(e0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public Object readResolve() {
        e0<Comparable> e0Var = c;
        return equals(e0Var) ? e0Var : this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.a.b(sb);
        sb.append("..");
        this.b.c(sb);
        return sb.toString();
    }
}
