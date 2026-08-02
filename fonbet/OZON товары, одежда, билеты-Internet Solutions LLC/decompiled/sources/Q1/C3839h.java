package Q1;

import org.jetbrains.annotations.NotNull;

/* renamed from: Q1.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3839h implements InterfaceC3841j {

    /* renamed from: a, reason: collision with root package name */
    private final int f22890a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22891b;

    public C3839h(int i11, int i12) {
        this.f22890a = i11;
        this.f22891b = i12;
        if (i11 < 0 || i12 < 0) {
            throw new IllegalArgumentException(Cm.e.c("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i11, " and ", " respectively.", i12).toString());
        }
    }

    @Override // Q1.InterfaceC3841j
    public final void a(@NotNull C3844m c3844m) {
        int j11 = c3844m.j();
        int i11 = this.f22891b;
        int i12 = j11 + i11;
        if (((j11 ^ i12) & (i11 ^ i12)) < 0) {
            i12 = c3844m.h();
        }
        c3844m.b(c3844m.j(), Math.min(i12, c3844m.h()));
        int k11 = c3844m.k();
        int i13 = this.f22890a;
        int i14 = k11 - i13;
        if (((k11 ^ i14) & (i13 ^ k11)) < 0) {
            i14 = 0;
        }
        c3844m.b(Math.max(0, i14), c3844m.k());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3839h)) {
            return false;
        }
        C3839h c3839h = (C3839h) obj;
        return this.f22890a == c3839h.f22890a && this.f22891b == c3839h.f22891b;
    }

    public final int hashCode() {
        return (this.f22890a * 31) + this.f22891b;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.f22890a);
        sb2.append(", lengthAfterCursor=");
        return Ek.a.d(sb2, this.f22891b, ')');
    }
}
