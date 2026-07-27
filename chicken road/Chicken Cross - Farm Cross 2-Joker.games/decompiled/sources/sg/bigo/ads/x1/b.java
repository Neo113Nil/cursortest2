package sg.bigo.ads.x1;

import android.content.Context;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import sg.bigo.ads.q0.AbstractC5446j;

/* loaded from: classes3.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f13386a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ f e;

    public b(f fVar, Context context, boolean z, int i, int i2) {
        this.e = fVar;
        this.f13386a = context;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.e;
        Context context = this.f13386a;
        boolean z = this.b;
        int i = this.c;
        int i2 = this.d;
        fVar.getClass();
        if (sg.bigo.ads.F0.a.f()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = fVar.e.f12493a;
        Iterator it = fVar.b.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            if (i > 0) {
                qVar.l.put("ad_click_indx", String.valueOf(i));
            }
            if (i2 > 0) {
                qVar.l.put("ad_imp_indx", String.valueOf(i2));
            }
            qVar.c();
        }
        if (z2) {
            fVar.j = new CopyOnWriteArrayList();
            Iterator it2 = fVar.b.iterator();
            while (it2.hasNext()) {
                q qVar2 = (q) it2.next();
                if (!z || "bigo_tracker".equals(qVar2.d)) {
                    if (qVar2.b()) {
                        fVar.j.add(qVar2);
                    }
                }
            }
            if (fVar.j.size() > 0) {
                s sVar = fVar.f;
                sVar.s = fVar.j;
                sVar.k = currentTimeMillis;
                sVar.j = 0;
                p.h.a(sVar);
            }
        }
        Iterator it3 = fVar.b.iterator();
        while (it3.hasNext()) {
            q qVar3 = (q) it3.next();
            if (!z || "bigo_tracker".equals(qVar3.d)) {
                if (qVar3.b()) {
                    fVar.a(context, "click_track", qVar3, z2);
                } else {
                    AbstractC5446j.a(2, null, new h(fVar, context, qVar3), 0L);
                }
            }
        }
    }
}
