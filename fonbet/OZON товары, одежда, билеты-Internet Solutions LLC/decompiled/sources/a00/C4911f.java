package a00;

import androidx.activity.ActivityC5043j;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: a00.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4911f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final J f36130a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C4908c f36131b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f36132c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C4908c f36133d;

    public C4911f(@NotNull J lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.f36130a = lifecycleOwner;
        C4908c c4908c = new C4908c(lifecycleOwner);
        this.f36131b = c4908c;
        this.f36132c = !(lifecycleOwner instanceof ActivityC5043j);
        this.f36133d = c4908c;
    }

    public final r a() {
        r activity;
        J j11 = this.f36130a;
        ComponentCallbacksC5392m componentCallbacksC5392m = j11 instanceof ComponentCallbacksC5392m ? (ComponentCallbacksC5392m) j11 : null;
        if (componentCallbacksC5392m != null && (activity = componentCallbacksC5392m.getActivity()) != null) {
            return activity;
        }
        if (j11 instanceof r) {
            return (r) j11;
        }
        return null;
    }

    @NotNull
    public final C4908c b() {
        return this.f36131b;
    }

    public final ComponentCallbacksC5392m c() {
        if (!this.f36132c) {
            return null;
        }
        J j11 = this.f36130a;
        Intrinsics.g(j11, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        return (ComponentCallbacksC5392m) j11;
    }

    public final G d() {
        G parentFragmentManager;
        ComponentCallbacksC5392m c11 = c();
        if (c11 != null && (parentFragmentManager = c11.getParentFragmentManager()) != null) {
            return parentFragmentManager;
        }
        r a11 = a();
        if (a11 != null) {
            return a11.getSupportFragmentManager();
        }
        return null;
    }

    @NotNull
    public final J e() {
        return this.f36130a;
    }

    @NotNull
    public final J f() {
        return this.f36130a;
    }

    @NotNull
    public final C4908c g() {
        return this.f36133d;
    }

    public final boolean h() {
        return this.f36132c;
    }

    @NotNull
    public final r i() {
        r a11 = a();
        if (a11 != null) {
            return a11;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @NotNull
    public final ComponentCallbacksC5392m j() {
        ComponentCallbacksC5392m c11 = c();
        if (c11 != null) {
            return c11;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @NotNull
    public final G k() {
        G d11 = d();
        if (d11 != null) {
            return d11;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
