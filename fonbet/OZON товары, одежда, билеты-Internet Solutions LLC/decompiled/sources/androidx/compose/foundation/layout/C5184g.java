package androidx.compose.foundation.layout;

import D1.A0;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.foundation.layout.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5184g extends e.c implements A0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private InterfaceC6250b f39482a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f39483b;

    public C5184g(@NotNull InterfaceC6250b interfaceC6250b, boolean z11) {
        this.f39482a = interfaceC6250b;
        this.f39483b = z11;
    }

    @NotNull
    public final InterfaceC6250b I1() {
        return this.f39482a;
    }

    public final boolean J1() {
        return this.f39483b;
    }

    public final void K1(@NotNull InterfaceC6250b interfaceC6250b) {
        this.f39482a = interfaceC6250b;
    }

    public final void L1(boolean z11) {
        this.f39483b = z11;
    }

    @Override // D1.A0
    public final Object M(Z1.d dVar, Object obj) {
        return this;
    }
}
