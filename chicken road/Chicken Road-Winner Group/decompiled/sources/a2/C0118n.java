package a2;

import K.C0048p;
import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;

/* renamed from: a2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118n implements z2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2.e f1854b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1855c;

    public /* synthetic */ C0118n(z2.e eVar, N.d dVar, int i3) {
        this.f1853a = i3;
        this.f1854b = eVar;
        this.f1855c = dVar;
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
    @Override // z2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, InterfaceC0319c interfaceC0319c) {
        C0117m c0117m;
        int i3;
        C0123s c0123s;
        int i4;
        w wVar;
        int i5;
        y yVar;
        int i6;
        z2.m mVar;
        int i7;
        boolean z3;
        Object obj2;
        Object obj3;
        C0118n c0118n;
        switch (this.f1853a) {
            case 0:
                if (interfaceC0319c instanceof C0117m) {
                    c0117m = (C0117m) interfaceC0319c;
                    int i8 = c0117m.f1852e;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0117m.f1852e = i8 - Integer.MIN_VALUE;
                        Object obj4 = c0117m.f1851d;
                        EnumC0326a enumC0326a = EnumC0326a.f4994a;
                        i3 = c0117m.f1852e;
                        if (i3 != 0) {
                            X0.a.L(obj4);
                            Object c3 = ((N.b) obj).c((N.d) this.f1855c);
                            c0117m.f1852e = 1;
                            if (this.f1854b.a(c3, c0117m) == enumC0326a) {
                                return enumC0326a;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            X0.a.L(obj4);
                        }
                        return C0279i.f4852a;
                    }
                }
                c0117m = new C0117m(this, interfaceC0319c);
                Object obj42 = c0117m.f1851d;
                EnumC0326a enumC0326a2 = EnumC0326a.f4994a;
                i3 = c0117m.f1852e;
                if (i3 != 0) {
                }
                return C0279i.f4852a;
            case 1:
                if (interfaceC0319c instanceof C0123s) {
                    c0123s = (C0123s) interfaceC0319c;
                    int i9 = c0123s.f1870e;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        c0123s.f1870e = i9 - Integer.MIN_VALUE;
                        Object obj5 = c0123s.f1869d;
                        EnumC0326a enumC0326a3 = EnumC0326a.f4994a;
                        i4 = c0123s.f1870e;
                        if (i4 != 0) {
                            X0.a.L(obj5);
                            Object c4 = ((N.b) obj).c((N.d) this.f1855c);
                            c0123s.f1870e = 1;
                            if (this.f1854b.a(c4, c0123s) == enumC0326a3) {
                                return enumC0326a3;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            X0.a.L(obj5);
                        }
                        return C0279i.f4852a;
                    }
                }
                c0123s = new C0123s(this, interfaceC0319c);
                Object obj52 = c0123s.f1869d;
                EnumC0326a enumC0326a32 = EnumC0326a.f4994a;
                i4 = c0123s.f1870e;
                if (i4 != 0) {
                }
                return C0279i.f4852a;
            case 2:
                if (interfaceC0319c instanceof w) {
                    wVar = (w) interfaceC0319c;
                    int i10 = wVar.f1885e;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        wVar.f1885e = i10 - Integer.MIN_VALUE;
                        Object obj6 = wVar.f1884d;
                        EnumC0326a enumC0326a4 = EnumC0326a.f4994a;
                        i5 = wVar.f1885e;
                        if (i5 != 0) {
                            X0.a.L(obj6);
                            Object c5 = ((N.b) obj).c((N.d) this.f1855c);
                            wVar.f1885e = 1;
                            if (this.f1854b.a(c5, wVar) == enumC0326a4) {
                                return enumC0326a4;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            X0.a.L(obj6);
                        }
                        return C0279i.f4852a;
                    }
                }
                wVar = new w(this, interfaceC0319c);
                Object obj62 = wVar.f1884d;
                EnumC0326a enumC0326a42 = EnumC0326a.f4994a;
                i5 = wVar.f1885e;
                if (i5 != 0) {
                }
                return C0279i.f4852a;
            case 3:
                if (interfaceC0319c instanceof y) {
                    yVar = (y) interfaceC0319c;
                    int i11 = yVar.f1891e;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        yVar.f1891e = i11 - Integer.MIN_VALUE;
                        Object obj7 = yVar.f1890d;
                        EnumC0326a enumC0326a5 = EnumC0326a.f4994a;
                        i6 = yVar.f1891e;
                        if (i6 != 0) {
                            X0.a.L(obj7);
                            Object c6 = ((N.b) obj).c((N.d) this.f1855c);
                            yVar.f1891e = 1;
                            if (this.f1854b.a(c6, yVar) == enumC0326a5) {
                                return enumC0326a5;
                            }
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            X0.a.L(obj7);
                        }
                        return C0279i.f4852a;
                    }
                }
                yVar = new y(this, interfaceC0319c);
                Object obj72 = yVar.f1890d;
                EnumC0326a enumC0326a52 = EnumC0326a.f4994a;
                i6 = yVar.f1891e;
                if (i6 != 0) {
                }
                return C0279i.f4852a;
            default:
                if (interfaceC0319c instanceof z2.m) {
                    mVar = (z2.m) interfaceC0319c;
                    int i12 = mVar.f;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        mVar.f = i12 - Integer.MIN_VALUE;
                        Object obj8 = mVar.f10734e;
                        EnumC0326a enumC0326a6 = EnumC0326a.f4994a;
                        i7 = mVar.f;
                        z3 = true;
                        if (i7 != 0) {
                            X0.a.L(obj8);
                            mVar.f10733d = this;
                            mVar.f10736h = obj;
                            mVar.f = 1;
                            Object invoke = ((C0048p) this.f1855c).invoke(obj, mVar);
                            if (invoke == enumC0326a6) {
                                return enumC0326a6;
                            }
                            obj2 = invoke;
                            obj3 = obj;
                            c0118n = this;
                        } else {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c0118n = mVar.f10733d;
                                X0.a.L(obj8);
                                if (z3) {
                                    return C0279i.f4852a;
                                }
                                throw new A2.a(c0118n);
                            }
                            Object obj9 = mVar.f10736h;
                            C0118n c0118n2 = mVar.f10733d;
                            X0.a.L(obj8);
                            obj3 = obj9;
                            c0118n = c0118n2;
                            obj2 = obj8;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            z3 = false;
                        } else {
                            z2.e eVar = c0118n.f1854b;
                            mVar.f10733d = c0118n;
                            mVar.f10736h = null;
                            mVar.f = 2;
                            if (eVar.a(obj3, mVar) == enumC0326a6) {
                                return enumC0326a6;
                            }
                        }
                        if (z3) {
                        }
                    }
                }
                mVar = new z2.m(this, interfaceC0319c);
                Object obj82 = mVar.f10734e;
                EnumC0326a enumC0326a62 = EnumC0326a.f4994a;
                i7 = mVar.f;
                z3 = true;
                if (i7 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z3) {
                }
        }
    }

    public C0118n(C0048p c0048p, z2.e eVar) {
        this.f1853a = 4;
        this.f1855c = c0048p;
        this.f1854b = eVar;
    }
}
