package E;

import E.C2906w;

/* renamed from: E.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2887c extends C2906w.a {

    /* renamed from: a, reason: collision with root package name */
    private final N.p<androidx.camera.core.p> f6882a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6883b;

    C2887c(N.p<androidx.camera.core.p> pVar, int i11) {
        if (pVar == null) {
            throw new NullPointerException("Null packet");
        }
        this.f6882a = pVar;
        this.f6883b = i11;
    }

    @Override // E.C2906w.a
    final int a() {
        return this.f6883b;
    }

    @Override // E.C2906w.a
    final N.p<androidx.camera.core.p> b() {
        return this.f6882a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2906w.a)) {
            return false;
        }
        C2906w.a aVar = (C2906w.a) obj;
        return this.f6882a.equals(aVar.b()) && this.f6883b == aVar.a();
    }

    public final int hashCode() {
        return ((this.f6882a.hashCode() ^ 1000003) * 1000003) ^ this.f6883b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("In{packet=");
        sb2.append(this.f6882a);
        sb2.append(", jpegQuality=");
        return K00.b.e(this.f6883b, "}", sb2);
    }
}
