package k6;

import i6.InterfaceC1287d;
import t6.q;
import t6.r;

/* renamed from: k6.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1361h extends AbstractC1360g implements t6.f {

    /* renamed from: a, reason: collision with root package name */
    public final int f14795a;

    public AbstractC1361h(InterfaceC1287d interfaceC1287d) {
        super(interfaceC1287d);
        this.f14795a = 2;
    }

    @Override // t6.f
    public final int getArity() {
        return this.f14795a;
    }

    @Override // k6.AbstractC1354a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        q.f16473a.getClass();
        String a2 = r.a(this);
        t6.h.d(a2, "renderLambdaToString(...)");
        return a2;
    }
}
