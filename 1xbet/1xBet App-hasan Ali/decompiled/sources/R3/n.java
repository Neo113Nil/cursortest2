package R3;

import P.AbstractC0329z;
import P.C0315s;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5230k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f5231l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b0.p f5232m;

    public /* synthetic */ n(String str, b0.p pVar, int i, int i5) {
        this.f5230k = i5;
        this.f5231l = str;
        this.f5232m = pVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f5230k;
        C0315s c0315s = (C0315s) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                G4.l.w(this.f5231l, this.f5232m, c0315s, AbstractC0329z.B(1));
                break;
            default:
                G4.l.k(this.f5231l, this.f5232m, c0315s, AbstractC0329z.B(7));
                break;
        }
        return W3.o.f6046a;
    }
}
