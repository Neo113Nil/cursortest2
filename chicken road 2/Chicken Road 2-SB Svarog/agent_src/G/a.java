package G;

import android.util.SparseArray;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f147a;

    public a(c cVar) {
        this.f147a = cVar;
    }

    @Override // G.b
    public final void a() {
        c cVar = this.f147a;
        Iterator it = cVar.v.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        io.flutter.plugin.platform.k kVar = cVar.f168s;
        SparseArray sparseArray = kVar.f700l;
        while (sparseArray.size() > 0) {
            kVar.v.l(sparseArray.keyAt(0));
        }
        io.flutter.plugin.platform.j jVar = cVar.f169t;
        SparseArray sparseArray2 = jVar.f682h;
        while (sparseArray2.size() > 0) {
            jVar.f689o.d(sparseArray2.keyAt(0));
        }
        cVar.f160k.f328b = null;
    }

    @Override // G.b
    public final void b() {
    }
}
