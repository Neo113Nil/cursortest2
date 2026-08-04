package F6;

import D6.B;
import D6.C0130m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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
                if (i7 != Integer.MAX_VALUE) {
                    return i8 == 1 ? new b(i7, null) : new l(i7, i8, null);
                }
                return new b(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, null);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X0.j, s6.a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [s6.a] */
    /* JADX WARN: Type inference failed for: r5v3, types: [s6.a] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public static final Object b(p pVar, X0.j jVar, p077k6.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i7 = mVar.f2828c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                mVar.f2828c = i7 - Integer.MIN_VALUE;
            } else {
                mVar = new m(cVar);
            }
        } else {
            mVar = new m(cVar);
        }
        Object obj = mVar.f2827b;
        j6.a aVar = j6.a.f14648a;
        int i8 = mVar.f2828c;
        try {
            if (i8 == 0) {
                p003a.a.p0(obj);
                if (mVar.getContext().get(B.f1775b) != pVar) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                mVar.f2826a = jVar;
                mVar.f2828c = 1;
                C0130m c0130m = new C0130m(1, P6.b.v(mVar));
                c0130m.s();
                ((o) pVar).R(new n(c0130m, 0));
                if (c0130m.r() == aVar) {
                    jVar = jVar;
                    return aVar;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s6.a aVar2 = mVar.f2826a;
                p003a.a.p0(obj);
                jVar = aVar2;
            }
            jVar = jVar;
            jVar.invoke();
            return p044f6.i.f13014a;
        } catch (Throwable th) {
            jVar.invoke();
            throw th;
        }
    }
}
