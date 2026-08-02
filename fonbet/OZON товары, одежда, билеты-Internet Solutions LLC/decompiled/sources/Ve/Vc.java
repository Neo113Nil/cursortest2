package Ve;

/* loaded from: classes10.dex */
public final class Vc {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30192a;

    public Vc(boolean z11) {
        this.f30192a = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Vc) && this.f30192a == ((Vc) obj).f30192a;
    }

    public final int hashCode() {
        boolean z11 = this.f30192a;
        if (z11) {
            return 1;
        }
        return z11 ? 1 : 0;
    }

    public final String toString() {
        return Pk0.a.a(")", new StringBuilder("BnplGraphSection(isCurrentPayment="), this.f30192a);
    }
}
