package G4;

import H4.B;
import M.C0088q;
import N2.H;
import N2.I;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1081a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1082b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1083c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1084d;

    public l(e eVar, P.d dVar, H h3) {
        this.f1083c = eVar;
        this.f1082b = dVar;
        this.f1084d = h3;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    @Override // G4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, InterfaceC1218d interfaceC1218d) {
        k kVar;
        int i2;
        l lVar;
        N2.o oVar;
        int i3;
        switch (this.f1081a) {
            case 0:
                if (interfaceC1218d instanceof k) {
                    kVar = (k) interfaceC1218d;
                    int i6 = kVar.f1080e;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        kVar.f1080e = i6 - Integer.MIN_VALUE;
                        Object obj2 = kVar.f1078c;
                        EnumC1260a enumC1260a = EnumC1260a.f11058a;
                        i2 = kVar.f1080e;
                        f4.v vVar = f4.v.f5689a;
                        if (i2 != 0) {
                            e5.g.y(obj2);
                            if (((kotlin.jvm.internal.q) this.f1082b).f10739a) {
                                kVar.f1080e = 1;
                                if (((e) this.f1083c).b(obj, kVar) == enumC1260a) {
                                    return enumC1260a;
                                }
                                return vVar;
                            }
                            kVar.f1076a = this;
                            kVar.f1077b = obj;
                            kVar.f1080e = 2;
                            obj2 = ((C0088q) this.f1084d).invoke(obj, kVar);
                            if (obj2 == enumC1260a) {
                                return enumC1260a;
                            }
                            lVar = this;
                            if (!((Boolean) obj2).booleanValue()) {
                            }
                            return vVar;
                        }
                        if (i2 != 1) {
                            if (i2 == 2) {
                                obj = kVar.f1077b;
                                lVar = kVar.f1076a;
                                e5.g.y(obj2);
                                if (!((Boolean) obj2).booleanValue()) {
                                    ((kotlin.jvm.internal.q) lVar.f1082b).f10739a = true;
                                    kVar.f1076a = null;
                                    kVar.f1077b = null;
                                    kVar.f1080e = 3;
                                    if (((e) lVar.f1083c).b(obj, kVar) == enumC1260a) {
                                        return enumC1260a;
                                    }
                                }
                                return vVar;
                            }
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        e5.g.y(obj2);
                        return vVar;
                    }
                }
                kVar = new k(this, interfaceC1218d);
                Object obj22 = kVar.f1078c;
                EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
                i2 = kVar.f1080e;
                f4.v vVar2 = f4.v.f5689a;
                if (i2 != 0) {
                }
            case 1:
                Object b6 = H4.t.b((InterfaceC1223i) this.f1082b, obj, this.f1083c, (B) this.f1084d, interfaceC1218d);
                return b6 == EnumC1260a.f11058a ? b6 : f4.v.f5689a;
            default:
                if (interfaceC1218d instanceof N2.o) {
                    oVar = (N2.o) interfaceC1218d;
                    int i7 = oVar.f2111b;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        oVar.f2111b = i7 - Integer.MIN_VALUE;
                        Object obj3 = oVar.f2110a;
                        EnumC1260a enumC1260a3 = EnumC1260a.f11058a;
                        i3 = oVar.f2111b;
                        if (i3 != 0) {
                            e5.g.y(obj3);
                            Double d6 = (Double) I.c(((P.b) obj).c((P.d) this.f1082b), ((H) this.f1084d).f2064c);
                            oVar.f2111b = 1;
                            if (((e) this.f1083c).b(d6, oVar) == enumC1260a3) {
                                return enumC1260a3;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            e5.g.y(obj3);
                        }
                        return f4.v.f5689a;
                    }
                }
                oVar = new N2.o(this, interfaceC1218d);
                Object obj32 = oVar.f2110a;
                EnumC1260a enumC1260a32 = EnumC1260a.f11058a;
                i3 = oVar.f2111b;
                if (i3 != 0) {
                }
                return f4.v.f5689a;
        }
    }

    public l(kotlin.jvm.internal.q qVar, e eVar, C0088q c0088q) {
        this.f1082b = qVar;
        this.f1083c = eVar;
        this.f1084d = c0088q;
    }

    public l(e eVar, InterfaceC1223i interfaceC1223i) {
        this.f1082b = interfaceC1223i;
        this.f1083c = I4.a.m(interfaceC1223i);
        this.f1084d = new B(eVar, null);
    }
}
