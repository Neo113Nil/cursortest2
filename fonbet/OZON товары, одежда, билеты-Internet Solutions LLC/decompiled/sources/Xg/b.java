package Xg;

import S0.InterfaceC3967k;
import Vg.e;
import WZ.l;
import a00.C4911f;
import a00.h;
import b00.f;
import k20.C7475g;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.compose.widget.i;

/* loaded from: classes10.dex */
public final class b {
    @NotNull
    public static final e.a a(@NotNull i iVar, @NotNull C7475g storage, @NotNull Tg.a actionNavigator, InterfaceC3967k interfaceC3967k) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(actionNavigator, "actionNavigator");
        interfaceC3967k.o(1600084934);
        InterfaceC7851b interfaceC7851b = (InterfaceC7851b) interfaceC3967k.m(f.c());
        C4911f c4911f = (C4911f) interfaceC3967k.m(f.d());
        h hVar = (h) interfaceC3967k.m(f.f());
        l lVar = (l) interfaceC3967k.m(f.e());
        interfaceC3967k.o(-98043830);
        Object C11 = interfaceC3967k.C();
        if (C11 == InterfaceC3967k.a.a()) {
            e.a aVar = new e.a(c4911f, hVar, new C4890a(iVar), lVar, actionNavigator, interfaceC7851b, storage);
            interfaceC3967k.x(aVar);
            C11 = aVar;
        }
        e.a aVar2 = (e.a) C11;
        interfaceC3967k.k();
        interfaceC3967k.k();
        return aVar2;
    }
}
