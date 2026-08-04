package G0;

import android.os.Bundle;
import androidx.lifecycle.C0715j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f2842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f2844e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p101o.f f2840a = new p101o.f();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2845f = true;

    public final Bundle a(String str) {
        if (!this.f2843d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = this.f2842c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f2842c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f2842c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f2842c = null;
        }
        return bundle2;
    }

    public final e b() {
        String str;
        e eVar;
        Iterator it = this.f2840a.iterator();
        do {
            p101o.b bVar = (p101o.b) it;
            if (!bVar.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            t6.h.d(entry, "components");
            str = (String) entry.getKey();
            eVar = (e) entry.getValue();
        } while (!t6.h.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return eVar;
    }

    public final void c(String str, e eVar) {
        Object obj;
        t6.h.e(eVar, "provider");
        p101o.f fVar = this.f2840a;
        p101o.c cVarL = fVar.l(str);
        if (cVarL != null) {
            obj = cVarL.f15526b;
        } else {
            p101o.c cVar = new p101o.c(str, eVar);
            fVar.f15535d++;
            p101o.c cVar2 = fVar.f15533b;
            if (cVar2 == null) {
                fVar.f15532a = cVar;
                fVar.f15533b = cVar;
            } else {
                cVar2.f15527c = cVar;
                cVar.f15528d = cVar2;
                fVar.f15533b = cVar;
            }
            obj = null;
        }
        if (((e) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public final void d() {
        if (!this.f2845f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a aVar = this.f2844e;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f2844e = aVar;
        try {
            C0715j.class.getDeclaredConstructor(null);
            a aVar2 = this.f2844e;
            if (aVar2 != null) {
                ((LinkedHashSet) aVar2.f2836b).add(C0715j.class.getName());
            }
        } catch (NoSuchMethodException e7) {
            throw new IllegalArgumentException("Class " + C0715j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
        }
    }
}
