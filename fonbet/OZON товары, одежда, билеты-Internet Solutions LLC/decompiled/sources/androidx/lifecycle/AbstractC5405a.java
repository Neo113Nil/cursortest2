package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC5405a extends z0.d implements z0.b {

    /* renamed from: a, reason: collision with root package name */
    private M4.c f43256a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC5434v f43257b;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f43258c;

    public AbstractC5405a(@NotNull M4.e owner, Bundle bundle) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f43256a = owner.getSavedStateRegistry();
        this.f43257b = owner.getLifecycle();
        this.f43258c = bundle;
    }

    @Override // androidx.lifecycle.z0.d
    public final void a(@NotNull w0 viewModel) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        M4.c cVar = this.f43256a;
        if (cVar != null) {
            AbstractC5434v abstractC5434v = this.f43257b;
            Intrinsics.f(abstractC5434v);
            C5432t.a(viewModel, cVar, abstractC5434v);
        }
    }

    @NotNull
    protected abstract <T extends w0> T b(@NotNull String str, @NotNull Class<T> cls, @NotNull C5418g0 c5418g0);

    @Override // androidx.lifecycle.z0.b
    @NotNull
    public final <T extends w0> T create(@NotNull Class<T> modelClass, @NotNull AbstractC6409a extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        String str = (String) extras.a(z0.c.VIEW_MODEL_KEY);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        M4.c cVar = this.f43256a;
        if (cVar == null) {
            return (T) b(str, modelClass, j0.a(extras));
        }
        Intrinsics.f(cVar);
        AbstractC5434v abstractC5434v = this.f43257b;
        Intrinsics.f(abstractC5434v);
        C5422i0 b11 = C5432t.b(cVar, abstractC5434v, str, this.f43258c);
        T t2 = (T) b(str, modelClass, b11.d());
        t2.addCloseable("androidx.lifecycle.savedstate.vm.tag", b11);
        return t2;
    }

    @Override // androidx.lifecycle.z0.b
    @NotNull
    public final <T extends w0> T create(@NotNull Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            if (this.f43257b != null) {
                M4.c cVar = this.f43256a;
                Intrinsics.f(cVar);
                AbstractC5434v abstractC5434v = this.f43257b;
                Intrinsics.f(abstractC5434v);
                C5422i0 b11 = C5432t.b(cVar, abstractC5434v, canonicalName, this.f43258c);
                T t2 = (T) b(canonicalName, modelClass, b11.d());
                t2.addCloseable("androidx.lifecycle.savedstate.vm.tag", b11);
                return t2;
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
