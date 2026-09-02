package f1;

/* renamed from: f1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127n implements C1.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1.e f2856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2857c;

    public /* synthetic */ C0127n(C1.e eVar, I.d dVar, int i2) {
        this.f2855a = i2;
        this.f2856b = eVar;
        this.f2857c = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018d  */
    @Override // C1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.Object obj, k1.d dVar) {
        f1.C0126m c0126m;
        int i2;
        f1.s sVar;
        int i3;
        f1.w wVar;
        int i4;
        f1.y yVar;
        int i5;
        C1.n nVar;
        int i6;
        boolean z2;
        java.lang.Object obj2;
        java.lang.Object obj3;
        f1.C0127n c0127n;
        switch (this.f2855a) {
            case 0:
                if (dVar instanceof f1.C0126m) {
                    c0126m = (f1.C0126m) dVar;
                    int i7 = c0126m.f2853e;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        c0126m.f2853e = i7 - Integer.MIN_VALUE;
                        java.lang.Object obj4 = c0126m.f2852d;
                        l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
                        i2 = c0126m.f2853e;
                        if (i2 != 0) {
                            a.AbstractC0059a.A(obj4);
                            java.lang.Object c2 = ((I.b) obj).c((I.d) this.f2857c);
                            c0126m.f2853e = 1;
                            if (this.f2856b.a(c2, c0126m) == enumC0927a) {
                                return enumC0927a;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            a.AbstractC0059a.A(obj4);
                        }
                        return h1.C0177i.f3302a;
                    }
                }
                c0126m = new f1.C0126m(this, dVar);
                java.lang.Object obj42 = c0126m.f2852d;
                l1.EnumC0927a enumC0927a2 = l1.EnumC0927a.f8017a;
                i2 = c0126m.f2853e;
                if (i2 != 0) {
                }
                return h1.C0177i.f3302a;
            case 1:
                if (dVar instanceof f1.s) {
                    sVar = (f1.s) dVar;
                    int i8 = sVar.f2875e;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        sVar.f2875e = i8 - Integer.MIN_VALUE;
                        java.lang.Object obj5 = sVar.f2874d;
                        l1.EnumC0927a enumC0927a3 = l1.EnumC0927a.f8017a;
                        i3 = sVar.f2875e;
                        if (i3 != 0) {
                            a.AbstractC0059a.A(obj5);
                            java.lang.Object c3 = ((I.b) obj).c((I.d) this.f2857c);
                            sVar.f2875e = 1;
                            if (this.f2856b.a(c3, sVar) == enumC0927a3) {
                                return enumC0927a3;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            a.AbstractC0059a.A(obj5);
                        }
                        return h1.C0177i.f3302a;
                    }
                }
                sVar = new f1.s(this, dVar);
                java.lang.Object obj52 = sVar.f2874d;
                l1.EnumC0927a enumC0927a32 = l1.EnumC0927a.f8017a;
                i3 = sVar.f2875e;
                if (i3 != 0) {
                }
                return h1.C0177i.f3302a;
            case 2:
                if (dVar instanceof f1.w) {
                    wVar = (f1.w) dVar;
                    int i9 = wVar.f2894e;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        wVar.f2894e = i9 - Integer.MIN_VALUE;
                        java.lang.Object obj6 = wVar.f2893d;
                        l1.EnumC0927a enumC0927a4 = l1.EnumC0927a.f8017a;
                        i4 = wVar.f2894e;
                        if (i4 != 0) {
                            a.AbstractC0059a.A(obj6);
                            java.lang.Object c4 = ((I.b) obj).c((I.d) this.f2857c);
                            wVar.f2894e = 1;
                            if (this.f2856b.a(c4, wVar) == enumC0927a4) {
                                return enumC0927a4;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            a.AbstractC0059a.A(obj6);
                        }
                        return h1.C0177i.f3302a;
                    }
                }
                wVar = new f1.w(this, dVar);
                java.lang.Object obj62 = wVar.f2893d;
                l1.EnumC0927a enumC0927a42 = l1.EnumC0927a.f8017a;
                i4 = wVar.f2894e;
                if (i4 != 0) {
                }
                return h1.C0177i.f3302a;
            case 3:
                if (dVar instanceof f1.y) {
                    yVar = (f1.y) dVar;
                    int i10 = yVar.f2902e;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        yVar.f2902e = i10 - Integer.MIN_VALUE;
                        java.lang.Object obj7 = yVar.f2901d;
                        l1.EnumC0927a enumC0927a5 = l1.EnumC0927a.f8017a;
                        i5 = yVar.f2902e;
                        if (i5 != 0) {
                            a.AbstractC0059a.A(obj7);
                            java.lang.Object c5 = ((I.b) obj).c((I.d) this.f2857c);
                            yVar.f2902e = 1;
                            if (this.f2856b.a(c5, yVar) == enumC0927a5) {
                                return enumC0927a5;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            a.AbstractC0059a.A(obj7);
                        }
                        return h1.C0177i.f3302a;
                    }
                }
                yVar = new f1.y(this, dVar);
                java.lang.Object obj72 = yVar.f2901d;
                l1.EnumC0927a enumC0927a52 = l1.EnumC0927a.f8017a;
                i5 = yVar.f2902e;
                if (i5 != 0) {
                }
                return h1.C0177i.f3302a;
            default:
                if (dVar instanceof C1.n) {
                    nVar = (C1.n) dVar;
                    int i11 = nVar.f158f;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        nVar.f158f = i11 - Integer.MIN_VALUE;
                        java.lang.Object obj8 = nVar.f157e;
                        l1.EnumC0927a enumC0927a6 = l1.EnumC0927a.f8017a;
                        i6 = nVar.f158f;
                        z2 = true;
                        if (i6 != 0) {
                            a.AbstractC0059a.A(obj8);
                            nVar.f156d = this;
                            nVar.f160h = obj;
                            nVar.f158f = 1;
                            java.lang.Object invoke = ((F.C0017q) this.f2857c).invoke(obj, nVar);
                            if (invoke == enumC0927a6) {
                                return enumC0927a6;
                            }
                            obj2 = invoke;
                            obj3 = obj;
                            c0127n = this;
                        } else {
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c0127n = nVar.f156d;
                                a.AbstractC0059a.A(obj8);
                                if (z2) {
                                    return h1.C0177i.f3302a;
                                }
                                throw new D1.a(c0127n);
                            }
                            java.lang.Object obj9 = nVar.f160h;
                            f1.C0127n c0127n2 = nVar.f156d;
                            a.AbstractC0059a.A(obj8);
                            obj3 = obj9;
                            c0127n = c0127n2;
                            obj2 = obj8;
                        }
                        if (((java.lang.Boolean) obj2).booleanValue()) {
                            z2 = false;
                        } else {
                            C1.e eVar = c0127n.f2856b;
                            nVar.f156d = c0127n;
                            nVar.f160h = null;
                            nVar.f158f = 2;
                            if (eVar.a(obj3, nVar) == enumC0927a6) {
                                return enumC0927a6;
                            }
                        }
                        if (z2) {
                        }
                    }
                }
                nVar = new C1.n(this, dVar);
                java.lang.Object obj82 = nVar.f157e;
                l1.EnumC0927a enumC0927a62 = l1.EnumC0927a.f8017a;
                i6 = nVar.f158f;
                z2 = true;
                if (i6 != 0) {
                }
                if (((java.lang.Boolean) obj2).booleanValue()) {
                }
                if (z2) {
                }
        }
    }

    public C0127n(F.C0017q c0017q, C1.e eVar) {
        this.f2855a = 4;
        this.f2857c = c0017q;
        this.f2856b = eVar;
    }
}
