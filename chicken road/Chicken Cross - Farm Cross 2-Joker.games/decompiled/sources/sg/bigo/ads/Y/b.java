package sg.bigo.ads.Y;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import sg.bigo.ads.k1.A;

/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f12621a;
    public final /* synthetic */ d b;

    public b(d dVar, A a2) {
        this.b = dVar;
        this.f12621a = a2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.b.b.iterator();
        while (it.hasNext()) {
            e eVar = (e) ((WeakReference) it.next()).get();
            e eVar2 = this.f12621a;
            if (eVar2 != null && eVar == eVar2) {
                it.remove();
                return;
            }
        }
    }
}
