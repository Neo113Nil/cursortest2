package G6;

import F2.W0;
import a.AbstractC0603a;
import f6.C1116i;
import java.util.concurrent.CancellationException;
import k6.AbstractC1356c;

/* loaded from: classes2.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final W0 f3140a = new W0("NONE", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final W0 f3141b = new W0("PENDING", 1);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(z zVar, b0.r rVar, Throwable th, AbstractC1356c abstractC1356c) {
        k kVar;
        int i7;
        try {
            if (abstractC1356c instanceof k) {
                kVar = (k) abstractC1356c;
                int i8 = kVar.f3093c;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    kVar.f3093c = i8 - Integer.MIN_VALUE;
                    Object obj = kVar.f3092b;
                    Object obj2 = j6.a.f14642a;
                    i7 = kVar.f3093c;
                    if (i7 != 0) {
                        AbstractC0603a.p0(obj);
                        kVar.f3091a = th;
                        kVar.f3093c = 1;
                        if (rVar.invoke(zVar, th, kVar) == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = kVar.f3091a;
                        AbstractC0603a.p0(obj);
                    }
                    return C1116i.f13008a;
                }
            }
            if (i7 != 0) {
            }
            return C1116i.f13008a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                Q0.a.c(th2, th);
            }
            throw th2;
        }
        kVar = new k(abstractC1356c);
        Object obj3 = kVar.f3092b;
        Object obj22 = j6.a.f14642a;
        i7 = kVar.f3093c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:12:0x002f, B:14:0x005e, B:19:0x0072, B:21:0x007a, B:23:0x0080, B:25:0x0086, B:28:0x0097, B:29:0x009f, B:30:0x00a0, B:31:0x00a7, B:39:0x0049, B:42:0x0054), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v4, types: [F6.q] */
    /* JADX WARN: Type inference failed for: r9v6, types: [F6.q] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0094 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(h hVar, F6.o oVar, boolean z4, AbstractC1356c abstractC1356c) {
        i iVar;
        int i7;
        F6.a aVar;
        F6.o oVar2;
        F6.a aVar2;
        h hVar2;
        F6.o oVar3;
        try {
            if (abstractC1356c instanceof i) {
                iVar = (i) abstractC1356c;
                int i8 = iVar.f3089f;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    iVar.f3089f = i8 - Integer.MIN_VALUE;
                    Object obj = iVar.f3088e;
                    j6.a aVar3 = j6.a.f14642a;
                    i7 = iVar.f3089f;
                    if (i7 != 0) {
                        AbstractC0603a.p0(obj);
                        if (hVar instanceof z) {
                            throw ((z) hVar).f3143a;
                        }
                        F6.b bVar = oVar.f2831d;
                        bVar.getClass();
                        aVar = new F6.a(bVar);
                        oVar3 = oVar;
                        iVar.f3084a = hVar;
                        iVar.f3085b = oVar3;
                        iVar.f3086c = aVar;
                        iVar.f3087d = z4;
                        iVar.f3089f = 1;
                        obj = aVar.b(iVar);
                        if (obj == aVar3) {
                        }
                    } else if (i7 == 1) {
                        z4 = iVar.f3087d;
                        aVar2 = iVar.f3086c;
                        ?? r9 = iVar.f3085b;
                        hVar2 = iVar.f3084a;
                        AbstractC0603a.p0(obj);
                        oVar2 = r9;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z4 = iVar.f3087d;
                        aVar2 = iVar.f3086c;
                        ?? r92 = iVar.f3085b;
                        hVar2 = iVar.f3084a;
                        AbstractC0603a.p0(obj);
                        F6.o oVar4 = r92;
                        h hVar3 = hVar2;
                        aVar = aVar2;
                        hVar = hVar3;
                        oVar3 = oVar4;
                        iVar.f3084a = hVar;
                        iVar.f3085b = oVar3;
                        iVar.f3086c = aVar;
                        iVar.f3087d = z4;
                        iVar.f3089f = 1;
                        obj = aVar.b(iVar);
                        if (obj == aVar3) {
                            return aVar3;
                        }
                        F6.a aVar4 = aVar;
                        hVar2 = hVar;
                        aVar2 = aVar4;
                        oVar2 = oVar3;
                        if (!((Boolean) obj).booleanValue()) {
                            if (z4) {
                                oVar2.cancel(null);
                            }
                            return C1116i.f13008a;
                        }
                        Object obj2 = aVar2.f2785a;
                        W0 w02 = F6.d.f2814p;
                        if (obj2 == w02) {
                            throw new IllegalStateException("`hasNext()` has not been invoked");
                        }
                        aVar2.f2785a = w02;
                        if (obj2 == F6.d.f2810l) {
                            Throwable m7 = aVar2.f2787c.m();
                            int i9 = I6.v.f3760a;
                            throw m7;
                        }
                        iVar.f3084a = hVar2;
                        iVar.f3085b = oVar2;
                        iVar.f3086c = aVar2;
                        iVar.f3087d = z4;
                        iVar.f3089f = 2;
                        oVar4 = oVar2;
                        if (hVar2.c(obj2, iVar) == aVar3) {
                            return aVar3;
                        }
                        h hVar32 = hVar2;
                        aVar = aVar2;
                        hVar = hVar32;
                        oVar3 = oVar4;
                        iVar.f3084a = hVar;
                        iVar.f3085b = oVar3;
                        iVar.f3086c = aVar;
                        iVar.f3087d = z4;
                        iVar.f3089f = 1;
                        obj = aVar.b(iVar);
                        if (obj == aVar3) {
                        }
                    }
                }
            }
            if (i7 != 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z4) {
                    CancellationException cancellationException = th instanceof CancellationException ? th : null;
                    if (cancellationException == null) {
                        cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                        cancellationException.initCause(th);
                    }
                    oVar.cancel(cancellationException);
                }
                throw th2;
            }
        }
        iVar = new i(abstractC1356c);
        Object obj3 = iVar.f3088e;
        j6.a aVar32 = j6.a.f14642a;
        i7 = iVar.f3089f;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(g gVar, AbstractC1356c abstractC1356c) {
        t tVar;
        int i7;
        t6.p pVar;
        H6.a e7;
        s sVar;
        if (abstractC1356c instanceof t) {
            tVar = (t) abstractC1356c;
            int i8 = tVar.f3129d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                tVar.f3129d = i8 - Integer.MIN_VALUE;
                Object obj = tVar.f3128c;
                Object obj2 = j6.a.f14642a;
                i7 = tVar.f3129d;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj);
                    t6.p pVar2 = new t6.p();
                    s sVar2 = new s(pVar2, 0);
                    try {
                        tVar.f3126a = pVar2;
                        tVar.f3127b = sVar2;
                        tVar.f3129d = 1;
                        if (gVar.r(sVar2, tVar) == obj2) {
                            return obj2;
                        }
                        pVar = pVar2;
                    } catch (H6.a e8) {
                        pVar = pVar2;
                        e7 = e8;
                        sVar = sVar2;
                        if (e7.f3423a != sVar) {
                        }
                        return pVar.f16472a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = tVar.f3127b;
                    pVar = tVar.f3126a;
                    try {
                        AbstractC0603a.p0(obj);
                    } catch (H6.a e9) {
                        e7 = e9;
                        if (e7.f3423a != sVar) {
                            throw e7;
                        }
                        return pVar.f16472a;
                    }
                }
                return pVar.f16472a;
            }
        }
        tVar = new t(abstractC1356c);
        Object obj3 = tVar.f3128c;
        Object obj22 = j6.a.f14642a;
        i7 = tVar.f3129d;
        if (i7 != 0) {
        }
        return pVar.f16472a;
    }
}
