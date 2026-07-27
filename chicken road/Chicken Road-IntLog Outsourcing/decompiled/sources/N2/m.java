package N2;

import H4.C0070a;
import M.C0087p;
import k4.InterfaceC1218d;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class m implements G4.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G4.e f2103b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2104c;

    public /* synthetic */ m(G4.e eVar, P.d dVar, int i2) {
        this.f2102a = i2;
        this.f2103b = eVar;
        this.f2104c = dVar;
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
    @Override // G4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, InterfaceC1218d interfaceC1218d) {
        C0121l c0121l;
        int i2;
        q qVar;
        int i3;
        u uVar;
        int i6;
        w wVar;
        int i7;
        G4.n nVar;
        int i8;
        boolean z;
        Object obj2;
        Object obj3;
        m mVar;
        switch (this.f2102a) {
            case 0:
                if (interfaceC1218d instanceof C0121l) {
                    c0121l = (C0121l) interfaceC1218d;
                    int i9 = c0121l.f2100b;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        c0121l.f2100b = i9 - Integer.MIN_VALUE;
                        Object obj4 = c0121l.f2099a;
                        EnumC1260a enumC1260a = EnumC1260a.f11058a;
                        i2 = c0121l.f2100b;
                        if (i2 != 0) {
                            e5.g.y(obj4);
                            Object c2 = ((P.b) obj).c((P.d) this.f2104c);
                            c0121l.f2100b = 1;
                            if (this.f2103b.b(c2, c0121l) == enumC1260a) {
                                return enumC1260a;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            e5.g.y(obj4);
                        }
                        return f4.v.f5689a;
                    }
                }
                c0121l = new C0121l(this, interfaceC1218d);
                Object obj42 = c0121l.f2099a;
                EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
                i2 = c0121l.f2100b;
                if (i2 != 0) {
                }
                return f4.v.f5689a;
            case 1:
                if (interfaceC1218d instanceof q) {
                    qVar = (q) interfaceC1218d;
                    int i10 = qVar.f2119b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        qVar.f2119b = i10 - Integer.MIN_VALUE;
                        Object obj5 = qVar.f2118a;
                        EnumC1260a enumC1260a3 = EnumC1260a.f11058a;
                        i3 = qVar.f2119b;
                        if (i3 != 0) {
                            e5.g.y(obj5);
                            Object c6 = ((P.b) obj).c((P.d) this.f2104c);
                            qVar.f2119b = 1;
                            if (this.f2103b.b(c6, qVar) == enumC1260a3) {
                                return enumC1260a3;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            e5.g.y(obj5);
                        }
                        return f4.v.f5689a;
                    }
                }
                qVar = new q(this, interfaceC1218d);
                Object obj52 = qVar.f2118a;
                EnumC1260a enumC1260a32 = EnumC1260a.f11058a;
                i3 = qVar.f2119b;
                if (i3 != 0) {
                }
                return f4.v.f5689a;
            case 2:
                if (interfaceC1218d instanceof u) {
                    uVar = (u) interfaceC1218d;
                    int i11 = uVar.f2138b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        uVar.f2138b = i11 - Integer.MIN_VALUE;
                        Object obj6 = uVar.f2137a;
                        EnumC1260a enumC1260a4 = EnumC1260a.f11058a;
                        i6 = uVar.f2138b;
                        if (i6 != 0) {
                            e5.g.y(obj6);
                            Object c7 = ((P.b) obj).c((P.d) this.f2104c);
                            uVar.f2138b = 1;
                            if (this.f2103b.b(c7, uVar) == enumC1260a4) {
                                return enumC1260a4;
                            }
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            e5.g.y(obj6);
                        }
                        return f4.v.f5689a;
                    }
                }
                uVar = new u(this, interfaceC1218d);
                Object obj62 = uVar.f2137a;
                EnumC1260a enumC1260a42 = EnumC1260a.f11058a;
                i6 = uVar.f2138b;
                if (i6 != 0) {
                }
                return f4.v.f5689a;
            case 3:
                if (interfaceC1218d instanceof w) {
                    wVar = (w) interfaceC1218d;
                    int i12 = wVar.f2146b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        wVar.f2146b = i12 - Integer.MIN_VALUE;
                        Object obj7 = wVar.f2145a;
                        EnumC1260a enumC1260a5 = EnumC1260a.f11058a;
                        i7 = wVar.f2146b;
                        if (i7 != 0) {
                            e5.g.y(obj7);
                            Object c8 = ((P.b) obj).c((P.d) this.f2104c);
                            wVar.f2146b = 1;
                            if (this.f2103b.b(c8, wVar) == enumC1260a5) {
                                return enumC1260a5;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            e5.g.y(obj7);
                        }
                        return f4.v.f5689a;
                    }
                }
                wVar = new w(this, interfaceC1218d);
                Object obj72 = wVar.f2145a;
                EnumC1260a enumC1260a52 = EnumC1260a.f11058a;
                i7 = wVar.f2146b;
                if (i7 != 0) {
                }
                return f4.v.f5689a;
            default:
                if (interfaceC1218d instanceof G4.n) {
                    nVar = (G4.n) interfaceC1218d;
                    int i13 = nVar.f1091c;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        nVar.f1091c = i13 - Integer.MIN_VALUE;
                        Object obj8 = nVar.f1090b;
                        EnumC1260a enumC1260a6 = EnumC1260a.f11058a;
                        i8 = nVar.f1091c;
                        z = true;
                        if (i8 != 0) {
                            e5.g.y(obj8);
                            nVar.f1089a = this;
                            nVar.f1093e = obj;
                            nVar.f1091c = 1;
                            Object invoke = ((C0087p) this.f2104c).invoke(obj, nVar);
                            if (invoke == enumC1260a6) {
                                return enumC1260a6;
                            }
                            obj2 = invoke;
                            obj3 = obj;
                            mVar = this;
                        } else {
                            if (i8 != 1) {
                                if (i8 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mVar = nVar.f1089a;
                                e5.g.y(obj8);
                                if (z) {
                                    return f4.v.f5689a;
                                }
                                throw new C0070a(mVar);
                            }
                            Object obj9 = nVar.f1093e;
                            m mVar2 = nVar.f1089a;
                            e5.g.y(obj8);
                            obj3 = obj9;
                            mVar = mVar2;
                            obj2 = obj8;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            z = false;
                        } else {
                            G4.e eVar = mVar.f2103b;
                            nVar.f1089a = mVar;
                            nVar.f1093e = null;
                            nVar.f1091c = 2;
                            if (eVar.b(obj3, nVar) == enumC1260a6) {
                                return enumC1260a6;
                            }
                        }
                        if (z) {
                        }
                    }
                }
                nVar = new G4.n(this, interfaceC1218d);
                Object obj82 = nVar.f1090b;
                EnumC1260a enumC1260a62 = EnumC1260a.f11058a;
                i8 = nVar.f1091c;
                z = true;
                if (i8 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z) {
                }
        }
    }

    public m(C0087p c0087p, G4.e eVar) {
        this.f2102a = 4;
        this.f2104c = c0087p;
        this.f2103b = eVar;
    }
}
