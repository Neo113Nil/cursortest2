package k1;

import G.v;
import java.util.ArrayList;
import m1.InterfaceC2083a;
import r.Q;

/* loaded from: classes.dex */
public final class f implements InterfaceC2083a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17564a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17565b;

    public /* synthetic */ f(int i, Object obj) {
        this.f17564a = i;
        this.f17565b = obj;
    }

    @Override // m1.InterfaceC2083a
    public final void accept(Object obj) {
        switch (this.f17564a) {
            case 0:
                g gVar = (g) obj;
                if (gVar == null) {
                    gVar = new g(-3);
                }
                ((v) this.f17565b).l(gVar);
                return;
            default:
                g gVar2 = (g) obj;
                synchronized (h.f17570c) {
                    try {
                        Q q5 = h.f17571d;
                        ArrayList arrayList = (ArrayList) q5.get((String) this.f17565b);
                        if (arrayList == null) {
                            return;
                        }
                        q5.remove((String) this.f17565b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC2083a) arrayList.get(i)).accept(gVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
