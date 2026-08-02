package B1;

import G4.l;
import O3.q;
import O3.s;
import P.AbstractC0329z;
import P.C0315s;
import W3.o;
import androidx.lifecycle.InterfaceC0491u;
import i4.InterfaceC2015a;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f736k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f737l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f738m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f739n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f740o;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i, int i5) {
        this.f736k = i5;
        this.f738m = obj;
        this.f739n = obj2;
        this.f740o = obj3;
        this.f737l = i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        C0315s c0315s = (C0315s) obj;
        Integer num = (Integer) obj2;
        switch (this.f736k) {
            case 0:
                num.intValue();
                l.d((InterfaceC0491u) this.f738m, (g) this.f739n, (i4.c) this.f740o, c0315s, AbstractC0329z.B(this.f737l | 1));
                break;
            case 1:
                num.intValue();
                ((s) this.f738m).d((q) this.f739n, (InterfaceC2015a) this.f740o, c0315s, AbstractC0329z.B(this.f737l | 1));
                break;
            case 2:
                num.intValue();
                ((s) this.f738m).b((String) this.f739n, (InterfaceC2015a) this.f740o, c0315s, AbstractC0329z.B(this.f737l | 1));
                break;
            case 3:
                num.intValue();
                ((X.d) this.f738m).f(this.f739n, this.f740o, c0315s, AbstractC0329z.B(this.f737l) | 1);
                break;
            default:
                num.getClass();
                int B5 = AbstractC0329z.B(this.f737l | 1);
                ((Y.d) this.f738m).b(this.f739n, (X.d) this.f740o, c0315s, B5);
                break;
        }
        return o.f6046a;
    }
}
