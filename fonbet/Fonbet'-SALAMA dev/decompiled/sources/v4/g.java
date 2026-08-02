package v4;

import A1.M0;
import d6.C0977k;
import java.util.Stack;

/* loaded from: classes2.dex */
public final class g extends e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M0 f17181m;

    public g(M0 m02) {
        this.f17181m = m02;
    }

    @Override // v4.e
    public final void p0(c cVar, r rVar) {
        M0 m02 = this.f17181m;
        m02.c();
        if (m02.f120c) {
            ((StringBuilder) m02.f121d).append(",");
        }
        ((StringBuilder) m02.f121d).append(q4.k.f(cVar.f17173a));
        ((StringBuilder) m02.f121d).append(":(");
        int i7 = m02.f119b;
        Stack stack = (Stack) m02.f122e;
        if (i7 == stack.size()) {
            stack.add(cVar);
        } else {
            stack.set(m02.f119b, cVar);
        }
        m02.f119b++;
        m02.f120c = false;
        C0977k.s(rVar, m02);
        m02.f119b--;
        StringBuilder sb = (StringBuilder) m02.f121d;
        if (sb != null) {
            sb.append(")");
        }
        m02.f120c = true;
    }
}
