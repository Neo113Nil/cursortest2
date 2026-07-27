package sg.bigo.ads.x1;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f13388a;
    public final /* synthetic */ boolean b = false;
    public final /* synthetic */ f c;

    public d(f fVar, Context context) {
        this.c = fVar;
        this.f13388a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.c;
        Context context = this.f13388a;
        boolean z = this.b;
        fVar.getClass();
        if (sg.bigo.ads.F0.a.f()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = fVar.e.f12493a;
        Iterator it = fVar.c.iterator();
        while (it.hasNext()) {
            ((q) it.next()).c();
        }
        if (z2) {
            fVar.k = new CopyOnWriteArrayList();
            Iterator it2 = fVar.c.iterator();
            while (it2.hasNext()) {
                q qVar = (q) it2.next();
                if (!z || "bigo_tracker".equals(qVar.d)) {
                    if (qVar.b()) {
                        fVar.k.add(qVar);
                    }
                }
            }
            if (fVar.k.size() > 0) {
                s sVar = fVar.f;
                sVar.t = fVar.k;
                sVar.m = currentTimeMillis;
                sVar.l = 0;
                p.h.a(sVar);
            }
        }
        Iterator it3 = fVar.c.iterator();
        while (it3.hasNext()) {
            q qVar2 = (q) it3.next();
            if (!z || "bigo_tracker".equals(qVar2.d)) {
                if (qVar2.b()) {
                    fVar.a(context, "nurl_track", qVar2, z2);
                } else {
                    AbstractC5446j.a(2, new i(fVar, context, qVar2));
                }
            }
        }
    }
}
