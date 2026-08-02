package Ve;

/* renamed from: Ve.gq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4282gq extends Ki {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f31129a;

    public C4282gq(boolean z11) {
        this.f31129a = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4282gq) && this.f31129a == ((C4282gq) obj).f31129a;
    }

    public final int hashCode() {
        boolean z11 = this.f31129a;
        if (z11) {
            return 1;
        }
        return z11 ? 1 : 0;
    }

    public final String toString() {
        return Pk0.a.a(")", new StringBuilder("HandleBindingPayAnotherCard(needUpdateBinding="), this.f31129a);
    }
}
