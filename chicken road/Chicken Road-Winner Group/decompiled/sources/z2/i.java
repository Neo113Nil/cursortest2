package z2;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;

/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0.i f10719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K.r f10720b;

    public i(b0.i iVar, K.r rVar) {
        this.f10719a = iVar;
        this.f10720b = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // z2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(e eVar, InterfaceC0319c interfaceC0319c) {
        h hVar;
        EnumC0326a enumC0326a;
        int i3;
        i iVar;
        s sVar;
        K.r rVar;
        A2.n nVar;
        Throwable th;
        A2.n nVar2;
        K.r rVar2;
        try {
            if (interfaceC0319c instanceof h) {
                hVar = (h) interfaceC0319c;
                int i4 = hVar.f10716e;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    hVar.f10716e = i4 - Integer.MIN_VALUE;
                    Object obj = hVar.f10715d;
                    enumC0326a = EnumC0326a.f4994a;
                    i3 = hVar.f10716e;
                    if (i3 != 0) {
                        X0.a.L(obj);
                        try {
                            b0.i iVar2 = this.f10719a;
                            hVar.f10717g = this;
                            hVar.f10718h = eVar;
                            hVar.f10716e = 1;
                            if (iVar2.l(eVar, hVar) != enumC0326a) {
                                iVar = this;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            iVar = this;
                            sVar = new s(th);
                            rVar = iVar.f10720b;
                            hVar.f10717g = th;
                            hVar.f10718h = null;
                            hVar.f10716e = 2;
                            if (q.a(sVar, rVar, th, hVar) != enumC0326a) {
                                return enumC0326a;
                            }
                            throw th;
                        }
                        return enumC0326a;
                    }
                    if (i3 != 1) {
                        if (i3 == 2) {
                            Throwable th3 = (Throwable) hVar.f10717g;
                            X0.a.L(obj);
                            throw th3;
                        }
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        nVar2 = (A2.n) hVar.f10717g;
                        try {
                            X0.a.L(obj);
                            nVar2.h();
                            return C0279i.f4852a;
                        } catch (Throwable th4) {
                            th = th4;
                            nVar2.h();
                            throw th;
                        }
                    }
                    eVar = hVar.f10718h;
                    iVar = (i) hVar.f10717g;
                    try {
                        X0.a.L(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        sVar = new s(th);
                        rVar = iVar.f10720b;
                        hVar.f10717g = th;
                        hVar.f10718h = null;
                        hVar.f10716e = 2;
                        if (q.a(sVar, rVar, th, hVar) != enumC0326a) {
                        }
                    }
                    g2.h hVar2 = hVar.f5029b;
                    kotlin.jvm.internal.j.b(hVar2);
                    nVar = new A2.n(eVar, hVar2);
                    rVar2 = iVar.f10720b;
                    hVar.f10717g = nVar;
                    hVar.f10718h = null;
                    hVar.f10716e = 3;
                    if (rVar2.i(nVar, null, hVar) != enumC0326a) {
                        nVar2 = nVar;
                        nVar2.h();
                        return C0279i.f4852a;
                    }
                    return enumC0326a;
                }
            }
            rVar2 = iVar.f10720b;
            hVar.f10717g = nVar;
            hVar.f10718h = null;
            hVar.f10716e = 3;
            if (rVar2.i(nVar, null, hVar) != enumC0326a) {
            }
            return enumC0326a;
        } catch (Throwable th6) {
            th = th6;
            nVar2 = nVar;
            nVar2.h();
            throw th;
        }
        hVar = new h(this, interfaceC0319c);
        Object obj2 = hVar.f10715d;
        enumC0326a = EnumC0326a.f4994a;
        i3 = hVar.f10716e;
        if (i3 != 0) {
        }
        g2.h hVar22 = hVar.f5029b;
        kotlin.jvm.internal.j.b(hVar22);
        nVar = new A2.n(eVar, hVar22);
    }
}
