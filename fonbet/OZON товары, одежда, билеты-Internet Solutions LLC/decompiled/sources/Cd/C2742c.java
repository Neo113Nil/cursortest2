package Cd;

import Xd.C4885b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9839e;
import ud.InterfaceC10025c;
import ud.InterfaceC10030h;

/* renamed from: Cd.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2742c extends AbstractC2740a<InterfaceC10025c> {
    private static List o(Xd.g gVar) {
        if (!(gVar instanceof C4885b)) {
            return gVar instanceof Xd.k ? C7714v.a0(((Xd.k) gVar).c().d()) : kotlin.collections.K.f71697a;
        }
        List<? extends Xd.g<?>> b11 = ((C4885b) gVar).b();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = b11.iterator();
        while (it.hasNext()) {
            C7714v.p(o((Xd.g) it.next()), arrayList);
        }
        return arrayList;
    }

    @Override // Cd.AbstractC2740a
    public final ArrayList a(Object obj, boolean z11) {
        InterfaceC10025c interfaceC10025c = (InterfaceC10025c) obj;
        Intrinsics.checkNotNullParameter(interfaceC10025c, "<this>");
        Map<Sd.f, Xd.g<?>> b11 = interfaceC10025c.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Sd.f, Xd.g<?>> entry : b11.entrySet()) {
            C7714v.p((!z11 || Intrinsics.d(entry.getKey(), F.f4691b)) ? o(entry.getValue()) : kotlin.collections.K.f71697a, arrayList);
        }
        return arrayList;
    }

    @Override // Cd.AbstractC2740a
    public final Sd.c f(InterfaceC10025c interfaceC10025c) {
        InterfaceC10025c interfaceC10025c2 = interfaceC10025c;
        Intrinsics.checkNotNullParameter(interfaceC10025c2, "<this>");
        return interfaceC10025c2.c();
    }

    @Override // Cd.AbstractC2740a
    public final InterfaceC9839e g(Object obj) {
        InterfaceC10025c interfaceC10025c = (InterfaceC10025c) obj;
        Intrinsics.checkNotNullParameter(interfaceC10025c, "<this>");
        InterfaceC9839e d11 = Zd.e.d(interfaceC10025c);
        Intrinsics.f(d11);
        return d11;
    }

    @Override // Cd.AbstractC2740a
    public final Iterable<InterfaceC10025c> h(InterfaceC10025c interfaceC10025c) {
        InterfaceC10030h annotations;
        InterfaceC10025c interfaceC10025c2 = interfaceC10025c;
        Intrinsics.checkNotNullParameter(interfaceC10025c2, "<this>");
        InterfaceC9839e d11 = Zd.e.d(interfaceC10025c2);
        return (d11 == null || (annotations = d11.getAnnotations()) == null) ? kotlin.collections.K.f71697a : annotations;
    }
}
