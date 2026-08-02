package M;

import m4.InterfaceC2105h;

/* renamed from: M.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237h extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: m, reason: collision with root package name */
    public static final C0237h f3339m = new C0237h(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C0237h f3340n = new C0237h(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C0237h f3341o = new C0237h(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final C0237h f3342p = new C0237h(1, 3);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3343l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0237h(int i, int i5) {
        super(i);
        this.f3343l = i5;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        W3.o oVar = W3.o.f6046a;
        switch (this.f3343l) {
            case 0:
                H0.u.b((H0.j) obj, 0);
                break;
            case 1:
                H0.u.b((H0.j) obj, 0);
                break;
            case 2:
                break;
            default:
                InterfaceC2105h[] interfaceC2105hArr = H0.u.f2183a;
                H0.v vVar = H0.s.f2166l;
                InterfaceC2105h interfaceC2105h = H0.u.f2183a[5];
                vVar.a((H0.j) obj, Boolean.TRUE);
                break;
        }
        return oVar;
    }
}
