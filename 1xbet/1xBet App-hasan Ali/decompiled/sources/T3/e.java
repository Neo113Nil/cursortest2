package T3;

import G1.E;
import W3.o;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5774k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i4.c f5775l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E f5776m;

    public /* synthetic */ e(i4.c cVar, E e3, int i) {
        this.f5774k = i;
        this.f5775l = cVar;
        this.f5776m = e3;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f5774k;
        int intValue = ((Integer) obj).intValue();
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                this.f5775l.c(new f(this.f5776m, intValue, num.intValue(), 0));
                break;
            case 1:
                this.f5775l.c(new f(this.f5776m, intValue, num.intValue(), 1));
                break;
            case 2:
                this.f5775l.c(new f(this.f5776m, intValue, num.intValue(), 2));
                break;
            case 3:
                num.getClass();
                this.f5775l.c(new c(this.f5776m, intValue, 4));
                break;
            default:
                this.f5775l.c(new f(this.f5776m, intValue, num.intValue(), 3));
                break;
        }
        return o.f6046a;
    }
}
