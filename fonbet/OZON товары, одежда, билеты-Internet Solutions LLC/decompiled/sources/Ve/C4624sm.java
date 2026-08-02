package Ve;

/* renamed from: Ve.sm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4624sm extends E {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f32064a;

    public C4624sm(boolean z11) {
        this.f32064a = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4624sm) && this.f32064a == ((C4624sm) obj).f32064a;
    }

    public final int hashCode() {
        boolean z11 = this.f32064a;
        if (z11) {
            return 1;
        }
        return z11 ? 1 : 0;
    }

    public final String toString() {
        return Pk0.a.a(")", new StringBuilder("UpdateCheckBoxAgreementStatus(isChecked="), this.f32064a);
    }
}
