package Q1;

import org.jetbrains.annotations.NotNull;

/* renamed from: Q1.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3840i implements InterfaceC3841j {

    /* renamed from: a, reason: collision with root package name */
    private final int f22892a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22893b;

    public C3840i(int i11, int i12) {
        this.f22892a = i11;
        this.f22893b = i12;
        if (i11 < 0 || i12 < 0) {
            throw new IllegalArgumentException(Cm.e.c("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i11, " and ", " respectively.", i12).toString());
        }
    }

    @Override // Q1.InterfaceC3841j
    public final void a(@NotNull C3844m c3844m) {
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i12 < this.f22892a) {
                int i14 = i13 + 1;
                if (c3844m.k() <= i14) {
                    i13 = c3844m.k();
                    break;
                } else {
                    i13 = (Character.isHighSurrogate(c3844m.c((c3844m.k() - i14) + (-1))) && Character.isLowSurrogate(c3844m.c(c3844m.k() - i14))) ? i13 + 2 : i14;
                    i12++;
                }
            } else {
                break;
            }
        }
        int i15 = 0;
        while (true) {
            if (i11 >= this.f22893b) {
                break;
            }
            int i16 = i15 + 1;
            if (c3844m.j() + i16 >= c3844m.h()) {
                i15 = c3844m.h() - c3844m.j();
                break;
            } else {
                i15 = (Character.isHighSurrogate(c3844m.c((c3844m.j() + i16) + (-1))) && Character.isLowSurrogate(c3844m.c(c3844m.j() + i16))) ? i15 + 2 : i16;
                i11++;
            }
        }
        c3844m.b(c3844m.j(), c3844m.j() + i15);
        c3844m.b(c3844m.k() - i13, c3844m.k());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3840i)) {
            return false;
        }
        C3840i c3840i = (C3840i) obj;
        return this.f22892a == c3840i.f22892a && this.f22893b == c3840i.f22893b;
    }

    public final int hashCode() {
        return (this.f22892a * 31) + this.f22893b;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb2.append(this.f22892a);
        sb2.append(", lengthAfterCursor=");
        return Ek.a.d(sb2, this.f22893b, ')');
    }
}
