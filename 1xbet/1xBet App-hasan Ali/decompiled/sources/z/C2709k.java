package z;

import java.util.List;
import n.AbstractC2107A;
import x0.InterfaceC2632s;

/* renamed from: z.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2709k implements x0.O {

    /* renamed from: b, reason: collision with root package name */
    public static final C2709k f21544b = new C2709k(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C2709k f21545c = new C2709k(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21546a;

    public /* synthetic */ C2709k(int i) {
        this.f21546a = i;
    }

    @Override // x0.O
    public final /* synthetic */ int a(InterfaceC2632s interfaceC2632s, List list, int i) {
        int i5 = this.f21546a;
        return AbstractC2107A.h(this, interfaceC2632s, list, i);
    }

    @Override // x0.O
    public final /* synthetic */ int b(InterfaceC2632s interfaceC2632s, List list, int i) {
        int i5 = this.f21546a;
        return AbstractC2107A.k(this, interfaceC2632s, list, i);
    }

    @Override // x0.O
    public final x0.P c(x0.Q q5, List list, long j5) {
        switch (this.f21546a) {
            case 0:
                return q5.i(W0.a.j(j5), W0.a.i(j5), X3.w.f6091k, C2708j.f21540m);
            default:
                return q5.i(W0.a.f(j5) ? W0.a.h(j5) : 0, W0.a.e(j5) ? W0.a.g(j5) : 0, X3.w.f6091k, C2708j.f21542o);
        }
    }

    @Override // x0.O
    public final /* synthetic */ int h(InterfaceC2632s interfaceC2632s, List list, int i) {
        int i5 = this.f21546a;
        return AbstractC2107A.b(this, interfaceC2632s, list, i);
    }

    @Override // x0.O
    public final /* synthetic */ int j(InterfaceC2632s interfaceC2632s, List list, int i) {
        int i5 = this.f21546a;
        return AbstractC2107A.e(this, interfaceC2632s, list, i);
    }
}
