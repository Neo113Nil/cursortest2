package s;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import androidx.lifecycle.x;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import p.AbstractC0819i;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0827a implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6489a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6490b;

    public /* synthetic */ C0827a(int i2, Object obj) {
        this.f6489a = i2;
        this.f6490b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, s.d] */
    @Override // androidx.lifecycle.i
    public final void a(j jVar, androidx.lifecycle.d dVar) {
        switch (this.f6489a) {
            case 0:
                if (dVar != androidx.lifecycle.d.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                l b2 = jVar.b();
                b2.c("removeObserver");
                b2.f580b.b(this);
                Bundle c2 = this.f6490b.a().c("androidx.savedstate.Restarter");
                if (c2 == null) {
                    return;
                }
                ArrayList<String> stringArrayList = c2.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                Iterator<String> it = stringArrayList.iterator();
                if (it.hasNext()) {
                    String next = it.next();
                    try {
                        Class<? extends U> asSubclass = Class.forName(next, false, C0827a.class.getClassLoader()).asSubclass(InterfaceC0829c.class);
                        kotlin.jvm.internal.j.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                kotlin.jvm.internal.j.d(declaredConstructor.newInstance(null), "{\n                constr…wInstance()\n            }");
                                throw new ClassCastException();
                            } catch (Exception e2) {
                                throw new RuntimeException("Failed to instantiate " + next, e2);
                            }
                        } catch (NoSuchMethodException e3) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                        }
                    } catch (ClassNotFoundException e4) {
                        throw new RuntimeException(AbstractC0819i.a("Class ", next, " wasn't found"), e4);
                    }
                }
                return;
            default:
                if (dVar != androidx.lifecycle.d.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + dVar).toString());
                }
                l b3 = jVar.b();
                b3.c("removeObserver");
                b3.f580b.b(this);
                x xVar = (x) this.f6490b;
                if (xVar.f609b) {
                    return;
                }
                Bundle c3 = xVar.f608a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = xVar.f610c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (c3 != null) {
                    bundle.putAll(c3);
                }
                xVar.f610c = bundle;
                xVar.f609b = true;
                return;
        }
    }
}
