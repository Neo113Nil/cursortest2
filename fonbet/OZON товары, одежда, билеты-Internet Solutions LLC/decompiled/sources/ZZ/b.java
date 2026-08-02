package ZZ;

import P4.f;
import TZ.g;
import UZ.c;
import UZ.d;
import ei0.InterfaceC6369b;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.tracker.sendEvent.Cell;
import ru.ozon.tracker.sendEvent.Page;

/* loaded from: classes7.dex */
public final class b implements UZ.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6369b f35744a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final a f35745b;

    public b(@NotNull InterfaceC6369b tracker, @NotNull a screenToPageConverter) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(screenToPageConverter, "screenToPageConverter");
        this.f35744a = tracker;
        this.f35745b = screenToPageConverter;
    }

    @Override // UZ.b
    public final void sendEvent(@NotNull UZ.a event) {
        String b11;
        String str;
        Page convert;
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z11 = event instanceof c;
        a aVar = this.f35745b;
        if (z11) {
            Rg.a a11 = ((c) event).a();
            if (a11 == null || (convert = aVar.convert(a11)) == null) {
                return;
            }
            this.f35744a.sendPageView(convert);
            return;
        }
        if (!(event instanceof d)) {
            if (event instanceof TZ.b) {
                TZ.b bVar = (TZ.b) event;
                g a12 = bVar.a();
                ActionType.Custom custom = new ActionType.Custom(a12.a());
                EventEntity.Obj obj = new EventEntity.Obj(a12.g(), a12.b(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483644, null);
                EventEntity.Properties properties = new EventEntity.Properties(null, null, null, null, null, null, null, null, a12.d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, a12.e(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, a12.f(), null, null, null, null, null, null, null, null, null, null, null, null, a12.h(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, -536871169, 2147221503, 16383, null);
                EventEntity.Widget widget = new EventEntity.Widget(null, a12.c(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048573, null);
                Rg.a b12 = bVar.b();
                this.f35744a.sendEvent(custom, (r27 & 2) != 0 ? null : obj, (r27 & 4) != 0 ? null : properties, (r27 & 8) != 0 ? null : null, (r27 & 16) != 0 ? null : widget, b12 != null ? aVar.convert(b12) : null, (r27 & 64) != 0 ? null : null, null, null, null, null, null, null, null, null, null);
                return;
            }
            return;
        }
        d dVar = (d) event;
        XZ.d a13 = dVar.a();
        if (a13 == null || (b11 = a13.b()) == null) {
            return;
        }
        String b13 = f.b("toString(...)");
        ActionType.Custom custom2 = new ActionType.Custom(b11);
        Map<String, Object> d11 = a13.d();
        if (d11 == null) {
            d11 = U.c();
        }
        Cell.CustomCell customCell = new Cell.CustomCell(d11);
        String f7 = a13.f();
        String i11 = a13.i();
        String g10 = a13.g();
        String c11 = a13.c();
        if (c11 != null) {
            if (c11.length() == 0) {
                c11 = null;
            }
            str = c11;
        } else {
            str = null;
        }
        String h11 = a13.h();
        Rg.a b14 = dVar.b();
        this.f35744a.h(custom2, customCell, b14 != null ? aVar.convert(b14) : null, f7, i11, g10, str, h11, b13, a13.e(), a13.j());
    }
}
