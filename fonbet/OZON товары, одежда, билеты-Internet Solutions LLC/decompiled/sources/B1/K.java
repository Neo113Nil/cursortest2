package B1;

import androidx.compose.ui.e;
import fd.InterfaceC6511n;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class K extends e.c implements D1.E {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private InterfaceC6511n<? super Y, ? super U, ? super Z1.b, ? extends W> f2033a;

    public K(@NotNull InterfaceC6511n<? super Y, ? super U, ? super Z1.b, ? extends W> interfaceC6511n) {
        this.f2033a = interfaceC6511n;
    }

    @Override // D1.E
    @NotNull
    public final W D(@NotNull Y y11, @NotNull U u11, long j11) {
        return this.f2033a.invoke(y11, u11, Z1.b.a(j11));
    }

    public final void I1(@NotNull InterfaceC6511n<? super Y, ? super U, ? super Z1.b, ? extends W> interfaceC6511n) {
        this.f2033a = interfaceC6511n;
    }

    @NotNull
    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f2033a + ')';
    }
}
