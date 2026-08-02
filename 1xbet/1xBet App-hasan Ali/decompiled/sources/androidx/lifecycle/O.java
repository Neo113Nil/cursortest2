package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import k4.AbstractC2036a;
import m4.InterfaceC2100c;

/* loaded from: classes.dex */
public final class O extends V implements U {

    /* renamed from: a, reason: collision with root package name */
    public final Application f7028a;

    /* renamed from: b, reason: collision with root package name */
    public final T f7029b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f7030c;

    /* renamed from: d, reason: collision with root package name */
    public final L f7031d;

    /* renamed from: e, reason: collision with root package name */
    public final v3.g f7032e;

    public O(Application application, U1.e eVar, Bundle bundle) {
        T t5;
        kotlin.jvm.internal.l.f("owner", eVar);
        this.f7032e = eVar.b();
        this.f7031d = eVar.g();
        this.f7030c = bundle;
        this.f7028a = application;
        if (application != null) {
            if (T.f7038d == null) {
                T.f7038d = new T(application);
            }
            t5 = T.f7038d;
            kotlin.jvm.internal.l.c(t5);
        } else {
            t5 = new T(null);
        }
        this.f7029b = t5;
    }

    @Override // androidx.lifecycle.V
    public final void a(S s2) {
        L l5 = this.f7031d;
        if (l5 != null) {
            v3.g gVar = this.f7032e;
            kotlin.jvm.internal.l.c(gVar);
            L.b(s2, gVar, l5);
        }
    }

    public final S b(Class cls, String str) {
        kotlin.jvm.internal.l.f("modelClass", cls);
        L l5 = this.f7031d;
        if (l5 == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC0472a.class.isAssignableFrom(cls);
        Application application = this.f7028a;
        Constructor a5 = (!isAssignableFrom || application == null) ? P.a(cls, P.f7034b) : P.a(cls, P.f7033a);
        if (a5 == null) {
            if (application != null) {
                return this.f7029b.create(cls);
            }
            if (G1.q.f1930b == null) {
                G1.q.f1930b = new G1.q(2);
            }
            kotlin.jvm.internal.l.c(G1.q.f1930b);
            return N4.b.q(cls);
        }
        v3.g gVar = this.f7032e;
        kotlin.jvm.internal.l.c(gVar);
        K c5 = L.c(gVar, l5, str, this.f7030c);
        J j5 = c5.f7017l;
        S b3 = (!isAssignableFrom || application == null) ? P.b(cls, a5, j5) : P.b(cls, a5, application, j5);
        b3.addCloseable("androidx.lifecycle.savedstate.vm.tag", c5);
        return b3;
    }

    @Override // androidx.lifecycle.U
    public final S create(InterfaceC2100c interfaceC2100c, D1.b bVar) {
        return create(AbstractC2036a.z(interfaceC2100c), bVar);
    }

    @Override // androidx.lifecycle.U
    public final S create(Class cls, D1.b bVar) {
        kotlin.jvm.internal.l.f("extras", bVar);
        String str = (String) bVar.a(W.f7041b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (bVar.a(L.f7019a) == null || bVar.a(L.f7020b) == null) {
            if (this.f7031d != null) {
                return b(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) bVar.a(T.f7039e);
        boolean isAssignableFrom = AbstractC0472a.class.isAssignableFrom(cls);
        Constructor a5 = (!isAssignableFrom || application == null) ? P.a(cls, P.f7034b) : P.a(cls, P.f7033a);
        return a5 == null ? this.f7029b.create(cls, bVar) : (!isAssignableFrom || application == null) ? P.b(cls, a5, L.d(bVar)) : P.b(cls, a5, application, L.d(bVar));
    }

    @Override // androidx.lifecycle.U
    public final S create(Class cls) {
        kotlin.jvm.internal.l.f("modelClass", cls);
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
