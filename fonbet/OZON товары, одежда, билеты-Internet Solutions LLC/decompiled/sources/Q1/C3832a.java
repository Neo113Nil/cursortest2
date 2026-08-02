package Q1;

import K1.C3422b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Q1.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C3832a implements InterfaceC3841j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3422b f22868a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22869b;

    public C3832a(@NotNull C3422b c3422b, int i11) {
        this.f22868a = c3422b;
        this.f22869b = i11;
    }

    @Override // Q1.InterfaceC3841j
    public final void a(@NotNull C3844m c3844m) {
        boolean l11 = c3844m.l();
        C3422b c3422b = this.f22868a;
        if (l11) {
            c3844m.m(c3844m.f(), c3844m.e(), c3422b.h());
        } else {
            c3844m.m(c3844m.k(), c3844m.j(), c3422b.h());
        }
        int g10 = c3844m.g();
        int i11 = this.f22869b;
        int e11 = kotlin.ranges.h.e(i11 > 0 ? (g10 + i11) - 1 : (g10 + i11) - c3422b.h().length(), 0, c3844m.h());
        c3844m.o(e11, e11);
    }

    public final int b() {
        return this.f22869b;
    }

    @NotNull
    public final String c() {
        return this.f22868a.h();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3832a)) {
            return false;
        }
        C3832a c3832a = (C3832a) obj;
        return Intrinsics.d(this.f22868a.h(), c3832a.f22868a.h()) && this.f22869b == c3832a.f22869b;
    }

    public final int hashCode() {
        return (this.f22868a.h().hashCode() * 31) + this.f22869b;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommitTextCommand(text='");
        sb2.append(this.f22868a.h());
        sb2.append("', newCursorPosition=");
        return Ek.a.d(sb2, this.f22869b, ')');
    }

    public C3832a(@NotNull String str, int i11) {
        this(new C3422b(6, str, null), i11);
    }
}
