package Gd;

import ce.AbstractC5816c;
import ce.l;
import java.util.LinkedHashSet;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te.C9865a;

/* loaded from: classes.dex */
final class J implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final W f9964a;

    public J(W w11) {
        this.f9964a = w11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i11;
        int i12;
        int i13;
        ce.d kindFilter = ce.d.f57022l;
        ce.l.f57043a.getClass();
        Function1<? super Sd.f, Boolean> nameFilter = l.a.a();
        W w11 = this.f9964a;
        w11.getClass();
        Intrinsics.checkNotNullParameter(kindFilter, "kindFilter");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        Bd.c cVar = Bd.c.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        i11 = ce.d.f57021k;
        if (kindFilter.a(i11)) {
            for (Sd.f fVar : w11.n(kindFilter, nameFilter)) {
                nameFilter.invoke(fVar);
                C9865a.a(linkedHashSet, w11.d(fVar, cVar));
            }
        }
        i12 = ce.d.f57018h;
        if (kindFilter.a(i12) && !kindFilter.l().contains(AbstractC5816c.a.f57010a)) {
            for (Sd.f fVar2 : w11.o(kindFilter, nameFilter)) {
                nameFilter.invoke(fVar2);
                linkedHashSet.addAll(w11.g(fVar2, cVar));
            }
        }
        i13 = ce.d.f57019i;
        if (kindFilter.a(i13) && !kindFilter.l().contains(AbstractC5816c.a.f57010a)) {
            for (Sd.f fVar3 : w11.u(kindFilter)) {
                nameFilter.invoke(fVar3);
                linkedHashSet.addAll(w11.b(fVar3, cVar));
            }
        }
        return C7714v.U0(linkedHashSet);
    }
}
