package E4;

import G4.C0269b;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class M implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2147a;

    /* renamed from: b, reason: collision with root package name */
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
                int d7 = L4.r.d(N.b(c0173f), N.b(c0173f2));
                return d7 != 0 ? d7 : n2.f2149a.a().compare(c0173f.f2180b, c0173f2.f2180b);
            case 1:
                H4.k kVar = (H4.k) obj;
                H4.k kVar2 = (H4.k) obj2;
                int compare = ((B) this.f2148b).compare(kVar, kVar2);
                return compare == 0 ? kVar.f3323a.compareTo(kVar2.f3323a) : compare;
            case 2:
                return ((C0269b) this.f2148b).compare(((Map.Entry) obj).getValue(), ((Map.Entry) obj2).getValue());
            default:
                R1.v vVar = (R1.v) this.f2148b;
                return vVar.a(obj2) - vVar.a(obj);
        }
    }
}
