package p077k6;

import p065i6.d;
import t6.f;
import t6.h;
import t6.q;
import t6.r;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i extends c implements f {
    private final int arity;

    public i(int i7, d dVar) {
        super(dVar);
        this.arity = i7;
    }

    @Override // t6.f
    public int getArity() {
        return this.arity;
    }

    @Override // p077k6.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        q.f16479a.getClass();
        String strA = r.a(this);
        h.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
