package kotlin.jvm.internal;

/* loaded from: classes.dex */
public final class d implements w1.c, kotlin.jvm.internal.c {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f7953b;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f7954a;

    static {
        java.util.List H2 = i1.AbstractC0191j.H(s1.InterfaceC0991a.class, s1.l.class, s1.p.class, s1.q.class, s1.r.class, s1.s.class, s1.t.class, s1.u.class, s1.v.class, s1.w.class, s1.b.class, s1.c.class, s1.d.class, s1.e.class, s1.f.class, s1.g.class, s1.h.class, s1.i.class, s1.j.class, s1.k.class, s1.m.class, s1.n.class, s1.o.class);
        java.util.ArrayList arrayList = new java.util.ArrayList(i1.AbstractC0192k.K(H2));
        int i2 = 0;
        for (java.lang.Object obj : H2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                i1.AbstractC0191j.J();
                throw null;
            }
            arrayList.add(new h1.C0172d((java.lang.Class) obj, java.lang.Integer.valueOf(i2)));
            i2 = i3;
        }
        f7953b = i1.AbstractC0202u.J(arrayList);
    }

    public d(java.lang.Class jClass) {
        kotlin.jvm.internal.i.e(jClass, "jClass");
        this.f7954a = jClass;
    }

    @Override // kotlin.jvm.internal.c
    public final java.lang.Class a() {
        return this.f7954a;
    }

    public final java.lang.String b() {
        java.lang.String d2;
        java.lang.Class jClass = this.f7954a;
        kotlin.jvm.internal.i.e(jClass, "jClass");
        java.lang.String str = null;
        if (jClass.isAnonymousClass()) {
            return null;
        }
        if (!jClass.isLocalClass()) {
            if (!jClass.isArray()) {
                java.lang.String d3 = kotlin.jvm.internal.s.d(jClass.getName());
                return d3 == null ? jClass.getSimpleName() : d3;
            }
            java.lang.Class<?> componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (d2 = kotlin.jvm.internal.s.d(componentType.getName())) != null) {
                str = d2.concat("Array");
            }
            return str == null ? "Array" : str;
        }
        java.lang.String simpleName = jClass.getSimpleName();
        java.lang.reflect.Method enclosingMethod = jClass.getEnclosingMethod();
        if (enclosingMethod != null) {
            return y1.g.a0(simpleName, enclosingMethod.getName() + '$');
        }
        java.lang.reflect.Constructor<?> enclosingConstructor = jClass.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return y1.g.a0(simpleName, enclosingConstructor.getName() + '$');
        }
        int Q2 = y1.g.Q(simpleName, '$', 0, false, 6);
        if (Q2 == -1) {
            return simpleName;
        }
        java.lang.String substring = simpleName.substring(Q2 + 1, simpleName.length());
        kotlin.jvm.internal.i.d(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof kotlin.jvm.internal.d) && Q1.d.n(this).equals(Q1.d.n((w1.c) obj));
    }

    public final int hashCode() {
        return Q1.d.n(this).hashCode();
    }

    public final java.lang.String toString() {
        return this.f7954a + " (Kotlin reflection is not available)";
    }
}
