package G4;

import G0.C0051a;
import H4.C0070a;
import b2.AbstractC0279e;
import java.util.concurrent.CancellationException;
import k4.C1224j;
import k4.InterfaceC1223i;
import l4.EnumC1260a;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final C0051a f1116a = new C0051a("NONE", 2);

    /* renamed from: b, reason: collision with root package name */
    public static final C0051a f1117b = new C0051a("PENDING", 2);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(z zVar, M.r rVar, Throwable th, AbstractC1295c abstractC1295c) {
        g gVar;
        int i2;
        try {
            if (abstractC1295c instanceof g) {
                gVar = (g) abstractC1295c;
                int i3 = gVar.f1062c;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    gVar.f1062c = i3 - Integer.MIN_VALUE;
                    Object obj = gVar.f1061b;
                    Object obj2 = EnumC1260a.f11058a;
                    i2 = gVar.f1062c;
                    if (i2 != 0) {
                        e5.g.y(obj);
                        gVar.f1060a = th;
                        gVar.f1062c = 1;
                        if (rVar.invoke(zVar, th, gVar) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = gVar.f1060a;
                        e5.g.y(obj);
                    }
                    return f4.v.f5689a;
                }
            }
            if (i2 != 0) {
            }
            return f4.v.f5689a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                K1.b.C(th2, th);
            }
            throw th2;
        }
        gVar = new g(abstractC1295c);
        Object obj3 = gVar.f1061b;
        Object obj22 = EnumC1260a.f11058a;
        i2 = gVar.f1062c;
    }

    public static d b(d dVar, int i2) {
        int i3;
        if (i2 < 0 && i2 != -2 && i2 != -1) {
            throw new IllegalArgumentException(AbstractC0279e.d(i2, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i2 == -1) {
            i3 = 2;
            i2 = 0;
        } else {
            i3 = 1;
        }
        return dVar instanceof H4.q ? H4.t.a((H4.q) dVar, null, i2, i3, 1) : new H4.i(dVar, C1224j.f10720a, i2, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005e, B:19:0x0072, B:21:0x007a, B:23:0x0080, B:25:0x0086, B:28:0x0097, B:29:0x009f, B:30:0x00a0, B:31:0x00a7, B:39:0x0049, B:42:0x0054), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v4, types: [F4.r] */
    /* JADX WARN: Type inference failed for: r9v6, types: [F4.r] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0094 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(e eVar, F4.p pVar, boolean z, AbstractC1295c abstractC1295c) {
        f fVar;
        int i2;
        F4.a aVar;
        F4.p pVar2;
        F4.a aVar2;
        e eVar2;
        F4.p pVar3;
        try {
            if (abstractC1295c instanceof f) {
                fVar = (f) abstractC1295c;
                int i3 = fVar.f1059f;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    fVar.f1059f = i3 - Integer.MIN_VALUE;
                    Object obj = fVar.f1058e;
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    i2 = fVar.f1059f;
                    if (i2 != 0) {
                        e5.g.y(obj);
                        if (eVar instanceof z) {
                            throw ((z) eVar).f1119a;
                        }
                        F4.b bVar = pVar.f739d;
                        bVar.getClass();
                        aVar = new F4.a(bVar);
                        pVar3 = pVar;
                        fVar.f1054a = eVar;
                        fVar.f1055b = pVar3;
                        fVar.f1056c = aVar;
                        fVar.f1057d = z;
                        fVar.f1059f = 1;
                        obj = aVar.b(fVar);
                        if (obj == enumC1260a) {
                        }
                    } else if (i2 == 1) {
                        z = fVar.f1057d;
                        aVar2 = fVar.f1056c;
                        ?? r9 = fVar.f1055b;
                        eVar2 = fVar.f1054a;
                        e5.g.y(obj);
                        pVar2 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z = fVar.f1057d;
                        aVar2 = fVar.f1056c;
                        ?? r92 = fVar.f1055b;
                        eVar2 = fVar.f1054a;
                        e5.g.y(obj);
                        F4.p pVar4 = r92;
                        e eVar3 = eVar2;
                        aVar = aVar2;
                        eVar = eVar3;
                        pVar3 = pVar4;
                        fVar.f1054a = eVar;
                        fVar.f1055b = pVar3;
                        fVar.f1056c = aVar;
                        fVar.f1057d = z;
                        fVar.f1059f = 1;
                        obj = aVar.b(fVar);
                        if (obj == enumC1260a) {
                            return enumC1260a;
                        }
                        F4.a aVar3 = aVar;
                        eVar2 = eVar;
                        aVar2 = aVar3;
                        pVar2 = pVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z) {
                                pVar2.b(null);
                            }
                            return f4.v.f5689a;
                        }
                        Object obj2 = aVar2.f691a;
                        C0051a c0051a = F4.d.f721p;
                        if (obj2 == c0051a) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        aVar2.f691a = c0051a;
                        if (obj2 == F4.d.f717l) {
                            Throwable o2 = aVar2.f693c.o();
                            int i6 = I4.v.f1324a;
                            throw o2;
                        }
                        fVar.f1054a = eVar2;
                        fVar.f1055b = pVar2;
                        fVar.f1056c = aVar2;
                        fVar.f1057d = z;
                        fVar.f1059f = 2;
                        pVar4 = pVar2;
                        if (eVar2.b(obj2, fVar) == enumC1260a) {
                            return enumC1260a;
                        }
                        e eVar32 = eVar2;
                        aVar = aVar2;
                        eVar = eVar32;
                        pVar3 = pVar4;
                        fVar.f1054a = eVar;
                        fVar.f1055b = pVar3;
                        fVar.f1056c = aVar;
                        fVar.f1057d = z;
                        fVar.f1059f = 1;
                        obj = aVar.b(fVar);
                        if (obj == enumC1260a) {
                        }
                    }
                }
            }
            if (i2 != 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z) {
                    CancellationException cancellationException = th instanceof CancellationException ? th : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th);
                    }
                    pVar.b(cancellationException);
                }
                throw th2;
            }
        }
        fVar = new f(abstractC1295c);
        Object obj3 = fVar.f1058e;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = fVar.f1059f;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(d dVar, AbstractC1295c abstractC1295c) {
        r rVar;
        int i2;
        kotlin.jvm.internal.s sVar;
        C0070a e3;
        q qVar;
        if (abstractC1295c instanceof r) {
            rVar = (r) abstractC1295c;
            int i3 = rVar.f1104d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rVar.f1104d = i3 - Integer.MIN_VALUE;
                Object obj = rVar.f1103c;
                Object obj2 = EnumC1260a.f11058a;
                i2 = rVar.f1104d;
                if (i2 != 0) {
                    e5.g.y(obj);
                    kotlin.jvm.internal.s sVar2 = new kotlin.jvm.internal.s();
                    q qVar2 = new q(0, sVar2);
                    try {
                        rVar.f1101a = sVar2;
                        rVar.f1102b = qVar2;
                        rVar.f1104d = 1;
                        if (dVar.i(qVar2, rVar) == obj2) {
                            return obj2;
                        }
                        sVar = sVar2;
                    } catch (C0070a e6) {
                        sVar = sVar2;
                        e3 = e6;
                        qVar = qVar2;
                        if (e3.f1161a != qVar) {
                        }
                        return sVar.f10741a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = rVar.f1102b;
                    sVar = rVar.f1101a;
                    try {
                        e5.g.y(obj);
                    } catch (C0070a e7) {
                        e3 = e7;
                        if (e3.f1161a != qVar) {
                            throw e3;
                        }
                        return sVar.f10741a;
                    }
                }
                return sVar.f10741a;
            }
        }
        rVar = new r(abstractC1295c);
        Object obj3 = rVar.f1103c;
        Object obj22 = EnumC1260a.f11058a;
        i2 = rVar.f1104d;
        if (i2 != 0) {
        }
        return sVar.f10741a;
    }

    public static final d e(u uVar, InterfaceC1223i interfaceC1223i, int i2, int i3) {
        return (((i2 < 0 || i2 >= 2) && i2 != -2) || i3 != 2) ? ((i2 == 0 || i2 == -3) && i3 == 1) ? uVar : new H4.i(uVar, interfaceC1223i, i2, i3) : uVar;
    }
}
