package x;

import b4.EnumC0510a;
import c4.AbstractC0548i;

/* renamed from: x.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2573c0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20746k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f20747l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2564J f20748m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2604s0 f20749n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2573c0(C2564J c2564j, C2604s0 c2604s0, a4.c cVar) {
        super(2, cVar);
        this.f20748m = c2564j;
        this.f20749n = c2604s0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2573c0 c2573c0 = new C2573c0(this.f20748m, this.f20749n, cVar);
        c2573c0.f20747l = obj;
        return c2573c0;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2573c0) create((C2599p0) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20746k;
        if (i == 0) {
            G4.l.N(obj);
            i0.K k5 = new i0.K(14, (C2599p0) this.f20747l, this.f20749n);
            this.f20746k = 1;
            if (this.f20748m.invoke(k5, this) == enumC0510a) {
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
