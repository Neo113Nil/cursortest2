package v;

import b4.EnumC0510a;
import c4.AbstractC0548i;

/* renamed from: v.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2517l extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20263k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f20264l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2518m f20265m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2517l(C2518m c2518m, a4.c cVar) {
        super(2, cVar);
        this.f20265m = c2518m;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2517l c2517l = new C2517l(this.f20265m, cVar);
        c2517l.f20264l = obj;
        return c2517l;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2517l) create((t0.v) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20263k;
        if (i == 0) {
            G4.l.N(obj);
            t0.v vVar = (t0.v) this.f20264l;
            C2516k c2516k = new C2516k(this.f20265m, null);
            this.f20263k = 1;
            if (r.b(vVar, c2516k, this) == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
        }
        return W3.o.f6046a;
    }
}
