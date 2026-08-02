package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class n0 extends z0.d implements z0.b {

    /* renamed from: a, reason: collision with root package name */
    private Application f43354a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final z0.a f43355b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f43356c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC5434v f43357d;

    /* renamed from: e, reason: collision with root package name */
    private M4.c f43358e;

    public n0() {
        this.f43355b = new z0.a();
    }

    @Override // androidx.lifecycle.z0.d
    public final void a(@NotNull w0 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        AbstractC5434v abstractC5434v = this.f43357d;
        if (abstractC5434v != null) {
            M4.c cVar = this.f43358e;
            Intrinsics.f(cVar);
            C5432t.a(viewModel, cVar, abstractC5434v);
        }
    }

    @NotNull
    public final w0 b(@NotNull Class modelClass, @NotNull String key) {
        List list;
        Constructor c11;
        z0.c cVar;
        z0.c cVar2;
        List list2;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        AbstractC5434v abstractC5434v = this.f43357d;
        if (abstractC5434v == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = C5407b.class.isAssignableFrom(modelClass);
        Application application = this.f43354a;
        if (!isAssignableFrom || application == null) {
            list = o0.f43361b;
            c11 = o0.c(modelClass, list);
        } else {
            list2 = o0.f43360a;
            c11 = o0.c(modelClass, list2);
        }
        if (c11 != null) {
            M4.c cVar3 = this.f43358e;
            Intrinsics.f(cVar3);
            C5422i0 b11 = C5432t.b(cVar3, abstractC5434v, key, this.f43356c);
            w0 d11 = (!isAssignableFrom || application == null) ? o0.d(modelClass, c11, b11.d()) : o0.d(modelClass, c11, application, b11.d());
            d11.addCloseable("androidx.lifecycle.savedstate.vm.tag", b11);
            return d11;
        }
        if (application != null) {
            return this.f43355b.create(modelClass);
        }
        z0.c.Companion.getClass();
        cVar = z0.c._instance;
        if (cVar == null) {
            z0.c._instance = new z0.c();
        }
        cVar2 = z0.c._instance;
        Intrinsics.f(cVar2);
        return cVar2.create(modelClass);
    }

    @Override // androidx.lifecycle.z0.b
    @NotNull
    public final <T extends w0> T create(@NotNull Class<T> modelClass, @NotNull AbstractC6409a extras) {
        List list;
        Constructor c11;
        List list2;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(z0.c.VIEW_MODEL_KEY);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.a(j0.f43329a) == null || extras.a(j0.f43330b) == null) {
            if (this.f43357d != null) {
                return (T) b(modelClass, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.a(z0.a.f43418c);
        boolean isAssignableFrom = C5407b.class.isAssignableFrom(modelClass);
        if (!isAssignableFrom || application == null) {
            list = o0.f43361b;
            c11 = o0.c(modelClass, list);
        } else {
            list2 = o0.f43360a;
            c11 = o0.c(modelClass, list2);
        }
        return c11 == null ? (T) this.f43355b.create(modelClass, extras) : (!isAssignableFrom || application == null) ? (T) o0.d(modelClass, c11, j0.a(extras)) : (T) o0.d(modelClass, c11, application, j0.a(extras));
    }

    @SuppressLint({"LambdaLast"})
    public n0(Application application, @NotNull M4.e owner, Bundle bundle) {
        z0.a aVar;
        z0.a aVar2;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f43358e = owner.getSavedStateRegistry();
        this.f43357d = owner.getLifecycle();
        this.f43356c = bundle;
        this.f43354a = application;
        if (application != null) {
            z0.a.C0800a c0800a = z0.a.f43418c;
            Intrinsics.checkNotNullParameter(application, "application");
            aVar2 = z0.a.f43417b;
            if (aVar2 == null) {
                z0.a.f43417b = new z0.a(application);
            }
            aVar = z0.a.f43417b;
            Intrinsics.f(aVar);
        } else {
            aVar = new z0.a();
        }
        this.f43355b = aVar;
    }

    @Override // androidx.lifecycle.z0.b
    @NotNull
    public final <T extends w0> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) b(modelClass, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
