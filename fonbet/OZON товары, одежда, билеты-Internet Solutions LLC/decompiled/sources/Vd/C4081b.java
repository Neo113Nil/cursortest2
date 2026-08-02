package Vd;

import ce.o;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.EnumC9812C;
import td.InterfaceC9820K;
import td.InterfaceC9839e;
import td.InterfaceC9842h;
import td.InterfaceC9845k;
import td.h0;

/* renamed from: Vd.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4081b extends Lf.a {
    @NotNull
    public static Collection E0(@NotNull he.n sealedClass) {
        Intrinsics.checkNotNullParameter(sealedClass, "sealedClass");
        if (sealedClass.h() != EnumC9812C.SEALED) {
            return K.f71697a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        InterfaceC9845k d11 = sealedClass.d();
        if (d11 instanceof InterfaceC9820K) {
            H0(sealedClass, linkedHashSet, ((InterfaceC9820K) d11).p(), false);
        }
        ce.l H11 = sealedClass.H();
        Intrinsics.checkNotNullExpressionValue(H11, "getUnsubstitutedInnerClassesScope(...)");
        H0(sealedClass, linkedHashSet, H11, true);
        return C7714v.I0(new C4080a(), linkedHashSet);
    }

    private static final void H0(he.n nVar, LinkedHashSet linkedHashSet, ce.l lVar, boolean z11) {
        for (InterfaceC9845k interfaceC9845k : o.a.a(lVar, ce.d.f57024n, 2)) {
            if (interfaceC9845k instanceof InterfaceC9839e) {
                InterfaceC9839e interfaceC9839e = (InterfaceC9839e) interfaceC9845k;
                if (interfaceC9839e.p0()) {
                    Sd.f name = interfaceC9839e.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    InterfaceC9842h d11 = lVar.d(name, Bd.c.WHEN_GET_ALL_DESCRIPTORS);
                    interfaceC9839e = d11 instanceof InterfaceC9839e ? (InterfaceC9839e) d11 : d11 instanceof h0 ? ((h0) d11).i() : null;
                }
                if (interfaceC9839e != null) {
                    if (i.t(interfaceC9839e, nVar)) {
                        linkedHashSet.add(interfaceC9839e);
                    }
                    if (z11) {
                        ce.l H11 = interfaceC9839e.H();
                        Intrinsics.checkNotNullExpressionValue(H11, "getUnsubstitutedInnerClassesScope(...)");
                        H0(nVar, linkedHashSet, H11, z11);
                    }
                }
            }
        }
    }
}
