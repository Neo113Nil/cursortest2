package M;

import java.util.ArrayList;
import r.l;
import w1.P2;

/* loaded from: classes.dex */
public final class c implements O.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4525b;

    public /* synthetic */ c(Object obj, int i7) {
        this.f4524a = i7;
        this.f4525b = obj;
    }

    @Override // O.a
    public final void accept(Object obj) {
        switch (this.f4524a) {
            case 0:
                d dVar = (d) obj;
                if (dVar == null) {
                    dVar = new d(-3);
                }
                ((P2) this.f4525b).N(dVar);
                return;
            default:
                d dVar2 = (d) obj;
                synchronized (e.f4530c) {
                    try {
                        l lVar = e.f4531d;
                        ArrayList arrayList = (ArrayList) lVar.getOrDefault((String) this.f4525b, null);
                        if (arrayList == null) {
                            return;
                        }
                        lVar.remove((String) this.f4525b);
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            ((O.a) arrayList.get(i7)).accept(dVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
