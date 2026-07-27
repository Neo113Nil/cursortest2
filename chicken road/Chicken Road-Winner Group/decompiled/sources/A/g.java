package A;

import java.util.ArrayList;
import p.C1161k;

/* loaded from: classes.dex */
public final class g implements C.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17b;

    public /* synthetic */ g(int i3, Object obj) {
        this.f16a = i3;
        this.f17b = obj;
    }

    @Override // C.a
    public final void accept(Object obj) {
        switch (this.f16a) {
            case 0:
                h hVar = (h) obj;
                if (hVar == null) {
                    hVar = new h(-3);
                }
                ((a1.e) this.f17b).C(hVar);
                return;
            default:
                h hVar2 = (h) obj;
                synchronized (i.f22c) {
                    try {
                        C1161k c1161k = i.f23d;
                        ArrayList arrayList = (ArrayList) c1161k.getOrDefault((String) this.f17b, null);
                        if (arrayList == null) {
                            return;
                        }
                        c1161k.remove((String) this.f17b);
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            ((C.a) arrayList.get(i3)).accept(hVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
