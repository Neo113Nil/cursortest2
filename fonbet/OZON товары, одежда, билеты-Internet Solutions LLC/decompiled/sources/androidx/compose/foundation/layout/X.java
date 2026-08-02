package androidx.compose.foundation.layout;

import S0.InterfaceC3967k;
import androidx.compose.foundation.layout.C5179b;
import e1.InterfaceC6250b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Y f39427a = new Y(C5179b.f(), InterfaceC6250b.a.l());

    public static final long a(int i11, int i12, int i13, boolean z11) {
        if (!z11) {
            return Z1.c.a(i11, i12, 0, i13);
        }
        int min = Math.min(i11, 262142);
        int min2 = i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i12, 262142);
        int c11 = Z1.c.c(min2 == Integer.MAX_VALUE ? min : min2);
        return Z1.c.a(min, min2, Math.min(c11, 0), i13 != Integer.MAX_VALUE ? Math.min(c11, i13) : Integer.MAX_VALUE);
    }

    @NotNull
    public static final Y b(@NotNull C5179b.e eVar, @NotNull InterfaceC6250b.c cVar, InterfaceC3967k interfaceC3967k, int i11) {
        if (Intrinsics.d(eVar, C5179b.f()) && Intrinsics.d(cVar, InterfaceC6250b.a.l())) {
            interfaceC3967k.o(-849081669);
            interfaceC3967k.k();
            return f39427a;
        }
        interfaceC3967k.o(-849030798);
        boolean z11 = ((((i11 & 14) ^ 6) > 4 && interfaceC3967k.n(eVar)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && interfaceC3967k.n(cVar)) || (i11 & 48) == 32);
        Object C11 = interfaceC3967k.C();
        if (z11 || C11 == InterfaceC3967k.a.a()) {
            C11 = new Y(eVar, cVar);
            interfaceC3967k.x(C11);
        }
        Y y11 = (Y) C11;
        interfaceC3967k.k();
        return y11;
    }
}
