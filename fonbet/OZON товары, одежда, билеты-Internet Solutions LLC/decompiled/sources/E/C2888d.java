package E;

import C.I;
import E.A;
import androidx.annotation.NonNull;

/* renamed from: E.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2888d extends A.a {

    /* renamed from: a, reason: collision with root package name */
    private final N.p<byte[]> f6887a;

    /* renamed from: b, reason: collision with root package name */
    private final I.g f6888b;

    C2888d(N.p<byte[]> pVar, I.g gVar) {
        if (pVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f6887a = pVar;
        this.f6888b = gVar;
    }

    @Override // E.A.a
    @NonNull
    final I.g a() {
        return this.f6888b;
    }

    @Override // E.A.a
    @NonNull
    final N.p<byte[]> b() {
        return this.f6887a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof A.a)) {
            return false;
        }
        A.a aVar = (A.a) obj;
        return this.f6887a.equals(aVar.b()) && this.f6888b.equals(aVar.a());
    }

    public final int hashCode() {
        return ((this.f6887a.hashCode() ^ 1000003) * 1000003) ^ this.f6888b.hashCode();
    }

    public final String toString() {
        return "In{packet=" + this.f6887a + ", outputFileOptions=" + this.f6888b + "}";
    }
}
