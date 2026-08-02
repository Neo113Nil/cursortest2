package D4;

import B4.C2576e;
import B4.d0;
import Sc.InterfaceC3999a;
import a1.C4912a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: D4.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2844t {
    @InterfaceC3999a
    public static final void a(B4.M m11, String str, List list, List list2, C4912a c4912a) {
        d0 h11 = m11.h();
        h11.getClass();
        Intrinsics.checkNotNullParameter(C2830e.class, "navigatorClass");
        C2831f c2831f = new C2831f((C2830e) h11.c(d0.a.a(C2830e.class)), str, c4912a);
        Iterator it = list.iterator();
        if (it.hasNext()) {
            ((C2576e) it.next()).getClass();
            throw null;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            c2831f.c((B4.A) it2.next());
        }
        m11.g(c2831f);
    }
}
