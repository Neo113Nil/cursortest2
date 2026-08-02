package Bi0;

import ei0.InterfaceC6369b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.sendEvent.Page;

/* loaded from: classes3.dex */
public final class d implements Ai0.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6369b f3877a;

    public d(@NotNull InterfaceC6369b tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f3877a = tracker;
    }

    @Override // Ai0.b
    public final void a(@NotNull String currentPage, @NotNull String currentUrl) {
        Intrinsics.checkNotNullParameter(currentPage, "currentPage");
        Intrinsics.checkNotNullParameter(currentUrl, "currentUrl");
        this.f3877a.sendPageView(new Page(currentPage, Ej0.a.d(), currentUrl, Ej0.a.d(), Ej0.a.d(), "1.0", "demo_app_product_tracker_events", null, Integer.valueOf(Ej0.a.b()), "https://nextUrl.com", Long.valueOf(Ej0.a.c()), Long.valueOf(Ej0.a.c()), Long.valueOf(Ej0.a.c()), Long.valueOf(Ej0.a.c()), Long.valueOf(Ej0.a.c()), Ej0.a.a(1), Ej0.a.d(), null, 131072, null));
    }
}
