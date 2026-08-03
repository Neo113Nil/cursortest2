package B1;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final B1.i f45a = new B1.i();

    public static B1.c a(int i2, int i3, int i4) {
        B1.c nVar;
        if ((i4 & 2) != 0) {
            i3 = 1;
        }
        if (i2 != -2) {
            if (i2 == -1) {
                if (i3 == 1) {
                    return new B1.n(1, 2, null);
                }
                throw new java.lang.IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i2 != 0) {
                return i2 != Integer.MAX_VALUE ? i3 == 1 ? new B1.c(i2, null) : new B1.n(i2, i3, null) : new B1.c(Integer.MAX_VALUE, null);
            }
            nVar = i3 == 1 ? new B1.c(0, null) : new B1.n(1, i3, null);
        } else if (i3 == 1) {
            B1.g.f43M.getClass();
            nVar = new B1.c(B1.f.f42b, null);
        } else {
            nVar = new B1.n(1, i3, null);
        }
        return nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v5, types: [s1.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object b(B1.r rVar, H.b bVar, m1.AbstractC0931b abstractC0931b) {
        B1.o oVar;
        int i2;
        try {
            if (abstractC0931b instanceof B1.o) {
                oVar = (B1.o) abstractC0931b;
                int i3 = oVar.f52f;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    oVar.f52f = i3 - Integer.MIN_VALUE;
                    java.lang.Object obj = oVar.f51e;
                    l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
                    i2 = oVar.f52f;
                    if (i2 != 0) {
                        a.AbstractC0059a.A(obj);
                        k1.i iVar = oVar.f8076b;
                        kotlin.jvm.internal.i.b(iVar);
                        if (iVar.m(z1.C1066t.f8592b) != rVar) {
                            throw new java.lang.IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        oVar.f50d = bVar;
                        oVar.f52f = 1;
                        z1.C1053f c1053f = new z1.C1053f(1, u0.AbstractC0995a.o(oVar));
                        c1053f.u();
                        ((B1.q) rVar).W(new B1.p(0, c1053f));
                        bVar = bVar;
                        if (c1053f.t() == enumC0927a) {
                            return enumC0927a;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r5 = oVar.f50d;
                        a.AbstractC0059a.A(obj);
                        bVar = r5;
                    }
                    bVar.invoke();
                    return h1.C0177i.f3302a;
                }
            }
            if (i2 != 0) {
            }
            bVar.invoke();
            return h1.C0177i.f3302a;
        } catch (java.lang.Throwable th) {
            bVar.invoke();
            throw th;
        }
        oVar = new B1.o(abstractC0931b);
        java.lang.Object obj2 = oVar.f51e;
        l1.EnumC0927a enumC0927a2 = l1.EnumC0927a.f8017a;
        i2 = oVar.f52f;
    }
}
