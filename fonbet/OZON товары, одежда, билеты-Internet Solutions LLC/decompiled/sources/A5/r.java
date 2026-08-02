package A5;

import org.jetbrains.annotations.NotNull;
import w5.AbstractC10429a;
import w5.C10435g;

/* loaded from: classes8.dex */
final class r implements o {
    @Override // A5.o
    public final boolean a() {
        return n.f435a.a();
    }

    @Override // A5.o
    public final boolean b(@NotNull C10435g c10435g) {
        AbstractC10429a d11 = c10435g.d();
        if ((d11 instanceof AbstractC10429a.C2245a ? ((AbstractC10429a.C2245a) d11).f103575a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        AbstractC10429a c11 = c10435g.c();
        return (c11 instanceof AbstractC10429a.C2245a ? ((AbstractC10429a.C2245a) c11).f103575a : Integer.MAX_VALUE) > 100;
    }
}
