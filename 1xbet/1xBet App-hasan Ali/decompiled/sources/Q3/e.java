package Q3;

import P.C0315s;
import W3.o;
import k4.AbstractC2036a;

/* loaded from: classes.dex */
public final class e implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5085k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f5086l;

    public /* synthetic */ e(a aVar, int i) {
        this.f5085k = i;
        this.f5086l = aVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5085k) {
            case 0:
                C0315s c0315s = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s.B()) {
                    c0315s.S();
                } else {
                    boolean booleanValue = ((Boolean) this.f5086l.invoke()).booleanValue();
                    if (booleanValue) {
                        c0315s.X(-1790311672);
                        G4.d.H(null, c0315s, 0);
                        c0315s.q(false);
                    } else {
                        if (booleanValue) {
                            c0315s.X(-1790313465);
                            c0315s.q(false);
                            throw new D2.e();
                        }
                        c0315s.X(-1790310104);
                        AbstractC2036a.a0(0, c0315s);
                        c0315s.q(false);
                    }
                }
                return o.f6046a;
            default:
                C0315s c0315s2 = (C0315s) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0315s2.B()) {
                    c0315s2.S();
                } else {
                    V3.b.a(X.e.d(-796135017, new e(this.f5086l, 0), c0315s2), c0315s2, 438);
                }
                return o.f6046a;
        }
    }
}
