package Sj0;

import Ql0.i;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.tracker.db.entities.PerfEventEntity;
import ru.ozon.tracker.performance.model.TraceEntity;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Ib.a<Moshi> f26342a;

    public a(@NotNull Ib.a<Moshi> moshiLazy) {
        Intrinsics.checkNotNullParameter(moshiLazy, "moshiLazy");
        this.f26342a = moshiLazy;
    }

    @NotNull
    public final PerfEventEntity a(@NotNull TraceEntity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        String uuid = entity.getUuid();
        String requestId = entity.getRequestId();
        DateTime timestamp = entity.getTimestamp();
        String testingToolName = entity.getTestingToolName();
        Ib.a<Moshi> aVar = this.f26342a;
        JsonAdapter c11 = aVar.get().c(TraceEntity.Attributes.class);
        Intrinsics.checkNotNullExpressionValue(c11, "adapter(...)");
        String b11 = i.b(c11, entity.getAttributes());
        JsonAdapter c12 = aVar.get().c(TraceEntity.User.class);
        Intrinsics.checkNotNullExpressionValue(c12, "adapter(...)");
        String b12 = i.b(c12, entity.getUser());
        JsonAdapter c13 = aVar.get().c(TraceEntity.Page.class);
        Intrinsics.checkNotNullExpressionValue(c13, "adapter(...)");
        String b13 = i.b(c13, entity.getPage());
        JsonAdapter c14 = aVar.get().c(TraceEntity.Obj.class);
        Intrinsics.checkNotNullExpressionValue(c14, "adapter(...)");
        String b14 = i.b(c14, entity.getObject());
        JsonAdapter c15 = aVar.get().c(TraceEntity.Properties.class);
        Intrinsics.checkNotNullExpressionValue(c15, "adapter(...)");
        String b15 = i.b(c15, entity.getProperties());
        JsonAdapter c16 = aVar.get().c(TraceEntity.Widget.class);
        Intrinsics.checkNotNullExpressionValue(c16, "adapter(...)");
        String b16 = i.b(c16, entity.getWidget());
        JsonAdapter d11 = aVar.get().d(D.e(List.class, TraceEntity.Metric.class));
        Intrinsics.checkNotNullExpressionValue(d11, "adapter(...)");
        String b17 = i.b(d11, entity.getMetrics());
        JsonAdapter d12 = aVar.get().d(D.e(List.class, TraceEntity.CustomMetric.class));
        Intrinsics.checkNotNullExpressionValue(d12, "adapter(...)");
        String b18 = i.b(d12, entity.getCustomMetrics());
        JsonAdapter c17 = aVar.get().c(TraceEntity.VideoMetric.class);
        Intrinsics.checkNotNullExpressionValue(c17, "adapter(...)");
        String b19 = i.b(c17, entity.getVideo());
        JsonAdapter d13 = aVar.get().d(D.e(List.class, TraceEntity.ServerTimingData.class));
        Intrinsics.checkNotNullExpressionValue(d13, "adapter(...)");
        String b21 = i.b(d13, entity.getServerTimings());
        JsonAdapter c18 = aVar.get().c(TraceEntity.PclPage.class);
        Intrinsics.checkNotNullExpressionValue(c18, "adapter(...)");
        String b22 = i.b(c18, entity.getPclpage());
        JsonAdapter c19 = aVar.get().c(TraceEntity.MapSdk.class);
        Intrinsics.checkNotNullExpressionValue(c19, "adapter(...)");
        return new PerfEventEntity(0L, uuid, requestId, timestamp, testingToolName, b11, b12, b13, b14, b15, b16, b17, i.b(c19, entity.getMap()), b18, b19, b21, b22, 1, null);
    }

    @NotNull
    public final TraceEntity b(@NotNull PerfEventEntity dbo) {
        Intrinsics.checkNotNullParameter(dbo, "dbo");
        String uuid = dbo.getUuid();
        String requestId = dbo.getRequestId();
        DateTime timestamp = dbo.getTimestamp();
        String testingToolName = dbo.getTestingToolName();
        Ib.a<Moshi> aVar = this.f26342a;
        JsonAdapter c11 = aVar.get().c(TraceEntity.Attributes.class);
        Intrinsics.checkNotNullExpressionValue(c11, "adapter(...)");
        TraceEntity.Attributes attributes = (TraceEntity.Attributes) i.c(c11, dbo.getAttributes());
        JsonAdapter c12 = aVar.get().c(TraceEntity.User.class);
        Intrinsics.checkNotNullExpressionValue(c12, "adapter(...)");
        TraceEntity.User user = (TraceEntity.User) i.c(c12, dbo.getUser());
        JsonAdapter c13 = aVar.get().c(TraceEntity.Page.class);
        Intrinsics.checkNotNullExpressionValue(c13, "adapter(...)");
        TraceEntity.Page page = (TraceEntity.Page) i.c(c13, dbo.getPage());
        JsonAdapter c14 = aVar.get().c(TraceEntity.Obj.class);
        Intrinsics.checkNotNullExpressionValue(c14, "adapter(...)");
        TraceEntity.Obj obj = (TraceEntity.Obj) i.c(c14, dbo.getObj());
        JsonAdapter c15 = aVar.get().c(TraceEntity.Properties.class);
        Intrinsics.checkNotNullExpressionValue(c15, "adapter(...)");
        TraceEntity.Properties properties = (TraceEntity.Properties) i.c(c15, dbo.getProps());
        JsonAdapter c16 = aVar.get().c(TraceEntity.Widget.class);
        Intrinsics.checkNotNullExpressionValue(c16, "adapter(...)");
        TraceEntity.Widget widget = (TraceEntity.Widget) i.c(c16, dbo.getWidget());
        JsonAdapter d11 = aVar.get().d(D.e(List.class, TraceEntity.Metric.class));
        Intrinsics.checkNotNullExpressionValue(d11, "adapter(...)");
        List list = (List) i.c(d11, dbo.getMetrics());
        JsonAdapter d12 = aVar.get().d(D.e(List.class, TraceEntity.CustomMetric.class));
        Intrinsics.checkNotNullExpressionValue(d12, "adapter(...)");
        List list2 = (List) i.c(d12, dbo.getCustomMetrics());
        JsonAdapter c17 = aVar.get().c(TraceEntity.VideoMetric.class);
        Intrinsics.checkNotNullExpressionValue(c17, "adapter(...)");
        TraceEntity.VideoMetric videoMetric = (TraceEntity.VideoMetric) i.c(c17, dbo.getVideoMetrics());
        JsonAdapter d13 = aVar.get().d(D.e(List.class, TraceEntity.ServerTimingData.class));
        Intrinsics.checkNotNullExpressionValue(d13, "adapter(...)");
        List list3 = (List) i.c(d13, dbo.getServerTimings());
        JsonAdapter c18 = aVar.get().c(TraceEntity.PclPage.class);
        Intrinsics.checkNotNullExpressionValue(c18, "adapter(...)");
        TraceEntity.PclPage pclPage = (TraceEntity.PclPage) i.c(c18, dbo.getPclpage());
        JsonAdapter c19 = aVar.get().c(TraceEntity.MapSdk.class);
        Intrinsics.checkNotNullExpressionValue(c19, "adapter(...)");
        return new TraceEntity(uuid, requestId, timestamp, testingToolName, attributes, user, page, obj, properties, widget, (TraceEntity.MapSdk) i.c(c19, dbo.getMap()), list, list2, videoMetric, list3, pclPage);
    }
}
