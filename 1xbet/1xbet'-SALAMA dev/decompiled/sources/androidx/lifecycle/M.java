package androidx.lifecycle;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final T f9581a = new T();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final T f9582b = new T();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final T f9583c = new T();

    public static final void a(S s7, G0.f fVar, AbstractC0720o abstractC0720o) {
        Object obj;
        t6.h.e(fVar, "registry");
        t6.h.e(abstractC0720o, "lifecycle");
        HashMap map = s7.f9605a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = s7.f9605a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        K k7 = (K) obj;
        if (k7 == null || k7.f9580c) {
            return;
        }
        k7.b(fVar, abstractC0720o);
        EnumC0719n enumC0719n = ((C0726v) abstractC0720o).f9637c;
        if (enumC0719n == EnumC0719n.f9627b || enumC0719n.compareTo(EnumC0719n.f9629d) >= 0) {
            fVar.d();
        } else {
            abstractC0720o.a(new C0711f(fVar, abstractC0720o));
        }
    }

    public static J b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new J();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                t6.h.d(str, "key");
                map.put(str, bundle2.get(str));
            }
            return new J(map);
        }
        ClassLoader classLoader = J.class.getClassLoader();
        t6.h.b(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = parcelableArrayList.get(i7);
            t6.h.c(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i7));
        }
        return new J(linkedHashMap);
    }

    public static final J c(p087m0.c cVar) {
        T t7 = f9581a;
        LinkedHashMap linkedHashMap = cVar.f15208a;
        G0.h hVar = (G0.h) linkedHashMap.get(t7);
        if (hVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        Y y4 = (Y) linkedHashMap.get(f9582b);
        if (y4 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f9583c);
        String str = (String) linkedHashMap.get(T.f9609b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        G0.e eVarB = hVar.getSavedStateRegistry().b();
        N n2 = eVarB instanceof N ? (N) eVarB : null;
        if (n2 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = e(y4).f9588d;
        J j = (J) linkedHashMap2.get(str);
        if (j != null) {
            return j;
        }
        Class[] clsArr = J.f9572f;
        n2.b();
        Bundle bundle2 = n2.f9586c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = n2.f9586c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = n2.f9586c;
        if (bundle5 != null && bundle5.isEmpty()) {
            n2.f9586c = null;
        }
        J jB = b(bundle3, bundle);
        linkedHashMap2.put(str, jB);
        return jB;
    }

    public static final void d(G0.h hVar) {
        EnumC0719n enumC0719n = ((C0726v) hVar.getLifecycle()).f9637c;
        if (enumC0719n != EnumC0719n.f9627b && enumC0719n != EnumC0719n.f9628c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (hVar.getSavedStateRegistry().b() == null) {
            N n2 = new N(hVar.getSavedStateRegistry(), (Y) hVar);
            hVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", n2);
            hVar.getLifecycle().a(new G0.b(n2, 2));
        }
    }

    public static final O e(Y y4) {
        return (O) new android.support.v4.media.session.t(y4.getViewModelStore(), new L(), y4 instanceof InterfaceC0714i ? ((InterfaceC0714i) y4).getDefaultViewModelCreationExtras() : p087m0.a.f15207b).b0(O.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
