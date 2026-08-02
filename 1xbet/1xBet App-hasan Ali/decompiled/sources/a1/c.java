package a1;

import m4.InterfaceC2105h;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: m, reason: collision with root package name */
    public static final c f6381m = new c(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final c f6382n = new c(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final c f6383o = new c(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final c f6384p = new c(1, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final c f6385q = new c(1, 4);

    /* renamed from: r, reason: collision with root package name */
    public static final c f6386r = new c(1, 5);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f6387l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, int i5) {
        super(i);
        this.f6387l = i5;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        W3.o oVar = W3.o.f6046a;
        switch (this.f6387l) {
            case 0:
                InterfaceC2105h[] interfaceC2105hArr = H0.u.f2183a;
                ((H0.j) obj).f(H0.s.f2177w, oVar);
                break;
            case 1:
                ((Number) obj).longValue();
                break;
            case 2:
                break;
            case 3:
                InterfaceC2105h[] interfaceC2105hArr2 = H0.u.f2183a;
                ((H0.j) obj).f(H0.s.f2176v, oVar);
                break;
            case 4:
                break;
            default:
                w wVar = (w) obj;
                if (wVar.isAttachedToWindow()) {
                    wVar.m();
                    break;
                }
                break;
        }
        return oVar;
    }
}
