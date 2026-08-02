package S3;

import P.AbstractC0329z;
import P.C0315s;
import r0.AbstractC2346c;

/* renamed from: S3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0398a implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5429k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5430l;

    public /* synthetic */ C0398a(int i, int i5, Object obj) {
        this.f5429k = i5;
        this.f5430l = obj;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f5429k;
        C0315s c0315s = (C0315s) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC0406i.b(this.f5430l, c0315s, AbstractC0329z.B(1));
                break;
            case 1:
                N4.b.t(this.f5430l, c0315s, AbstractC0329z.B(1));
                break;
            case 2:
                N4.b.t(this.f5430l, c0315s, AbstractC0329z.B(1));
                break;
            case 3:
                K.c(this.f5430l, c0315s, AbstractC0329z.B(1));
                break;
            case 4:
                Z.c(this.f5430l, c0315s, AbstractC0329z.B(1));
                break;
            default:
                AbstractC2346c.f(this.f5430l, c0315s, AbstractC0329z.B(1));
                break;
        }
        return W3.o.f6046a;
    }
}
