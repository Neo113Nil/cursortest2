package E4;

import Y4.I0;
import java.util.List;

/* renamed from: E4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0170c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2169a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2170b;

    public C0170c(List list, boolean z4) {
        this.f2170b = list;
        this.f2169a = z4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final int a(List list, H4.k kVar) {
        int b7;
        ?? r02 = this.f2170b;
        p3.f.O("Bound has more components than query's orderBy", r02.size() <= list.size(), new Object[0]);
        int i7 = 0;
        for (int i8 = 0; i8 < r02.size(); i8++) {
            A a2 = (A) list.get(i8);
            I0 i02 = (I0) r02.get(i8);
            if (a2.f2085b.equals(H4.j.f3321b)) {
                p3.f.O("Bound has a non-key value where the key path is being used %s", H4.o.i(i02), i02);
                b7 = H4.h.c(i02.O()).compareTo(kVar.f3323a);
            } else {
                I0 f7 = kVar.f3327e.f(a2.f2085b);
                p3.f.O("Field should exist since document matched the orderBy already.", f7 != null, new Object[0]);
                b7 = H4.o.b(i02, f7);
            }
            if (t.e.b(a2.f2084a, 2)) {
                b7 *= -1;
            }
            i7 = b7;
            if (i7 != 0) {
                break;
            }
        }
        return i7;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final String b() {
        StringBuilder sb = new StringBuilder();
        boolean z4 = true;
        for (I0 i02 : this.f2170b) {
            if (!z4) {
                sb.append(",");
            }
            I0 i03 = H4.o.f3334a;
            StringBuilder sb2 = new StringBuilder();
            H4.o.a(sb2, i02);
            sb.append(sb2.toString());
            z4 = false;
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0170c.class != obj.getClass()) {
            return false;
        }
        C0170c c0170c = (C0170c) obj;
        return this.f2169a == c0170c.f2169a && this.f2170b.equals(c0170c.f2170b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public final int hashCode() {
        return this.f2170b.hashCode() + ((this.f2169a ? 1 : 0) * 31);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Bound(inclusive=");
        sb.append(this.f2169a);
        sb.append(", position=");
        int i7 = 0;
        while (true) {
            ?? r22 = this.f2170b;
            if (i7 >= r22.size()) {
                sb.append(")");
                return sb.toString();
            }
            if (i7 > 0) {
                sb.append(" and ");
            }
            I0 i02 = (I0) r22.get(i7);
            I0 i03 = H4.o.f3334a;
            StringBuilder sb2 = new StringBuilder();
            H4.o.a(sb2, i02);
            sb.append(sb2.toString());
            i7++;
        }
    }
}
