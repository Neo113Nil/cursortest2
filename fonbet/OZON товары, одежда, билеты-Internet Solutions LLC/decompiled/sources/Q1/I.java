package Q1;

import K1.C3422b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class I implements InterfaceC3841j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3422b f22829a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22830b;

    public I(@NotNull String str, int i11) {
        this.f22829a = new C3422b(6, str, null);
        this.f22830b = i11;
    }

    @Override // Q1.InterfaceC3841j
    public final void a(@NotNull C3844m c3844m) {
        boolean l11 = c3844m.l();
        C3422b c3422b = this.f22829a;
        if (l11) {
            int f7 = c3844m.f();
            c3844m.m(c3844m.f(), c3844m.e(), c3422b.h());
            if (c3422b.h().length() > 0) {
                c3844m.n(f7, c3422b.h().length() + f7);
            }
        } else {
            int k11 = c3844m.k();
            c3844m.m(c3844m.k(), c3844m.j(), c3422b.h());
            if (c3422b.h().length() > 0) {
                c3844m.n(k11, c3422b.h().length() + k11);
            }
        }
        int g10 = c3844m.g();
        int i11 = this.f22830b;
        int e11 = kotlin.ranges.h.e(i11 > 0 ? (g10 + i11) - 1 : (g10 + i11) - c3422b.h().length(), 0, c3844m.h());
        c3844m.o(e11, e11);
    }

    public final int b() {
        return this.f22830b;
    }

    @NotNull
    public final String c() {
        return this.f22829a.h();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i11 = (I) obj;
        return Intrinsics.d(this.f22829a.h(), i11.f22829a.h()) && this.f22830b == i11.f22830b;
    }

    public final int hashCode() {
        return (this.f22829a.h().hashCode() * 31) + this.f22830b;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text='");
        sb2.append(this.f22829a.h());
        sb2.append("', newCursorPosition=");
        return Ek.a.d(sb2, this.f22830b, ')');
    }
}
