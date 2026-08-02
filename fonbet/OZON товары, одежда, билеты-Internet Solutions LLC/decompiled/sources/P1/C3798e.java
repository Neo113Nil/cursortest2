package P1;

import org.jetbrains.annotations.NotNull;

/* renamed from: P1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3798e implements L {

    /* renamed from: a, reason: collision with root package name */
    private final int f21548a;

    public C3798e(int i11) {
        this.f21548a = i11;
    }

    @NotNull
    public final F a(@NotNull F f7) {
        int i11 = this.f21548a;
        return (i11 == 0 || i11 == Integer.MAX_VALUE) ? f7 : new F(kotlin.ranges.h.e(f7.l() + i11, 1, 1000));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3798e) && this.f21548a == ((C3798e) obj).f21548a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21548a);
    }

    @NotNull
    public final String toString() {
        return Ek.a.d(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f21548a, ')');
    }
}
