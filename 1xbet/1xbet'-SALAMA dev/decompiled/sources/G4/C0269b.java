package G4;

import E3.AbstractC0161t;
import E4.C0177j;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: G4.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0269b implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2961a;

    public /* synthetic */ C0269b(int i7) {
        this.f2961a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i7 = 22;
        int i8 = 23;
        switch (this.f2961a) {
            case 0:
                C0270c c0270c = (C0270c) obj;
                C0270c c0270c2 = (C0270c) obj2;
                int iA = c0270c.f2964a.compareTo(c0270c2.f2964a);
                return iA != 0 ? iA : L4.r.d(c0270c.f2965b, c0270c2.f2965b);
            case 1:
                C0270c c0270c3 = (C0270c) obj;
                C0270c c0270c4 = (C0270c) obj2;
                int iD = L4.r.d(c0270c3.f2965b, c0270c4.f2965b);
                return iD != 0 ? iD : c0270c3.f2964a.compareTo(c0270c4.f2964a);
            case 2:
                return ((Long) obj2).compareTo((Long) obj);
            case 3:
                H4.a aVar = (H4.a) obj;
                H4.a aVar2 = (H4.a) obj2;
                int iCompare = Long.compare(aVar.f3302d.f3308a, aVar2.f3302d.f3308a);
                return iCompare == 0 ? aVar.f3300b.compareTo(aVar2.f3300b) : iCompare;
            case 4:
                return L4.r.d(((I4.i) obj).f3673a, ((I4.i) obj2).f3673a);
            case 5:
                return ((H4.h) obj).compareTo((H4.h) obj2);
            case 6:
                H4.a aVar3 = (H4.a) obj;
                H4.a aVar4 = (H4.a) obj2;
                int iCompareTo = aVar3.f3300b.compareTo(aVar4.f3300b);
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                Iterator it = aVar3.f3301c.iterator();
                Iterator it2 = aVar4.f3301c.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    H4.d dVar = (H4.d) it.next();
                    H4.d dVar2 = (H4.d) it2.next();
                    dVar.getClass();
                    int iD2 = dVar.f3310a.compareTo(dVar2.f3310a);
                    int iA2 = iD2 != 0 ? iD2 : p136t.e.a(dVar.f3311b, dVar2.f3311b);
                    if (iA2 != 0) {
                        return iA2;
                    }
                }
                return Boolean.compare(it.hasNext(), it2.hasNext());
            case 7:
                return H4.b.b((H4.k) obj).compareTo(H4.b.b((H4.k) obj2));
            case 8:
                return ((C0177j) obj).f2201c.compareTo(((C0177j) obj2).f2201c);
            case 9:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 10:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 11:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i9 = 0; i9 < bArr.length; i9++) {
                    byte b7 = bArr[i9];
                    byte b8 = bArr2[i9];
                    if (b7 != b8) {
                        return b7 - b8;
                    }
                }
                return 0;
            case 12:
                g2.b bVar = (g2.b) obj;
                g2.b bVar2 = (g2.b) obj2;
                int iCompare2 = Integer.compare(bVar.f13113c, bVar2.f13113c);
                return iCompare2 != 0 ? iCompare2 : bVar.f13112b.compareTo(bVar2.f13112b);
            case 13:
                return Integer.compare(((p073k2.d) obj2).f14723b, ((p073k2.d) obj).f14723b);
            case 14:
                return Integer.compare(((p132s2.d) obj).f16126a.f16129b, ((p132s2.d) obj2).f16126a.f16129b);
            case 15:
                return Long.compare(((p132s2.c) obj).f16123b, ((p132s2.c) obj2).f16123b);
            case 16:
                return ((A1.X) obj2).f311y - ((A1.X) obj).f311y;
            case 17:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 18:
                E3.K k7 = p139t2.p.f16390i;
                return 0;
            case 19:
                List list = (List) obj;
                List list2 = (List) obj2;
                return E3.r.f(p139t2.o.c((p139t2.o) Collections.max(list, new C0269b(i7)), (p139t2.o) Collections.max(list2, new C0269b(i7)))).a(list.size(), list2.size()).b((p139t2.o) Collections.max(list, new C0269b(i8)), (p139t2.o) Collections.max(list2, new C0269b(i8)), new C0269b(i8)).e();
            case 20:
                return ((p139t2.f) Collections.max((List) obj)).compareTo((p139t2.f) Collections.max((List) obj2));
            case zzbbd.zzt.zzm /* 21 */:
                return ((p139t2.l) ((List) obj).get(0)).compareTo((p139t2.l) ((List) obj2).get(0));
            case 22:
                return p139t2.o.c((p139t2.o) obj, (p139t2.o) obj2);
            case 23:
                p139t2.o oVar = (p139t2.o) obj;
                p139t2.o oVar2 = (p139t2.o) obj2;
                E3.K kA = (oVar.f16385e && oVar.f16388y) ? p139t2.p.f16390i : p139t2.p.f16390i.a();
                E3.r rVar = AbstractC0161t.f2068a;
                int i10 = oVar.f16389z;
                return rVar.b(Integer.valueOf(i10), Integer.valueOf(oVar2.f16389z), oVar.f16386f.f16436N ? p139t2.p.f16390i.a() : p139t2.p.j).b(Integer.valueOf(oVar.f16376A), Integer.valueOf(oVar2.f16376A), kA).b(Integer.valueOf(i10), Integer.valueOf(oVar2.f16389z), kA).e();
            case 24:
                return ((p146u2.Q) obj).f16747a - ((p146u2.Q) obj2).f16747a;
            default:
                return Float.compare(((p146u2.Q) obj).f16749c, ((p146u2.Q) obj2).f16749c);
        }
    }
}
