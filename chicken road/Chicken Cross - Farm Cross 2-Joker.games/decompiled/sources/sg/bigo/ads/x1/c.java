package sg.bigo.ads.x1;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f13387a;
    public final /* synthetic */ boolean b = false;
    public final /* synthetic */ int c;
    public final /* synthetic */ f d;

    public c(f fVar, Context context, int i) {
        this.d = fVar;
        this.f13387a = context;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.d;
        Context context = this.f13387a;
        boolean z = this.b;
        int i = this.c;
        fVar.getClass();
        if (sg.bigo.ads.F0.a.f()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = fVar.e.f12493a;
        Iterator it = fVar.f13390a.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            if (i > 0) {
                qVar.l.put("ad_imp_indx", String.valueOf(i));
            }
            qVar.c();
        }
        if (z2) {
            fVar.i = new CopyOnWriteArrayList();
            Iterator it2 = fVar.f13390a.iterator();
            while (it2.hasNext()) {
                q qVar2 = (q) it2.next();
                if (!z || "bigo_tracker".equals(qVar2.d)) {
                    if (qVar2.b()) {
                        fVar.i.add(qVar2);
                    }
                }
            }
            if (fVar.i.size() > 0) {
                s sVar = fVar.f;
                sVar.r = fVar.i;
                sVar.i = currentTimeMillis;
                sVar.h = 0;
                p.h.a(sVar);
            }
        }
        Iterator it3 = fVar.f13390a.iterator();
        while (it3.hasNext()) {
            q qVar3 = (q) it3.next();
            if (!z || "bigo_tracker".equals(qVar3.d)) {
                if (qVar3.b()) {
                    fVar.a(context, "impl_track", qVar3, z2);
                } else {
                    AbstractC5446j.a(2, null, new g(fVar, context, qVar3), 0L);
                }
            }
        }
    }
}
