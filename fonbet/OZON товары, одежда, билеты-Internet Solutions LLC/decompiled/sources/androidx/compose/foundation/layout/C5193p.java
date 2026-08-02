package androidx.compose.foundation.layout;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import e1.InterfaceC6250b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.foundation.layout.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5193p {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C5194q f39527a = new C5194q(C5179b.g(), InterfaceC6250b.a.k());

    @NotNull
    public static final C5194q a(@NotNull C5179b.l lVar, @NotNull InterfaceC6250b.InterfaceC0966b interfaceC0966b, InterfaceC3967k interfaceC3967k, int i11) {
        if (Intrinsics.d(lVar, C5179b.g()) && Intrinsics.d(interfaceC0966b, InterfaceC6250b.a.k())) {
            interfaceC3967k.o(345962472);
            interfaceC3967k.k();
            return f39527a;
        }
        interfaceC3967k.o(346016319);
        boolean z11 = ((((i11 & 14) ^ 6) > 4 && interfaceC3967k.n(lVar)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && interfaceC3967k.n(interfaceC0966b)) || (i11 & 48) == 32);
        Object C11 = interfaceC3967k.C();
        if (z11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new C5194q(lVar, interfaceC0966b);
            interfaceC3967k.x(C11);
        }
        C5194q c5194q = (C5194q) C11;
        interfaceC3967k.k();
        return c5194q;
    }

    public static final long b(int i11, int i12, int i13, boolean z11) {
        if (!z11) {
            return Z1.c.a(0, i13, i11, i12);
        }
        int min = Math.min(i11, 262142);
        int min2 = i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i12, 262142);
        int c11 = Z1.c.c(min2 == Integer.MAX_VALUE ? min : min2);
        return Z1.c.a(Math.min(c11, 0), i13 != Integer.MAX_VALUE ? Math.min(c11, i13) : Integer.MAX_VALUE, min, min2);
    }
}
