package R0;

import S0.InterfaceC0059b;
import android.util.Log;
import e2.C0289d;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class n implements InterfaceC0059b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1222a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1223b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1224c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1225d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1226e;
    public Object f;

    @Override // S0.InterfaceC0059b
    public void a(P0.b bVar) {
        ((c) this.f).f1203m.post(new A.a(this, bVar, 3, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    public void b() {
        P.h hVar;
        P.h hVar2 = (P.h) this.f1225d;
        if (hVar2 == null) {
            C0289d c0289d = (C0289d) this.f1224c;
            ListIterator listIterator = c0289d.listIterator(c0289d.b());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    hVar = 0;
                    break;
                } else {
                    hVar = listIterator.previous();
                    if (((P.h) hVar).f1100a) {
                        break;
                    }
                }
            }
            hVar2 = hVar;
        }
        this.f1225d = null;
        if (hVar2 == null) {
            ((Runnable) this.f1223b).run();
            return;
        }
        boolean j3 = P.k.j(3);
        P.k kVar = hVar2.f1101b;
        if (j3) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + kVar);
        }
        kVar.i();
        throw null;
    }

    public void c(P0.b bVar) {
        l lVar = (l) ((c) this.f).f1200j.get((a) this.f1224c);
        if (lVar != null) {
            lVar.p(bVar);
        }
    }
}
