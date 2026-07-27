package sg.bigo.ads.f;

import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f12775a;

    public s(v vVar) {
        this.f12775a = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar = w.f12778a;
        v vVar = this.f12775a;
        if (vVar == null) {
            xVar.getClass();
            return;
        }
        synchronized (xVar.f12779a) {
            Iterator it = xVar.f12779a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((sg.bigo.ads.e.h) ((WeakReference) it.next()).get()) == vVar) {
                    it.remove();
                    break;
                }
            }
        }
    }
}
