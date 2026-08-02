package F6;

import D6.B;
import D6.C0130m;
import a.AbstractC0603a;
import f6.C1116i;
import k6.AbstractC1356c;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final h f2822a = new h();

    public static b a(int i7, int i8, int i9) {
        b lVar;
        if ((i9 & 2) != 0) {
            i8 = 1;
        }
        if (i7 != -2) {
            if (i7 == -1) {
                if (i8 == 1) {
                    return new l(1, 2, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i7 != 0) {
                return i7 != Integer.MAX_VALUE ? i8 == 1 ? new b(i7, null) : new l(i7, i8, null) : new b(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, null);
            }
            lVar = i8 == 1 ? new b(0, null) : new l(1, i8, null);
        } else if (i8 == 1) {
            f.f2820h.getClass();
            lVar = new b(e.f2819b, null);
        } else {
            lVar = new l(1, i8, null);
        }
        return lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v5, types: [s6.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(p pVar, X0.j jVar, AbstractC1356c abstractC1356c) {
        m mVar;
        int i7;
        try {
            if (abstractC1356c instanceof m) {
                mVar = (m) abstractC1356c;
                int i8 = mVar.f2828c;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    mVar.f2828c = i8 - Integer.MIN_VALUE;
                    Object obj = mVar.f2827b;
                    j6.a aVar = j6.a.f14642a;
                    i7 = mVar.f2828c;
                    if (i7 != 0) {
                        AbstractC0603a.p0(obj);
                        if (mVar.getContext().get(B.f1775b) != pVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        mVar.f2826a = jVar;
                        mVar.f2828c = 1;
                        C0130m c0130m = new C0130m(1, P6.b.v(mVar));
                        c0130m.s();
                        ((o) pVar).R(new n(c0130m, 0));
                        jVar = jVar;
                        if (c0130m.r() == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r52 = mVar.f2826a;
                        AbstractC0603a.p0(obj);
                        jVar = r52;
                    }
                    jVar.invoke();
                    return C1116i.f13008a;
                }
            }
            if (i7 != 0) {
            }
            jVar.invoke();
            return C1116i.f13008a;
        } catch (Throwable th) {
            jVar.invoke();
            throw th;
        }
        mVar = new m(abstractC1356c);
        Object obj2 = mVar.f2827b;
        j6.a aVar2 = j6.a.f14642a;
        i7 = mVar.f2828c;
    }
}
