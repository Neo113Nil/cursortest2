package P4;

import a.AbstractC0169a;
import f4.EnumC0429f;
import g4.AbstractC0465j;
import g4.C0471p;
import java.util.Arrays;
import java.util.List;
import n2.AbstractC1341c;

/* renamed from: P4.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142v implements N4.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f2402a;

    /* renamed from: b, reason: collision with root package name */
    public final C0143w f2403b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f2404c = {"[UNINITIALIZED]"};

    /* renamed from: d, reason: collision with root package name */
    public final List[] f2405d = new List[1];

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f2406e = new boolean[1];

    /* renamed from: f, reason: collision with root package name */
    public final Object f2407f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2408g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f2409h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2410i;

    public C0142v(String str, C0143w c0143w) {
        this.f2402a = str;
        this.f2403b = c0143w;
        EnumC0429f enumC0429f = EnumC0429f.f5665a;
        this.f2407f = AbstractC0169a.z(enumC0429f, new J(this, 1));
        this.f2408g = AbstractC0169a.z(enumC0429f, new J(this, 2));
        this.f2409h = AbstractC0169a.z(enumC0429f, new J(this, 0));
        this.f2410i = true;
    }

    @Override // N4.e
    public final int a(String name) {
        kotlin.jvm.internal.i.e(name, "name");
        return -3;
    }

    @Override // N4.e
    public final String b() {
        return this.f2402a;
    }

    @Override // N4.e
    public final AbstractC1341c c() {
        return N4.j.f2190b;
    }

    @Override // N4.e
    public final int d() {
        return 1;
    }

    @Override // N4.e
    public final String e(int i2) {
        return this.f2404c[i2];
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [f4.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [f4.e, java.lang.Object] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0142v) {
            N4.e eVar = (N4.e) obj;
            if (this.f2402a.equals(eVar.b())) {
                C0142v c0142v = (C0142v) obj;
                if (c0142v.f2410i && Arrays.equals((N4.e[]) this.f2408g.getValue(), (N4.e[]) c0142v.f2408g.getValue()) && 1 == eVar.d() && kotlin.jvm.internal.i.a(h(0).b(), eVar.h(0).b()) && kotlin.jvm.internal.i.a(h(0).c(), eVar.h(0).c())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // N4.e
    public final List g(int i2) {
        List list = this.f2405d[i2];
        return list == null ? C0471p.f5750a : list;
    }

    @Override // N4.e
    public final List getAnnotations() {
        return C0471p.f5750a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f4.e, java.lang.Object] */
    @Override // N4.e
    public final N4.e h(int i2) {
        return ((M4.a[]) this.f2407f.getValue())[i2].c();
    }

    public final int hashCode() {
        return j() * 31;
    }

    @Override // N4.e
    public final boolean i(int i2) {
        return this.f2406e[i2];
    }

    @Override // N4.e
    public final boolean isInline() {
        return this.f2410i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f4.e, java.lang.Object] */
    public final int j() {
        return ((Number) this.f2409h.getValue()).intValue();
    }

    public final String toString() {
        return AbstractC0465j.K0(K1.b.s0(0, 1), ", ", this.f2402a.concat("("), ")", new F4.o(6, this), 24);
    }

    @Override // N4.e
    public final void f() {
    }
}
