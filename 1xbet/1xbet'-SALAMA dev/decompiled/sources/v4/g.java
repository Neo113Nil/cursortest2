package v4;

import A1.M0;
import java.util.Stack;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ M0 f17187m;

    public g(M0 m7) {
        this.f17187m = m7;
    }

    @Override // v4.e
    public final void p0(c cVar, r rVar) {
        M0 m7 = this.f17187m;
        m7.c();
        if (m7.f120c) {
            ((StringBuilder) m7.f121d).append(",");
        }
        ((StringBuilder) m7.f121d).append(p120q4.k.f(cVar.f17179a));
        ((StringBuilder) m7.f121d).append(":(");
        int i7 = m7.f119b;
        Stack stack = (Stack) m7.f122e;
        if (i7 == stack.size()) {
            stack.add(cVar);
        } else {
            stack.set(m7.f119b, cVar);
        }
        m7.f119b++;
        m7.f120c = false;
        p028d6.k.s(rVar, m7);
        m7.f119b--;
        StringBuilder sb = (StringBuilder) m7.f121d;
        if (sb != null) {
            sb.append(")");
        }
        m7.f120c = true;
    }
}
