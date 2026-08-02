package Ve;

/* loaded from: classes10.dex */
public final class B9 extends AbstractC4411lb {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28683a;

    public B9(boolean z11) {
        this.f28683a = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof B9) && this.f28683a == ((B9) obj).f28683a;
    }

    public final int hashCode() {
        boolean z11 = this.f28683a;
        if (z11) {
            return 1;
        }
        return z11 ? 1 : 0;
    }

    public final String toString() {
        return Pk0.a.a(")", new StringBuilder("IsEnabledByBank(value="), this.f28683a);
    }
}
