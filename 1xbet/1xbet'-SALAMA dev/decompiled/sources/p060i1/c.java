package p060i1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import p023d1.n;
import p067j1.b;
import p067j1.d;
import p072k1.e;
import p072k1.f;
import p072k1.g;
import p111p1.a;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f13839d = n.g("WorkConstraintsTracker");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f13840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b[] f13841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13842c;

    public c(Context context, a aVar, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f13840a = bVar;
        this.f13841b = new b[]{new p067j1.a((p072k1.a) g.B(applicationContext, aVar).f14680a, 0), new p067j1.a((p072k1.b) g.B(applicationContext, aVar).f14681b, 1), new p067j1.a((f) g.B(applicationContext, aVar).f14683d, 4), new p067j1.a((e) g.B(applicationContext, aVar).f14682c, 2), new p067j1.a((e) g.B(applicationContext, aVar).f14682c, 3), new d((e) g.B(applicationContext, aVar).f14682c), new p067j1.c((e) g.B(applicationContext, aVar).f14682c)};
        this.f13842c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.f13842c) {
            try {
                for (b bVar : this.f13841b) {
                    Object obj = bVar.f14553b;
                    if (obj != null && bVar.b(obj) && bVar.f14552a.contains(str)) {
                        n.d().b(f13839d, "Work " + str + " constrained by " + bVar.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Collection collection) {
        synchronized (this.f13842c) {
            try {
                for (b bVar : this.f13841b) {
                    if (bVar.f14555d != null) {
                        bVar.f14555d = null;
                        bVar.d(null, bVar.f14553b);
                    }
                }
                for (b bVar2 : this.f13841b) {
                    bVar2.c(collection);
                }
                for (b bVar3 : this.f13841b) {
                    if (bVar3.f14555d != this) {
                        bVar3.f14555d = this;
                        bVar3.d(this, bVar3.f14553b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        synchronized (this.f13842c) {
            try {
                for (b bVar : this.f13841b) {
                    ArrayList arrayList = bVar.f14552a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        bVar.f14554c.b(bVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
