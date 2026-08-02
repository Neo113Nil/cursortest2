package Bi0;

import ei0.InterfaceC6369b;
import java.math.BigDecimal;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.tracker.sendEvent.Cell;
import ru.ozon.tracker.sendEvent.Page;

/* loaded from: classes3.dex */
public final class c implements Ai0.a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6369b f3876a;

    public c(@NotNull InterfaceC6369b tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f3876a = tracker;
    }

    @Override // Ai0.a
    public final void a(@NotNull String str, int i11) {
        String field = str;
        Intrinsics.checkNotNullParameter(field, "field");
        int i12 = 0;
        while (i12 < i11) {
            ActionType.Custom custom = new ActionType.Custom("test_event");
            String a11 = Ej0.a.a(1);
            BigDecimal bigDecimal = new BigDecimal(12312);
            BigDecimal bigDecimal2 = new BigDecimal(1234);
            BigDecimal bigDecimal3 = BigDecimal.ONE;
            EventEntity.Properties properties = new EventEntity.Properties(null, Ej0.a.a(1), null, 1L, null, bigDecimal, bigDecimal2, null, null, null, null, null, null, null, null, null, 1, null, null, null, null, null, 123L, null, null, null, null, null, null, null, null, null, a11, null, null, null, null, null, bigDecimal3, null, null, null, null, bigDecimal3, bigDecimal3, null, "type", 2, null, null, null, Boolean.FALSE, Ej0.a.d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Ej0.a.a(1), Long.valueOf(Ej0.a.c()), -4259947, -1628226, 4095, null);
            Page page = new Page("test_page", Ej0.a.d(), "https://url.com", Ej0.a.d(), Ej0.a.d(), "1.0", "demo_app_product_tracker_events", null, Integer.valueOf(Ej0.a.b()), "https://nextUrl.com", Long.valueOf(Ej0.a.c()), Long.valueOf(Ej0.a.c()), Long.valueOf(Ej0.a.c()), Long.valueOf(Ej0.a.c()), Long.valueOf(Ej0.a.c()), Ej0.a.a(1), Ej0.a.d(), null, 131072, null);
            EventEntity.EventError eventError = new EventEntity.EventError(Ej0.a.d(), Ej0.a.d(), Ej0.a.a(1), Ej0.a.a(2));
            EventEntity.Obj obj = new EventEntity.Obj(field, null, null, null, null, null, null, null, null, null, null, null, null, null, Ej0.a.d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147467262, null);
            EventEntity.Widget widget = new EventEntity.Widget(null, Ej0.a.a(1), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048573, null);
            Cell.CustomCell customCell = new Cell.CustomCell(U.c());
            String e11 = Ej0.a.e();
            EventEntity.Form form = new EventEntity.Form(Ej0.a.a(1));
            EventEntity.Posting posting = new EventEntity.Posting(Ej0.a.d());
            EventEntity.Filter filter = new EventEntity.Filter(null, null, null, 7, null);
            EventEntity.Sale sale = new EventEntity.Sale(Integer.valueOf(Ej0.a.b()), C7714v.b0(Integer.valueOf(Ej0.a.b()), Integer.valueOf(Ej0.a.b())), Integer.valueOf(Ej0.a.b()), Integer.valueOf(Ej0.a.b()));
            EventEntity.Review review = new EventEntity.Review(Integer.valueOf(Ej0.a.b()), Ej0.a.d(), Integer.valueOf(Ej0.a.b()), Integer.valueOf(Ej0.a.b()), Integer.valueOf(Ej0.a.b()));
            int b11 = Ej0.a.b();
            int b12 = Ej0.a.b();
            EventEntity.Courier courier = new EventEntity.Courier(Long.valueOf(Ej0.a.c()));
            this.f3876a.sendEvent(custom, obj, properties, customCell, widget, page, e11, form, eventError, posting, filter, sale, review, Integer.valueOf(b11), Integer.valueOf(b12), courier);
            i12++;
            field = str;
        }
    }
}
