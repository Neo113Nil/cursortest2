package BZ;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import android.app.Activity;
import android.app.Application;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.activity.M;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import kotlin.jvm.internal.Intrinsics;
import nZ.C8475a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.initializers.ScreenRouterActionInitializer;
import xZ.InterfaceC10682a;
import xZ.l;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8475a.c f3323a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0<d> f3324b;

    /* renamed from: c, reason: collision with root package name */
    private Ej.b f3325c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final M0<d> f3326d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a f3327e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final b f3328f;

    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: BZ.e$a$a, reason: collision with other inner class name */
        public static final class C0077a implements G.p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f3330a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f3331b;

            C0077a(e eVar, r rVar) {
                this.f3330a = eVar;
                this.f3331b = rVar;
            }

            @Override // androidx.fragment.app.G.p
            public final void onBackStackChangeStarted(ComponentCallbacksC5392m fragment, boolean z11) {
                G supportFragmentManager;
                Object value;
                Object value2;
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                r activity = fragment.getActivity();
                if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
                    return;
                }
                int l02 = supportFragmentManager.l0() - 1;
                r rVar = this.f3331b;
                e eVar = this.f3330a;
                if (l02 < 0) {
                    int c11 = e.c(eVar, fragment);
                    e.e(eVar, rVar, c11);
                    x0 x0Var = eVar.f3324b;
                    do {
                        value2 = x0Var.getValue();
                    } while (!x0Var.b(value2, d.a((d) value2, null, c11, 1)));
                    return;
                }
                G.k k02 = supportFragmentManager.k0(supportFragmentManager.l0() - 1);
                Intrinsics.checkNotNullExpressionValue(k02, "getBackStackEntryAt(...)");
                if (z11 && Intrinsics.d(fragment.getTag(), k02.getName())) {
                    int c12 = e.c(eVar, fragment);
                    e.e(eVar, rVar, c12);
                    x0 x0Var2 = eVar.f3324b;
                    do {
                        value = x0Var2.getValue();
                    } while (!x0Var2.b(value, d.a((d) value, null, c12, 1)));
                }
            }

            @Override // androidx.fragment.app.G.p
            public final void onBackStackChanged() {
            }
        }

        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if ((activity instanceof InterfaceC10682a) && (activity instanceof r)) {
                r rVar = (r) activity;
                G supportFragmentManager = rVar.getSupportFragmentManager();
                e eVar = e.this;
                supportFragmentManager.k(new C0077a(eVar, (r) activity));
                rVar.getSupportFragmentManager().Y0(eVar.f3328f, false);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            Object value;
            Object value2;
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (activity instanceof InterfaceC10682a) {
                boolean isChangingConfigurations = activity.isChangingConfigurations();
                e eVar = e.this;
                if (isChangingConfigurations) {
                    x0 x0Var = eVar.f3324b;
                    do {
                        value2 = x0Var.getValue();
                    } while (!x0Var.b(value2, d.a((d) value2, null, -1, 1)));
                } else if (activity.isFinishing()) {
                    x0 x0Var2 = eVar.f3324b;
                    do {
                        value = x0Var2.getValue();
                    } while (!x0Var2.b(value, d.a((d) value, eVar.f3323a.a(), 0, 2)));
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public static final class b extends G.m {
        b() {
        }

        private final String a(ComponentCallbacksC5392m componentCallbacksC5392m) {
            String string;
            Bundle arguments = componentCallbacksC5392m.getArguments();
            if (arguments != null && (string = arguments.getString("mini_app_param")) != null) {
                return string;
            }
            h hVar = componentCallbacksC5392m instanceof h ? (h) componentCallbacksC5392m : null;
            return hVar != null ? hVar.miniAppName() : e.this.g().b();
        }

        @Override // androidx.fragment.app.G.m
        public final void onFragmentCreated(G fm, ComponentCallbacksC5392m fragment, Bundle bundle) {
            Object value;
            Intrinsics.checkNotNullParameter(fm, "fm");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            r requireActivity = fragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
            ComponentCallbacksC5392m w02 = requireActivity.getSupportFragmentManager().w0();
            if (w02 == null || Intrinsics.d(w02.getTag(), fragment.getTag())) {
                e eVar = e.this;
                int c11 = e.c(eVar, fragment);
                e.e(eVar, requireActivity, c11);
                String name = a(fragment);
                Bundle arguments = fragment.getArguments();
                if (arguments != null) {
                    arguments.putString("mini_app_param", name);
                }
                x0 x0Var = eVar.f3324b;
                do {
                    value = x0Var.getValue();
                    ((d) value).getClass();
                    Intrinsics.checkNotNullParameter(name, "name");
                } while (!x0Var.b(value, new d(name, c11)));
            }
        }

        @Override // androidx.fragment.app.G.m
        public final void onFragmentResumed(G fm, ComponentCallbacksC5392m fragment) {
            Object value;
            Intrinsics.checkNotNullParameter(fm, "fm");
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            x0 x0Var = e.this.f3324b;
            do {
                value = x0Var.getValue();
            } while (!x0Var.b(value, d.a((d) value, a(fragment), 0, 2)));
        }
    }

    public e(@NotNull C8475a.c compassConfig) {
        Intrinsics.checkNotNullParameter(compassConfig, "compassConfig");
        this.f3323a = compassConfig;
        x0<d> a11 = O0.a(new d(compassConfig.a(), -1));
        this.f3324b = a11;
        this.f3326d = C2399j.b(a11);
        this.f3327e = new a();
        this.f3328f = new b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int c(e eVar, ComponentCallbacksC5392m componentCallbacksC5392m) {
        eVar.getClass();
        l lVar = componentCallbacksC5392m instanceof l ? (l) componentCallbacksC5392m : null;
        if (lVar != null) {
            return lVar.getThemeId();
        }
        M activity = componentCallbacksC5392m.getActivity();
        l lVar2 = activity instanceof l ? (l) activity : null;
        return lVar2 != null ? lVar2.getThemeId() : eVar.g().c();
    }

    public static final void e(e eVar, r rVar, int i11) {
        if (i11 == eVar.g().c()) {
            return;
        }
        Resources.Theme newTheme = rVar.getResources().newTheme();
        Resources.Theme theme = rVar.getBaseContext().getTheme();
        if (theme != null) {
            newTheme.setTo(theme);
        }
        newTheme.applyStyle(i11, true);
        Resources.Theme theme2 = rVar.getTheme();
        if (theme2 != null) {
            theme2.setTo(newTheme);
        }
        if (eVar.f3325c != null) {
            ScreenRouterActionInitializer.init$lambda$0(rVar, i11);
        }
    }

    @NotNull
    public final a f() {
        return this.f3327e;
    }

    @NotNull
    public final d g() {
        return this.f3324b.getValue();
    }

    @NotNull
    public final M0<d> h() {
        return this.f3326d;
    }

    public final void i(@NotNull Ej.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f3325c = listener;
    }
}
