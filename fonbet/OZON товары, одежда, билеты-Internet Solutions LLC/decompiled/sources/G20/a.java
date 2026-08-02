package G20;

import S20.a;
import Sc.o;
import U20.b;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v20.InterfaceC10198a;

/* loaded from: classes3.dex */
public final class a {
    @NotNull
    public static final ArrayList a(@NotNull U20.a aVar) {
        Object jVar;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a.g(aVar.a(), aVar.c()));
        List<b> b11 = aVar.b();
        int i13 = 10;
        ArrayList arrayList2 = new ArrayList(C7714v.z(b11, 10));
        int i14 = 0;
        for (Object obj : b11) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                C7714v.O0();
                throw null;
            }
            b bVar = (b) obj;
            b bVar2 = (b) C7714v.Q(i14 - 1, aVar.b());
            String a11 = aVar.a();
            boolean z11 = i14 == C7714v.P(aVar.b());
            if (bVar instanceof b.a) {
                b.a aVar2 = (b.a) bVar;
                jVar = new a.C0509a(aVar2.b(), a11, aVar2.d(), aVar2.a(), aVar2.c(), z11, null);
            } else if (bVar instanceof b.C0551b) {
                b.C0551b c0551b = (b.C0551b) bVar;
                String a12 = c0551b.a();
                String c11 = c0551b.c();
                Function1<Context, Unit> b12 = c0551b.b();
                if (bVar2 instanceof InterfaceC10198a) {
                    i11 = 12;
                } else if ((bVar2 instanceof b.C0551b) || bVar2 == null) {
                    i11 = 8;
                } else {
                    i12 = 0;
                    jVar = new a.b(i12, a12, a11, c11, b12, z11);
                }
                i12 = i11;
                jVar = new a.b(i12, a12, a11, c11, b12, z11);
            } else if (bVar instanceof b.c) {
                b.c cVar = (b.c) bVar;
                jVar = new a.c(cVar.a(), a11, cVar.d(), cVar.b(), cVar.c(), z11);
            } else if (bVar instanceof b.e) {
                b.e eVar = (b.e) bVar;
                jVar = new a.e(eVar.a(), a11, eVar.b(), eVar.c(), z11, null);
            } else if (bVar instanceof b.g) {
                b.g gVar = (b.g) bVar;
                jVar = new a.h(gVar.b(), a11, gVar.c(), gVar.d(), gVar.a(), null, gVar.e(), null, z11);
            } else if (bVar instanceof b.h) {
                b.h hVar = (b.h) bVar;
                hVar.getClass();
                List<b.h.a> a13 = hVar.a();
                ArrayList arrayList3 = new ArrayList(C7714v.z(a13, i13));
                int i16 = 0;
                for (Object obj2 : a13) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    b.h.a aVar3 = (b.h.a) obj2;
                    arrayList3.add(new a.i.C0510a(aVar3.a(), aVar3.b(), null, i16 == C7714v.P(hVar.a()) && z11));
                    i16 = i17;
                }
                jVar = new a.i("httpLoggingRadio", a11, arrayList3, hVar.c(), hVar.b());
            } else {
                if (!(bVar instanceof b.i)) {
                    boolean z12 = z11;
                    if (bVar instanceof b.d) {
                        ((b.d) bVar).getClass();
                        new a.d(a11, z12);
                        throw null;
                    }
                    if (!(bVar instanceof b.f)) {
                        throw new o();
                    }
                    ((b.f) bVar).getClass();
                    new a.f(a11, z12);
                    throw null;
                }
                b.i iVar = (b.i) bVar;
                jVar = new a.j(iVar.b(), a11, iVar.e(), iVar.f(), iVar.a(), iVar.c(), iVar.d(), z11);
            }
            arrayList2.add(jVar);
            i14 = i15;
            i13 = 10;
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }
}
