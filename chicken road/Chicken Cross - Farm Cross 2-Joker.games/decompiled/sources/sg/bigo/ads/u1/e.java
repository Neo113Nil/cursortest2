package sg.bigo.ads.u1;

import java.util.ArrayList;
import java.util.Iterator;
import sg.bigo.ads.c0.C5052c;

/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f13337a;

    public e(f fVar) {
        this.f13337a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f13337a;
        fVar.b.c.a(fVar.f13338a, true);
        i iVar = this.f13337a.b.c;
        synchronized (iVar) {
            if (iVar.b.isEmpty()) {
                ArrayList a2 = iVar.a();
                Iterator it = iVar.c.iterator();
                while (it.hasNext()) {
                    a2.remove((C5052c) it.next());
                }
                iVar.b.addAll(a2);
            }
        }
        this.f13337a.b.b();
    }
}
