package p077k6;

import p065i6.d;
import t6.f;
import t6.q;
import t6.r;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h extends g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14801a;

    public h(d dVar) {
        super(dVar);
        this.f14801a = 2;
    }

    @Override // t6.f
    public final int getArity() {
        return this.f14801a;
    }

    @Override // p077k6.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        q.f16479a.getClass();
        String strA = r.a(this);
        t6.h.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
