package T3;

import G1.E;
import W3.o;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements i4.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5763k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i4.c f5764l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E f5765m;

    public /* synthetic */ b(i4.c cVar, E e3, int i) {
        this.f5763k = i;
        this.f5764l = cVar;
        this.f5765m = e3;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        int i = this.f5763k;
        int intValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                this.f5764l.c(new c(this.f5765m, intValue, 0));
                break;
            default:
                this.f5764l.c(new c(this.f5765m, intValue, 3));
                break;
        }
        return o.f6046a;
    }
}
