package U00;

import com.squareup.moshi.Moshi;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.network.decode.serialize.adapter.AnalyticsInfoJsonAdapter;
import ru.ozon.composer.network.decode.serialize.adapter.BigDecimalMoshiAdapter;
import ru.ozon.composer.network.decode.serialize.adapter.ComposerLayoutJsonAdapter;
import ru.ozon.composer.network.decode.serialize.adapter.ComposerStateJsonAdapter;
import ru.ozon.composer.network.decode.serialize.adapter.ExperimentsDTOJsonAdapter;
import ru.ozon.composer.network.decode.serialize.adapter.LayoutTrackingInfoJsonAdapter;
import ru.ozon.composer.network.decode.serialize.adapter.PageInfoJsonAdapter;
import ru.ozon.composer.network.decode.serialize.adapter.TrackingTokenAliasesJsonAdapter;
import sf.InterfaceC9683i;

/* loaded from: classes7.dex */
public final class c implements a, b {

    /* renamed from: a, reason: collision with root package name */
    private final Moshi f27263a;

    public c() {
        Moshi.a aVar = new Moshi.a();
        aVar.b(new BigDecimalMoshiAdapter());
        aVar.a(new ComposerStateJsonAdapter.a());
        aVar.a(new ComposerLayoutJsonAdapter.a());
        aVar.a(new PageInfoJsonAdapter.a());
        aVar.a(new ExperimentsDTOJsonAdapter.a());
        aVar.a(new AnalyticsInfoJsonAdapter.a());
        aVar.a(new W00.a());
        aVar.a(new LayoutTrackingInfoJsonAdapter.a());
        aVar.a(new TrackingTokenAliasesJsonAdapter.a());
        this.f27263a = new Moshi(aVar);
    }

    public final <T> T a(@NotNull String json, @NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        T fromJson = this.f27263a.c(clazz).fromJson(json);
        Intrinsics.f(fromJson);
        return fromJson;
    }

    @Override // U00.a
    public final <T> T fromBuffer(@NotNull InterfaceC9683i buffer, @NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        T fromJson = this.f27263a.c(clazz).fromJson(buffer);
        Intrinsics.f(fromJson);
        return fromJson;
    }

    @Override // U00.b
    @NotNull
    public final <T> String toJson(T t2, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        String json = this.f27263a.d(type).toJson(t2);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    @Override // U00.a
    public final <T> T fromBuffer(@NotNull InterfaceC9683i buffer, @NotNull Type paramType) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(paramType, "paramType");
        T fromJson = this.f27263a.d(paramType).fromJson(buffer);
        Intrinsics.f(fromJson);
        return fromJson;
    }
}
