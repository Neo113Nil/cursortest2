package Bi0;

import B0.C2454a;
import ei0.InterfaceC6369b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.tracker.sendEvent.Cell;
import ru.ozon.tracker.sendEvent.Page;

/* loaded from: classes3.dex */
public final class g implements Ai0.c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6369b f3881a;

    public g(@NotNull InterfaceC6369b tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f3881a = tracker;
    }

    @Override // Ai0.c
    public final void a(int i11, @NotNull String field, boolean z11) {
        Intrinsics.checkNotNullParameter(field, "field");
        for (int i12 = 0; i12 < i11; i12++) {
            this.f3881a.h(new ActionType.Custom("test_trinity_event"), new Cell.CustomCell(C2454a.b("type", field)), new Page("test_page", Ej0.a.d(), "https://url.com", Ej0.a.d(), Ej0.a.d(), "1.0", "demo_app_product_tracker_events", null, Integer.valueOf(Ej0.a.b()), "https://nextUrl.com", Long.valueOf(Ej0.a.c()), Long.valueOf(Ej0.a.c()), Long.valueOf(Ej0.a.c()), Long.valueOf(Ej0.a.c()), Long.valueOf(Ej0.a.c()), Ej0.a.a(1), Ej0.a.d(), null, 131072, null), Ej0.a.e(), Ej0.a.e(), Ej0.a.e(), Ej0.a.e(), Ej0.a.e(), Ej0.a.e(), Long.valueOf(Ej0.a.c()), z11);
        }
    }
}
