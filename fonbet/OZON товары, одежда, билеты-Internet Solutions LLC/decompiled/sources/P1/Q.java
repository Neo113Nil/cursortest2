package P1;

import B0.C2454a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Q implements InterfaceC3808o {

    /* renamed from: a, reason: collision with root package name */
    private final int f21522a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final F f21523b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final E f21524c;

    public Q(int i11, F f7, E e11) {
        this.f21522a = i11;
        this.f21523b = f7;
        this.f21524c = e11;
    }

    @Override // P1.InterfaceC3808o
    public final int a() {
        return 0;
    }

    @Override // P1.InterfaceC3808o
    public final int b() {
        return 0;
    }

    public final int c() {
        return this.f21522a;
    }

    @NotNull
    public final E d() {
        return this.f21524c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q11 = (Q) obj;
        return this.f21522a == q11.f21522a && Intrinsics.d(this.f21523b, q11.f21523b) && this.f21524c.equals(q11.f21524c);
    }

    @Override // P1.InterfaceC3808o
    @NotNull
    public final F getWeight() {
        return this.f21523b;
    }

    public final int hashCode() {
        return this.f21524c.hashCode() + C2454a.a(0, C2454a.a(0, (this.f21523b.hashCode() + (this.f21522a * 31)) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        return "ResourceFont(resId=" + this.f21522a + ", weight=" + this.f21523b + ", style=" + ((Object) "Normal") + ", loadingStrategy=" + ((Object) "Blocking") + ')';
    }
}
