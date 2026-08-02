package L;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import z0.AbstractC2749f;

/* renamed from: L.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0215c extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f2923k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f2924l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0216d f2925m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y.l f2926n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0215c(p pVar, C0216d c0216d, y.l lVar, a4.c cVar) {
        super(2, cVar);
        this.f2924l = pVar;
        this.f2925m = c0216d;
        this.f2926n = lVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C0215c(this.f2924l, this.f2925m, this.f2926n, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0215c) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f2923k;
        y.l lVar = this.f2926n;
        C0216d c0216d = this.f2925m;
        try {
            if (i == 0) {
                G4.l.N(obj);
                p pVar = this.f2924l;
                this.f2923k = 1;
                if (pVar.a(this) == enumC0510a) {
                    return enumC0510a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                G4.l.N(obj);
            }
            c0216d.f2927I.k(lVar);
            AbstractC2749f.m(c0216d);
            return W3.o.f6046a;
        } catch (Throwable th) {
            c0216d.f2927I.k(lVar);
            AbstractC2749f.m(c0216d);
            throw th;
        }
    }
}
