package V;

import android.os.Bundle;
import androidx.lifecycle.j;
import androidx.lifecycle.k;
import androidx.lifecycle.w;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1599a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1600b;

    public /* synthetic */ a(int i3, Object obj) {
        this.f1599a = i3;
        this.f1600b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [V.g, java.lang.Object] */
    @Override // androidx.lifecycle.j
    public final void a(k kVar, androidx.lifecycle.e eVar) {
        switch (this.f1599a) {
            case 0:
                if (eVar != androidx.lifecycle.e.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                kVar.e().b(this);
                Bundle a3 = this.f1600b.b().a("androidx.savedstate.Restarter");
                if (a3 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = a3.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                Iterator<String> it = stringArrayList.iterator();
                if (it.hasNext()) {
                    String next = it.next();
                    try {
                        Class<? extends U> asSubclass = Class.forName(next, false, a.class.getClassLoader()).asSubclass(c.class);
                        kotlin.jvm.internal.j.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                kotlin.jvm.internal.j.d(declaredConstructor.newInstance(new Object[0]), "{\n                constr…wInstance()\n            }");
                                throw new ClassCastException();
                            } catch (Exception e3) {
                                throw new RuntimeException(B0.c.j("Failed to instantiate ", next), e3);
                            }
                        } catch (NoSuchMethodException e4) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e4);
                        }
                    } catch (ClassNotFoundException e5) {
                        throw new RuntimeException(B0.c.k("Class ", next, " wasn't found"), e5);
                    }
                }
                return;
            default:
                if (eVar != androidx.lifecycle.e.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + eVar).toString());
                }
                kVar.e().b(this);
                w wVar = (w) this.f1600b;
                if (wVar.f2338b) {
                    return;
                }
                Bundle a4 = wVar.f2337a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = wVar.f2339c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (a4 != null) {
                    bundle.putAll(a4);
                }
                wVar.f2339c = bundle;
                wVar.f2338b = true;
                return;
        }
    }
}
