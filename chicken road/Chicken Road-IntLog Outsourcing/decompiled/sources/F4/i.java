package F4;

import D4.C0007g;
import D4.C0021v;
import f4.v;
import l4.EnumC1260a;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final h f729a = new h();

    public static b a(int i2, int i3, int i6) {
        b mVar;
        if ((i6 & 2) != 0) {
            i3 = 1;
        }
        if (i2 != -2) {
            if (i2 == -1) {
                if (i3 == 1) {
                    return new m(1, 2, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i2 != 0) {
                return i2 != Integer.MAX_VALUE ? i3 == 1 ? new b(i2, null) : new m(i2, i3, null) : new b(Integer.MAX_VALUE, null);
            }
            mVar = i3 == 1 ? new b(0, null) : new m(1, i3, null);
        } else if (i3 == 1) {
            f.f727M.getClass();
            mVar = new b(e.f726b, null);
        } else {
            mVar = new m(1, i3, null);
        }
        return mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v5, types: [t4.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(q qVar, O.b bVar, AbstractC1295c abstractC1295c) {
        n nVar;
        int i2;
        try {
            if (abstractC1295c instanceof n) {
                nVar = (n) abstractC1295c;
                int i3 = nVar.f736c;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    nVar.f736c = i3 - Integer.MIN_VALUE;
                    Object obj = nVar.f735b;
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    i2 = nVar.f736c;
                    if (i2 != 0) {
                        e5.g.y(obj);
                        if (nVar.getContext().o(C0021v.f545b) != qVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        nVar.f734a = bVar;
                        nVar.f736c = 1;
                        C0007g c0007g = new C0007g(1, B0.f.F(nVar));
                        c0007g.s();
                        ((p) qVar).Z(new o(0, c0007g));
                        bVar = bVar;
                        if (c0007g.r() == enumC1260a) {
                            return enumC1260a;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r5 = nVar.f734a;
                        e5.g.y(obj);
                        bVar = r5;
                    }
                    bVar.invoke();
                    return v.f5689a;
                }
            }
            if (i2 != 0) {
            }
            bVar.invoke();
            return v.f5689a;
        } catch (Throwable th) {
            bVar.invoke();
            throw th;
        }
        nVar = new n(abstractC1295c);
        Object obj2 = nVar.f735b;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = nVar.f736c;
    }

    public static final Throwable c(Object obj) {
        g gVar = obj instanceof g ? (g) obj : null;
        if (gVar != null) {
            return gVar.f728a;
        }
        return null;
    }
}
