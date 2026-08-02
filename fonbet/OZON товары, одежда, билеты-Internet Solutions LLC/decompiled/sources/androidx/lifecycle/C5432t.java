package androidx.lifecycle;

import M4.c;
import android.os.Bundle;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5418g0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.lifecycle.t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5432t {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/t$a;", "LM4/c$a;", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.t$a */
    public static final class a implements c.a {
        @Override // M4.c.a
        public final void a(@NotNull M4.e owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            if (!(owner instanceof B0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            A0 viewModelStore = ((B0) owner).getViewModelStore();
            M4.c savedStateRegistry = owner.getSavedStateRegistry();
            Iterator it = viewModelStore.c().iterator();
            while (it.hasNext()) {
                w0 b11 = viewModelStore.b((String) it.next());
                Intrinsics.f(b11);
                C5432t.a(b11, savedStateRegistry, owner.getLifecycle());
            }
            if (viewModelStore.c().isEmpty()) {
                return;
            }
            savedStateRegistry.h();
        }
    }

    /* renamed from: androidx.lifecycle.t$b */
    public static final class b implements G {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5434v f43386a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ M4.c f43387b;

        b(M4.c cVar, AbstractC5434v abstractC5434v) {
            this.f43386a = abstractC5434v;
            this.f43387b = cVar;
        }

        @Override // androidx.lifecycle.G
        public final void onStateChanged(@NotNull J source, @NotNull AbstractC5434v.a event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            if (event == AbstractC5434v.a.ON_START) {
                this.f43386a.e(this);
                this.f43387b.h();
            }
        }
    }

    public static final void a(@NotNull w0 viewModel, @NotNull M4.c registry, @NotNull AbstractC5434v lifecycle) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        C5422i0 c5422i0 = (C5422i0) viewModel.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (c5422i0 == null || c5422i0.j()) {
            return;
        }
        c5422i0.c(registry, lifecycle);
        c(registry, lifecycle);
    }

    @NotNull
    public static final C5422i0 b(@NotNull M4.c registry, @NotNull AbstractC5434v lifecycle, String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Bundle b11 = registry.b(str);
        int i11 = C5418g0.f43314g;
        C5422i0 c5422i0 = new C5422i0(C5418g0.a.a(b11, bundle), str);
        c5422i0.c(registry, lifecycle);
        c(registry, lifecycle);
        return c5422i0;
    }

    private static void c(M4.c cVar, AbstractC5434v abstractC5434v) {
        AbstractC5434v.b b11 = abstractC5434v.b();
        if (b11 == AbstractC5434v.b.INITIALIZED || b11.a(AbstractC5434v.b.STARTED)) {
            cVar.h();
        } else {
            abstractC5434v.a(new b(cVar, abstractC5434v));
        }
    }
}
