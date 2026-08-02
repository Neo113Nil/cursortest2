package R3;

import P.AbstractC0329z;
import P.C0315s;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5221k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b0.p f5222l;

    public /* synthetic */ k(b0.p pVar, int i, int i5) {
        this.f5221k = i5;
        this.f5222l = pVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f5221k;
        C0315s c0315s = (C0315s) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                G4.d.H(this.f5222l, c0315s, AbstractC0329z.B(1));
                break;
            case 1:
                G4.l.v(this.f5222l, c0315s, AbstractC0329z.B(7));
                break;
            default:
                G4.l.n(this.f5222l, c0315s, AbstractC0329z.B(1));
                break;
        }
        return W3.o.f6046a;
    }
}
