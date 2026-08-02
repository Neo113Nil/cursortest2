package A0;

import Z1.s;
import k1.C7456b;
import k1.C7460f;
import k1.C7461g;
import k1.C7463i;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7839p0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g extends a {
    @Override // A0.a
    public final a copy(b bVar, b bVar2, b bVar3, b bVar4) {
        return new g(bVar, bVar2, bVar3, bVar4);
    }

    @Override // A0.a
    @NotNull
    /* renamed from: createOutline-LjSzlW0 */
    public final AbstractC7839p0 mo0createOutlineLjSzlW0(long j11, float f7, float f11, float f12, float f13, @NotNull s sVar) {
        if (f7 + f11 + f12 + f13 == 0.0f) {
            return new AbstractC7839p0.b(C7461g.a(0L, j11));
        }
        C7460f a11 = C7461g.a(0L, j11);
        s sVar2 = s.Ltr;
        float f14 = sVar == sVar2 ? f7 : f11;
        long a12 = C7456b.a(f14, f14);
        float f15 = sVar == sVar2 ? f11 : f7;
        long a13 = C7456b.a(f15, f15);
        float f16 = sVar == sVar2 ? f12 : f13;
        long a14 = C7456b.a(f16, f16);
        float f17 = sVar == sVar2 ? f13 : f12;
        return new AbstractC7839p0.c(C7463i.a(a11, a12, a13, a14, C7456b.a(f17, f17)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(getTopStart(), gVar.getTopStart()) && Intrinsics.d(getTopEnd(), gVar.getTopEnd()) && Intrinsics.d(getBottomEnd(), gVar.getBottomEnd()) && Intrinsics.d(getBottomStart(), gVar.getBottomStart());
    }

    public final int hashCode() {
        return getBottomStart().hashCode() + ((getBottomEnd().hashCode() + ((getTopEnd().hashCode() + (getTopStart().hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "RoundedCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }
}
