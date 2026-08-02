package Qj0;

import org.jetbrains.annotations.NotNull;

/* renamed from: Qj0.m, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3893m extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    private final int f23681a;

    public C3893m(int i11) {
        super(0);
        this.f23681a = i11;
    }

    public final int a() {
        return this.f23681a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3893m) && this.f23681a == ((C3893m) obj).f23681a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23681a);
    }

    @NotNull
    public final String toString() {
        return K00.b.e(this.f23681a, ")", new StringBuilder("ImageHeight(height="));
    }
}
