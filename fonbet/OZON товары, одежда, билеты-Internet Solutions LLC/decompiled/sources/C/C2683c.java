package C;

import C.r;

/* renamed from: C.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2683c extends r.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f4166a;

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f4167b;

    C2683c(int i11, Throwable th2) {
        this.f4166a = i11;
        this.f4167b = th2;
    }

    @Override // C.r.a
    public final Throwable c() {
        return this.f4167b;
    }

    @Override // C.r.a
    public final int d() {
        return this.f4166a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r.a)) {
            return false;
        }
        r.a aVar = (r.a) obj;
        if (this.f4166a != aVar.d()) {
            return false;
        }
        Throwable th2 = this.f4167b;
        return th2 == null ? aVar.c() == null : th2.equals(aVar.c());
    }

    public final int hashCode() {
        int i11 = (this.f4166a ^ 1000003) * 1000003;
        Throwable th2 = this.f4167b;
        return i11 ^ (th2 == null ? 0 : th2.hashCode());
    }

    public final String toString() {
        return "StateError{code=" + this.f4166a + ", cause=" + this.f4167b + "}";
    }
}
