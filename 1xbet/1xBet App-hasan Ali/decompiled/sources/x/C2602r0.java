package x;

import b4.EnumC0510a;
import c4.AbstractC0548i;

/* renamed from: x.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2602r0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20858k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f20859l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2604s0 f20860m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC0548i f20861n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2602r0(C2604s0 c2604s0, i4.e eVar, a4.c cVar) {
        super(2, cVar);
        this.f20860m = c2604s0;
        this.f20861n = (AbstractC0548i) eVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [c4.i, i4.e] */
    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2602r0 c2602r0 = new C2602r0(this.f20860m, this.f20861n, cVar);
        c2602r0.f20859l = obj;
        return c2602r0;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2602r0) create((U) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [c4.i, i4.e] */
    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20858k;
        if (i == 0) {
            G4.l.N(obj);
            U u5 = (U) this.f20859l;
            C2604s0 c2604s0 = this.f20860m;
            c2604s0.f20869h = u5;
            this.f20858k = 1;
            if (this.f20861n.invoke(c2604s0.i, this) == enumC0510a) {
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
