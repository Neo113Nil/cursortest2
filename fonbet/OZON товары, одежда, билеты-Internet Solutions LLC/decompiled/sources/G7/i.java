package G7;

import C.o0;

/* loaded from: classes9.dex */
final class i extends e {

    /* renamed from: a, reason: collision with root package name */
    private final String f9738a;

    @Override // G7.e
    public final String a() {
        return this.f9738a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f9738a.equals(((e) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f9738a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return o0.c(new StringBuilder("IntegrityTokenResponse{token="), this.f9738a, "}");
    }
}
