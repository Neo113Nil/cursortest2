package x;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class A0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20595k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f20596l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t0.v f20597m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC0548i f20598n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f20599o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ T f20600p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public A0(t0.v vVar, i4.f fVar, i4.c cVar, T t5, a4.c cVar2) {
        super(2, cVar2);
        this.f20597m = vVar;
        this.f20598n = (AbstractC0548i) fVar;
        this.f20599o = (kotlin.jvm.internal.m) cVar;
        this.f20600p = t5;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [c4.i, i4.f] */
    /* JADX WARN: Type inference failed for: r3v0, types: [i4.c, kotlin.jvm.internal.m] */
    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        ?? r32 = this.f20599o;
        T t5 = this.f20600p;
        A0 a02 = new A0(this.f20597m, this.f20598n, r32, t5, cVar);
        a02.f20596l = obj;
        return a02;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((A0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [c4.i, i4.f] */
    /* JADX WARN: Type inference failed for: r6v0, types: [i4.c, kotlin.jvm.internal.m] */
    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20595k;
        if (i == 0) {
            G4.l.N(obj);
            z0 z0Var = new z0((InterfaceC2280u) this.f20596l, this.f20598n, this.f20599o, this.f20600p, null);
            this.f20595k = 1;
            if (v.r.b(this.f20597m, z0Var, this) == enumC0510a) {
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
