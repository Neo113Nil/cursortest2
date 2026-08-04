package p154w;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f17245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f17246b;

    public static long a(e eVar, long j) {
        n nVar = eVar.f17234d;
        if (nVar instanceof i) {
            return j;
        }
        ArrayList arrayList = eVar.f17240k;
        int size = arrayList.size();
        long jMin = j;
        for (int i7 = 0; i7 < size; i7++) {
            d dVar = (d) arrayList.get(i7);
            if (dVar instanceof e) {
                e eVar2 = (e) dVar;
                if (eVar2.f17234d != nVar) {
                    jMin = Math.min(jMin, a(eVar2, ((long) eVar2.f17236f) + j));
                }
            }
        }
        if (eVar != nVar.f17263i) {
            return jMin;
        }
        long j3 = nVar.j();
        e eVar3 = nVar.f17262h;
        long j7 = j - j3;
        return Math.min(Math.min(jMin, a(eVar3, j7)), j7 - ((long) eVar3.f17236f));
    }

    public static long b(e eVar, long j) {
        n nVar = eVar.f17234d;
        if (nVar instanceof i) {
            return j;
        }
        ArrayList arrayList = eVar.f17240k;
        int size = arrayList.size();
        long jMax = j;
        for (int i7 = 0; i7 < size; i7++) {
            d dVar = (d) arrayList.get(i7);
            if (dVar instanceof e) {
                e eVar2 = (e) dVar;
                if (eVar2.f17234d != nVar) {
                    jMax = Math.max(jMax, b(eVar2, ((long) eVar2.f17236f) + j));
                }
            }
        }
        if (eVar != nVar.f17262h) {
            return jMax;
        }
        long j3 = nVar.j();
        e eVar3 = nVar.f17263i;
        long j7 = j + j3;
        return Math.max(Math.max(jMax, b(eVar3, j7)), j7 - ((long) eVar3.f17236f));
    }
}
