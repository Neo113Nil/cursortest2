package u;

import P.AbstractC0329z;
import P.C0297i0;
import b4.EnumC0510a;
import c4.AbstractC0548i;
import k4.AbstractC2036a;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class T extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public x4.c f19707k;

    /* renamed from: l, reason: collision with root package name */
    public C2452c0 f19708l;

    /* renamed from: m, reason: collision with root package name */
    public int f19709m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2452c0 f19710n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f19711o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ t0 f19712p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(a4.c cVar, Object obj, C2452c0 c2452c0, t0 t0Var) {
        super(2, cVar);
        this.f19710n = c2452c0;
        this.f19711o = obj;
        this.f19712p = t0Var;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new T(cVar, this.f19711o, this.f19710n, this.f19712p);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((T) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0175, code lost:
    
        if (u.C2452c0.p(r15, r24) == r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0168, code lost:
    
        if (u.C2452c0.o(r15, r24) == r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b7, code lost:
    
        if (u.C2452c0.q(r15, r24) == r0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ad, code lost:
    
        if (r2 == r0) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c7  */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        x4.c cVar;
        C2452c0 c2452c0;
        C2446Q c2446q;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19709m;
        W3.o oVar = W3.o.f6046a;
        Object obj2 = this.f19711o;
        C2452c0 c2452c02 = this.f19710n;
        try {
            if (i == 0) {
                G4.l.N(obj);
                Object value = c2452c02.f19770b.getValue();
                if (!obj2.equals(value)) {
                    C2452c0.m(c2452c02);
                    c2452c02.v(0.0f);
                    t0 t0Var = this.f19712p;
                    t0Var.q(obj2);
                    t0Var.o(0L);
                    c2452c02.h(value);
                    c2452c02.f19770b.setValue(obj2);
                }
                cVar = c2452c02.f19776j;
                this.f19707k = cVar;
                this.f19708l = c2452c02;
                this.f19709m = 1;
                if (cVar.c(this) != enumC0510a) {
                    c2452c0 = c2452c02;
                }
                return enumC0510a;
            }
            if (i == 1) {
                c2452c0 = this.f19708l;
                cVar = this.f19707k;
                G4.l.N(obj);
            } else if (i == 2) {
                G4.l.N(obj);
                this.f19709m = 3;
            } else {
                if (i == 3) {
                    G4.l.N(obj);
                    if (!kotlin.jvm.internal.l.a(c2452c02.f19771c.getValue(), obj2)) {
                        C0297i0 c0297i0 = c2452c02.f19775h;
                        if (c0297i0.h() < 1.0f && ((c2446q = c2452c02.f19780n) == null || !kotlin.jvm.internal.l.a(null, c2446q.f19699b))) {
                            E0 e02 = c2446q != null ? c2446q.f19699b : null;
                            C2466m c2466m = C2452c0.f19769s;
                            C2466m c2466m2 = C2452c0.f19768r;
                            if (e02 != null) {
                                long j5 = c2446q.f19698a;
                                C2466m c2466m3 = c2446q.f;
                                c2466m2 = (C2466m) e02.p(j5, c2446q.f19702e, c2466m, c2466m3 == null ? c2466m2 : c2466m3);
                            } else if (c2446q != null && c2446q.f19698a != 0) {
                                long j6 = c2446q.f19703g;
                                if (j6 == Long.MIN_VALUE) {
                                    j6 = c2452c02.f;
                                }
                                float f = j6 / 1.0E9f;
                                if (f > 0.0f) {
                                    c2466m2 = new C2466m(1.0f / f);
                                }
                            }
                            if (c2446q == null) {
                                c2446q = new C2446Q();
                            }
                            c2446q.f19699b = null;
                            c2446q.f19700c = false;
                            c2446q.f19701d = c0297i0.h();
                            c2446q.f19702e.e(0, c0297i0.h());
                            long j7 = c2452c02.f;
                            c2446q.f19703g = j7;
                            c2446q.f19698a = 0L;
                            c2446q.f = c2466m2;
                            c2446q.f19704h = AbstractC2036a.V((1.0d - c0297i0.h()) * j7);
                            c2452c02.f19780n = c2446q;
                        }
                        this.f19707k = null;
                        this.f19708l = null;
                        this.f19709m = 4;
                    }
                    return oVar;
                }
                if (i != 4) {
                    if (i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    G4.l.N(obj);
                    c2452c02.v(0.0f);
                    return oVar;
                }
                G4.l.N(obj);
                c2452c02.h(obj2);
                this.f19709m = 5;
            }
            Object obj3 = c2452c0.f19772d;
            cVar.d(null);
            if (!obj2.equals(obj3)) {
                this.f19707k = null;
                this.f19708l = null;
                this.f19709m = 2;
                if (c2452c02.f19778l != Long.MIN_VALUE ? (r2 = c2452c02.r(this)) != enumC0510a : (r2 = AbstractC0329z.q(getContext()).n(c2452c02.f19781o, this)) != enumC0510a) {
                    Object r5 = oVar;
                }
            }
            if (!kotlin.jvm.internal.l.a(c2452c02.f19771c.getValue(), obj2)) {
            }
            return oVar;
        } catch (Throwable th) {
            cVar.d(null);
            throw th;
        }
    }
}
