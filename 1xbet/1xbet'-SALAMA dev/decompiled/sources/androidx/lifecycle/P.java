package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class P implements V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f9589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f9590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f9591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC0720o f9592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G0.f f9593e;

    public P(Application application, androidx.activity.o oVar, Bundle bundle) {
        U u4;
        this.f9593e = oVar.getSavedStateRegistry();
        this.f9592d = oVar.getLifecycle();
        this.f9591c = bundle;
        this.f9589a = application;
        if (application != null) {
            if (U.f9610c == null) {
                U.f9610c = new U(application);
            }
            u4 = U.f9610c;
            t6.h.b(u4);
        } else {
            u4 = new U(null);
        }
        this.f9590b = u4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final S a(Class cls, String str) {
        Object obj;
        Application application;
        AbstractC0720o abstractC0720o = this.f9592d;
        if (abstractC0720o == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC0706a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || this.f9589a == null) ? Q.a(cls, Q.f9604b) : Q.a(cls, Q.f9603a);
        if (constructorA == null) {
            if (this.f9589a != null) {
                return this.f9590b.b(cls);
            }
            if (W.f9612a == null) {
                W.f9612a = new W();
            }
            W w7 = W.f9612a;
            t6.h.b(w7);
            return w7.b(cls);
        }
        G0.f fVar = this.f9593e;
        t6.h.b(fVar);
        Bundle bundle = this.f9591c;
        Bundle bundleA = fVar.a(str);
        Class[] clsArr = J.f9572f;
        J jB = M.b(bundleA, bundle);
        K k7 = new K(str, jB);
        k7.b(fVar, abstractC0720o);
        EnumC0719n enumC0719n = ((C0726v) abstractC0720o).f9637c;
        if (enumC0719n == EnumC0719n.f9627b || enumC0719n.compareTo(EnumC0719n.f9629d) >= 0) {
            fVar.d();
        } else {
            abstractC0720o.a(new C0711f(fVar, abstractC0720o));
        }
        S sB = (!zIsAssignableFrom || (application = this.f9589a) == null) ? Q.b(cls, constructorA, jB) : Q.b(cls, constructorA, application, jB);
        synchronized (sB.f9605a) {
            try {
                obj = sB.f9605a.get("androidx.lifecycle.savedstate.vm.tag");
                if (obj == null) {
                    sB.f9605a.put("androidx.lifecycle.savedstate.vm.tag", k7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            k7 = obj;
        }
        if (sB.f9607c) {
            S.a(k7);
        }
        return sB;
    }

    @Override // androidx.lifecycle.V
    public final S b(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return a(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.V
    public final S i(Class cls, p087m0.c cVar) {
        T t7 = T.f9609b;
        LinkedHashMap linkedHashMap = cVar.f15208a;
        String str = (String) linkedHashMap.get(t7);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(M.f9581a) == null || linkedHashMap.get(M.f9582b) == null) {
            if (this.f9592d != null) {
                return a(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(T.f9608a);
        boolean zIsAssignableFrom = AbstractC0706a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? Q.a(cls, Q.f9604b) : Q.a(cls, Q.f9603a);
        if (constructorA == null) {
            return this.f9590b.i(cls, cVar);
        }
        return (!zIsAssignableFrom || application == null) ? Q.b(cls, constructorA, M.c(cVar)) : Q.b(cls, constructorA, application, M.c(cVar));
    }
}
