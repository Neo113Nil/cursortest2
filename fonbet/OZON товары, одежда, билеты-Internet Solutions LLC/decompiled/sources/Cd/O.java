package Cd;

import Cd.Q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td.InterfaceC9836b;

/* loaded from: classes10.dex */
final class O implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final O f4732a = new O();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z11;
        Set set;
        InterfaceC9836b b11;
        String builtinSignature;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        InterfaceC9836b it = (InterfaceC9836b) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (qd.m.V(it)) {
            int i11 = C2747h.f4757m;
            Intrinsics.checkNotNullParameter(it, "<this>");
            set = Q.f4737e;
            Q.b bVar = null;
            if (set.contains(it.getName()) && (b11 = Zd.e.b(it, C2746g.f4756a)) != null && (builtinSignature = Ld.D.b(b11)) != null) {
                Intrinsics.checkNotNullParameter(builtinSignature, "builtinSignature");
                arrayList = Q.f4734b;
                if (arrayList.contains(builtinSignature)) {
                    bVar = Q.b.ONE_COLLECTION_PARAMETER;
                } else {
                    linkedHashMap = Q.f4736d;
                    bVar = ((Q.c) U.e(linkedHashMap, builtinSignature)) == Q.c.NULL ? Q.b.OBJECT_PARAMETER_GENERIC : Q.b.OBJECT_PARAMETER_NON_GENERIC;
                }
            }
            if (bVar != null) {
                z11 = true;
                return Boolean.valueOf(z11);
            }
        }
        z11 = false;
        return Boolean.valueOf(z11);
    }
}
