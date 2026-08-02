package Ve;

/* loaded from: classes10.dex */
public final class Ja extends AbstractC4411lb {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f29283a;

    public Ja(boolean z11) {
        this.f29283a = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Ja) && this.f29283a == ((Ja) obj).f29283a;
    }

    public final int hashCode() {
        boolean z11 = this.f29283a;
        if (z11) {
            return 1;
        }
        return z11 ? 1 : 0;
    }

    public final String toString() {
        return Pk0.a.a(")", new StringBuilder("IsEnabledByUser(value="), this.f29283a);
    }
}
