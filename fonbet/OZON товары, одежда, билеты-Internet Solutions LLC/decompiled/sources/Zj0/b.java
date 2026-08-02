package Zj0;

import Jl.C3398a;
import androidx.lifecycle.ProcessLifecycleOwner;
import ei0.C6370c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.di.module.AnalyticsDependencyModule;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.tracker.sendEvent.Page;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6370c f36014a;

    /* renamed from: b, reason: collision with root package name */
    private C3398a f36015b;

    public b(@NotNull C6370c ozonTracker) {
        Intrinsics.checkNotNullParameter(ozonTracker, "ozonTracker");
        this.f36014a = ozonTracker;
    }

    public final void a() {
        Page provideOzonTrackerSettings$lambda$0;
        ActionType.COLLAPSE_APP collapse_app = ActionType.COLLAPSE_APP.INSTANCE;
        C3398a c3398a = this.f36015b;
        if (c3398a == null) {
            Intrinsics.n("currentPageProvider");
            throw null;
        }
        provideOzonTrackerSettings$lambda$0 = AnalyticsDependencyModule.Companion.provideOzonTrackerSettings$lambda$0((Sg.a) c3398a.f14828a);
        this.f36014a.sendEvent(collapse_app, (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? null : null, (r27 & 16) != 0 ? null : null, provideOzonTrackerSettings$lambda$0, (r27 & 64) != 0 ? null : null, null, null, null, null, null, null, null, null, null);
    }

    public final void b(boolean z11) {
        Page provideOzonTrackerSettings$lambda$0;
        C6370c c6370c = this.f36014a;
        if (z11) {
            c6370c.sendEvent(ActionType.START_APP.INSTANCE, (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? null : null, (r27 & 16) != 0 ? null : null, null, (r27 & 64) != 0 ? null : null, null, null, null, null, null, null, null, null, null);
            return;
        }
        ActionType.EXPAND_APP expand_app = ActionType.EXPAND_APP.INSTANCE;
        C3398a c3398a = this.f36015b;
        if (c3398a == null) {
            Intrinsics.n("currentPageProvider");
            throw null;
        }
        provideOzonTrackerSettings$lambda$0 = AnalyticsDependencyModule.Companion.provideOzonTrackerSettings$lambda$0((Sg.a) c3398a.f14828a);
        c6370c.sendEvent(expand_app, (r27 & 2) != 0 ? null : null, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? null : null, (r27 & 16) != 0 ? null : null, provideOzonTrackerSettings$lambda$0, (r27 & 64) != 0 ? null : null, null, null, null, null, null, null, null, null, null);
    }

    public final void c(@NotNull C3398a currentPageProvider) {
        ProcessLifecycleOwner processLifecycleOwner;
        Intrinsics.checkNotNullParameter(currentPageProvider, "currentPageProvider");
        this.f36015b = currentPageProvider;
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        processLifecycleOwner.getLifecycle().a(new a(this));
    }
}
