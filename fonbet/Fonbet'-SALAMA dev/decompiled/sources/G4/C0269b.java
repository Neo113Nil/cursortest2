package G4;

import E3.AbstractC0161t;
import E4.C0177j;
import com.google.android.gms.internal.ads.zzbbd;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import s2.C1589c;
import s2.C1590d;

/* renamed from: G4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0269b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
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
                int compareTo = c0270c.f2964a.compareTo(c0270c2.f2964a);
                return compareTo != 0 ? compareTo : L4.r.d(c0270c.f2965b, c0270c2.f2965b);
            case 1:
                C0270c c0270c3 = (C0270c) obj;
                C0270c c0270c4 = (C0270c) obj2;
                int d7 = L4.r.d(c0270c3.f2965b, c0270c4.f2965b);
                return d7 != 0 ? d7 : c0270c3.f2964a.compareTo(c0270c4.f2964a);
            case 2:
                return ((Long) obj2).compareTo((Long) obj);
            case 3:
                H4.a aVar = (H4.a) obj;
                H4.a aVar2 = (H4.a) obj2;
                int compare = Long.compare(aVar.f3302d.f3308a, aVar2.f3302d.f3308a);
                return compare == 0 ? aVar.f3300b.compareTo(aVar2.f3300b) : compare;
            case 4:
                return L4.r.d(((I4.i) obj).f3673a, ((I4.i) obj2).f3673a);
            case 5:
                return ((H4.h) obj).compareTo((H4.h) obj2);
            case 6:
                H4.a aVar3 = (H4.a) obj;
                H4.a aVar4 = (H4.a) obj2;
                int compareTo2 = aVar3.f3300b.compareTo(aVar4.f3300b);
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                Iterator it = aVar3.f3301c.iterator();
                Iterator it2 = aVar4.f3301c.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    H4.d dVar = (H4.d) it.next();
                    H4.d dVar2 = (H4.d) it2.next();
                    dVar.getClass();
                    int compareTo3 = dVar.f3310a.compareTo(dVar2.f3310a);
                    int a2 = compareTo3 != 0 ? compareTo3 : t.e.a(dVar.f3311b, dVar2.f3311b);
                    if (a2 != 0) {
                        return a2;
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
                int compare2 = Integer.compare(bVar.f13107c, bVar2.f13107c);
                return compare2 != 0 ? compare2 : bVar.f13106b.compareTo(bVar2.f13106b);
            case 13:
                return Integer.compare(((k2.d) obj2).f14717b, ((k2.d) obj).f14717b);
            case 14:
                return Integer.compare(((C1590d) obj).f16120a.f16123b, ((C1590d) obj2).f16120a.f16123b);
            case 15:
                return Long.compare(((C1589c) obj).f16117b, ((C1589c) obj2).f16117b);
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
                E3.K k7 = t2.p.f16384i;
                return 0;
            case 19:
                List list = (List) obj;
                List list2 = (List) obj2;
                return E3.r.f(t2.o.c((t2.o) Collections.max(list, new C0269b(i7)), (t2.o) Collections.max(list2, new C0269b(i7)))).a(list.size(), list2.size()).b((t2.o) Collections.max(list, new C0269b(i8)), (t2.o) Collections.max(list2, new C0269b(i8)), new C0269b(i8)).e();
            case 20:
                return ((t2.f) Collections.max((List) obj)).compareTo((t2.f) Collections.max((List) obj2));
            case zzbbd.zzt.zzm /* 21 */:
                return ((t2.l) ((List) obj).get(0)).compareTo((t2.l) ((List) obj2).get(0));
            case 22:
                return t2.o.c((t2.o) obj, (t2.o) obj2);
            case 23:
                t2.o oVar = (t2.o) obj;
                t2.o oVar2 = (t2.o) obj2;
                E3.K a4 = (oVar.f16379e && oVar.f16382y) ? t2.p.f16384i : t2.p.f16384i.a();
                E3.r rVar = AbstractC0161t.f2068a;
                int i10 = oVar.f16383z;
                return rVar.b(Integer.valueOf(i10), Integer.valueOf(oVar2.f16383z), oVar.f16380f.f16430N ? t2.p.f16384i.a() : t2.p.j).b(Integer.valueOf(oVar.f16370A), Integer.valueOf(oVar2.f16370A), a4).b(Integer.valueOf(i10), Integer.valueOf(oVar2.f16383z), a4).e();
            case 24:
                return ((u2.Q) obj).f16741a - ((u2.Q) obj2).f16741a;
            default:
                return Float.compare(((u2.Q) obj).f16743c, ((u2.Q) obj2).f16743c);
        }
    }
}
