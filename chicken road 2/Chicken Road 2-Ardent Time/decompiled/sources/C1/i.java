package C1;

/* loaded from: classes.dex */
public final class i implements C1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C.j f135a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F.C0018s f136b;

    public i(C.j jVar, F.C0018s c0018s) {
        this.f135a = jVar;
        this.f136b = c0018s;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // C1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object o(C1.e eVar, k1.d dVar) {
        C1.h hVar;
        l1.EnumC0927a enumC0927a;
        int i2;
        C1.i iVar;
        C1.u uVar;
        F.C0018s c0018s;
        D1.n nVar;
        java.lang.Throwable th;
        D1.n nVar2;
        F.C0018s c0018s2;
        try {
            if (dVar instanceof C1.h) {
                hVar = (C1.h) dVar;
                int i3 = hVar.f131e;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    hVar.f131e = i3 - Integer.MIN_VALUE;
                    java.lang.Object obj = hVar.f130d;
                    enumC0927a = l1.EnumC0927a.f8017a;
                    i2 = hVar.f131e;
                    if (i2 != 0) {
                        a.AbstractC0059a.A(obj);
                        try {
                            C.j jVar = this.f135a;
                            hVar.f133g = this;
                            hVar.f134h = eVar;
                            hVar.f131e = 1;
                            if (jVar.o(eVar, hVar) == enumC0927a) {
                                return enumC0927a;
                            }
                            iVar = this;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            iVar = this;
                            uVar = new C1.u(th);
                            c0018s = iVar.f136b;
                            hVar.f133g = th;
                            hVar.f134h = null;
                            hVar.f131e = 2;
                            if (C1.s.a(uVar, c0018s, th, hVar) != enumC0927a) {
                                return enumC0927a;
                            }
                            throw th;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                java.lang.Throwable th3 = (java.lang.Throwable) hVar.f133g;
                                a.AbstractC0059a.A(obj);
                                throw th3;
                            }
                            if (i2 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            nVar2 = (D1.n) hVar.f133g;
                            try {
                                a.AbstractC0059a.A(obj);
                                nVar2.h();
                                return h1.C0177i.f3302a;
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                nVar2.h();
                                throw th;
                            }
                        }
                        eVar = hVar.f134h;
                        iVar = (C1.i) hVar.f133g;
                        try {
                            a.AbstractC0059a.A(obj);
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                            uVar = new C1.u(th);
                            c0018s = iVar.f136b;
                            hVar.f133g = th;
                            hVar.f134h = null;
                            hVar.f131e = 2;
                            if (C1.s.a(uVar, c0018s, th, hVar) != enumC0927a) {
                            }
                        }
                    }
                    k1.i iVar2 = hVar.f8076b;
                    kotlin.jvm.internal.i.b(iVar2);
                    nVar = new D1.n(eVar, iVar2);
                    c0018s2 = iVar.f136b;
                    hVar.f133g = nVar;
                    hVar.f134h = null;
                    hVar.f131e = 3;
                    if (c0018s2.i(nVar, null, hVar) != enumC0927a) {
                        return enumC0927a;
                    }
                    nVar2 = nVar;
                    nVar2.h();
                    return h1.C0177i.f3302a;
                }
            }
            c0018s2 = iVar.f136b;
            hVar.f133g = nVar;
            hVar.f134h = null;
            hVar.f131e = 3;
            if (c0018s2.i(nVar, null, hVar) != enumC0927a) {
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            nVar2 = nVar;
            nVar2.h();
            throw th;
        }
        hVar = new C1.h(this, dVar);
        java.lang.Object obj2 = hVar.f130d;
        enumC0927a = l1.EnumC0927a.f8017a;
        i2 = hVar.f131e;
        if (i2 != 0) {
        }
        k1.i iVar22 = hVar.f8076b;
        kotlin.jvm.internal.i.b(iVar22);
        nVar = new D1.n(eVar, iVar22);
    }
}
