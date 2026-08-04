package t6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i implements f, Serializable {
    private final int arity;

    public i(int i7) {
        this.arity = i7;
    }

    @Override // t6.f
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        q.f16479a.getClass();
        String strA = r.a(this);
        h.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
