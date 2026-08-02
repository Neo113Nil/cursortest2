package x;

import b4.EnumC0510a;
import c4.AbstractC0548i;

/* renamed from: x.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2594n extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20828k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f20829l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2600q f20830m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i4.e f20831n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2594n(C2600q c2600q, i4.e eVar, a4.c cVar) {
        super(2, cVar);
        this.f20830m = c2600q;
        this.f20831n = eVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2594n c2594n = new C2594n(this.f20830m, this.f20831n, cVar);
        c2594n.f20829l = obj;
        return c2594n;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2594n) create((U) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20828k;
        C2600q c2600q = this.f20830m;
        try {
            if (i == 0) {
                G4.l.N(obj);
                U u5 = (U) this.f20829l;
                c2600q.f20851d.setValue(Boolean.TRUE);
                i4.e eVar = this.f20831n;
                this.f20828k = 1;
                if (eVar.invoke(u5, this) == enumC0510a) {
                    return enumC0510a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                G4.l.N(obj);
            }
            c2600q.f20851d.setValue(Boolean.FALSE);
            return W3.o.f6046a;
        } catch (Throwable th) {
            c2600q.f20851d.setValue(Boolean.FALSE);
            throw th;
        }
    }
}
