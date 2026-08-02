package Wd;

import ie.C7056e;
import ie.o;
import java.util.ArrayList;
import java.util.Iterator;
import je.A0;
import je.B0;
import je.C7364I;
import je.L0;
import je.U;
import je.o0;
import je.y0;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import td.i0;

/* loaded from: classes.dex */
public final class f {
    /* JADX INFO: Access modifiers changed from: private */
    public static final y0 b(y0 typeProjection, i0 i0Var) {
        if (i0Var == null || typeProjection.b() == L0.INVARIANT) {
            return typeProjection;
        }
        if (i0Var.x() != typeProjection.b()) {
            Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
            c cVar = new c(typeProjection);
            o0.f69907b.getClass();
            return new A0(new a(typeProjection, cVar, false, o0.f69908c));
        }
        if (!typeProjection.a()) {
            return new A0(typeProjection.getType());
        }
        o NO_LOCKS = C7056e.f66260e;
        Intrinsics.checkNotNullExpressionValue(NO_LOCKS, "NO_LOCKS");
        return new A0(new U(NO_LOCKS, new d(typeProjection)));
    }

    public static B0 c(B0 b02) {
        Intrinsics.checkNotNullParameter(b02, "<this>");
        if (!(b02 instanceof C7364I)) {
            return new e(b02);
        }
        C7364I c7364i = (C7364I) b02;
        i0[] i11 = c7364i.i();
        y0[] h11 = c7364i.h();
        i0[] other = c7364i.i();
        Intrinsics.checkNotNullParameter(h11, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int min = Math.min(h11.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i12 = 0; i12 < min; i12++) {
            arrayList.add(new Pair(h11[i12], other[i12]));
        }
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList2.add(b((y0) pair.e(), (i0) pair.f()));
        }
        return new C7364I(i11, (y0[]) arrayList2.toArray(new y0[0]), true);
    }
}
