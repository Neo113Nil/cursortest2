package Pd;

import Nd.p;
import Nd.s;
import Td.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<p> f22260a;

    public g(@NotNull s typeTable) {
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<p> m11 = typeTable.m();
        if (typeTable.n()) {
            int l11 = typeTable.l();
            List<p> m12 = typeTable.m();
            Intrinsics.checkNotNullExpressionValue(m12, "getTypeList(...)");
            List<p> list = m12;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                p pVar = (p) obj;
                if (i11 >= l11) {
                    pVar.getClass();
                    p.c s02 = p.s0(pVar);
                    s02.m(true);
                    pVar = s02.j();
                    if (!pVar.isInitialized()) {
                        throw new v();
                    }
                }
                arrayList.add(pVar);
                i11 = i12;
            }
            m11 = arrayList;
        }
        Intrinsics.checkNotNullExpressionValue(m11, "run(...)");
        this.f22260a = m11;
    }

    @NotNull
    public final p a(int i11) {
        return this.f22260a.get(i11);
    }
}
