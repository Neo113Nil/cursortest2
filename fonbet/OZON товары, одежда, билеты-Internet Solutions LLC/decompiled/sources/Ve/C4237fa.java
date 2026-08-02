package Ve;

/* renamed from: Ve.fa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4237fa extends AbstractC4411lb {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f31016a;

    public C4237fa(boolean z11) {
        this.f31016a = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4237fa) && this.f31016a == ((C4237fa) obj).f31016a;
    }

    public final int hashCode() {
        boolean z11 = this.f31016a;
        if (z11) {
            return 1;
        }
        return z11 ? 1 : 0;
    }

    public final String toString() {
        return Pk0.a.a(")", new StringBuilder("IsEnabledByMerchant(value="), this.f31016a);
    }
}
