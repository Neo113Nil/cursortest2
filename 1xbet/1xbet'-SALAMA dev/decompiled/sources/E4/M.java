package E4;

import G4.C0269b;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class M implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2148b;

    public /* synthetic */ M(Object obj, int i7) {
        this.f2147a = i7;
        this.f2148b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2147a) {
            case 0:
                C0173f c0173f = (C0173f) obj;
                C0173f c0173f2 = (C0173f) obj2;
                N n2 = (N) this.f2148b;
                n2.getClass();
                int iD = L4.r.d(N.b(c0173f), N.b(c0173f2));
                return iD != 0 ? iD : n2.f2149a.a().compare(c0173f.f2180b, c0173f2.f2180b);
            case 1:
                H4.k kVar = (H4.k) obj;
                H4.k kVar2 = (H4.k) obj2;
                int iCompare = ((B) this.f2148b).compare(kVar, kVar2);
                return iCompare == 0 ? kVar.f3323a.compareTo(kVar2.f3323a) : iCompare;
            case 2:
                return ((C0269b) this.f2148b).compare(((Map.Entry) obj).getValue(), ((Map.Entry) obj2).getValue());
            default:
                R1.v vVar = (R1.v) this.f2148b;
                return vVar.a(obj2) - vVar.a(obj);
        }
    }
}
