package x;

import A0.C0019d0;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import u.AbstractC2453d;

/* renamed from: x.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2569a0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20734k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f20735l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2604s0 f20736m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f20737n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.t f20738o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2569a0(C2604s0 c2604s0, long j5, kotlin.jvm.internal.t tVar, a4.c cVar) {
        super(2, cVar);
        this.f20736m = c2604s0;
        this.f20737n = j5;
        this.f20738o = tVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2569a0 c2569a0 = new C2569a0(this.f20736m, this.f20737n, this.f20738o, cVar);
        c2569a0.f20735l = obj;
        return c2569a0;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2569a0) create((C2599p0) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20734k;
        if (i == 0) {
            G4.l.N(obj);
            C2599p0 c2599p0 = (C2599p0) this.f20735l;
            C2604s0 c2604s0 = this.f20736m;
            float f = c2604s0.f(this.f20737n);
            C0019d0 c0019d0 = new C0019d0(this.f20738o, c2604s0, c2599p0, 7);
            this.f20734k = 1;
            if (AbstractC2453d.c(0.0f, f, null, c0019d0, this, 12) == enumC0510a) {
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
