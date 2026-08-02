package M;

import P.InterfaceC0289e0;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import u.C2451c;
import y.InterfaceC2653i;

/* renamed from: M.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240k extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f3366k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2451c f3367l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f3368m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f3369n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2653i f3370o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f3371p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0240k(C2451c c2451c, float f, boolean z3, InterfaceC2653i interfaceC2653i, InterfaceC0289e0 interfaceC0289e0, a4.c cVar) {
        super(2, cVar);
        this.f3367l = c2451c;
        this.f3368m = f;
        this.f3369n = z3;
        this.f3370o = interfaceC2653i;
        this.f3371p = interfaceC0289e0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C0240k(this.f3367l, this.f3368m, this.f3369n, this.f3370o, this.f3371p, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0240k) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r8.e(r7, r1) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (N.b.a(r8, r6, r1, r2, r7) == r0) goto L19;
     */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f3366k;
        InterfaceC2653i interfaceC2653i = this.f3370o;
        InterfaceC0289e0 interfaceC0289e0 = this.f3371p;
        if (i == 0) {
            G4.l.N(obj);
            C2451c c2451c = this.f3367l;
            float f = ((W0.f) c2451c.f19764e.getValue()).f6006k;
            float f5 = this.f3368m;
            if (!W0.f.a(f, f5)) {
                if (this.f3369n) {
                    InterfaceC2653i interfaceC2653i2 = (InterfaceC2653i) interfaceC0289e0.getValue();
                    this.f3366k = 2;
                } else {
                    W0.f fVar = new W0.f(f5);
                    this.f3366k = 1;
                }
            }
            return W3.o.f6046a;
        }
        if (i != 1 && i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        G4.l.N(obj);
        interfaceC0289e0.setValue(interfaceC2653i);
        return W3.o.f6046a;
    }
}
