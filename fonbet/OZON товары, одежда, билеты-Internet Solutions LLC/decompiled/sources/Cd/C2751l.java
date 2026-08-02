package Cd;

import java.util.Collection;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9832X;
import td.InterfaceC9836b;

/* renamed from: Cd.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2751l {
    public static String a(@NotNull InterfaceC9832X interfaceC9832X) {
        Sd.f fVar;
        Intrinsics.checkNotNullParameter(interfaceC9832X, "<this>");
        qd.m.V(interfaceC9832X);
        InterfaceC9836b b11 = Zd.e.b(Zd.e.l(interfaceC9832X), C2750k.f4763a);
        if (b11 == null || (fVar = (Sd.f) C2748i.a().get(Zd.e.g(b11))) == null) {
            return null;
        }
        return fVar.b();
    }

    public static boolean b(@NotNull InterfaceC9836b callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "callableMemberDescriptor");
        if (!C2748i.d().contains(callableMemberDescriptor.getName())) {
            return false;
        }
        if (C7714v.A(C2748i.c(), Zd.e.c(callableMemberDescriptor)) && callableMemberDescriptor.f().isEmpty()) {
            return true;
        }
        if (!qd.m.V(callableMemberDescriptor)) {
            return false;
        }
        Collection<? extends InterfaceC9836b> o11 = callableMemberDescriptor.o();
        Intrinsics.checkNotNullExpressionValue(o11, "getOverriddenDescriptors(...)");
        Collection<? extends InterfaceC9836b> collection = o11;
        if (collection.isEmpty()) {
            return false;
        }
        for (InterfaceC9836b interfaceC9836b : collection) {
            Intrinsics.f(interfaceC9836b);
            if (b(interfaceC9836b)) {
                return true;
            }
        }
        return false;
    }
}
