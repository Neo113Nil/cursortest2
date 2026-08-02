package Q1;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class J implements InterfaceC3841j {

    /* renamed from: a, reason: collision with root package name */
    private final int f22831a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22832b;

    public J(int i11, int i12) {
        this.f22831a = i11;
        this.f22832b = i12;
    }

    @Override // Q1.InterfaceC3841j
    public final void a(@NotNull C3844m c3844m) {
        int e11 = kotlin.ranges.h.e(this.f22831a, 0, c3844m.h());
        int e12 = kotlin.ranges.h.e(this.f22832b, 0, c3844m.h());
        if (e11 < e12) {
            c3844m.o(e11, e12);
        } else {
            c3844m.o(e12, e11);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j11 = (J) obj;
        return this.f22831a == j11.f22831a && this.f22832b == j11.f22832b;
    }

    public final int hashCode() {
        return (this.f22831a * 31) + this.f22832b;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetSelectionCommand(start=");
        sb2.append(this.f22831a);
        sb2.append(", end=");
        return Ek.a.d(sb2, this.f22832b, ')');
    }
}
