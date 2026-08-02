package v;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import h0.C1988b;
import p4.AbstractC2282w;
import y.C2654j;

/* renamed from: v.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2530z extends AbstractC0548i implements i4.f {

    /* renamed from: k, reason: collision with root package name */
    public int f20331k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ x.T f20332l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ long f20333m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2503A f20334n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2530z(C2503A c2503a, a4.c cVar) {
        super(3, cVar);
        this.f20334n = c2503a;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        long j5 = ((C1988b) obj2).f17191a;
        C2530z c2530z = new C2530z(this.f20334n, (a4.c) obj3);
        c2530z.f20332l = (x.T) obj;
        c2530z.f20333m = j5;
        return c2530z.invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20331k;
        W3.o oVar = W3.o.f6046a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            return oVar;
        }
        G4.l.N(obj);
        x.T t5 = this.f20332l;
        long j5 = this.f20333m;
        C2503A c2503a = this.f20334n;
        if (c2503a.f20125E) {
            this.f20331k = 1;
            C2654j c2654j = c2503a.f20121A;
            if (c2654j == null || (obj2 = AbstractC2282w.e(new C2509d(t5, j5, c2654j, c2503a, null), this)) != enumC0510a) {
                obj2 = oVar;
            }
            if (obj2 == enumC0510a) {
                return enumC0510a;
            }
        }
        return oVar;
    }
}
