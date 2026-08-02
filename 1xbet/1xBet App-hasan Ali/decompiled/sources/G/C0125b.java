package G;

import A0.A1;
import P.AbstractC0329z;
import P.C0283b0;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* renamed from: G.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125b extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f1713k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0129f f1714l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f1715m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0125b(C0129f c0129f, v vVar, a4.c cVar) {
        super(2, cVar);
        this.f1714l = c0129f;
        this.f1715m = vVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C0125b(this.f1714l, this.f1715m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0125b) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f1713k;
        if (i == 0) {
            G4.l.N(obj);
            C0124a c0124a = C0124a.f1709m;
            this.f1713k = 1;
            if (AbstractC0329z.q(getContext()).n(new C0283b0(c0124a, 0), this) == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                G4.l.N(obj);
                throw new D2.e();
            }
            G4.l.N(obj);
        }
        s4.u i5 = this.f1714l.i();
        if (i5 == null) {
            return W3.o.f6046a;
        }
        A1 a12 = new A1(1, this.f1715m);
        this.f1713k = 2;
        s4.B.k((s4.B) i5, a12, this);
        return enumC0510a;
    }
}
