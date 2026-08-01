package sg.bigo.ads.h1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import sg.bigo.ads.K0.H;
import sg.bigo.ads.c0.C5051b;
import sg.bigo.ads.d0.AbstractC5064a;

/* loaded from: classes3.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.g1.a f12971a;
    public final Set b = H.a(c());
    public final Set c = H.a(c());

    public r(sg.bigo.ads.g1.a aVar) {
        this.f12971a = aVar;
        sg.bigo.ads.i1.c.a(new q(this));
    }

    public final synchronized void a(C5051b c5051b) {
        this.b.add(c5051b);
        c5051b.f12702a = AbstractC5064a.a(c5051b);
    }

    public final synchronized void b() {
        this.c.clear();
        this.b.clear();
    }

    public int c() {
        return this.f12971a.f12797a;
    }

    public final synchronized int d() {
        return this.b.size();
    }

    public final synchronized boolean e() {
        return this.b.isEmpty();
    }

    public abstract ArrayList f();

    public final synchronized void a() {
        if (this.b.isEmpty()) {
            ArrayList f = f();
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                f.remove((C5051b) it.next());
            }
            this.b.addAll(f);
        }
    }
}
