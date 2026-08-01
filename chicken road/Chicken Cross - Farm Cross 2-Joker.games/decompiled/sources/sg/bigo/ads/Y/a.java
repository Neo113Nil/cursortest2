package sg.bigo.ads.Y;

import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f12620a;
    public final /* synthetic */ d b;

    public a(d dVar, e eVar) {
        this.b = dVar;
        this.f12620a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.b.b.iterator();
        while (it.hasNext()) {
            e eVar = (e) ((WeakReference) it.next()).get();
            if (eVar != null && eVar == this.f12620a) {
                return;
            }
        }
        this.b.b.add(new WeakReference(this.f12620a));
    }
}
