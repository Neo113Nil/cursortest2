package Bi0;

import B0.C2454a;
import ei0.InterfaceC6369b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.tracker.sendEvent.Cell;
import ru.ozon.tracker.sendEvent.Page;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC6369b f3880a;

    public f(@NotNull InterfaceC6369b tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f3880a = tracker;
    }

    public final void a(@NotNull String deeplinkUrl, String str, String str2) {
        Cell.CustomCell customCell;
        Intrinsics.checkNotNullParameter(deeplinkUrl, "deeplinkUrl");
        ActionType.TRACK_CAMPAIGN track_campaign = ActionType.TRACK_CAMPAIGN.INSTANCE;
        String e11 = Ej0.a.e();
        Page page = new Page(null, null, deeplinkUrl, null, null, null, null, (str == null || kotlin.text.h.K(str)) ? null : new Page(null, null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262139, null), null, null, null, null, null, null, null, null, null, null, 262011, null);
        EventEntity.Obj obj = new EventEntity.Obj("page", null, null, null, null, null, null, null, null, null, null, null, null, null, Ej0.a.d(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147467262, null);
        if (str2 != null && !kotlin.text.h.K(str2)) {
            List l11 = kotlin.text.h.l(str2, new char[]{','}, 0, 6);
            ArrayList arrayList = new ArrayList(C7714v.z(l11, 10));
            Iterator it = l11.iterator();
            while (it.hasNext()) {
                C2454a.g((String) it.next(), arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (!kotlin.text.h.K((String) next)) {
                    arrayList2.add(next);
                }
            }
            if (!arrayList2.isEmpty()) {
                int h11 = U.h(C7714v.z(arrayList2, 10));
                if (h11 < 16) {
                    h11 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
                Iterator it3 = arrayList2.iterator();
                int i11 = 1;
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    linkedHashMap.put("dimension" + i11, next2);
                    i11++;
                }
                customCell = new Cell.CustomCell(linkedHashMap);
                this.f3880a.sendEvent(track_campaign, (r27 & 2) != 0 ? null : obj, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? null : customCell, (r27 & 16) != 0 ? null : null, page, (r27 & 64) != 0 ? null : e11, null, null, null, null, null, null, null, null, null);
            }
        }
        customCell = null;
        this.f3880a.sendEvent(track_campaign, (r27 & 2) != 0 ? null : obj, (r27 & 4) != 0 ? null : null, (r27 & 8) != 0 ? null : customCell, (r27 & 16) != 0 ? null : null, page, (r27 & 64) != 0 ? null : e11, null, null, null, null, null, null, null, null, null);
    }
}
