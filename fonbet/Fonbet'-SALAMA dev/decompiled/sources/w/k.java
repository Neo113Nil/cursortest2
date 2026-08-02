package w;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public n f17239a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f17240b;

    public static long a(e eVar, long j) {
        n nVar = eVar.f17228d;
        if (nVar instanceof i) {
            return j;
        }
        ArrayList arrayList = eVar.f17234k;
        int size = arrayList.size();
        long j3 = j;
        for (int i7 = 0; i7 < size; i7++) {
            InterfaceC1671d interfaceC1671d = (InterfaceC1671d) arrayList.get(i7);
            if (interfaceC1671d instanceof e) {
                e eVar2 = (e) interfaceC1671d;
                if (eVar2.f17228d != nVar) {
                    j3 = Math.min(j3, a(eVar2, eVar2.f17230f + j));
                }
            }
        }
        if (eVar != nVar.f17257i) {
            return j3;
        }
        long j7 = nVar.j();
        long j8 = j - j7;
        return Math.min(Math.min(j3, a(nVar.f17256h, j8)), j8 - r9.f17230f);
    }

    public static long b(e eVar, long j) {
        n nVar = eVar.f17228d;
        if (nVar instanceof i) {
            return j;
        }
        ArrayList arrayList = eVar.f17234k;
        int size = arrayList.size();
        long j3 = j;
        for (int i7 = 0; i7 < size; i7++) {
            InterfaceC1671d interfaceC1671d = (InterfaceC1671d) arrayList.get(i7);
            if (interfaceC1671d instanceof e) {
                e eVar2 = (e) interfaceC1671d;
                if (eVar2.f17228d != nVar) {
                    j3 = Math.max(j3, b(eVar2, eVar2.f17230f + j));
                }
            }
        }
        if (eVar != nVar.f17256h) {
            return j3;
        }
        long j7 = nVar.j();
        long j8 = j + j7;
        return Math.max(Math.max(j3, b(nVar.f17257i, j8)), j8 - r9.f17230f);
    }
}
