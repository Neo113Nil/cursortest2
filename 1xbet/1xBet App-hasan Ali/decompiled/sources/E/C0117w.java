package E;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import h0.C1989c;
import p4.InterfaceC2280u;

/* renamed from: E.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117w extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f1357k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C.c f1358l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P0.w f1359m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f1360n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ F0 f1361o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ P0.q f1362p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0117w(C.c cVar, P0.w wVar, Z z3, F0 f02, P0.q qVar, a4.c cVar2) {
        super(2, cVar2);
        this.f1358l = cVar;
        this.f1359m = wVar;
        this.f1360n = z3;
        this.f1361o = f02;
        this.f1362p = qVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C0117w(this.f1358l, this.f1359m, this.f1360n, this.f1361o, this.f1362p, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0117w) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        long a5;
        C1989c c1989c;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f1357k;
        W3.o oVar = W3.o.f6046a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            return oVar;
        }
        G4.l.N(obj);
        C0102h0 c0102h0 = this.f1360n.f1088a;
        K0.L l5 = this.f1361o.f1029a;
        this.f1357k = 1;
        int b3 = this.f1362p.b(K0.N.d(this.f1359m.f4680b));
        if (b3 < l5.f2792a.f2784a.f2829l.length()) {
            c1989c = l5.b(b3);
        } else if (b3 != 0) {
            c1989c = l5.b(b3 - 1);
        } else {
            a5 = n0.a(c0102h0.f1194b, c0102h0.f1198g, c0102h0.f1199h, n0.f1241a, 1);
            c1989c = new C1989c(0.0f, 0.0f, 1.0f, (int) (a5 & 4294967295L));
        }
        Object a6 = this.f1358l.a(c1989c, this);
        if (a6 != enumC0510a) {
            a6 = oVar;
        }
        return a6 == enumC0510a ? enumC0510a : oVar;
    }
}
