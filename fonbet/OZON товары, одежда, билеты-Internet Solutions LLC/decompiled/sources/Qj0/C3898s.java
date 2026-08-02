package Qj0;

import org.jetbrains.annotations.NotNull;

/* renamed from: Qj0.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3898s extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f23706a;

    public C3898s(boolean z11) {
        super(0);
        this.f23706a = z11;
    }

    public final boolean a() {
        return this.f23706a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3898s) && this.f23706a == ((C3898s) obj).f23706a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23706a);
    }

    @NotNull
    public final String toString() {
        return Pk0.a.a(")", new StringBuilder("IsVideoPlaceholder(isVideoPlaceholder="), this.f23706a);
    }
}
