package V1;

import F3.G;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import l1.C7807Z;
import l1.F0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final F0 f27900a;

    /* renamed from: b, reason: collision with root package name */
    private final float f27901b;

    public b(@NotNull F0 f02, float f7) {
        this.f27900a = f02;
        this.f27901b = f7;
    }

    @Override // V1.l
    public final long a() {
        long j11;
        int i11 = C7807Z.f72260n;
        j11 = C7807Z.f72259m;
        return j11;
    }

    @Override // V1.l
    @NotNull
    public final AbstractC7799Q d() {
        return this.f27900a;
    }

    @NotNull
    public final F0 e() {
        return this.f27900a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f27900a, bVar.f27900a) && Float.compare(this.f27901b, bVar.f27901b) == 0;
    }

    @Override // V1.l
    public final float getAlpha() {
        return this.f27901b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27901b) + (this.f27900a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.f27900a);
        sb2.append(", alpha=");
        return G.a(sb2, this.f27901b, ')');
    }
}
