package Vd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C9814E;
import td.InterfaceC9815F;

/* renamed from: Vd.A, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4079A {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C9814E<z> f28534a = new C9814E<>("StdlibClassFinder");

    @NotNull
    public static final z a(@NotNull InterfaceC9815F interfaceC9815F) {
        Intrinsics.checkNotNullParameter(interfaceC9815F, "<this>");
        z zVar = (z) interfaceC9815F.F(f28534a);
        return zVar == null ? c.f28535a : zVar;
    }
}
