package U1;

import android.os.Bundle;
import androidx.lifecycle.EnumC0486o;
import androidx.lifecycle.InterfaceC0489s;
import androidx.lifecycle.InterfaceC0491u;
import androidx.lifecycle.L;
import androidx.lifecycle.S;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import c.AbstractActivityC0531j;
import c.C0528g;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.l;
import v3.g;

/* loaded from: classes.dex */
public final class b implements InterfaceC0489s {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5850k;

    /* renamed from: l, reason: collision with root package name */
    public final e f5851l;

    public /* synthetic */ b(e eVar, int i) {
        this.f5850k = i;
        this.f5851l = eVar;
    }

    @Override // androidx.lifecycle.InterfaceC0489s
    public final void h(InterfaceC0491u interfaceC0491u, EnumC0486o enumC0486o) {
        switch (this.f5850k) {
            case 0:
                if (enumC0486o != EnumC0486o.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0491u.g().k(this);
                e eVar = this.f5851l;
                Bundle u5 = eVar.b().u("androidx.savedstate.Restarter");
                if (u5 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = u5.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i = 0;
                while (i < size) {
                    String str = stringArrayList.get(i);
                    i++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, b.class.getClassLoader()).asSubclass(c.class);
                        l.c(asSubclass);
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                l.c(newInstance);
                                if (!(eVar instanceof Y)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + eVar).toString());
                                }
                                X f = ((Y) eVar).f();
                                g b3 = eVar.b();
                                f.getClass();
                                LinkedHashMap linkedHashMap = f.f7043a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    l.f("key", str3);
                                    S s2 = (S) linkedHashMap.get(str3);
                                    if (s2 != null) {
                                        L.b(s2, b3, eVar.g());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    b3.D();
                                }
                            } catch (Exception e3) {
                                throw new RuntimeException(L1.a.m("Failed to instantiate ", str2), e3);
                            }
                        } catch (NoSuchMethodException e5) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
                        }
                    } catch (ClassNotFoundException e6) {
                        throw new RuntimeException(L1.a.n("Class ", str2, " wasn't found"), e6);
                    }
                }
                return;
            default:
                AbstractActivityC0531j abstractActivityC0531j = (AbstractActivityC0531j) this.f5851l;
                if (abstractActivityC0531j.f7343o == null) {
                    C0528g c0528g = (C0528g) abstractActivityC0531j.getLastNonConfigurationInstance();
                    if (c0528g != null) {
                        abstractActivityC0531j.f7343o = c0528g.f7326a;
                    }
                    if (abstractActivityC0531j.f7343o == null) {
                        abstractActivityC0531j.f7343o = new X();
                    }
                }
                abstractActivityC0531j.f16854k.k(this);
                return;
        }
    }
}
