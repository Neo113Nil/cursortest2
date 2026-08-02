package androidx.lifecycle;

import M4.c;
import android.os.Bundle;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5418g0;
import androidx.lifecycle.z0;
import f3.AbstractC6409a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final b f43329a = new b();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final c f43330b = new c();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f43331c = new a();

    public static final class a implements AbstractC6409a.b<Bundle> {
    }

    public static final class b implements AbstractC6409a.b<M4.e> {
    }

    public static final class c implements AbstractC6409a.b<B0> {
    }

    @NotNull
    public static final C5418g0 a(@NotNull AbstractC6409a abstractC6409a) {
        Intrinsics.checkNotNullParameter(abstractC6409a, "<this>");
        M4.e eVar = (M4.e) abstractC6409a.a(f43329a);
        if (eVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        B0 b02 = (B0) abstractC6409a.a(f43330b);
        if (b02 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC6409a.a(f43331c);
        String str = (String) abstractC6409a.a(z0.c.VIEW_MODEL_KEY);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        c.b c11 = eVar.getSavedStateRegistry().c();
        l0 l0Var = c11 instanceof l0 ? (l0) c11 : null;
        if (l0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        Intrinsics.checkNotNullParameter(b02, "<this>");
        m0 m0Var = (m0) new z0(b02, new k0()).b(m0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
        C5418g0 c5418g0 = (C5418g0) m0Var.getF43344a().get(str);
        if (c5418g0 != null) {
            return c5418g0;
        }
        int i11 = C5418g0.f43314g;
        C5418g0 a11 = C5418g0.a.a(l0Var.a(str), bundle);
        m0Var.getF43344a().put(str, a11);
        return a11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends M4.e & B0> void b(@NotNull T t2) {
        Intrinsics.checkNotNullParameter(t2, "<this>");
        AbstractC5434v.b b11 = t2.getLifecycle().b();
        if (b11 != AbstractC5434v.b.INITIALIZED && b11 != AbstractC5434v.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t2.getSavedStateRegistry().c() == null) {
            l0 l0Var = new l0(t2.getSavedStateRegistry(), t2);
            t2.getSavedStateRegistry().g("androidx.lifecycle.internal.SavedStateHandlesProvider", l0Var);
            t2.getLifecycle().a(new C5420h0(l0Var));
        }
    }
}
