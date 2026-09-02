package F;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final H1.d f471a = H1.e.a();

    /* renamed from: b, reason: collision with root package name */
    public final C.j f472b = new C.j(4);

    /* renamed from: c, reason: collision with root package name */
    public final C.j f473c = new C.j(new F.i0(2, null));

    public j0(java.lang.String str) {
    }

    public final java.lang.Integer a() {
        return new java.lang.Integer(((java.util.concurrent.atomic.AtomicInteger) this.f472b.f88b).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(s1.l lVar, m1.AbstractC0931b abstractC0931b) {
        F.g0 g0Var;
        l1.EnumC0927a enumC0927a;
        int i2;
        H1.d dVar;
        java.lang.Throwable th;
        H1.a aVar;
        java.lang.Object invoke;
        try {
            if (abstractC0931b instanceof F.g0) {
                g0Var = (F.g0) abstractC0931b;
                int i3 = g0Var.f455h;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    g0Var.f455h = i3 - Integer.MIN_VALUE;
                    java.lang.Object obj = g0Var.f453f;
                    enumC0927a = l1.EnumC0927a.f8017a;
                    i2 = g0Var.f455h;
                    if (i2 != 0) {
                        a.AbstractC0059a.A(obj);
                        g0Var.f451d = lVar;
                        dVar = this.f471a;
                        g0Var.f452e = dVar;
                        g0Var.f455h = 1;
                        if (dVar.c(g0Var) == enumC0927a) {
                            return enumC0927a;
                        }
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar = (H1.a) g0Var.f451d;
                            try {
                                a.AbstractC0059a.A(obj);
                                ((H1.d) aVar).e(null);
                                return obj;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                ((H1.d) aVar).e(null);
                                throw th;
                            }
                        }
                        H1.d dVar2 = g0Var.f452e;
                        s1.l lVar2 = (s1.l) g0Var.f451d;
                        a.AbstractC0059a.A(obj);
                        dVar = dVar2;
                        lVar = lVar2;
                    }
                    g0Var.f451d = dVar;
                    g0Var.f452e = null;
                    g0Var.f455h = 2;
                    invoke = lVar.invoke(g0Var);
                    if (invoke != enumC0927a) {
                        return enumC0927a;
                    }
                    H1.d dVar3 = dVar;
                    obj = invoke;
                    aVar = dVar3;
                    ((H1.d) aVar).e(null);
                    return obj;
                }
            }
            g0Var.f451d = dVar;
            g0Var.f452e = null;
            g0Var.f455h = 2;
            invoke = lVar.invoke(g0Var);
            if (invoke != enumC0927a) {
            }
        } catch (java.lang.Throwable th3) {
            H1.d dVar4 = dVar;
            th = th3;
            aVar = dVar4;
            ((H1.d) aVar).e(null);
            throw th;
        }
        g0Var = new F.g0(this, abstractC0931b);
        java.lang.Object obj2 = g0Var.f453f;
        enumC0927a = l1.EnumC0927a.f8017a;
        i2 = g0Var.f455h;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(s1.p pVar, m1.AbstractC0931b abstractC0931b) {
        F.h0 h0Var;
        int i2;
        H1.d dVar;
        java.lang.Throwable th;
        boolean z2;
        if (abstractC0931b instanceof F.h0) {
            h0Var = (F.h0) abstractC0931b;
            int i3 = h0Var.f466h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h0Var.f466h = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = h0Var.f464f;
                java.lang.Object obj2 = l1.EnumC0927a.f8017a;
                i2 = h0Var.f466h;
                if (i2 != 0) {
                    a.AbstractC0059a.A(obj);
                    H1.d dVar2 = this.f471a;
                    boolean d2 = dVar2.d(null);
                    try {
                        java.lang.Object valueOf = java.lang.Boolean.valueOf(d2);
                        h0Var.f462d = dVar2;
                        h0Var.f463e = d2;
                        h0Var.f466h = 1;
                        java.lang.Object invoke = pVar.invoke(valueOf, h0Var);
                        if (invoke == obj2) {
                            return obj2;
                        }
                        dVar = dVar2;
                        obj = invoke;
                        z2 = d2;
                    } catch (java.lang.Throwable th2) {
                        dVar = dVar2;
                        th = th2;
                        z2 = d2;
                        if (z2) {
                            dVar.e(null);
                        }
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z2 = h0Var.f463e;
                    dVar = h0Var.f462d;
                    try {
                        a.AbstractC0059a.A(obj);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        if (z2) {
                        }
                        throw th;
                    }
                }
                if (z2) {
                    dVar.e(null);
                }
                return obj;
            }
        }
        h0Var = new F.h0(this, abstractC0931b);
        java.lang.Object obj3 = h0Var.f464f;
        java.lang.Object obj22 = l1.EnumC0927a.f8017a;
        i2 = h0Var.f466h;
        if (i2 != 0) {
        }
        if (z2) {
        }
        return obj3;
    }
}
