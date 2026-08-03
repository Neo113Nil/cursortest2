package Q;

/* loaded from: classes.dex */
public final class a implements androidx.lifecycle.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1579a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f1580b;

    public /* synthetic */ a(int i2, java.lang.Object obj) {
        this.f1579a = i2;
        this.f1580b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [Q.d, java.lang.Object] */
    @Override // androidx.lifecycle.i
    public final void a(androidx.lifecycle.j jVar, androidx.lifecycle.d dVar) {
        switch (this.f1579a) {
            case 0:
                if (dVar != androidx.lifecycle.d.ON_CREATE) {
                    throw new java.lang.AssertionError("Next event must be ON_CREATE");
                }
                androidx.lifecycle.l b2 = jVar.b();
                b2.c("removeObserver");
                b2.f2389b.b(this);
                android.os.Bundle d2 = this.f1580b.a().d("androidx.savedstate.Restarter");
                if (d2 == null) {
                    return;
                }
                java.util.ArrayList<java.lang.String> stringArrayList = d2.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new java.lang.IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                java.util.Iterator<java.lang.String> it = stringArrayList.iterator();
                if (it.hasNext()) {
                    java.lang.String next = it.next();
                    try {
                        java.lang.Class<? extends U> asSubclass = java.lang.Class.forName(next, false, Q.a.class.getClassLoader()).asSubclass(Q.c.class);
                        kotlin.jvm.internal.i.d(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            java.lang.reflect.Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                kotlin.jvm.internal.i.d(declaredConstructor.newInstance(null), "{\n                constr…wInstance()\n            }");
                                throw new java.lang.ClassCastException();
                            } catch (java.lang.Exception e2) {
                                throw new java.lang.RuntimeException(B1.a.i("Failed to instantiate ", next), e2);
                            }
                        } catch (java.lang.NoSuchMethodException e3) {
                            throw new java.lang.IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                        }
                    } catch (java.lang.ClassNotFoundException e4) {
                        throw new java.lang.RuntimeException("Class " + next + " wasn't found", e4);
                    }
                }
                return;
            default:
                if (dVar != androidx.lifecycle.d.ON_CREATE) {
                    throw new java.lang.IllegalStateException(("Next event must be ON_CREATE, it was " + dVar).toString());
                }
                androidx.lifecycle.l b3 = jVar.b();
                b3.c("removeObserver");
                b3.f2389b.b(this);
                androidx.lifecycle.v vVar = (androidx.lifecycle.v) this.f1580b;
                if (vVar.f2414b) {
                    return;
                }
                android.os.Bundle d3 = vVar.f2413a.d("androidx.lifecycle.internal.SavedStateHandlesProvider");
                android.os.Bundle bundle = new android.os.Bundle();
                android.os.Bundle bundle2 = vVar.f2415c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (d3 != null) {
                    bundle.putAll(d3);
                }
                vVar.f2415c = bundle;
                vVar.f2414b = true;
                return;
        }
    }
}
