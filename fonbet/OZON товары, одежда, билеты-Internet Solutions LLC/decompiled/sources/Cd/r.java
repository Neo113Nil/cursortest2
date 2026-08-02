package Cd;

import Gd.C3074d;
import Vd.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9831W;
import td.InterfaceC9835a;
import td.InterfaceC9839e;

/* loaded from: classes.dex */
public final class r implements Vd.j {
    @Override // Vd.j
    @NotNull
    public final j.b a(@NotNull InterfaceC9835a superDescriptor, @NotNull InterfaceC9835a subDescriptor, InterfaceC9839e interfaceC9839e) {
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof InterfaceC9831W) || !(superDescriptor instanceof InterfaceC9831W)) {
            return j.b.UNKNOWN;
        }
        InterfaceC9831W interfaceC9831W = (InterfaceC9831W) subDescriptor;
        InterfaceC9831W interfaceC9831W2 = (InterfaceC9831W) superDescriptor;
        return !Intrinsics.d(interfaceC9831W.getName(), interfaceC9831W2.getName()) ? j.b.UNKNOWN : (C3074d.a(interfaceC9831W) && C3074d.a(interfaceC9831W2)) ? j.b.OVERRIDABLE : (C3074d.a(interfaceC9831W) || C3074d.a(interfaceC9831W2)) ? j.b.INCOMPATIBLE : j.b.UNKNOWN;
    }

    @Override // Vd.j
    @NotNull
    public final j.a b() {
        return j.a.BOTH;
    }
}
