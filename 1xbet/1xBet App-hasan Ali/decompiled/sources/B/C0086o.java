package B;

import java.util.Comparator;

/* renamed from: B.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086o implements Comparator {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f691k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K f692l;

    public /* synthetic */ C0086o(K k5, int i) {
        this.f691k = i;
        this.f692l = k5;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f691k) {
            case 0:
                Object obj3 = ((A.u) obj).f124g;
                K k5 = this.f692l;
                return N4.b.n(Integer.valueOf(k5.b(obj3)), Integer.valueOf(k5.b(((A.u) obj2).f124g)));
            default:
                Object obj4 = ((A.u) obj2).f124g;
                K k6 = this.f692l;
                return N4.b.n(Integer.valueOf(k6.b(obj4)), Integer.valueOf(k6.b(((A.u) obj).f124g)));
        }
    }
}
