package Qj0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class Q extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    private final int f23532a;

    public Q(int i11) {
        super(0);
        this.f23532a = i11;
    }

    public final int a() {
        return this.f23532a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Q) && this.f23532a == ((Q) obj).f23532a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23532a);
    }

    @NotNull
    public final String toString() {
        return K00.b.e(this.f23532a, ")", new StringBuilder("StatusCode(code="));
    }
}
