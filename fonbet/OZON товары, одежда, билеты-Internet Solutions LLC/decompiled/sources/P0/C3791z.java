package P0;

import S0.InterfaceC3967k;
import a1.C4912a;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: P0.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3791z<T> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3793z1 f21439a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4912a f21440b;

    public C3791z(InterfaceC3793z1 interfaceC3793z1, @NotNull C4912a c4912a) {
        this.f21439a = interfaceC3793z1;
        this.f21440b = c4912a;
    }

    public final T a() {
        return (T) this.f21439a;
    }

    @NotNull
    public final InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, Unit>, InterfaceC3967k, Integer, Unit> b() {
        return this.f21440b;
    }

    public final T c() {
        return (T) this.f21439a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3791z)) {
            return false;
        }
        C3791z c3791z = (C3791z) obj;
        return Intrinsics.d(this.f21439a, c3791z.f21439a) && this.f21440b.equals(c3791z.f21440b);
    }

    public final int hashCode() {
        InterfaceC3793z1 interfaceC3793z1 = this.f21439a;
        return this.f21440b.hashCode() + ((interfaceC3793z1 == null ? 0 : interfaceC3793z1.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f21439a + ", transition=" + this.f21440b + ')';
    }
}
