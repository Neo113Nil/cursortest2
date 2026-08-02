package v2;

import b4.EnumC0510a;
import c4.AbstractC0542c;
import p4.AbstractC2282w;
import p4.C2268h;
import p4.Q;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final m f20398a;

    /* renamed from: b, reason: collision with root package name */
    public final E2.m f20399b;

    /* renamed from: c, reason: collision with root package name */
    public final x4.i f20400c;

    /* renamed from: d, reason: collision with root package name */
    public final i f20401d;

    public d(m mVar, E2.m mVar2, x4.i iVar, i iVar2) {
        this.f20398a = mVar;
        this.f20399b = mVar2;
        this.f20400c = iVar;
        this.f20401d = iVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x007a, code lost:
    
        r2.j(r5, r9.f21109b);
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC0542c abstractC0542c) {
        c cVar;
        EnumC0510a enumC0510a;
        int i;
        x4.i iVar;
        int andDecrement;
        int i5;
        d dVar;
        Object obj;
        Throwable th;
        Object w5;
        try {
            if (abstractC0542c instanceof c) {
                cVar = (c) abstractC0542c;
                int i6 = cVar.f20397o;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    cVar.f20397o = i6 - Integer.MIN_VALUE;
                    Object obj2 = cVar.f20395m;
                    enumC0510a = EnumC0510a.f7289k;
                    i = cVar.f20397o;
                    if (i != 0) {
                        G4.l.N(obj2);
                        cVar.f20393k = this;
                        iVar = this.f20400c;
                        cVar.f20394l = iVar;
                        cVar.f20397o = 1;
                        iVar.getClass();
                        do {
                            andDecrement = x4.h.f21107g.getAndDecrement(iVar);
                            i5 = iVar.f21108a;
                        } while (andDecrement > i5);
                        Object obj3 = W3.o.f6046a;
                        if (andDecrement <= 0) {
                            C2268h k5 = AbstractC2282w.k(AbstractC2346c.v(cVar));
                            try {
                                if (!iVar.a(k5)) {
                                    while (true) {
                                        int andDecrement2 = x4.h.f21107g.getAndDecrement(iVar);
                                        if (andDecrement2 <= i5) {
                                            if (andDecrement2 > 0) {
                                                break;
                                            }
                                            if (iVar.a(k5)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                                Object q5 = k5.q();
                                if (q5 != enumC0510a) {
                                    q5 = obj3;
                                }
                                if (q5 == enumC0510a) {
                                    obj3 = q5;
                                }
                            } catch (Throwable th2) {
                                k5.z();
                                throw th2;
                            }
                        }
                        if (obj3 != enumC0510a) {
                            dVar = this;
                        }
                        return enumC0510a;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = (x4.e) cVar.f20393k;
                        try {
                            G4.l.N(obj2);
                            f fVar = (f) obj2;
                            ((x4.h) obj).b();
                            return fVar;
                        } catch (Throwable th3) {
                            th = th3;
                            ((x4.h) obj).b();
                            throw th;
                        }
                    }
                    x4.i iVar2 = cVar.f20394l;
                    dVar = (d) cVar.f20393k;
                    G4.l.N(obj2);
                    iVar = iVar2;
                    O3.l lVar = new O3.l(14, dVar);
                    cVar.f20393k = iVar;
                    cVar.f20394l = null;
                    cVar.f20397o = 2;
                    w5 = AbstractC2282w.w(a4.i.f6649k, new Q(lVar, null), cVar);
                    if (w5 != enumC0510a) {
                        obj = iVar;
                        obj2 = w5;
                        f fVar2 = (f) obj2;
                        ((x4.h) obj).b();
                        return fVar2;
                    }
                    return enumC0510a;
                }
            }
            O3.l lVar2 = new O3.l(14, dVar);
            cVar.f20393k = iVar;
            cVar.f20394l = null;
            cVar.f20397o = 2;
            w5 = AbstractC2282w.w(a4.i.f6649k, new Q(lVar2, null), cVar);
            if (w5 != enumC0510a) {
            }
            return enumC0510a;
        } catch (Throwable th4) {
            obj = iVar;
            th = th4;
            ((x4.h) obj).b();
            throw th;
        }
        cVar = new c(this, abstractC0542c);
        Object obj22 = cVar.f20395m;
        enumC0510a = EnumC0510a.f7289k;
        i = cVar.f20397o;
        if (i != 0) {
        }
    }
}
