package Z0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private int f35314a;

    public a() {
        this(0);
    }

    public final int a() {
        return this.f35314a;
    }

    public final void b(int i11) {
        this.f35314a += i11;
    }

    public final void c(int i11) {
        this.f35314a = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f35314a == ((a) obj).f35314a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35314a);
    }

    @NotNull
    public final String toString() {
        return Ek.a.d(new StringBuilder("DeltaCounter(count="), this.f35314a, ')');
    }

    public a(int i11) {
        this.f35314a = 0;
    }
}
