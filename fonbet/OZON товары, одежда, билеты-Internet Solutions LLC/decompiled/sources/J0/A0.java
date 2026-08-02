package J0;

import S0.InterfaceC3967k;
import a1.C4912a;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class A0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3295g2 f12658a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4912a f12659b;

    public A0(InterfaceC3295g2 interfaceC3295g2, @NotNull C4912a c4912a) {
        this.f12658a = interfaceC3295g2;
        this.f12659b = c4912a;
    }

    public final T a() {
        return (T) this.f12658a;
    }

    @NotNull
    public final InterfaceC6511n<Function2<? super InterfaceC3967k, ? super Integer, Unit>, InterfaceC3967k, Integer, Unit> b() {
        return this.f12659b;
    }

    public final T c() {
        return (T) this.f12658a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return false;
        }
        A0 a02 = (A0) obj;
        return Intrinsics.d(this.f12658a, a02.f12658a) && this.f12659b.equals(a02.f12659b);
    }

    public final int hashCode() {
        InterfaceC3295g2 interfaceC3295g2 = this.f12658a;
        return this.f12659b.hashCode() + ((interfaceC3295g2 == null ? 0 : interfaceC3295g2.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.f12658a + ", transition=" + this.f12659b + ')';
    }
}
