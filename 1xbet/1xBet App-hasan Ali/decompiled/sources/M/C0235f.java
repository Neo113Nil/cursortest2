package M;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import u.C2451c;
import y.C2648d;
import y.C2651g;
import y.InterfaceC2653i;

/* renamed from: M.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0235f extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f3326k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2451c f3327l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f3328m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f3329n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0236g f3330o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2653i f3331p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0235f(C2451c c2451c, float f, boolean z3, C0236g c0236g, InterfaceC2653i interfaceC2653i, a4.c cVar) {
        super(2, cVar);
        this.f3327l = c2451c;
        this.f3328m = f;
        this.f3329n = z3;
        this.f3330o = c0236g;
        this.f3331p = interfaceC2653i;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C0236g c0236g = this.f3330o;
        return new C0235f(this.f3327l, this.f3328m, this.f3329n, c0236g, this.f3331p, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0235f) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r8.e(r7, r1) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0085, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        if (N.b.a(r8, r4, r1, r7.f3331p, r7) == r0) goto L29;
     */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f3326k;
        if (i == 0) {
            G4.l.N(obj);
            C2451c c2451c = this.f3327l;
            float f = ((W0.f) c2451c.f19764e.getValue()).f6006k;
            float f5 = this.f3328m;
            if (!W0.f.a(f, f5)) {
                if (this.f3329n) {
                    float f6 = ((W0.f) c2451c.f19764e.getValue()).f6006k;
                    C0236g c0236g = this.f3330o;
                    InterfaceC2653i lVar = W0.f.a(f6, c0236g.f3334b) ? new y.l(0L) : W0.f.a(f6, c0236g.f3336d) ? new C2651g() : W0.f.a(f6, c0236g.f3335c) ? new C2648d() : null;
                    this.f3326k = 2;
                } else {
                    W0.f fVar = new W0.f(f5);
                    this.f3326k = 1;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
        }
        return W3.o.f6046a;
    }
}
