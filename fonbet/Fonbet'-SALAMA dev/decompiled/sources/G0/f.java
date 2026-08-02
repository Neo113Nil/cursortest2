package G0;

import android.os.Bundle;
import androidx.lifecycle.C0736j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import o.C1484b;
import o.C1485c;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public boolean f2841b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f2842c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2843d;

    /* renamed from: e, reason: collision with root package name */
    public a f2844e;

    /* renamed from: a, reason: collision with root package name */
    public final o.f f2840a = new o.f();

    /* renamed from: f, reason: collision with root package name */
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
            C1484b c1484b = (C1484b) it;
            if (!c1484b.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) c1484b.next();
            t6.h.d(entry, "components");
            str = (String) entry.getKey();
            eVar = (e) entry.getValue();
        } while (!t6.h.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return eVar;
    }

    public final void c(String str, e eVar) {
        Object obj;
        t6.h.e(eVar, "provider");
        o.f fVar = this.f2840a;
        C1485c l7 = fVar.l(str);
        if (l7 != null) {
            obj = l7.f15520b;
        } else {
            C1485c c1485c = new C1485c(str, eVar);
            fVar.f15529d++;
            C1485c c1485c2 = fVar.f15527b;
            if (c1485c2 == null) {
                fVar.f15526a = c1485c;
                fVar.f15527b = c1485c;
            } else {
                c1485c2.f15521c = c1485c;
                c1485c.f15522d = c1485c2;
                fVar.f15527b = c1485c;
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
            C0736j.class.getDeclaredConstructor(null);
            a aVar2 = this.f2844e;
            if (aVar2 != null) {
                ((LinkedHashSet) aVar2.f2836b).add(C0736j.class.getName());
            }
        } catch (NoSuchMethodException e7) {
            throw new IllegalArgumentException("Class " + C0736j.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e7);
        }
    }
}
