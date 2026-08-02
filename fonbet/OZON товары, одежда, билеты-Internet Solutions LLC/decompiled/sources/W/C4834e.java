package W;

import W.C4845p;
import androidx.annotation.NonNull;

/* renamed from: W.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C4834e extends C4845p.a {

    /* renamed from: b, reason: collision with root package name */
    private final C4852x f33026b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33027c;

    C4834e(C4852x c4852x, int i11) {
        if (c4852x == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.f33026b = c4852x;
        this.f33027c = i11;
    }

    @Override // W.C4845p.a
    @NonNull
    final C4852x b() {
        return this.f33026b;
    }

    @Override // W.C4845p.a
    final int c() {
        return this.f33027c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4845p.a)) {
            return false;
        }
        C4845p.a aVar = (C4845p.a) obj;
        return this.f33026b.equals(aVar.b()) && this.f33027c == aVar.c();
    }

    public final int hashCode() {
        return ((this.f33026b.hashCode() ^ 1000003) * 1000003) ^ this.f33027c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb2.append(this.f33026b);
        sb2.append(", fallbackRule=");
        return K00.b.e(this.f33027c, "}", sb2);
    }
}
