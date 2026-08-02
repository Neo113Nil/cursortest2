package Kd;

import Kk.C3532b;
import org.jetbrains.annotations.NotNull;

/* renamed from: Kd.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3511h {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final C3511h f15908e = new C3511h(null, false);

    /* renamed from: a, reason: collision with root package name */
    private final EnumC3514k f15909a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC3512i f15910b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f15911c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15912d;

    public C3511h(EnumC3514k enumC3514k, EnumC3512i enumC3512i, boolean z11, boolean z12) {
        this.f15909a = enumC3514k;
        this.f15910b = enumC3512i;
        this.f15911c = z11;
        this.f15912d = z12;
    }

    public static C3511h b(C3511h c3511h) {
        EnumC3514k enumC3514k = c3511h.f15909a;
        EnumC3512i enumC3512i = c3511h.f15910b;
        boolean z11 = c3511h.f15911c;
        c3511h.getClass();
        return new C3511h(enumC3514k, enumC3512i, z11, true);
    }

    public final boolean c() {
        return this.f15911c;
    }

    public final EnumC3512i d() {
        return this.f15910b;
    }

    public final EnumC3514k e() {
        return this.f15909a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3511h)) {
            return false;
        }
        C3511h c3511h = (C3511h) obj;
        return this.f15909a == c3511h.f15909a && this.f15910b == c3511h.f15910b && this.f15911c == c3511h.f15911c && this.f15912d == c3511h.f15912d;
    }

    public final boolean f() {
        return this.f15912d;
    }

    public final int hashCode() {
        EnumC3514k enumC3514k = this.f15909a;
        int hashCode = (enumC3514k == null ? 0 : enumC3514k.hashCode()) * 31;
        EnumC3512i enumC3512i = this.f15910b;
        return Boolean.hashCode(this.f15912d) + C3532b.a((hashCode + (enumC3512i != null ? enumC3512i.hashCode() : 0)) * 31, 31, this.f15911c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JavaTypeQualifiers(nullability=");
        sb2.append(this.f15909a);
        sb2.append(", mutability=");
        sb2.append(this.f15910b);
        sb2.append(", definitelyNotNull=");
        sb2.append(this.f15911c);
        sb2.append(", isNullabilityQualifierForWarning=");
        return B4.V.d(sb2, this.f15912d, ')');
    }

    public /* synthetic */ C3511h(EnumC3514k enumC3514k, boolean z11) {
        this(enumC3514k, null, z11, false);
    }
}
