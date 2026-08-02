package d;

import P.AbstractC0329z;
import P.C0315s;
import W3.o;
import i4.InterfaceC2015a;

/* renamed from: d.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1902b implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f16806k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f16807l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W3.c f16808m;

    public /* synthetic */ C1902b(boolean z3, W3.c cVar, int i, int i5) {
        this.f16806k = i5;
        this.f16807l = z3;
        this.f16808m = cVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f16806k;
        C0315s c0315s = (C0315s) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                G4.d.a(this.f16807l, (InterfaceC2015a) this.f16808m, c0315s, AbstractC0329z.B(1));
                break;
            default:
                G4.l.e(this.f16807l, (i4.e) this.f16808m, c0315s, AbstractC0329z.B(1));
                break;
        }
        return o.f6046a;
    }
}
