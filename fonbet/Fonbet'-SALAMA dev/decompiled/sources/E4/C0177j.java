package E4;

import Y4.I0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: E4.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0177j extends AbstractC0178k {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC0176i f2199a;

    /* renamed from: b, reason: collision with root package name */
    public final I0 f2200b;

    /* renamed from: c, reason: collision with root package name */
    public final H4.j f2201c;

    public C0177j(H4.j jVar, EnumC0176i enumC0176i, I0 i02) {
        this.f2201c = jVar;
        this.f2199a = enumC0176i;
        this.f2200b = i02;
    }

    public static C0177j e(H4.j jVar, EnumC0176i enumC0176i, I0 i02) {
        boolean equals = jVar.equals(H4.j.f3321b);
        EnumC0176i enumC0176i2 = EnumC0176i.ARRAY_CONTAINS_ANY;
        EnumC0176i enumC0176i3 = EnumC0176i.ARRAY_CONTAINS;
        EnumC0176i enumC0176i4 = EnumC0176i.NOT_IN;
        EnumC0176i enumC0176i5 = EnumC0176i.IN;
        if (equals) {
            if (enumC0176i == enumC0176i5) {
                return new v(jVar, i02, 0);
            }
            if (enumC0176i == enumC0176i4) {
                return new v(jVar, i02, 1);
            }
            p3.f.O(enumC0176i.f2198a.concat("queries don't make sense on document keys"), (enumC0176i == enumC0176i3 || enumC0176i == enumC0176i2) ? false : true, new Object[0]);
            return new v(jVar, enumC0176i, i02);
        }
        if (enumC0176i == enumC0176i3) {
            return new C0168a(jVar, enumC0176i3, i02, 1);
        }
        if (enumC0176i == enumC0176i5) {
            u uVar = new u(jVar, enumC0176i5, i02);
            p3.f.O("InFilter expects an ArrayValue", H4.o.f(i02), new Object[0]);
            return uVar;
        }
        if (enumC0176i == enumC0176i2) {
            C0168a c0168a = new C0168a(jVar, enumC0176i2, i02, 0);
            p3.f.O("ArrayContainsAnyFilter expects an ArrayValue", H4.o.f(i02), new Object[0]);
            return c0168a;
        }
        if (enumC0176i != enumC0176i4) {
            return new C0177j(jVar, enumC0176i, i02);
        }
        C0168a c0168a2 = new C0168a(jVar, enumC0176i4, i02, 2);
        p3.f.O("NotInFilter expects an ArrayValue", H4.o.f(i02), new Object[0]);
        return c0168a2;
    }

    @Override // E4.AbstractC0178k
    public final String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2201c.c());
        sb.append(this.f2199a.f2198a);
        I0 i02 = H4.o.f3334a;
        StringBuilder sb2 = new StringBuilder();
        H4.o.a(sb2, this.f2200b);
        sb.append(sb2.toString());
        return sb.toString();
    }

    @Override // E4.AbstractC0178k
    public final List b() {
        return Collections.singletonList(this);
    }

    @Override // E4.AbstractC0178k
    public final List c() {
        return Collections.singletonList(this);
    }

    @Override // E4.AbstractC0178k
    public boolean d(H4.k kVar) {
        I0 f7 = kVar.f3327e.f(this.f2201c);
        EnumC0176i enumC0176i = EnumC0176i.NOT_EQUAL;
        I0 i02 = this.f2200b;
        return this.f2199a == enumC0176i ? f7 != null && g(H4.o.b(f7, i02)) : f7 != null && H4.o.l(f7) == H4.o.l(i02) && g(H4.o.b(f7, i02));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0177j)) {
            return false;
        }
        C0177j c0177j = (C0177j) obj;
        return this.f2199a == c0177j.f2199a && this.f2201c.equals(c0177j.f2201c) && this.f2200b.equals(c0177j.f2200b);
    }

    public final boolean f() {
        return Arrays.asList(EnumC0176i.LESS_THAN, EnumC0176i.LESS_THAN_OR_EQUAL, EnumC0176i.GREATER_THAN, EnumC0176i.GREATER_THAN_OR_EQUAL, EnumC0176i.NOT_EQUAL, EnumC0176i.NOT_IN).contains(this.f2199a);
    }

    public final boolean g(int i7) {
        EnumC0176i enumC0176i = this.f2199a;
        int ordinal = enumC0176i.ordinal();
        if (ordinal == 0) {
            return i7 < 0;
        }
        if (ordinal == 1) {
            return i7 <= 0;
        }
        if (ordinal == 2) {
            return i7 == 0;
        }
        if (ordinal == 3) {
            return i7 != 0;
        }
        if (ordinal == 4) {
            return i7 > 0;
        }
        if (ordinal == 5) {
            return i7 >= 0;
        }
        p3.f.F("Unknown FieldFilter operator: %s", enumC0176i);
        throw null;
    }

    public final int hashCode() {
        return this.f2200b.hashCode() + ((this.f2201c.hashCode() + ((this.f2199a.hashCode() + 1147) * 31)) * 31);
    }

    public final String toString() {
        return a();
    }
}
