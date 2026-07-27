package R4;

import Q4.C;
import Q4.y;
import f4.AbstractC0424a;
import f4.C0425b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import k4.C1224j;
import k4.InterfaceC1218d;
import k4.InterfaceC1223i;
import l4.C1261b;
import l4.C1262c;
import l4.EnumC1260a;
import m4.AbstractC1293a;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final u f2701a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2702b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2703c;

    /* renamed from: d, reason: collision with root package name */
    public int f2704d;

    public q(Q4.j jVar, u uVar) {
        this.f2701a = uVar;
        this.f2702b = jVar.f2528c;
        this.f2703c = jVar.f2539n;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(q qVar, C0425b c0425b, AbstractC1293a abstractC1293a) {
        p pVar;
        int i2;
        byte f3;
        LinkedHashMap linkedHashMap;
        u uVar;
        LinkedHashMap linkedHashMap2;
        q qVar2;
        byte b6;
        qVar.getClass();
        if (abstractC1293a instanceof p) {
            pVar = (p) abstractC1293a;
            int i3 = pVar.f2700g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pVar.f2700g = i3 - Integer.MIN_VALUE;
                Object obj = pVar.f2698e;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = pVar.f2700g;
                if (i2 != 0) {
                    e5.g.y(obj);
                    u uVar2 = qVar.f2701a;
                    f3 = uVar2.f((byte) 6);
                    if (uVar2.q() == 4) {
                        u.n(uVar2, "Unexpected leading comma", 0, null, 6);
                        throw null;
                    }
                    linkedHashMap = new LinkedHashMap();
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str = pVar.f2697d;
                    linkedHashMap2 = pVar.f2696c;
                    qVar2 = pVar.f2695b;
                    C0425b c0425b2 = pVar.f2694a;
                    e5.g.y(obj);
                    linkedHashMap2.put(str, (Q4.l) obj);
                    b6 = qVar2.f2701a.e();
                    if (b6 != 4) {
                        if (b6 != 7) {
                            u.n(qVar2.f2701a, "Expected end of the object or comma", 0, null, 6);
                            throw null;
                        }
                        u uVar3 = qVar2.f2701a;
                        if (b6 != 6) {
                            uVar3.f((byte) 7);
                        } else if (b6 == 4) {
                            if (!qVar2.f2703c) {
                                m.h(uVar3, "object");
                                throw null;
                            }
                            uVar3.f((byte) 7);
                        }
                        return new y(linkedHashMap2);
                    }
                    linkedHashMap = linkedHashMap2;
                    c0425b = c0425b2;
                    f3 = b6;
                    qVar = qVar2;
                }
                uVar = qVar.f2701a;
                if (uVar.b()) {
                    linkedHashMap2 = linkedHashMap;
                    byte b7 = f3;
                    qVar2 = qVar;
                    b6 = b7;
                    u uVar32 = qVar2.f2701a;
                    if (b6 != 6) {
                    }
                    return new y(linkedHashMap2);
                }
                String j2 = qVar.f2702b ? uVar.j() : uVar.i();
                uVar.f((byte) 5);
                f4.v vVar = f4.v.f5689a;
                pVar.f2694a = c0425b;
                pVar.f2695b = qVar;
                pVar.f2696c = linkedHashMap;
                pVar.f2697d = j2;
                pVar.f2700g = 1;
                c0425b.getClass();
                c0425b.f5663c = pVar;
                c0425b.f5662b = vVar;
                return enumC1260a;
            }
        }
        pVar = new p(qVar, abstractC1293a);
        Object obj2 = pVar.f2698e;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = pVar.f2700g;
        if (i2 != 0) {
        }
        uVar = qVar.f2701a;
        if (uVar.b()) {
        }
    }

    public final Q4.l b() {
        Q4.l yVar;
        Object obj;
        Object invoke;
        u uVar = this.f2701a;
        byte q5 = uVar.q();
        if (q5 == 1) {
            return d(true);
        }
        if (q5 == 0) {
            return d(false);
        }
        if (q5 != 6) {
            if (q5 == 8) {
                return c();
            }
            u.n(uVar, "Cannot read Json element because of unexpected ".concat(m.m(q5)), 0, null, 6);
            throw null;
        }
        int i2 = this.f2704d + 1;
        this.f2704d = i2;
        if (i2 == 200) {
            o oVar = new o(this, null);
            f4.v vVar = f4.v.f5689a;
            EnumC1260a enumC1260a = AbstractC0424a.f5660a;
            C0425b c0425b = new C0425b();
            c0425b.f5661a = oVar;
            c0425b.f5662b = vVar;
            c0425b.f5663c = c0425b;
            EnumC1260a enumC1260a2 = AbstractC0424a.f5660a;
            c0425b.f5664d = enumC1260a2;
            while (true) {
                obj = c0425b.f5664d;
                InterfaceC1218d interfaceC1218d = c0425b.f5663c;
                if (interfaceC1218d == null) {
                    break;
                }
                if (kotlin.jvm.internal.i.a(enumC1260a2, obj)) {
                    try {
                        o oVar2 = c0425b.f5661a;
                        f4.v vVar2 = c0425b.f5662b;
                        if (oVar2 == null) {
                            kotlin.jvm.internal.i.e(oVar2, "<this>");
                            InterfaceC1223i context = interfaceC1218d.getContext();
                            Object c1261b = context == C1224j.f10720a ? new C1261b(interfaceC1218d) : new C1262c(interfaceC1218d, context);
                            kotlin.jvm.internal.v.b(3, oVar2);
                            invoke = oVar2.invoke(c0425b, vVar2, c1261b);
                        } else {
                            kotlin.jvm.internal.v.b(3, oVar2);
                            invoke = oVar2.invoke(c0425b, vVar2, interfaceC1218d);
                        }
                        if (invoke != EnumC1260a.f11058a) {
                            interfaceC1218d.resumeWith(invoke);
                        }
                    } catch (Throwable th) {
                        interfaceC1218d.resumeWith(e5.g.l(th));
                    }
                } else {
                    c0425b.f5664d = enumC1260a2;
                    interfaceC1218d.resumeWith(obj);
                }
            }
            e5.g.y(obj);
            yVar = (Q4.l) obj;
        } else {
            byte f3 = uVar.f((byte) 6);
            if (uVar.q() == 4) {
                u.n(uVar, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!uVar.b()) {
                    break;
                }
                String j2 = this.f2702b ? uVar.j() : uVar.i();
                uVar.f((byte) 5);
                linkedHashMap.put(j2, b());
                f3 = uVar.e();
                if (f3 != 4) {
                    if (f3 != 7) {
                        u.n(uVar, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (f3 == 6) {
                uVar.f((byte) 7);
            } else if (f3 == 4) {
                if (!this.f2703c) {
                    m.h(uVar, "object");
                    throw null;
                }
                uVar.f((byte) 7);
            }
            yVar = new y(linkedHashMap);
        }
        this.f2704d--;
        return yVar;
    }

    public final Q4.e c() {
        u uVar = this.f2701a;
        byte e3 = uVar.e();
        if (uVar.q() == 4) {
            u.n(uVar, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (uVar.b()) {
            arrayList.add(b());
            e3 = uVar.e();
            if (e3 != 4) {
                boolean z = e3 == 9;
                int i2 = uVar.f2720b;
                if (!z) {
                    u.n(uVar, "Expected end of the array or comma", i2, null, 4);
                    throw null;
                }
            }
        }
        if (e3 == 8) {
            uVar.f((byte) 9);
        } else if (e3 == 4) {
            if (!this.f2703c) {
                m.h(uVar, "array");
                throw null;
            }
            uVar.f((byte) 9);
        }
        return new Q4.e(arrayList);
    }

    public final C d(boolean z) {
        u uVar = this.f2701a;
        String j2 = (this.f2702b || !z) ? uVar.j() : uVar.i();
        return (z || !kotlin.jvm.internal.i.a(j2, "null")) ? new Q4.s(j2, z) : Q4.v.INSTANCE;
    }
}
