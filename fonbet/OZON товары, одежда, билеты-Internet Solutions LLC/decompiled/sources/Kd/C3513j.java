package Kd;

import je.AbstractC7360E;
import je.AbstractC7402w;
import je.H0;
import je.J0;
import je.K0;
import je.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Kd.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3513j extends AbstractC7402w implements je.W {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final je.Y f15913b;

    public C3513j(@NotNull je.Y delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f15913b = delegate;
    }

    private static je.Y T0(je.Y y11) {
        je.Y L02 = y11.L0(false);
        Intrinsics.checkNotNullParameter(y11, "<this>");
        return !H0.h(y11) ? L02 : new C3513j(L02);
    }

    @Override // je.InterfaceC7399t
    public final boolean C0() {
        return true;
    }

    @Override // je.AbstractC7402w, je.N
    public final boolean I0() {
        return false;
    }

    @Override // je.InterfaceC7399t
    @NotNull
    public final K0 N(@NotNull je.N replacement) {
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        K0 K02 = replacement.K0();
        Intrinsics.checkNotNullParameter(K02, "<this>");
        if (!H0.h(K02) && !H0.g(K02)) {
            return K02;
        }
        if (K02 instanceof je.Y) {
            return T0((je.Y) K02);
        }
        if (K02 instanceof AbstractC7360E) {
            AbstractC7360E abstractC7360E = (AbstractC7360E) K02;
            return J0.c(je.Q.c(T0(abstractC7360E.P0()), T0(abstractC7360E.Q0())), J0.a(K02));
        }
        throw new IllegalStateException(("Incorrect type: " + K02).toString());
    }

    @Override // je.Y, je.K0
    public final K0 N0(o0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new C3513j(this.f15913b.N0(newAttributes));
    }

    @Override // je.Y
    @NotNull
    /* renamed from: O0 */
    public final je.Y L0(boolean z11) {
        return z11 ? this.f15913b.L0(true) : this;
    }

    @Override // je.Y
    /* renamed from: P0 */
    public final je.Y N0(o0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new C3513j(this.f15913b.N0(newAttributes));
    }

    @Override // je.AbstractC7402w
    @NotNull
    protected final je.Y Q0() {
        return this.f15913b;
    }

    @Override // je.AbstractC7402w
    public final AbstractC7402w S0(je.Y delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        return new C3513j(delegate);
    }
}
