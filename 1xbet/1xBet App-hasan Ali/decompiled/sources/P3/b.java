package P3;

import P.C0315s;
import W3.o;
import b0.p;
import i4.e;
import r3.AbstractC2349a;

/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f4794k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f4795l;

    public /* synthetic */ b(p pVar, int i) {
        this.f4794k = i;
        this.f4795l = pVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4794k) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
                    c0315s.S();
                } else {
                    AbstractC2349a.N(this.f4795l, null, c0315s, 6);
                }
                break;
            default:
                C0315s c0315s2 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s2.B()) {
                    c0315s2.S();
                } else {
                    V3.b.a(X.e.d(-643519605, new b(this.f4795l, 0), c0315s2), c0315s2, 438);
                }
                break;
        }
        return o.f6046a;
    }
}
