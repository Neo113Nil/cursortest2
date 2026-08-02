package G6;

import P5.L;
import P5.M;
import a.AbstractC0603a;
import b0.C0769q;
import f6.C1116i;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;

/* loaded from: classes2.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3079a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3080b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3081c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3082d;

    public e(f fVar, t6.p pVar, h hVar) {
        this.f3081c = fVar;
        this.f3082d = pVar;
        this.f3080b = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0130  */
    @Override // G6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, InterfaceC1287d interfaceC1287d) {
        d dVar;
        int i7;
        o oVar;
        int i8;
        e eVar;
        P5.q qVar;
        int i9;
        switch (this.f3079a) {
            case 0:
                if (interfaceC1287d instanceof d) {
                    dVar = (d) interfaceC1287d;
                    int i10 = dVar.f3078c;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        dVar.f3078c = i10 - Integer.MIN_VALUE;
                        Object obj2 = dVar.f3076a;
                        j6.a aVar = j6.a.f14642a;
                        i7 = dVar.f3078c;
                        C1116i c1116i = C1116i.f13008a;
                        if (i7 != 0) {
                            AbstractC0603a.p0(obj2);
                            ((f) this.f3081c).getClass();
                            t6.p pVar = (t6.p) this.f3082d;
                            Object obj3 = pVar.f16472a;
                            if (obj3 == H6.l.f3444a || !((Boolean) j.f3090a.invoke(obj3, obj)).booleanValue()) {
                                pVar.f16472a = obj;
                                dVar.f3078c = 1;
                                if (((h) this.f3080b).c(obj, dVar) == aVar) {
                                    return aVar;
                                }
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC0603a.p0(obj2);
                        }
                        return c1116i;
                    }
                }
                dVar = new d(this, interfaceC1287d);
                Object obj22 = dVar.f3076a;
                j6.a aVar2 = j6.a.f14642a;
                i7 = dVar.f3078c;
                C1116i c1116i2 = C1116i.f13008a;
                if (i7 != 0) {
                }
                return c1116i2;
            case 1:
                if (interfaceC1287d instanceof o) {
                    oVar = (o) interfaceC1287d;
                    int i11 = oVar.f3111e;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        oVar.f3111e = i11 - Integer.MIN_VALUE;
                        Object obj4 = oVar.f3109c;
                        j6.a aVar3 = j6.a.f14642a;
                        i8 = oVar.f3111e;
                        C1116i c1116i3 = C1116i.f13008a;
                        if (i8 != 0) {
                            AbstractC0603a.p0(obj4);
                            if (((t6.n) this.f3081c).f16470a) {
                                oVar.f3111e = 1;
                                if (((h) this.f3080b).c(obj, oVar) == aVar3) {
                                    return aVar3;
                                }
                                return c1116i3;
                            }
                            oVar.f3107a = this;
                            oVar.f3108b = obj;
                            oVar.f3111e = 2;
                            obj4 = ((C0769q) this.f3082d).invoke(obj, oVar);
                            if (obj4 == aVar3) {
                                return aVar3;
                            }
                            eVar = this;
                            if (!((Boolean) obj4).booleanValue()) {
                            }
                            return c1116i3;
                        }
                        if (i8 != 1) {
                            if (i8 == 2) {
                                obj = oVar.f3108b;
                                eVar = oVar.f3107a;
                                AbstractC0603a.p0(obj4);
                                if (!((Boolean) obj4).booleanValue()) {
                                    ((t6.n) eVar.f3081c).f16470a = true;
                                    oVar.f3107a = null;
                                    oVar.f3108b = null;
                                    oVar.f3111e = 3;
                                    if (((h) eVar.f3080b).c(obj, oVar) == aVar3) {
                                        return aVar3;
                                    }
                                }
                                return c1116i3;
                            }
                            if (i8 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        AbstractC0603a.p0(obj4);
                        return c1116i3;
                    }
                }
                oVar = new o(this, interfaceC1287d);
                Object obj42 = oVar.f3109c;
                j6.a aVar32 = j6.a.f14642a;
                i8 = oVar.f3111e;
                C1116i c1116i32 = C1116i.f13008a;
                if (i8 != 0) {
                }
            case 2:
                Object b7 = H6.l.b((InterfaceC1292i) this.f3081c, obj, this.f3082d, (H6.t) this.f3080b, interfaceC1287d);
                return b7 == j6.a.f14642a ? b7 : C1116i.f13008a;
            default:
                if (interfaceC1287d instanceof P5.q) {
                    qVar = (P5.q) interfaceC1287d;
                    int i12 = qVar.f5680b;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        qVar.f5680b = i12 - Integer.MIN_VALUE;
                        Object obj5 = qVar.f5679a;
                        j6.a aVar4 = j6.a.f14642a;
                        i9 = qVar.f5680b;
                        if (i9 != 0) {
                            AbstractC0603a.p0(obj5);
                            Double d7 = (Double) M.c(((e0.b) obj).c((e0.e) this.f3081c), ((L) this.f3082d).f5629c);
                            qVar.f5680b = 1;
                            if (((h) this.f3080b).c(d7, qVar) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC0603a.p0(obj5);
                        }
                        return C1116i.f13008a;
                    }
                }
                qVar = new P5.q(this, interfaceC1287d);
                Object obj52 = qVar.f5679a;
                j6.a aVar42 = j6.a.f14642a;
                i9 = qVar.f5680b;
                if (i9 != 0) {
                }
                return C1116i.f13008a;
        }
    }

    public e(h hVar, e0.e eVar, L l7) {
        this.f3080b = hVar;
        this.f3081c = eVar;
        this.f3082d = l7;
    }

    public e(t6.n nVar, h hVar, C0769q c0769q) {
        this.f3081c = nVar;
        this.f3080b = hVar;
        this.f3082d = c0769q;
    }

    public e(h hVar, InterfaceC1292i interfaceC1292i) {
        this.f3081c = interfaceC1292i;
        this.f3082d = I6.a.l(interfaceC1292i);
        this.f3080b = new H6.t(hVar, null);
    }
}
