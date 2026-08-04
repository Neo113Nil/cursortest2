package G6;

import P5.L;
import P5.M;
import p010b0.C0746q;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3079a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3082d;

    public e(f fVar, t6.p pVar, h hVar) {
        this.f3081c = fVar;
        this.f3082d = pVar;
        this.f3080b = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0112  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // G6.h
    public final Object c(Object obj, p065i6.d dVar) {
        d dVar2;
        o oVar;
        e eVar;
        P5.q qVar;
        switch (this.f3079a) {
            case 0:
                if (dVar instanceof d) {
                    dVar2 = (d) dVar;
                    int i7 = dVar2.f3078c;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        dVar2.f3078c = i7 - Integer.MIN_VALUE;
                    } else {
                        dVar2 = new d(this, dVar);
                    }
                } else {
                    dVar2 = new d(this, dVar);
                }
                Object obj2 = dVar2.f3076a;
                j6.a aVar = j6.a.f14648a;
                int i8 = dVar2.f3078c;
                p044f6.i iVar = p044f6.i.f13014a;
                if (i8 == 0) {
                    p003a.a.p0(obj2);
                    ((f) this.f3081c).getClass();
                    t6.p pVar = (t6.p) this.f3082d;
                    Object obj3 = pVar.f16478a;
                    if (obj3 == H6.l.f3444a || !((Boolean) j.f3090a.invoke(obj3, obj)).booleanValue()) {
                        pVar.f16478a = obj;
                        dVar2.f3078c = 1;
                        if (((h) this.f3080b).c(obj, dVar2) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p003a.a.p0(obj2);
                }
                return iVar;
            case 1:
                if (dVar instanceof o) {
                    oVar = (o) dVar;
                    int i9 = oVar.f3111e;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        oVar.f3111e = i9 - Integer.MIN_VALUE;
                    } else {
                        oVar = new o(this, dVar);
                    }
                } else {
                    oVar = new o(this, dVar);
                }
                Object objInvoke = oVar.f3109c;
                j6.a aVar2 = j6.a.f14648a;
                int i10 = oVar.f3111e;
                p044f6.i iVar2 = p044f6.i.f13014a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            obj = oVar.f3108b;
                            eVar = oVar.f3107a;
                            p003a.a.p0(objInvoke);
                            if (!((Boolean) objInvoke).booleanValue()) {
                                ((t6.n) eVar.f3081c).f16476a = true;
                                oVar.f3107a = null;
                                oVar.f3108b = null;
                                oVar.f3111e = 3;
                                if (((h) eVar.f3080b).c(obj, oVar) == aVar2) {
                                    return aVar2;
                                }
                            }
                        } else if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }
                    p003a.a.p0(objInvoke);
                } else {
                    p003a.a.p0(objInvoke);
                    if (((t6.n) this.f3081c).f16476a) {
                        oVar.f3111e = 1;
                        if (((h) this.f3080b).c(obj, oVar) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        oVar.f3107a = this;
                        oVar.f3108b = obj;
                        oVar.f3111e = 2;
                        objInvoke = ((C0746q) this.f3082d).invoke(obj, oVar);
                        if (objInvoke == aVar2) {
                            return aVar2;
                        }
                        eVar = this;
                        if (!((Boolean) objInvoke).booleanValue()) {
                            ((t6.n) eVar.f3081c).f16476a = true;
                            oVar.f3107a = null;
                            oVar.f3108b = null;
                            oVar.f3111e = 3;
                            if (((h) eVar.f3080b).c(obj, oVar) == aVar2) {
                                return aVar2;
                            }
                        }
                    }
                }
                return iVar2;
            case 2:
                Object objB = H6.l.b((p065i6.i) this.f3081c, obj, this.f3082d, (H6.t) this.f3080b, dVar);
                return objB == j6.a.f14648a ? objB : p044f6.i.f13014a;
            default:
                if (dVar instanceof P5.q) {
                    qVar = (P5.q) dVar;
                    int i11 = qVar.f5680b;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        qVar.f5680b = i11 - Integer.MIN_VALUE;
                    } else {
                        qVar = new P5.q(this, dVar);
                    }
                } else {
                    qVar = new P5.q(this, dVar);
                }
                Object obj4 = qVar.f5679a;
                j6.a aVar3 = j6.a.f14648a;
                int i12 = qVar.f5680b;
                if (i12 == 0) {
                    p003a.a.p0(obj4);
                    Double d7 = (Double) M.c(((p030e0.b) obj).c((p030e0.e) this.f3081c), ((L) this.f3082d).f5629c);
                    qVar.f5680b = 1;
                    if (((h) this.f3080b).c(d7, qVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p003a.a.p0(obj4);
                }
                return p044f6.i.f13014a;
        }
    }

    public e(h hVar, p030e0.e eVar, L l7) {
        this.f3080b = hVar;
        this.f3081c = eVar;
        this.f3082d = l7;
    }

    public e(t6.n nVar, h hVar, C0746q c0746q) {
        this.f3081c = nVar;
        this.f3080b = hVar;
        this.f3082d = c0746q;
    }

    public e(h hVar, p065i6.i iVar) {
        this.f3081c = iVar;
        this.f3082d = I6.a.l(iVar);
        this.f3080b = new H6.t(hVar, null);
    }
}
