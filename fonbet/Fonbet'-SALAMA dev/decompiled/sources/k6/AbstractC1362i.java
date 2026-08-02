package k6;

import i6.InterfaceC1287d;
import t6.q;
import t6.r;

/* renamed from: k6.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1362i extends AbstractC1356c implements t6.f {
    private final int arity;

    public AbstractC1362i(int i7, InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.arity = i7;
    }

    @Override // t6.f
    public int getArity() {
        return this.arity;
    }

    @Override // k6.AbstractC1354a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        q.f16473a.getClass();
        String a2 = r.a(this);
        t6.h.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
