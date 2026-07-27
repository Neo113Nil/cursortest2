package y2;

import d2.C0279i;
import h2.EnumC0326a;
import i2.AbstractC0343b;
import w2.C1227f;
import w2.C1240t;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final h f10623a = new h();

    public static b a(int i3, int i4, int i5) {
        if ((i5 & 2) != 0) {
            i4 = 1;
        }
        if (i3 == -2) {
            if (i4 != 1) {
                return new l(1, i4);
            }
            f.f10621x0.getClass();
            return new b(e.f10620b);
        }
        if (i3 != -1) {
            return i3 != 0 ? i3 != Integer.MAX_VALUE ? i4 == 1 ? new b(i3) : new l(i3, i4) : new b(Integer.MAX_VALUE) : i4 == 1 ? new b(0) : new l(1, i4);
        }
        if (i4 == 1) {
            return new l(1, 2);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v5, types: [o2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(o oVar, M.b bVar, AbstractC0343b abstractC0343b) {
        m mVar;
        int i3;
        try {
            if (abstractC0343b instanceof m) {
                mVar = (m) abstractC0343b;
                int i4 = mVar.f;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    mVar.f = i4 - Integer.MIN_VALUE;
                    Object obj = mVar.f10627e;
                    EnumC0326a enumC0326a = EnumC0326a.f4994a;
                    i3 = mVar.f;
                    if (i3 != 0) {
                        X0.a.L(obj);
                        g2.h hVar = mVar.f5029b;
                        kotlin.jvm.internal.j.b(hVar);
                        if (hVar.k(C1240t.f10525b) != oVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        mVar.f10626d = bVar;
                        mVar.f = 1;
                        C1227f c1227f = new C1227f(1, F2.b.y(mVar));
                        c1227f.t();
                        ((n) oVar).V(new E2.g(3, c1227f));
                        bVar = bVar;
                        if (c1227f.s() == enumC0326a) {
                            return enumC0326a;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r5 = mVar.f10626d;
                        X0.a.L(obj);
                        bVar = r5;
                    }
                    bVar.invoke();
                    return C0279i.f4852a;
                }
            }
            if (i3 != 0) {
            }
            bVar.invoke();
            return C0279i.f4852a;
        } catch (Throwable th) {
            bVar.invoke();
            throw th;
        }
        mVar = new m(abstractC0343b);
        Object obj2 = mVar.f10627e;
        EnumC0326a enumC0326a2 = EnumC0326a.f4994a;
        i3 = mVar.f;
    }
}
