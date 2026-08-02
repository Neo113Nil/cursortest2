package H1;

import G1.AbstractC0136g;
import G1.C0140k;
import t.AbstractC2379A;
import t.C2400l;
import u.AbstractC2453d;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: m, reason: collision with root package name */
    public static final x f2263m = new x(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final x f2264n = new x(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final x f2265o = new x(1, 2);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2266l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i, int i5) {
        super(i);
        this.f2266l = i5;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        switch (this.f2266l) {
            case 0:
                return ((C0140k) obj).f1903p;
            case 1:
                return AbstractC2379A.a(AbstractC2453d.m(700, 6, null));
            case 2:
                return AbstractC2379A.b(AbstractC2453d.m(700, 6, null));
            default:
                G1.y yVar = ((C0140k) ((C2400l) obj).c()).f1899l;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination", yVar);
                int i = G1.y.f1963s;
                for (G1.y yVar2 : AbstractC0136g.b((h) yVar)) {
                    if (yVar2 instanceof h) {
                        ((h) yVar2).getClass();
                    } else if (yVar2 instanceof f) {
                        ((f) yVar2).getClass();
                    }
                }
                return null;
        }
    }
}
