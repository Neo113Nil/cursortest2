package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class P implements V {

    /* renamed from: a, reason: collision with root package name */
    public final Application f9589a;

    /* renamed from: b, reason: collision with root package name */
    public final U f9590b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f9591c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0741o f9592d;

    /* renamed from: e, reason: collision with root package name */
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
        AbstractC0741o abstractC0741o = this.f9592d;
        if (abstractC0741o == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC0727a.class.isAssignableFrom(cls);
        Constructor a2 = (!isAssignableFrom || this.f9589a == null) ? Q.a(cls, Q.f9604b) : Q.a(cls, Q.f9603a);
        if (a2 == null) {
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
        Bundle a4 = fVar.a(str);
        Class[] clsArr = J.f9572f;
        J b7 = M.b(a4, bundle);
        K k7 = new K(str, b7);
        k7.b(fVar, abstractC0741o);
        EnumC0740n enumC0740n = ((C0747v) abstractC0741o).f9637c;
        if (enumC0740n == EnumC0740n.f9627b || enumC0740n.compareTo(EnumC0740n.f9629d) >= 0) {
            fVar.d();
        } else {
            abstractC0741o.a(new C0732f(fVar, abstractC0741o));
        }
        S b8 = (!isAssignableFrom || (application = this.f9589a) == null) ? Q.b(cls, a2, b7) : Q.b(cls, a2, application, b7);
        synchronized (b8.f9605a) {
            try {
                obj = b8.f9605a.get("androidx.lifecycle.savedstate.vm.tag");
                if (obj == 0) {
                    b8.f9605a.put("androidx.lifecycle.savedstate.vm.tag", k7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != 0) {
            k7 = obj;
        }
        if (b8.f9607c) {
            S.a(k7);
        }
        return b8;
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
    public final S i(Class cls, m0.c cVar) {
        T t7 = T.f9609b;
        LinkedHashMap linkedHashMap = cVar.f15202a;
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
        boolean isAssignableFrom = AbstractC0727a.class.isAssignableFrom(cls);
        Constructor a2 = (!isAssignableFrom || application == null) ? Q.a(cls, Q.f9604b) : Q.a(cls, Q.f9603a);
        return a2 == null ? this.f9590b.i(cls, cVar) : (!isAssignableFrom || application == null) ? Q.b(cls, a2, M.c(cVar)) : Q.b(cls, a2, application, M.c(cVar));
    }
}
