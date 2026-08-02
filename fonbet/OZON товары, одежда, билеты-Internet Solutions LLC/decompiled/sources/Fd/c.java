package Fd;

import Jd.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9841g;
import ud.InterfaceC10030h;
import wd.AbstractC10532s;

/* loaded from: classes.dex */
public final class c {
    public static k a(k kVar, InterfaceC9841g containingDeclaration, Jd.g gVar, int i11) {
        if ((i11 & 2) != 0) {
            gVar = null;
        }
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        return new k(kVar.a(), gVar != null ? new m(kVar, containingDeclaration, gVar, 0) : kVar.f(), Sc.k.a(Sc.n.NONE, new C3048a(kVar, containingDeclaration)));
    }

    @NotNull
    public static final k b(@NotNull k kVar, @NotNull AbstractC10532s containingDeclaration, @NotNull y typeParameterOwner, int i11) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
        return new k(kVar.a(), typeParameterOwner != null ? new m(kVar, containingDeclaration, typeParameterOwner, i11) : kVar.f(), kVar.c());
    }

    @NotNull
    public static final k c(@NotNull k kVar, @NotNull InterfaceC10030h additionalAnnotations) {
        Intrinsics.checkNotNullParameter(kVar, "<this>");
        Intrinsics.checkNotNullParameter(additionalAnnotations, "additionalAnnotations");
        return additionalAnnotations.isEmpty() ? kVar : new k(kVar.a(), kVar.f(), Sc.k.a(Sc.n.NONE, new b(kVar, additionalAnnotations)));
    }
}
