package D80;

import C.D;
import H30.k;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q80.AbstractC8997a;
import q80.C8998b;
import ru.ozon.fintech.features.tabber.ui.PreferenceViewListenerQa;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final int f6153a = D.c(100.0f);

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final LinkedHashMap f6154b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    private static boolean f6155c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f6156d = 0;

    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O30.b f6157a;

        a(O30.b bVar) {
            this.f6157a = bVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
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
            int i11 = c.f6156d;
            c.a(activity, this.f6157a);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }
    }

    public static final void a(Activity context, O30.b bVar) {
        AbstractC8997a c8998b;
        if (!(context instanceof E30.a)) {
            ComponentName component = context.getIntent().getComponent();
            if (!Intrinsics.d(component != null ? component.getClassName() : null, "ru.ozon.id.nativeauth.main.AuthFlowActivity")) {
                return;
            }
        }
        Window window = context.getWindow();
        if (window != null) {
            LinkedHashMap linkedHashMap = f6154b;
            Object obj = linkedHashMap.get(Integer.valueOf(context.hashCode()));
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.d(obj, bool)) {
                return;
            }
            if (f6155c) {
                c8998b = new PreferenceViewListenerQa(context, null, 6);
            } else {
                Intrinsics.checkNotNullParameter(context, "context");
                c8998b = new C8998b(context, null, 0);
            }
            c8998b.c(bVar);
            linkedHashMap.put(Integer.valueOf(context.hashCode()), bool);
            int i11 = f6153a;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i11);
            layoutParams.gravity = 8388661;
            window.addContentView(c8998b, layoutParams);
        }
    }

    public static void b(@NotNull Application application, boolean z11, @NotNull O30.b type) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(type, "type");
        f6155c = z11;
        if (z11) {
            try {
                k.b(new b());
            } catch (Exception e11) {
                L80.a.c("PreferencesShow", null, e11);
            }
        }
        application.registerActivityLifecycleCallbacks(new a(type));
    }
}
