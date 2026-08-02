package Qj0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class r extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23704a;

    public r(boolean z11) {
        super(0);
        this.f23704a = z11;
    }

    public final boolean a() {
        return this.f23704a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f23704a == ((r) obj).f23704a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23704a);
    }

    @NotNull
    public final String toString() {
        return Pk0.a.a(")", new StringBuilder("IsLowPowerMode(isEnabled="), this.f23704a);
    }
}
