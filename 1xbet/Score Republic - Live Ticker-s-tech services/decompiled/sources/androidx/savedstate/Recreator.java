package androidx.savedstate;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import p000.AbstractC0024an;
import p000.C0086c5;
import p000.C0270h1;
import p000.di1;
import p000.gi1;
import p000.hi1;
import p000.j22;
import p000.ph0;
import p000.uh0;
import p000.v41;
import p000.x41;
import p000.yh0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements uh0 {

    /* JADX INFO: renamed from: j */
    public final x41 f575j;

    public Recreator(x41 x41Var) {
        this.f575j = x41Var;
    }

    @Override // p000.uh0
    /* JADX INFO: renamed from: d */
    public final void mo328d(yh0 yh0Var, ph0 ph0Var) {
        if (ph0Var != ph0.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        yh0Var.mo862d().m442f(this);
        x41 x41Var = this.f575j;
        Bundle bundleM849c = x41Var.mo859a().m849c("androidx.savedstate.Restarter");
        if (bundleM849c == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM849c.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            C0270h1.m2191g("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            return;
        }
        int size = stringArrayList.size();
        int i = 0;
        while (i < size) {
            String str = stringArrayList.get(i);
            i++;
            String str2 = str;
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(v41.class);
                clsAsSubclass.getClass();
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        objNewInstance.getClass();
                        if (!(x41Var instanceof hi1)) {
                            C0270h1.m2191g("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                            return;
                        }
                        gi1 gi1VarMo861c = ((hi1) x41Var).mo861c();
                        C0086c5 c0086c5Mo859a = x41Var.mo859a();
                        gi1VarMo861c.getClass();
                        LinkedHashMap linkedHashMap = gi1VarMo861c.f2759a;
                        for (String str3 : new HashSet(linkedHashMap.keySet())) {
                            str3.getClass();
                            di1 di1Var = (di1) linkedHashMap.get(str3);
                            di1Var.getClass();
                            j22.m2792a(di1Var, c0086c5Mo859a, x41Var.mo862d());
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            c0086c5Mo859a.m852f();
                        }
                    } catch (Exception e) {
                        C0270h1.m2189e(AbstractC0024an.m283f("Failed to instantiate ", str2), e);
                        return;
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                C0270h1.m2189e(AbstractC0024an.m284g("Class ", str2, " wasn't found"), e3);
                return;
            }
        }
    }
}
