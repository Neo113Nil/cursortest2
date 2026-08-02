package W;

import W.C4854z;
import androidx.annotation.NonNull;

/* renamed from: W.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C4838i extends C4854z.a {

    /* renamed from: a, reason: collision with root package name */
    private final C4852x f33070a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33071b;

    C4838i(C4852x c4852x, int i11) {
        if (c4852x == null) {
            throw new NullPointerException("Null quality");
        }
        this.f33070a = c4852x;
        this.f33071b = i11;
    }

    @Override // W.C4854z.a
    final int a() {
        return this.f33071b;
    }

    @Override // W.C4854z.a
    @NonNull
    final C4852x b() {
        return this.f33070a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4854z.a)) {
            return false;
        }
        C4854z.a aVar = (C4854z.a) obj;
        return this.f33070a.equals(aVar.b()) && this.f33071b == aVar.a();
    }

    public final int hashCode() {
        return ((this.f33070a.hashCode() ^ 1000003) * 1000003) ^ this.f33071b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("QualityRatio{quality=");
        sb2.append(this.f33070a);
        sb2.append(", aspectRatio=");
        return K00.b.e(this.f33071b, "}", sb2);
    }
}
