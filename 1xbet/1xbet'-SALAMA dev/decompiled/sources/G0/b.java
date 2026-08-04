package G0;

import W5.AbstractC0486a1;
import android.os.Bundle;
import androidx.lifecycle.EnumC0718m;
import androidx.lifecycle.InterfaceC0713h;
import androidx.lifecycle.InterfaceC0724t;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import androidx.lifecycle.S;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import androidx.lifecycle.r;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2838b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f2837a = i7;
        this.f2838b = obj;
    }

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0724t interfaceC0724t, EnumC0718m enumC0718m) {
        switch (this.f2837a) {
            case 0:
                if (enumC0718m != EnumC0718m.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0724t.getLifecycle().b(this);
                h hVar = (h) this.f2838b;
                Bundle bundleA = hVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(d.class);
                        t6.h.d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                t6.h.d(objNewInstance, "{\n                constr…wInstance()\n            }");
                                if (!(hVar instanceof Y)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                X viewModelStore = ((Y) hVar).getViewModelStore();
                                f savedStateRegistry = hVar.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f9613a;
                                for (String str2 : new HashSet(linkedHashMap.keySet())) {
                                    t6.h.e(str2, "key");
                                    S s7 = (S) linkedHashMap.get(str2);
                                    t6.h.b(s7);
                                    M.a(s7, savedStateRegistry, hVar.getLifecycle());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e7) {
                                throw new RuntimeException(L.i("Failed to instantiate ", str), e7);
                            }
                        } catch (NoSuchMethodException e8) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e8);
                        }
                    } catch (ClassNotFoundException e9) {
                        throw new RuntimeException(AbstractC0486a1.h("Class ", str, " wasn't found"), e9);
                    }
                }
                return;
            case 1:
                new HashMap();
                InterfaceC0713h[] interfaceC0713hArr = (InterfaceC0713h[]) this.f2838b;
                if (interfaceC0713hArr.length > 0) {
                    InterfaceC0713h interfaceC0713h = interfaceC0713hArr[0];
                    throw null;
                }
                if (interfaceC0713hArr.length <= 0) {
                    return;
                }
                InterfaceC0713h interfaceC0713h2 = interfaceC0713hArr[0];
                throw null;
            default:
                if (enumC0718m != EnumC0718m.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0718m).toString());
                }
                interfaceC0724t.getLifecycle().b(this);
                ((N) this.f2838b).b();
                return;
        }
    }
}
