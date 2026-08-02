package F20;

import L20.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final B20.a f8386a;

    public a(@NotNull B20.a dependenciesRepository) {
        Intrinsics.checkNotNullParameter(dependenciesRepository, "dependenciesRepository");
        this.f8386a = dependenciesRepository;
    }

    private static List b(List list, a.b bVar, String str, boolean z11) {
        ArrayList m02 = C7714v.m0(bVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            D20.a aVar = (D20.a) it.next();
            boolean z12 = h.K(str) || h.t(aVar.c(), str, false);
            boolean z13 = (aVar.e() && z11) || !aVar.e();
            if (z12 && z13) {
                m02.add(new a.C0310a(aVar.c(), aVar.b(), aVar.a(), aVar.d(), aVar.e(), false));
            }
        }
        Object X9 = C7714v.X(m02);
        a.C0310a c0310a = X9 instanceof a.C0310a ? (a.C0310a) X9 : null;
        if (c0310a == null) {
            return K.f71697a;
        }
        m02.set(C7714v.P(m02), a.C0310a.a(c0310a));
        return m02;
    }

    @NotNull
    public final ArrayList a(@NotNull String search, boolean z11) {
        Intrinsics.checkNotNullParameter(search, "search");
        B20.a aVar = this.f8386a;
        return C7714v.p0(b(aVar.d(), new a.b("Внешние"), search, z11), b(aVar.e(), new a.b("Ozon"), search, z11));
    }
}
