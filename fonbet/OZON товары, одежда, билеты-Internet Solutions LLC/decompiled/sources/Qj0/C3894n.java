package Qj0;

import org.jetbrains.annotations.NotNull;

/* renamed from: Qj0.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3894n extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    private final int f23686a;

    public C3894n(int i11) {
        super(0);
        this.f23686a = i11;
    }

    public final int a() {
        return this.f23686a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3894n) && this.f23686a == ((C3894n) obj).f23686a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23686a);
    }

    @NotNull
    public final String toString() {
        return K00.b.e(this.f23686a, ")", new StringBuilder("ImageLoadPriority(value="));
    }
}
