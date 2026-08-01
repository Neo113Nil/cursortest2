package sg.bigo.ads.h1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.K0.H;
import sg.bigo.ads.c0.C5051b;
import sg.bigo.ads.d0.AbstractC5064a;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.g1.a f12963a;
    public final Set b;
    public final Set c;
    public long d = 0;
    public i e;

    public h(sg.bigo.ads.g1.a aVar) {
        this.f12963a = aVar;
        this.b = H.a(aVar.f12797a);
        this.c = H.a(aVar.f12797a);
        sg.bigo.ads.i1.c.a(new g(this));
    }

    public final synchronized void a(List list, boolean z) {
        this.c.removeAll(list);
        if (z) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((C5051b) it.next()).f12702a));
            }
            AbstractC5064a.a(arrayList);
        } else {
            this.b.addAll(list);
        }
    }

    public final synchronized boolean a() {
        return this.b.isEmpty();
    }
}
