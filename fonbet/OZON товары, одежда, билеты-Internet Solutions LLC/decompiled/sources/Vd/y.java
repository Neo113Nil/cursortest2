package Vd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.C9814E;
import td.InterfaceC9815F;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C9814E<x> f28566a = new C9814E<>("ResolutionAnchorProvider");

    public static final InterfaceC9815F a(@NotNull InterfaceC9815F interfaceC9815F) {
        Intrinsics.checkNotNullParameter(interfaceC9815F, "<this>");
        x xVar = (x) interfaceC9815F.F(f28566a);
        if (xVar != null) {
            return xVar.a();
        }
        return null;
    }
}
