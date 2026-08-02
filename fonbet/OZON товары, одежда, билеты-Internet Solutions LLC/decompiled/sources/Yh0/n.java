package Yh0;

import Qj0.U;
import Xh0.a;
import Xh0.c;
import Yh0.o;
import ai0.C5025a;
import ai0.C5027c;
import android.app.Activity;
import android.app.Application;
import android.os.SystemClock;
import ei0.InterfaceC6369b;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.OzonApplication;
import ve.EnumC10311b;

/* loaded from: classes7.dex */
public final class n implements Xh0.c {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final g f35105b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final c f35106c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<? extends Activity> f35107d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C5025a f35108e;

    public n(@NotNull OzonApplication app, @NotNull c.b configuration, @NotNull g startupTimeSender, @NotNull c logger) {
        Intrinsics.checkNotNullParameter(app, "application");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(startupTimeSender, "startupTimeSender");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f35105b = startupTimeSender;
        this.f35106c = logger;
        this.f35107d = configuration.c();
        C5025a c5025a = new C5025a(new k(1, this, n.class, "onActivityCreated", "onActivityCreated(Landroid/app/Activity;)V", 0));
        Intrinsics.checkNotNullParameter(app, "app");
        app.registerActivityLifecycleCallbacks(c5025a);
        this.f35108e = c5025a;
    }

    public static final void d(n nVar, Activity activity) {
        nVar.getClass();
        if (N.b(activity.getClass()).equals(nVar.f35107d)) {
            Zh0.c.a(activity, new l(nVar, activity));
        }
    }

    public static final void e(n nVar, Activity activity) {
        nVar.getClass();
        List<a.b> list = null;
        if (C5027c.a(null)) {
            Application app = activity.getApplication();
            Intrinsics.checkNotNullExpressionValue(app, "getApplication(...)");
            C5025a c5025a = nVar.f35108e;
            c5025a.getClass();
            Intrinsics.checkNotNullParameter(app, "app");
            app.unregisterActivityLifecycleCallbacks(c5025a);
            o a11 = f.a();
            o.c cVar = a11 instanceof o.c ? (o.c) a11 : null;
            if (cVar == null) {
                return;
            }
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            List<a.b> d11 = cVar.d();
            if (d11.isEmpty()) {
                d11 = null;
            }
            if (d11 != null) {
                String a12 = cVar.b().a();
                long b11 = cVar.b().b();
                b.Companion companion = kotlin.time.b.INSTANCE;
                d11.add(new a.b(a12, kotlin.time.c.h(elapsedRealtimeNanos - b11, EnumC10311b.NANOSECONDS)));
                list = d11;
            }
            long c11 = cVar.c();
            b.Companion companion2 = kotlin.time.b.INSTANCE;
            long h11 = kotlin.time.c.h(elapsedRealtimeNanos - c11, EnumC10311b.NANOSECONDS);
            long c12 = cVar.c();
            if (list == null) {
                list = K.f71697a;
            }
            Xh0.a aVar = new Xh0.a(h11, c12, elapsedRealtimeNanos, list);
            nVar.f35106c.a(new m(aVar));
            nVar.f35105b.c(aVar);
        }
    }

    @Override // Xh0.c
    public final void a(@NotNull String stepName) {
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        f.c(stepName);
    }

    @Override // Xh0.c
    public final void b(@NotNull Function1<? super U, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f35105b.b(action);
    }

    @Override // Xh0.c
    public final void c(@NotNull InterfaceC6369b ozonTracker) {
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        this.f35105b.e(ozonTracker);
    }
}
