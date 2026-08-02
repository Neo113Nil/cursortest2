package b0;

import a.AbstractC0603a;
import k6.AbstractC1356c;
import kotlin.jvm.functions.Function2;

/* renamed from: b0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0764l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M6.a f10068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t6.n f10069b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t6.p f10070c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f10071d;

    public C0764l(M6.a aVar, t6.n nVar, t6.p pVar, O o7) {
        this.f10068a = aVar;
        this.f10069b = nVar;
        this.f10070c = pVar;
        this.f10071d = o7;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ac, B:30:0x00b4), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094 A[Catch: all -> 0x00d2, TRY_LEAVE, TryCatch #0 {all -> 0x00d2, blocks: (B:40:0x0090, B:42:0x0094, B:46:0x00d5, B:47:0x00dc), top: B:39:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5 A[Catch: all -> 0x00d2, TRY_ENTER, TryCatch #0 {all -> 0x00d2, blocks: (B:40:0x0090, B:42:0x0094, B:46:0x00d5, B:47:0x00dc), top: B:39:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0760h c0760h, AbstractC1356c abstractC1356c) {
        C0763k c0763k;
        int i7;
        M6.a aVar;
        O o7;
        t6.n nVar;
        t6.p pVar;
        Function2 function2;
        M6.a aVar2;
        M6.a aVar3;
        O o8;
        Object obj;
        t6.p pVar2;
        try {
            if (abstractC1356c instanceof C0763k) {
                c0763k = (C0763k) abstractC1356c;
                int i8 = c0763k.f10066y;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c0763k.f10066y = i8 - Integer.MIN_VALUE;
                    Object obj2 = c0763k.f10064f;
                    j6.a aVar4 = j6.a.f14642a;
                    i7 = c0763k.f10066y;
                    if (i7 != 0) {
                        AbstractC0603a.p0(obj2);
                        c0763k.f10059a = c0760h;
                        aVar = this.f10068a;
                        c0763k.f10060b = aVar;
                        t6.n nVar2 = this.f10069b;
                        c0763k.f10061c = nVar2;
                        t6.p pVar3 = this.f10070c;
                        c0763k.f10062d = pVar3;
                        o7 = this.f10071d;
                        c0763k.f10063e = o7;
                        c0763k.f10066y = 1;
                        if (aVar.a(c0763k) == aVar4) {
                            return aVar4;
                        }
                        nVar = nVar2;
                        pVar = pVar3;
                        function2 = c0760h;
                    } else {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                if (i7 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                obj = c0763k.f10061c;
                                pVar2 = (t6.p) c0763k.f10060b;
                                aVar2 = (M6.a) c0763k.f10059a;
                                try {
                                    AbstractC0603a.p0(obj2);
                                    pVar2.f16472a = obj;
                                    pVar = pVar2;
                                    Object obj3 = pVar.f16472a;
                                    aVar2.b(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    aVar2.b(null);
                                    throw th;
                                }
                            }
                            o8 = (O) c0763k.f10061c;
                            pVar = (t6.p) c0763k.f10060b;
                            aVar3 = (M6.a) c0763k.f10059a;
                            try {
                                AbstractC0603a.p0(obj2);
                                if (!t6.h.a(obj2, pVar.f16472a)) {
                                    aVar2 = aVar3;
                                    Object obj32 = pVar.f16472a;
                                    aVar2.b(null);
                                    return obj32;
                                }
                                c0763k.f10059a = aVar3;
                                c0763k.f10060b = pVar;
                                c0763k.f10061c = obj2;
                                c0763k.f10066y = 3;
                                if (o8.j(obj2, false, c0763k) == aVar4) {
                                    return aVar4;
                                }
                                obj = obj2;
                                pVar2 = pVar;
                                aVar2 = aVar3;
                                pVar2.f16472a = obj;
                                pVar = pVar2;
                                Object obj322 = pVar.f16472a;
                                aVar2.b(null);
                                return obj322;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar2 = aVar3;
                                aVar2.b(null);
                                throw th;
                            }
                        }
                        O o9 = c0763k.f10063e;
                        pVar = c0763k.f10062d;
                        nVar = (t6.n) c0763k.f10061c;
                        M6.a aVar5 = (M6.a) c0763k.f10060b;
                        Function2 function22 = (Function2) c0763k.f10059a;
                        AbstractC0603a.p0(obj2);
                        aVar = aVar5;
                        o7 = o9;
                        function2 = function22;
                    }
                    if (!nVar.f16470a) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = pVar.f16472a;
                    c0763k.f10059a = aVar;
                    c0763k.f10060b = pVar;
                    c0763k.f10061c = o7;
                    c0763k.f10062d = null;
                    c0763k.f10063e = null;
                    c0763k.f10066y = 2;
                    Object invoke = function2.invoke(obj4, c0763k);
                    if (invoke == aVar4) {
                        return aVar4;
                    }
                    aVar3 = aVar;
                    obj2 = invoke;
                    o8 = o7;
                    if (!t6.h.a(obj2, pVar.f16472a)) {
                    }
                }
            }
            if (!nVar.f16470a) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.b(null);
            throw th;
        }
        c0763k = new C0763k(this, abstractC1356c);
        Object obj22 = c0763k.f10064f;
        j6.a aVar42 = j6.a.f14642a;
        i7 = c0763k.f10066y;
        if (i7 != 0) {
        }
    }
}
