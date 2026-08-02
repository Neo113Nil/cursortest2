package Qj0;

import org.jetbrains.annotations.NotNull;

/* renamed from: Qj0.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3895o extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    private final int f23691a;

    public C3895o(int i11) {
        super(0);
        this.f23691a = i11;
    }

    public final int a() {
        return this.f23691a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3895o) && this.f23691a == ((C3895o) obj).f23691a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23691a);
    }

    @NotNull
    public final String toString() {
        return K00.b.e(this.f23691a, ")", new StringBuilder("ImageWidth(width="));
    }
}
