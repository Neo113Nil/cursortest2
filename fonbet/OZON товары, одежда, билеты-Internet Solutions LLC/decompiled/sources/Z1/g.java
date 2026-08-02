package Z1;

import Hj0.T;
import a2.InterfaceC4921a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class g implements d {

    /* renamed from: a, reason: collision with root package name */
    private final float f35319a;

    /* renamed from: b, reason: collision with root package name */
    private final float f35320b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC4921a f35321c;

    public g(float f7, float f11, @NotNull InterfaceC4921a interfaceC4921a) {
        this.f35319a = f7;
        this.f35320b = f11;
        this.f35321c = interfaceC4921a;
    }

    @Override // Z1.k
    public final long F(float f7) {
        return T.f(this.f35321c.a(f7), 4294967296L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f35319a, gVar.f35319a) == 0 && Float.compare(this.f35320b, gVar.f35320b) == 0 && Intrinsics.d(this.f35321c, gVar.f35321c);
    }

    @Override // Z1.d
    public final float g() {
        return this.f35319a;
    }

    public final int hashCode() {
        return this.f35321c.hashCode() + Pk0.b.a(this.f35320b, Float.hashCode(this.f35319a) * 31, 31);
    }

    @Override // Z1.k
    public final float p(long j11) {
        if (v.b(u.d(j11), 4294967296L)) {
            return this.f35321c.b(u.e(j11));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @NotNull
    public final String toString() {
        return "DensityWithConverter(density=" + this.f35319a + ", fontScale=" + this.f35320b + ", converter=" + this.f35321c + ')';
    }

    @Override // Z1.k
    public final float u1() {
        return this.f35320b;
    }
}
