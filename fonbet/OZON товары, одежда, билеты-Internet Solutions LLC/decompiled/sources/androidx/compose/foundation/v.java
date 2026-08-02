package androidx.compose.foundation;

import D1.J;
import i1.InterfaceC6991k;
import n0.InterfaceC8368I;
import n1.InterfaceC8410c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class v implements InterfaceC6991k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC8368I f39869a;

    public v(@NotNull InterfaceC8368I interfaceC8368I) {
        this.f39869a = interfaceC8368I;
    }

    @Override // i1.InterfaceC6991k
    public final void draw(@NotNull InterfaceC8410c interfaceC8410c) {
        this.f39869a.a((J) interfaceC8410c);
    }
}
