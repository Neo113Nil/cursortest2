package sg.bigo.ads.h1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.c0.C5051b;
import sg.bigo.ads.d0.AbstractC5064a;

/* loaded from: classes3.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f12966a;

    public m(n nVar) {
        this.f12966a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f12966a;
        r rVar = nVar.b.f12969a;
        List list = nVar.f12967a;
        synchronized (rVar) {
            rVar.c.removeAll(list);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((C5051b) it.next()).f12702a));
            }
            AbstractC5064a.a(arrayList);
        }
        this.f12966a.b.f12969a.a();
        this.f12966a.b.a();
        u uVar = this.f12966a.b.f;
        if (uVar != null) {
            uVar.f12972a.c.a();
            uVar.f12972a.e.b();
        }
    }
}
