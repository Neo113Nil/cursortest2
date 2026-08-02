package B;

import java.util.Comparator;

/* renamed from: B.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0085n implements Comparator {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f689k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ s f690l;

    public /* synthetic */ C0085n(s sVar, int i) {
        this.f689k = i;
        this.f690l = sVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f689k) {
            case 0:
                Object obj3 = ((A.u) obj).f124g;
                s sVar = this.f690l;
                return N4.b.n(Integer.valueOf(sVar.b(obj3)), Integer.valueOf(sVar.b(((A.u) obj2).f124g)));
            default:
                Object obj4 = ((A.u) obj2).f124g;
                s sVar2 = this.f690l;
                return N4.b.n(Integer.valueOf(sVar2.b(obj4)), Integer.valueOf(sVar2.b(((A.u) obj).f124g)));
        }
    }
}
