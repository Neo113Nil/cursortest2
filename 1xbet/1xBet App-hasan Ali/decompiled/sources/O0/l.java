package O0;

import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class l implements Comparable {

    /* renamed from: l, reason: collision with root package name */
    public static final l f4026l;

    /* renamed from: m, reason: collision with root package name */
    public static final l f4027m;

    /* renamed from: n, reason: collision with root package name */
    public static final l f4028n;

    /* renamed from: o, reason: collision with root package name */
    public static final l f4029o;

    /* renamed from: p, reason: collision with root package name */
    public static final l f4030p;

    /* renamed from: q, reason: collision with root package name */
    public static final l f4031q;

    /* renamed from: r, reason: collision with root package name */
    public static final l f4032r;

    /* renamed from: k, reason: collision with root package name */
    public final int f4033k;

    static {
        l lVar = new l(100);
        l lVar2 = new l(200);
        l lVar3 = new l(300);
        l lVar4 = new l(400);
        l lVar5 = new l(500);
        l lVar6 = new l(600);
        f4026l = lVar6;
        l lVar7 = new l(700);
        l lVar8 = new l(800);
        l lVar9 = new l(900);
        f4027m = lVar4;
        f4028n = lVar5;
        f4029o = lVar6;
        f4030p = lVar7;
        f4031q = lVar8;
        f4032r = lVar9;
        X3.n.O(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9);
    }

    public l(int i) {
        this.f4033k = i;
        boolean z3 = false;
        if (1 <= i && i < 1001) {
            z3 = true;
        }
        if (z3) {
            return;
        }
        Q0.a.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.l.g(this.f4033k, ((l) obj).f4033k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return this.f4033k == ((l) obj).f4033k;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4033k;
    }

    public final String toString() {
        return AbstractC2107A.t(new StringBuilder("FontWeight(weight="), this.f4033k, ')');
    }
}
