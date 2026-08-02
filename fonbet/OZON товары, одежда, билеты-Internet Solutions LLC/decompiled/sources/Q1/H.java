package Q1;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class H implements InterfaceC3841j {

    /* renamed from: a, reason: collision with root package name */
    private final int f22827a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22828b;

    public H(int i11, int i12) {
        this.f22827a = i11;
        this.f22828b = i12;
    }

    @Override // Q1.InterfaceC3841j
    public final void a(@NotNull C3844m c3844m) {
        if (c3844m.l()) {
            c3844m.a();
        }
        int e11 = kotlin.ranges.h.e(this.f22827a, 0, c3844m.h());
        int e12 = kotlin.ranges.h.e(this.f22828b, 0, c3844m.h());
        if (e11 != e12) {
            if (e11 < e12) {
                c3844m.n(e11, e12);
            } else {
                c3844m.n(e12, e11);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h11 = (H) obj;
        return this.f22827a == h11.f22827a && this.f22828b == h11.f22828b;
    }

    public final int hashCode() {
        return (this.f22827a * 31) + this.f22828b;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.f22827a);
        sb2.append(", end=");
        return Ek.a.d(sb2, this.f22828b, ')');
    }
}
