package t6;

import java.io.Serializable;

/* loaded from: classes2.dex */
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
        q.f16473a.getClass();
        String a2 = r.a(this);
        h.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
