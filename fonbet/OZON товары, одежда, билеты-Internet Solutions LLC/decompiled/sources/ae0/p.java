package ae0;

import androidx.recyclerview.widget.LinearLayoutManager;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.StyleDownloader", f = "StyleDownloader.kt", l = {87, 89}, m = "safePutStyleToCache")
/* loaded from: classes7.dex */
final class p extends kotlin.coroutines.jvm.internal.c {

    /* renamed from: d, reason: collision with root package name */
    boolean f36683d;

    /* renamed from: e, reason: collision with root package name */
    GeoProviderConfig f36684e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Object f36685f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ q f36686g;

    /* renamed from: h, reason: collision with root package name */
    int f36687h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(q qVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.f36686g = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f36685f = obj;
        this.f36687h |= LinearLayoutManager.INVALID_OFFSET;
        return q.d(this.f36686g, null, false, null, null, null, this);
    }
}
