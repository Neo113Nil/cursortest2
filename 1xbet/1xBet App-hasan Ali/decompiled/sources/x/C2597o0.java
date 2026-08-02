package x;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.AbstractC2282w;

/* renamed from: x.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2597o0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public C2604s0 f20838k;

    /* renamed from: l, reason: collision with root package name */
    public kotlin.jvm.internal.v f20839l;

    /* renamed from: m, reason: collision with root package name */
    public long f20840m;

    /* renamed from: n, reason: collision with root package name */
    public int f20841n;

    /* renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f20842o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C2604s0 f20843p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f20844q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f20845r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2597o0(C2604s0 c2604s0, kotlin.jvm.internal.v vVar, long j5, a4.c cVar) {
        super(2, cVar);
        this.f20843p = c2604s0;
        this.f20844q = vVar;
        this.f20845r = j5;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2597o0 c2597o0 = new C2597o0(this.f20843p, this.f20844q, this.f20845r, cVar);
        c2597o0.f20842o = obj;
        return c2597o0;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2597o0) create((C2599p0) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        C2604s0 c2604s0;
        kotlin.jvm.internal.v vVar;
        long j5;
        C2604s0 c2604s02;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20841n;
        P p5 = P.f20696l;
        if (i == 0) {
            G4.l.N(obj);
            C2599p0 c2599p0 = (C2599p0) this.f20842o;
            c2604s0 = this.f20843p;
            C2595n0 c2595n0 = new C2595n0(c2604s0, c2599p0);
            C2592m c2592m = c2604s0.f20865c;
            vVar = this.f20844q;
            long j6 = vVar.f17623k;
            P p6 = c2604s0.f20866d;
            long j7 = this.f20845r;
            float c5 = c2604s0.c(p6 == p5 ? W0.q.b(j7) : W0.q.c(j7));
            this.f20842o = c2604s0;
            this.f20838k = c2604s0;
            this.f20839l = vVar;
            this.f20840m = j6;
            this.f20841n = 1;
            c2592m.getClass();
            obj = AbstractC2282w.w(c2592m.f20823b, new C2590l(c5, c2592m, c2595n0, null), this);
            if (obj == enumC0510a) {
                return enumC0510a;
            }
            j5 = j6;
            c2604s02 = c2604s0;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j5 = this.f20840m;
            vVar = this.f20839l;
            c2604s0 = this.f20838k;
            c2604s02 = (C2604s0) this.f20842o;
            G4.l.N(obj);
        }
        float c6 = c2604s02.c(((Number) obj).floatValue());
        vVar.f17623k = c2604s0.f20866d == p5 ? W0.q.a(j5, c6, 0.0f, 2) : W0.q.a(j5, 0.0f, c6, 1);
        return W3.o.f6046a;
    }
}
