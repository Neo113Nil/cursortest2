package z2;

import B2.u;
import B2.v;
import K.C0057z;
import d2.C0279i;
import h2.EnumC0326a;
import i2.AbstractC0343b;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final v f10749a = new v("NONE");

    /* renamed from: b, reason: collision with root package name */
    public static final v f10750b = new v("PENDING");

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(s sVar, K.r rVar, Throwable th, AbstractC0343b abstractC0343b) {
        g gVar;
        int i3;
        try {
            if (abstractC0343b instanceof g) {
                gVar = (g) abstractC0343b;
                int i4 = gVar.f;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    gVar.f = i4 - Integer.MIN_VALUE;
                    Object obj = gVar.f10714e;
                    Object obj2 = EnumC0326a.f4994a;
                    i3 = gVar.f;
                    if (i3 != 0) {
                        X0.a.L(obj);
                        gVar.f10713d = th;
                        gVar.f = 1;
                        if (rVar.i(sVar, th, gVar) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = gVar.f10713d;
                        X0.a.L(obj);
                    }
                    return C0279i.f4852a;
                }
            }
            if (i3 != 0) {
            }
            return C0279i.f4852a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                F2.b.d(th2, th);
            }
            throw th2;
        }
        gVar = new g(abstractC0343b);
        Object obj3 = gVar.f10714e;
        Object obj22 = EnumC0326a.f4994a;
        i3 = gVar.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r2.a(r11, r0) == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005e, B:20:0x0072, B:22:0x007a, B:24:0x0080, B:26:0x0086, B:28:0x0097, B:29:0x009f, B:30:0x00a0, B:31:0x00a7, B:39:0x0049, B:42:0x0054), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v4, types: [y2.p] */
    /* JADX WARN: Type inference failed for: r9v6, types: [y2.p] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0094 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, y2.n nVar, boolean z3, AbstractC0343b abstractC0343b) {
        f fVar;
        int i3;
        y2.a aVar;
        y2.n nVar2;
        y2.a aVar2;
        e eVar2;
        y2.n nVar3;
        try {
            if (abstractC0343b instanceof f) {
                fVar = (f) abstractC0343b;
                int i4 = fVar.f10712i;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    fVar.f10712i = i4 - Integer.MIN_VALUE;
                    Object obj = fVar.f10711h;
                    EnumC0326a enumC0326a = EnumC0326a.f4994a;
                    i3 = fVar.f10712i;
                    if (i3 != 0) {
                        X0.a.L(obj);
                        if (eVar instanceof s) {
                            throw ((s) eVar).f10752a;
                        }
                        y2.b bVar = nVar.f10628d;
                        bVar.getClass();
                        aVar = new y2.a(bVar);
                        nVar3 = nVar;
                        fVar.f10708d = eVar;
                        fVar.f10709e = nVar3;
                        fVar.f = aVar;
                        fVar.f10710g = z3;
                        fVar.f10712i = 1;
                        obj = aVar.b(fVar);
                        if (obj != enumC0326a) {
                        }
                    } else if (i3 == 1) {
                        z3 = fVar.f10710g;
                        aVar2 = fVar.f;
                        ?? r9 = fVar.f10709e;
                        eVar2 = fVar.f10708d;
                        X0.a.L(obj);
                        nVar2 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z3 = fVar.f10710g;
                        aVar2 = fVar.f;
                        ?? r92 = fVar.f10709e;
                        eVar2 = fVar.f10708d;
                        X0.a.L(obj);
                        y2.n nVar4 = r92;
                        e eVar3 = eVar2;
                        aVar = aVar2;
                        eVar = eVar3;
                        nVar3 = nVar4;
                        fVar.f10708d = eVar;
                        fVar.f10709e = nVar3;
                        fVar.f = aVar;
                        fVar.f10710g = z3;
                        fVar.f10712i = 1;
                        obj = aVar.b(fVar);
                        if (obj != enumC0326a) {
                            return enumC0326a;
                        }
                        y2.a aVar3 = aVar;
                        eVar2 = eVar;
                        aVar2 = aVar3;
                        nVar2 = nVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z3) {
                                nVar2.b(null);
                            }
                            return C0279i.f4852a;
                        }
                        Object obj2 = aVar2.f10588a;
                        v vVar = y2.d.f10615p;
                        if (obj2 == vVar) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        aVar2.f10588a = vVar;
                        if (obj2 == y2.d.f10611l) {
                            Throwable n3 = aVar2.f10590c.n();
                            int i5 = u.f182a;
                            throw n3;
                        }
                        fVar.f10708d = eVar2;
                        fVar.f10709e = nVar2;
                        fVar.f = aVar2;
                        fVar.f10710g = z3;
                        fVar.f10712i = 2;
                        nVar4 = nVar2;
                    }
                }
            }
            if (i3 != 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z3) {
                    CancellationException cancellationException = th instanceof CancellationException ? th : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th);
                    }
                    nVar.b(cancellationException);
                }
                throw th2;
            }
        }
        fVar = new f(abstractC0343b);
        Object obj3 = fVar.f10711h;
        EnumC0326a enumC0326a2 = EnumC0326a.f4994a;
        i3 = fVar.f10712i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(d dVar, AbstractC0343b abstractC0343b) {
        n nVar;
        int i3;
        kotlin.jvm.internal.q qVar;
        A2.a e3;
        C0057z c0057z;
        if (abstractC0343b instanceof n) {
            nVar = (n) abstractC0343b;
            int i4 = nVar.f10739g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                nVar.f10739g = i4 - Integer.MIN_VALUE;
                Object obj = nVar.f;
                Object obj2 = EnumC0326a.f4994a;
                i3 = nVar.f10739g;
                if (i3 != 0) {
                    X0.a.L(obj);
                    kotlin.jvm.internal.q qVar2 = new kotlin.jvm.internal.q();
                    C0057z c0057z2 = new C0057z(2, qVar2);
                    try {
                        nVar.f10737d = qVar2;
                        nVar.f10738e = c0057z2;
                        nVar.f10739g = 1;
                        if (dVar.l(c0057z2, nVar) == obj2) {
                            return obj2;
                        }
                        qVar = qVar2;
                    } catch (A2.a e4) {
                        qVar = qVar2;
                        e3 = e4;
                        c0057z = c0057z2;
                        if (e3.f90a != c0057z) {
                        }
                        return qVar.f9672a;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0057z = nVar.f10738e;
                    qVar = nVar.f10737d;
                    try {
                        X0.a.L(obj);
                    } catch (A2.a e5) {
                        e3 = e5;
                        if (e3.f90a != c0057z) {
                            throw e3;
                        }
                        return qVar.f9672a;
                    }
                }
                return qVar.f9672a;
            }
        }
        nVar = new n(abstractC0343b);
        Object obj3 = nVar.f;
        Object obj22 = EnumC0326a.f4994a;
        i3 = nVar.f10739g;
        if (i3 != 0) {
        }
        return qVar.f9672a;
    }
}
