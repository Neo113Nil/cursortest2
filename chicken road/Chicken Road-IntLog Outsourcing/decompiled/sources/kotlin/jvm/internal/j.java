package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class j implements f, Serializable {
    private final int arity;

    public j(int i2) {
        this.arity = i2;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        t.f10742a.getClass();
        String a6 = u.a(this);
        i.d(a6, "renderLambdaToString(...)");
        return a6;
    }
}
