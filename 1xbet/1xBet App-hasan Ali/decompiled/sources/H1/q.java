package H1;

import P.C0297i0;
import P.C0318t0;
import P.InterfaceC0289e0;
import b4.EnumC0510a;
import c.C0522a;
import java.util.List;
import s4.C2366c;
import s4.C2367d;
import s4.C2375l;
import s4.I;
import s4.InterfaceC2369f;
import u.t0;

/* loaded from: classes.dex */
public final class q implements InterfaceC2369f {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f2232k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f2233l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f2234m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f2235n;

    public q(C0318t0 c0318t0, t0 t0Var, InterfaceC0289e0 interfaceC0289e0) {
        this.f2232k = 3;
        this.f2234m = c0318t0;
        this.f2235n = t0Var;
        this.f2233l = interfaceC0289e0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0113  */
    @Override // s4.InterfaceC2369f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, a4.c cVar) {
        C2366c c2366c;
        int i;
        C2375l c2375l;
        int i5;
        q qVar;
        boolean z3;
        switch (this.f2232k) {
            case 0:
                C0522a c0522a = (C0522a) obj;
                if (((List) ((InterfaceC0289e0) this.f2233l).getValue()).size() > 1) {
                    ((InterfaceC0289e0) this.f2234m).setValue(Boolean.TRUE);
                    ((C0297i0) this.f2235n).i(c0522a.f7314c);
                }
                return W3.o.f6046a;
            case 1:
                if (cVar instanceof C2366c) {
                    c2366c = (C2366c) cVar;
                    int i6 = c2366c.f19260m;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        c2366c.f19260m = i6 - Integer.MIN_VALUE;
                        Object obj2 = c2366c.f19258k;
                        EnumC0510a enumC0510a = EnumC0510a.f7289k;
                        i = c2366c.f19260m;
                        W3.o oVar = W3.o.f6046a;
                        if (i != 0) {
                            G4.l.N(obj2);
                            ((C2367d) this.f2233l).getClass();
                            kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.f2234m;
                            Object obj3 = wVar.f17624k;
                            if (obj3 == t4.c.f19596b || !kotlin.jvm.internal.l.a(obj3, obj)) {
                                wVar.f17624k = obj;
                                c2366c.f19260m = 1;
                                if (((InterfaceC2369f) this.f2235n).d(obj, c2366c) == enumC0510a) {
                                    return enumC0510a;
                                }
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            G4.l.N(obj2);
                        }
                        return oVar;
                    }
                }
                c2366c = new C2366c(this, cVar);
                Object obj22 = c2366c.f19258k;
                EnumC0510a enumC0510a2 = EnumC0510a.f7289k;
                i = c2366c.f19260m;
                W3.o oVar2 = W3.o.f6046a;
                if (i != 0) {
                }
                return oVar2;
            case 2:
                if (cVar instanceof C2375l) {
                    c2375l = (C2375l) cVar;
                    int i7 = c2375l.f19284o;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        c2375l.f19284o = i7 - Integer.MIN_VALUE;
                        Object obj4 = c2375l.f19282m;
                        EnumC0510a enumC0510a3 = EnumC0510a.f7289k;
                        i5 = c2375l.f19284o;
                        W3.o oVar3 = W3.o.f6046a;
                        if (i5 != 0) {
                            G4.l.N(obj4);
                            if (((kotlin.jvm.internal.s) this.f2233l).f17620k) {
                                c2375l.f19284o = 1;
                                if (((InterfaceC2369f) this.f2234m).d(obj, c2375l) == enumC0510a3) {
                                    return enumC0510a3;
                                }
                                return oVar3;
                            }
                            c2375l.f19280k = this;
                            c2375l.f19281l = obj;
                            c2375l.f19284o = 2;
                            obj4 = ((I) this.f2235n).invoke(obj, c2375l);
                            if (obj4 == enumC0510a3) {
                                return enumC0510a3;
                            }
                            qVar = this;
                            if (!((Boolean) obj4).booleanValue()) {
                            }
                            return oVar3;
                        }
                        if (i5 != 1) {
                            if (i5 == 2) {
                                obj = c2375l.f19281l;
                                qVar = c2375l.f19280k;
                                G4.l.N(obj4);
                                if (!((Boolean) obj4).booleanValue()) {
                                    ((kotlin.jvm.internal.s) qVar.f2233l).f17620k = true;
                                    c2375l.f19280k = null;
                                    c2375l.f19281l = null;
                                    c2375l.f19284o = 3;
                                    if (((InterfaceC2369f) qVar.f2234m).d(obj, c2375l) == enumC0510a3) {
                                        return enumC0510a3;
                                    }
                                }
                                return oVar3;
                            }
                            if (i5 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        }
                        G4.l.N(obj4);
                        return oVar3;
                    }
                }
                c2375l = new C2375l(this, cVar);
                Object obj42 = c2375l.f19282m;
                EnumC0510a enumC0510a32 = EnumC0510a.f7289k;
                i5 = c2375l.f19284o;
                W3.o oVar32 = W3.o.f6046a;
                if (i5 != 0) {
                }
            case 3:
                if (((Boolean) obj).booleanValue()) {
                    i4.e eVar = (i4.e) ((InterfaceC0289e0) this.f2233l).getValue();
                    t0 t0Var = (t0) this.f2235n;
                    z3 = ((Boolean) eVar.invoke(t0Var.f19937a.e(), t0Var.f19940d.getValue())).booleanValue();
                } else {
                    z3 = false;
                }
                ((C0318t0) this.f2234m).setValue(Boolean.valueOf(z3));
                return W3.o.f6046a;
            default:
                Object a5 = t4.c.a((a4.h) this.f2233l, obj, this.f2234m, (t4.z) this.f2235n, cVar);
                return a5 == EnumC0510a.f7289k ? a5 : W3.o.f6046a;
        }
    }

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, int i) {
        this.f2232k = i;
        this.f2233l = obj;
        this.f2234m = obj2;
        this.f2235n = obj3;
    }

    public q(InterfaceC2369f interfaceC2369f, a4.h hVar) {
        this.f2232k = 4;
        this.f2233l = hVar;
        this.f2234m = u4.a.k(hVar);
        this.f2235n = new t4.z(interfaceC2369f, null);
    }
}
