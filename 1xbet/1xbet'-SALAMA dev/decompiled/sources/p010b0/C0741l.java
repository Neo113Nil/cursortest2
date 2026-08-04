package p010b0;

import M6.a;
import kotlin.jvm.functions.Function2;
import p077k6.c;
import t6.h;
import t6.n;
import t6.p;

/* JADX INFO: renamed from: b0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0741l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f10068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f10069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f10070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f10071d;

    public C0741l(a aVar, n nVar, p pVar, O o7) {
        this.f10068a = aVar;
        this.f10069b = nVar;
        this.f10070c = pVar;
        this.f10071d = o7;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b4 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00ac, B:38:0x00b4), top: B:54:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(C0737h c0737h, c cVar) throws Throwable {
        C0740k c0740k;
        a aVar;
        O o7;
        n nVar;
        p pVar;
        Function2 function2;
        a aVar2;
        a aVar3;
        O o8;
        Object obj;
        p pVar2;
        if (cVar instanceof C0740k) {
            c0740k = (C0740k) cVar;
            int i7 = c0740k.f10066y;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c0740k.f10066y = i7 - Integer.MIN_VALUE;
            } else {
                c0740k = new C0740k(this, cVar);
            }
        } else {
            c0740k = new C0740k(this, cVar);
        }
        Object obj2 = c0740k.f10064f;
        j6.a aVar4 = j6.a.f14648a;
        int i8 = c0740k.f10066y;
        try {
            if (i8 == 0) {
                p003a.a.p0(obj2);
                c0740k.f10059a = c0737h;
                aVar = this.f10068a;
                c0740k.f10060b = aVar;
                n nVar2 = this.f10069b;
                c0740k.f10061c = nVar2;
                p pVar3 = this.f10070c;
                c0740k.f10062d = pVar3;
                o7 = this.f10071d;
                c0740k.f10063e = o7;
                c0740k.f10066y = 1;
                if (aVar.a(c0740k) == aVar4) {
                    return aVar4;
                }
                nVar = nVar2;
                pVar = pVar3;
                function2 = c0737h;
            } else {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = c0740k.f10061c;
                        pVar2 = (p) c0740k.f10060b;
                        aVar2 = (a) c0740k.f10059a;
                        try {
                            p003a.a.p0(obj2);
                            pVar2.f16478a = obj;
                            pVar = pVar2;
                            Object obj3 = pVar.f16478a;
                            aVar2.b(null);
                            return obj3;
                        } catch (Throwable th) {
                            th = th;
                            aVar2.b(null);
                            throw th;
                        }
                    }
                    o8 = (O) c0740k.f10061c;
                    pVar = (p) c0740k.f10060b;
                    aVar3 = (a) c0740k.f10059a;
                    try {
                        p003a.a.p0(obj2);
                        if (h.a(obj2, pVar.f16478a)) {
                            aVar2 = aVar3;
                        } else {
                            c0740k.f10059a = aVar3;
                            c0740k.f10060b = pVar;
                            c0740k.f10061c = obj2;
                            c0740k.f10066y = 3;
                            if (o8.j(obj2, false, c0740k) == aVar4) {
                                return aVar4;
                            }
                            obj = obj2;
                            pVar2 = pVar;
                            aVar2 = aVar3;
                            pVar2.f16478a = obj;
                            pVar = pVar2;
                        }
                        Object obj4 = pVar.f16478a;
                        aVar2.b(null);
                        return obj4;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2 = aVar3;
                        aVar2.b(null);
                        throw th;
                    }
                }
                O o9 = c0740k.f10063e;
                pVar = c0740k.f10062d;
                nVar = (n) c0740k.f10061c;
                a aVar5 = (a) c0740k.f10060b;
                Function2 function3 = (Function2) c0740k.f10059a;
                p003a.a.p0(obj2);
                aVar = aVar5;
                o7 = o9;
                function2 = function3;
            }
            if (nVar.f16476a) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj5 = pVar.f16478a;
            c0740k.f10059a = aVar;
            c0740k.f10060b = pVar;
            c0740k.f10061c = o7;
            c0740k.f10062d = null;
            c0740k.f10063e = null;
            c0740k.f10066y = 2;
            Object objInvoke = function2.invoke(obj5, c0740k);
            if (objInvoke == aVar4) {
                return aVar4;
            }
            aVar3 = aVar;
            obj2 = objInvoke;
            o8 = o7;
            if (h.a(obj2, pVar.f16478a)) {
                c0740k.f10059a = aVar3;
                c0740k.f10060b = pVar;
                c0740k.f10061c = obj2;
                c0740k.f10066y = 3;
                if (o8.j(obj2, false, c0740k) == aVar4) {
                    return aVar4;
                }
                obj = obj2;
                pVar2 = pVar;
                aVar2 = aVar3;
                pVar2.f16478a = obj;
                pVar = pVar2;
            } else {
                aVar2 = aVar3;
            }
            Object obj6 = pVar.f16478a;
            aVar2.b(null);
            return obj6;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.b(null);
            throw th;
        }
    }
}
