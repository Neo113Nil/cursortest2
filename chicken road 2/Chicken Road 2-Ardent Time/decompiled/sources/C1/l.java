package C1;

/* loaded from: classes.dex */
public final class l implements C1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f149b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f150c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f151d;

    public l(C1.e eVar, I.d dVar, f1.J j2) {
        this.f150c = eVar;
        this.f149b = dVar;
        this.f151d = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    @Override // C1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.Object obj, k1.d dVar) {
        C1.k kVar;
        int i2;
        C1.l lVar;
        f1.q qVar;
        int i3;
        switch (this.f148a) {
            case 0:
                if (dVar instanceof C1.k) {
                    kVar = (C1.k) dVar;
                    int i4 = kVar.f147h;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        kVar.f147h = i4 - Integer.MIN_VALUE;
                        java.lang.Object obj2 = kVar.f145f;
                        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
                        i2 = kVar.f147h;
                        h1.C0177i c0177i = h1.C0177i.f3302a;
                        if (i2 != 0) {
                            a.AbstractC0059a.A(obj2);
                            if (((kotlin.jvm.internal.n) this.f149b).f7958a) {
                                kVar.f147h = 1;
                                if (((C1.e) this.f150c).a(obj, kVar) == enumC0927a) {
                                    return enumC0927a;
                                }
                                return c0177i;
                            }
                            kVar.f143d = this;
                            kVar.f144e = obj;
                            kVar.f147h = 2;
                            obj2 = ((F.r) this.f151d).invoke(obj, kVar);
                            if (obj2 == enumC0927a) {
                                return enumC0927a;
                            }
                            lVar = this;
                            if (!((java.lang.Boolean) obj2).booleanValue()) {
                            }
                            return c0177i;
                        }
                        if (i2 != 1) {
                            if (i2 == 2) {
                                obj = kVar.f144e;
                                lVar = kVar.f143d;
                                a.AbstractC0059a.A(obj2);
                                if (!((java.lang.Boolean) obj2).booleanValue()) {
                                    ((kotlin.jvm.internal.n) lVar.f149b).f7958a = true;
                                    kVar.f143d = null;
                                    kVar.f144e = null;
                                    kVar.f147h = 3;
                                    if (((C1.e) lVar.f150c).a(obj, kVar) == enumC0927a) {
                                        return enumC0927a;
                                    }
                                }
                                return c0177i;
                            }
                            if (i2 != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        a.AbstractC0059a.A(obj2);
                        return c0177i;
                    }
                }
                kVar = new C1.k(this, dVar);
                java.lang.Object obj22 = kVar.f145f;
                l1.EnumC0927a enumC0927a2 = l1.EnumC0927a.f8017a;
                i2 = kVar.f147h;
                h1.C0177i c0177i2 = h1.C0177i.f3302a;
                if (i2 != 0) {
                }
            case 1:
                java.lang.Object b2 = D1.l.b((k1.i) this.f149b, obj, this.f150c, (D1.t) this.f151d, dVar);
                return b2 == l1.EnumC0927a.f8017a ? b2 : h1.C0177i.f3302a;
            default:
                if (dVar instanceof f1.q) {
                    qVar = (f1.q) dVar;
                    int i5 = qVar.f2867e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        qVar.f2867e = i5 - Integer.MIN_VALUE;
                        java.lang.Object obj3 = qVar.f2866d;
                        l1.EnumC0927a enumC0927a3 = l1.EnumC0927a.f8017a;
                        i3 = qVar.f2867e;
                        if (i3 != 0) {
                            a.AbstractC0059a.A(obj3);
                            java.lang.Double d2 = (java.lang.Double) f1.K.c(((I.b) obj).c((I.d) this.f149b), ((f1.J) this.f151d).f2817c);
                            qVar.f2867e = 1;
                            if (((C1.e) this.f150c).a(d2, qVar) == enumC0927a3) {
                                return enumC0927a3;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            a.AbstractC0059a.A(obj3);
                        }
                        return h1.C0177i.f3302a;
                    }
                }
                qVar = new f1.q(this, dVar);
                java.lang.Object obj32 = qVar.f2866d;
                l1.EnumC0927a enumC0927a32 = l1.EnumC0927a.f8017a;
                i3 = qVar.f2867e;
                if (i3 != 0) {
                }
                return h1.C0177i.f3302a;
        }
    }

    public l(kotlin.jvm.internal.n nVar, C1.e eVar, F.r rVar) {
        this.f149b = nVar;
        this.f150c = eVar;
        this.f151d = rVar;
    }

    public l(C1.e eVar, k1.i iVar) {
        this.f149b = iVar;
        this.f150c = E1.AbstractC0000a.l(iVar);
        this.f151d = new D1.t(eVar, null);
    }
}
