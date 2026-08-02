package u;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import java.util.concurrent.CancellationException;

/* renamed from: u.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2447a extends AbstractC0548i implements i4.c {

    /* renamed from: k, reason: collision with root package name */
    public C2465l f19740k;

    /* renamed from: l, reason: collision with root package name */
    public kotlin.jvm.internal.s f19741l;

    /* renamed from: m, reason: collision with root package name */
    public int f19742m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2451c f19743n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f19744o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m0 f19745p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f19746q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i4.c f19747r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2447a(C2451c c2451c, Object obj, m0 m0Var, long j5, i4.c cVar, a4.c cVar2) {
        super(1, cVar2);
        this.f19743n = c2451c;
        this.f19744o = obj;
        this.f19745p = m0Var;
        this.f19746q = j5;
        this.f19747r = cVar;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        return ((C2447a) create((a4.c) obj)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(a4.c cVar) {
        return new C2447a(this.f19743n, this.f19744o, this.f19745p, this.f19746q, this.f19747r, cVar);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.s sVar;
        C2465l c2465l;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19742m;
        int i5 = 1;
        C2451c c2451c = this.f19743n;
        try {
            if (i == 0) {
                G4.l.N(obj);
                c2451c.f19762c.f19847m = (AbstractC2470q) c2451c.f19760a.f19643a.c(this.f19744o);
                m0 m0Var = this.f19745p;
                c2451c.f19764e.setValue(m0Var.f19876c);
                c2451c.f19763d.setValue(Boolean.TRUE);
                C2465l c2465l2 = c2451c.f19762c;
                C2465l c2465l3 = new C2465l(c2465l2.f19845k, c2465l2.f19846l.getValue(), AbstractC2453d.g(c2465l2.f19847m), c2465l2.f19848n, Long.MIN_VALUE, c2465l2.f19850p);
                kotlin.jvm.internal.s sVar2 = new kotlin.jvm.internal.s();
                long j5 = this.f19746q;
                B.t tVar = new B.t(c2451c, c2465l3, this.f19747r, sVar2, 3);
                this.f19740k = c2465l3;
                this.f19741l = sVar2;
                this.f19742m = 1;
                if (AbstractC2453d.b(c2465l3, m0Var, j5, tVar, this) == enumC0510a) {
                    return enumC0510a;
                }
                sVar = sVar2;
                c2465l = c2465l3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = this.f19741l;
                c2465l = this.f19740k;
                G4.l.N(obj);
            }
            if (!sVar.f17620k) {
                i5 = 2;
            }
            C2451c.b(c2451c);
            return new C2.h(i5, 13, c2465l);
        } catch (CancellationException e3) {
            C2451c.b(c2451c);
            throw e3;
        }
    }
}
