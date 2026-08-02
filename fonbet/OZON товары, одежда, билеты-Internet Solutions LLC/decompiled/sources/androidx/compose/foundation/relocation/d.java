package androidx.compose.foundation.relocation;

import androidx.compose.ui.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z0.InterfaceC10969b;

/* loaded from: classes.dex */
public final class d extends e.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private InterfaceC10969b f39742a;

    public d(@NotNull InterfaceC10969b interfaceC10969b) {
        this.f39742a = interfaceC10969b;
    }

    public final void I1(@NotNull InterfaceC10969b interfaceC10969b) {
        InterfaceC10969b interfaceC10969b2 = this.f39742a;
        if (interfaceC10969b2 instanceof b) {
            Intrinsics.g(interfaceC10969b2, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((b) interfaceC10969b2).b().s(this);
        }
        if (interfaceC10969b instanceof b) {
            ((b) interfaceC10969b).b().b(this);
        }
        this.f39742a = interfaceC10969b;
    }

    @Override // androidx.compose.ui.e.c
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.e.c
    public final void onAttach() {
        I1(this.f39742a);
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        InterfaceC10969b interfaceC10969b = this.f39742a;
        if (interfaceC10969b instanceof b) {
            Intrinsics.g(interfaceC10969b, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((b) interfaceC10969b).b().s(this);
        }
    }
}
