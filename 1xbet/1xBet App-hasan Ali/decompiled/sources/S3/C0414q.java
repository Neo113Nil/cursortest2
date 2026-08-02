package S3;

import P.AbstractC0329z;
import P.C0315s;
import i4.InterfaceC2015a;
import r0.AbstractC2346c;

/* renamed from: S3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0414q implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5536k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5537l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5538m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5539n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2015a f5540o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f5541p;

    public /* synthetic */ C0414q(int i, int i5, int i6, InterfaceC2015a interfaceC2015a, InterfaceC2015a interfaceC2015a2, int i7) {
        this.f5537l = i;
        this.f5538m = i5;
        this.f5539n = i6;
        this.f5540o = interfaceC2015a;
        this.f5541p = interfaceC2015a2;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5536k) {
            case 0:
                ((Integer) obj2).getClass();
                int B5 = AbstractC0329z.B(this.f5538m | 1);
                String str = (String) this.f5541p;
                int i = this.f5537l;
                N4.b.v(str, this.f5540o, i, (C0315s) obj, B5, this.f5539n);
                break;
            default:
                ((Integer) obj2).getClass();
                int B6 = AbstractC0329z.B(1);
                InterfaceC2015a interfaceC2015a = this.f5540o;
                InterfaceC2015a interfaceC2015a2 = (InterfaceC2015a) this.f5541p;
                AbstractC2346c.g(this.f5537l, this.f5538m, this.f5539n, interfaceC2015a, interfaceC2015a2, (C0315s) obj, B6);
                break;
        }
        return W3.o.f6046a;
    }

    public /* synthetic */ C0414q(String str, InterfaceC2015a interfaceC2015a, int i, int i5, int i6) {
        this.f5541p = str;
        this.f5540o = interfaceC2015a;
        this.f5537l = i;
        this.f5538m = i5;
        this.f5539n = i6;
    }
}
