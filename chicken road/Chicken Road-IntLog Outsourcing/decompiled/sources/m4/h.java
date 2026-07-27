package m4;

import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: classes.dex */
public abstract class h extends AbstractC1295c implements kotlin.jvm.internal.f {
    private final int arity;

    public h(int i2, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.arity = i2;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    @Override // m4.AbstractC1293a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        t.f10742a.getClass();
        String a6 = u.a(this);
        i.d(a6, "renderLambdaToString(...)");
        return a6;
    }
}
