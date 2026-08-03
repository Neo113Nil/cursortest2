package C1;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final C.j f177a;

    /* renamed from: b, reason: collision with root package name */
    public static final C.j f178b;

    static {
        int i2 = 3;
        f177a = new C.j(i2, "NONE");
        f178b = new C.j(i2, "PENDING");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object a(C1.u uVar, F.C0018s c0018s, java.lang.Throwable th, m1.AbstractC0931b abstractC0931b) {
        C1.g gVar;
        int i2;
        try {
            if (abstractC0931b instanceof C1.g) {
                gVar = (C1.g) abstractC0931b;
                int i3 = gVar.f129f;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    gVar.f129f = i3 - Integer.MIN_VALUE;
                    java.lang.Object obj = gVar.f128e;
                    java.lang.Object obj2 = l1.EnumC0927a.f8017a;
                    i2 = gVar.f129f;
                    if (i2 != 0) {
                        a.AbstractC0059a.A(obj);
                        gVar.f127d = th;
                        gVar.f129f = 1;
                        if (c0018s.i(uVar, th, gVar) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = gVar.f127d;
                        a.AbstractC0059a.A(obj);
                    }
                    return h1.C0177i.f3302a;
                }
            }
            if (i2 != 0) {
            }
            return h1.C0177i.f3302a;
        } catch (java.lang.Throwable th2) {
            if (th != null && th != th2) {
                Q1.d.b(th2, th);
            }
            throw th2;
        }
        gVar = new C1.g(abstractC0931b);
        java.lang.Object obj3 = gVar.f128e;
        java.lang.Object obj22 = l1.EnumC0927a.f8017a;
        i2 = gVar.f129f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005e, B:19:0x0072, B:21:0x007a, B:23:0x0080, B:25:0x0086, B:28:0x0097, B:29:0x009f, B:30:0x00a0, B:31:0x00a7, B:39:0x0049, B:42:0x0054), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v4, types: [B1.s] */
    /* JADX WARN: Type inference failed for: r9v6, types: [B1.s] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0094 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object b(C1.e eVar, B1.q qVar, boolean z2, m1.AbstractC0931b abstractC0931b) {
        C1.f fVar;
        int i2;
        B1.b bVar;
        B1.q qVar2;
        B1.b bVar2;
        C1.e eVar2;
        B1.q qVar3;
        try {
            if (abstractC0931b instanceof C1.f) {
                fVar = (C1.f) abstractC0931b;
                int i3 = fVar.f126i;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    fVar.f126i = i3 - Integer.MIN_VALUE;
                    java.lang.Object obj = fVar.f125h;
                    l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
                    i2 = fVar.f126i;
                    if (i2 != 0) {
                        a.AbstractC0059a.A(obj);
                        if (eVar instanceof C1.u) {
                            throw ((C1.u) eVar).f180a;
                        }
                        B1.c cVar = qVar.f55d;
                        cVar.getClass();
                        bVar = new B1.b(cVar);
                        qVar3 = qVar;
                        fVar.f121d = eVar;
                        fVar.f122e = qVar3;
                        fVar.f123f = bVar;
                        fVar.f124g = z2;
                        fVar.f126i = 1;
                        obj = bVar.b(fVar);
                        if (obj == enumC0927a) {
                        }
                    } else if (i2 == 1) {
                        z2 = fVar.f124g;
                        bVar2 = fVar.f123f;
                        ?? r9 = fVar.f122e;
                        eVar2 = fVar.f121d;
                        a.AbstractC0059a.A(obj);
                        qVar2 = r9;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z2 = fVar.f124g;
                        bVar2 = fVar.f123f;
                        ?? r92 = fVar.f122e;
                        eVar2 = fVar.f121d;
                        a.AbstractC0059a.A(obj);
                        B1.q qVar4 = r92;
                        C1.e eVar3 = eVar2;
                        bVar = bVar2;
                        eVar = eVar3;
                        qVar3 = qVar4;
                        fVar.f121d = eVar;
                        fVar.f122e = qVar3;
                        fVar.f123f = bVar;
                        fVar.f124g = z2;
                        fVar.f126i = 1;
                        obj = bVar.b(fVar);
                        if (obj == enumC0927a) {
                            return enumC0927a;
                        }
                        B1.b bVar3 = bVar;
                        eVar2 = eVar;
                        bVar2 = bVar3;
                        qVar2 = qVar3;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            if (z2) {
                                qVar2.a(null);
                            }
                            return h1.C0177i.f3302a;
                        }
                        java.lang.Object obj2 = bVar2.f7a;
                        C.j jVar = B1.e.f37p;
                        if (obj2 == jVar) {
                            throw new java.lang.IllegalStateException("`hasNext()` has not been invoked");
                        }
                        bVar2.f7a = jVar;
                        if (obj2 == B1.e.f33l) {
                            java.lang.Throwable n2 = bVar2.f9c.n();
                            int i4 = E1.v.f304a;
                            throw n2;
                        }
                        fVar.f121d = eVar2;
                        fVar.f122e = qVar2;
                        fVar.f123f = bVar2;
                        fVar.f124g = z2;
                        fVar.f126i = 2;
                        qVar4 = qVar2;
                        if (eVar2.a(obj2, fVar) == enumC0927a) {
                            return enumC0927a;
                        }
                        C1.e eVar32 = eVar2;
                        bVar = bVar2;
                        eVar = eVar32;
                        qVar3 = qVar4;
                        fVar.f121d = eVar;
                        fVar.f122e = qVar3;
                        fVar.f123f = bVar;
                        fVar.f124g = z2;
                        fVar.f126i = 1;
                        obj = bVar.b(fVar);
                        if (obj == enumC0927a) {
                        }
                    }
                }
            }
            if (i2 != 0) {
            }
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                if (z2) {
                    java.util.concurrent.CancellationException cancellationException = th instanceof java.util.concurrent.CancellationException ? th : null;
                    if (cancellationException == null) {
                        cancellationException = new java.util.concurrent.CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th);
                    }
                    qVar.a(cancellationException);
                }
                throw th2;
            }
        }
        fVar = new C1.f(abstractC0931b);
        java.lang.Object obj3 = fVar.f125h;
        l1.EnumC0927a enumC0927a2 = l1.EnumC0927a.f8017a;
        i2 = fVar.f126i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object c(C1.d dVar, m1.AbstractC0931b abstractC0931b) {
        C1.p pVar;
        int i2;
        kotlin.jvm.internal.p pVar2;
        D1.a e2;
        C1.o oVar;
        if (abstractC0931b instanceof C1.p) {
            pVar = (C1.p) abstractC0931b;
            int i3 = pVar.f166g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pVar.f166g = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = pVar.f165f;
                java.lang.Object obj2 = l1.EnumC0927a.f8017a;
                i2 = pVar.f166g;
                if (i2 != 0) {
                    a.AbstractC0059a.A(obj);
                    kotlin.jvm.internal.p pVar3 = new kotlin.jvm.internal.p();
                    C1.o oVar2 = new C1.o(0, pVar3);
                    try {
                        pVar.f163d = pVar3;
                        pVar.f164e = oVar2;
                        pVar.f166g = 1;
                        if (dVar.o(oVar2, pVar) == obj2) {
                            return obj2;
                        }
                        pVar2 = pVar3;
                    } catch (D1.a e3) {
                        pVar2 = pVar3;
                        e2 = e3;
                        oVar = oVar2;
                        if (e2.f219a != oVar) {
                            throw e2;
                        }
                        return pVar2.f7960a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = pVar.f164e;
                    pVar2 = pVar.f163d;
                    try {
                        a.AbstractC0059a.A(obj);
                    } catch (D1.a e4) {
                        e2 = e4;
                        if (e2.f219a != oVar) {
                        }
                        return pVar2.f7960a;
                    }
                }
                return pVar2.f7960a;
            }
        }
        pVar = new C1.p(abstractC0931b);
        java.lang.Object obj3 = pVar.f165f;
        java.lang.Object obj22 = l1.EnumC0927a.f8017a;
        i2 = pVar.f166g;
        if (i2 != 0) {
        }
        return pVar2.f7960a;
    }
}
