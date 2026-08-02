package O;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    private final P.f f19682a;

    /* renamed from: b, reason: collision with root package name */
    private final P.f f19683b;

    a(P.f fVar, P.f fVar2) {
        this.f19682a = fVar;
        this.f19683b = fVar2;
    }

    @Override // O.d
    @NonNull
    public final P.f a() {
        return this.f19682a;
    }

    @Override // O.d
    @NonNull
    public final P.f b() {
        return this.f19683b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f19682a.equals(dVar.a()) && this.f19683b.equals(dVar.b());
    }

    public final int hashCode() {
        return ((this.f19682a.hashCode() ^ 1000003) * 1000003) ^ this.f19683b.hashCode();
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f19682a + ", secondaryOutConfig=" + this.f19683b + "}";
    }
}
