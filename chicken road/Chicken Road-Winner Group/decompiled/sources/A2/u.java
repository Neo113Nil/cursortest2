package A2;

import K.C0049q;
import a2.AbstractC0101K;
import a2.C0100J;
import a2.C0121q;
import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;

/* loaded from: classes.dex */
public final class u implements z2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f123b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f124c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f125d;

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, int i3) {
        this.f122a = i3;
        this.f123b = obj;
        this.f124c = obj2;
        this.f125d = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    @Override // z2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, InterfaceC0319c interfaceC0319c) {
        C0121q c0121q;
        int i3;
        z2.k kVar;
        int i4;
        u uVar;
        switch (this.f122a) {
            case 0:
                Object b3 = l.b((g2.h) this.f123b, obj, this.f124c, (t) this.f125d, interfaceC0319c);
                return b3 == EnumC0326a.f4994a ? b3 : C0279i.f4852a;
            case 1:
                if (interfaceC0319c instanceof C0121q) {
                    c0121q = (C0121q) interfaceC0319c;
                    int i5 = c0121q.f1864e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        c0121q.f1864e = i5 - Integer.MIN_VALUE;
                        Object obj2 = c0121q.f1863d;
                        EnumC0326a enumC0326a = EnumC0326a.f4994a;
                        i3 = c0121q.f1864e;
                        if (i3 != 0) {
                            X0.a.L(obj2);
                            Double d3 = (Double) AbstractC0101K.c(((N.b) obj).c((N.d) this.f124c), ((C0100J) this.f125d).f1820c);
                            c0121q.f1864e = 1;
                            if (((z2.e) this.f123b).a(d3, c0121q) == enumC0326a) {
                                return enumC0326a;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            X0.a.L(obj2);
                        }
                        return C0279i.f4852a;
                    }
                }
                c0121q = new C0121q(this, interfaceC0319c);
                Object obj22 = c0121q.f1863d;
                EnumC0326a enumC0326a2 = EnumC0326a.f4994a;
                i3 = c0121q.f1864e;
                if (i3 != 0) {
                }
                return C0279i.f4852a;
            default:
                if (interfaceC0319c instanceof z2.k) {
                    kVar = (z2.k) interfaceC0319c;
                    int i6 = kVar.f10729h;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        kVar.f10729h = i6 - Integer.MIN_VALUE;
                        Object obj3 = kVar.f;
                        EnumC0326a enumC0326a3 = EnumC0326a.f4994a;
                        i4 = kVar.f10729h;
                        C0279i c0279i = C0279i.f4852a;
                        if (i4 != 0) {
                            X0.a.L(obj3);
                            if (((kotlin.jvm.internal.o) this.f123b).f9670a) {
                                kVar.f10729h = 1;
                                if (((z2.e) this.f124c).a(obj, kVar) == enumC0326a3) {
                                    return enumC0326a3;
                                }
                                return c0279i;
                            }
                            kVar.f10726d = this;
                            kVar.f10727e = obj;
                            kVar.f10729h = 2;
                            obj3 = ((C0049q) this.f125d).invoke(obj, kVar);
                            if (obj3 == enumC0326a3) {
                                return enumC0326a3;
                            }
                            uVar = this;
                            if (!((Boolean) obj3).booleanValue()) {
                            }
                            return c0279i;
                        }
                        if (i4 != 1) {
                            if (i4 == 2) {
                                obj = kVar.f10727e;
                                uVar = kVar.f10726d;
                                X0.a.L(obj3);
                                if (!((Boolean) obj3).booleanValue()) {
                                    ((kotlin.jvm.internal.o) uVar.f123b).f9670a = true;
                                    kVar.f10726d = null;
                                    kVar.f10727e = null;
                                    kVar.f10729h = 3;
                                    if (((z2.e) uVar.f124c).a(obj, kVar) == enumC0326a3) {
                                        return enumC0326a3;
                                    }
                                }
                                return c0279i;
                            }
                            if (i4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        X0.a.L(obj3);
                        return c0279i;
                    }
                }
                kVar = new z2.k(this, interfaceC0319c);
                Object obj32 = kVar.f;
                EnumC0326a enumC0326a32 = EnumC0326a.f4994a;
                i4 = kVar.f10729h;
                C0279i c0279i2 = C0279i.f4852a;
                if (i4 != 0) {
                }
        }
    }

    public u(z2.e eVar, g2.h hVar) {
        this.f122a = 0;
        this.f123b = hVar;
        this.f124c = B2.a.k(hVar);
        this.f125d = new t(eVar, null);
    }
}
